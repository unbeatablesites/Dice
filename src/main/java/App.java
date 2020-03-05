import java.util.Random;

public class App {

    public static void main(String[] args) {

        doLogic();

    }

    public static void  doLogic(){
        System.out.println("HERE COMES THE DICE!");
        Random rand = new Random();

        int firstNumber = 1 + rand.nextInt(6);
        int secondNumber = 1 + rand.nextInt(6);

        System.out.println("Roll #1: " + firstNumber);
        System.out.println("Roll #2: " + secondNumber);

        System.out.println("The total is " + (firstNumber + secondNumber)+"!");

    }


}
