package by.itClass;

import by.itClass.interfaces.Printable;

public class Journal implements Printable {

    private String name;
    private String date;

    public Journal() {
    }

    public Journal(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Journal: "+name+"; "+ date);
    }

}
