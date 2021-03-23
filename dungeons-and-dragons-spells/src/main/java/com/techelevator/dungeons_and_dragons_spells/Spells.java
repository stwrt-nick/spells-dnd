package com.techelevator.dungeons_and_dragons_spells;

import java.util.List;

public class Spells {
	
	private String index;
	private String name;
	private List<String> desc;
	private List<String> higher_level;
	private String range;
	private String duration;
	private String casting_time;
	private int level;
	
	public Spells() {
		
	}
	
	public Spells(String index, String name, List<String> desc, List<String> higher_level, String range, String duration, String casting_time, int level) {
		this.index = index;
		this.name = name;
		this.desc = desc;
		this.higher_level = higher_level;
		this.range = range;
		this.duration = duration;
		this.casting_time = casting_time;
		this.level = level;
		
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<String> getDesc() {
		return desc;
	}

	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	public List<String> getHigher_level() {
		return higher_level;
	}

	public void setHigher_level(List<String> higher_level) {
		this.higher_level = higher_level;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCasting_time() {
		return casting_time;
	}

	public void setCasting_time(String casting_time) {
		this.casting_time = casting_time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

}
