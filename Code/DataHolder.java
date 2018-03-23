public class DataHolder {
	
	class Playerdata { 
//playername
		String pname;
//faction name
		String title;
//member leader moderator
		String frank;
//admin staff
		String prank;
//money
		Int money;
		
		public Playerdata(String pname, String title, String frank, String prank, Int money) {
			this.pname = pname;
		    	this.title = title;
		    	this.frank = frank;
		    	this.prank = prank;
		    	this.money = money;
		}
		
		public void setname(String playername) { this.pname = playername; }
		 
		public void settitle(String title) { this.title = title; }
		 
		public void setfrank(String factionrank) { this.frank = factionrank; }
		 
		public void setprank(String playerrank) { this.prank = playerrank; }

		public void addmoney(Int money) { this.money = this.money + money; }

		public void setmoney(Int money) { this.money = money; }

		public void removemoney(Int money) { this.money = this.money - money; }

		public String getname() { return this.pname; }
		
		public String gettitle() { return this.title; }

		public String getfrank() { return this.frank; }

		public String getprank() { return this.prank; }

		public Int getmoney() {return this.money; }

		public void Playerdataacess(String name, String title, String factionrank, String playerrank) {
			this.pname = name;
			this.title = title;
			this.frank = factionrank;
			this.prank = playerrank;	
		}
		
	}

	public Playerdata Playerdata;
	
}