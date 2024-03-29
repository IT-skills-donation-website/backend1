package org.africalib.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "pitems")
public class PItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column
    private int price;

    @Column
    private int discountPer;

    @Column
    private String Content;
}
