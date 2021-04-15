package com.sua.notebook.domain;

import java.io.Serializable;

public class Notebook implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -433163744346207258L;
	private String memo;

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}	
}
