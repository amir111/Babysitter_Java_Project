package babysitter;

import babysitter.dataBus;
import babysitter.profile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UI{
    static void systemInitialMenu() throws FileNotFoundException, IOException{ //method displays the initial user menu
        System.out.println("[1]: Sign in." +
                "\n[2]: Create an account. \n[3]: Exit to previous menu");
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
        switch (choice){
            case 1:
                loginMenu();
                break;
            case 2:
                createProfile();
                loginMenu();
                break;
            case 3:
                babysittermainclass root = new babysittermainclass();
                root.mainMenu();
            default:
                System.out.println("\nPlease enter either '1' or '2'!\n");
                systemInitialMenu();
                break;
                
        }
//        babysittermainclass bbcc = new babysittermainclass();
//        bbcc.
    }
    
    static void createProfile() throws FileNotFoundException, IOException{ /*method prompts the babysitter through
                                                                profile creation
                                                                */
        profile np = new profile();
        Scanner kb = new Scanner(System.in);
        System.out.print("Username: ");
        String uname = kb.nextLine();
        dataBus checker = new dataBus();
        if (!checker.profileExists(uname)){
            np.setuName(uname);
            System.out.print("Password: ");
            String upass = kb.nextLine();
            np.setpWord(upass);
            System.out.print("Name: ");
            String name = kb.nextLine();
            np.setName(name);
            System.out.print("Town: ");
            String town = kb.nextLine();
            np.setTown(town);
            System.out.print("Email address: ");
            String emailAddress = kb.nextLine();
            np.setEmail(emailAddress);
            System.out.print("Phone Number: ");
            String phoneNumber = kb.nextLine();
            np.setPhoneNumber(phoneNumber);
            System.out.print("Preferred wage ($/hour): ");
            double wage = kb.nextDouble();
            np.setpWage(wage);
            System.out.print("Age: ");
            int age = kb.nextInt();
            np.setAge(age);
            dataBus db = new dataBus();
            db.setCurrentProfile(np);
            db.storeToFile();
        }
        else{// in the case that a username is taken
            System.out.println("\nThat name already exist.\n Please enter 1 to "
                    + "try again, or press 2 to exit to the previous menu");
            int choice = kb.nextInt();
            switch (choice){
                case 1:
                    createProfile(); //try again
                    break;
                case 2: 
                    systemInitialMenu(); //quit to initial menu
                    break;
            }
            
        }
    }
    
    static void loginMenu() throws FileNotFoundException, IOException{ /*method displays login menu 
        and invokes retrieve of databus to create an operable profile object
        */
        Scanner kb = new Scanner(System.in);
        System.out.println("\nLogin");
        System.out.print("Username: ");
        String uName = kb.nextLine();
        System.out.print("\nPassword: ");
        String uPass = kb.nextLine();
        dataBus pRet = new dataBus();
        if (uPass.equals(pRet.getPassword(uName))){ //checks the files password(the first line)
            dataBus grabber =  new dataBus();
            menu(grabber.retrieveFromFile(uName)); //profile object is recieved and passed to menu
        }
        else{
                System.out.println("\nI'm sorry, that password is not correct\n");
                loginMenu(); // recursivley calls menu if password is incorrect
        }
    }
    
    static void menu(profile currentUser) throws FileNotFoundException, IOException{
        //method displays inner menu
        System.out.println("enter\n[1]: View and edit your information. \n"
                + "[2]: View guardian statistics"
                + ".\n[3]: View reviews of your work and respond. \n[4]:"
                + " logout");
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
        switch(choice){
            case 1: 
                viewPersonalInfo(currentUser); //calls info editor menu
                break;
            case 2:
                guardianStatStub(currentUser); //calls guardian statStub method
                break;
            case 3:
                reviewReview(currentUser); //calls review and response menu
            case 4:
                systemInitialMenu(); //calls initial menu
                break;
        }
    }
    
    static void reviewReview(profile user) throws FileNotFoundException, IOException{
        /*method displays reviews and their response, allows the babysitter to
        submit a repsonse and then redisplays the menu
        */
        System.out.println("The following is what people think of you and how"
                + "you have responded:\n"
                +"[1]: " + user.comments[0] + "\n[reply]: " + user.responses[0]
                +"\n[2]: " + user.comments[1] + "\n[reply]: " + user.responses[1]
                + "\n[3]: " + user.comments[2] + "\n[reply]: " + user.responses[2]
                        + "\n\n enter any of the above to leave a response"
                                + ". Enter [4] to exit back to the main menu:");
        Scanner kb = new Scanner(System.in);
        Scanner skb = new Scanner(System.in);
        int choice = kb.nextInt();
        switch (choice){
            case 1: 
                System.out.println("Please enter a response: ");
                String rsp = skb.nextLine();
                user.responses[0]=rsp;
                reviewReview(user);
                break;  
            case 2:
                System.out.println("Please enter a response: ");
                String rsp1 = skb.nextLine();
                user.responses[1]=rsp1;
                reviewReview(user);
                break;
            case 3:
                System.out.println("Please enter a response: ");
                String rsp2 = skb.nextLine();
                user.responses[2]=rsp2;
                reviewReview(user);
                break;  
            case 4: 
                dataBus bus = new dataBus(user);
                bus.storeToFile();
                menu(user); //exit to menu
        }
    }
    
    static void guardianStatStub(profile user) throws FileNotFoundException, IOException{
        //displays data stub. on full implementation, will access sysAdmins data
        System.out.println("Current number of guardians looking for a "
                + "babysitter in your town: 34 \nAverage age of recently "
                + "employed babysitters: 17\nAverage hourly wage: $10 per "
                + "hour\n\n[1]: Back");
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
        switch(choice){
            case 1: 
                menu(user); //exit to menu
                break;
            default:
                guardianStatStub(user);
                break;
        }
    }
    
    static void viewPersonalInfo(profile user) throws FileNotFoundException, IOException{
        /*
        displays personal info and allows babySitter to select a field and alter 
        it
        */
        System.out.println("select any field which you wish to edit, or enter"
                + "[8] to return:\n[1]: Password: " + user.getpWord() + 
                "\n[2]: Name: " + user.getName() + "\n[3]: Age: " + 
                user.getAge() + "\n[4]: Town: " + user.getTown() + "\n[5]: "
                        + "Prefered Wage: " + user.getpWage() + "\n[6]: "
                                + "Email: " + user.getEmail() + "\n[7]: "
                                        + "Phone Number: " + 
                user.getPhoneNumber() + "\n");
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
        Scanner skb = new Scanner(System.in);
        switch (choice){
            case 1: 
                System.out.println("Please enter your new password: ");
                String pWord = skb.nextLine();
                user.setpWord(pWord);
                viewPersonalInfo(user);
                break;
            case 2:
                System.out.print("Please enter your name: ");
                String name =skb.nextLine();
                user.setName(name);
                viewPersonalInfo(user);
                break;
            case 3:
                System.out.print("Please enter your age: ");
                int age = kb.nextInt();
                user.setAge(age);
                viewPersonalInfo(user);
                break;
            case 4:
                System.out.print("Please enter your town: ");
                String town = skb.nextLine();
                user.setTown(town);
                viewPersonalInfo(user);
                break;
            case 5:
                System.out.print("Please enter your preferred wage: ");
                double wage = kb.nextDouble();
                user.setpWage(wage);
                viewPersonalInfo(user);
                break;
            case 6:
                System.out.print("Please enter your email address: ");
                String edress = skb.nextLine();
                user.setEmail(edress);
                viewPersonalInfo(user);
                break;
            case 7:
                System.out.print("Please enter you phone number: ");
                String pnum = skb.nextLine();
                user.setPhoneNumber(pnum);
                viewPersonalInfo(user);
                break;
            case 8:
                dataBus bus = new dataBus(user);
                bus.storeToFile();
                menu(user);
                break;
        }
    }
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        systemInitialMenu();
//    }
}