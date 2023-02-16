package dao;

import model.Book;
import model.Publisher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    static final String PUBLISHER_FILE = "publisher.csv";
    public List<Book> publishers = null;

    @Override
    public boolean add(Book book) throws IOException {
        return false;
    }

    @Override
    public boolean delete(Book book) throws IOException {
        return false;
    }

    @Override
    public boolean update(Book book) throws IOException {
        return false;
    }

    @Override
    public Book getById(String id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
