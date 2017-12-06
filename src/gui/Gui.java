package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import main.btlshyp.message.AttackResponseMessage;
import main.btlshyp.model.Ship;
import main.btlshyp.view.View;
import main.btlshyp.view.event.AttackListener;
import main.btlshyp.view.event.ChatEvent;
import main.btlshyp.view.event.ChatListener;
import main.btlshyp.view.event.SetShipListener;
import net.miginfocom.swing.MigLayout;

public class Gui extends View {
	private final JTextField textEntry;
	JTextArea textArea;

	public Gui() {
		super();
		getContentPane().setLayout(new MigLayout("",
				"[8.00,grow][9.00,grow][][][][][][14.00][6.00][8.00][4.00][-27.00][160.00,grow][17.00][73.00]",
				"[11.00,grow][29.00][][][24.00][5.00,grow][][][][]"));

		JCheckBox checkBox_10 = new JCheckBox("");
		getContentPane().add(checkBox_10, "cell 2 0");

		JCheckBox checkBox_11 = new JCheckBox("");
		getContentPane().add(checkBox_11, "cell 3 0");

		JCheckBox checkBox_12 = new JCheckBox("");
		getContentPane().add(checkBox_12, "cell 4 0");

		JCheckBox checkBox_13 = new JCheckBox("");
		getContentPane().add(checkBox_13, "cell 5 0");

		JCheckBox checkBox_14 = new JCheckBox("");
		getContentPane().add(checkBox_14, "cell 6 0");

		textArea = new JTextArea();
		textArea.setEditable(false);
		getContentPane().add(textArea, "cell 12 0 1 9,grow");

		JCheckBox checkBox = new JCheckBox("");
		getContentPane().add(checkBox, "cell 2 1");

		JCheckBox checkBox_1 = new JCheckBox("");
		getContentPane().add(checkBox_1, "cell 3 1");

		JCheckBox checkBox_2 = new JCheckBox("");
		getContentPane().add(checkBox_2, "cell 4 1");

		JCheckBox checkBox_3 = new JCheckBox("");
		getContentPane().add(checkBox_3, "cell 5 1");

		JCheckBox checkBox_4 = new JCheckBox("");
		getContentPane().add(checkBox_4, "cell 6 1");

		JCheckBox checkBox_5 = new JCheckBox("");
		getContentPane().add(checkBox_5, "cell 2 2");

		JCheckBox checkBox_6 = new JCheckBox("");
		getContentPane().add(checkBox_6, "cell 3 2");

		JCheckBox checkBox_7 = new JCheckBox("");
		getContentPane().add(checkBox_7, "cell 4 2");

		JCheckBox checkBox_8 = new JCheckBox("");
		getContentPane().add(checkBox_8, "cell 5 2");

		JCheckBox checkBox_9 = new JCheckBox("");
		getContentPane().add(checkBox_9, "cell 6 2");

		JCheckBox checkBox_15 = new JCheckBox("");
		getContentPane().add(checkBox_15, "cell 2 3");

		JCheckBox checkBox_16 = new JCheckBox("");
		getContentPane().add(checkBox_16, "cell 3 3");

		JCheckBox checkBox_17 = new JCheckBox("");
		getContentPane().add(checkBox_17, "cell 4 3");

		JCheckBox checkBox_18 = new JCheckBox("");
		getContentPane().add(checkBox_18, "cell 5 3");

		JCheckBox checkBox_19 = new JCheckBox("");
		getContentPane().add(checkBox_19, "cell 6 3");

		JCheckBox checkBox_20 = new JCheckBox("");
		getContentPane().add(checkBox_20, "cell 2 4");

		JCheckBox checkBox_21 = new JCheckBox("");
		getContentPane().add(checkBox_21, "cell 3 4");

		JCheckBox checkBox_23 = new JCheckBox("");
		getContentPane().add(checkBox_23, "cell 4 4");

		JCheckBox checkBox_22 = new JCheckBox("");
		getContentPane().add(checkBox_22, "cell 5 4");

		JCheckBox checkBox_24 = new JCheckBox("");
		getContentPane().add(checkBox_24, "cell 6 4");

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		getContentPane().add(chckbxNewCheckBox, "cell 2 5");

		JCheckBox checkBox_25 = new JCheckBox("");
		getContentPane().add(checkBox_25, "cell 3 5");

		JCheckBox checkBox_26 = new JCheckBox("");
		getContentPane().add(checkBox_26, "cell 4 5");

		JCheckBox checkBox_27 = new JCheckBox("");
		getContentPane().add(checkBox_27, "cell 5 5");

		JCheckBox checkBox_28 = new JCheckBox("");
		getContentPane().add(checkBox_28, "cell 6 5");

		JCheckBox checkBox_29 = new JCheckBox("");
		getContentPane().add(checkBox_29, "cell 2 6");

		JCheckBox checkBox_30 = new JCheckBox("");
		getContentPane().add(checkBox_30, "cell 3 6");

		JCheckBox checkBox_31 = new JCheckBox("");
		getContentPane().add(checkBox_31, "cell 4 6");

		JCheckBox checkBox_32 = new JCheckBox("");
		getContentPane().add(checkBox_32, "cell 5 6");

		JCheckBox checkBox_33 = new JCheckBox("");
		getContentPane().add(checkBox_33, "cell 6 6");

		JCheckBox checkBox_34 = new JCheckBox("");
		getContentPane().add(checkBox_34, "cell 2 7");

		JCheckBox checkBox_35 = new JCheckBox("");
		getContentPane().add(checkBox_35, "cell 3 7");

		JCheckBox checkBox_36 = new JCheckBox("");
		getContentPane().add(checkBox_36, "cell 4 7");

		JCheckBox checkBox_37 = new JCheckBox("");
		getContentPane().add(checkBox_37, "cell 5 7");

		JCheckBox checkBox_38 = new JCheckBox("");
		getContentPane().add(checkBox_38, "cell 6 7");

		JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendAttack(e);
			}
		});
		getContentPane().add(btnAttack, "cell 14 7,growx");

		JCheckBox checkBox_39 = new JCheckBox("");
		getContentPane().add(checkBox_39, "cell 2 8");

		JCheckBox checkBox_40 = new JCheckBox("");
		getContentPane().add(checkBox_40, "cell 3 8");

		JCheckBox checkBox_41 = new JCheckBox("");
		getContentPane().add(checkBox_41, "cell 4 8");

		JCheckBox checkBox_42 = new JCheckBox("");
		getContentPane().add(checkBox_42, "cell 5 8");

		JCheckBox checkBox_43 = new JCheckBox("");
		getContentPane().add(checkBox_43, "cell 6 8");

		JButton btnSetShips = new JButton("Set Ships");
		btnSetShips.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attemptSetShip(e);
			}
		});
		getContentPane().add(btnSetShips, "cell 14 8");

		JCheckBox checkBox_44 = new JCheckBox("");
		getContentPane().add(checkBox_44, "cell 2 9");

		JCheckBox checkBox_45 = new JCheckBox("");
		getContentPane().add(checkBox_45, "cell 3 9");

		JCheckBox checkBox_46 = new JCheckBox("");
		getContentPane().add(checkBox_46, "cell 4 9");

		JCheckBox checkBox_47 = new JCheckBox("");
		getContentPane().add(checkBox_47, "cell 5 9");

		JCheckBox checkBox_48 = new JCheckBox("");
		getContentPane().add(checkBox_48, "cell 6 9");

		textEntry = new JTextField();
		getContentPane().add(textEntry, "cell 12 9,growx");
		textEntry.setColumns(10);

		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendChat(e);
			}
		});
		getContentPane().add(btnNewButton, "cell 14 9,growx,aligny center");

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void attemptSetShip(ActionEvent e) {
		// TODO Auto-generated method stub
		super.attemptSetShip(e);
	}

	@Override
	public void displayAttack(AttackResponseMessage message) {
		// TODO Auto-generated method stub
		super.displayAttack(message);
	}

	@Override
	public void displayChat(String user, String chat) {
		textArea.append(user + ": " + chat);
		textArea.append("\n");
		super.displayChat(user, chat);
	}

	@Override
	public void displayNotification(String text) {
		textArea.append("***" + text + "***");
		textArea.append("\n");
		super.displayNotification(text);
	}

	@Override
	public void displayOpponentAttack(AttackResponseMessage message) {
		// TODO Auto-generated method stub
		super.displayOpponentAttack(message);
	}

	@Override
	public void displayShip(Ship ship) {
		// TODO Auto-generated method stub
		super.displayShip(ship);
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public void notYourTurn() {
		// TODO Auto-generated method stub
		super.notYourTurn();
	}

	@Override
	public void registerAttackListener(AttackListener listener) {
		// TODO Auto-generated method stub
		super.registerAttackListener(listener);
	}

	@Override
	public void registerChatListener(ChatListener listener) {
		// TODO Auto-generated method stub
		super.registerChatListener(listener);
	}

	@Override
	public void registerSetShipListener(SetShipListener listener) {
		// TODO Auto-generated method stub
		super.registerSetShipListener(listener);
	}

	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
		super.resetGame();
	}

	@Override
	public void sendAttack(ActionEvent e) {
		// TODO Auto-generated method stub
		super.sendAttack(e);
	}

	@Override
	public void sendChat(ActionEvent e) {
		String chat = textEntry.getText();
		ChatEvent chatEvent = new ChatEvent(this, chat);
		if (chatListener != null) {
			chatListener.chatEventOccurred(chatEvent);
		}
		textEntry.setText("");
	}

	@Override
	public void setShip(Ship ship) {
		// TODO Auto-generated method stub
		super.setShip(ship);
	}

	@Override
	public void yourTurn() {
		// TODO Auto-generated method stub
		super.yourTurn();
	}

}
