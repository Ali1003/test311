﻿import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	/* Маруся играет в баскетбол и хочет стать профессионалом. Каждый сезон 
	* она ведет записи своих игр. Она подсчитывает, сколько раз она 
	* побила свой рекорд очков и сколько раз ухудшила результат. Помочь Марусе. 
	* n - количество игр за сезон.
	* 1 <= n <= 1000
	* 0 <= scores[i] <= 10e8
	*
	* Пример: 9
	*         10 5 20 20 4 5 2 25 1
	* Ответ: 2 4
	*/


    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}