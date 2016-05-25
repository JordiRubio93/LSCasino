package tools.excepcions;
/**
 * 
 * <p>
 * <b> Classe: BaseException </b> <br/>
 * Clase abstracte per gestionar les nostres Excepcions en el codi
 * </p>
 * 
 * @version 1.0 19/05/2016
 * @author Pol Valés - ls30599@salleurl.edu <br/>
 *         Diego Bellino - ls30741@salleurl.edu <br/>
 *         Enric Marin - ls31308@salleurl.edu <br/>
 *         Jordi Rubió - ls31289@salleurl.edu <br/>
 *         David Estepa - ls30622@salleurl.edu <br/>
 *         Disseny i programació orientats a objectes. <br/>
 *         La Salle - Universitat Ramon Llull. <br/>
 * 
 */
public class BaseException extends Exception {
	private static final long serialVersionUID = 1L;
	
    public BaseException(String msg) {
    	super(msg);
    }

}