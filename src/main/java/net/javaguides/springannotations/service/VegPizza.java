package net.javaguides.springannotations.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



public class VegPizza implements Pizza{

    public String getPizza(){
        return "Veg Pizza More";
    }
}
