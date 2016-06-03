package com.devops.model;

public class JenkinsConfiguration {
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getUrl() {
		if (port == null || "".equalsIgnoreCase(port)){
			return protocol + "://" + url + ":" + port;
		}else{
			return protocol + "://" + url;
		}
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private String port;
	private String protocol;
	private String url;
	private String username;
	private String password;
	
}
