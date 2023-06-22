package enumerators;

public enum USCurrency {
    DYIS (10, "DYIS"),
    BENTE(20, "BENTE"),
    TRENTA(30, "TRENTA"),
    SINGKWENTA(50, "SINGKWENTA");
    private int value;
    private String name;
    USCurrency(int value){
        this.value = value;
    }
    USCurrency(int value, String name){
        this.value = value;
        this.name = name;
    }

    void setName(String name){ this.name = name;}
    void setValue(int value){
        this.value = value;
    }
    int getValue(){
        return value;
    }
    String getName() { return name; }
}
