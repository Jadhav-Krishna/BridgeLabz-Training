class Main{
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        StockSpan sp = new StockSpan();
        int[] result = sp.calculateSpan(prices);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}