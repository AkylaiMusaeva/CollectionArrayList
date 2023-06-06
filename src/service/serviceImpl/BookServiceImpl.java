package service.serviceImpl;

import LmsTask.model.Book;
import LmsTask.model.Library;
import service.BookService;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private final LibraryServiceImpl libraryService;

    public BookServiceImpl(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
      Library l= libraryService.getLibraryById(libraryId);
      l.setBook(book);
        return book;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        Library l=libraryService.getLibraryById(libraryId);
        return l.getBooks();
    }
    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i<getAllBooks(libraryId).size(); i++) {
            if(getAllBooks(libraryId).get(i).getId()==bookId){
                System.out.println(getAllBooks(libraryId));
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for(int i=0;i<getAllBooks(libraryId).size();i++){
            if(getAllBooks(libraryId).get(i).getId()==bookId){
                getAllBooks(libraryId).remove(getAllBooks(libraryId).get(i));
            }
        }
        System.out.println(getAllBooks(libraryId));
        return "We successfully deleted book from library";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (int i = 0; i < getAllBooks(libraryId).size(); i++) {
            getAllBooks(libraryId).clear();
        }
        System.out.println("We successfully cleared all books in library.");
        System.out.println(getAllBooks(libraryId));
    }

}
