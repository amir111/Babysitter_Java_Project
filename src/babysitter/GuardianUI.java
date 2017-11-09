



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysitter;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import javax.swing.*;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileFilter;
import java.sql.SQLException;
import java.awt.Font;

/**
 *
 * @author ahlamhakami
 */
public class GuardianUI {
    /*static JFrame frame1;
    static Container pane;
    static JButton btnConnect, btnDisconnect;
    static JLabel lblServer, lblUsername, lblPassword, lblPort;
    static JTextField txtServer, txtUsername, txtPassword, txtPort;
    static Insets insets;

     
    
    public static void main(String[] args) {
    
        
        new GuardianUI(); 
    }
   public GuardianUI(){
       JFrame guiFrame = new JFrame();
     
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         guiFrame.setTitle("guardian profile");
         

        guiFrame.setSize(600,500);
 
 
        guiFrame.setLocationRelativeTo(null);
        pane = guiFrame.getContentPane();
        insets = pane.getInsets();

 //Options for the JComboBox 
 String[] CustomerCases = {"Create/modify customer  profile", 
     "View matches and reviews:", "  write review "
     };
 
 //Options for the JList
    
    String[] creatingaccount = {"user name", "password", "info" };
    
    String[] profileOptions = {"edit profile", "searching for babaysitter", "ratings" };
     
 
 //The first JPanel contains a JLabel and JCombobox
     final JPanel comboPanel = new JPanel();
     JLabel comboLbl = new JLabel("case:  ");
     JComboBox fruits = new JComboBox(CustomerCases);
 
     comboPanel.add(comboLbl);
     comboPanel.add(fruits);
 
 //Create the second JPanel. Add a JLabel and JList and
 //make use the JPanel is not visible.
 final JPanel listPanel = new JPanel();
 listPanel.setVisible(false);
 JLabel listLbl = new JLabel("Menue:");
 JList vegs = new JList(profileOptions);
 vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
 
 listPanel.add(listLbl);
 listPanel.add(vegs);
 
  JButton SignIn = new JButton( "sign in");
 
 //The ActionListener class is used to handle the
 //event that happens when the user clicks the button.
 //As there is not a lot that needs to happen we can 
 //define an anonymous inner class to make the code simpler.
   SignIn.addActionListener(new ActionListener()
{
 @Override
 public void actionPerformed(ActionEvent event)
 {
 lblUsername = new JLabel ("Username:");
 lblPassword = new JLabel ("Password:");
 lblPort = new JLabel ("info #:");

 txtUsername = new JTextField  (10);
 txtPassword = new JTextField  (10);
 txtPort = new JTextField  (10);


 listPanel.setVisible(!listPanel.isVisible());
 comboPanel.setVisible(!comboPanel.isVisible());

 }
});
 
 //The JFrame uses the BorderLayout layout manager.
 //Put the two JPanels and JButton in different areas.
 guiFrame.add(comboPanel, BorderLayout.NORTH);
 guiFrame.add(listPanel, BorderLayout.CENTER);
 guiFrame.add(SignIn,BorderLayout.SOUTH);
 
 //make sure the JFrame is visible
        guiFrame.setVisible(true);
   }*/
    
}

