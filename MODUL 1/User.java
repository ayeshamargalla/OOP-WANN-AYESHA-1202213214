public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String nama;
    int nomor;

    public void setName(String nama){
        this.nama = nama;
    }

    public void NoHandphone(int nomor){
        this.nomor = nomor;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(){
        System.out.println("Register Success");
        System.out.println("Nama : "+nama);
        System.out.println("No. Handphone : "+nomor);
    }

}
