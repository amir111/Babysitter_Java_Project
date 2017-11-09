package babysitter;

public class profile{
    public String[] comments = {"good worker",
    "punctual!","not at all reliable"}; //comments attained through accepting jobs
    public String[] responses = {"no response","no response","no response"}; // will be same size as comments array.
    private int rating; //rating. will be x/5
    private int age; //age of babysitter
    private int [][] avail = new int[2][7]; //babysitter availability
    private String uName; // babysitter username
    private String pWord; // babysitter password
    private double pWage;// preferred wage of baby sitter
    private String name;
    private String town;
    private boolean access;
    private String email;
    private String phoneNumber;
    
    public profile() {
    }

//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }


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


    public int [][] getAvail() {
        return avail;
    }

    public void setAvail (int [][] avail) {
        this.avail = avail;
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

    public double getpWage() {
        return pWage;
    }

    public void setpWage(double pWage) {
        this.pWage = pWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public boolean getAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

//    public String getResponses() {
//        return responses;
//    }
//
//    public void setResponses(String responses) {
//        this.responses = responses;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}