package SistemaInventario;

public abstract class  Equipos_de_Computo {
    //ATRIBUTOS
    private int id;
    private String modelo;
    private String marca;
    private int ano;
    private String serial_number;
    private String estado;
    private int stock;

    //METODOS
    public Equipos_de_Computo(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.serial_number = serial_number;
        this.estado = estado;
        this.stock = stock;
    }

    //GETTER'S


    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public String getEstado() {
        return estado;
    }

    public int getStock() {
        return stock;
    }
}