
public class PerformanceTest {
	
    public static void main(String[] args) {
    	
        Book[] books = new Book[1000000];
        
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i, "Book " + i, "Author " + i, 2000 + i);
        }
        
        Library library = new Library(books);

        long startTime = System.currentTimeMillis();
        library.search(999999);
        
        long endTime = System.currentTimeMillis();
        System.out.println("Linear search time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        library.search_bs(999999);
        endTime = System.currentTimeMillis();
        System.out.println("Binary search time: " + (endTime - startTime) + "ms");
    }
}
