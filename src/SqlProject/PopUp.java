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

public class PopUp {
	
	public static String[] values= new String[7]; 
	
	public static void InsertProjects(){
		JPanel fields = new JPanel(new GridLayout(15, 8));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("id",JLabel.LEFT));
		
		JTextField projectname = new JTextField(10);
		projectname .add(new JLabel("name",JLabel.LEFT));
		
		JTextField descrption = new JTextField(10);
		descrption.add(new JLabel("descrption",JLabel.LEFT));
		
		JTextField startdate = new JTextField(10);
		startdate.add(new JLabel("startdate",JLabel.LEFT));
		
		fields.add(projectid);
		fields.add(projectname);
		fields.add(descrption);
		fields.add(startdate);
		
		int result =JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=projectid.getText();
		values[1]=projectname.getText();
		values[2]=descrption.getText();
		values[3]=startdate.getText();
		Sql.InsertDataBase("projects",values);
		

	}
	
	public static void InsertEngineers(){
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField engineername = new JTextField(10);
		engineername .add(new JLabel("engineername",JLabel.LEFT));
		
		JTextField age = new JTextField(10);
		age.add(new JLabel("age",JLabel.LEFT));
		
		JTextField birthdate = new JTextField(10);
		birthdate.add(new JLabel("birthdate",JLabel.LEFT));
		
		JTextField address = new JTextField(10);
		address.add(new JLabel("address",JLabel.LEFT));
		
		JTextField softareaid = new JTextField(10);
		softareaid.add(new JLabel("softareaid",JLabel.LEFT));
		
		
		fields.add(engineerid);
		fields.add(engineername);
		fields.add(age);
		fields.add(birthdate);
		fields.add(address);
		fields.add(softareaid);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=engineerid.getText();
		values[1]=engineername.getText();
		values[2]=age.getText();
		values[3]=birthdate.getText();
		values[4]=address.getText();
		values[5]=softareaid.getText();
		Sql.InsertDataBase("engineers", values);
					
	}
	
	public static void InsertSoftarea(){
		
			JPanel fields = new JPanel(new GridLayout(15, 8));
			JTextField id = new JTextField(10);
			id.add(new JLabel("id",JLabel.LEFT));
			
			JTextField SoftAreaName = new JTextField(10);
			SoftAreaName.add(new JLabel("SoftAreaName",JLabel.LEFT));
			
			JTextField expertise = new JTextField(10);
			expertise.add(new JLabel("expertise",JLabel.LEFT));
			
			
			fields.add(id);
			fields.add(SoftAreaName);
			fields.add(expertise);

			int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			values[0]=id.getText();
			values[1]=SoftAreaName.getText();
			values[2]=expertise.getText();
			Sql.InsertDataBase("softarea",values);
			
	}
	
	public static void InsertMailstones(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField mailstonesid = new JTextField(10);
		mailstonesid.add(new JLabel("mailstonesid",JLabel.LEFT));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField description = new JTextField(10);
		description.add(new JLabel("description",JLabel.LEFT));
		
		JTextField deliverydate = new JTextField(10);
		deliverydate.add(new JLabel("deliverydate",JLabel.LEFT));
		
		JTextField amount = new JTextField(10);
		amount.add(new JLabel("amount",JLabel.LEFT));
		
		
		fields.add(mailstonesid);
		fields.add(projectid);
		fields.add(description);
		fields.add(deliverydate);
		fields.add(amount);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=mailstonesid.getText();
		values[1]=projectid.getText();
		values[2]=description.getText();
		values[3]=deliverydate.getText();
		values[4]=amount.getText();
		Sql.InsertDataBase("mailstones",values);
		
	}
	
	public static void InsertGrades(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField month = new JTextField(10);
		month.add(new JLabel("month",JLabel.LEFT));
		
		JTextField grade = new JTextField(10);
		grade.add(new JLabel("grade",JLabel.LEFT));
		

		fields.add(projectid);
		fields.add(engineerid);
		fields.add(month);
		fields.add(grade);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=projectid.getText();
		values[1]=engineerid.getText();
		values[2]=month.getText();
		values[3]=grade.getText();
		Sql.InsertDataBase("grades",values);
		
	}
	
	public static void InsertDevstage(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField devstageid = new JTextField(10);
		devstageid.add(new JLabel("devstageid",JLabel.LEFT));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField devstagename = new JTextField(10);
		devstagename.add(new JLabel("devstagename",JLabel.LEFT));
		

		fields.add(devstageid);
		fields.add(projectid);
		fields.add(devstagename);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=devstageid.getText();
		values[1]=projectid.getText();
		values[2]=devstagename.getText();
		Sql.InsertDataBase("devstage",values);
		
	}
	
	public static void InsertPhones(){
	
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField phoneid = new JTextField(10);
		phoneid.add(new JLabel("phoneid",JLabel.LEFT));
		
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField phone_number = new JTextField(10);
		phone_number.add(new JLabel("phone_number",JLabel.LEFT));
		

		fields.add(phoneid);
		fields.add(engineerid);
		fields.add(phone_number);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=phoneid.getText();
		values[1]=engineerid.getText();
		values[2]=phone_number.getText();
		Sql.InsertDataBase("phones",values);
	}
	
	public static void InsertTools(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField toolid = new JTextField(10);
		toolid.add(new JLabel("toolid",JLabel.LEFT));
		
		JTextField devstageid = new JTextField(10);
		devstageid.add(new JLabel("devstageid",JLabel.LEFT));
		
		JTextField tool = new JTextField(10);
		tool.add(new JLabel("tool",JLabel.LEFT));

		fields.add(toolid);
		fields.add(devstageid);
		fields.add(tool);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=toolid.getText();
		values[1]=devstageid.getText();
		values[2]=tool.getText();
		Sql.InsertDataBase("tools",values);
		
	}
	
