public class Pizza {
    TipoSalsa salsa;
    Topping topping;
    int pedazos;
    int minCocina;

    public void add(TipoSalsa salsa){
        this.salsa = salsa;
    }

    public void add(Topping topping){
        this.topping = topping;
    }

    public void cutPizza(int pedazos){
        this.pedazos = pedazos;
    }

    public void startCook(){

    }

    public void finishCook(){
        
    }
}

