package me.skylertyler.pgmmapcreator.utils;

import org.bukkit.event.Listener;

import me.skylertyler.pgmmapcreator.MapCreatorPlugin;

public class Utils {

	private MapCreatorPlugin plugin;

	public Utils(MapCreatorPlugin plugin) {
		this.plugin = plugin;
	}

	public void registerListener(Listener listener) {
		MapCreatorPlugin pcm = this.getPlugin();
		pcm.getPluginManager().registerEvents(listener, getPlugin());

	}

	public MapCreatorPlugin getPlugin() {
		return this.plugin;
	}
}
