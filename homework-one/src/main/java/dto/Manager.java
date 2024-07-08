package dto;

import lombok.*;

@Getter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {

    private int grade; // Позиционный уровень. Чем выше уровень, тем выше зп(меняется от 1 до 6)

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary,
                   int grade) {
        super(name, age, married, company, position, baseSalary);
        setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6)
            this.grade = grade;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * grade;
    }
}
