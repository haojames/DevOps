pipeline {
  agent any

  tools {
        maven "Maven 3.6.3" // Cấu hình Maven đã cài sẵn trong Jenkins
        jdk "JDK 11"        // Cấu hình JDK đã cài sẵn trong Jenkins
    }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/haojames/DevOps.git'
      }
    }
    stage('Build') {
            steps {
                sh 'sudo mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'sudo mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
