package com.razvan.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author razvan adam
 */
@Document
public class Movie {

    /**
     * Auto generated id of the movie
     */
    @Id
    private ObjectId id;

    /**
     * Name of the movie
     */
    private String name;
    /**
     * Price of the movie
     */
    private double price;
    /**
     * Length in of the movie in minutes
     */
    private int length;
    /**
     * Availability of the movie in the store
     */
    private boolean available;

    /**
     * Default constructor
     */
    public Movie() {

    }

    /**
     * Initializes a new Movie with the values passed on the parameters.
     * @param name String name of the movie
     * @param price double price of the movie
     * @param length int length of the movie in minutes
     * @param available boolean availability of the movie in the store
     */
    public Movie(String name, double price, int length, boolean available) {
        this.name = name;
        this.price = price;
        this.length = length;
        this.available = available;
    }

    /**
     * Gets the id of the movie
     * @return ObjectId of the movie
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Sets the id of the movie
     * @param id ObjectId of the movie
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Gets the name of the movie
     * @return String name of the movie
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the movie
     * @param name String name of the movie
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the movie
     * @return double price of the movie
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the movie
     * @param price double price of the movie
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the length of the movie in minutes
     * @return int length of the movie in minutes
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the length of the movie in minutes
     * @param length int length of the movie in minutes
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Checks the availability of the movie in the store
     * @return boolean availability of the movie in the store
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability of the movie in the store
     * @param available boolean availability of the movie in the store
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns a String object representing the specified Movie in the format:
     * Movie{name=Terminator, price = 12.25, length=90, available=true}
     * @return String representing the specified Movie
     */
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", available=" + available +
                '}';
    }
}
