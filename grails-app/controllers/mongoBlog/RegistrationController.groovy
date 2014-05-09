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
		if (!(userExists(username) || emailExists(email)) {
			newUser = new User(username: username, email: email, password: encodedPassword, authorities: ['ROLE_USER']).save(flush:true)
		}
	}
	
	def userExists(String username): boolean {
		// perform search of database for username
	}
	
	def emailExists(String email): boolean {
		// perform search of database for email
	}
	
	/*
	def passwordComplex(): boolean {
		// check if meets certain conditions for password complexity
	}
	*/
	
	
}