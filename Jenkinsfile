// Powered by Infostretch 

timestamps {

node () {

	stage ('docdoc - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github_id', url: 'https://github.com/sanaullah2021study/dockerspringboot.git']]]) 
	}
	stage ('docdoc - Build') {
 			// Maven build step
	withMaven(maven: 'default') { 
 			if(isUnix()) {
 				sh "mvn install " 
			} else { 
 				bat "mvn install " 
			} 
 		} 
	}
}
}