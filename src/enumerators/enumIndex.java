package enumerators;

public class enumIndex {
    public static void main (String[] args){

        //declaration
        USCurrency money = USCurrency.TRENTA;
        money.setValue(30);
        System.out.println(money.getValue());
        System.out.println(money.getName() + "\n");

        //Array of Enum
        USCurrency[] coins = new USCurrency[4];
        coins[0]  = USCurrency.DYIS;
        coins[1]  = USCurrency.BENTE;
        coins[2]  = USCurrency.TRENTA;
        coins[3]  = USCurrency.SINGKWENTA;

        int sum = 0;
        for (USCurrency coin : coins){
            sum += coin.getValue();
            System.out.println(coin.getName());
        }
        System.out.println("Total number of Philippine Currency: " +sum);
    }
}
