package ss4_lop_doituong;

public class StopWatch {
    public static void main(String[] args) {
        int h = 10;
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 && i == 8 && j == 4 && j == 5) {
                    System.out.println("1");
                } else if
                (i == 1 && i == 7 && j == 3 && j == 6) {
                    System.out.println("2");
                } else if
                (i == 2 && i == 6 && j == 2 && j == 7) {
                    System.out.println("3");
                } else if
                (i == 3 && i == 5 && j == 1 && j == 8) {
                    System.out.println("4");
                } else if
                (i == 4 && j == 0 && j == 9) {
                    System.out.println("5");
                } else {
                    System.out.println(" ");
                }

            }
        }
    }
}
