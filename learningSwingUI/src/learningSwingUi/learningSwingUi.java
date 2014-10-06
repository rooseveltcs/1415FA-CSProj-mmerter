package learningSwingUi;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class learningSwingUi {
   private JFrame mainFrame;
   private JTextField headerLabel;
   private JTextField statusLabel;
   private JLabel errorLabel;
   private JLabel resultLabel;
   private JPanel controlPanel;

   public learningSwingUi(){
      prepareGUI();
   }

   public static void main(String[] args){
	   learningSwingUi  swingTest = new learningSwingUi();	
      swingTest.showActionListenerDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Java Learning Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(0, 2));

      headerLabel = new JTextField();
      statusLabel = new JTextField();

      statusLabel.setSize(50,25);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showActionListenerDemo(){
      headerLabel.setText("Adding in Swing");      

      JPanel panel = new JPanel();      
      panel.setBackground(Color.black);            
		
      JButton okButton = new JButton("Add the numbers!");

      okButton.addActionListener(new CustomActionListener());        
      panel.add(okButton);
      controlPanel.add(panel);
      mainFrame.setVisible(true); 
   }
   
   class CustomActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          //errorLabel.setText("where am i");
    	  //String text = textField.getText();
          //textArea.append(text + newline);
          //textField.selectAll();

      }
   }	
}
