package com.ec2demo.rest.services;
import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

import com.ec2demo.model.Identity;

@Path("/doLogin")
public class LoginService {
	@POST
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	public String doLogin(String formData) throws Throwable, IOException{
		Identity identity =new Identity();
		JSONObject jsonObject  = new JSONObject(formData);
		System.out.println(jsonObject.getString("email"));
		System.out.println(jsonObject.getString("password"));
		return jsonObject.toString();
	}
}
