package com.devops.interceptors;

import java.util.Map;

import com.devops.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String intercept(ActionInvocation actionInvocation)
            throws Exception {
        System.out.println("inside auth interceptor");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
         
        User user = (User) sessionAttributes.get("USER");
         
        if(user == null){
            return Action.LOGIN;
        }else{
            Action action = (Action) actionInvocation.getAction();
            if(action instanceof UserAware){
                ((UserAware) action).setUser(user);
            }
            return actionInvocation.invoke();
        }
    }


	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	public void init() {
		// TODO Auto-generated method stub
		
	}


 

}
