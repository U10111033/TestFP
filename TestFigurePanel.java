/**U10111033, Computer science 4, Hsueh_Hsin Lu*/

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class TestFigurePanel extends JFrame {
  public static boolean change = false;
  public TestFigurePanel() {
    FigurePanel myFP = new FigurePanel(FigurePanel.ROUND_RECTANGLE);
	myFP.setFilled(change);
	add(myFP);
  }

  public static void main(String[] args) {

	TestFigurePanel frame = new TestFigurePanel();
    frame.setSize(400, 200);
    frame.setTitle("TestFigurePanel");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
	
	//if input is zero then filled is false, else is true
	Scanner input = new Scanner(System.in);
	if(input.nextInt() == 0)
		change = false;
	else
		change = true;
	}
}