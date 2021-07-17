pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                bat "rmdir  /s /q jenkinsProj"
                bat "git clone https://github.com/aks7hat/jenkinsProj.git"
                bat "mvn clean -f jenkinsProj"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f jenkinsProj"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f jenkinsProj"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f jenkinsProj"
            }
        }
    }
}
