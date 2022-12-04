public class Handphone {
    protected boolean fingerprint;
    String drive;
    int ram;
    double processor;

    public Handphone(boolean fingerprint, String drive, int ram, double processor){
        this.fingerprint = fingerprint;
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        if(fingerprint==false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
        else if(fingerprint==true){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini memiliki Fingerprint");
        }
    }
    
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }

    public void kirimSMS(double no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
}
