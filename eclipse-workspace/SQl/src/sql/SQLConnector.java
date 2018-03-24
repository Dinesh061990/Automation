package sql;	
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  SQLConnector {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:mysql://localhost:3306/orangehrm";					

				//Database Username		
				String username = "orange";	
                
				//Database Password		
				String password = "root";				

				//Query to Execute		
				String query = "SELECT * FROM orangehrm.ohrm_user;";	
				String query1 = "SELECT * FROM orangehrm.ohrm_user_role;";
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
        	   Statement stmt1 = con.createStatement();
        	   
       			// Execute the SQL Query. Store results in ResultSet		
        	   
         		ResultSet rs= stmt.executeQuery(query);							
         		ResultSet rs1= stmt1.executeQuery(query1);
         		
//         		System. out.println(rs1);
         		// While Loop to iterate through all data and print results		
         		 while(rs.next()){
			        		String user_name = rs.getString("user_name");								        
                            String user_password = rs.getString("user_password");
                           
                            System. out.println(user_name+"  "+user_password+" ");	
                           
         		 }
       
                    	while (rs1.next())
                    {
                    	 String display_name = rs1.getString("display_name");
                    	 System. out.println(display_name+"");
                    }

   
      			 // closing DB Connection		
      			con.close();			
		}
}
