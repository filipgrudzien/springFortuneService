package com.fortune.entities;

import javax.persistence.*;

@Entity
@Table(name = "money")
public class MoneyQuote {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "quote")
    private String quote;

    @Column(name = "author")
    private String author;

    public MoneyQuote() {}

    public long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "DailyQuote{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
