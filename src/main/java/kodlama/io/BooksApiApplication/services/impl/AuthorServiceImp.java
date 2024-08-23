package kodlama.io.BooksApiApplication.services.impl;

import kodlama.io.BooksApiApplication.domain.entities.AuthorEntity;
import kodlama.io.BooksApiApplication.repository.AuthorRepository;
import kodlama.io.BooksApiApplication.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorServiceImp implements AuthorService {

    private AuthorRepository authorRepository;

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }

    @Override
    public List<AuthorEntity> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> findOne(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public boolean isExists(Long id) {
        return authorRepository.existsById(id);
    }

    @Override
    public AuthorEntity partialUpdate(Long id, AuthorEntity authorEntity) {
        authorEntity.setId(id);
        return authorRepository.save(authorEntity);
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
