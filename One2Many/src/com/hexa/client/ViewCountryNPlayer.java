package com.hexa.client;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Country;
import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class ViewCountryNPlayer {

	public static void main(String[] args) {
		SessionFactory sfac = HibernateUtil.getSessionFactory();
	    Session sess = sfac.openSession();
        Country lst = sess.get(Country.class, 102);
	    System.out.println(lst.getCtryId() + " " +  lst.getCtryName());
	    Set<Player> players = lst.getPlayers();
	    System.out.println("------------------------------");
	    for(Player player : players) {
	    	System.out.println("\n");
	    	System.out.println(player.getPlayerId() + " " + player.getPlayerName() 
	    	            + " " + player.getEmail());
	    	
	    }
        sess.close();
	    sfac.close();

	}

}
