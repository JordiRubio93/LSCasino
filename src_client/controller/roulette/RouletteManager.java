package controller.roulette;

import java.util.LinkedList;

import controller.Constants;
import controller.Manager;
import model.struct.bet.RouletteBet;
import model.struct.user.PublicUser;
import view.roulette.RouletteView;

public class RouletteManager {
	private Manager manager;
	private RouletteView game;
	private LinkedList<RouletteBet> apostesRuleta;

	public RouletteManager(Manager manager) {
		this.manager = manager;
		apostesRuleta = new LinkedList<RouletteBet>();
	}
	
	public void executaPartida(LinkedList<PublicUser> listUsers){
		game = (RouletteView) manager.getPanel(Constants.R_VIEW_NAME);
		
		//game.ompleLlista(listUsers);
	}
	
	public void afegeixAposta(RouletteBet bet){
		apostesRuleta.add(bet);
	}

	public void eliminaAposta(RouletteBet bet){
		for(int i = 0; i < apostesRuleta.size(); i++){
			if(apostesRuleta.get(i).equals(bet)){
				apostesRuleta.remove(i);
				break;
			}
		}
	}
	
	public LinkedList<RouletteBet> getApostesRuleta() {
		return apostesRuleta;
	}
}
