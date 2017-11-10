package com.example.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Student
 */
@Named(value = "registrationBean")
@SessionScoped
public class RegistrationBean implements Serializable {

    private String salution;
    
    private String firstName;
    
    private String lastName;
    
    public RegistrationBean() {
    }

    public String getSalution() {
        return salution;
    }

    public void setSalution(String salution) {
        this.salution = salution;
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
