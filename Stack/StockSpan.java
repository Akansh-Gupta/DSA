import java.util.*;

public class StockSpan {

    private Stack<int[]> stack;

    public StockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[] { price, span });
        return span;
    }

    public static void main(String[] args) {
        StockSpan stockSpan = new StockSpan();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Price\tSpan");
        for (int price : prices) {
            System.out.println(price + "\t" + stockSpan.next(price));
        }
    }
}