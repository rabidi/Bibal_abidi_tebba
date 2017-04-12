package com.dao;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DbInteraction {
		static Connection con;     				
		public static ResultSet rs = null;							
	    static PreparedStatement pst;					
	    static java.sql.Statement st;			
		
	    public static void Connect(){
	    
			try {
							
	            Class.forName("org.mariadb.jdbc.Driver");				        
		        String url ="jdbc:mariadb://localhost:3306/gestion" ;			       
		        con = DriverManager.getConnection(url,"root","");		
		        st=con.createStatement();
		        System.out.println("Connection réussie");	        	        						
			} 
			catch (ClassNotFoundException e){
	        	e.printStackTrace();
	        } 
			catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    
	    public static void disconnect(){
	    	try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    
	    public static ResultSet select(String sql){
	    	try {
				rs=st.executeQuery(sql);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
	    	return rs;
	    }
	    
	    public static int update(String sql){
	    	int nb=0;
	    	try {       		
				nb = st.executeUpdate(sql);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
	    	return nb;
	    }
		


}
