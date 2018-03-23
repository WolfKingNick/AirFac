package me.wolfkingnick;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class AirFac extends JavaPlugin {

    @Override
    public void onEnable() {
        new DataHolder();
    	new ShipMaker();
    	new ShipHolder();
    	
    	// Save a copy of the default config.yml if one is not there
        this.saveDefaultConfig();
        
        // Register a new listener
        getServer().getPluginManager().registerEvents(new Listener() {
            
            @EventHandler
            public void playerJoin(PlayerJoinEvent event) {
                // On player join send them the message from config.yml
                event.getPlayer().sendMessage(getConfig().getString("message"));
            }
        }, this);

        
        
        
        
        
        
        
        
        
   
    }
}