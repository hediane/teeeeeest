node('docker') {
    stage 'Build & UnitTest'
        sh "docker build -t teeeeeest:B${BUILD_NUMBER} -f dockerfile ."
  
    stage 'Integration Test'
        sh "docker-compose -f docker-compose.yml up --force-recreate --abort-on-container-exit"
        sh "docker-compose -f docker-compose.yml down -v"
}