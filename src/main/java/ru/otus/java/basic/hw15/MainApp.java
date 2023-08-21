package ru.otus.java.basic.hw15;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        int min = 1;
        int max = 30;
        ArrayList<Integer> testList = filledList(min, max);
        System.out.println(testList);

        int sumAbove5 = sumElemsAbove5(testList);
        System.out.println(sumAbove5);

        int newValue = 8;
        replaceListElem(newValue, testList);
        System.out.println(testList);

        testList = filledList(min, max);
        increaseListElem(newValue, testList);
        System.out.println(testList);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 23));
        employees.add(new Employee("Юрий", 39));
        employees.add(new Employee("Дмитрий", 25));
        employees.add(new Employee("Алексей", 34));
        employees.add(new Employee("Евгений", 41));
        System.out.println(employees);

        ArrayList<String> employeeNameList = new ArrayList<>();
        employeeNameList = nameList(employees);
        System.out.println("Список имен:\n" + employeeNameList);

        int minAge = 34;
        ArrayList<Employee> employeeOlderMinAge = new ArrayList<>();
        employeeOlderMinAge = listOldEmployee(employees, minAge);
        System.out.println("Список сотрудников старше " + minAge + ":\n" + employeeOlderMinAge);

        int averageAge = 40;
        System.out.println(checkAverageAge(employees, averageAge));

        Employee youngEmpolyee;
        youngEmpolyee = searchYoungEmployee(employees);
        System.out.println("Самый молодой сотрудник:\n" + youngEmpolyee);
    }
    public static ArrayList<Integer> filledList(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int  i = min; i <= max; i++){
            list.add(i);
        }
        return list;
    }

    public static int sumElemsAbove5(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }
    public static void replaceListElem(int value, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, value);
        }
    }
    public static void increaseListElem(int value, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + value);
        }
    }
    public static ArrayList<String> nameList(ArrayList<Employee> employees) {
        ArrayList<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(employee.getName());
        }
        return  list;
    }
    public static ArrayList<Employee> listOldEmployee(ArrayList<Employee> employees, int minAge) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                list.add(employee);
            }
        }
        return list;
     }
    public static boolean checkAverageAge(ArrayList<Employee> list, int averageAge) {
        int sumAge = 0;
        for (Employee i : list) {
             sumAge += i.getAge();
        }
        return (sumAge / list.size()) > averageAge;
    }
    public static Employee searchYoungEmployee(ArrayList<Employee> list) {
        int minAge = 500;
        Employee yongestEmpolyee = null;
        for (Employee i : list) {
            if (i.getAge() < minAge) {
                minAge = i.getAge();
                yongestEmpolyee = i;
            }
        }
        return yongestEmpolyee;
    }
}
