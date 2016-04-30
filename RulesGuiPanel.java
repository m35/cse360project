package cse360pro1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Graphic User Interface for viewing the rules of the game
 * 
 * @author team 8
 */
public class RulesGuiPanel extends JPanel
{
	/**
	 * vairiables for displaying the rules gui
	 */
	private final int WIDTH = 500, HEIGHT = 500;
	private JButton okay;

	/**
	 * Creates a new RulesGuiPanel
	 */
	public RulesGuiPanel()
	{
		okay = new JButton("Got it");
		okay.addActionListener(new ButtonListener());

		add(okay);

		setPreferredSize(new Dimension(500, 500));
		
		this.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okay);
		this.add(buttonPanel,BorderLayout.SOUTH);
	}
	
	/**
	 * button listener for user to see screen
	 *
	 */
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == okay) 
			{
                getRootPane().getParent().setVisible(false);
            }
		}
	}
	
	/**
	 * prints the rules onto the gui
	 */
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.black);
		page.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		
		page.drawString("1. Players roll 3 dice at a time.", 50, 50);
		page.drawString("2. Players must roll and record those stats every turn.", 50, 50 + 30);
		page.drawString("3. Any player to roll 3 1s automatically loses and", 50, 50 + 60);
		page.drawString("must wait for the next game.", 70, 50 + 90);
		page.drawString("4. The first player to roll all 6s wins the game", 50, 50 + 120);
		page.drawString("no matter the scores.", 70, 50 + 150);
		page.drawString("5. If a player rolls all 3s all other players scores", 50, 50 + 180);
		page.drawString("reset to 0.", 70, 50 + 210);
		page.drawString("6. If a player rolls two of a kind they can roll again.", 50, 50 + 240);
		page.drawString("7. The first player with a total >= 100 wins the game.", 50, 50 + 270);
		page.drawString("8. The end of the game will rank all of the players on", 50, 50 + 300);
		page.drawString("who is closest to 100.", 70, 50 + 330);
		page.drawString("9. Game requires four players to start.", 50, 50 + 360);

	}
}
