import Jenkinsfile_Demo
pipeline {
  
    agent any

    stages {
       stage('checkout'){
    		steps{
        		script{
           			 checkout
      		  }
    		}
		}
        stage('Integration Test') {

		 steps {
			sh "/usr/local/bin/docker-compose up"
                
           	 }


            }
	
        
    }
}