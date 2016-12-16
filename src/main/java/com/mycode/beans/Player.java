package com.mycode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.mycode.interfaces.ITeam;

public class Player {
	private int number;
	private String name;
	@Autowired
	@Qualifier("realmadridQualifier")
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

	@Required
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
