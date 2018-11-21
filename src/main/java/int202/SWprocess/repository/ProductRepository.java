/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.repository;

import int202.SWProcess.model.Products;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kittisak
 */
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

    public List<Products> findByProductId(long productId);

    public List<Products> findByProductNameLike(String productName);

    public Products findById(long productId);

}
