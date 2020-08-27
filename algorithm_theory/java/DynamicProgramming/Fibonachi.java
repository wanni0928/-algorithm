package study.algorithm.theory;

public class Fibonachi {
    // dynamic programing
    public int fibonachi(int num){
        if(num == 0) return 0;
        else if(num == 1) return 1;
        return fibonachi(num - 1) + fibonachi(num - 2);
    }

    public static void main(String[] args) {
//        fibonacci(0):0
//        fibonacci(1):1
//        fibonacci(2):1
//        fibonacci(3):2
//        fibonacci(4):3
//        fibonacci(5):5
//        fibonacci(6):8
//        fibonacci(7):13
//        fibonacci(8):21
//        fibonacci(9):34
        Fibonachi fibo = new Fibonachi();
        System.out.println(fibo.fibonachi(9));
    }
}
