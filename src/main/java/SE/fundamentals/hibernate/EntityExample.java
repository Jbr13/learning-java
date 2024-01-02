package SE.fundamentals.hibernate;

import java.io.Serializable;
import javax.persistence.*;


@Entity // Define which object should be persisted in our database
@Table(name = "customer") // Define our table name
@SequenceGenerator(name = "learning_sequence", sequenceName = "learning_sequence", allocationSize = 1)
public class EntityExample implements Serializable {
    /*
        mark a class as capable of being serialized, allowing objects of that class to be converted into a sequence of bytes.
        This enables easy storage, transmission, or reconstruction of the object's state, facilitating tasks like saving
        objects to files, transmitting over networks, or storing in databases for later retrieval and reconstruction.
    */

    @Id // Setting which columns is our ID in the class
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "learning_sequence") // Generating automated values to the primary key
    @Column(name = "customer_id") // Associating the class attribute with the database column
    private Integer ID;

    @Column(name = "first_name", nullable = false) // Associating the class attribute with the database column
    private String firstName;

    @Column(name = "last_name", nullable = false) // Associating the class attribute with the database column
    private String lastName;

    public Integer getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

