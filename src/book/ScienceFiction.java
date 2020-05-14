package book;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author, String bookId){
		super.title=title;
		super.author=author;
		super.bookId=bookId;
	}
	@Override
	public int getLateFees(int days) {
		return 300*days;
	}
	

}
