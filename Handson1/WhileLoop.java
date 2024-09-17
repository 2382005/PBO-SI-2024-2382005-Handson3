package Handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        while (counter < kumpulanBuah.length) {
            System.out.println(kumpulanBuah[counter]);
            counter++;
        }
    }
}
