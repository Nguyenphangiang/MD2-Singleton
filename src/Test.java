public class Test {
    public static void main(String[] args) {
        System.out.println("Begin testing singleton pattern");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower 1 ask to borrow the book");
        System.out.println("BookBorrower 1 Author and Title : ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower 2 ask to borrow the book");
        System.out.println("BookBorrower 2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower 1 returned the book.");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower 2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        System.out.println("End testing singleton pattern");

    }
}
