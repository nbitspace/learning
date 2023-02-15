package com.nbit.learn.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static void db() {

	      Connection c = null;
	      try {
	    	  String db = "school";
	    	  String user = "postgres";
	    	  String pass = "postgres";
	         Class.forName("org.postgresql.Driver");//Driver
	         
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/" + db,
	            user, pass);
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
	
	public static void createTable() {
		
	}
	
}
