pipeline {
    agent any
    environment {Java = "${JAVA_HOME}"}
    triggers {cron('@midnight')}
      stages {
        stage('Get Git Code') {  steps { cleanWs()
          checkout scm } }   
        stage('Compile  code') {steps{withMaven(maven : 'MAVEN_HOME'){bat "mvn clean compile" }}}
        stage('Run Scripts') {steps{bat "mvn test"}}
   		}       
    }
     