pipeline {
   environment {
       DOCKER_PATH=/usr/bin/docker docker-compose up
    }
    agent any

    stages {
        stage('Integration Test') {

		 steps {
		 
		echo "PATH is: $DOCKER_PATH" 
		sh "DOCKER_PATH"
                
           	 }


            }
	
        
    }
}