package Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "category_name")
        private String categoryName;

        @Column(name = "category_description")
        private String categoryDescription;


        @ManyToMany(mappedBy = "category")
        private List<Book> categoryBooks;

        public Category() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getCategoryName() {
                return categoryName;
        }

        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }

        public String getCategoryDescription() {
                return categoryDescription;
        }

        public void setCategoryDescription(String categoryDescription) {
                this.categoryDescription = categoryDescription;
        }

        public List<Book> getCategoryBooks() {
                return categoryBooks;
        }

        public void setCategoryBooks(List<Book> categoryBooks) {
                this.categoryBooks = categoryBooks;
        }
}
