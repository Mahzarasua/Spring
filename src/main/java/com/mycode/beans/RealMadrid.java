package com.mycode.beans;

import org.springframework.stereotype.Component;

import com.mycode.interfaces.ITeam;

@Component
public class RealMadrid implements ITeam {

	public String mostrar() {
		return "Real Madrid FC";
	}

}
