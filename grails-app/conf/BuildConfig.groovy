//grails.server.port.http = 80

grails.servlet.version = '3.0'
grails.project.work.dir = 'target'
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
	inherits 'global'
	log 'warn'
	checksums true
	legacyResolve false

	repositories {
		inherits true

		grailsPlugins()
		grailsHome()
		mavenLocal()
		grailsCentral()
		mavenCentral()
		mavenRepo 'http://repo.spring.io/milestone'
	}

	dependencies {
		compile "net.sf.ehcache:ehcache-core:2.4.6"
	}

	plugins {
		build ":tomcat:7.0.52.1"
		
		compile ":scaffolding:2.0.3"
    compile ':cache:1.1.2'
		
    runtime ":jquery:1.11.0.2"
    runtime ":resources:1.2.7"
		runtime ":database-migration:1.4.0"
		
		runtime ":mongodb:3.0.0"
		compile ':spring-security-core:2.0-RC2'
	}
}