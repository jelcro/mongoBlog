import auth.Role
import auth.User

class BootStrap {

	def init = { servletContext ->
		
		def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
		def roleUser  = new Role(authority: 'ROLE_USER').save()
		def roleDummy = new Role(authority: 'ROLE_DUMMY').save()
		
		def adminUser = new User(username: 'admin', password: 'password', email: 'example@email.com', authorities: [roleAdmin]).save(flush:true)
		def testUser1 = new User(username: 'example', password: 'password', email: 'example@email.com', authorities: [roleDummy]).save(flush:true)
		
	}
	
}