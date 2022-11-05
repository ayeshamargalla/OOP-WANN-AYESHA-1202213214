package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database

        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.Name("Bakso");
        menu1.Category("Makanan");
        menu1.Price(10000);

        Menu menu2 = new Menu();
        menu2.Name("Es Teh");
        menu2.Category("Minuman");
        menu2.Price(5000);

        Menu menu3 = new Menu();
        menu3.Name("Brownies");
        menu3.Category("Dessert");
        menu3.Price(15000);
        // TODO Insert Menu to Database


        // TODO Display Main Menu
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==================================");
        System.out.println("Nama: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("No. Handphone: ");
        Scanner input = new Scanner(System.in);
        String nomor = input.nextInt();
        // TODO Create User
        User info = new User();
        info.setNama(nama);
        info.NoHandphone(nomor);
        info.Register();
        // Display Menu
        System.out.println("1.Menu");
        System.out.println("2.Pilih Menu");
        System.out.println("3.Keluar");
    }
}