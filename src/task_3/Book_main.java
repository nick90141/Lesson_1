package task_3;

public class Book_main {

    public static void main(String[] args) {

        System.out.println("Книга №1: ");

        Title title = new Title();
        Title.titname = "Title name 1";

        Author author = new Author();
        Author.atnsame = "Author name 1";

        Content content = new Content();
        Content.conname = "Content name 1";

        Title.show();
        Author.show();
        Content.show();

    }

}
