package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jBtnUp;
	private JButton jBtnDown;
	private JLabel jLabelValue;

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new CounterListener(this);

		jBtnUp = new JButton("UP");
		jBtnUp.addActionListener(al);
		jBtnDown = new JButton("DOWN");
		jBtnDown.addActionListener(al);
		jLabelValue = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jBtnUp, BorderLayout.EAST);
		jPanel.add(jBtnDown, BorderLayout.WEST);
		jPanel.add(jLabelValue, BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void increment() {
		this.counterModel.increment();
		this.jLabelValue.setText(this.counterModel.getValue() + "");
	}
	
	public void decrement() {
		this.counterModel.decrement();
		this.jLabelValue.setText(this.counterModel.getValue() + "");
	}
}
