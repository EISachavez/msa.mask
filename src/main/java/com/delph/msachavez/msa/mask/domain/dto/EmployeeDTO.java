package com.delph.msachavez.msa.mask.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private String  username;
    private String  name;
    private String  phone;
    private String  address;
    private String  email;
    private String  position;
    private String  cargo;

    @JsonProperty("codigo")
    public Integer getId() {
        return id;
    }

    @JsonProperty("codigo")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("usuario")
    public String getUsername() {
        return username;
    }

    @JsonProperty("usuario")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("nombre")
    public String getName() {
        return name;
    }

    @JsonProperty("nombre")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("telefono")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("telefono")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("direccion")
    public String getAddress() {
        return address;
    }

    @JsonProperty("direccion")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("correo")
    public String getEmail() {
        return email;
    }

    @JsonProperty("correo")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("cargo")
    public String getPosition() {
        return position;
    }

    @JsonProperty("cargo")
    public void setPosition(String position) {
        this.position = position;
    }

}
