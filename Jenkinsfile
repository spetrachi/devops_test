pipeline {
  agent any
  stages {
    stage('pre-build') {
      steps {
        input(message: 'Insert Release Version', id: 'release')
      }
    }

    stage('') {
      steps {
        sh '''git checkout ${release}
mvn clean package'''
      }
    }

  }
}