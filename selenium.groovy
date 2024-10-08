pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
                git 'https://github.com/belaletech/selenium_Maven.git'
            }
        }
        stage('Build Code') {
            steps {
                bat script: 'mvn compile'
            }
        }
        stage('Run Tests') {
            steps {
                bat script: 'mvn test -Dbrowser=localchrome'
            }
        }
    }
}
