package Manage;


import java.util.ArrayList;
import java.util.Scanner;

import book.Book;
import book.Novel;
import book.Poet;
import book.ScienceFiction;

public class BookManager {
	private ArrayList<Book> totalBook;
	private Scanner sc = new Scanner(System.in);
	public String bookId = null;
	public String title = null;
	
	public BookManager() {
		totalBook = new ArrayList<Book>();
	}
	
	public void addBook() {
		System.out.println("추가할 도서의 종류 선택 1.SF 2.Novel 3. Poet");
		String userInput=sc.nextLine();
		switch(userInput) {
		case "1":
			System.out.println("사용할 BookID 입력");
			String bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("중복된 ID");
				return;
			}
			System.out.println("제목 입력>>");
			String title = sc.nextLine();
			System.out.println("저자 입력>>");
			String author = sc.nextLine();
			totalBook.add(new ScienceFiction(bookId, title, author));
			break;
		case "2":
			System.out.println("사용할 BookID 입력");
			bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("중복된 ID");
				return;
			}
			System.out.println("제목 입력>>");
			title = sc.nextLine();
			System.out.println("저자 입력>>");
			author = sc.nextLine();
			totalBook.add(new Novel(bookId, title, author));
			break;
		case "3":
			System.out.println("사용할 BookID 입력>>");
			bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("중복된 ID");
				return;
			}
			System.out.println("제목 입력>>");
			title = sc.nextLine();
			System.out.println("저자 입력>>");
			author = sc.nextLine();
			totalBook.add(new Poet(bookId, title, author));
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			return;
		}
			
	}

	public boolean isId(String bookId) {
		boolean returnValue=false;
		for(int i=0;i<totalBook.size()-1;i++) {
			if(totalBook.get(i).equals(bookId)) {
				returnValue=true;
			}
		}
		return returnValue;
	}
	
	public void delBook() {
		if(totalBook.size() == 0) {
			System.out.println("삭제할 도서가 없습니다.");
			return;
		}
		System.out.println("삭제할 도서의 ID 입력>>");
		String inputId=sc.nextLine();
		int index=findListIndex(inputId);
		if(index==-1) {
			System.out.println("ID가 잘못되었습니다.");
		}else {
			totalBook.remove(index);
			System.out.println("삭제완료");
		}
	}
	
	public int findListIndex(String bookId) {
		for(int i=0;i<totalBook.size();i++) {
			if(totalBook.get(i).equals(bookId)) {
				return i;
			}
		}
		return -1;
	}
	
	public void searchBook() {
		System.out.println("도서 조회");
		for(Book i:totalBook) {
			System.out.print("ID: " + i.getBookId());
			System.out.print(" | 제목: " + i.getTitle());
			System.out.print(" | 저자: " + i.getAuthor());
			System.out.println(" | 대여여부: " + (i.isLoaned() ? "대여불가" : "대여가능") );
			
		}
	}
	//다른곳에서 실행
	public void loanBook() {
		System.out.println("대여할 책의 ID 입력>>");
		String bookId=sc.nextLine();
		int index=findListIndex(bookId);
		if(index==-1) {
			System.out.println("등록되지 않은 ID입니다.");
		}else {
			if(totalBook.get(index).isLoaned()) {
				System.out.println("대여중");
			}else {
				System.out.println("대여 완료");
				totalBook.get(index).setLoaned(true);
			}
		}
	}
	
	public void returnBook() {
		System.out.println("반납할 책의 ID를 입력>>");
		String bookId=sc.nextLine();
		int index=findListIndex(bookId);
		if(index==-1) {
			System.out.println("등록되지 않은 ID입니다.");
		}else {
			if(totalBook.get(index).isLoaned()) {
				System.out.println("반납 완료");
				//페널티 부과? 날짜설정?
				totalBook.get(index).setLoaned(false);
			}else {
				System.out.println("대여중인 도서가 아닙니다.");
			}
		}
	}
	
	
}
