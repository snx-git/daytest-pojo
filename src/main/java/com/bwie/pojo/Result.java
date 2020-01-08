package com.bwie.pojo;
import java.io.Serializable;
/**
 * 返回结果封装
 * @author Administrator
 *
 */
public class Result implements Serializable{
	private boolean success;
	private String message;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + "]";
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
}