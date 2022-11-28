package com.sprintreview.h2.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String name;
    private String lastName;
    private String age;
    private String email;
    @Column(name = "date_birth")
    private LocalDate dateBird;

    public UserDto() {
    }

    public UserDto(String name, String lastName, String age, String email, LocalDate dateBird) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.dateBird = dateBird;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateBird() {
        return dateBird;
    }

    public void setDateBird(LocalDate dateBird) {
        this.dateBird = dateBird;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", dateBird=" + dateBird +
                '}';
    }
}
