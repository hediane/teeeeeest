pipeline {
   environment {
        PATH = "$PATH:/usr/local/bin"
    }
    agent any

    stages {
        stage('Integration Test') {

		 steps {
		
                  sh "docker-compose up"
                
           	 }


            }
	
        
    }
}