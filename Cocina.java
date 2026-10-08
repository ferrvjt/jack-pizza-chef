public class Cocina {
    Orden[] ordenes;

    public void valid5Orders(){
        if(ordenes.length >= 5){
            System.out.println("Ya hay 5 ordenes en proceso");
        }
    } 

    public void addOrder(Orden orden){
        valid5Orders();
        ordenes[ordenes.length] = orden;
    }

    public void combinePizzaOrder(){

    }

    public void presentOrder(){
        
    }
}
