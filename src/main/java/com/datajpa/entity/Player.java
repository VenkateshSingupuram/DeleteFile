package com.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name="CRICKET_PLAYERS")
public class Player {
	@Id  // Primary Key.
	@Column(name="PLAYER_ID")
    private Integer playerId;
	@Column(name="PLAYER_NAME")
	private String palyerName;
	
    @Column(name="PLAYER_AGE")
	private Integer playerAge;
	private String location;
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPalyerName() {
		return palyerName;
	}

	public void setPalyerName(String palyerName) {
		this.palyerName = palyerName;
	}

	public Integer getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", palyerName=" + palyerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	}

	
	

}
