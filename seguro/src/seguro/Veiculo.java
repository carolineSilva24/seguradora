package seguro;

public class Veiculo {
     private int ano;
     private String marca, cor, placa;
     private Modelo modelo;


    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public Veiculo(int ano, String marca, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }
}
