
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Person {
    
    public int id;
    public String name;
    public String email;
    public int telNum;

    public Person(int id, String name, String email, int telNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelNum() {
        return telNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + this.telNum;
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", email=" + email + ", telNum=" + telNum + '}';
    }
    
    

    // ID is a unique variable in each case.
    // If 2 people have the same ID, by default they are the same person. 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    

    
    
    
}
