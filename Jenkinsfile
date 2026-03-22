pipeline {
    agent any

    environment {
        IMAGE_NAME = 'skaur402/welcome-app:latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/skaur402/jenkins-ci-test.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                }
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push %IMAGE_NAME%'
            }
        }
    }
}
