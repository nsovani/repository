package com.devops.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import uk.ltd.getahead.dwr.util.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.devops.model.JenkinsConfiguration;

public class ConfigureJenkinsPageAction extends ActionSupport implements SessionAware, ModelDriven<JenkinsConfiguration>{
 
    private static final long serialVersionUID = -3369875299120377549L;
    
    private static Logger logger = Logger.getLogger(ConfigureJenkinsPageAction.class);
    
    private static final JenkinsConfiguration jenkinsConfiguration =  new JenkinsConfiguration();
    
    public ConfigureJenkinsPageAction(){
    	logger.warn("Instantiating " + ConfigureJenkinsPageAction.class.getName());
    }
    
    public static JenkinsConfiguration getConfig() {
		return jenkinsConfiguration;
	}

//	public void setConfig(JenkinsConfiguration config) {
//		logger.warn(config == null?"empty":"not null");
//		this.jenkinsConfiguration = config;
//	}

	private Map<String, Object> sessionAttributes = null;
 
    @Override
    public String execute(){
    	if(jenkinsConfiguration.getConfigurationName() != null && jenkinsConfiguration.getConfigurationName().length() > 0)
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
		return jenkinsConfiguration;
	}
     
}
