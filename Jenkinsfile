pipeline {
    agent any
    tools {
        maven "Maven3.6.1"
        jdk "JDK8u212"
    }
    stages {
        stage('checkout') {
            steps {
                git url: 'https://github.com/nagatax/java-library.git'
            }
        }
        stage('Build Maven') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('make result of test') {
            steps {
                junit('target/surefire-reports/*.xml')
                jacoco(execPattern: 'target/jacoco.exec')
            }
        }
        stage('make result of code analysis') {
            steps {
                checkstyle(pattern: 'target/checkstyle-result.xml')
                findbugs(pattern: 'target/findbugsXml.xml')
            }
        }
        stage('StepCount') {
            steps {
                stepcounter(settings: [[encoding: 'UTF-8', filePattern: 'src/main/**/*.java', filePatternExclude: '', key: 'java']] )
            }
        }
    }
}