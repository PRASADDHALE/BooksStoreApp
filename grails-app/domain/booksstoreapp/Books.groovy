package booksstoreapp

class Books {

	String bookName
	String auther
	Date publishedDate
	
	static constraints  ={
		bookName(unique:true,blank:true)
		auther(blank:true)
		publishedDate(blank:true)
	}
	String toString(){
		bookName
	}	
}
