pipeline {
  agent any
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }
  stages {
    stage('check out') {
      steps {
        git(url: 'https://github.com/yli202/JacocoExample', branch: 'master')
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
