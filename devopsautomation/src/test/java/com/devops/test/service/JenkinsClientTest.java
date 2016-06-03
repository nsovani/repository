package com.devops.test.service;

import junit.framework.TestCase;

import com.devops.service.impl.JenkinsClient;

public class JenkinsClientTest extends TestCase {
	public void testDeleteJenkinsJob(){
		String location = "http://localhost:8080";
		assert(new JenkinsClient().deleteJenkinsItem(location,"test5"));
	}
	
	public void testCreateJenkinsJob(){
		String location = "http://localhost:8080";
		String xml = "<project>" +
				"	<actions/>" +
				"	<description/>" +
				"	<keepDependencies>false</keepDependencies>" +
				"	<properties/>" +
				"	<scm class=\"hudson.scm.NullSCM\"/>" +
				"	<canRoam>true</canRoam>" +
				"	<disabled>false</disabled>" +
				"	<blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>" +
				"	<blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>" +
				"	<triggers/>" +
				"	<concurrentBuild>false</concurrentBuild>" +
				"	<builders/>" +
				"	<publishers/>" +
				"	<buildWrappers/>" +
				"</project>";
		assert(new JenkinsClient().createJenkinsItem(location,"test5",xml));
	}

}
