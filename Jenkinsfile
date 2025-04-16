pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/haojames/DevOps.git'
      }
    }
    stage('Build') {
      steps {
        echo 'Building...'
	cat Document
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }
  }
}
