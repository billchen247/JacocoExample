pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'jdk25'
    }

    environment {
        APP_NAME = "week6demo-app"
        DOCKER_IMAGE = "myrepo/week6demo-app:latest"
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out source code..."
                git branch: 'master',
                    url: 'https://github.com/billchen247/JacocoExample'
            }
        }

        stage('Build') {
            steps {
                echo "Compiling source code..."
                sh 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                echo "Running unit tests..."
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Code Coverage (JaCoCo)') {
            steps {
                echo "Generating JaCoCo coverage report..."
                sh 'mvn jacoco:report'
            }
            post {
                always {
                    node {
                        jacoco(
                            execPattern: 'target/jacoco.exec',
                            classPattern: 'target/classes',
                            sourcePattern: 'src/main/java'
                        )
                    }
                }
            }
        }

        stage('Package') {
            steps {
                echo "Packaging application..."
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        // ------------------------
        // MOCK CD SECTION
        // ------------------------

        stage('Build Docker Image') {
            when { branch 'main' }
            steps {
                echo "Building Docker image..."
                sh "docker build -t ${DOCKER_IMAGE} ."
            }
        }

        stage('Push Docker Image (Mock)') {
            when { branch 'main' }
            steps {
                echo "Mock pushing Docker image..."
                echo "docker push ${DOCKER_IMAGE}"
            }
        }

        stage('Deploy to Dev (Mock)') {
            when { branch 'main' }
            steps {
                echo "Mock deploy to Kubernetes..."
                echo "kubectl apply -f k8s/deployment.yaml"
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed."
        }
        always {
            node {
                cleanWs()
            }
        }
    }
}

