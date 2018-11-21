/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWProcess.model;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author Kittisak
 */
@Entity
@Table(name = "productdetail")
public class ProductDetail extends SerializableSerializer {

    @Id
    private long productDetailId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Products productId;

    @NotBlank
    private String productDetail;

    public long getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    @Override
    public String toString() {
        return "ProductDetail{" + "productDetailId=" + productDetailId + ", productId=" + productId + ", productDetail=" + productDetail + '}';
    }

}
