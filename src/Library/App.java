/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Calendar;
import java.util.GregorianCalendar;
import myclasses.Author;
import myclasses.Book;
import myclasses.History;
import myclasses.Rider;

/**
 *
 * @author pupil
 */
public class App {

    public void run(){
        Rider rider1 = new Rider();
        rider1.setFirstname("Petr");
        rider1.setLastname("Petrov");
        rider1.setPhone("25252525252");
        Rider rider2= new Rider();
        rider2.setFirstname("Olga");
        rider2.setLastname("Glimakova");
        rider2.setPhone("536954741");
       
        Book book1=new Book(); 
        book1.setBookName("Voina i mir");
        book1.setPublishedYear(2021);
        Author author1 = new Author();
        author1.setFirstname("Lev Tolstoi");
        author1.setYear(1828);
        Author[] authors = new Author[1];
        authors[0] = author1;
        book1.setAuthor(authors);
        
        Book book2=new Book(); 
        book1.setBookName("Otci i deti");
        book1.setPublishedYear(2019);
        Author author2 = new Author();
        author2.setFirstname("Ivan Turgeniev");
        author2.setYear(1818);
        Author[] authors2 = new Author[1];
        authors[0] = author2;
        book1.setAuthor(authors2);
        
        History history1= new History();
        history1.setBook(book1);
        history1.setRider(rider1);
        Calendar c = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("history1 ="+history1.toString());
        c = new GregorianCalendar();
        history1.setReturnedDate(c.getTime());
        
        History history2= new History();
        history2.setBook(book2);
        history2.setRider(rider2);
        c = new GregorianCalendar();
        history2.setGivenDate(c.getTime());
        System.out.println("history2 ="+history2.toString());
        c = new GregorianCalendar();
        history2.setReturnedDate(c.getTime());
        
        
        System.out.println("---------------------------------");
        
        System.out.println("history1 ="+history1+toString());
        System.out.println("history2 ="+history2+toString());

       
}
}
