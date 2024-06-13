public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // 기존 search 함수
    public Book search(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // 새로운 이진 탐색 함수
    public Book search_bs(int id) {
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].getId() == id) {
                return books[mid];
            } else if (books[mid].getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
