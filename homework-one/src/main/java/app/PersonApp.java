package app;

import dto.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonApp {

    public static void printAllEmployee(Employee[] employees) {
        if (Objects.isNull(employees)) return;

        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .forEach(Person::display);
    }

    public static boolean search(Employee[] employees, Employee employee) {
        if (Objects.isNull(employees) || Objects.isNull(employee)) {
            return false;
        }
        return Arrays.asList(employees).contains(employee);
    }

    public static double getAllSalary(Employee[] employees) {
        if (Objects.isNull(employees)) throw new NullPointerException();

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public static double getTotalSales(Employee[] employees) {
        if (Objects.isNull(employees)) throw new NullPointerException();

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee -> (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }
}
