pipeline {
  
    agent any

    stages {
        stage('Integration Test') {

		 steps {
		 
		echo "PATH is: $DOCKER_PATH" 
		sh "/usr/local/bin/docker-compose up"
                
           	 }


            }
	
        
    }
}