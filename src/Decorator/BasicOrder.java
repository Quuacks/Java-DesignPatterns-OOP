package Decorator;

public class BasicOrder implements Order{
    public double getCost(){
        return 15.0;
    }
    public String getDescription(){
        return "Paprastas Uzsakymas";
    }
}
