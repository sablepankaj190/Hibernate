package com.hexa.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class ForGivenCountryJoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
	    Session sess = sfac.openSession();
        String hql = "from Player p inner join fetch p.ctry c where c.ctryName = ?";
        
        Query qry =sess.createQuery(hql);
        qry.setParameter(0, "Australia");
        List<Player> lst = qry.list();
        
	    sess.close();
	    sfac.close();
        for(Player player : lst) {
        	System.out.println(player.getPlayerId() + " " + player.getPlayerName() + " " + player.getEmail()
            + " " +player.getCtry().getCtryId() + " " +player.getCtry().getCtryName());
        }
	}

}
