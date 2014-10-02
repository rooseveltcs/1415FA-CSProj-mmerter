import javax.swing.*;

public class learningSwingUi {
	
	private static void makeGui() {

        JFrame frame = new JFrame("thisisaframe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //adds a label
        JLabel label = new JLabel("This is a test");
        frame.getContentPane().add(label);
        
        JButton Button = new JButton("button");
        frame.getContentPane().add(Button);
        
        //display ze window
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
    //    javax.swing.SwingUtilities.invokeLater(new Runnable() {
           // public void run() {
            	makeGui();
         //   }
      //  });
    }
}

