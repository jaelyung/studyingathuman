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
		System.out.println("�߰��� ������ ���� ���� 1.SF 2.Novel 3. Poet");
		String userInput=sc.nextLine();
		switch(userInput) {
		case "1":
			System.out.println("����� BookID �Է�");
			String bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("�ߺ��� ID");
				return;
			}
			System.out.println("���� �Է�>>");
			String title = sc.nextLine();
			System.out.println("���� �Է�>>");
			String author = sc.nextLine();
			totalBook.add(new ScienceFiction(bookId, title, author));
			break;
		case "2":
			System.out.println("����� BookID �Է�");
			bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("�ߺ��� ID");
				return;
			}
			System.out.println("���� �Է�>>");
			title = sc.nextLine();
			System.out.println("���� �Է�>>");
			author = sc.nextLine();
			totalBook.add(new Novel(bookId, title, author));
			break;
		case "3":
			System.out.println("����� BookID �Է�>>");
			bookId = sc.nextLine();
			if(isId(bookId)) {
				System.out.println("�ߺ��� ID");
				return;
			}
			System.out.println("���� �Է�>>");
			title = sc.nextLine();
			System.out.println("���� �Է�>>");
			author = sc.nextLine();
			totalBook.add(new Poet(bookId, title, author));
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
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
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		System.out.println("������ ������ ID �Է�>>");
		String inputId=sc.nextLine();
		int index=findListIndex(inputId);
		if(index==-1) {
			System.out.println("ID�� �߸��Ǿ����ϴ�.");
		}else {
			totalBook.remove(index);
			System.out.println("�����Ϸ�");
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
		System.out.println("���� ��ȸ");
		for(Book i:totalBook) {
			System.out.print("ID: " + i.getBookId());
			System.out.print(" | ����: " + i.getTitle());
			System.out.print(" | ����: " + i.getAuthor());
			System.out.println(" | �뿩����: " + (i.isLoaned() ? "�뿩�Ұ�" : "�뿩����") );
			
		}
	}
	//�ٸ������� ����
	public void loanBook() {
		System.out.println("�뿩�� å�� ID �Է�>>");
		String bookId=sc.nextLine();
		int index=findListIndex(bookId);
		if(index==-1) {
			System.out.println("��ϵ��� ���� ID�Դϴ�.");
		}else {
			if(totalBook.get(index).isLoaned()) {
				System.out.println("�뿩��");
			}else {
				System.out.println("�뿩 �Ϸ�");
				totalBook.get(index).setLoaned(true);
			}
		}
	}
	
	public void returnBook() {
		System.out.println("�ݳ��� å�� ID�� �Է�>>");
		String bookId=sc.nextLine();
		int index=findListIndex(bookId);
		if(index==-1) {
			System.out.println("��ϵ��� ���� ID�Դϴ�.");
		}else {
			if(totalBook.get(index).isLoaned()) {
				System.out.println("�ݳ� �Ϸ�");
				//���Ƽ �ΰ�? ��¥����?
				totalBook.get(index).setLoaned(false);
			}else {
				System.out.println("�뿩���� ������ �ƴմϴ�.");
			}
		}
	}
	
	
}
