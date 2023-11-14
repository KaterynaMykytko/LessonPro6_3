package org.courses.ex6_3;

public class Cat extends Animal {

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void sayVoice() {
        System.out.println("Meow");
    }
}
