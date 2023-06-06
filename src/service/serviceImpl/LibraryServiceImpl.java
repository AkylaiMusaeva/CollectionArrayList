package service.serviceImpl;

import LmsTask.model.Library;
import service.LibraryService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    ArrayList<Library>libraries1;
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        libraries1=new ArrayList<>(libraries);
        System.out.println("Libraries successfully saved!");
       return libraries1;
    }
    @Override
    public List<Library> getAllLibraries() {
        return libraries1;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < libraries1.size(); i++) {
            if(libraries1.get(i).getId()==id){
                return libraries1.get(i);
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        Library oldLibrary=getLibraryById(id);
        oldLibrary.setName(library.getName());
        oldLibrary.setAddress(library.getAddress());
        return oldLibrary;
    }


    @Override
    public String deleteLibrary(Long id) {
        for (int i = 0; i < libraries1.size(); i++) {
            if(libraries1.get(i).getId()==id){
                libraries1.remove(libraries1.get(i));
            }
        }
        System.out.println(libraries1);
        return "We successfully deleted library";
    }
}
