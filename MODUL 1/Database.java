import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    public void insertMenu(menu){
        listMenu.add(menu);
    }
    // TODO Create Method to Insert Menu to Database
    public void showMenu() {
        System.out.println("Menu :");
        System.out.println("================");
        for (int i = 0; i < listMenu.size(); i++2){
            System.out.println((i+1)+ "."+listMenu.get(i).name + ("("listMenu.get(i).Category +") Rp.("+listMenu.get(i).Price +"\n")"));

        }
    }
    // TODO Create Method to Show Menu from Database
        
    // TODO Create Method to Search Menu from Database


}
