package com.itb.inf2gm.anteikupizzaria.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {

    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    private BigDecimal valorCompra;
    private BigDecimal valorVenda;
    private int quantidadedeEstoque;
    private boolean codStatus;
    private BigDecimal preco;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadedeEstoque() {
        return quantidadedeEstoque;
    }

    public void setQuantidadedeEstoque(int quantidadedeEstoque) {
        this.quantidadedeEstoque = quantidadedeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
