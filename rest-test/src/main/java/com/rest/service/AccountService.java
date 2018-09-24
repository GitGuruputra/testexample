package com.rest.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rest.pojo.Account;

@Path("/services/")
public class AccountService {

	Map<String, Account> accounts = new HashMap<String, Account>();

	public void init() {

		Account newAccount1 = new Account();
		newAccount1.setAccId(1);
		newAccount1.setAccName("Alvin Reyes");

		Account newAccount2 = new Account();
		newAccount2.setAccId(2);
		newAccount2.setAccName("Rachelle Ann de Guzman Reyes");

		accounts.put("1", newAccount1);
		accounts.put("2", newAccount2);

	}

	public AccountService() {
		init();
	}
	
	@GET
	@Path("/account/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAccount(@PathParam("id") int id){
		
		Account account = accounts.get(id);
		
		return Response.ok(account).build();
		
	}
	
	@POST
	@Path("/account/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAccount(Account accout){
		
		System.out.println("The acc"+accout.getAccId()+" name is "+accout.getAccName());
		return Response.ok(accout).build();
	}
}
