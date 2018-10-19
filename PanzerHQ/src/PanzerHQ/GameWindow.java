/**
 * 
 */
package PanzerHQ;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GameWindow extends JFrame{
    
    public GameWindow() {       
        
        JPanel testPanel = new JPanel();        
        testPanel.setPreferredSize(new Dimension(600, 400));
        
        registerWindowListener();
        createMenu();
                
        add(testPanel);
        pack();
        
        setTitle("PanzerHQ");
        setLocation(10, 10);
        setResizable(false);
        
        setVisible(true);
    }
    
    private void createMenu() {
        
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        JMenu gameMenu = new JMenu("Game");
        JMenu prefMenu = new JMenu("Preferences");
        
        menuBar.add(fileMenu);        
        menuBar.add(gameMenu);        
        menuBar.add(prefMenu);
        
        addFileMenuItems(fileMenu);
    }
    
    private void addFileMenuItems(JMenu fileMenu) {
        
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);  
        quitItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
    }
    
    private void registerWindowListener() {
    	addWindowListener(new WindowAdapter() {
    		@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
    		@Override
			public void windowDeactivated(WindowEvent arg0) {
				// später pausieren einfügen
    		}
		
			@Override
			public void windowActivated(WindowEvent arg0) {
				// Später fortsetzen einfügen
			}
		});
    }
    
    
    
}