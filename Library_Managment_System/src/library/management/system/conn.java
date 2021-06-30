package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
          //  c =DriverManager.getConnection("jdbc:mysql:/DATABASE1","PANKAJ","99566066");    
          c = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6421308", "sql6421308", "lXD89zUfdt"); 
          s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
