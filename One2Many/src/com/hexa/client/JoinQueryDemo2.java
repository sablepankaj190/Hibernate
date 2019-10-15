package com.hexa.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexa.entity.Player;
import com.hexa.entity.PlayerStat;
import com.hexa.util.HibernateUtil;

public class JoinQueryDemo2 {

	public static void main(String[] args) {
		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		String hql = "from PlayerStat ps inner join fetch ps.player p inner join fetch p.ctry";
		
		 Query qry = sess.createQuery(hql);
			List<PlayerStat> lst = qry.list();
		sess.close();
		sfac.close();
		for (PlayerStat ps:lst) {
			System.out.println(ps.getPlayerId()+"    " + ps.getPlayer().getPlayerName());
			System.out.println(ps.getMtchPlayed()+"    " + ps.getRuns());
			System.out.println(ps.getPlayer().getCtry().getCtryName());
			System.out.println("------------------------------------------------------");

		}

	}

}
