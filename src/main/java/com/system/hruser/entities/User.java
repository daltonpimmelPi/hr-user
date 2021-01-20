package com.system.hruser.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true) //não pode ter dois email iguais
    private String email;

    private String password;

    //cria uma tabela de meio
    @ManyToMany(fetch = FetchType.EAGER) //sempre trazer junto, carregar automaticamento junto com o usuario, ja carrega os perfis de usuario
    @JoinTable(
            name = "TB_USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
            )
    Set<Role> roles = new HashSet<>(); //o set é uma interface, então tem que instanciar com uma classe concreta

    public User() {}

    public User(Long id, String name, String email, String senha) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
