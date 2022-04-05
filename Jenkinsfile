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
                sh "docker-compose -f docker-compose.yml up "
            }
        }
    }
}