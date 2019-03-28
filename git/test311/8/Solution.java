import java.io.*;
import java.util.*;
import java.math.*;

class Set {
    
    List<Integer> values;

    Set() { this.values = new ArrayList<>(); }
    
    public void init(int[] a) {
        for(int i = 0; i < a.length; i++) {
            List<Integer> set = new ArrayList<>();
            for(int j = 0; j < a.length; j++) {
                if(Math.abs(a[i] - a[j]) <= 1) {
                    boolean canAdd = true;
                    for(int k = 0; k < set.size(); k++) {
                        if(Math.abs(set.get(k) - a[j]) > 1) {
                            canAdd = false;
                            break;
                        }
                    }
                    if(canAdd) set.add(a[j]);
                }
            }
            if(set.size() > this.values.size()) this.values = set;
        }
    }
    
    public int getSize() {
        return values.size();
    }
}

public class Solution {
   /*
    * Определить максимальную мощность подмножества элементов заданного массива. Элементы включаются в подмножество, если
	* разность между любыми элементами подмножества меньше либо равна 1.	
	* Дано: n - количество чисел в массиве
	*		a - массив чисел
	* 		2 <= n <= 100
	*		0 < a[i] < 100
	*		ответ должен быть >=2, задаются такие данные
	* Пример:
	*  9
	*  1 1 2 2 4 4 5 5 5
	* Ответ:
	* 5
	*
	* 6
	* 4 6 5 3 3 1
	* Ответ:
	* 3
	*/
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")
            
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            Set set = new Set();
            Thread t = new Thread(() -> set.init(a));

            t.start();
            t.join();

            int result = set.getSize();

            bufferedWriter.write(String.valueOf(result));

            bufferedWriter.close();
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}