import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JSlider;


public class GUI_Mock extends JFrame {
	public GUI_Mock() {
		setTitle("VAMIX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open File...");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmSubtitles = new JMenuItem("Subtitles");
		mnEdit.add(mntmSubtitles);
		
		JMenu mnImport = new JMenu("Import");
		menuBar.add(mnImport);
		
		JMenu mnAudio = new JMenu("Audio");
		mnImport.add(mnAudio);
		
		JMenuItem mntmFromFile = new JMenuItem("From File");
		mnAudio.add(mntmFromFile);
		
		JMenuItem mntmFromWeb = new JMenuItem("From Web");
		mnAudio.add(mntmFromWeb);
		
		JMenu mnVideo = new JMenu("Video");
		mnImport.add(mnVideo);
		
		JMenuItem mntmFromFile_1 = new JMenuItem("From File");
		mnVideo.add(mntmFromFile_1);
		
		JMenuItem mntmFromWeb_1 = new JMenuItem("From Web");
		mnVideo.add(mntmFromWeb_1);
		
		JMenu mnExport = new JMenu("Export");
		menuBar.add(mnExport);
		
		JMenuItem mntmAudio = new JMenuItem("Audio");
		mnExport.add(mntmAudio);
		
		JMenuItem mntmVideo = new JMenuItem("Video");
		mnExport.add(mntmVideo);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmGuideFroUse = new JMenuItem("Guide For Use");
		mnHelp.add(mntmGuideFroUse);
		
		JMenuItem mntmAbout = new JMenuItem("About VAMIX");
		mnHelp.add(mntmAbout);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel VideoPanel = new JPanel();
		VideoPanel.setBackground(Color.DARK_GRAY);
		getContentPane().add(VideoPanel, BorderLayout.CENTER);
		
		JPanel VideoControlPanel = new JPanel();
		getContentPane().add(VideoControlPanel, BorderLayout.SOUTH);
		VideoControlPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel RightPanel = new JPanel();
		VideoControlPanel.add(RightPanel, BorderLayout.EAST);
		
		JLabel lblVolume = new JLabel("Volume");
		RightPanel.add(lblVolume);
		
		JSlider slider = new JSlider();
		slider.setValue(100);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(25);
		slider.setMajorTickSpacing(100);
		slider.setMaximum(200);
		RightPanel.add(slider);
		
		JButton btnMute = new JButton("Mute");
		RightPanel.add(btnMute);
		
		JPanel LeftPanel = new JPanel();
		VideoControlPanel.add(LeftPanel, BorderLayout.WEST);
		
		JButton btnPlayPause = new JButton("Play");
		LeftPanel.add(btnPlayPause);
		
		JButton btnRewind = new JButton("Rewind");
		LeftPanel.add(btnRewind);
		
		JButton btnStop = new JButton("Stop");
		LeftPanel.add(btnStop);
		
		JButton btnFastForward = new JButton("Fast Forward");
		LeftPanel.add(btnFastForward);
		btnPlayPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

}
