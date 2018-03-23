package me.wolfkingnick;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import me.wolfkingnick.DataHolder.Playerdata;

public class ShipMaker {

	List<String> infaction = new ArrayList<>();
	List<String> haslist = new ArrayList<>();
	
	
	@EventHandler
	public void onjoinlistcreater(PlayerJoinEvent e) {
		
		String playername = e.getPlayer().getName();
		
		if(haslist.contains(playername)) {
			
			return;
		}else {
			
			// create list called players name to store faction and other data
			
			 DataHolder nplayer = new DataHolder();
			 
			 
		((Playerdata) nplayer.Playerdata).Playernameacess(e.getPlayer().getName());
			
			haslist.add(e.getPlayer().getName());
		
		}
			
		
		
	}
	
	
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("fc") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			
			
			
			return true;
			
		}
		
		return false;
	}
	
	
}