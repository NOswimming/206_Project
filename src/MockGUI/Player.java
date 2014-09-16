package MockGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Player extends JPanel {
	
	public Dimension MinimumSize = new Dimension(300,90);
	public Dimension MaximumSize = new Dimension(2000,90);
	public Dimension PreferedSize = new Dimension(300,90);

	/**
	 * Create the panel.
	 */
	public Player() {
		
		setMinimumSize(new Dimension(550, 400));
		setMaximumSize(new Dimension(2000, 1000));
		setPreferredSize(new Dimension(550, 400));
		
		setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel_Video = new JPanel();
		panel_Video.setBackground(Color.DARK_GRAY);
		add(panel_Video, BorderLayout.CENTER);
		
		JPanel panel_VideoControls = new JPanel();
		add(panel_VideoControls, BorderLayout.SOUTH);
		panel_VideoControls.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_VideoControlsEast = new JPanel();
		panel_VideoControls.add(panel_VideoControlsEast, BorderLayout.EAST);
		
		JLabel lbl_Volume = new JLabel("Volume");
		panel_VideoControlsEast.add(lbl_Volume);
		
		JSlider slider_Volume = new JSlider();
		slider_Volume.setValue(100);
		slider_Volume.setPaintTicks(true);
		slider_Volume.setMinorTickSpacing(25);
		slider_Volume.setMaximum(200);
		slider_Volume.setMajorTickSpacing(100);
		panel_VideoControlsEast.add(slider_Volume);
		
		JButton btn_Mute = new JButton("Mute");
		panel_VideoControlsEast.add(btn_Mute);
		
		JPanel panel_VideoControlsWest = new JPanel();
		panel_VideoControls.add(panel_VideoControlsWest, BorderLayout.WEST);
		
		JButton btn_Play = new JButton("Play");
		panel_VideoControlsWest.add(btn_Play);
		
		JButton btn_Rewind = new JButton("RW");
		panel_VideoControlsWest.add(btn_Rewind);
		
		JButton btn_Stop = new JButton("Stop");
		panel_VideoControlsWest.add(btn_Stop);
		
		JButton btn_FastForward = new JButton("FF");
		panel_VideoControlsWest.add(btn_FastForward);

	}

}
