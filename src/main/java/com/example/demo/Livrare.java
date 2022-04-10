package com.example.demo;

public class Livrare {
    private Furnizor fz;
    private Componenta cmp;
    private int cant;

    public Furnizor getFz() {
        return fz;
    }

    public void setFz(Furnizor fz) {
        this.fz = fz;
    }

    public Componenta getCmp() {
        return cmp;
    }

    public void setCmp(Componenta cmp) {
        this.cmp = cmp;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
