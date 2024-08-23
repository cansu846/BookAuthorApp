package kodlama.io.BooksApiApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthorDto {

    private Long id;
    private String name;
    private int age;
}
