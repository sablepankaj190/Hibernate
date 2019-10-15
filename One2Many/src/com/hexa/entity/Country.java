package com.hexa.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hexa_country")
public class Country {

	@Id
	@Column(name="cid")
	private int ctryId;
	
	@Column(name="cname", length=20)
	private String ctryName;
	
	@OneToMany(mappedBy = "ctry", fetch = FetchType.LAZY)
	private Set<Player> players;
    
    
	

	public int getCtryId() {
		return ctryId;
	}


	public void setCtryId(int ctryId) {
		this.ctryId = ctryId;
	}


	public String getCtryName() {
		return ctryName;
	}


	public void setCtryName(String ctryName) {
		this.ctryName = ctryName;
	}


	public Set<Player> getPlayers() {
		return players;
	}


	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
}







