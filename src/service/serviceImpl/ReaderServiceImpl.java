package service.serviceImpl;

import LmsTask.model.Book;
import LmsTask.model.Database;
import LmsTask.model.Library;
import LmsTask.model.Reader;
import service.LibraryService;
import service.ReaderService;

import java.util.ArrayList;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private final LibraryServiceImpl libraryService;
    private Database database;

    public ReaderServiceImpl(Database database, LibraryServiceImpl libraryService) {
        this.database = database;
        this.libraryService = libraryService;

    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    private Reader readers;

    @Override
    public void saveReader(Reader reader) {
        database.getReaders().add(reader);
        System.out.println(database.getReaders());
        System.out.println("Reader is successfully saved.");
    }

    @Override
    public List<Reader> getAllReaders() {
        return database.getReaders();
    }

    @Override
    public Reader getReaderById(Long id) {
        for (int i = 0; i < database.getReaders().size(); i++) {
            if (database.getReaders().get(i).getId() == id) {
                System.out.println(database.getReaders().get(i));
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (int i = 0; i < database.getReaders().size(); i++) {
            if (database.getReaders().get(i).getId().equals(id)) {
                database.getReaders().set(i, reader);
            }
        }
        return reader;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        Reader reader = getReaderById(readerId);
        Library l = libraryService.getLibraryById(libraryId);
        l.setReader(reader);
        System.out.println(reader);
        System.out.println(libraryService.getAllLibraries());
        System.out.println("Reader has assigned to the library");


    }
}


