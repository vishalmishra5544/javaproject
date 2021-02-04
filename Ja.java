import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ja{

	private JFrame frame;
	private JTextField jtxtName;
	private JTextField jtxtaddress;
	private JTextField jtxtRollno;
	private JTextField jtxtBranch;
	private JTextField jtxtClass;
	private JTextField jtxtD;
	private JTextField jtxtPhysics;
	private JTextField jtxtChemistry;
	private JTextField jtxtM;
	private JTextField jtxtBee;
	private JTextField jtxtProgramming;
	private JTextField jtxtScore;
	private JTextField jtxtP;
	private JTextField jtxtR;
	private JTextField jtxtGender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ja window = new Ja();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBorder(new LineBorder(Color.GREEN, 12));
		panel.setBounds(10, 0, 826, 459);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(365, 25, 0, 2);
		panel.add(separator);
		
		jtxtName = new JTextField();
		jtxtName.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtName.setBounds(140, 92, 203, 35);
		panel.add(jtxtName);
		jtxtName.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(120, 195, 67, -33);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(60, 107, 39, -25);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(47, 113, 52, -19);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(73, 84, 100, -19);
		panel.add(separator_4);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(25, 82, 140, 55);
		panel.add(lblNewLabel);
		
		JLabel lblRollNo = new JLabel("Roll No:");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRollNo.setBounds(25, 130, 140, 55);
		panel.add(lblRollNo);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBranch.setBounds(25, 175, 140, 55);
		panel.add(lblBranch);
		
		JLabel lblCollege = new JLabel("Class:");
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCollege.setBounds(25, 220, 140, 55);
		panel.add(lblCollege);
		
		jtxtaddress = new JTextField();
		jtxtaddress.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtaddress.setColumns(10);
		jtxtaddress.setBounds(140, 375, 203, 61);
		panel.add(jtxtaddress);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAddress.setBounds(25, 365, 140, 55);
		panel.add(lblAddress);
		
		jtxtRollno = new JTextField();
		jtxtRollno.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtRollno.setColumns(10);
		jtxtRollno.setBounds(140, 142, 203, 35);
		panel.add(jtxtRollno);
		
		jtxtBranch = new JTextField();
		jtxtBranch.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtBranch.setColumns(10);
		jtxtBranch.setBounds(140, 185, 203, 35);
		panel.add(jtxtBranch);
		
		jtxtClass = new JTextField();
		jtxtClass.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtClass.setColumns(10);
		jtxtClass.setBounds(140, 230, 203, 35);
		panel.add(jtxtClass);
		
		JLabel lblDob = new JLabel("D.O.B:");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDob.setBounds(25, 265, 140, 55);
		panel.add(lblDob);
		
		jtxtD = new JTextField();
		jtxtD.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtD.setColumns(10);
		jtxtD.setBounds(140, 275, 203, 35);
		panel.add(jtxtD);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPhysics.setBounds(365, 82, 140, 55);
		panel.add(lblPhysics);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChemistry.setBounds(365, 113, 140, 55);
		panel.add(lblChemistry);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMaths.setBounds(365, 160, 140, 55);
		panel.add(lblMaths);
		
		JLabel lblBee = new JLabel("B.E.E");
		lblBee.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBee.setBounds(365, 195, 140, 55);
		panel.add(lblBee);
		
		JLabel lblProgramming = new JLabel("Programming:");
		lblProgramming.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblProgramming.setBounds(365, 233, 210, 55);
		panel.add(lblProgramming);
		
		JLabel lblTotalScore = new JLabel("Total score:");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalScore.setBounds(365, 282, 140, 55);
		panel.add(lblTotalScore);
		
		jtxtPhysics = new JTextField();
		jtxtPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtPhysics.setColumns(10);
		jtxtPhysics.setBounds(515, 92, 203, 30);
		panel.add(jtxtPhysics);
		
		jtxtChemistry = new JTextField();
		jtxtChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtChemistry.setColumns(10);
		jtxtChemistry.setBounds(515, 130, 203, 30);
		panel.add(jtxtChemistry);
		
		jtxtM = new JTextField();
		jtxtM.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtM.setColumns(10);
		jtxtM.setBounds(515, 172, 203, 30);
		panel.add(jtxtM);
		
		jtxtBee = new JTextField();
		jtxtBee.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtBee.setColumns(10);
		jtxtBee.setBounds(515, 210, 203, 30);
		panel.add(jtxtBee);
		
		jtxtProgramming = new JTextField();
		jtxtProgramming.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtProgramming.setColumns(10);
		jtxtProgramming.setBounds(515, 245, 203, 30);
		panel.add(jtxtProgramming);
		
		jtxtScore = new JTextField();
		jtxtScore.setEnabled(false);
		jtxtScore.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtScore.setColumns(10);
		jtxtScore.setBounds(515, 290, 203, 35);
		panel.add(jtxtScore);
		
		JLabel lblPercentage = new JLabel("Percentage(%):");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPercentage.setBounds(365, 337, 140, 55);
		panel.add(lblPercentage);
		
		jtxtP = new JTextField();
		jtxtP.setEnabled(false);
		jtxtP.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtP.setColumns(10);
		jtxtP.setBounds(515, 343, 203, 35);
		panel.add(jtxtP);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGender.setBounds(25, 310, 140, 55);
		panel.add(lblGender);
		
		JLabel lblRanking = new JLabel("Ranking:");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRanking.setBounds(365, 367, 140, 55);
		panel.add(lblRanking);
		
		jtxtR = new JTextField();
		jtxtR.setEnabled(false);
		jtxtR.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtR.setColumns(10);
		jtxtR.setBounds(515, 388, 203, 35);
		panel.add(jtxtR);
		
		jtxtGender = new JTextField();
		jtxtGender.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtGender.setColumns(10);
		jtxtGender.setBounds(140, 320, 203, 35);
		panel.add(jtxtGender);
		
		JLabel lblNewLabel_1 = new JLabel("Student Marksheet Generator");
		lblNewLabel_1.setForeground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(259, 39, 399, 43);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Atharva College of Engineering");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(237, 10, 462, 36);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.GREEN, 12));
		panel_1.setBackground(new Color(153, 255, 255));
		panel_1.setBounds(844, 0, 582, 459);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(419, 17, -236, 284);
		panel_1.add(textArea);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setBounds(25, 46, 529, 352);
		panel_1.add(jtxtTranscript);
		
		JLabel lblNewLabel_3 = new JLabel("Student Marksheet");
		lblNewLabel_3.setForeground(new Color(0, 204, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(165, 17, 331, 25);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Developers-Vishal,kalpesh,Aniket");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(125, 410, 371, 39);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GREEN, 12));
		panel_2.setBackground(new Color(153, 255, 255));
		panel_2.setBounds(20, 469, 1416, 68);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R=new double[14];
				R[0]=Double.parseDouble(jtxtPhysics.getText());
				R[1]=Double.parseDouble(jtxtChemistry.getText());
				R[2]=Double.parseDouble(jtxtM.getText());
				R[3]=Double.parseDouble(jtxtBee.getText());
				R[4]=Double.parseDouble(jtxtProgramming.getText());
				R[5]=(R[0]+R[1]+R[2]+R[3]+R[4]);
				R[6]=(R[0]+R[1]+R[2]+R[3]+R[4])/5;
				String Total =String.format("%.0f",R[5]);
				jtxtScore.setText(Total);
				String Per =String.format("%.0f",R[6]);
				jtxtP.setText(Per);
				//Ranking
				if(R[6]>=75) {
					jtxtR.setText("Distinction");
				}
				else if((R[6]<75)&&(R[6]>=60)) {
					jtxtR.setText("1st class");
				}
				else if((R[6]<60)&&(R[6]>=50)) {
					jtxtR.setText("2nd class");
				}
				else if((R[6]<50)&&(R[6]>=40)) {
					jtxtR.setText("3rd class");
				}
				else if((R[6]<40)&&(R[6]>=35)) {
					jtxtR.setText("Just Passed");
				}
				else if(R[6]<35) {
					jtxtR.setText("Failed");
				}
				
				
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnResult.setBounds(36, 23, 163, 27);
		panel_2.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Marksheet \t\t\n"
				+"********************************************\n"
				+"\nName:\t\t"+jtxtName.getText()
				+"\nRoll.no:\t\t"+jtxtRollno.getText()
				+"\nD.O.B:\t\t"+jtxtD.getText()
				+"\nGender:\t\t"+jtxtGender.getText()
				+"\nBranch:\t\t"+jtxtBranch.getText()
				+"\nClass:\t\t"+jtxtClass.getText()
				+"\nAddress:\t\t"+jtxtaddress.getText()
				+"\nPhysics:\t\t"+jtxtPhysics.getText()
				+"\nChemistry:\t\t"+jtxtChemistry.getText()
				+"\nMaths:\t\t"+jtxtM.getText()
				+"\nB.E.E:\t\t"+jtxtBee.getText()
				+"\nProgramming:\t\t"+jtxtProgramming.getText()
				+"\nTotal Score:\t\t"+jtxtScore.getText()
				+"\nPercentage:\t\t"+jtxtP.getText()
				+"\nRanking:\t\t"+jtxtR.getText()	
				+"\n********************************************\n"
				
				);
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTranscript.setBounds(333, 23, 163, 27);
		panel_2.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header=new MessageFormat("Printing in Progress");
				MessageFormat footer=new MessageFormat("Page {0,number,integer}");
				try
				{
					
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev){
					System.err.format("No Printer found",ev.getMessage()); 
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPrint.setBounds(636, 23, 163, 27);
		panel_2.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
				
				jtxtTranscript.setText(null);
				
				jtxtaddress.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(941, 23, 163, 27);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Studet Result System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(1214, 21, 163, 29);
		panel_2.add(btnExit);
	}
}