public static void InsertProjectToEngineers(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		
		fields.add(projectid);
		fields.add(engineerid);

		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=projectid.getText();
		values[1]=engineerid.getText();
		Sql.InsertDataBase("projecttoengineers",values);
		
	}
	
/*------------------------------------------------------ Uptate-----------------------------------------------------------------------------------*/	
	

	public static void UpdateProjects(){
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField projectid = new JTextField(10);
		
		JTextField projectname = new JTextField(10);
		projectname .add(new JLabel("name",JLabel.LEFT));
		
		JTextField descrption = new JTextField(10);
		descrption.add(new JLabel("descrption",JLabel.LEFT));
		
		JTextField startdate = new JTextField(10);
		startdate.add(new JLabel("startdate",JLabel.LEFT));
		
		
		fields.add(projectid);
		fields.add(projectname);
		fields.add(descrption);
		fields.add(startdate);
		
		
		int result =JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=projectid.getText();
		values[1]=projectname.getText();
		values[2]=descrption.getText();
		values[3]=startdate.getText();
		Sql.UpdateDataBase("projects",values);
		

	}
	
	
	public static void UpdateEngineers(){
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField engineername = new JTextField(10);
		engineername .add(new JLabel("engineername",JLabel.LEFT));
		
		JTextField age = new JTextField(10);
		age.add(new JLabel("age",JLabel.LEFT));
		
		JTextField birthdate = new JTextField(10);
		birthdate.add(new JLabel("birthdate",JLabel.LEFT));
		
		JTextField address = new JTextField(10);
		address.add(new JLabel("address",JLabel.LEFT));
		
		JTextField softareaid = new JTextField(10);
		softareaid.add(new JLabel("softareaid",JLabel.LEFT));
		
		
		fields.add(engineerid);
		fields.add(engineername);
		fields.add(age);
		fields.add(birthdate);
		fields.add(address);
		fields.add(softareaid);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=engineerid.getText();
		values[1]=engineername.getText();
		values[2]=age.getText();
		values[3]=birthdate.getText();
		values[4]=address.getText();
		values[5]=softareaid.getText();
		Sql.UpdateDataBase("engineers", values);
					
	}
	
	public static void UpdateSoftarea(){
		
			JPanel fields = new JPanel(new GridLayout(15, 8));
			JTextField id = new JTextField(10);
			id.add(new JLabel("id",JLabel.LEFT));
			
			JTextField SoftAreaName = new JTextField(10);
			SoftAreaName.add(new JLabel("SoftAreaName",JLabel.LEFT));
			
			JTextField expertise = new JTextField(10);
			expertise.add(new JLabel("expertise",JLabel.LEFT));
			
			
			fields.add(id);
			fields.add(SoftAreaName);
			fields.add(expertise);

			int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			values[0]=id.getText();
			values[1]=SoftAreaName.getText();
			values[2]=expertise.getText();
			Sql.UpdateDataBase("softarea",values);
			
	}
	
	public static void UpdateMailstones(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField mailstonesid = new JTextField(10);
		mailstonesid.add(new JLabel("mailstonesid",JLabel.LEFT));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField description = new JTextField(10);
		description.add(new JLabel("description",JLabel.LEFT));
		
		JTextField deliverydate = new JTextField(10);
		deliverydate.add(new JLabel("deliverydate",JLabel.LEFT));
		
		JTextField amount = new JTextField(10);
		amount.add(new JLabel("amount",JLabel.LEFT));
		
		
		fields.add(mailstonesid);
		fields.add(projectid);
		fields.add(description);
		fields.add(deliverydate);
		fields.add(amount);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=mailstonesid.getText();
		values[1]=projectid.getText();
		values[2]=description.getText();
		values[3]=deliverydate.getText();
		values[4]=amount.getText();
		Sql.UpdateDataBase("mailstones",values);
		
	}
	
	public static void UpdateGrades(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField month = new JTextField(10);
		month.add(new JLabel("month",JLabel.LEFT));
		
		JTextField grade = new JTextField(10);
		grade.add(new JLabel("grade",JLabel.LEFT));
		

		fields.add(engineerid);
		fields.add(projectid);
		fields.add(month);
		fields.add(grade);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=engineerid.getText();
		values[1]=projectid.getText();
		values[2]=month.getText();
		values[3]=grade.getText();
		Sql.UpdateDataBase("grades",values);
		
	}
	
	public static void UpdateDevstage(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField devstageid = new JTextField(10);
		devstageid.add(new JLabel("devstageid",JLabel.LEFT));
		
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField devstagename = new JTextField(10);
		devstagename.add(new JLabel("devstagename",JLabel.LEFT));
		

		fields.add(devstageid);
		fields.add(projectid);
		fields.add(devstagename);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=devstageid.getText();
		values[1]=projectid.getText();
		values[2]=devstagename.getText();
		Sql.UpdateDataBase("devstage",values);
		
	}
	
	public static void UpdatePhones(){
	
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField phoneid = new JTextField(10);
		phoneid.add(new JLabel("phoneid",JLabel.LEFT));
		
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		JTextField phone_number = new JTextField(10);
		phone_number.add(new JLabel("phone_number",JLabel.LEFT));
		

		fields.add(phoneid);
		fields.add(engineerid);
		fields.add(phone_number);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=phoneid.getText();
		values[1]=engineerid.getText();
		values[2]=phone_number.getText();
		Sql.UpdateDataBase("phones",values);
	}
	
	public static void UpdateTools(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField toolid = new JTextField(10);
		toolid.add(new JLabel("toolid",JLabel.LEFT));
		
		JTextField devstageid = new JTextField(10);
		devstageid.add(new JLabel("devstageid",JLabel.LEFT));
		
		JTextField tool = new JTextField(10);
		tool.add(new JLabel("tool",JLabel.LEFT));
		

		fields.add(toolid);
		fields.add(devstageid);
		fields.add(tool);
		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=toolid.getText();
		values[1]=devstageid.getText();
		values[2]=tool.getText();
		Sql.UpdateDataBase("tools",values);
		
	}
	
public static void UpdateProjectToEngineers(){
		
		JPanel fields = new JPanel(new GridLayout(15, 8));
		JTextField projectid = new JTextField(10);
		projectid.add(new JLabel("projectid",JLabel.LEFT));
		
		JTextField engineerid = new JTextField(10);
		engineerid.add(new JLabel("engineerid",JLabel.LEFT));
		
		
		fields.add(projectid);
		fields.add(engineerid);

		
		int result = JOptionPane.showConfirmDialog(null, fields, "UPDATE/INSERT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		values[0]=projectid.getText();
		values[1]=engineerid.getText();
		Sql.UpdateDataBase("projecttoengineers",values);
		
	}
	
}


