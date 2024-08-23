package kodlama.io.BooksApiApplication.mappers;

public interface Mapper<A,B> {
    B requestMap(A a);
    A responseMap(B b);
}
