package model;
public class Room {
    private int id;
    private int numeroQuarto;
    private int capacidadeAdultos;
    private int capacidadeCriancas;
    private float preco;

    // Constructor, getters and setters
    public Room(int id, int numeroQuarto, int capacidadeAdultos, int capacidadeCriancas, float preco) {
        this.id = id;
        this.numeroQuarto = numeroQuarto;
        this.capacidadeAdultos = capacidadeAdultos;
        this.capacidadeCriancas = capacidadeCriancas;
        this.preco = preco;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public int getRoomNumber() {
        return numeroQuarto;
    }

    public int getAdultsCapacity() {
        return capacidadeAdultos;
    }

    public int getChildrenCapacity() {
        return capacidadeCriancas;
    }

    public float getPrice() {
        return preco;
    }
}

