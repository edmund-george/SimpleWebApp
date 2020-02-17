node {
   stage('Preparation') {
      git 'https://github.com/edmund-george/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}