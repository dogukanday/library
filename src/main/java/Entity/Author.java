package Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "author_countru")
    private String authorCountry;

    @Column(name = "author_birthdate")
    private String authorBirthdate;

    @Column(name = "author_books")
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> authorBooks;

    public Author() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }

    public String getAuthorBirthdate() {
        return authorBirthdate;
    }

    public void setAuthorBirthdate(String authorBirthdate) {
        this.authorBirthdate = authorBirthdate;
    }

    public List<Book> getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(List<Book> authorBooks) {
        this.authorBooks = authorBooks;
    }
}
