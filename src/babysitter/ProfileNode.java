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
public class ProfileNode{
    private GuardianProfile poData; //profile object data
    private ProfileNode ptrPrevious, ptrNext; //pointers to previous node in the linked list

    public ProfileNode(GuardianProfile poData, ProfileNode ptrPrevious, ProfileNode ptrNext) {
        this.poData = poData;
        this.ptrPrevious = ptrPrevious;
        this.ptrNext = ptrNext;
    }

    public GuardianProfile getPoData() {
        return poData;
    }

    public void setPoData(GuardianProfile poData) {
        this.poData = poData;
    }

    public ProfileNode getPtrPrevious() {
        return ptrPrevious;
    }

    public void setPtrPrevious(ProfileNode ptrPrevious) {
        this.ptrPrevious = ptrPrevious;
    }

    public ProfileNode getPtrNext() {
        return ptrNext;
    }

    public void setPtrNext(ProfileNode ptrNext) {
        this.ptrNext = ptrNext;
    }
    
    
}