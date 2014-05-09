package content

import auth.Role
import auth.User
import org.bson.types.ObjectId

class Post {
	
	ObjectId id
	String title
	// optional media content
	// content stored in blog
	
	static belongsTo = ['user:User']
	static hasMany = ['comments:Comment']
	
  static constraints = {
		// size of media content
		// size of content
		
  }

	static mapping = {
		
	}
}