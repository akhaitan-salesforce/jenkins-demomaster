node{
   stage('SCM Checkout'){
   git 'https://github.com/canindit75/jenkinsdemo-master'
   }
   
   stage('Clean'){
   sh 'mvn clean'
   
   }
   stage('Install'){
   sh 'mvn package'
   
   }
}
