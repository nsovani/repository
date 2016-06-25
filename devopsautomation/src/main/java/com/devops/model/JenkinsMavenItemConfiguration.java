package com.devops.model;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class JenkinsMavenItemConfiguration {
		private static final String[] CVS_CHOICES = new String[]{"SVN","GIT","CVS"};
		protected String itemName;
		protected String url;
		protected String cvsChoice;
		
		protected String pomLocation;
		
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getCvsChoice() {
			return cvsChoice;
		}
		public void setCvsChoice(String cvsChoice) {
			this.cvsChoice = cvsChoice;
		}
		public List<String> getCvsChoices() {
			return Arrays.asList(CVS_CHOICES);
		}
		
		public String getPomLocation() {
			return pomLocation;
		}
		public void setPomLocation(String pomLocation) {
			this.pomLocation = pomLocation;
		}
		
		public String getXml(){
			// Build a context to hold the model
            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put( "url",url );
            velocityContext.put( "pomFile",pomLocation );

            // Execute the template
            StringWriter writer = new StringWriter();
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.setProperty("resource.loader", "class");
            velocityEngine.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

            velocityEngine.init();
            Template template = velocityEngine.getTemplate("templates/jenkinsItem.vm");
            template.merge(velocityContext, writer);
             // Return the result
            return writer.toString();
		}

}
