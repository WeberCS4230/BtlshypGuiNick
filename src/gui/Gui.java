package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import main.btlshyp.message.AttackResponseMessage;
import main.btlshyp.message.AttackResponseMessage.HitOrMiss;
import main.btlshyp.model.Coordinate;
import main.btlshyp.model.Ship;
import main.btlshyp.view.View;
import main.btlshyp.view.event.AttackEvent;
import main.btlshyp.view.event.AttackListener;
import main.btlshyp.view.event.ChatEvent;
import main.btlshyp.view.event.ChatListener;
import main.btlshyp.view.event.SetShipEvent;
import main.btlshyp.view.event.SetShipListener;
import net.miginfocom.swing.MigLayout;

public class Gui extends View {
	private static final long serialVersionUID = 1L;
	private final JTextField textEntry;
	JTextArea txtArea;
	JScrollPane scrollPane;
	JButton btnAttack;
	String username = "";
	ArrayList<Coordinate> newShipCoor;
	Map<Coordinate, JCheckBox> yourCoorMap;
	Map<Coordinate, JCheckBox> oppCoorMap;
	ArrayList<Coordinate> yourCoord;
	ArrayList<Coordinate> oppCoord;
	Coordinate attackCoor;
	JScrollBar vertical;

	public Gui() {
		super();
		setSize(new Dimension(500, 320));
		getContentPane().setLayout(new MigLayout("fill",
				"[8.00,grow][9.00,grow][][][][][][14.00][6.00][8.00][4.00][-27.00][160.00,grow][17.00][73.00]",
				"[11.00][29.00][][][32.00][50.00,grow][5.00][][][][]"));

		newShipCoor = new ArrayList<Coordinate>();
		yourCoorMap = new HashMap<Coordinate, JCheckBox>();
		oppCoorMap = new HashMap<Coordinate, JCheckBox>();
		yourCoord = new ArrayList<>();
		oppCoord = new ArrayList<>();

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				yourCoord.add(new Coordinate(i, j));
			}
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				oppCoord.add(new Coordinate(i, j));
			}
		}

		JCheckBox checkBox = new JCheckBox("");
		getContentPane().add(checkBox, "cell 2 1");
		oppCoorMap.put(oppCoord.get(5), checkBox);

		JCheckBox checkBox_1 = new JCheckBox("");
		getContentPane().add(checkBox_1, "cell 3 1");
		oppCoorMap.put(oppCoord.get(6), checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("");
		getContentPane().add(checkBox_2, "cell 4 1");
		oppCoorMap.put(oppCoord.get(7), checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("");
		getContentPane().add(checkBox_3, "cell 5 1");
		oppCoorMap.put(oppCoord.get(8), checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("");
		getContentPane().add(checkBox_4, "cell 6 1");
		oppCoorMap.put(oppCoord.get(9), checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("");
		getContentPane().add(checkBox_5, "cell 2 2");
		oppCoorMap.put(oppCoord.get(10), checkBox_5);

		JCheckBox checkBox_6 = new JCheckBox("");
		getContentPane().add(checkBox_6, "cell 3 2");
		oppCoorMap.put(oppCoord.get(11), checkBox_6);

		JCheckBox checkBox_7 = new JCheckBox("");
		getContentPane().add(checkBox_7, "cell 4 2");
		oppCoorMap.put(oppCoord.get(12), checkBox_7);

		JCheckBox checkBox_8 = new JCheckBox("");
		getContentPane().add(checkBox_8, "cell 5 2");
		oppCoorMap.put(oppCoord.get(13), checkBox_8);

		JCheckBox checkBox_9 = new JCheckBox("");
		getContentPane().add(checkBox_9, "cell 6 2");
		oppCoorMap.put(oppCoord.get(14), checkBox_9);

		JCheckBox checkBox_10 = new JCheckBox("");
		getContentPane().add(checkBox_10, "cell 2 0");
		oppCoorMap.put(oppCoord.get(0), checkBox_10);

		JCheckBox checkBox_11 = new JCheckBox("");
		getContentPane().add(checkBox_11, "cell 3 0");
		oppCoorMap.put(oppCoord.get(1), checkBox_11);

		JCheckBox checkBox_12 = new JCheckBox("");
		getContentPane().add(checkBox_12, "cell 4 0");
		oppCoorMap.put(oppCoord.get(2), checkBox_12);

		JCheckBox checkBox_13 = new JCheckBox("");
		getContentPane().add(checkBox_13, "cell 5 0");
		oppCoorMap.put(oppCoord.get(3), checkBox_13);

		JCheckBox checkBox_14 = new JCheckBox("");
		getContentPane().add(checkBox_14, "cell 6 0");
		oppCoorMap.put(oppCoord.get(4), checkBox_14);

		JCheckBox checkBox_15 = new JCheckBox("");
		getContentPane().add(checkBox_15, "cell 2 3");
		oppCoorMap.put(oppCoord.get(15), checkBox_15);

		JCheckBox checkBox_16 = new JCheckBox("");
		getContentPane().add(checkBox_16, "cell 3 3");
		oppCoorMap.put(oppCoord.get(16), checkBox_16);

		JCheckBox checkBox_17 = new JCheckBox("");
		getContentPane().add(checkBox_17, "cell 4 3");
		oppCoorMap.put(oppCoord.get(17), checkBox_17);

		JCheckBox checkBox_18 = new JCheckBox("");
		getContentPane().add(checkBox_18, "cell 5 3");
		oppCoorMap.put(oppCoord.get(18), checkBox_18);

		JCheckBox checkBox_19 = new JCheckBox("");
		getContentPane().add(checkBox_19, "cell 6 3");
		oppCoorMap.put(oppCoord.get(19), checkBox_19);

		JCheckBox checkBox_20 = new JCheckBox("");
		getContentPane().add(checkBox_20, "cell 2 4");
		oppCoorMap.put(oppCoord.get(20), checkBox_20);

		JCheckBox checkBox_21 = new JCheckBox("");
		getContentPane().add(checkBox_21, "cell 3 4");
		oppCoorMap.put(oppCoord.get(21), checkBox_21);

		JCheckBox checkBox_22 = new JCheckBox("");
		getContentPane().add(checkBox_22, "cell 4 4");
		oppCoorMap.put(oppCoord.get(22), checkBox_22);

		JCheckBox checkBox_23 = new JCheckBox("");
		getContentPane().add(checkBox_23, "cell 5 4");
		oppCoorMap.put(oppCoord.get(23), checkBox_23);

		JCheckBox checkBox_24 = new JCheckBox("");
		getContentPane().add(checkBox_24, "cell 6 4");
		oppCoorMap.put(oppCoord.get(24), checkBox_24);

		JCheckBox checkBox_49 = new JCheckBox("");
		getContentPane().add(checkBox_49, "cell 2 6");
		yourCoorMap.put(yourCoord.get(0), checkBox_49);

		JCheckBox checkBox_25 = new JCheckBox("");
		getContentPane().add(checkBox_25, "cell 3 6");
		yourCoorMap.put(yourCoord.get(1), checkBox_25);

		JCheckBox checkBox_26 = new JCheckBox("");
		getContentPane().add(checkBox_26, "cell 4 6");
		yourCoorMap.put(yourCoord.get(2), checkBox_26);

		JCheckBox checkBox_27 = new JCheckBox("");
		getContentPane().add(checkBox_27, "cell 5 6");
		yourCoorMap.put(yourCoord.get(3), checkBox_27);

		JCheckBox checkBox_28 = new JCheckBox("");
		getContentPane().add(checkBox_28, "cell 6 6");
		yourCoorMap.put(yourCoord.get(4), checkBox_28);

		JCheckBox checkBox_29 = new JCheckBox("");
		getContentPane().add(checkBox_29, "cell 2 7");
		yourCoorMap.put(yourCoord.get(5), checkBox_29);

		JCheckBox checkBox_30 = new JCheckBox("");
		getContentPane().add(checkBox_30, "cell 3 7");
		yourCoorMap.put(yourCoord.get(6), checkBox_30);

		JCheckBox checkBox_31 = new JCheckBox("");
		getContentPane().add(checkBox_31, "cell 4 7");
		yourCoorMap.put(yourCoord.get(7), checkBox_31);

		JCheckBox checkBox_32 = new JCheckBox("");
		getContentPane().add(checkBox_32, "cell 5 7");
		yourCoorMap.put(yourCoord.get(8), checkBox_32);

		JCheckBox checkBox_33 = new JCheckBox("");
		getContentPane().add(checkBox_33, "cell 6 7");
		yourCoorMap.put(yourCoord.get(9), checkBox_33);

		JCheckBox checkBox_34 = new JCheckBox("");
		getContentPane().add(checkBox_34, "cell 2 8");
		yourCoorMap.put(yourCoord.get(10), checkBox_34);

		JCheckBox checkBox_35 = new JCheckBox("");
		getContentPane().add(checkBox_35, "cell 3 8");
		yourCoorMap.put(yourCoord.get(11), checkBox_35);

		JCheckBox checkBox_36 = new JCheckBox("");
		getContentPane().add(checkBox_36, "cell 4 8");
		yourCoorMap.put(yourCoord.get(12), checkBox_36);

		JCheckBox checkBox_37 = new JCheckBox("");
		getContentPane().add(checkBox_37, "cell 5 8");
		yourCoorMap.put(yourCoord.get(13), checkBox_37);

		JCheckBox checkBox_38 = new JCheckBox("");
		getContentPane().add(checkBox_38, "cell 6 8");
		yourCoorMap.put(yourCoord.get(14), checkBox_38);

		JCheckBox checkBox_39 = new JCheckBox("");
		getContentPane().add(checkBox_39, "cell 2 9");
		yourCoorMap.put(yourCoord.get(15), checkBox_39);

		JCheckBox checkBox_40 = new JCheckBox("");
		getContentPane().add(checkBox_40, "cell 3 9");
		yourCoorMap.put(yourCoord.get(16), checkBox_40);

		JCheckBox checkBox_41 = new JCheckBox("");
		getContentPane().add(checkBox_41, "cell 4 9");
		yourCoorMap.put(yourCoord.get(17), checkBox_41);

		JCheckBox checkBox_42 = new JCheckBox("");
		getContentPane().add(checkBox_42, "cell 5 9");
		yourCoorMap.put(yourCoord.get(18), checkBox_42);

		JCheckBox checkBox_43 = new JCheckBox("");
		getContentPane().add(checkBox_43, "cell 6 9");
		yourCoorMap.put(yourCoord.get(19), checkBox_43);

		JCheckBox checkBox_44 = new JCheckBox("");
		getContentPane().add(checkBox_44, "cell 2 10");
		yourCoorMap.put(yourCoord.get(20), checkBox_44);

		JCheckBox checkBox_45 = new JCheckBox("");
		getContentPane().add(checkBox_45, "cell 3 10");
		yourCoorMap.put(yourCoord.get(21), checkBox_45);

		JCheckBox checkBox_46 = new JCheckBox("");
		getContentPane().add(checkBox_46, "cell 4 10");
		yourCoorMap.put(yourCoord.get(22), checkBox_46);

		JCheckBox checkBox_47 = new JCheckBox("");
		getContentPane().add(checkBox_47, "cell 5 10");
		yourCoorMap.put(yourCoord.get(23), checkBox_47);

		JCheckBox checkBox_48 = new JCheckBox("");
		getContentPane().add(checkBox_48, "cell 6 10");
		yourCoorMap.put(yourCoord.get(24), checkBox_48);

		for (Map.Entry<Coordinate, JCheckBox> m : yourCoorMap.entrySet()) {
			m.getValue().setBackground(Color.BLUE);
		}

		for (Map.Entry<Coordinate, JCheckBox> m : oppCoorMap.entrySet()) {
			m.getValue().setBackground(Color.BLUE);
		}

		for (Map.Entry<Coordinate, JCheckBox> m : yourCoorMap.entrySet()) {
			m.getValue().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					newShipCoor.add(m.getKey());
				}
			});
		}

		for (Map.Entry<Coordinate, JCheckBox> m : oppCoorMap.entrySet()) {
			m.getValue().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					attackCoor = m.getKey();
				}
			});
		}

		JTextArea spacer = new JTextArea();
		spacer.setEditable(false);
		getContentPane().add(spacer, "cell 0 5 8 1,grow");

		txtArea = new JTextArea();
		txtArea.setLineWrap(true);
		scrollPane = new JScrollPane(txtArea);
		getContentPane().add(scrollPane, "cell 12 0 1 10,grow");
		vertical = scrollPane.getVerticalScrollBar();

		btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendAttack(e);
				attackCoor = null;
			}
		});
		getContentPane().add(btnAttack, "cell 14 8,growx");

		JButton btnSetShips = new JButton("Set Ships");
		btnSetShips.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attemptSetShip(e);
				newShipCoor.clear();
			}
		});
		getContentPane().add(btnSetShips, "cell 14 9");

		textEntry = new JTextField();
		getContentPane().add(textEntry, "cell 12 10,growx");
		textEntry.setColumns(10);

		JButton btnSendChat = new JButton("Send");
		btnSendChat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendChat(e);
			}
		});

		textEntry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String entry = textEntry.getText();
					txtArea.append(username + ": " + entry + "\n");
					vertical.setValue(vertical.getMaximum());

					textEntry.setText("");
				}
			}
		});
		getContentPane().add(btnSendChat, "cell 14 10,growx,aligny center");

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void attemptSetShip(ActionEvent e) {
		ArrayList<Coordinate> newList = new ArrayList<>(newShipCoor);
		Ship ship = shipToPlace;
		ship.setShipCoordinates(newList);
		SetShipEvent sse = new SetShipEvent(e, ship);
		if (setShipListener != null) {
			setShipListener.setShipEventOccurred(sse);
		}
		for (Coordinate c : newShipCoor) {
			yourCoorMap.get(c).setBackground(new Color(0, 0, 0));
			System.out.println(c.x + " " + c.y);
		}
	}

	@Override
	public void displayAttack(AttackResponseMessage message) {
		txtArea.append("Your attack was a " + message.getHitOrMiss().toString() + " at ("
				+ String.valueOf(message.getCoordinate().x) + ", " + String.valueOf(message.getCoordinate().y) + ")\n");
		if (message.getHitOrMiss() == HitOrMiss.HIT) {
			oppCoorMap.get(message.getCoordinate()).setBackground(Color.RED);
		} else {
			oppCoorMap.get(message.getCoordinate()).setBackground(Color.WHITE);
			vertical.setValue(vertical.getMaximum());
		}
	}

	@Override
	public void displayChat(String user, String chat) {
		txtArea.append(user + ": " + chat + "\n");
		JScrollBar vertical = scrollPane.getVerticalScrollBar();
		vertical.setValue(vertical.getMaximum());
	}

	@Override
	public void displayNotification(String text) {
		txtArea.append("***" + text + "*** \n");
		vertical.setValue(vertical.getMaximum());
	}

	@Override
	public void displayOpponentAttack(AttackResponseMessage message) {
		txtArea.append("Opponent fired a " + message.getHitOrMiss().toString() + " at ("
				+ String.valueOf(message.getCoordinate().x) + ", " + String.valueOf(message.getCoordinate().y) + ")\n");
		yourCoorMap.get(message.getCoordinate()).setBackground(Color.RED);
		vertical.setValue(vertical.getMaximum());
	}

	@Override
	public void displayShip(Ship ship) {
		// TODO Auto-generated method stub
		super.displayShip(ship);
	}

	@Override
	public String getUsername() {
		username = super.getUsername();
		return super.getUsername();
	}

	@Override
	public void notYourTurn() {
		txtArea.append("Waiting on opponent...\n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		btnAttack.setEnabled(false);
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
		for (Map.Entry<Coordinate, JCheckBox> m : yourCoorMap.entrySet()) {
			m.getValue().setBackground(Color.BLUE);
			m.getValue().setSelected(false);
		}

		for (Map.Entry<Coordinate, JCheckBox> m : oppCoorMap.entrySet()) {
			m.getValue().setBackground(Color.BLUE);
			m.getValue().setSelected(false);
		}
		txtArea.append("\n\n***  Restarting game ......");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		txtArea.setText("");
	}

	@Override
	public void sendAttack(ActionEvent e) {
		Coordinate coordinate = attackCoor;
		AttackEvent ae = new AttackEvent(e, coordinate);
		if (attackListener != null) {
			attackListener.attackEventOccurred(ae);
		}
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
		txtArea.append(
				"Please choose " + ship.getShipSize() + " spaces to place your " + ship.getShipType().toString() + "\n");
		shipToPlace = ship;
	}

	@Override
	public void yourTurn() {
		txtArea.append("It is your turn...\n");
		btnAttack.setEnabled(true);
	}

}
