package com.mycode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycode.beans.AppConfig;
import com.mycode.beans.World;
import com.mycode.interfaces.ITeam;
import com.mycode.beans.Persona;
import com.mycode.beans.Player;

public class App {

	public static void main(String[] args) {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mycode/xml/beans.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		World m = appContext.getBean(World.class);
		//Mundo m = (Mundo)appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/mycode/xml/beans.xml");
		//appContext2.register(AppConfig2.class);
		//appContext2.refresh();
		
		Persona p = (Persona) appContext2.getBean("persona");
		
		System.out.println(p.getId() + " " + p.getName() + " " + p.getNickname() + " " + p.getCountry().getName() + " " + p.getCity().getName());

		((ConfigurableApplicationContext)appContext2).close();
		
		ApplicationContext appContext3 = new ClassPathXmlApplicationContext("com/mycode/xml/beans.xml");
		
		Player player = (Player) appContext3.getBean("cristiano");
		//ITeam team = (ITeam) appContext3.getBean("bayern");
		
		System.out.println(player.getName() + " " + player.getNumber() + " " + player.getTeam().mostrar());
		//System.out.println(team.mostrar());

		((ConfigurableApplicationContext)appContext3).close();
	}

}
