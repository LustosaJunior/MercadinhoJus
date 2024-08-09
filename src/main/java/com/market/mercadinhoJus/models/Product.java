package com.market.mercadinhoJus.models;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private LocalDateTime expirationDate;

    @Column(nullable = false, unique = true)
    private String barcode;

    @Column(nullable = false)
    private double purchaseValue;

    @Column(nullable = false)
    private double saleValue;

    @Column(nullable = false)
    private int salesQuantity;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<Market> markets;

}
