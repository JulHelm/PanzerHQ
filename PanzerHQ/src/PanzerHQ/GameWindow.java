/**
 * 
 */
package PanzerHQ;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author Teilnehmer
 *
 */
public class GameWindow extends JFrame{

	public GameWindow() {
		JFrame testpanel = new JFrame();
		testpanel.setSize(new Dimension(600, 400));
		add(testpanel);
		pack();
		testpanel.setTitle("PanzerHQ");
		testpanel.setLocation(10, 10);
		testpanel.setResizable(false);
		testpanel.setVisible(true);
	}
}
