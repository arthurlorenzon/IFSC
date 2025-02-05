package org.example;

public class RoboExplorador {
    private String nome;
    private int x;
    private int y;
    private int bateria;

    public RoboExplorador(String nome, int x, int y, int bateria) {
        setNome(nome);
        this.x = x;
        this.y = y;
        setBateria(bateria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int direcaoAtual() {
        return 0;
    }

    public int girar(String lado) {
        return 0;
    }
}
