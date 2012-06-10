package com.github.sammy0025.TechnoPunishFire;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TechnoPunishFire extends JavaPlugin {
	Logger log;
	
	public void onEnable() {
		log = this.getLogger();
		
		log.info("Ignition Plugin Initialisation Complete");
	}
	
	public void onDisable() {
		log.info("Thanks for using Ignition and have a nice day");
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	Player player;
    	
        if(cmd.getName().equalsIgnoreCase("ignite")){
        	if (args.length == 1) {
            	player = Bukkit.getServer().getPlayer(args[0]);
            	
            	if (player == null) {
            		sender.sendMessage(ChatColor.RED + "Sorry, we cannot find that player.");
            		
            		return true;
            	}
        	}
        	else {
        		return false;
        	}
        	
        	player.setFireTicks(999999);
        	
            return true;
        }
        return false;
    }
}


