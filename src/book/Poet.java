package book;

public class Poet extends Book{

	public Poet(String title, String author, String bookId){
		super.title=title;
		super.author=author;
		super.bookId=bookId;
	}
	@Override
	public int getLateFees(int days) {
		return 100*days;
	}

}
