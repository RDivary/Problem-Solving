import java.util.Arrays;
import java.util.List;

/**
 * The Main class contains a main method that accepts integer arguments, calculates the sum of even numbers among them,
 * and prints the result to the console.
 */
public class Main {

    /**
     * The main method of the program.
     * Parses the command-line arguments as integers, computes the sum of even numbers among them, and displays the result.
     *
     * @param args Command-line arguments representing integers
     */
    public static void main(String[] args) {

        // convert parameter to list of integer
        List<Integer> numbers = Arrays.stream(args)
                .map(Integer::parseInt)
                .toList();

        // get sum even number
        int totalSumEvenNumber = sumEvenNumber(numbers);

        // print result
        System.out.println("result = " + totalSumEvenNumber);
    }

    /**
     * Calculates the sum of even numbers from the given list of integers.
     *
     * @param numbers List of integers
     * @return Sum of even numbers in the list
     */
    private static int sumEvenNumber(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number % 2 == 0) // filter only even number
                .mapToInt(Integer::intValue)
                .sum();
    }
}