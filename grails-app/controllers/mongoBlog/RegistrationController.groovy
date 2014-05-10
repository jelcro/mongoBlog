package mongoBlog

import auth.User
import auth.Role
import org.bson.types.ObjectId

class RegistrationController {
	
	User newUser
	
	/*
	 * create user
	 * @param: form fields
	 */
	def create(String username, String email, String encodedPassword) {
		if (!(userExists(username) || emailExists(email))) {
			newUser = new User(username: params.username, email: params.email, password: params.encodedPassword, authorities: ['ROLE_USER']).save(flush:true)
		}
	}
	
	/*
	 * returns boolean
	 */
	def userExists(String username) {
		// perform search of database for username
	}
	
	/*
	 * returns boolean
	 */
	def emailExists(String email) {
		// perform search of database for email
	}
	
	/*
	 * also returns boolean
	 */
	def passwordComplex() {
		// check if meets certain conditions for password complexity
	}
	
}