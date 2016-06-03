package com.devops.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.devops.model.JenkinsConfiguration;

public class ConfigureJenkinsPageAction extends ActionSupport implements SessionAware, ModelDriven<JenkinsConfiguration>{
 
    private static final long serialVersionUID = -3369875299120377549L;
    
    private JenkinsConfiguration config;
    
    public JenkinsConfiguration getConfig() {
		return config;
	}

	public void setConfig(JenkinsConfiguration config) {
		this.config = config;
	}

	private Map<String, Object> sessionAttributes = null;
 
    @Override
    public String execute(){
    	if(config.getUrl() != null && config.getUrl().length() > 0)
    	{
        	return SUCCESS;
        }else{
        	return INPUT;
        }
    }
    
    public void setSession(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

	@Override
	public JenkinsConfiguration getModel() {
		// TODO Auto-generated method stub
		return config;
	}
     
}
