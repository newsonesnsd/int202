/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.service;

import int202.SWProcess.model.Products;
import int202.SWprocess.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kittisak
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public List<Products> getAllProducts() {
        List<Products> p = productRepo.findAll();
        return p;
    }

    public Products getById(long productId) {
        return productRepo.findById(productId);
    }

    public List<Products> getProductById(long productId) {
        List<Products> p = productRepo.findByProductId(productId);
        return p;
    }

    public List<Products> getProductByName(String productName) {
        List<Products> p2 = productRepo.findByProductNameLike("%" + productName + "%");
        return p2;
    }

    public List<Products> getAllSearch(String search) {
        try {
            long id = Integer.parseInt(search);
            return getProductById(id);
        } catch (Exception ex) {
            return getProductByName(search);
        }
    }
}
