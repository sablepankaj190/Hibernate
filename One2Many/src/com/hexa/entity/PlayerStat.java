package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="hexa_player_stat")
public class PlayerStat {

	@Id
	@Column(name="p_id")
	private int playerId;
	
	@Column(name="stat_runs")
	private int runs;
	@Column(name="stat_mplayed")
	private int mtchPlayed;
	@Column(name="stat_hundreds")
	private int hundreds;
	@Column(name="stat_fifties")
	private int fifties;
	
	@ManyToOne
	@JoinColumn(name="p_id", referencedColumnName="player_id", insertable = false, updatable = false)
	private Player player;
		
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMtchPlayed() {
		return mtchPlayed;
	}
	public void setMtchPlayed(int mtchPlayed) {
		this.mtchPlayed = mtchPlayed;
	}
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	
	
}




