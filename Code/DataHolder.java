package me.wolfkingnick;

import java.util.UUID;

public class DataHolder {
	
	class Playerdata { 
//playername
		UUID pname;
//faction name
		String title;
//member leader moderator
		String frank;
//admin staff
		String prank;
//money
		int money;
		
		public Playerdata(UUID pname, String title, String frank, String prank, int money) {
			this.pname = pname;
		    	this.title = title;
		    	this.frank = frank;
		    	this.prank = prank;
		    	this.money = money;
		}
		
		public void setname(UUID playername) { this.pname = playername; }
		 
		public void settitle(String title) { this.title = title; }
		 
		public void setfrank(String factionrank) { this.frank = factionrank; }
		 
		public void setprank(String playerrank) { this.prank = playerrank; }

		public void addmoney(int money) { this.money = this.money + money; }

		public void setmoney(int money) { this.money = money; }

		public void removemoney(int money) { this.money = this.money - money; }

		public String getname() { return this.pname; }
		
		public String gettitle() { return this.title; }

		public String getfrank() { return this.frank; }

		public String getprank() { return this.prank; }

		public int getmoney() {return this.money; }

		public void Playerdataacess(String name, String title, String factionrank, String playerrank) {
			this.pname = name;
			this.title = title;
			this.frank = factionrank;
			this.prank = playerrank;	
		}
		
	}

	public Playerdata Playerdata;
	
}