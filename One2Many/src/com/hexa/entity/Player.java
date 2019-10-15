package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hexa_player")
public class Player {

	@Id
	@Column(name="player_id")
	private int playerId;
	
	@Column(name="player_name", length=20)
	private String playerName;
	
	@Column(name="player_email", length=25)
	private String email;
	
	@ManyToOne()
	@JoinColumn(name = "ctry_id", referencedColumnName = "cid")
	private Country ctry;
		
	@OneToOne(mappedBy = "player")
	private PlayerStat pstat;
	
	
	public Player(){
		
	}
	
	public Player(int playerId, String playerName, String email) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.email = email;
	}

	
	public Country getCtry() {
		return ctry;
	}
	public void setCtry(Country ctry) {
		this.ctry = ctry;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public PlayerStat getPstat() {
		return pstat;
	}

	public void setPstat(PlayerStat pstat) {
		this.pstat = pstat;
	}
	
	
	
}





