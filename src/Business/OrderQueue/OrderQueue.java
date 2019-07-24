/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderQueue;

import java.util.ArrayList;


/**
 *
 * @author Varun
 */
public class OrderQueue {
    
    private ArrayList<OrderRequest> orderRequestList;

    public OrderQueue() {
        orderRequestList = new ArrayList<>();
    }

    public ArrayList<OrderRequest> getOrderRequestList() {
        return orderRequestList;
    }
    
    public OrderRequest addOrderRequest(){
        OrderRequest orderRequest = new OrderRequest();
        orderRequestList.add(orderRequest);
        return orderRequest;
    }
    
    public void removeOrdeRequest(OrderRequest orderRequest){
        this.orderRequestList.remove(orderRequest);
    }
}