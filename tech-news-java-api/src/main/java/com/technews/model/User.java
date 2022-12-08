package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    @Transient
    boolean loggedIn;

    private List<Post> posts;
    private List<vote> votes;
    private List<Comment> comment;
}
