pipeline{
	agent none

        
        stages{

              stage('Quality Gate Status Check'){
		       agent {
				  docker "openjdk:8"
			  }
                  steps{
			 
                      script{
			      withSonarQubeEnv('sonar-cube') { 
			      sh "mvn clean sonar:sonar"
                       	     	}
			      timeout(time: 1, unit: 'HOURS') {
			      def qg = waitForQualityGate()
				      if (qg.status != 'OK') {
					   error "Pipeline aborted due to quality gate failure: ${qg.status}"
				      }
                    		}
		    	    sh "mvn clean install"
		  
                 	}
               	 }  
              }	
		
            }	       	     	         
}
