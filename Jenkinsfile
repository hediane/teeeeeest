pipeline {
   environment {
        PATH = "$PATH:/usr/local/bin"
    }
    agent any

    stages {
        stage('Integration Test') {

		 steps {
		 
		echo "PATH is: $PATH" 
		sh "/usr/local/bin/docker-compose up"
                
           	 }


            }
	
        
    }
}