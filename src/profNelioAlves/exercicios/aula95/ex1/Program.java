package profNelioAlves.exercicios.aula95.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos empregados serão registrados? ");
        int quant = sc.nextInt();
        sc.nextLine();

        List<Employee> regist = new ArrayList<>();

        for (int i = 0; i < quant; i++){
            System.out.println("Empregado #" + (i + 1));
            System.out.print("ID do empregado: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do empregado: ");
            String name = sc.nextLine();

            System.out.print("Salário do empregado: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            regist.add(new Employee(id, name, salary));
        }

        System.out.print("Qual o ID do funcionário que receberá aumento? ");
        int id = sc.nextInt();
        sc.nextLine();
        Employee emp = regist.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("O funcionário não existe! ");
        }else{
            System.out.print("Qual a porcentagem de aumento? ");
            double percent = sc.nextDouble();
            sc.nextLine();
            emp.setSalary(emp.getSalary() + (emp.getSalary() * (percent / 100)));
        }

        for (Employee employee : regist) {
            System.out.println("_______________________");
            System.out.println("ID: " + employee.getId());
            System.out.println("Nome: " + employee.getName());
            System.out.println("Salario: " + employee.getSalary());
        }
        sc.close();
    }
}
