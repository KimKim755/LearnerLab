package io.zipcoder.interfaces;

public class Person {
    private String name;
   final private long id;
    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }


    }



