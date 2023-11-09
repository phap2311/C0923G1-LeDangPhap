package ss4_lop_doituong;

//public class Rhombus {
//    public static void main(String[] args) {
//        int h = 10;
//        for (int i = 0; i < h - 1; i++) {
//            for (int j = 0; j < h; j++) {
//                if (j == (h / 2) + i || j == (h / 2 - 1) - i || i == ((h / 2) - 1) + j || i == h + 3 - j) {
//
//                    System.out.print(i + 1);
//
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
public class Rhombus {
    public static void main(String[] args) {

        int number = 6;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2 * number; j++) {
                if (i == 0) {
                    System.out.print("");
                } else if (j == number - 1 - i || j == number + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = number - 2; i > 0; i--) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j == number - 1 - i || j == number + i) {
                    System.out.print(i);
                } else if (i == number - 1 && j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

