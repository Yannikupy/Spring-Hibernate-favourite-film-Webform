package com.borisov.webform.models;

import javax.persistence.*;

@Entity
public class FavouriteFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "favourite_film")
    private String favouriteFilm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteFilm() {
        return favouriteFilm;
    }

    public void setFavouriteFilm(String favouriteFilm) {
        this.favouriteFilm = favouriteFilm;
    }

    public FavouriteFilm() {
    }

    public FavouriteFilm(String firstName, String lastName, String favouriteFilm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteFilm = favouriteFilm;
    }

    @Override
    public String toString(){
        return String.format("Item [id = %d, first name = '%s', last name = '%s', favourite film = '%s']", id, firstName
                , lastName, favouriteFilm);
    }
}
