package bjs.task34;

import java.util.TreeSet;

public class Main {

    static TreeSet<Integer> fibonachiSet = new TreeSet<Integer>();

    /**
     * Recursion is very simple but not optimal solution for factorial, because depth can be huge
     * @param num
     * @return
     */
    public static int factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }

    /**
     * f(n)=f(n-1) + f(n-2), where f(0)=0, а f(1)=1.
     * Usual but bot optimal way because calculation of some numbers repeated several times
     * @param num
     * @return
     */
    static int fibonachi(int num){
        if (num > 1) {
            int result = fibonachi(num - 1) + fibonachi(num - 2);
            fibonachiSet.add(result);
            return result;
        }
        else if (num == 0) {
            return 0;
        }
        else if (num == 1) {
            fibonachiSet.add(1);
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

        fibonachi(13);
        StringBuilder fibonachiString = new StringBuilder();

        for (int num: fibonachiSet) {
            fibonachiString.append(num);
            fibonachiString.append(" ");
        }

        System.out.println(fibonachiString);
    }
}

/*
120
1 2 3 5 8 13 21 34 55 89 144 233
 */
