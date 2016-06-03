package com.devops.service;

public interface JenkinsClientService {
	/**
	 * The method will create an item under Jenkins job
	 * @param jenkinsUrl - Base url of the Jenkins.
	 * @param itemName - Name of the item to be created under job.
	 * @param itemXml - XML as per Jenkins representing the item to be created a new.
	 * @return boolean - True if successfully created the item false otherwise.
	 */
	
	public boolean createJenkinsItem(String jenkinsUrl, String itemName, String itemXml);
	
	/**
	 * The method will call api to delete the item with given itemName from under the Jenkins' job 
	 * @param jenkinsUrl- Base url of the Jenkins.
	 * @param itemName - Name of the item to be deleted from existing jobs
	 * @return boolean - True if the item successfully deleted false otherwise.
	 */
	public boolean deleteJenkinsItem(String jenkinsUrl, String itemName);

}
