package com.example.LibraryApp_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Library {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private String language;
    private int price;
    private String description;
    private String publisher;
    private String distributor;
    private int releasedyear;
    private String bookimage;

    public Library() {
    }

    public Library(int id, String title, String author, String language, int price, String description, String publisher, String distributor, int releasedyear, String bookimage) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.language = language;
        this.price = price;
        this.description = description;
        this.publisher = publisher;
        this.distributor = distributor;
        this.releasedyear = releasedyear;
        this.bookimage = bookimage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public int getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(int releasedyear) {
        this.releasedyear = releasedyear;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }
}
