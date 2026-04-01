package com.scm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class contact {
    @Id
    private String id;
    private String name;
    private String eamil;
    private String mobileNo;
    private String address;
    private String picture;
    @Column(length =1000)
    private String description;
    private  boolean favourite =false;
    private String whatsappLink;
    
    @ManyToOne
    private User user;

}