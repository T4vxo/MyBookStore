/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.mybookstore;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class BookBean implements Serializable {

    @EJB
    BookFacade bookFacade;

    @EJB
    AuthorFacade authorFacade;

    private String addBookTitle;
    private String addBookDescription; 
    private int addBookPrice;
    private int addBookAuthor_id;

    public List<Book> getBooks() {
        return bookFacade.findAll();
    }

    public List<Author> getAuthors() {
        return authorFacade.findAll();
    }

    public void addBook() {
        Author author = authorFacade.find(addBookAuthor_id);    
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(addBookTitle);
        book.setPrice(addBookPrice);
        book.setDescription(addBookDescription);
        //persist
        bookFacade.create(book);
        //Clear
        addBookTitle = "";
        addBookPrice = 0;
        addBookDescription = "";
        
    }

    public String getAddBookTitle() {
        return addBookTitle;
    }

    public void setAddBookTitle(String addBookTitle) {
        this.addBookTitle = addBookTitle;
    }

    public int getAddBookPrice() {
        return addBookPrice;
    }

    public void setAddBookPrice(int addBookPrice) {
        this.addBookPrice = addBookPrice;
    }

    public int getAddBookAuthor_id() {
        return addBookAuthor_id;
    }

    public void setAddBookAuthor_id(int addBookAuthor_id) {
        this.addBookAuthor_id = addBookAuthor_id;
    }

    public String getAddBookDescription() {
        return addBookDescription;
    }

    public void setAddBookDescription(String addBookDescription) {
        this.addBookDescription = addBookDescription;
    }
    
    private Book updateBook;
    
    public void setUpdateBookForm(int id){
        updateBook = bookFacade.find(id);
    }
    
    //körs när man klickar på knappen
    public void saveUpdatedBook(){
        bookFacade.edit(updateBook);
    }

    public Book getUpdateBook() {
        return updateBook;
    }

    public void setUpdateBook(Book updateBook) {
        this.updateBook = updateBook;
    }
}

