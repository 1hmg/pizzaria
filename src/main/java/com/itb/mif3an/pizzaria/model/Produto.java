package com.itb.mif3an.pizzaria.model;

public class Produto {

    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidadeEstoque;
    private boolean codStatus;

    //Atributos de apoio

    private String mensagemErro = "";
    private boolean isValid = true;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public boolean validarProduto() {
        if (nome == null || nome.isEmpty()) {
            mensagemErro += "O nome do produto é obrigatório";
            isValid = false;
        }

        if (precoCompra < 0) {
            mensagemErro += "O preco do produto deve ser maior que 0";
            isValid = false;
        }

        return isValid;
    }

}
