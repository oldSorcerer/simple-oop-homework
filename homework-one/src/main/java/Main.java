import dto.Employee;
import dto.Manager;
import dto.SaleManager;
import dto.WageEmployee;

import static app.PersonApp.*;

public class Main {

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
                new SaleManager("Sale manager name_4", 30, true, "Company_1", "sales1", 2300, 340_000, 2.5);

        boolean searchRes = search(employees, saleManager);

        System.out.println(searchRes);
    }
}
