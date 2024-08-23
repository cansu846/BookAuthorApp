package kodlama.io.BooksApiApplication.domain.dto;

import kodlama.io.BooksApiApplication.domain.entities.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BookDto {
    private String isbn;
    private AuthorEntity author;
    private String title;
}
