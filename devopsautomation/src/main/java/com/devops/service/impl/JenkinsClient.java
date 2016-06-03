package com.devops.service.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.devops.service.JenkinsClientService;

public class JenkinsClient implements JenkinsClientService{
	
	@Override
	public boolean createJenkinsItem(String jenkinsUrl, String itemName,
			String itemXml) {
		System.out.println("Inside createJenkinsItem" + itemName);
		Client client = ClientBuilder.newClient();
		Response response = null;
		try{
			String location = jenkinsUrl + "/" + ServiceImplConstants.CREATE_ITEM_COMMAND;
			System.out.println(location);
			response = client.target(location).queryParam(ServiceImplConstants.CREATE_ITEM_NAME_PARAM, itemName).request().post(Entity.xml(itemXml));
		}finally{
			client.close();
		}
		if(response != null && response.getStatus() == ServiceImplConstants.HTTP_SUCCESS){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteJenkinsItem(String jenkinsUrl, String itemName) {
		System.out.println("Inside deleteJenkinsItem" + itemName);
		Client client = ClientBuilder.newClient();
		String itemXml = "";
		Response response = null;
		try{
			String location = jenkinsUrl + "/job/" + itemName + "/" + ServiceImplConstants.DELETE_ITEM_COMMAND;
			System.out.println(location);
			response = client.target(location).request().post(Entity.xml(itemXml));
			System.out.println("received " + response.getStatus());
		}finally{
			client.close();
		}
		if(response != null ){
			return true;
		}
		
		return false;
	}
}
