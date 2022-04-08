pipeline {
    agent any
    environment
    {
        PATH = "$PATH:/usr/bin"
    }
    stages {
        stage('Integration Test') {
		 steps {
                sh " PATH docker-compose up --force-recreate --abort-on-container-exit"
                
           	 }


            }
	
        
    }
}