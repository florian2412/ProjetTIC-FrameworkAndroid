
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class JLabelObserver extends JLabel implements Observer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3209164274183675330L;

	public JLabelObserver(String l) {
		super(l);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Model m = (Model) arg0;
		setText(m.getValeur());
	}

}
