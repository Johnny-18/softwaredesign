package com.company;

import java.util.Objects;

public final class User implements Cloneable {
    private final String author;
    private final String description;
    private final String time;

    public User(String author, String description, String time) {
        this.author = author;
        this.description = description;
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (!(object instanceof User)) {
            return false;
        }

        User user = (User) object;

        return author == user.author && description == user.description && time == user.time;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, description, time);
    }

    @Override
    public String toString() {
        return "Author: " + author + "\nDescription: " + description + "\nTime: " + time;
    }
}
