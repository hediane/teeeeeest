pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 sh "docker build -t teeeeeest -f ./mvc/dockerfile ."
            }
        }
        stage('Installation')
	{
	steps {
 		sh "npm install -g docker-compose"
        	sh "docker-compose --version"
	 }

}
	
        stage('Integration Test') {
            steps {
		
                sh "docker-compose ./docker-compose.yml up "
            }
        }
    }
}