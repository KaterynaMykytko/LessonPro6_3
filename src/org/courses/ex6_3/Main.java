package org.courses.ex6_3;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Animal cat = new Cat("Wanda", "Scottish", 13);
        Animal dog = new Dog("Ralf", "beagle", 2);

        cat.sayVoice();
        dog.sayVoice();

        Class superClass = cat.getClass().getSuperclass();
        Field[] fields = superClass.getDeclaredFields();
        for (Field field : fields) {
            ImportantField annotation = field.getAnnotation(ImportantField.class);
            if (annotation != null) {
                field.setAccessible(true);
                System.out.println(
                        "Field: "
                        + field.getName()
                        + " is important, priority: "
                        + annotation.priority()
                        + ", value: "
                        + field.get(cat)
                );
            }
        }
    }
}
