import  static java.lang.Math.random;
import  static java.lang.Math.floor;


public class SignComparator {
    private int num;

    SignComparator(){
        this.num = 10;
    }

    SignComparator(int num){
        this.num = num;
    }

    void setSignComparator(int num){
        this.num = num;
    }

    int getSignComparator(){
        return num;
    }

    int getSignComparatorRandom(){
        System.out.println("-----------------------------------------");
        this.num =(int)Math.floor(Math.random() * (10 - (Math.random() * 20)));
        System.out.println("This is random number = " + this.num);
        return num;
    }

    public String getSign(int a){
        if(a > 0){
            return "Number is positive";
        } else if(a < 0){
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }



}
