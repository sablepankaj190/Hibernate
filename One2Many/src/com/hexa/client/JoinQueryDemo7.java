package com.hexa.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Player;
import com.hexa.util.HibernateUtil;

public class JoinQueryDemo7 {

	public static void main(String[] args) {



		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		//Transaction tx = sess.beginTransaction();
		 String hql = "from Player p inner join fetch p.pstat ps inner join fetch p.ctry c where p.playerName = ?";
			Query qry = sess.createQuery(hql);
			qry.setParameter(0, "Virat Kohli");
			List<Player> lst = qry.list();
			
			
			sess.close();
			sfac.close();
			for (Player p:lst) {
				System.out.println(p.getPlayerId()+"    " + p.getPlayerName());
				System.out.println(p.getPstat().getFifties()+"    " + p.getPstat().getRuns());
				System.out.println(p.getCtry().getCtryName());
				System.out.println("------------------------------------------------------");

			}
	}

}
