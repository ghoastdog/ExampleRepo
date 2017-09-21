package game;

import javax.swing.JOptionPane;

public class game {
	public static void main(String[] args) {
		int event, userNum = 0;
		String option;
		int turn = 0;
		int playerHealth = 10;
		event = (int) (Math.random() * 6);
		JOptionPane.showMessageDialog(null, "To do something,press 1 or 2");
		boolean hasDog = false;

		do {

			event = (int) (Math.random() * 6);
			if (event == 0) {
				JOptionPane.showMessageDialog(null,
						"You sit on a rock,bored out of your mind. Do something with your life!");
				option = JOptionPane.showInputDialog("Enter 1 to sit and do nothing. Enter 2 to explore the world");
				userNum = Integer.parseInt(option);
				if (hasDog = true) {
					JOptionPane.showMessageDialog(null, "You decide to play with your puppy.");
					option = JOptionPane.showInputDialog("Enter 1 to throw a stick. Enter 2 to fake throw");
					userNum = Integer.parseInt(option);
						if (userNum == 1) {
							JOptionPane.showMessageDialog(null, "You throw the stick and the dog retrieves it. You repeat this until the day ends.");
							turn = turn + 1;
							event = (int) (Math.random() * 6);
						}else if (userNum == 2) {
							JOptionPane.showMessageDialog(null, "You fake throw the stick. The puppy suddenly transforms into the legendary Cereberus and rips you to shreds.");
							playerHealth = playerHealth - 1000000000;
							JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health. You burn in hell for all of eternity for your sins.");
							turn = turn + 1;
							event = (int) (Math.random() * 6);
						}
				}
				if (userNum == 1) {
					JOptionPane.showMessageDialog(null, "You sit on a log, doing absolutely nothing");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);

				} else if (userNum == 2) {
					JOptionPane.showMessageDialog(null,
							"Meh, not today. You take a 10 hour nap and leave the exploring to another day.");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
					}
				 
				}else if (event == 1) {
				JOptionPane.showMessageDialog(null, "A mob of savages runs towards you. They look pretty scary...");
				option = JOptionPane
						.showInputDialog("Enter 1 to run away like the pansy you are. Enter 2 to show 'em who's boss!");
				userNum = Integer.parseInt(option);
				if (hasDog == true) {
					JOptionPane.showMessageDialog(null, "Your dog transforms into a dire wolf. He protec and attac");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
				if (userNum == 1) {
					JOptionPane.showMessageDialog(null,
							"You sprint straight into the woods. You see that the mobb has stopped chasing you.");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				} else if (userNum == 2) {
					JOptionPane.showMessageDialog(null,
							"You face your enemies, armed only with your fists as you let out a battlecry as you run into the mob. They beat you mercilessly and attempt to steal whatever you have. Unfortunately for them, you Have nothing.");
					playerHealth = playerHealth - 5;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
			} else if (event == 2) {
				JOptionPane.showMessageDialog(null, "Oh no! An angry sloth approaches!ʕ·͡ᴥ·ʔ");
				option = JOptionPane.showInputDialog("Enter 1 to hide. Enter 2 to defend yourself");
				userNum = Integer.parseInt(option);
				if (hasDog == true) {
					JOptionPane.showMessageDialog(null, "The puppy and the sloth become best friends!");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
				if (userNum == 1) {
					JOptionPane.showMessageDialog(null,
							"You run and hide behind a tree and get a splinter. You're safe. For now...");
					playerHealth = playerHealth - 1;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				} else if (userNum == 2) {
					JOptionPane.showMessageDialog(null, "You chuck the sloth into a nearby tree.");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
			} else if (event == 3) {
				JOptionPane.showMessageDialog(null,
						"While drinking some stagnant water from a nearby puddle, you begin to feel sick");
				option = JOptionPane.showInputDialog("Enter 1 to continue drinking. Enter 2 to seek medical help");
				userNum = Integer.parseInt(option);

				if (userNum == 1) {
					JOptionPane.showMessageDialog(null,
							"For some reason, drinking this microbe infested water seems like a good idea to you. You lap up the entire puddle and begin to projectile vomit everywhere.");
					playerHealth = playerHealth - 2;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				} else if (userNum == 2) {
					JOptionPane.showMessageDialog(null,
							"You stary further into the woods, hoping to find anyone that could help you. An elf appears and offers you his magical dirt. With nothing to lose, you stuff you face with it.");
					playerHealth = playerHealth + 1;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
			} else if (event == 4) {
				JOptionPane.showMessageDialog(null, "Oh no! A sPoNtAnEoUs EaRtHqUaKe!!!");
				option = JOptionPane.showInputDialog("Enter 1 to stop, drop and roll. Enter 2 to pray to the gods");
				userNum = Integer.parseInt(option);

				if (userNum == 1) {
					JOptionPane.showMessageDialog(null,
							"You stop, drop, and roll. Mid roll, a tree falls and squishes you to death. Wait, wasn't stop-drop-roll for fires only?");
					playerHealth = playerHealth - 10;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					event = (int) (Math.random() * 6);
				} else if (userNum == 2) {
					JOptionPane.showMessageDialog(null,
							"You fall to your knees as the ground rumbles. You pray to whatever being might be out ther when suddenly, the clouds divide and the ground stops shaking");
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					turn = turn + 1;
					event = (int) (Math.random() * 6);
				}
			} else if (event == 5) {
				JOptionPane.showMessageDialog(null,
						"The sky fills with clouds. In the distance, you hear what appears to be intense meowing and barking....IT'S RAINING CATS AND DOGS");
				option = JOptionPane.showInputDialog("Enter 1 to catch some cats. Enter 2 to catch some dogs");
				userNum = Integer.parseInt(option);

				if (userNum == 1) {
					JOptionPane.showMessageDialog(null,
							"3 cats fall from the sky onto your face. They procede to claw your face off.");
					playerHealth = playerHealth - 3;
					JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
					event = (int) (Math.random() * 6);
				}
			 else if (userNum == 2) {
				JOptionPane.showMessageDialog(null, "Sky pupper does a fall. He will now protec and attac");
				JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health");
				event = (int) (Math.random() * 6);
				hasDog = true;
			}
			}

		} while (playerHealth > 0 && (turn < 15));
		if (playerHealth <= 0) {
			JOptionPane.showMessageDialog(null, "YOU DIED ｡:ﾟ(;´∩`;)ﾟ:｡");
		} else {
			JOptionPane.showMessageDialog(null, "YOU WIN!☆｡､::｡.::･’ﾟ＼＼￣(ｴ)￣)♪clap clap♪(￣(ｴ)￣／／ﾟ’･::.｡::､｡☆");
		}
	}
}