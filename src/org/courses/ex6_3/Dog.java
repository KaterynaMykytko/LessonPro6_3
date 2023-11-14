package org.courses.ex6_3;

public class Dog extends Animal {

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void sayVoice() {
        System.out.println("Woof");
    }
}
