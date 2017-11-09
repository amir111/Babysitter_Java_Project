/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysitter;

import static babysitter.GuardianProfile.sc;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class babysittermainclass {
    static void mainMenu() throws FileNotFoundException, IOException {     
        UI bbsttr = new UI();
        GuardianProfile gsitter = new GuardianProfile ();
        BabysitterAdmin ba = new BabysitterAdmin();
        System.out.println("If you are a guadian press 1\nIf you are a babysitter provider press 2\nIf you are an admin press 3");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
                gsitter.UIguardian();
            case 2:
                bbsttr.systemInitialMenu();
            case 3:
                System.out.print("please enter admin key: ");
                Scanner kb = new Scanner(System.in);
                if(kb.nextLine().equals("akey"))
                    ba.adminMenu();
                else
                    System.out.println("nah");;
        }
    }
    public static void main(String[] args) throws IOException {
        mainMenu();
    }
}
