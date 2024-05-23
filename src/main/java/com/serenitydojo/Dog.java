package com.serenitydojo;

public class Dog {
    final private String name;
    final private String favoruitetoy;
    final private int age;

    public Dog(String name, String favoruitetoy, int age) {
        this.name = name;
        this.favoruitetoy = favoruitetoy;
        this.age = age;

    }

//    public void setName(long name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

//    public void setFavoruitetoy(long favoruitetoy) {
//        this.favoruitetoy = favoruitetoy;
//    }

    public String getFavoriteToy() {
        return favoruitetoy;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }
}
