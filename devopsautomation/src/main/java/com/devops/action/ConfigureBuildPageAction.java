package com.devops.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import uk.ltd.getahead.dwr.util.Logger;

import com.devops.model.JenkinsMavenItemConfiguration;
import com.devops.service.impl.JenkinsClient;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigureBuildPageAction extends ActionSupport implements SessionAware, ModelDriven<JenkinsMavenItemConfiguration>{
 
    private static final long serialVersionUID = -3369875299120377549L;
    
    private static Logger logger = Logger.getLogger(ConfigureBuildPageAction.class);
    
    private JenkinsMavenItemConfiguration jenkinsMavenItemConfiguration;
    
    public ConfigureBuildPageAction(){
    	logger.warn("Instantiating " + ConfigureBuildPageAction.class.getName());
    	jenkinsMavenItemConfiguration = new JenkinsMavenItemConfiguration();
    }
    
    private Map<String, Object> sessionAttributes = null;
 
    @Override
    public String execute(){
    	if(ConfigureJenkinsPageAction.getConfig().getConfigurationName() == null || ConfigureJenkinsPageAction.getConfig().getConfigurationName().length() < 1)
    	{
        	return com.opensymphony.xwork2.Action.ERROR;
        }else if((jenkinsMavenItemConfiguration.getItemName() != null && jenkinsMavenItemConfiguration.getItemName().length() > 0)){
        	String itemXml;
        	logger.warn(itemXml = jenkinsMavenItemConfiguration.getXml());
        	new JenkinsClient().createJenkinsItem(ConfigureJenkinsPageAction.getConfig().getUrl(), jenkinsMavenItemConfiguration.getItemName(), itemXml);
        	
        	return SUCCESS;
        }else{
        	return INPUT;
        }
    }
    
    public void setSession(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

	@Override
	public JenkinsMavenItemConfiguration getModel() {
		
		return jenkinsMavenItemConfiguration;
	}
     
}
