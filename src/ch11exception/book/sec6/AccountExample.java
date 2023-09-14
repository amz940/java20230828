package ch11exception.book.sec6;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.desposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try{
            account.withdraw(30000);
        } catch (InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

class Account{
    private long balance;

//    public Account(){ // 기본 생성자 }

    public long getBalance() {
        return balance;
    }

    public void desposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException{
        if ( balance < money){
            throw new InsufficientException("잔고부족 : "+ (money-balance) + "모자람");
        }
        balance -= money;
    }
}
