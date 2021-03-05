package com.ystoreplugins.yspawners;

import org.bukkit.plugin.java.JavaPlugin;

import com.ystoreplugins.yspawners.config.Config;

import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin {
	
	public Economy econ;
	public Config config = new Config();

	@Override
	public void onEnable() {
	}

	@Override
	public void onDisable() {
	}

	public void register() {
	}
	
}