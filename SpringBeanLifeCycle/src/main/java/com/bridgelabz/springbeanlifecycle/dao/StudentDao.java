package com.bridgelabz.springbeanlifecycle.dao;
import java.sql.*;

public class StudentDao {
	private String driver;
	private String url;
	private String username;
	private String password;
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("Setting Driver...");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("Setting Url...");
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("Setting User Name...");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Setting Password...");
		this.password = password;
	}

	//@PostConstruct  // We should call it here so that we can follow standard coding format
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("Inside Custom init..");
		createConnection();
	}
	// @PostConstruct // When we annotate a method in Spring Bean with @PostConstruct annotation, it gets executed after the spring bean is initialized.
	public void createConnection() throws ClassNotFoundException, SQLException { // This method is responsible for creating connection for all the required operations
		
		System.out.println("Creating Connection...");
		// Load Driver
		Class.forName(driver);

		// Get Connection
		 con = DriverManager.getConnection(url, username, password);
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrieving all the Data ");
		// We are calling createConnection Method Instead of writing same code again for all the methods
		// createConnection(); don't do this for us also becoz spring will do this for us by @PostConstructor
		// execute Query
		Statement stmt = con.createStatement();

		ResultSet resultset = stmt.executeQuery("select * from HostelStudentsInfo");

		while (resultset.next()) {
			int studentId = resultset.getInt(1);
			String studentName = resultset.getString(2);
			int hostelFee = resultset.getInt(3);
			String foodType = resultset.getString(4);
			System.out.println(studentId + " " + studentName + " " + hostelFee + " " + foodType);
		}
		System.out.println(" Record Inserted ");
	}

	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
		
		// We are calling createConnection Method Instead of writing same code again for all the methods
		// createConnection(); don't do this also becoz spring will do this for us by @PostConstructor
		// execute Query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("delete from HostelStudentsInfo where  Student_id = " + studentId);

		System.out.println(" Record Deleted with id " + studentId);
	}
	
	//@PreDestroy  // the method which has to be called before the container is destoryed
	// Before your container object is destroyed Spring will call your custom destroy method
	// Before spring remove studentDao(bean) from the container, it will call this method
	public void closeConnection() throws SQLException
	{
		System.out.println("Connection Closed..Inside Destroy");
		con.close();
	}
	//@PreDestroy // We should call it here so that we can follow standard coding format
	public void destory() throws SQLException
	{
		closeConnection();
	}
}
