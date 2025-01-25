public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Джеймс", "Дэшнер");

        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Бегущий в лабиринте", author2, 2009);

        book2.setPublicationYear(1931);

        System.out.println("Книга 1:");
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println("\nКнига 2:");
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());
    }

}

