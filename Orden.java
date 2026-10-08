public class Orden {
    TipoSalsa salsaPedido;
    Topping toppingPedido;
    int pedazosEstimados;
    int minPedido;
    Pizza pizzaHecha;

    public boolean pizzaExist(){
        return pizzaHecha != null;
    }

    public void finishOrder(){
        pizzaHecha = new Pizza();
        pizzaHecha.add(salsaPedido);
        pizzaHecha.add(toppingPedido);
        pizzaHecha.cutPizza(pedazosEstimados);
        pizzaHecha.startCook();
    }

    public void rateOrder(int minPedido){
        this.minPedido = minPedido;
        pizzaHecha.finishCook();
    }

    public void onePizzaValid(){
        if(pizzaExist()){
            System.out.println("Ya hay una pizza en proceso");
        }
    }
    
}
