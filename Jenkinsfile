pipeline {
  agent any
  jacoco
  stages {
    stage('check out') {
      steps {
        git(url: 'https://github.com/billchen247/JacocoExample', branch: 'master')
      }
    }

    stage('Build ') {
      steps {
        sh 'mvn clean compile'
      }
    }

    stage('Test ') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Code Coverage ') {
      steps {
        jacoco()
      }
    }
  }
}
