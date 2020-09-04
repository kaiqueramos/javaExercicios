package profNelioAlves.exercicios.aula117.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o departamento? ");
        Department department = new Department(sc.nextLine());

        System.out.println("Coloque os dados do usuarios: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Nível: (JUNIOR, MID_LEVEL, SENIOR) ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Salário base: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name,level, baseSalary, department);

        System.out.print("Quantos contratos para esse trabalhador? ");
        int quantContracts = sc.nextInt();
        sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i < quantContracts; i++){
            System.out.println("Dados do contrato #" + (i + 1));
            System.out.print("Data: (DD/MM/YYYY) ");
            Date date = sdf.parse(sc.nextLine());

            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            System.out.print("Duração (horas): ");
            int duration = sc.nextInt();
            sc.nextLine();

            HourContract hc = new HourContract(date, valuePerHour, duration);
            worker.addContract(hc);
        }
        System.out.print("Coloque o mês e o ano para calcular o salário (MM/YYYY): ");
        SimpleDateFormat sdfmy = new SimpleDateFormat("MM/yyyy");
        Date dateCalcSal = sdfmy.parse(sc.nextLine());

        Calendar cal = Calendar.getInstance();
        cal.setTime(dateCalcSal);
        int month = 1 + cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Salário em " + month + "/" + year + ": " + worker.income(year, month));

        sc.close();
    }
}
