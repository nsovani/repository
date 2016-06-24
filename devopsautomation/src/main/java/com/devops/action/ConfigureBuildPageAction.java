package com.devops.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import uk.ltd.getahead.dwr.util.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.devops.model.JenkinsConfiguration;

public class ConfigureBuildPageAction extends ActionSupport implements SessionAware, ModelDriven<JenkinsConfiguration>{
 
    private static final long serialVersionUID = -3369875299120377549L;
    
    private static Logger logger = Logger.getLogger(ConfigureBuildPageAction.class);
    
    public ConfigureBuildPageAction(){
    	logger.warn("Instantiating " + ConfigureBuildPageAction.class.getName());
    }
    
    private Map<String, Object> sessionAttributes = null;
 
    @Override
    public String execute(){
    	if(ConfigureJenkinsPageAction.getConfig().getConfigurationName() == null || ConfigureJenkinsPageAction.getConfig().getConfigurationName().length() < 1)
    	{
        	return com.opensymphony.xwork2.Action.ERROR;
        }else if(true){
        	return INPUT;
        }else{
        	return SUCCESS;
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
