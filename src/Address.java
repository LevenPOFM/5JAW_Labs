
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
public class Address {
    
    public int houseNum;
    public String street;
    public String suburb;
    public int postcode;
    public String state;

    public Address(int houseNum, String street, String suburb, int postcode, String state) {
        this.houseNum = houseNum;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNum=" + houseNum + ", street=" + street + ", suburb=" + suburb + ", postcode=" + postcode + ", state=" + state + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.houseNum;
        hash = 37 * hash + Objects.hashCode(this.street);
        hash = 37 * hash + Objects.hashCode(this.suburb);
        hash = 37 * hash + this.postcode;
        hash = 37 * hash + Objects.hashCode(this.state);
        return hash;
    }

    // I will compare Number, Street and Suburb for equality.
    // Only if all three variables are equal will the addresses be equal. 
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
        final Address other = (Address) obj;
        if (this.houseNum != other.houseNum) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.suburb, other.suburb)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
