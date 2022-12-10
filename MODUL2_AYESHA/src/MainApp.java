public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir air = new TransportasiAir(1, 20000);
        air.informasi();
        air.berlayar();
        air.berlabuh();

        Sampan sam = new Sampan(1, 20000, 20);
        sam.informasi();
        sam.berlayar();
        sam.berlabuh();
        sam.berlabuh(5);

        Kapal kap = new Kapal(1, 20000, "Tenaga Listrik");
        kap.informasi();
        kap.berlayar();
        kap.berlayar(100);
        kap.berlabuh();
    }
}
