/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavin
 */
public class Book {

    private String title;
    private int numPages;
    private String year;

    public Book(String title, int numPages, String year) {
        this.title = title;
        this.numPages = numPages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
//
//    public boolean isAwesome() {
//        return this.name.contains("MasterChef");
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getDuration() {
//        return duration;
//    }

    @Override
    public String toString() {
        return this.title + ", " + this.numPages + " pages, " + this.year;
    }
}
