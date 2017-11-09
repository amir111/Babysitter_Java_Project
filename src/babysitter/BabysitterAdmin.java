package babysitter;

/*
Amir Sadiev 
Software Engineering
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabysitterAdmin {

    private String comments; //comments attained through accepting jobs
    private String replies;
    private String bio; //personal bio SHOULDN"T THIS BE BOOLEAN FOR ACCESS? T/F 
    private String uName; // babysitter username
    private String pWord; // babysitter password
    private String name;
    private static int userAccess = 1;

    public BabysitterAdmin(String comments, String replies, String bio, String uName, String pWord, String name, int userAccess) {
        this.comments = comments;
        this.bio = bio;
        this.uName = uName;
        this.pWord = pWord;
        this.name = name;
        this.userAccess = userAccess;
    }

    BabysitterAdmin() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReplies() {
        return replies;
    }

    public void setReplies(String replies) {
        this.replies = replies;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    ////////////////////////////////////////////////////////////////////////////
    private static void deleteReply() {
        System.out.println("Reply deleted");
    }

    private static void deleteReview() {
        System.out.println("Review deleted");
    }

    private static int blockAccess() {
        //make userAccess = 0; 
        return 0;
    }

    private static int allowAccess() {
        //make userAccess = 1; 
        return 1;
    }

    ////////////////////////////////////////////////////////////////////////////
    
    
    public static void adminMenu() throws IOException {
        int x = 0;
        int menuChoice = -1;
        int userAccessMenuChoice = -1;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\t Sys Admin Menu");
            System.out.println("\t 1. View Guardian Accounts "
                    + "\n\t 2. View Babysitters Account "
                    + "\n\t 3. EditUserAccess"
                    + "\n\t 4. View Replies"
                    + "\n\t 5. View Reviews"
                    + "\n\t 6. MakeReplyDeleted"
                    + "\n\t 7. MakeReviewDeleted "
                    + "\n\t 8. View Usage Stats"
                    + "\n\t 9. Exit ");
            System.out.println("Enter your choice: ");

            menuChoice = input.nextInt();

            switch (menuChoice) {
                case 1:
                    //display guardians accounts
                    File file = new File("GaurdianAccounts.txt");
                    try {
                        Scanner sc = new Scanner(file);

                        while (sc.hasNextLine()) {
                            String i = sc.nextLine();
                            System.out.println(i);
                        }
                        System.out.println("\n");
                        sc.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                    break;
                case 2:
                    File filez = new File("BabyAccs.txt");
                    try {

                        Scanner kc = new Scanner(filez);

                        while (kc.hasNextLine()) {
                            String i = kc.nextLine();
                            System.out.println(i);
                        }
                        System.out.println("\n");
                        kc.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                    //display babysitters accounts
                    break;
                case 3:
                    //case 3 will make access 0, thus blocking it
                    // or make acess back to 1, allowing user to do stuff 

                    System.out.println("\t Edit User Access Menu");
                    System.out.println("\t 1. Block User Access "
                            + "\n\t 2. Allow User Access \n\t 3. Exit ");
                    System.out.println("Enter your choice: ");
                    userAccessMenuChoice = input.nextInt();
                    switch (userAccessMenuChoice) {
                        case 1:
                            blockAccess();
                            System.out.println("User has been blocked access");
                            break;
                        case 2:
                            allowAccess();
                            System.out.println("User has been allowed access");
                            break;
                        default:
                            break;
                    }

                    break;
                case 4:
                    //display repies
                    File files = new File("Replies.txt");
                    try {
                        Scanner sc = new Scanner(files);

                        while (sc.hasNextLine()) {
                            String i = sc.nextLine();
                            System.out.println(i);
                        }
                        System.out.println("\n");
                        sc.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                    break;
                case 5:
                    File fileReview = new File("Reviews.txt");
                    try {
                        Scanner sc = new Scanner(fileReview);

                        while (sc.hasNextLine()) {
                            String i = sc.nextLine();
                            System.out.println(i);
                        }
                        System.out.println("\n");
                        sc.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                    break;
                    
                case 6:
                    deleteReply();
                    try {
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Replies.txt", false)));
                        out.println("deleted reply");
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //overwrite a certain part of replies document to "deleted"
                    break;
                case 7: 
                    deleteReview();
                    try {
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Reviews.txt", false)));
                        out.println("deleted review");
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //overwrite a certain part of review document to "deleted"
                    break;
                case 8:
                    //display guardians accounts
                    File fileStats = new File("usageStats.txt");
                    try {
                        Scanner scan = new Scanner(fileStats);

                        while (scan.hasNextLine()) {
                            String i = scan.nextLine();
                            System.out.println(i);
                        }
                        System.out.println("\n");
                        scan.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                    break;
                default:
                    break;
            }

        } while (menuChoice != 9);
        input.close();
    }

}
