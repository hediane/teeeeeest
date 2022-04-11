pipeline {
    agent any
    environment {
        DOCKER_PATH=$(which docker) docker-compose up
    }
    stages {
        stage('Integration Test') {
		 steps {
		
                sh "DOCKER_PATH docker-compose up"
		
                
           	 }


            }
	
        
    }
}