package com.ebsco.training.bookmiddle.dao;

import com.ebsco.training.bookmiddle.dto.BookDto;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Use either @Profile or @ConditionalOnProperty to control which implementation Spring loads
//@Profile("!local")
@ConditionalOnProperty(value="book.useStubs", havingValue="false", matchIfMissing = true)
@Repository
public class BookDao implements BookDaoInterface {

    private Map<String, BookDto> booksById = new HashMap();
    private Integer idCounter = 1;

    public List<BookDto> getBooks() {
        return new ArrayList(booksById.values());
    }

    public Optional<BookDto> getBookById(String id) {
        return Optional.ofNullable(booksById.get(id));
    }

    public Optional<BookDto> deleteBook(String id) {
        return Optional.ofNullable(booksById.remove(id));
    }

    public BookDto createBook(String title, String author, String genre) {
        String id = String.valueOf(idCounter++);
        booksById.put(id, new BookDto(id, title, author, genre));
        return booksById.get(id);
    }

    public Optional<BookDto> updateBook(String id, String title, String author, String genre) {
        BookDto result = booksById.get(id);
        if (result != null) {
            result.setTitle(title);
            result.setAuthor(author);
            result.setGenre(genre);
        }
        return Optional.ofNullable(result);
    }

    @PostConstruct
    void createGreetings() {
        createBook("A Farewell to Arms", "Ernest Hemingway", "Fiction");
        createBook("Cryptonomicon", "Neal Stephenson", "Fiction");
        createBook("Genghis Khan and the Making of the Modern World", "Jack Weatherford", "History");
        createBook("Goodnight Moon", "Margaret Wise Brown", "Childrens");
    }
}