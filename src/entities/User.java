
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;      //imports me cmd+shift+i gia na valei mono auta pou xreiazetai (fix imports)
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable {   //pairnei noumero ,etiketa ..san xartaki anamonhs se oura
    @Id
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Column(name = "telephone")
    private String tel;
    private String email;

    
    
    public User() {
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", tel=" + tel + ", email=" + email + '}';
    }

 

    
    
}
