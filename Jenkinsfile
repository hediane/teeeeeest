pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 sh "docker build -t teeeeeest -f ./mvc/dockerfile ."
            }
        }
	
        stage('Integration Test') {
            steps {
		withEnv(["PATH=$PATH:~/.usr/local/bin"]){
		
                sh "docker-compose docker-compose.yml up "
            }
	}
        }
    }
}