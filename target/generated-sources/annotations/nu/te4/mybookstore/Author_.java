package nu.te4.mybookstore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.te4.mybookstore.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-08T10:07:13")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile CollectionAttribute<Author, Book> bookCollection;

}