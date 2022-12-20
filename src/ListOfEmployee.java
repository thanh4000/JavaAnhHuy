import java.io.*;
import java.lang.*;
import java.util.*;

// a Nhân viên bán hàng (Mã nhân viên, Tên nhân viên, Doanh số) 
class Employee {
    private int employeeCode;
    String employeeName;
    int sale;

    Employee(int employeeCode, String employeeName, int sale) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.sale = sale;
    }

    int getEmployeeCode() {
        return employeeCode;
    }

    String getEmployeeName() {
        return employeeName;
    }

    int getSale() {
        return sale;
    }

    void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void setSale(int sale) {
        this.sale = sale;
    }
};

public class ListOfEmployee {
    private ArrayList<Employee> list;

    ListOfEmployee() {
        list = new ArrayList<Employee>();
    }

    void addEmployee(Employee employee) {
        list.add(employee);
    }

    //c hàm để tìm nhân viên có doanh số cao nhất

    Employee findEmployeeWithHighestSale() {
        Employee employee = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getSale() > employee.getSale()) {
                employee = list.get(i);
            }
        }
        return employee;
    }

    //d Sắp xếp nhân viên theo thứ tự giảm dần của doanh số
    void sortEmployeeBySale() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSale() - o1.getSale();
            }
        });
    }

    //e hàm để tìm ra các nhân viên có doanh số bằng nhau
    void findEmployeeWithEqualSale() {
        sortEmployeeBySale();

        for (int i = 0; i < list.size() - 1; i++) {
            int sale = list.get(i).getSale();

            int j = i + 1;

            if (list.get(i).getSale() == list.get(j).getSale()) {
                System.out.println("");
                System.out.println("Employees with equal sale: " + sale);
                System.out.println(list.get(i).getEmployeeName() + " ");
            }

            while (j < list.size() && list.get(j).getSale() == sale) {
                System.out.print(list.get(j).getEmployeeName() + " ");
                j++;
            }
        }
    }

    void printListOfEmployee() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getEmployeeName());
        }
    }

    public static void main(String[] args) {
        // tạo một danh sách có 10 nhân viên
        ListOfEmployee list = new ListOfEmployee();

        list.addEmployee(new Employee(1, "Nguyen Van A", 200));
        list.addEmployee(new Employee(2, "Nguyen Van B", 200));
        list.addEmployee(new Employee(3, "Nguyen Van C", 400));
        list.addEmployee(new Employee(4, "Nguyen Van D", 400));
        list.addEmployee(new Employee(5, "Nguyen Van E", 500));
        list.addEmployee(new Employee(6, "Nguyen Van F", 500));
        list.addEmployee(new Employee(7, "Nguyen Van G", 700));
        list.addEmployee(new Employee(8, "Nguyen Van H", 800));
        list.addEmployee(new Employee(9, "Nguyen Van I", 900));
        list.addEmployee(new Employee(10, "Nguyen Van J", 900));

        System.out.println("Employee with highest sale: " + list.findEmployeeWithHighestSale().getEmployeeName());

        System.out.println("List of employee after sort by sale descending: ");
        list.sortEmployeeBySale();

        list.printListOfEmployee();

        System.out.println("List of employees with equal sale: ");
        list.findEmployeeWithEqualSale();
    }
};
