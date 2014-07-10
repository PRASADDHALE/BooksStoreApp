package booksstoreapp


class Student {
	
	static transients = ["confirmPassword"]
	
	String userName
	String password
	String firstName
	String lastName
	String confirmPassword
	
	

		static constraints  ={
			userName(unique:true,blank:false)
			password(password:true)
			firstName(blank:true)
			lastName(blank:true)
			confirmPassword()
	}
		String toString(){
			userName
		}
}