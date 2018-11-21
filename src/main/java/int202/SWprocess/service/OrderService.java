/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.service;

import int202.SWProcess.model.Orders;
import int202.SWprocess.repository.OrdersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kittisak
 */
@Service
public class OrderService {
    
    @Autowired
    private OrdersRepository OrdersRepo;
    
    
    public Orders save(Orders order){
        return OrdersRepo.save(order);
    }
    
    public Orders getById(long orderId) {
        return OrdersRepo.findByOrderId(orderId);
    }
    
    
    public List<Orders> getAllOrders(){
        List<Orders> o = OrdersRepo.findAll();
        return o;
    }
    
}
