import java.util.Scanner;

public class project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai Tubes : ");
        int tubes = input.nextInt();
        System.out.print("Nilai Quiz : ");
        int quiz = input.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas = input.nextInt();
        System.out.print("Nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Nilai UAS : ");
        int uas = input.nextInt();

        input.nextLine();

        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        int nim = input.nextInt();

        int total = (int) ((0.3 * tubes) + (0.1 * quiz) + (0.1 * tugas) + (0.25 * uts) + (0.25 * uas));
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Mata Kuliah total : " + total);

    }
}