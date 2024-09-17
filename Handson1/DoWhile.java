package Handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        do {
            System.out.println(kumpulanBuah[counter]);
            counter++;
        } while (counter < kumpulanBuah.length);
    }
}
