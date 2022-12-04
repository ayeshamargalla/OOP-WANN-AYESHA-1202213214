public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat per = new Perangkat("Toshiba", 3, 2.38);
        per.informasi();

        Laptop lap = new Laptop(true, "HP", 16, 2.48);
        lap.informasi();
        lap.bukaGame("Cooking Mama");
        lap.kirimEmail("ayeshamp03@gmail.com");
        lap.kirimEmail("nadyanovita@gmail.com", "ayeshamp05@gmail.com");

        Handphone han = new Handphone(false, "Trancend", 4, 2.30);
        han.informasi();
        han.telfon(62823277);
        han.kirimSMS(62543900);
        han.kirimSMS(62879405, 92450780);
    }
}
