package ru.pogodindv.PP_3_1_2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="title")
    private String title;
    @Column(name ="year")
    private int year;
    @Column(name ="genre")
    private String genre;
    @Column(name ="watched")
    private boolean watched;

    public Film() {

    }
    public Film(int id, String title, int year, String genre, boolean watched) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.watched = watched;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", watched=" + watched +
                '}';
    }
}
