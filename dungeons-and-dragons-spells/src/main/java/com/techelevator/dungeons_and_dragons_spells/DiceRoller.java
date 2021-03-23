package com.techelevator.dungeons_and_dragons_spells;

import java.util.Random;

public class DiceRoller {
	
		private int sidesOfDie;
		private int timesToRoll;
		private int modifiers;
		
		public DiceRoller(int sidesOfDie, int timesToRoll, int modifiers) {
			this.sidesOfDie = sidesOfDie;
			this.timesToRoll = timesToRoll;
			this.modifiers = modifiers;
		}

		public int getSidesOfDie() {
			return sidesOfDie;
		}

		public int getTimesToRoll() {
			return timesToRoll;
		}

		public int getModifiers() {
			return modifiers;
		}

		//Roll generator
		//Line
		public int rollGenerator(int sidesOfDie, int timesToRoll, int modifiers) {
			Random random = new Random();
			int roll = (random.nextInt(sidesOfDie) + modifiers) * timesToRoll;
			return roll += 1;
		}
		
	

}
