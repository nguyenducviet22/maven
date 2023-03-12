package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView cv;
	public CounterListener(CounterView cv) {
		this.cv = cv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println("You have pressed " + src);
		
		if (src.equals("UP")) {
			this.cv.increment();
		} else if (src.equals("DOWN")) {
			this.cv.decrement();
		}
	}
}
