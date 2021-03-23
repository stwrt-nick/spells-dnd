package com.techelevator.dungeons_and_dragons_spells;

import java.net.http.HttpTimeoutException;
import java.util.List;
import java.util.Scanner;



public class UserInterface {
	
	private static final Scanner in = new Scanner(System.in);
	SpellFinder spellFinder = new SpellFinder();
	Spells spells = new Spells();
	
	
	public int displayMainMenu () {
		int selection = 0;
		
		while (selection == 0) {
		System.out.println("-----Spell Slot Tracker-----");
		System.out.println("(1) Dice Roller");
		System.out.println("(2) Spell Slot Counter");
		System.out.println("(3) Spell Finder");
		System.out.println("(4) Quit");
		System.out.println();
		System.out.print("Make your selection: ");
		
		String userSelection = in.nextLine();
		try { selection = Integer.parseInt(userSelection);
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("Please enter a valid number.");
			selection = 0;
		}
		System.out.println();
		
		}
		return selection;

	}
	
	public String findSpell() {
		String spellToFind;
		
		System.out.println("-----Spell Finder-----");
		System.out.println();
		System.out.print("Find a spell: ");
		String spellInput = in.nextLine();
		if (spellInput.contains(" ")) {
			spellInput = spellInput.replace(" ", "-");
			spellInput = spellInput.toLowerCase();
		} else {
			return spellInput.toLowerCase();
		}
		
		spellToFind = spellInput;
		return spellInput;
	}
	
	public void printSpellDetails(List<Spells> spellDetails) {
		System.out.println("------------------------------");
		System.out.println("Spell Details");
		System.out.println("------------------------------");
		if (spells == null) {
			System.out.println("No spell to print");
		} else {
			for (Spells spell : spellDetails) {
			System.out.println("Name: " + spell.getName());
			System.out.println("Description: " + spell.getDesc());
			System.out.println("Higher Level casting: " + spell.getHigher_level());
			System.out.println("Range: " + spell.getRange());
			System.out.println("Duration: " + spell.getDuration());
			System.out.println("Casting Time: " + spell.getCasting_time());
			System.out.println("Level: " + spell.getLevel());
			}
			System.out.println("\n");
		}
	}

	
	public int getSidesOnDice () {
		System.out.print("Enter number of sides on dice: ");
		String numberOfSides = in.nextLine();
		Integer numberOfSidesInt = Integer.parseInt(numberOfSides);
		return numberOfSidesInt;
	}
	
	public int getModifier () {
		System.out.print("Enter modifier to add to roll: ");
		String modifierToAdd = in.nextLine();
		Integer modifierToAddInt = Integer.parseInt(modifierToAdd);
		return modifierToAddInt;
	}
		
	public int getNumberOfDiceToRoll () {
		System.out.print("Enter number of dice to roll: ");
		String numberOfDice = in.nextLine();
		Integer numberOfDiceInt = Integer.parseInt(numberOfDice);
		return numberOfDiceInt;
	}
	
	public int displayDiceRoll (int diceRoll) {
		System.out.print("The result of the roll was " + diceRoll);
		System.out.println();
		return diceRoll;
	}
	

}
