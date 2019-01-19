package SqlProject;

import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sql {
	private static Dbconnection con = new Dbconnection();
	private static String Query=null;
	
	static{
		con.Runconnection();
	}
	
	public static DefaultTableModel TableFromDatabase(String s)
	{
	try{
		Vector<Object> columnNames = new Vector<Object>();
	    Vector<Object> data = new Vector<Object>();	
		Statement stmt = null;
		stmt=con.connection.createStatement();
		switch(s){
		case "projects":
			Query="select * from projects";
			break;
		case "engineers":
			Query="select * from engineers";
			break;
		case "softarea":
			Query="select * from softarea";
			break;
		case "mailstones":
			Query="select * from mailstones";
			break;
		case "grades":
			Query="select g.projectid,p.projectname,g.engineerid,e.engineerFullName,g.month,g.grade "
					+ "from grades as g "
					+ "join engineers as e on g.engineerid=e.engineerid "
					+ "join projects as p on g.projectid=p.projectid "
					+ "order by g.projectid";
			System.out.println(Query);
			break;
		case "devstage":
			Query="select * from devstage";
			break;
		case "phones":
			Query="select * from phones";
			break;
		case "tools":
			Query="select * from Tools";
			break;
		case "projecttoengineers":
			Query="select  * "
					+ "from projects "
					+ "join projecttoengineers on projects.projectid = projecttoengineers.projectid "
					+ "join engineers on projecttoengineers.engineerid = engineers.engineerid "
					+ "order by projects.projectid, engineers.softareaid";
			break;
		case "most interesting":
			Query="select projects.projectid ,projects.projectname ,avg(grades.grade) as avg_grade,"
					+ "(select count(grades.projectid) group by grades.projectid) as grades_amount "
					+ "from grades join projects on grades.projectid= projects.projectid "
					+ "group by grades.projectid "
					+ "order by avg_grade desc "
					+ "limit 3";
			break;
		case "less interesting":
			Query="select projects.projectid ,projects.projectname ,avg(grades.grade) as avg_grade,"
					+ "(select count(grades.projectid) group by grades.projectid) as grades_amount "
					+ "from grades join projects on grades.projectid= projects.projectid "
					+ "group by grades.projectid "
					+ "order by avg_grade asc "
					+ "limit 3";
			break;
		case "current month mailstones":
			Query="select  * "
					+ "from projects "
					+ "join mailstones "
					+"where projects.projectid = mailstones.projectid " 
					+"and month(mailstones.deliverydate) = month(current_date()) "
					+"and year(mailstones.deliverydate) = year(current_date()) "
					+"order by projects.projectid";
			break;
		case "project devstage and tools":
			Query="select  pro.projectid, pro.projectname, dev.devstageid, dev.devstagename, tol.tool "
					+ "from projects as pro "
					+ "join devstage as dev on pro.projectid = dev.projectid "
					+ "join  tools tol on dev.devstageid =  tol.devstageid "
					+ "order by pro.projectid, dev.devstageid";
			break;
		case "busiest engineers":
			Query="select  e.engineerid,e.engineerFullName,count(pte.projectid) as 'counter' "
					+ "from projects as p join projecttoengineers as pte on p.projectid=pte.projectid "
					+ "join engineers e on e.engineerid=pte.engineerid "
					+ "group by pte.engineerid "
					+ "having count(pte.projectid) = (select count(projects.projectid )from projects) ";
			System.out.println(Query);
			break;
		}
		ResultSet rs = stmt.executeQuery( Query );
		ResultSetMetaData md = rs.getMetaData();
	    int columns = md.getColumnCount();            //  Get column names
	            for (int i = 1; i <= columns; i++)
	            {
	                columnNames.addElement( md.getColumnName(i) );
	               
	            }

	            //  Get row data

	            while (rs.next())
	            {
	                Vector<Object> row = new Vector<Object>(columns);

	                for (int i = 1; i <= columns; i++)
	                {
	                    row.addElement( rs.getObject(i) );
	                
	                }

	                data.addElement( row );
	            }

	            rs.close();
	            stmt.close();
		
		

	    //  Create table with database data

	    DefaultTableModel model = new DefaultTableModel(data, columnNames)
	    {
	    	@Override
	        public Class getColumnClass(int column)
	        {
	            for (int row = 0; row < getRowCount(); row++)
	            {
	                Object o = getValueAt(row, column);

	                if (o != null)
	                {
	                    return o.getClass();
	                }
	            }

	            return Object.class;
	        }
	    };
	    
	    return model;



        		
	}catch (SQLException e) {
	  throw new IllegalStateException("error", e);
	}

	}
	
	public static void DeleteFromDataBase(String key,String table){
		try{PreparedStatement pstmt = null;
		if(key.equals("") | table.equals("") ){
			JOptionPane.showMessageDialog(null, "missing some prameters");
			return;
		}
		switch(table){
		case "projects":
			Query= "delete from projects where projectid ="+key ;
			System.out.println(Query);
			break;
		case "engineers":
			Query="delete from engineers where engineerid ="+key ;
			System.out.println(Query);
			break;
		case "softarea":
			Query="delete from softarea where id ="+key ;
			System.out.println(Query);
			break;
		case "mailstones":
			Query="delete from mailstones where mailstonesid ="+key ;
			System.out.println(Query);
			break;
		case "grades":
			Query="delete from grades where projectid ="+key.substring(0, 2)+" and engineerid="+key.substring(2, 4)+" and month="+key.substring(4, 6) ;
			System.out.println(Query);
			break;
		case "devstage":
			Query="delete from devstage where devstageid ="+key ;
			System.out.println(Query);
			break;
		case "phones":
			Query="delete from phones where phoneid ="+key ;
			System.out.println(Query);
			break;
		case "tools":
			Query="delete from tools where toolid ="+key ;
			System.out.println(Query);
			break;
		case "projecttoengineers":
			Query="delete from projecttoengineers where projectid ="+key.substring(0, 2)+" and engineerid="+key.substring(2, 4);
			System.out.println(Query);
			break;
			}
		
		pstmt=con.connection.prepareStatement(Query);
		pstmt.executeUpdate();
		
		}catch (SQLException e) {
			  throw new IllegalStateException("error", e);
			}
		
		}
		
	public static void InsertDataBase(String table,String[] values){
		try{
			if(table.equals("") ){
				JOptionPane.showMessageDialog(null, "missing some prameters");
				return;
			}
			/*for(String value:values){
				if(value.equals("") )
					JOptionPane.showMessageDialog(null, "missing some prameters");
				continue;
			}*/
			PreparedStatement pstmt = null;
			switch(table){
			case "projects":
				Query= "INSERT INTO projects (projectid, projectname, descrption, startdate) VALUES ("
						+ values[0]+",'"+values[1]+ "','"+ values[2]+"','" +values[3]+"')" ;
				System.out.println(Query);
				break;
			case "engineers":
				Query="INSERT INTO engineers (engineerid, engineerFullName, Age, birthdate,address,softareaid) VALUES ("
						+ values[0]+",'"+values[1]+"',"+ values[2]+",'" +values[3]+"','" +values[4]+"'," +values[5]+")" ;
				System.out.println(Query);
				break;
			case "softarea":
				Query="INSERT INTO softarea (id, SoftAreaName, expertise) VALUES ("
						+ values[0]+",'"+values[1]+"','"+ values[2]+"')" ;
				System.out.println(Query);
				break;
			case "mailstones":
				Query="INSERT INTO mailstones (mailstonesid, projectid, description,deliverydate,amount) VALUES ("
						+ values[0]+","+values[1]+ ",'"+ values[2]+"','"+ values[3]+"','"+ values[4]+"')" ;
				System.out.println(Query);
				break;
			case "grades":
				Query="INSERT INTO grades (projectid, engineerid, month,grade) VALUES ("
						+ values[0]+","+values[1]+ ","+ values[2]+",'"+ values[3]+"')" ;
				System.out.println(Query);
				break;
			case "devstage":
				Query="INSERT INTO devstage (devstageid, projectid, devstagename) VALUES ("
						+ values[0]+","+values[1]+ ",'"+ values[2]+"')" ;
				System.out.println(Query);
				break;
			case "phones":
				Query="INSERT INTO phones (phoneid, engineerid, phone_number) VALUES ("
						+ values[0]+","+values[1]+ ",'"+ values[2]+"')" ;
				System.out.println(Query);
				break;
			case "tools":
				Query="INSERT INTO tools (toolid, devstageid, tool) VALUES ("
						+ values[0]+","+values[1]+ ",'"+ values[2]+"')" ;
				System.out.println(Query);
				break;
			case "projecttoengineers":
				Query="INSERT INTO projecttoengineers (projectid, engineerid) VALUES ("
						+ values[0]+","+values[1]+")";
				System.out.println(Query);
				break;
			}
		
			pstmt=con.connection.prepareStatement(Query);
			pstmt.executeUpdate();
		}catch (SQLException er) {
			  throw new IllegalStateException("error", er);
			}
	
	}
	
	public static void UpdateDataBase(String table,String[] values){
		try{
			if(table.equals("") ){
				JOptionPane.showMessageDialog(null, "missing some prameters");
				return;
			}
			/*for(String value:values){
				if(value.equals("") )
					JOptionPane.showMessageDialog(null, "missing some prameters");
				return;
			}*/
			PreparedStatement pstmt = null;
			switch(table){
			case "projects":
				Query= "Update projects SET projectname='"+values[1]+"',descrption='"+values[2]+"',startdate='"+values[3]
						+"' WHERE projectid="+values[0];
				System.out.println(Query);
				break;
			case "engineers":
				Query= "Update engineers SET engineerFullName='"+values[1]+"',Age='"+values[2]+"',birthdate='"+values[3]+"',address='"+values[4]+"',softareaid='"+values[5]
						+"' WHERE engineerid="+values[0];
				System.out.println(Query);
				break;
			case "softarea":
				Query="Update softarea SET SoftAreaName='"+values[1]+"',expertise='"+values[2]
						+"' WHERE id="+values[0];
				System.out.println(Query);
				break;
			case "mailstones":
				Query="Update mailstones SET projectid="+values[1]+",description='"+values[2]+"',deliverydate='"+values[3]+"',deliverydate='"+values[4]
						+"' WHERE mailstonesid="+values[0];
				System.out.println(Query);
				break;
			case "grades":
				Query="Update grades SET grade='"+values[3]
						+"' WHERE projectid="+values[0]+" and engineerid="+values[1]+" and month="+values[2] ;
				
				System.out.println(Query);
				break;
			case "devstage":
				Query="Update devstage SET devstagename='"+values[3]
						+"' WHERE devstageid="+values[0]+"'and projectid='"+values[2] ;
				System.out.println(Query);
				break;
			case "phones":
				Query="Update phones SET engineerid="+values[1]+",phone_number='"+values[2]
						+"' WHERE phoneid="+values[0];
				System.out.println(Query);
				break;
			case "tools":
				Query="Update phones SET devstageid="+values[1]+",tool='"+values[2]
						+"' WHERE toolid="+values[0];
				System.out.println(Query);
				break;
			case "projecttoengineers":
				Query="Update devstage SET projectid="+values[0]+",engineerid='"+values[1]
						+"' WHERE projectid="+values[0]+"'and engineerid='"+values[1] ;
				System.out.println(Query);
				break;
			}
		
			pstmt=con.connection.prepareStatement(Query);
			pstmt.executeUpdate();
		}catch (SQLException er) {
			  throw new IllegalStateException("error", er);
			} 
		
	}
	
	
}
	

	
