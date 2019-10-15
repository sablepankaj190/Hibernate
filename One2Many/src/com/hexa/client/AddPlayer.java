package com.hexa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexa.entity.Country;
import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class AddPlayer {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
	    Session sess = sfac.openSession();

	    Transaction tx = sess.beginTransaction();
		Country ctry = new Country();
		ctry.setCtryId(102);
		
		
		Player player = new Player();
		player.setPlayerId(105);
		player.setPlayerName("Pankaj Sable");
		player.setEmail("sabby@gmail.com");
		player.setCtry(ctry); //persist FK
		
		sess.save(player);
		tx.commit();
		sess.close();
		sfac.close();
		System.out.println("Player added.");
		
	    
	   
	}

}
