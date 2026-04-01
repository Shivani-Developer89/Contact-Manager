package com.scm.entities;

import com.scm.enums.Providers;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    public String userId;
    @Column(name="user_name", nullable=false)
    public String name;
    @Column(unique=true, nullable = false)
    public String email;
    public String password;
    @Column(length =40)
    public String about;
    @Column(length =30)
    public String profilePic;
    public String mobileNo;

    //Information
    private boolean enabled=false;
    private boolean emailVerified =false;
    private boolean phoneVerified= false;


    //Self,google,facebook,twitter,Linkedin,github
    private Providers provider=Providers.SELF;
    private String providerUserId;
    
    //mapping
    @OneToMany(mappedBy="user")
    private List<contact> contacts = new  ArrayList<>();

}
