package com.codedifferently.core.fundamentals.week01.inclass.part1;

public class ColorfulThing {
    private String color;

    public ColorfulThing(){
        this.color = "gray";

    }
    public ColorfulThing(String colorIn){
        this.color = colorIn;

    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return "My Color is "+ color;
    }

}
