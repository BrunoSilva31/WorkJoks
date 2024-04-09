package com.joks.model;

import org.springframework.stereotype.Indexed;

import jakarta.annotation.Generated;

@Entity
public class Cliente {
    
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
}
