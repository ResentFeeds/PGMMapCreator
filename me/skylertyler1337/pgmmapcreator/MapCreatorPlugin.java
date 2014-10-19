package me.skylertyler.pgmmapcreator;

//== Not Sure if this works 100% (to be avised that this is still in development...)
import me.skylertyler.pgmmapcreator.listener.ConnectionListener;
import me.skylertyler.pgmmapcreator.utils.Utils;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MapCreatorPlugin extends JavaPlugin {

	public PluginManager pm;

	public Utils utils = new Utils(this);
	@Override
	public void onEnable() {
	}
	
	public PluginManager getPluginManager() {
		return this.pm;
	}
	
	
	public Utils getUtils(){
		return this.utils;
	}
	@Override
	public void onDisable() {
	}
}
