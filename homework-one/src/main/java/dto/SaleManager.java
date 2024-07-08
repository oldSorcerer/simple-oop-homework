package dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SaleManager extends Employee {

    private double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary,
                       double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + totalSales * bonus / 100;
    }
}
