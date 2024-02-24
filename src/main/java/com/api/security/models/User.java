package com.api.security.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name ="tbl_user")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="username")
    private String userName;

    @Column(name="password")
    private String password;

   /* @Column(name="roles")
    private String roles;*/

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<UserRoles> userRoles;

   /* public User(String userName, String password, String roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }*/

    public User(String userName, String password, List<UserRoles> userRoles) {
        this.userName = userName;
        this.password = password;
        this.userRoles = userRoles;
    }
}
