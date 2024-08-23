package kodlama.io.BooksApiApplication.mappers.impl;

import kodlama.io.BooksApiApplication.domain.dto.AuthorDto;
import kodlama.io.BooksApiApplication.domain.entities.AuthorEntity;
import kodlama.io.BooksApiApplication.mappers.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

@Component
@AllArgsConstructor
public class AuthorMapperImpl implements Mapper<AuthorDto,AuthorEntity> {

    private ModelMapper modelMapper;

    @Override
    public AuthorDto responseMap(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity requestMap(AuthorDto authorDto) {
        return modelMapper.map(authorDto, AuthorEntity.class);
    }
}
