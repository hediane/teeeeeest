pipeline {
   environment {
       DOCKER_PATH=$(which docker) docker-compose up
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