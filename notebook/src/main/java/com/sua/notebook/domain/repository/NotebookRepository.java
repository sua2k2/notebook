package com.sua.notebook.domain.repository;

import org.springframework.dao.DataAccessException;

import com.sua.notebook.domain.Notebook;

public interface NotebookRepository {
	void addMemo(Notebook notebook) throws DataAccessException;
}
