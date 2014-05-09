grails {
	mongo {
		host = '127.0.0.1'
		port = 27017
		//username="admin"
		//password="password"
		databaseName = 'mongoBlog'
		
		//connectionString = ""
		//replicaSet = [ "localhost:27017"/*, "localhost:27018"*/ ]
		options {
			//autoConnectRetry = true
			
			//ssl = true
		}
	}
}
