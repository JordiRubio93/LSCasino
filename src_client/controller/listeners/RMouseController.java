package controller.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.cavalls.PickHorseView;

public class RMouseController implements MouseListener{
	private PickHorseView window;

	public RMouseController(PickHorseView window){
		this.window = window;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//window.pintaBoto(window.getR());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		//window.despintaBoto(window.getR());
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
