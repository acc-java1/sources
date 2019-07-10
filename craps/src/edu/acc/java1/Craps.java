package edu.acc.java1;
/**
 * Write a properly-packaged Java program that simulates the casino game
 * Craps. The rules of Craps are as follows:
 * <ul>
 *      <li>The player throws two six-sided dice</li>
 * 	<li>If the sum of the dice is 7 or 11, the player wins</li>
 * 	<li>If the sum of the dice is 2, 3, or 12, the player loses</li>
 * 	<li>Any other sum is retained as the player's <em>point</em></li>
 * 	<li>A player with point must continue rolling until:
 *          <ul>
 * 		<li>A roll of 7 loses</li>
 * 		<li>Or a roll of the player's point wins</li>
 *          </ul>
 * 	</li>
 * </ul>
 * Note well that 7 is a winning roll on the first roll but is a losing
 * roll when rolling for point.
 * <p>
 * Welcome the user to the game and accept a keystroke to begin. Display
 * the individual dice values and their sum after each roll. Display
 * "You WIN!" or "You LOSE!" at the end of a game. If the player has point,
 * remind the player of the point before each roll with "Your point is XX".
 * Accept a keystroke to initiate each roll. 
 * </p>
 */
public class Craps {

    public static void main(String[] args) {
        displayWelcome();
        playGame();
    }

    private static void displayWelcome() {
        System.out.print("\nWelcome to Craps-o-rama!\n\n");
    }

    private static void playGame() {
        final int WIN = 1, LOSE = 2, POINT = 3;
	    int point = 0, state;

		int sum = rollDice();
		if (sum == 7 || sum == 11) state = WIN;
		else if (sum == 2 || sum == 3 || sum == 12) state = LOSE;
		else {
			state = POINT;
			point = sum;
		}
        while (state == POINT) {
            System.out.println("Your point is " + point);
            sum = rollDice();
            if (sum == 7) state = LOSE;
            else if (sum == point) state = WIN;
        }
        if (state == WIN)
            System.out.println("You WIN!\n");
        else
            System.out.println("You LOSE!");
    }

    private static int rollDice() {
        System.console().readLine("Press enter to roll:");
        int die1 = 1 + (int) (Math.random() * 6);
        int die2 = 1 + (int) (Math.random() * 6);
        int sum = die1 + die2;
        System.out.printf("You rolled %d + %d = %d\n", die1, die2, sum);
        return sum;
    }
}

