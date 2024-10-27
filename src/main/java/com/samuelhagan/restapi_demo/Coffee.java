package com.samuelhagan.restapi_demo;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Coffee {

	@Id
	private String id;
	private String name;

	//there should be a no arg constructor, 
	//but i want to see if an errror will be thrown
	//since vscode seems to show nothing
    public Coffee(){
        
    }

	public Coffee(String id, String name){
		this.id = id;
		this.name = name;

	}

	public Coffee(String name){
		this(UUID.randomUUID().toString(), name);
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}