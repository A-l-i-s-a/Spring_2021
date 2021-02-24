package edu.spring.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int count;

    public Country() {
    }

    public Country( String name, int count) {
        this.count = count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
