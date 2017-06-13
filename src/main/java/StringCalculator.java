
public class StringCalculator {

    int add(String numbers){

		int result = 0;


		String[] numersArray = numbers.split("[^0-9]+");

        if(numbers.length() == 0) {result = 0;}
        else if(numbers.length() == 1) {result = Integer.parseInt(numbers);}
        else {result = Integer.parseInt(numersArray[0]) + Integer.parseInt(numersArray[1]);}



        return result;
    }
}
