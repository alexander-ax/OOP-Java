package enumerators;

public enum USCurrency {
    DYIS (10), BENTE(20), TRENTA(30), SINGKWENTA(50);
    private int value;
    USCurrency(int value){
        this.value = value;
    }
    void setValue(int value){
        this.value = value;
    }
    int getValue(){
        return value;
    }
}
