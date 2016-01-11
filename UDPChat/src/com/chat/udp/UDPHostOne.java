package com.chat.udp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class UDPHostOne extends JFrame implements Runnable, ActionListener {

	JTextField sentMsg = new JTextField(20);
	JTextArea  receivedMsg = new JTextArea();
	JButton sent = new JButton("发送");
	public UDPHostOne() {
		setTitle("One");
		setSize(400, 300);
		setVisible(true);
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		JScrollPane conterpanel = new JScrollPane();
		receivedMsg = new JTextArea();
		conterpanel.setViewportView(receivedMsg);
		container.add(conterpanel , BorderLayout.CENTER);
		receivedMsg.setEditable(false);
		JPanel bottompanel = new JPanel(new FlowLayout());
		sentMsg = new JTextField(20);
		sent = new JButton("发送");
		bottompanel.add(new JLabel("信息"));
		bottompanel.add(sentMsg);
		bottompanel.add(sent);
		container.add(bottompanel, BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
