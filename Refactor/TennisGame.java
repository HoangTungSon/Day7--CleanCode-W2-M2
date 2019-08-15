package Refactor;

public class TennisGame {

	public static final int LOVE = 0;
	public static final int FIFTEEN = 1;
	public static final int THIRTY = 2;
	public static final int FORTY = 3;

	private static void winDisplay(int player1Score, int player2Score, String display) {
		int minusResult = player1Score - player2Score;
		if (minusResult == 1)
			display = "Advantage player1";
		else if (minusResult == -FIFTEEN)
			display = "Advantage player2";
		else if (minusResult >= THIRTY)
			display = "Win for player1";
		else
			display = "Win for player2";
	}

	private static void equalDisplay(int player1Score, String display) {
		switch (player1Score) {
		case LOVE:
			display = "Love-All";
			break;
		case FIFTEEN:
			display = "Fifteen-All";
			break;
		case THIRTY:
			display = "Thirty-All";
			break;
		case FORTY:
			display = "Forty-All";
			break;
		default:
			display = "Deuce";
			break;
		}
	}

	private static void countDisplay(int player1Score, int player2Score, String display, int tempScore) {
		for (int i = FIFTEEN; i < FORTY; i++) {
			if (i == FIFTEEN)
				tempScore = player1Score;
			else {
				display += "-";
				tempScore = player2Score;
			}
			switch (tempScore) {
			case LOVE:
				display += "Love";
				break;
			case FIFTEEN:
				display += "Fifteen";
				break;
			case THIRTY:
				display += "Thirty";
				break;
			case FORTY:
				display += "Forty";
				break;
			}
		}
	}

	public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

		String display = "";
		int tempScore = LOVE;

		if (player1Score == player2Score) {
			equalDisplay(player1Score, display);

		} else if (player1Score >= 4 || player2Score >= 4) {
			winDisplay(player1Score, player2Score, display);

		} else {
			countDisplay(player1Score, player2Score, display, tempScore);
		}
		
		return display;
	}
}
