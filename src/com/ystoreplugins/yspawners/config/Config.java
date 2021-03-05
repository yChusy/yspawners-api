package com.ystoreplugins.yspawners.config;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yspawners.Main;

public class Config {

	public String naoTemMoney, comprouSpawner, comprouMelhoria, formatadorTrue, formatadorFalse, naoENumero, cancelou,
			localNaoSetado, localSetado, localRemovido, nome, naoPodeVender, naoPodeColetar, vendeu, invCheio,
			xpInsuficiente, limiteInsuficiente, naoEncontrado, naoEnumero, deu, converteu, ativou, espada, armazenou, deuSpawner,
			quantiaInsuficiente, recolheu, maxLimite;

	public double delayPreco, dropBonusPreco, bonusVendaPreco, dropBonusPorNivel, bonusVendaPorNivel, dropBonusDefault,
			bonusVendaDefault, delayPrt, dropBonusPrt, bonusVendaPrt, precosAcrescimo, lootingPl, sortudoPl, limiteDefault,
			limiteSpawnersDefault, limiteDropsDefault, limiteMax, limiteSpawnersMax, limiteDropsMax;

	public int delayPorNivel, delayMax, dropBonusMax, bonusVendaMax, delayDefault, raio, lootingDefault, sortudoDefault,
			danoDefault, precosLooting, precosSortudo, precosDano, maximoLooting, maximoSortudo, maximoDano, danoPl, mobStackMax;

	public ItemStack voltar, proximo, naoPode, matadoraItem, limite, naoPermissao, limiteSpawners, limiteDrops;

	public boolean sonsUsar, gerarOffline, gerarChunkDescarregada, interacaoAtivar, venda, coleta, armazemAtivar, matadoraUsar,
			xpMultiplicar, variacao, fixo, shiftUnitario, limiteDropsAtivar, limiteAtivar, limiteSpawnersAtivar;
	public Sound melhoria, spawner;

	public List<String> comprar = new ArrayList<>();
	public List<String> ativar = new ArrayList<>();
	public List<String> maxDropBonusLore = new ArrayList<>();
	public List<String> maxSpawnarLore = new ArrayList<>();
	public List<String> maxBonusVendaLore = new ArrayList<>();
	public List<String> digite = new ArrayList<>();
	public List<String> interacaoMsg = new ArrayList<>();

	public Config setup(Main main) {
		return this;
	}

}
