import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class learningSwingUi {

	public learningSwingUi() {
		JFrame frame = new JFrame("first Ui");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new BorderLayout());
		//panel.setLayout
		
		
		
		JButton button = new JButton("button");
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new learningSwingUi();
	}
}
