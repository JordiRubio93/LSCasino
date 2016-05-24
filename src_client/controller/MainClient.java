package controller;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingUtilities;

import tools.excepcions.TCPException;
import view.Dialeg;
import view.MainFrame;
import view.SplashScreen;
/**
 * 
 * <p>
 * <b> Classe: MainClient </b> <br/>
 * Implementa el main del client.
 * </p>
 * 
 * @version 1.0 19/05/2016
 * @author  Pol Valés - ls30599@salleurl.edu <br/>
 * 			Diego Bellino - ls30741@salleurl.edu <br/>
 * 			Enric Marin - ls31308@salleurl.edu <br/>
 * 			Jordi Rubió - ls31289@salleurl.edu <br/>
 * 			David Estepa - ls30622@salleurl.edu <br/>
 * 			Disseny i programació orientats a objectes. <br/>
 * 			La Salle - Universitat Ramon Llull. <br/>
 * 
 */
public class MainClient {
	/**
	 * Main del nostre servidor.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Manager manager = new Manager();
				//Si el servidor no hi es, no carrega y finilitza
				try {
					manager.checkServer();
				} catch (TCPException e) {
					new Dialeg().setWarningText("Server Disconected");
					System.exit(0);
				}
				SplashScreen splash = new SplashScreen();
				MainFrame mainFrame = new MainFrame(splash.getPanels());
				mainFrame.setManager(manager);
				manager.setMainFrame(mainFrame);
				new Timer().schedule(new TimerTask() {
		            @Override
			        public void run() {
						manager.startGame();
						mainFrame.setVisible(true);
						splash.getTranslucentWindow().stop();
			        }
			    }, Constants.SPLASH_TIME);
			}
		});
	}//Tancament del main
}//Tancament de la classe
