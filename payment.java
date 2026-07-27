abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
}
abstract void pay();
void receipt(){
    System.out.println("Receipt Generated");
    System.out.println("Amount paid:$"+amount);
}
void showpaymentstatus(){
    System.out.println("Payment successful");
}
}
class upipayment extends payment{
    private String upiid;
    upipayment(double amount,String upiid){
        super(amount);
        this.upiid=upiid;
    }
    
    void pay(){
        System.out.println("processing upi payment...");
        System.out.println("upiid:"+upiid);
    }
}
class cardpayment extends payment{
    private String cardnumber;
    cardpayment(double amount,String cardnumber){
        super(amount);
        this.cardnumber=cardnumber;
    }
    
    void pay(){
        System.out.println("Processing card payment...");
        System.out.println("cardnumber:**** **** ****" + cardnumber.substring(cardnumber.length()-4));
    }
}
public class main{
    public static void main(String[]args){
        payment p1=new upipayment(550.75,"anusuya@oksbi");
        payment p2=new cardpayment(1250.50,"1234567812345678");
        p1.pay();
        p1.receipt();
        p1.showpaymentstatus();
        System.out.println();
        p2.pay();
        p2.receipt();
        p2.showpaymentstatus();
    }
}
