import java.util.Scanner;
abstract class CoffeeShop {

    public abstract int  placeOrder();
    public abstract void prepareCustomerOrder();
    public abstract void orderReady();
}


class Order extends CoffeeShop {
    static int MAX=15,top=0,order_id=1;
    int order_queue[]=new int[MAX];
    int ready_queue[]=new int[MAX];;

    @Override
    public int placeOrder() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Pay your Bill");
        float amount=sc.nextFloat();
        if(amount>0)
        {
            System.out.println("Please wait while your order: "+order_id+" is being prepared.");
            order_queue[top++]=order_id++;
            return order_id;
        }
        else {System.out.println("Sorry!!! try again.");
            return 0;}
    }

    @Override
    public void prepareCustomerOrder() {
        if(order_queue.length>0) {
            for(int i=0;i<order_queue.length;i++) {
                if(order_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + order_queue[i] + " is being prepared");
                    ready_queue[i] = order_queue[i];
                }
            }
            order_queue=null;
        }
    }

    @Override
    public void orderReady() {
        if(ready_queue.length>0) {
            for(int i=0;i<ready_queue.length;i++) {
                if(ready_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + ready_queue[i] + " is ready.");
                }
            }
            ready_queue=null;
        }
    }
}


public class CallingOrder {
    public static void main(String[] args) {
        char c;

        Order order=new Order();
        do{
            order.placeOrder();
            System.out.println("Want to place order");
            Scanner s=new Scanner(System.in);
            c=s.next().charAt(0);
        }while (c=='y'||c=='Y');
        order.prepareCustomerOrder();
        order.orderReady();


    }
}