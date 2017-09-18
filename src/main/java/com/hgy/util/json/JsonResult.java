package com.hgy.util.json;


import com.hgy.util.enums.ResultType;

import java.io.Serializable;


public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = 7982365785632121536L;
	private int code;
	private T obj;
    private String msg;

	public JsonResult() {
		super();
	}
	
	public JsonResult(int code, T obj) {
		super();
		this.code = code;
		this.obj = obj;
	}
	
	@SuppressWarnings("unchecked")
	public JsonResult(ResultType type) {
		super();
		this.code = type.getCode();
		this.obj = (T)type.getInfo();
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
