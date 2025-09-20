package application;


import entities.PF;
import entities.PJ;
import entities.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaanual = sc.nextDouble();

            if (ic == 'i') {
                System.out.print("Health expenditures: ");
                double gastosComSaude = sc.nextDouble();
                list.add(new PF(rendaanual, name, gastosComSaude));
            } else {
                System.out.print("Number of employees: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PJ(rendaanual, name, numeroDeFuncionarios));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");

        double somaDoImpostos = 0;

        for (People p : list) {
            System.out.println(p.getName() + ": $" + String.format("%.2f", p.imposto()));
            somaDoImpostos += p.imposto();
        }

        System.out.print("TAXES PAID: $ " + String.format("%.2f", somaDoImpostos));

        sc.close();
    }
}