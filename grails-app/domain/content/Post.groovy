package content

import auth.Role
import auth.User
import org.bson.types.ObjectId

class Post {
	
	ObjectId id
	
	
	static belongsTo = ['user:User']
	static hasMany = ['comments:Comment']
  static constraints = {
		
  }
		
}