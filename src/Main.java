//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("12.05.1993");
        Employee e2 = new Employee("08.09.1991");
        System.out.println(e1.getDay());
        System.out.println(e1.compareTo(e2));
        }
    }
