
pipeline{
    agent any
    stages{
      
      stage("Pushing the artifact to nexus"){
            steps{
                script{
                    sh 'mvn clean deploy'
                }
            }
        }
      
    }
}
