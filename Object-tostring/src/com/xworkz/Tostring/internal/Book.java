package com.xworkz.Tostring.internal;

public class Book {
    private String title;
    private int pageCount;
    private double price;

    public Book(String title, int pageCount, double price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 1;
    }

}
