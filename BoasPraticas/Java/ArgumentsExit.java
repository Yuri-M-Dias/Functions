import java.util.ArrayList;

public class ArgumentsExit {

    public static void main(String[] args) {
        ArrayList <Integer> listNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            listNumbers.add(i);
        }

        System.out.println("Sum: " + sumListNumbers(listNumbers));
    }

    private static Integer sumListNumbers(ArrayList<Integer> listNumbers){
        int sum = 0;

        for (int i = 0; i < listNumbers.size(); i++) {
            sum = sum + listNumbers.get(i);
        }

        listNumbers.add(sum);
        return listNumbers.get(listNumbers.size()-1);
    }
}