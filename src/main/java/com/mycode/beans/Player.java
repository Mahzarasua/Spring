package com.mycode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mycode.interfaces.ITeam;

@Component("cristiano")
public class Player {
	@Value("10")
	private int number;
	@Value("Cristiano")
	private String name;
	@Autowired
	//@Qualifier("realmadridQualifier")
	private ITeam team;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	//@Required
	public void setName(String name) {
		this.name = name;
	}

	public ITeam getTeam() {
		return team;
	}

//	@Required
	public void setTeam(ITeam team) {
		this.team = team;
	}

}
