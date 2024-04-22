package model;

public class Status {
    private int id;
    private String status;

    // Construtor
    public Status(int id, String estado) {
        this.id = id;
        this.status = estado;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public String getEstado() {
        return status;
    }

    // Método toString para facilitar a visualização do estado
    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", estado='" + status + '\'' +
                '}';
    }
}
