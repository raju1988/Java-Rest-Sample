package com.ec2demo.rest.services;

import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ec2demo.dbutil.DBConnection;
import com.ec2demo.model.Identity;

@Path("/doRegistration")
public class RegistrationService {
	private Connection conn;

	public RegistrationService() {
		conn = DBConnection.getConnection();
	}
	@SuppressWarnings("finally")
	@POST
	@Path("registration")
	@Produces(MediaType.APPLICATION_JSON)
	public String doRegistration(String formData) throws Throwable, IOException{
		Identity identity =new Identity();
		try {
			JSONObject jsonObject  = new JSONObject(formData);
			String fname= jsonObject.getString("fname");
			String lname= jsonObject.getString("lname");
			String email= jsonObject.getString("email");
			String phonenumber= jsonObject.getString("phonenumber");
			String password= jsonObject.getString("password");
			String pincode= jsonObject.getString("pincode");
			String address= jsonObject.getString("address");
			identity.setFirstName(fname);
			identity.setLastName(lname);
			identity.setEmailAddress(email);
			identity.setPassword(password);
			identity.setPhoneNumber(phonenumber);
			identity.setPincode(pincode);
			identity.setAddress(address);
			String query = "insert into identity (firstname, lastname, emailaddress,password,phonenumber,pincode,address) values (?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1, identity.getFirstName() );
			preparedStatement.setString( 2, identity.getLastName() );
			preparedStatement.setString( 3, identity.getEmailAddress() );
			preparedStatement.setString( 4, identity.getPassword() );
			preparedStatement.setString(5,identity.getPhoneNumber());
			preparedStatement.setString(6, identity.getPincode());
			preparedStatement.setString(7, identity.getAddress());
			preparedStatement.executeUpdate();	
			preparedStatement.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			System.out.println("Records created successfully");
			List<Identity> identities = new ArrayList<Identity>();
			try {
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery( "select * from identity" );
				while( resultSet.next() ) {
					Identity identity1 = new Identity();
					identity1.setFirstName( resultSet.getString( "firstname" ) );
					identity1.setLastName( resultSet.getString( "lastname" ) );
					identity1.setEmailAddress( resultSet.getString( "emailaddress" ) );
					identity1.setPassword( resultSet.getString( "password" ) );
					identity1.setPhoneNumber( resultSet.getString( "phonenumber" ) );
					identity1.setPincode(resultSet.getString("pincode"));
					identity1.setAddress(resultSet.getString("address"));
					identities.add(identity1);
				}
				resultSet.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JSONObject responseData = new JSONObject();
				responseData.put("response", identities);
				responseData.put("status", "sucess");
				return responseData.toString();
			}
		}
	}
}
