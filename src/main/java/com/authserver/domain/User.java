package com.authserver.domain;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.UUID;

@Entity
@Table(name="user")
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID id;
    private String email;
    private String password;
}
