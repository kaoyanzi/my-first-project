package com.itheima.myfile.a01test;

import java.util.Objects;

public class Actor {
    private String name;
    private int age;

    public Actor() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
