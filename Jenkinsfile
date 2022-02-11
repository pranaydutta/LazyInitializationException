pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sonar-qube') { 
          sh './mvnw clean sonar:sonar'
        }
      }
    }
  }
}
