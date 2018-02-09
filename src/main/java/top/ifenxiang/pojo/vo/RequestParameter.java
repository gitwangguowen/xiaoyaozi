package top.ifenxiang.pojo.vo;

import java.io.Serializable;

public class RequestParameter implements Serializable {
	private static final long serialVersionUID = 7969679000086405989L;

	private String access_key;
	private String access_token;
	private String appKey;
	private String method;
	private String params;

	public String getAccess_key() {
		return access_key;
	}

	public void setAccess_key(String access_key) {
		this.access_key = access_key;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

}
