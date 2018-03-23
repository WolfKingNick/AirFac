package me.wolfkingnick;

import org.bukkit.plugin.java.JavaPlugin;


public class AirFac extends JavaPlugin {

	
	
    @Override
    public void onEnable() {
        new DataHolder();
    	new ShipMaker();
    	new ShipHolder();
    	
    	
        
        
   
    }
}