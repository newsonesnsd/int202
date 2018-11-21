/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.repository;

import int202.SWProcess.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kittisak
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{

        
    public Orders findByOrderId(long orderId);
    
}
    

