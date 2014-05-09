import auth.Role
import auth.User

class BootStrap {

	def init = { servletContext ->
		def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
		def roleUser  = new Role(authority: 'ROLE_USER').save()
		def roleDummy = new Role(authority: 'ROLE_DUMMY').save()
		new User(username: 'example', password: 'password',
		         email: 'example@email.com', authorities: [roleDummy]).save(flush:true)
	}
	
}