package org.scenario.SmartShelf;

public class SmartShelf {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book("2 state","Chetan bhagat");
		book[1] = new Book("art of leaving","Krishna");
		book[2] = new Book("kuch bhi","Nathuram");
		book[3] = new Book("not giving ....","Robert brown");
		book[4] = new Book("halg gf","Greene Robert");
		
		int n = book.length;
		for(int i = 1; i<n ; i++) {
			Book curr = book[i];
			int prev = i-1;
			while(prev >= 0 && (book[prev].title).compareTo(curr.title) > 0) {
				book[prev+1] = book[prev];
				prev--;
			}
			book[prev+1] = curr;
		}
        for (Book b : book) {
            System.out.println(b.title);
        }
	}

}
