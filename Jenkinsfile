node {
   stage('Preparation') {
      git 'https://github.com/edmund-george/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
      sh "git push https://git.heroku.com/afternoon-journey-59314.git master"
   }
}