package com.sua.notebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sua.notebook.domain.Notebook;
import com.sua.notebook.service.NotebookService;

@Controller
public class HomeController {
	@Autowired
	NotebookService notebookService;

	@RequestMapping(method = RequestMethod.GET)
	public String notebook(@ModelAttribute("Notebook") Notebook notebook, Model model) {
		model.addAttribute("title", "정수아 노트");
		model.addAttribute("feeling", "지금 당신의 기분은?");
		return "notebook";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addMemo(@ModelAttribute("Notebook") Notebook notebook, BindingResult result, Model model) {
		try {
			String[] suppressedFields = result.getSuppressedFields();
			if (suppressedFields.length > 0) {
				throw new RuntimeException("Attempting to bind disallowed fields: "
						+ StringUtils.arrayToCommaDelimitedString(suppressedFields));
			} else {
				notebookService.addMemo(notebook);
			}
			return "redirect:/";
		} catch (DataAccessException e) {
			String msg = e.getMessage();
			int idx = msg.lastIndexOf("Duplicate");
			model.addAttribute("errormessage", msg.substring(idx));
			return "addProduct";
		}

	}

}
