package SqlProject;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.sql.*;
import java.sql.Statement;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;





public class GUI extends JFrame  {
	private static DefaultTableModel dtm = new DefaultTableModel();
		
	
			private JFrame frame;

			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUI window = new GUI();
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
			public GUI() {
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			
			private void initialize() {

				frame = new JFrame();
				frame.setBounds(200, 100, 900, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 40, 870, 400);
				
				JTable table= new JTable();
				table.setBounds(10, 40, 880, 400);
				scrollPane.setViewportView(table);
				frame.getContentPane().add(scrollPane);

				
				String[] combolist =new String[]
						{"","projects","engineers","softarea","mailstones","grades","devstage","phones","tools"
						,"projecttoengineers","most interesting","less interesting","current month mailstones"
						,"project devstage and tools","busiest engineers"};
				
				JComboBox comboBox = new JComboBox(combolist);
				comboBox.setBounds(10, 11, 180, 25);
				frame.getContentPane().add(comboBox);
				comboBox.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						switch((String)comboBox.getSelectedItem()){
						case "projects":
							dtm=Sql.TableFromDatabase("projects");
							table.setModel(dtm);
							break;
						case "engineers":
							dtm=Sql.TableFromDatabase("engineers");
							table.setModel(dtm);
							break;
						case "softarea":
							dtm = Sql.TableFromDatabase("softarea");
							table.setModel(dtm);
							break;
						case "mailstones":
							dtm = Sql.TableFromDatabase("mailstones");
							table.setModel(dtm);
							break;
						case "grades":
							dtm = Sql.TableFromDatabase("grades");
							table.setModel(dtm);
							break;
						case "devstage":
							dtm = Sql.TableFromDatabase("devstage");
							table.setModel(dtm);
							break;
						case "phones":
							dtm = Sql.TableFromDatabase("phones");
							table.setModel(dtm);
							break;
						case "tools":
							dtm = Sql.TableFromDatabase("tools");
							table.setModel(dtm);
							break;
						case "projecttoengineers":
							dtm = Sql.TableFromDatabase("projecttoengineers");
							table.setModel(dtm);
							break;
						case "most interesting":
							dtm = Sql.TableFromDatabase("most interesting");
							table.setModel(dtm);
							break;
						case "less interesting":
							dtm = Sql.TableFromDatabase("less interesting");
							table.setModel(dtm);
							break;
						case "current month mailstones":
							dtm = Sql.TableFromDatabase("current month mailstones");
							table.setModel(dtm);
							break;
						case "project devstage and tools":
							dtm = Sql.TableFromDatabase("project devstage and tools");
							table.setModel(dtm);
							break;
						case "busiest engineers":
							dtm = Sql.TableFromDatabase("busiest engineers");
							table.setModel(dtm);
							break;
						}
					}});
				JButton Insert = new JButton("Insert");
				Insert.setBounds(200, 10, 100, 25);
				frame.getContentPane().add(Insert);
				Insert.addActionListener(new ActionListener() {
					
					@Override
					
					public void actionPerformed(ActionEvent e) {
						
						switch((String)comboBox.getSelectedItem()){
						case "projects":
							PopUp.InsertProjects();
							break;
						case "engineers":
							PopUp.InsertEngineers();
							break;
						case "softarea":
							PopUp.InsertSoftarea();
							break;
						case "mailstones":
							PopUp.InsertMailstones();
							break;
						case "grades":
							PopUp.InsertGrades();
							break;
						case "devstage":
							PopUp.InsertDevstage();
							break;
						case "phones":
							PopUp.InsertPhones();
							break;
						case "tools":
							PopUp.InsertTools();
							break;
						case "projecttoengineers":
							PopUp.InsertProjectToEngineers();
							break;
			            }
					}	
				});
				
				
				JButton Delete = new JButton("Delete");
				Delete.setBounds(440, 10, 100, 25);
				frame.getContentPane().add(Delete);
				Delete.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						String name = JOptionPane.showInputDialog(Delete, "insert primery key to delete");
						Sql.DeleteFromDataBase(name,(String)comboBox.getSelectedItem());
						
					}
				});
				
				
				
				JButton Update = new JButton("Update");
				Update.setBounds(320, 10, 100, 25);
				frame.getContentPane().add(Update);
				Update.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						switch((String)comboBox.getSelectedItem()){
						case "projects":
							PopUp.UpdateProjects();
							break;
						case "engineers":
							PopUp.UpdateEngineers();
							break;
						case "softarea":
							PopUp.UpdateSoftarea();
							break;
						case "mailstones":
							PopUp.UpdateMailstones();
							break;
						case "grades":
							PopUp.UpdateGrades();
							break;
						case "devstage":
							PopUp.UpdateDevstage();
							break;
						case "phones":
							PopUp.UpdatePhones();
							break;
						case "tools":
							PopUp.UpdateTools();
							break;
						case "projecttoengineers":
							PopUp.UpdateProjectToEngineers();
							break;
			            }
						
					}
				});

				
				
				
	}

}


