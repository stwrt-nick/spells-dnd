package com.techelevator.dungeons_and_dragons_spells;

import java.net.http.HttpClient;
import java.util.Scanner;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class App 
{
	public static final String API_URL = "https://www.dnd5eapi.co/api/spells/";
	public static RestTemplate restTemplate = new RestTemplate();
	private static Scanner scanner;

	private UserInterface userInterface;
	private DiceRoller diceRoller;
	private SpellFinder spellFinder;

	public App(UserInterface userInterface, DiceRoller diceRoller, SpellFinder spellFinder) {
		this.userInterface = userInterface;
		this.diceRoller = diceRoller;
		this.spellFinder = spellFinder;
	}

	public void run() {

		while (true) {
			int choice = userInterface.displayMainMenu();

			if (choice == 1) {
				int sides = userInterface.getSidesOnDice();
				int modifier = userInterface.getModifier();
				int numberOfDice = userInterface.getNumberOfDiceToRoll();

				int diceRoll = diceRoller.rollGenerator(sides, numberOfDice, modifier);
				int rollResult = userInterface.displayDiceRoll(diceRoll);
			}
			if (choice == 2) {
				int roll = 20;
			}
			if (choice == 3) {
				String spellName = userInterface.findSpell();
				userInterface.printSpellDetails(spellFinder.listDetailsForSpell(spellName));
			}

		}

	}

	public static void main(String[] args) {
		SpellFinder spellFinder = new SpellFinder();
		Spells spells = new Spells();
		UserInterface userInterface = new UserInterface();
		DiceRoller diceRoller = new DiceRoller(0, 0, 0);
		App cli = new App(userInterface, diceRoller, spellFinder);
		cli.run();
	}

}
