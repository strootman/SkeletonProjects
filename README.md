SkeletonProjects
================
This repository is intended to contain many different kinds of empty projects. 

This project was created with the following commands:

mvn archetype:generate \
   -DarchetypeGroupId=org.codehaus.mojo \
   -DarchetypeArtifactId=gwt-maven-plugin \
   -DarchetypeVersion=2.5.1
   
mvn eclipse:eclipse

Opened project in eclipse and converted to maven project.

Permanently marked the maven-war-plugin:exploded goal and gwt-maven-plugin:i18n goal as ignored.

