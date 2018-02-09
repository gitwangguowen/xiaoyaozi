package top.ifenxiang.pojo.vo;

import java.io.Serializable;

public class DataResult<T> implements Serializable {
	private static final long serialVersionUID = -4346465713990687302L;

	private Integer code;// 状态码
	private String message;// 消息
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
