package ch14thread.book.sec5.exam2;

public class Sumthread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void run(){
        for(int i =0; i<=100; i++){
            sum += i;
        }
    }
}
