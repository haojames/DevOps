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
	script {
		def content = readFile 'Document'
		echo "File content:\n${content}"
	}
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }
  }
}
