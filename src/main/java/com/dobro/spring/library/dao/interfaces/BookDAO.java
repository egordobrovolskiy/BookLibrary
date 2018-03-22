package com.dobro.spring.library.dao.interfaces;

import com.dobro.spring.library.entities.Author;
import com.dobro.spring.library.entities.Book;
import com.dobro.spring.library.entities.Genre;

import java.util.List;

public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
    Object getFieldValue(Long id, String fieldName);

}
