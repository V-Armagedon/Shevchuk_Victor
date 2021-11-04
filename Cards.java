import java.util.Scanner;
public class Cards {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        String[] a = new String[13];
        String[] b = new String[4];
        String[] [] c = new String[n] [n];
        long rn = 2;
        long rs;
        String name;
        String suit;
        int k = 0;
        int h = 0;
        int v = 0;

        for (int j = 0; j < 9; j++) {
            a[j] = String.valueOf(rn);
            rn++;
        }
        a[9] = "Jack";
        a[10] = "Queen";
        a[11] = "King";
        a[12] = "Ace";

        b[0] = "spades";
        b[1] = "hearts";
        b[2] = "diamonds";
        b[3] = "clubs";
        for (int i = 0; i < n; i++) {
            rn = Math.round(Math.random() * 12);
            name = a[(int) rn];
            rs = Math.round(Math.random() * 3);
            suit = b[(int) rs];
                if (k < 4) {
                    System.out.print(name + " " + suit + '\t');
                    k++;
                } else {
                    System.out.println(name + " " + suit);
                    k = 0;
                }
            }

        }
    }