package ss8_mvc;


public class TennisGame {
    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore,int secondPlayerScore) {

        boolean isDraw = firstPlayerScore == secondPlayerScore;
        boolean isEnd = firstPlayerScore >= 4 || secondPlayerScore >= 4;
        if (isDraw) return getGameDrawCalledScore(firstPlayerScore);
        if (isEnd) return getGameEndCalledScore(firstPlayerScore, secondPlayerScore);

        String calledScore = getPlayerCalledScore(firstPlayerScore)
                +
                getPlayerCalledScore(secondPlayerScore);
        return calledScore;
    }

    private static String getGameDrawCalledScore(int drawScore) {
        switch (drawScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getGameEndCalledScore(int firstPlayerScore, int secondPlayerScore) {

        int distanceResult = firstPlayerScore - secondPlayerScore;

        if (distanceResult == 1) return "Advantage first player";
        if (distanceResult == -1) return "Advantage second player";
        if (distanceResult >= 2) return "Win for first player";
        return "Win for second player";
    }

    private static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }

    }
}
