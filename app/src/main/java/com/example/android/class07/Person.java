package com.example.android.class07;

import java.io.Serializable;

/**
 * Created by default on 2/27/17.
 */
//serializable means can be passed within activities
public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}