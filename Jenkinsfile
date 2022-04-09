pipeline {
    agent any
    
    stages {
        stage('Integration Test') {
		 steps {
		
                sh "./docker-compose up --force-recreate --abort-on-container-exit"
                
           	 }


            }
	
        
    }
}