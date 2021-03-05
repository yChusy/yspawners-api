package com.ystoreplugins.yspawners.models;

import java.util.HashMap;
import java.util.List;

public class PlayerSpawner {

	public String nome;
	public double delayTem, xp;
	public double dropBonusTem, bonusVendaTem, limite, limiteSpawners, limiteArmazem;
	public HashMap<String, Double> spawners, delay;
	public List<String> ativos;
	public HashMap<String, Double> drops;
	public HashMap<String, String> local;

	public PlayerSpawner(String nome, double delayTem, double dropBonusTem, double bonusVendaTem, double xp,
			HashMap<String, Double> spawners, HashMap<String, Double> delay, HashMap<String, Double> drops,
			HashMap<String, String> local, List<String> ativos, double limite, double limiteSpawners, double limiteArmazem) {
		this.nome = nome;
		this.delayTem = delayTem;
		this.dropBonusTem = dropBonusTem;
		this.bonusVendaTem = bonusVendaTem;
		this.xp = xp;
		this.spawners = spawners;
		this.delay = delay;
		this.drops = drops;
		this.ativos = ativos;
		this.local = local;
		this.limite = limite;
		this.limiteSpawners = limiteSpawners;
		this.limiteArmazem = limiteArmazem;
	}
	
	public String getKey() {
		return this.nome;
	}

	public String getName() {
		return this.nome;
	}
	
	public double getTop() {
		return 0.0;
	}
}
