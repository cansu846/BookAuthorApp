package kodlama.io.BooksApiApplication.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="books")
public class BookEntity {

    @Id
    private String isbn;  //International Standard Book Number
    private String title;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="author_id")
    private AuthorEntity author;
}
