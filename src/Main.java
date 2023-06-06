import LmsTask.model.*;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        BookServiceImpl bookService=new BookServiceImpl(libraryService);


        Book book1=new Book(1L, "Kyzyl alma", "Ch.Aitmatov", Genre.POEM);
        Book book2=new Book(2L, "Lagom", "A.Alisheva", Genre.ROMANTIC);
        Book book3=new Book(3L, "10 killers", "A.Christy", Genre.DETECTIVE);
        Book book4=new Book(4L, "Music", "T.Swift", Genre.HISTORICAL);
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));




        Reader reader1=new Reader(1L,"Akylai","Musaeva","+996773543669", Gender.FEMALE);
        Reader reader2=new Reader(2L,"Erbol","Alymbekov","+996558987874", Gender.MALE);
        Reader reader3=new Reader(3L,"Valentina","Ivanova","+996222651236", Gender.FEMALE);
        Reader reader4=new Reader(4L,"Venessa","Osmonova","+996995458745", Gender.FEMALE);
        Reader reader7=new Reader(7L,"assign","new reader","+996558789874", Gender.MALE);
        ArrayList<Reader>readers=new ArrayList<>(List.of(reader1,reader2,reader3));
        ArrayList<Reader>readers1=new ArrayList<>(List.of(reader4));


        Library library1 = new Library(1L, "Bayalinov", "Tsum",books,readers);
        Library library2 = new Library(2L, "Isanov", "Isanov/Kiev",new ArrayList<>(),readers1);
        Library library3 = new Library(3L, "Osmonov", "Goin");
        ArrayList<Library> libraries = new ArrayList<>(Arrays.asList(library1, library2, library3));
        Database database=new Database(libraries,books,readers);
        ReaderServiceImpl readerService=new ReaderServiceImpl(database,libraryService);

        while (true) {
            switch (num = scanner.nextInt()) {
                case 1:
                    System.out.println("------Save library------");
                    System.out.println(libraryService.saveLibrary(libraries));
                    break;
                case 2:
                    System.out.println("------Get all libraries------");
                    System.out.println(libraryService.getAllLibraries());
                    break;
                case 3:
                    System.out.println("------Get library by ID------");
                    System.out.println(libraryService.getLibraryById(1L));
                    break;
                case 4:
                    System.out.println("------Update library------");
                    System.out.println(libraryService.updateLibrary(2L, new Library(1L, "Biblioteka#8", "Manas 46")));
                    break;
                case 5:
                    System.out.println("------Delete library by ID------\n");
                    System.out.println(libraryService.deleteLibrary(2L));
                    break;
                case 6:
                    System.out.println("------Save book------");
                    System.out.println(bookService.saveBook(3L,new Book(1L, "Kyzyl alma", "Ch.Aitmatov", Genre.POEM)));
                    break;
                case 7:
                    System.out.println("------Get all books------");
                    System.out.println(bookService.getAllBooks(1L));
                    break;
                case 8:
                    System.out.println("------Get book by id------");
                    System.out.println(bookService.getBookById(3L, 1L));
                    break;
                case 9:
                    System.out.println("------Delete book------\n");
                    System.out.println(bookService.deleteBook(1L, 2L));
                    break;
                case 10:
                    System.out.println("------Clear book by library ID------\n");
                    bookService.clearBooksByLibraryId(1L);
                    break;
                case 11:
                    System.out.println("------Save reader------");
                    readerService.saveReader(new Reader(5L,"Peter","Parker","+996778954658",Gender.MALE));
                    break;
                case 12:
                    System.out.println("------Get all readers------");
                    System.out.println(readerService.getAllReaders());
                    break;
                case 13:
                    System.out.println("------Get reader by ID------");
                    System.out.println(readerService.getReaderById(3L));
                    break;
                case 14:
                    System.out.println("------Update reader------");
                    System.out.println(readerService.updateReader(1L, new Reader(1L, "Tereza", "terezka98@gmail.com", "+996552507188", Gender.MALE)));
                    break;
                case 15:
                    System.out.println("------Assign Reader To Library------");
                    readerService.assignReaderToLibrary(1L,3L);
                    break;









            }
            }



    }
}
