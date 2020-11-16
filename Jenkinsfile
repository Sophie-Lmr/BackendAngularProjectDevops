	node{
	
		stage('SCM'){
			git 'https://gitlab.com/Sophie-Lmr/backendangularprojectdevops'
		}
	
		stage('Compile'){
			def mvnHome = tool name: 'maven-3', type: 'maven'
			sh "${mvnHome}/bin/mvn package -Dmaven.test.skip=true"
		}
	
		stage('SonarQube'){
			def mvnHome = tool name: 'maven-3', type: 'maven'
			sh "${mvnHome}/bin/mvn sonar:sonar -Dsonar.host.url=http://192.168.1.11:9000"
		}
	
	}