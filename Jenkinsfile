pipeline {
  agent any
  tools {
    maven "Maven"
  }
  stages {
      stage("build") {
          steps {
            echo 'build...'
              snDevOpsStep()
            sleep 2
            //snDevOpsArtifact(artifactsPayload:"""{"artifacts": [{"name": "devops_pipeline_demo.jar","version": "1.2","semanticVersion": "1.2.0","repositoryName": "devops_pipeline_demo"}],"stageName": "build"}""")
              //sh 'mvn clean install'
          }
      }

      stage("test") {
           steps {
             echo 'test'
                snDevOpsStep()
             sleep 2
                sh 'mvn test -Dpublish'
                junit '**/target/surefire-reports/*.xml'
           }
       }
      stage("deploy") {
          steps {
            echo 'Deploying..'
            snDevOpsStep()
          	//snDevOpsPackage(name: "devops_pipeline_demo", artifactsPayload: """{"artifacts": [{"name": "devops_pipeline_demo.jar","version": "1.2","semanticVersion": "1.2.0","repositoryName": "devops_pipeline_demo"}]}""")            
            sleep 5
            //snDevOpsChange()
          }
      }
  }
}
