/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWProcess.controller;

import int202.SWProcess.model.Products;
import int202.SWprocess.service.ProductDetailService;
import int202.SWprocess.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Kittisak
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailService productDetailService;

    @GetMapping("/")
    public String getAllProduct(ModelMap model) {
        model.addAttribute("allProduct", productService.getAllProducts());
        return "index";
    }

    @RequestMapping("/search")
    public String searchPro(@RequestParam String search) {
        productService.getAllSearch(search);
        return search;
    }

    @GetMapping("/search")
    public String searchProduct(ModelMap model, @RequestParam String search) {
        model.addAttribute("searchProduct", productService.getAllSearch(search));
        return "search";
    }

    @RequestMapping("/productdetail")
    public long getProductDetail(@RequestParam long productId) {
        productService.getProductById(productId);
        return productId;
    }

    @GetMapping("productdetail/{id}")
    public String productDetail(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("products", productService.getProductById(id));
        Products p = new Products();
        p.setProductId(id);
        model.addAttribute("productDetail", productDetailService.getProductDetail(p));
        return "productdetail";
    }

    @PostMapping("/Shipping")
    public String shippingDetail(ModelMap model, HttpServletRequest request) {
        String productId = request.getParameter("productId");
        String size = request.getParameter("size");
        String quantity = request.getParameter("quantity");
        int id = Integer.parseInt(productId);
        System.out.println(id + " testttttttttttttttttttttttttttrtt");
        model.addAttribute("size", size);
        model.addAttribute("quantity", quantity);
        model.addAttribute("shippingDetail", productService.getProductById(id));
        return "Shipping";
    }
}
