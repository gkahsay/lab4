package Assignment3;

public class CoffeeBag {

   public static final double PRICE_PER_POUND=5.99;
   public static final double TAX_RATE=0.0724;

   public static void totalPrice(double bagWeight,int numberOfBags){
      double totalPrice=bagWeight * numberOfBags * PRICE_PER_POUND;
       double totalPriceWithTax = totalPrice + totalPrice * TAX_RATE;

       System.out.println("Number of bags sold:"+ numberOfBags);
       System.out.println("Weight per bags :"+ bagWeight +"ib");
       System.out.println("Price per pound:"+ PRICE_PER_POUND);
       System.out.println("Sale tax:"+ TAX_RATE +"%");
       System.out.println("Total price: $"+ totalPrice );
       System.out.println("Total price with tax="+ totalPriceWithTax);
   }
    public static void main(String[]args){
       totalPrice(32,5);
   }
}
