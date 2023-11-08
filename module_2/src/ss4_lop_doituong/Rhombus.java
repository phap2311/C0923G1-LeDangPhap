package ss4_lop_doituong;

public class Rhombus {
    public static void main(String[] args) {
        int h = 10;
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < h; j++) {
                if (j == (h / 2) + i || j == (h / 2 - 1) - i){
                    System.out.print("1");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = h/2; i < h-1; i++) {
            for (int j = 0; j <h ; j++) {
                if (j == (h / 2) + i || j == (h / 2 - 1) - i){
                    System.out.print("1");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            }
        }
    }

