package LibraryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class BorrowerList extends JFrame {
	private JTable tableStudent;
	private JTable tableTeacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowerList window = new BorrowerList();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BorrowerList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 949, 626);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setBounds(446, 82, 45, 13);
		getContentPane().add(lblStudent);
		
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(446, 298, 58, 13);
		getContentPane().add(lblTeacher);
		
		tableStudent = new JTable();
		tableStudent.setBounds(0, 100, 925, 165);
		getContentPane().add(tableStudent);
		
		tableTeacher = new JTable();
		tableTeacher.setBounds(0, 320, 925, 165);
		getContentPane().add(tableTeacher);
		
		JLabel lblBorrowerList = new JLabel("Borrower List");
		lblBorrowerList.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblBorrowerList.setBounds(373, 10, 194, 35);
		getContentPane().add(lblBorrowerList);
	}
}
