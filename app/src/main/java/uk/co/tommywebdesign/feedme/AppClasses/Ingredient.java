package uk.co.tommywebdesign.feedme.AppClasses;

/**
 * Created by tommy on 16/10/16.
 */

public class Ingredient {


    public String name;

    public Enum type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public Ingredient(Catagory cat, String aName){
        this.name=aName;
        this.type =cat;
    }


    public enum Catagory{

        MEAT, VEG, FRUIT,GRAIN,EE

    }





}
