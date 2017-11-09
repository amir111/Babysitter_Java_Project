package babysitter;
import babysitter.profile;
import java.io.*;
import java.util.Scanner;
public class dataBus{
    private profile currentProfile;
    
    public dataBus(){
        
    }
    public dataBus(profile Passenger){
        currentProfile = Passenger;
    }
    public profile getCurrentProfile() {
        return currentProfile;
    }
    public void setCurrentProfile(profile currentProfile) {
        this.currentProfile = currentProfile;
    }
    void storeToFile() throws FileNotFoundException{
        PrintWriter outputFile = new PrintWriter(currentProfile.getuName());
        outputFile.println(currentProfile.getpWord());
        outputFile.println(currentProfile.getuName());
        outputFile.println(currentProfile.getName());
        outputFile.println(currentProfile.getAge());
        outputFile.println(currentProfile.getTown());
        outputFile.println(currentProfile.getpWage());
        outputFile.println(currentProfile.getEmail());
        outputFile.println(currentProfile.getPhoneNumber());
        outputFile.println(currentProfile.getRating());
        outputFile.println(currentProfile.comments[0]);
        outputFile.println(currentProfile.responses[0]);
        outputFile.println(currentProfile.comments[1]);
        outputFile.println(currentProfile.responses[1]);
        outputFile.println(currentProfile.comments[2]);
        outputFile.println(currentProfile.responses[2]);
        outputFile.close();
        
    }
    profile retrieveFromFile(String fname) throws FileNotFoundException{
        /*retrieves data from specified file and constructs an object out of it
        then returns the object
        */
        profile lf = new profile();
        File file = new File(fname);
        file.exists();
        
        Scanner inputFile = new Scanner(file);
        lf.setpWord(inputFile.nextLine());
        lf.setuName(inputFile.nextLine());
        lf.setName(inputFile.nextLine());
        lf.setAge(inputFile.nextInt());
        inputFile.nextLine();
        lf.setTown(inputFile.nextLine());
        lf.setpWage(inputFile.nextDouble());
        inputFile.nextLine();
        lf.setEmail(inputFile.nextLine());
        lf.setPhoneNumber(inputFile.nextLine());
        lf.setRating(inputFile.nextInt());
        inputFile.nextLine();
        lf.comments[0] = inputFile.nextLine();
        lf.responses[0] = inputFile.nextLine();
        lf.comments[1] = inputFile.nextLine();
        lf.responses[1] = inputFile.nextLine();
        lf.comments[2] = inputFile.nextLine();
        lf.responses[2] = inputFile.nextLine();
        return lf;
    }
    String getPassword(String uname) throws FileNotFoundException{
        //finds and returns the password for givn profile
        File file = new File(uname);
        if(file.exists()){
            Scanner inputFile = new Scanner(file);
            return inputFile.nextLine();
        }
        else return "";
    }
    
    boolean profileExists(String name){
        //checks if profile exists by name
        File file = new File(name);
        return file.exists();
    }
    
    void deleteProfile(){
        //deletes given profile by name
    }
}
