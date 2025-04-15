pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/haojames/DevOps.git'
      }
    }
    stage('Build') {
      steps {
        echo 'Building...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }
  }
}
