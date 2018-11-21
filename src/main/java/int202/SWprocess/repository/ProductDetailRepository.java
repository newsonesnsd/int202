/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.repository;

import int202.SWProcess.model.ProductDetail;
import int202.SWProcess.model.Products;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author taloey
 */
@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {

    public List<ProductDetail> findByProductId(Products productId);

}
