package dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Person {

    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void display() {
        System.out.println(this);
    }
}