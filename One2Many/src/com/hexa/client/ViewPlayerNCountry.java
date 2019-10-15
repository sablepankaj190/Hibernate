package com.hexa.client;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Country;
import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class ViewPlayerNCountry {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
	    Session sess = sfac.openSession();
        Player player = sess.get(Player.class, 102);
        System.out.println("--------------------------------------------------");
        System.out.println(player.getPlayerId() + " " + player.getPlayerName() + " " + player.getEmail()
         + " " +player.getCtry().getCtryId() + " " +player.getCtry().getCtryName());
	  
        sess.close();
	    sfac.close();
	}

}
