package br.ulbra.classes;
public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String motor;
    private int km;
    private double valorfipe;

public Veiculo(){
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getValorfipe() {
        return valorfipe;
    }

    public void setValorfipe(double valorfipe) {
        this.valorfipe = valorfipe;
    }
}
