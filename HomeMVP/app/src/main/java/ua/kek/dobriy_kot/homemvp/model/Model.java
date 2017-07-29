package ua.kek.dobriy_kot.homemvp.model;

/**
 * Created by Dobriy_Kot on 16.07.2017.
 */

public class Model {
    private String string="";

    public String getString() {
        return string;
    }

    public void addText(String text){
        string="Select: "+text;

    }
}
