package com.devops.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.devops.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{
 
    private static final long serialVersionUID = -3369875299120377549L;
    
    private User user = new User();
    
    private Map<String, Object> sessionAttributes = null;
 
    @Override
    public String execute(){
        System.out.println("inside execute");
        if(user.getUserName() == null){
        	return INPUT;
        }else{
        	sessionAttributes.put("USER", user);
        }
        return SUCCESS;
    }
 
    
    public void setSession(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }
     
    
    public User getModel() {
        return user;
    }

}
