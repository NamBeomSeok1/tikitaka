package com.tikitaka.front.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String birth;
    private Integer age;
    private String password;

    @Builder
    public void builder(String email, String name, String birth, Integer age) {
        this.email = email;
        this.name = name;
        this.birth = birth;
        this.age = age;
    }
}

