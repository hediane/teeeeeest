pipeline {
    agent any
     environment {
     PATH = "$PATH:/usr/bin"
  }
    stages {
        stage('Integration Test') {
		 steps {
		
                sh "/usr/bin/docker-compose up -d"
                
           	 }


            }
	
        
    }
}