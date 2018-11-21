/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.service;

import int202.SWProcess.model.ProductDetail;
import int202.SWProcess.model.Products;
import int202.SWprocess.repository.ProductDetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author taloey
 */
@Service
public class ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepo;

    public List<ProductDetail> getProductDetail(Products productId) {
        
        List<ProductDetail> pd = productDetailRepo.findByProductId(productId);
        return pd;
    }

    public List<ProductDetail> getAllProducts() {
        
        List<ProductDetail> p = productDetailRepo.findAll();
        return p;
    }

}
