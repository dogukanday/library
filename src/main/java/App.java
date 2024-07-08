import Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthorName("J.K. Rowling");
        author.setAuthorCountry("United Kingdom");
        author.setAuthorBirthdate("31 July 1965");

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Bloomsbury Publishing");
        publisher.setPublisherYear("1997");
        publisher.setPublisherAdress("London, England");


        Category category = new Category();
        category.setCategoryName("Fantasy");
        category.setCategoryDescription("Fantasy is a genre of speculative fiction set in a fictional universe, often inspired by real world myth and folklore.");


        Category category2 = new Category();
        category2.setCategoryName("Adventure");
        category2.setCategoryDescription("Adventure fiction is a genre of fiction in which an adventure, an exciting undertaking involving risk and physical danger, forms the main storyline.");


        Book book = new Book();
        book.setBookName("Harry Potter and the Philosopher's Stone");
        book.setAuthor(author);
        book.setYear(1997);
        book.setStock(100);
        book.setPublisher(publisher);
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category);
        categories.add(category2);
        book.setCategory(categories);





        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Borrowing.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Publisher.class)
                .addAnnotatedClass(Author.class)
                .buildSessionFactory();


        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(author);
        session.persist(publisher);
        session.persist(category);
        session.persist(category2);
        session.persist(book);



        session.getTransaction().commit();
        session.close();

    }
}
