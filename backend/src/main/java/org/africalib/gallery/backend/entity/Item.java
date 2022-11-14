package org.africalib.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(name = "img_path", length = 100)
    private String imgPath;

    @Column(name = "price")
    private Integer price;

    @Column(name = "discount_per")
    private Integer discountPer;

    public void setDiscountPer(Integer discountPer) {
        this.discountPer = discountPer;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
