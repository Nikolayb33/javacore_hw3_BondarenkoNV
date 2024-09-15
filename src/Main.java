//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(12, 06, 1991);
        Employee e2 = new Employee(11, 06, 1991);
        

        if(e1.compareTo(e2) < 0){
            System.out.println("e1 yonger e2");
        }
        if(e1.compareTo(e2) > 0){
            System.out.println("e1 older e2");
        }
        if(e1.compareTo(e2) == 0){
            System.out.println("Даты рождения равны");
        }
    }
}
