package com.hexa.client;

import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Country;
import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class LazyExceptionDemo {

	static SessionFactory sfac = HibernateUtil.getSessionFactory();
    
	public static void main(String[] args) {

		Session sess = sfac.openSession();
       
	    Country lst = getCountry(102);
	    
	    System.out.println(lst.getCtryId() + " " +  lst.getCtryName());
	    Set<Player> players = lst.getPlayers();
	    System.out.println("------------------------------");
	    for(Player player : players) {
	    	System.out.println(player.getPlayerId() + " " + player.getPlayerName() 
	    	            + " " + player.getEmail());
	    	
	    }
	    sess.close();
	    sfac.close();
	    

	}
	
	public static Country getCountry(int cid) {
		Session sess = sfac.openSession();
	    Country ctry = sess.get(Country.class, cid);
	    Hibernate.initialize(ctry.getPlayers());
	    sess.close();
	    return ctry;
	}

}
