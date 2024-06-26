package com.rodney.livrosAPI.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;


public class LivrosDTO {

    @NotBlank
    @Size(max = 20)
    private String nome;

    @Max(1000)
    private double preco;

    //    private String file;
    @JsonFormat(pattern = "dd.MM.YYYY HH:mm")
    private Timestamp creatAt;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Timestamp getCreatAt() {
        return creatAt;
    }

//    public String getFile() {
//        return file;
//    }
}
