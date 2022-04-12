checkout([
        $class: 'GitSCM', 
        branches: [[name: '*/main']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [[$class: 'CleanCheckout']], 
        submoduleCfg: [], 
        userRemoteConfigs: [[url: 'https://github.com/hediane/teeeeeest.git']]
    ])

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