package ss8_mvc;


public class TennisGame {
    static String LOVE = "Love";
    static String FIFTEEN = "Fifteen";
    static String THIRTY = "Thirty";
    static String FORTY = "Forty";
    static String DEUCE = "Deuce";
    static String ALL = "-ALL";

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {

        boolean isDraw = firstPlayerScore == secondPlayerScore;
        boolean isEnd = firstPlayerScore >= 4 || secondPlayerScore >= 4;
        if (isDraw) return getGameDrawCalledScore(firstPlayerScore);
        if (isEnd) return getGameEndCalledScore(firstPlayerScore, secondPlayerScore);

        String calledScore = getPlayerCalledScore(firstPlayerScore)
                +
                getPlayerCalledScore(secondPlayerScore);
        return calledScore;
    }

    public static String getGameDrawCalledScore(int drawScore) {
        switch (drawScore) {
            case 0:
                return LOVE + ALL;
            case 1:
                return FIFTEEN + ALL;
            case 2:
                return THIRTY + ALL;
            case 3:
                return FORTY + ALL;
            default:
                return DEUCE;
        }
    }

    public static String getGameEndCalledScore(int firstPlayerScore, int secondPlayerScore) {

        int distanceResult = firstPlayerScore - secondPlayerScore;

        if (distanceResult == 1) return "Advantage first player";
        if (distanceResult == -1) return "Advantage second player";
        if (distanceResult >= 2) return "Win for first player";
        return "Win for second player";
    }

    public static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return LOVE;
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            default:
                return FORTY;
        }

    }

}
