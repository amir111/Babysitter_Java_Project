package babysitter;
import java.util.*;
import java.io.*;
import java.util.Scanner;



public class GuardianProfile{
    private String comments; 
    private int rating; 
    private int age; 
    private String bio; 
    private int uNumber; 
    private String uName; 
    private String pWord; 
    private int pWage;
    private String name;
    private String town;
    static StringBuffer sb = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in);
    static StringBuffer stringBufferOfData = new StringBuffer();
    private static boolean readFile() {
         System.out.println("Please enter your profile name : ");
        filename = sc.nextLine();
        Scanner fileToRead = null;
        try {
            fileToRead = new Scanner(new File(filename)); 
            
            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {
                System.out.println(line);
                stringBufferOfData.append(line).append("\r\n");
            }
            fileToRead.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("The profile " + filename + " not found! " + ex.getMessage());
            return false;
        } finally {
            fileToRead.close();
            return true;
        }
    }
    
    private static void writeToFile() {
        try {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());
            bufwriter.close();
        } catch (Exception e) {
            System.out.println("Error occured while attempting to write to your profile: " + e.getMessage());
        }
    }
    private static void replacement() {
        System.out.println("Please enter the contents of a line you would like to edit: ");
        String lineToEdit = sc.nextLine();
        System.out.println("Please enter the the replacement text: ");
        String replacementText = sc.nextLine();
        
        int startIndex = stringBufferOfData.indexOf(lineToEdit);
        int endIndex = startIndex + lineToEdit.length();
        stringBufferOfData.replace(startIndex, endIndex, replacementText);
        System.out.println("Here is the your new edited profile:\n" + stringBufferOfData); 
    }

    public GuardianProfile( int age, String bio, int uNumber, 
            String uName, int pWord) {
        

        this.age = age;
        this.bio = bio;
        this.uNumber = uNumber;
        this.uName = uName;
        
    }

    GuardianProfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getuNumber() {
        return uNumber;
    }

    public void setuNumber(int uNumber) {
        this.uNumber = uNumber;
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

    public int getpWage() {
        return pWage;
    }

    public void setpWage(int pWage) {
        this.pWage = pWage;
    }
    
    public String toString() {
                String result;
                result = "password: " + pWord + "  User Name: " + uName + 
                        "address" +town
                          +"guardian info" + bio + "Number: " + uNumber
                             + " ratings " + rating + " comments " + comments;
                return result;
        }
    
    public static void UIguardian()throws IOException{
   int x = 0;
   int menuChoice = -1;
   GuardianProfile[] guardians = new GuardianProfile[5]; 
   
   Scanner input = new Scanner (System.in);
   do{
       System.out.println("\t\t\tGuardian Profile Menu");
       System.out.println("\n\n1. Create profile\n2. Edit or view profile \n3."
               + " View and match reviews "
               + "\n4. Write reviews \n5. Exit");
       System.out.println("Enter a choice: ");
       menuChoice = input.nextInt();

       if (menuChoice==1){
           if(x < 5) { 
               System.out.println("please enter profile name");
               String profilename =input.next();
                PrintWriter outputfile= new PrintWriter(profilename);
                
                System.out.println("user name:");
                String uName = input.next();     
                outputfile.println(uName);
                
                System.out.println("password:");
                int pWord = input.nextInt();
                outputfile.println(pWord);
               
               System.out.println("age:");
               int age = input.nextInt();
               outputfile.println(age);
               
               System.out.println("profile info:");
               String bio = input.next();
               outputfile.println(bio);
               
               System.out.println("phone number:");
               int uNumber = input.nextInt();
               outputfile.println(uNumber);
               
               String contents = input.next();
               outputfile.println(contents);
               outputfile.close();
               
               GuardianProfile g = new GuardianProfile ( age,  bio, uNumber, 
                       uName, pWord);

               
               guardians[x] = g;

               
               x++;
               
           } 
       }
       else if (menuChoice==2) {
           
            
        boolean fileRead = readFile();
        if (fileRead) {
            replacement();
            writeToFile();
        }
           
       }
       else if (menuChoice==3){
           
            
           System.out.println("Enter the years of experiance");
           int exper = sc.nextInt();
           String H;
           String A;
           
           for (int i=0; i<x; i++) {
               GuardianProfile g = guardians[i];
             if (exper==5){
             System.out.println(" Current avilable babysitters has 5 years experiance \n" +
          
                  "First Name : Abeer\n" +
                  "Last Name : Moafa\n" +
                  "experiance : 5 years\n" +
                  "phone number : 223 445 2341 \n" + 
                  "reviews : " + g.getComments()+
                  "\n ratings : " + g.getRating() +
                  "\n" );
             } 
             else{ 
          System.out.println(" Current avilable babysitters\n" +
          
                  "First Name : Hind\n" +
                  "Last Name : Nasir\n" +
                  "experiance : 2 years\n" +
                  "phone number : 223 445 2341 \n" + 
                  "reviews : " + g.getComments()+
                  "\n ratings : " + g.getRating() +
                    "\n" );
             }
           }

       }
     else if (menuChoice==4){
         
         for (int i=0; i<x; i++) {
             
               GuardianProfile g = guardians[i];
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter Name of babysitter");
		String name = br.readLine();
                
                System.out.println ("rate babysitter from 1 to 6 ");
		int rate = Integer.parseInt(br.readLine());
                g.setRating(rate);
                System.out.println ("write review" );
		String review = br.readLine();
                 g.setComments(review);
         }  
      }
       else if(menuChoice < 1 || menuChoice > 5){
           System.out.println(" option error , please enter again 1, 2, 3, 4,"
                   + " or 5");
       }
   } while (menuChoice != 5);

   
   input.close();
    }
    
   /* public static void main(String[] args) throws IOException {
        UIguardian();
 }*/
}