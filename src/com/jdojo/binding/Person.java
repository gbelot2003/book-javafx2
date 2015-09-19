/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdojo.binding;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author ajax
 */
public class Person {
    
    private String name;
    
    private ObjectProperty<Address> addr = new SimpleObjectProperty(new Address());
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public ObjectProperty<Address> addrProperty() {
        return addr;
    }

}
