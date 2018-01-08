package com.example.user.dadosarray;

/**
 * Created by user on 04/01/18.
 */

public class Atribbs {

    private String produto;
    private String armazem;
    private String documentos;
    private String inventario;
    private String quantidade;
    private String lote;

    public Atribbs(String produto,String armazem,String documentos,String inventario,String quantidade,String lote){

        this.produto = produto;
        this.armazem = armazem;
        this.documentos = documentos;
        this.inventario = inventario;
        this.quantidade = quantidade;
        this.lote = lote;

    }

    public Atribbs(String s, String adiciona){



    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getArmazem() {
        return armazem;
    }

    public void setArmazem(String armazem) {
        this.armazem = armazem;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
