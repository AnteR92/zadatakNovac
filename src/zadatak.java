import java.util.Scanner;

public class zadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite iznos: ");
        double broj = Double.parseDouble(sc.next());

        double[] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        System.out.println("Potrebne novcanice i kovanice: ");

        for (double apoen : apoeni) {
            int zbroj = (int) (broj / apoen);
            if (zbroj > 0) {
                System.out.println(zbroj + " * " + apoen + " Eur");
                broj -= zbroj * apoen;
            }

        }

        sc.close();
    }
}
