package Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "publisher_name")
        private String publisherName;

        @Column(name = "publisher_year")
        private String publisherYear;

        @Column(name = "publisher_adress")
        private String publisherAdress;

        @Column(name = "publisher_books")
        @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
        private List<Book> publisherBooks;

        public Publisher() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getPublisherName() {
                return publisherName;
        }

        public void setPublisherName(String publisherName) {
                this.publisherName = publisherName;
        }

        public String getPublisherYear() {
                return publisherYear;
        }

        public void setPublisherYear(String publisherYear) {
                this.publisherYear = publisherYear;
        }

        public String getPublisherAdress() {
                return publisherAdress;
        }

        public void setPublisherAdress(String publisherAdress) {
                this.publisherAdress = publisherAdress;
        }

        public List<Book> getPublisherBooks() {
                return publisherBooks;
        }

        public void setPublisherBooks(List<Book> publisherBooks) {
                this.publisherBooks = publisherBooks;
        }
}
