package nu.te4.mybookstore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.te4.mybookstore.Author;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-08T10:07:14")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> price;
    public static volatile SingularAttribute<Book, Author> author;
    public static volatile SingularAttribute<Book, Integer> id;
    public static volatile SingularAttribute<Book, String> title;

}