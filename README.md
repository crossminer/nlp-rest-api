# NLP-TOOLS-REST-API : README  #
A standalone collection of Natural Language Processing tools for the software engineering exposed by a REST API for the software engineering domain.


## Prerequisites ##

Please ensure that the following are installed on your system and docker is running before following the steps defined below.

	- Maven
	- JDK 8
	- Docker (docker requires at least 6gb of memory) 
	- Git

## Build Steps: ##

**1.** Open terminal, navigate to your chosen directory and clone the NLP-TOOLS_REST_API Repository using:

	git clone https://github.com/crossminer/nlp-rest-api.git
	
**2**. Open terminal and navigate to the `nlp-rest-api` directory. 

	
**3.** Once inside the directory, run the following command 
	
	mvn -N io.takari:maven:wrapper

This ensures that the Maven build has everything necessary to run (and you don't need to install multiple versions of Maven on your system).

	
**4.** Next we need to build the `ehu-nlp-rest_api.jar`. To do this run <u>one</u> of the following commands:

	For UNIX based shells run     :      	./mvnw install
	For Windows based shell run   : 	mvnw.cmd install

## Deployment Options ##

There are two options to choose from for deploying the REST API. You can either run the `jar` directly or deploy it inside of a docker container. 

### Run API via Jar ###

**1.** Navigate to the `target` directory and run the following command
	
	java -jar ehu-nlp-rest_api.jar
	
This will bind the REST API to `http://localhost:8080`.


### Run as a Docker Container ###

**1.** Whilst inside the `nlp-rest-api` directory, Run the following command to build a image 

	docker build -t crossminer/nlp-rest-api .

**2.** To run the container enter the following command: 
	
	docker run -p <Port>:8080 -t crossminer/nlp-rest-api --name crossminer-nlp-rest-api
	
Replacing  `<Port>` with the port number you would like the container to be accessible on. For example if you want to access the container using via port `2097` then you would run :

	docker run -p 2097:8080 -t crossminer/nlp-rest-api --name crossminer-nlp-rest-api

This configuration will bind the REST API to `http://localhost:2097`.

## REST API Documentation ##
coming soon....

