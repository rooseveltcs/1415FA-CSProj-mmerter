package learningSwingUi;
//packages it all together, I think.
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
//imports

public class learningSwingUi {
	//the frame that holds everything
   private JFrame mainFrame;
   //text fields for the user's input
   private JTextField headerLabel;
   private JTextField statusLabel;
   //labels to display errors and results of succseful operations.
   private JLabel errorLabel;
   private JLabel placeholderLabel;
   private JLabel resultLabel;
   //panel that holds things inside the frame
   private JPanel controlPanel;

   //prepares the gui - why do I need this?
   public learningSwingUi(){
      prepareGUI();
   }
   
   public static void main(String[] args){
	   learningSwingUi swingTest = new learningSwingUi();
      swingTest.showActionListenerDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Java Learning Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(0, 3));

      headerLabel = new JTextField();
      statusLabel = new JTextField();
      resultLabel = new JLabel("result here");
      placeholderLabel = new JLabel("place held");
      errorLabel = new JLabel("You done goofed");
      

      //statusLabel.setSize(100,100);
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
      mainFrame.add(resultLabel);
      mainFrame.add(placeholderLabel);
      mainFrame.add(errorLabel);
   }

   private void showActionListenerDemo(){
      headerLabel.setText("Adding in Swing");      

      JPanel panel = new JPanel();      
      panel.setBackground(Color.cyan);		
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
