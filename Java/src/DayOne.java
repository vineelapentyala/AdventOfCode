import java.io.*;
import java.util.*;
public class DayOne {
    private int product(){
        List<Integer> numbers = new ArrayList<Integer>();
        Set<Integer> numberSet = new HashSet<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\vinee\\OneDrive\\Desktop\\AdventOfCode\\Day_One\\input.txt"));
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                numbers.add(num);
                numberSet.add(num);
            }
            scanner.close();
            for (int i = 0; i < numbers.size(); i++){
                for (int j = i + 1; j<numbers.size(); j++){
                    if (numberSet.contains(2020 - numbers.get(i)-numbers.get(j))){
                        return numbers.get(i) * numbers.get(j) * (2020 - numbers.get(i)-numbers.get(j));
                    }
                }
            }
            return 0;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void main(String[] args) {
        DayOne d = new DayOne();
        System.out.println(d.product());
    }
}
