package im.mory.hackerrank_challenges_java.plusMinus;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int zero = 0;
        int negative = 0;
        int positive = 0;
        for (Integer num : arr) {
            if (num == 0)
                zero++;
            else if (num < 0)
                negative++;
            else
                positive++;
        }
        var arrayLength = arr.size();
        System.out.printf("%.6f\n", (float) positive / arrayLength);
        System.out.printf("%.6f\n", (float) negative / arrayLength);
        System.out.printf("%.6f\n", (float) zero / arrayLength);
    }
}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        var arr = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Result.plusMinus(arr);
        bufferedReader.close();
    }
}
