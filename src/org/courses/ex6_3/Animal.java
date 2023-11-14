package org.courses.ex6_3;


public class Animal {

    @ImportantField(priority = 10)
    private String name;
    private String breed;
    @ImportantField(priority = 9)
    private int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void sayVoice(){
        System.out.println("Voice");
    }
}
