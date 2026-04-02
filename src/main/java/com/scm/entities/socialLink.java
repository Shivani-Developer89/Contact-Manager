package com.scm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Lombok
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class socialLink {
    
    @Id
    private Long id;
    private String link;
    private String title;



}
