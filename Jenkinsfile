pipeline {
    agent any

    tools {
        maven 'Maven 3.9.11'   // Jenkins > Global Tool Configuration এ এই name match করতে হবে
        jdk 'Java 17'         // JDK name ওখানে সেট করা থাকতে হবে
    }

//     environment {
//         // Optional: আপনি চাইলে environment variables set করতে পারেন
//         // Example: ENV = 'staging'
//     }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/mookto/HRMS_Software_BDD-With-Maven.git'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Execute Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Cucumber Report') {
            steps {
                // যদি cucumber-reporting plugin থাকে, তাহলে এখান থেকে চালাতে পারো
                // অথবা HTML report build করে archive করতে পারো
                echo 'Generating Cucumber Report...'
            }
        }

        stage('Archive Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'  // TestNG result archive
                archiveArtifacts artifacts: '**/target/cucumber-reports/**', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'Pipeline Completed.'
        }
        failure {
            echo 'Build failed! Check logs!'
        }
        success {
            echo 'Build succeeded!'
        }
    }
}