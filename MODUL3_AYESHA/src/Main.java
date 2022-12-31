import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scan = new Scanner(System.in);
    Calculation calc = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Pilih menu : ");
        int pilihan = scan.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nMasukkan sisi persegi : ");
            double persegi = scan.nextDouble();
            calc.setSquare(persegi);
            calc.run();
            System.out.println("\nHasil Persegi : " + calc.getSquare());
            break;
          case 2:
            System.out.print("\nMasukkan jari-jari lingkaran : ");
            double lingkaran = scan.nextDouble();
            calc.setCircle(lingkaran);
            calc.run();
            System.out.println("\nHasil Lingkaran : " + calc.getCircle());
            break;
          case 3:
            System.out.print("\nMasukkan sisi atas trapesium : ");
            double a = scan.nextDouble();
            System.out.print("Masukkan sisi bawah trapesium : ");
            double b = scan.nextDouble();
            System.out.print("Masukkan tinggi trapesium : ");
            double t = scan.nextDouble();
            calc.setTrapezoid(a, b, t);
            calc.run();
            System.out.println("\nHasil Trapesium: " + calc.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption not availaible");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error : Input must be number====");
        scan.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scan.close();
  }
}