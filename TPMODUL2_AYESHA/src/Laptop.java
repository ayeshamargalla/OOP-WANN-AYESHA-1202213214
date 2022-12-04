public class Laptop {
    protected boolean webcam;
    String drive;
    int ram;
    double processor;

    public Laptop(boolean webcam, String drive, int ram, double processor){
        this.webcam = webcam;
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        if(webcam==false){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. Namun, laptop ini tidak memiliki Webcam");
        }
        else if(webcam==true){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki Webcam");
        }
    }
    
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan " + email2 + "\n");
    }
}

