package com.kodilla.kalkulator;

import java.util.*;
import java.lang.*;

class ArrayListStudentEvaluation
{
    public void assessment()
    {
        ArrayList<Integer> assess = new ArrayList<Integer>();
        assess.add(1);
        assess.add(3);
        assess.add(5);
        assess.add(4);
        assess.add(4);
        assess.add(4);
        assess.add(5);
        assess.add(4);
        assess.add(5);
        assess.add(3);
        assess.add(4);
        assess.add(5);
        assess.add(6);

        System.out.println(assess.size() + " Twoich ocen to:");
        for(int n=0; n < assess.size(); n++) {
            System.out.print(assess.get(n) + " ");
        }
        assess.remove(0);
        assess.remove(assess.size()-1);
        System.out.println();
        System.out.println(" A teraz " + assess.size() + " ocen bez najgorszej i najlepszej to: ");
        double sum = 0;

        for(Integer n: assess) {
            System.out.print(n + " ");
            sum +=n;
        }
        System.out.println();
        System.out.println("Srednia ocen to: " + sum/assess.size());
    }
}

class Book
{
    private String title;
    private int year;

    public Book (String title, int year) {
        this.title = title;
        this.year = year;
    }
    public String getTitle() {
        return this.title = title;
    }
    public int getYear() {
        return this.year = year;
    }

    public String toString() {
        return this.title + " - " + this.year;
    }
}

class MyBooks
{
    LinkedList<Book> books = new LinkedList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void writeBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void searching(int year) {
        for (Book book: books) {
            if (book.getYear() >= year) {
                System.out.println(book);
            }
        }
    }
}

class Application
{
    public static void main (String[] args) {
        ArrayListStudentEvaluation ass = new ArrayListStudentEvaluation();
        ass.assessment();

        MyBooks myBook = new MyBooks();

        myBook.addBook(new Book("Alice in Wonderland", 1865));
        myBook.addBook(new Book("The Lord od the Rings", 1954));
        myBook.addBook(new Book("'Millennium'", 2008));
        System.out.println();
        myBook.searching(2000);
    }
}
