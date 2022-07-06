package com.sample.sampledata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Players {
	@Id
	private Integer id;
	private String name;
	private Integer runscored;
	private String playertype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRunscored() {
		return runscored;
	}
	public void setRunscored(Integer runscored) {
		this.runscored = runscored;
	}
	public String getPlayertype() {
		return playertype;
	}
	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", runscored=" + runscored + ", playertype=" + playertype + "]";
	}
	public Players(Integer id, String name, Integer runscored, String playertype) {
		super();
		this.id = id;
		this.name = name;
		this.runscored = runscored;
		this.playertype = playertype;
	}
	public Players() {
		
	}
}
