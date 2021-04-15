package com.sua.notebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sua.notebook.domain.Notebook;
import com.sua.notebook.domain.repository.NotebookRepository;
import com.sua.notebook.service.NotebookService;

@Service
public class NotebookServiceImpl implements NotebookService{
	@Autowired
	NotebookRepository notebookRepository;
	
	@Override
	public void addMemo(Notebook notebook) {
		notebookRepository.addMemo(notebook);
	}

}
