package com.devops.service;

import com.devops.model.jenkins.item.mavenmoduleset.HudsonMavenMavenModuleSet;

public interface JenkinsItemService {
	public String getXml(HudsonMavenMavenModuleSet hudsonMavenMavenModuleSet);
}
