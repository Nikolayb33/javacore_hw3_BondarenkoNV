//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        работники
         */
        Employee e1 = new Employee(12, 6, 1991, 30000);
        Employee e2 = new Employee(11, 6, 1991, 50000);
        /*
        шэф
         */
        Chief с1 = new Chief(14, 6, 1991, 70000);

        /*
        проверка первого задания
         */
        if(e1.compareTo(e2) < 0){
            System.out.println("e1 yonger e2");
        }
        if(e1.compareTo(e2) > 0){
            System.out.println("e1 older e2");
        }
        if(e1.compareTo(e2) == 0){
            System.out.println("Даты рождения равны");
        }

        /*
        проверка второго задания
         */

        System.out.println(Employee.increaseSalary(e1.getSalary()));
        System.out.println(Employee.increaseSalary(e2.getSalary()));

<<<<<<< HEAD
        Chief.increaseSalary(c1.getSalary(), 15);
=======
>>>>>>> d26d0c63c6e79307843f4711800b1f69e6b5db36


    }
}
