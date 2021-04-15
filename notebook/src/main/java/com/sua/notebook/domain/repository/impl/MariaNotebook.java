package com.sua.notebook.domain.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sua.notebook.domain.Notebook;
import com.sua.notebook.domain.repository.NotebookRepository;

@Repository
public class MariaNotebook implements NotebookRepository{

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void addMemo(Notebook notebook) throws DataAccessException{
		String sql = "INSERT INTO memo (content) values (:content)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("content", notebook.getMemo());
		jdbcTemplate.update(sql, params);
	}

}
