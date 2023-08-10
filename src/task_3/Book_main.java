package task_3;

public class Book_main {

    public static void main(String[] args) {

        System.out.println("Книга №1: ");

        Title title = new Title("Title");
        Title.show();

        Author author = new Author("Author");
        Author.show();

        Content content = new Content("Content");
        Content.show();
    }
}
