package lab42;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;
import java.util.*;

public class Examples extends JFrame {
	
	FlowLayout experimentLayout = new FlowLayout();
	
	public Examples(String name) {
		super(name);
	}
	
	public void addComponentsToPane(final Container pane){
		// create panel
		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		//This value indicates that each row of components should be justified to the trailing edge of the containers oreintation,
		//for example, to the right in left-to-right orientations.
		experimentLayout.setAlignment(FlowLayout.TRAILING);
		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout());
		
		//add buttons to layout
		compsToExperiment.add(new JButton("Button 1"));
		compsToExperiment.add(new JButton("Button 2"));
		compsToExperiment.add(new JButton("Button 3"));
		compsToExperiment.add(new JButton("Long-Named Button 4"));
		compsToExperiment.add(new JButton("5"));
		//Items run left to right top to bottom by default
		compsToExperiment.setComponentOrientation(
				ComponentOrientation.LEFT_TO_RIGHT);
		//process the Apply Component orientation button press
		pane.add(compsToExperiment, BorderLayout.CENTER);
		//The South	layout constraint (bottom of container)
		pane.add(controls, BorderLayout.SOUTH);;
		}
	
	/**
	 * create the GUI and show it. For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI(){
		//create and setup window
		Examples frame = new Examples("LayoutDemo");
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set up the content
		frame.addComponentsToPane(frame.getContentPane());
		
		//display window
		frame.pack();
		frame.setVisible(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Use an appropriate Look and Feel*/
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}catch (IllegalAccessException ex) {
			ex.printStackTrace();
		}catch (InstantiationException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metals use of bold fonts*/
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		//SCHEDUEL A JOB for the event dispatchi thread:
		//creating and showing this applicationsGUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}});
		

		}

}
