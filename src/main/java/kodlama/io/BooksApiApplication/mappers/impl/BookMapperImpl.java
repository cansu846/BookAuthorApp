package kodlama.io.BooksApiApplication.mappers.impl;

import kodlama.io.BooksApiApplication.domain.dto.BookDto;
import kodlama.io.BooksApiApplication.domain.entities.BookEntity;
import kodlama.io.BooksApiApplication.mappers.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookMapperImpl implements Mapper<BookDto, BookEntity> {

    private ModelMapper modelMapper;

    @Override
    public BookDto responseMap(BookEntity authorEntity) {
        return modelMapper.map(authorEntity, BookDto.class);
    }

    @Override
    public BookEntity requestMap(BookDto authorDto) {
        return modelMapper.map(authorDto, BookEntity.class);
    }
}
