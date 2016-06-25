package com.devops.model;

import uk.ltd.getahead.dwr.util.Logger;

import com.devops.action.ConfigureJenkinsPageAction;

public class JenkinsConfiguration {
private static Logger logger = Logger.getLogger(ConfigureJenkinsPageAction.class);
    
      
    public JenkinsConfiguration(){
    	logger.warn("Instantiating " + JenkinsConfiguration.class.getName());
    }
	
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
		if (port != null && !"".equalsIgnoreCase(port)){
			return protocol + "://" + url + ":" + port + "/jenkins";
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
	
	public String getConfigurationName() {
		return configurationName;
	}

	public void setConfigurationName(String configurationName) {
		this.configurationName = configurationName;
	}

	private String port;
	private String protocol;
	private String url;
	private String username;
	private String password;
	private String configurationName;
	
}
