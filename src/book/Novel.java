package book;

public class Novel extends Book {

	public Novel(String title, String author, String bookId){
		super.title=title;
		super.author=author;
		super.bookId=bookId;
	}
	@Override
	public int getLateFees(int days) {
		return 500*days;
	}

	
}
