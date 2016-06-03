/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devops.test.action;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.devops.action.LoginAction;
import com.devops.model.User;
import com.opensymphony.xwork2.Action;

/**
 * 
 */
public class LoginActionTest extends TestCase {
    
	public void testLoginActionWithOutUser() throws Exception {
	  	
        LoginAction action = new LoginAction();
        String result = action.execute();
        assertEquals(Action.INPUT, result);
    }
	
	public void testLoginActionWithUser() throws Exception {
    	    	  	
        LoginAction action = new LoginAction();
        Map<String, Object> sessionAttributes = new HashMap<String,Object>();
        User user = action.getModel();
        user.setUserName("TestUser1");
		action.setSession(sessionAttributes );
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }
    
}

