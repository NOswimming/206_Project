package MockGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_URL;
	private JTextField textField_Filename;
	private JTextField textField_FileChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		Border borderBlackLine = BorderFactory.createLineBorder(Color.black);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel tabPanel_AddMedia = new JPanel();
		tabbedPane.addTab("Add Media", null, tabPanel_AddMedia, null);
		tabPanel_AddMedia.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Center = new JPanel();
		tabPanel_AddMedia.add(panel_Center, BorderLayout.CENTER);
		
		JPanel panel_North = new JPanel();
		panel_North.setBackground(Color.RED);
		tabPanel_AddMedia.add(panel_North, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_North.add(lblNewLabel_2);
		
		JPanel panel_South = new JPanel();
		panel_South.setBackground(Color.BLUE);
		tabPanel_AddMedia.add(panel_South, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_South.add(lblNewLabel_3);
		panel_Center.setLayout(new BoxLayout(panel_Center, BoxLayout.X_AXIS));
		
		JPanel panel_CenterLeft = new JPanel();
		panel_CenterLeft.setBackground(Color.GREEN);
		panel_CenterLeft.setLayout(new BoxLayout(panel_CenterLeft, BoxLayout.Y_AXIS));
		panel_CenterLeft.setMinimumSize(new Dimension(350, 400));
		panel_CenterLeft.setPreferredSize(new Dimension(350, 600));
		
		JScrollPane scrollPane_CentreLeft = new JScrollPane(panel_CenterLeft);
		scrollPane_CentreLeft.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_Center.add(scrollPane_CentreLeft);
		
		Download d1 = new Download();
		panel_CenterLeft.add(d1);
		
		Download d2 = new Download();
		panel_CenterLeft.add(d2);
		
		Download d3 = new Download();
		panel_CenterLeft.add(d3);
		
		Download d4 = new Download();
		panel_CenterLeft.add(d4);
		
		JButton btnNewButton = new JButton("New button");
		panel_CenterLeft.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_CenterLeft.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_CenterLeft.add(btnNewButton_2);
		
		JPanel panel_CenterRight = new JPanel();
		panel_CenterRight.setBackground(Color.ORANGE);
		panel_CenterRight.setLayout(new BoxLayout(panel_CenterRight, BoxLayout.Y_AXIS));
		panel_CenterRight.setMinimumSize(new Dimension(400, 400));
		panel_CenterRight.setPreferredSize(new Dimension(400, 600));
		panel_Center.add(panel_CenterRight);
		
		JPanel panel_ImportOptions = new JPanel();
		panel_ImportOptions.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_CenterRight.add(panel_ImportOptions);
		panel_ImportOptions.setLayout(new BoxLayout(panel_ImportOptions, BoxLayout.Y_AXIS));
		
		JLabel lbl_Import = new JLabel("Import From File");
		lbl_Import.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_ImportOptions.add(lbl_Import);
		
		JPanel panel_FileChooser = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_FileChooser.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_FileChooser.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_ImportOptions.add(panel_FileChooser);
		panel_FileChooser.setMinimumSize(new Dimension(400, 35));
		panel_FileChooser.setMaximumSize(new Dimension(400, 35));
		panel_FileChooser.setPreferredSize(new Dimension(2000, 40));
		
		JLabel lbl_File = new JLabel("File:");
		lbl_File.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_FileChooser.add(lbl_File);
		
		textField_FileChooser = new JTextField();
		panel_FileChooser.add(textField_FileChooser);
		textField_FileChooser.setColumns(20);
		
		JButton button_FileChooser = new JButton("...");
		panel_FileChooser.add(button_FileChooser);
		
		JButton btn_Import = new JButton("Import");
		panel_FileChooser.add(btn_Import);
		
		JPanel panel_NewDownload = new JPanel();
		panel_NewDownload.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_CenterRight.add(panel_NewDownload);
		panel_NewDownload.setLayout(new BoxLayout(panel_NewDownload, BoxLayout.Y_AXIS));
		
		JLabel label_NewDownload = new JLabel("New Download");
		label_NewDownload.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_NewDownload.setHorizontalAlignment(SwingConstants.CENTER);
		panel_NewDownload.add(label_NewDownload);
		
		Dimension dim_NewDownloadPanelsMin = new Dimension(400, 35);
		Dimension dim_NewDownloadPanelsMax = new Dimension(2000, 40);
		Dimension dim_NewDownloadPanelsPref = new Dimension(400, 35);
		
		JPanel panel_URL = new JPanel();
		panel_URL.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_NewDownload.add(panel_URL);
		panel_URL.setBorder(null);
		panel_URL.setMinimumSize(dim_NewDownloadPanelsMin);
		panel_URL.setMaximumSize(dim_NewDownloadPanelsMax);
		panel_URL.setPreferredSize(dim_NewDownloadPanelsPref);
		panel_URL.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lbl_URL = new JLabel("URL:",JLabel.TRAILING);
		panel_URL.add(lbl_URL);
		lbl_URL.setLabelFor(textField_URL);
		
		textField_URL = new JTextField();
		panel_URL.add(textField_URL);
		textField_URL.setColumns(20);
		
		JPanel panel_Filename = new JPanel();
		panel_Filename.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_NewDownload.add(panel_Filename);
		panel_Filename.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_Filename.setMinimumSize(dim_NewDownloadPanelsMin);
		panel_Filename.setMaximumSize(dim_NewDownloadPanelsMax);
		panel_Filename.setPreferredSize(dim_NewDownloadPanelsPref);
		
		
		JLabel lbl_FileName = new JLabel("File Name:",JLabel.TRAILING);
		panel_Filename.add(lbl_FileName);
		lbl_FileName.setLabelFor(textField_Filename);
		
		textField_Filename = new JTextField();
		panel_Filename.add(textField_Filename);
		textField_Filename.setColumns(20);
		
		JPanel panel_OpenSourceRadioBtn = new JPanel();
		panel_OpenSourceRadioBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_NewDownload.add(panel_OpenSourceRadioBtn);
		panel_OpenSourceRadioBtn.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_OpenSourceRadioBtn.setMinimumSize(dim_NewDownloadPanelsMin);
		panel_OpenSourceRadioBtn.setMaximumSize(dim_NewDownloadPanelsMax);
		panel_OpenSourceRadioBtn.setPreferredSize(dim_NewDownloadPanelsPref);
		
		JRadioButton rdbtn_OpenSource = new JRadioButton("Open Source?");
		panel_OpenSourceRadioBtn.add(rdbtn_OpenSource);
		
		JPanel panel_DownloadBtn = new JPanel();
		panel_DownloadBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_NewDownload.add(panel_DownloadBtn);
		panel_DownloadBtn.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_DownloadBtn.setMinimumSize(dim_NewDownloadPanelsMin);
		panel_DownloadBtn.setMaximumSize(dim_NewDownloadPanelsMax);
		panel_DownloadBtn.setPreferredSize(dim_NewDownloadPanelsPref);
		
		JButton btnDownload = new JButton("Download");
		panel_DownloadBtn.add(btnDownload);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_CenterRight.add(verticalGlue);
		
		JPanel tabPanel_Editor = new JPanel();
		tabbedPane.addTab("Editor", null, tabPanel_Editor, null);
		
		JPanel panel_Left = new JPanel();
		
		JPanel panel_Right = new JPanel();
		
		JSplitPane splitPane_Editor = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel_Left,panel_Right);
		panel_Left.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_Left.add(lblNewLabel, BorderLayout.NORTH);
		
		Player  p1 = new Player();
		panel_Right.add(p1);
		
		tabPanel_Editor.setLayout(new BorderLayout(0, 0));
		tabPanel_Editor.add(splitPane_Editor);
		
		JPanel tabPanel_Export = new JPanel();
		tabbedPane.addTab("Export", null, tabPanel_Export, null);
		tabPanel_Export.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_ExportLeft = new JPanel();
		JPanel panel_ExportRight = new JPanel();
		
		JSplitPane splitPane_Export = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel_ExportLeft, panel_ExportRight);
		tabPanel_Export.add(splitPane_Export);
		
		splitPane_Export.setLeftComponent(panel_ExportLeft);
		panel_ExportLeft.setLayout(new BorderLayout(0, 0));
		
		Player  p2 = new Player();
		panel_ExportLeft.add(p2);
		
		splitPane_Export.setRightComponent(panel_ExportRight);
		
		JLabel label = new JLabel("New label");
		panel_ExportRight.add(label);
		
		
	}
}