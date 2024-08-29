package com.datajpa;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.datajpa.entity.Player;
import com.datajpa.repository.PlayerRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
	  PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
//	 System.out.println(bean.getClass().getName()); // JPA Created the Object
	
	Player p1 = new Player();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Id :");
	int id = sc.nextInt();
	p1.setPlayerId(id);
	System.out.println("Enter the Name :");
	String name = sc.next();
	p1.setPalyerName(name);
	System.out.println("Age :");
	int age = sc.nextInt();
	p1.setPlayerAge(age);
	System.out.println("Location :");
	String loc = sc.next();
	p1.setLocation(loc);
	playerRepository.save(p1); // Upsert Method sed for It is Work Update and insert also Only this Single Method Work like that
	// Save Method Used for Inserted and Updates also
	System.out.println("Records Inserted Successfully...");
	}

}
