package content

class Comment {

	static belongsTo = ['user:User']
	static hasMany = ['comments:Comment']
	
    static constraints = {
    }
}