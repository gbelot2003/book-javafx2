/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdojo.binding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ajax
 */
public class Address {
    private StringProperty zip = new SimpleStringProperty("36106");
    
    public StringProperty zipProperty() {
        return zip;
    }

}
