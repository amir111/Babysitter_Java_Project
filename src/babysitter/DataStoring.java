/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysitter;

/**
 *
 * @author ahlamhakami
 */
public class DataStoring {
    
    public GuardianProfile currentProfile;
    public DataStoring(GuardianProfile Passenger){
        //initialize dataBus
    }
    public GuardianProfile getCurrentProfile() {
        return currentProfile;
    }
    public void setCurrentProfile(GuardianProfile currentProfile) {
        //set current profile
    }
    void storeToXml(){
        //stores current profile to an xml profile
    }
    void retrieveFromXml(String name){
        //retrieve object data from xml by name
    }
    void storeToList(){
        //stores current profile to a linked list
    }
    void retrieveFromLL(String name){
        /*retrieves a profile from the linked list by name and sets it equal to 
        current profile*/
    }
    void alterProfile(GuardianProfile revised){
        //replaces a given profile with a revised version
    }
    void deleteProfile(String name){
        //deletes given profile by name
    }
    
}

    

