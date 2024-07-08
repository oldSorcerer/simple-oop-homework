package appl;

import dto.*;

import java.util.Arrays;
import java.util.Objects;

public class PersonAppl {

    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Manager name_1", 44, true, "Company_1", "manager1", 5000, 2),
                new Manager("Manager name_2", 56, true, "Company_1", "manager2", 6000, 5),
                new Manager("Manager name_3", 33, false, "Company_1", "manager3", 5000, 3),

                new SaleManager("Sale manager name_1", 25, false, "Company_1", "sales1", 2300, 100_000, 2),
                new SaleManager("Sale manager name_2", 28, true, "Company_1", "sales1", 2300, 250_000, 2),
                new SaleManager("Sale manager name_3", 20, false, "Company_1", "sales1", 2300, 93_500, 2),
                new SaleManager("Sale manager name_4", 31, true, "Company_1", "sales1", 2300, 340_000, 2.5),

                new WageEmployee("Wage employee name_1", 43, true, "Company_1", "employee", 4500, 100, 30),
                new WageEmployee("Wage employee name_2", 60, true, "Company_1", "employee", 4500, 80, 35),
                new WageEmployee("Wage employee name_3", 66, true, "Company_1", "employee", 4500, 120, 33)
        };

        printAllEmployee(employees);

        System.out.printf("Global salary = $%s%n", getAllSalary(employees));

        System.out.printf("Total sales = $%s%n", getTotalSales(employees));

        SaleManager saleManager =
                new SaleManager("Sale manager name_4", 31, true, "Company_1", "sales1", 2300, 340_000, 2.5);

        boolean searchRes = search(employees, saleManager);

        System.out.println(searchRes);
    }

    public static boolean search(Employee[] employees, Employee employee) {
        if (Objects.isNull(employees) || Objects.isNull(employee)) {
            return false;
        }
        return Arrays.asList(employees).contains(employee);
    }

    public static double getTotalSales(Employee[] employees) {
        if (Objects.isNull(employees)) return -1;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee instanceof SaleManager)
                .map(employee -> (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }

    public static double getAllSalary(Employee[] employees) {
        if (Objects.isNull(employees)) return -1;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public static void printAllEmployee(Employee[] employees) {
        if (Objects.isNull(employees)) return;

        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .forEach(Person::display);
    }
}
