package me.wolfkingnick;

import java.util.List;

public class ShipHolder{

	class FactionData{


	String fname;
	int xcord;
	int ycord;
	int zcord;
	
	List<String> fmembers;
	
	public FactionData(String fname, int xcord, int ycord, int zcord, List<String> fmembers){
		this.fname = fname;
		this.xcord = xcord;
		this.ycord = ycord;
		this.zcord = zcord;
		
		this.fmembers = fmembers;
}

	public void setfname(String fname) { this.fname = fname; }
	public void setxcord(int xcord) { this.xcord = xcord; }
	public void setycord(int ycord) { this.ycord = ycord; }
	public void setzcord(int zcord) { this.zcord = zcord; }
	
	public void addfmember(String member) { 
	if(!fmembers.contains(member)) { this.fmembers.add(member); }}
	public void removemember(String member) {
	if(this.fmembers.contains(member)) { fmembers.remove(member);
	//if members = 0 destroy faction
 }
	
	


}
	public FactionData FactionData;

}
}