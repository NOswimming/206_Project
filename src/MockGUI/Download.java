package MockGUI;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Component;

import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.CompoundBorder;

public class Download extends JPanel {
	
	public Dimension MinimumSize = new Dimension(300,90);
	public Dimension MaximumSize = new Dimension(2000,90);
	public Dimension PreferedSize = new Dimension(300,90);

	/**
	 * Create the panel.
	 */
	public Download() {
		setMinimumSize(MinimumSize);
		setMaximumSize(MaximumSize);
		setPreferredSize(PreferedSize);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		Border empty = BorderFactory.createEmptyBorder(5,10,5,10);
		Border compound = new CompoundBorder(empty, blackline);
		setBorder(new CompoundBorder(compound, empty));
		
		JLabel lbl_Filename = new JLabel("Filename");
		add(lbl_Filename);
		
		JLabel lbl_URL = new JLabel("URL");
		add(lbl_URL);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(progressBar);
		
		JButton btn_CancelResume = new JButton("Cancel");
		add(btn_CancelResume);

	}

}
