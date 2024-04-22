package model;

import java.util.Date;

public class Booking {
    private int id;
    private String nomeHospede;
    private String sobrenomeHospede;
    private Date dataEntrada;
    private Date dataSaida;
    private int numeroAdultos;
    private int numeroCriancas;
    private int idQuarto;
    private int idStatus;

    // Construtor, getters e setters
    public Booking(int id, String nomeHospede, String sobrenomeHospede, Date dataEntrada, Date dataSaida,
                   int numeroAdultos, int numeroCriancas, int idQuarto, int idEstado) {
        this.id = id;
        this.nomeHospede = nomeHospede;
        this.sobrenomeHospede = sobrenomeHospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numeroAdultos = numeroAdultos;
        this.numeroCriancas = numeroCriancas;
        this.idQuarto = idQuarto;
        this.idStatus = idEstado;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getGuestFirstName() {
        return nomeHospede;
    }

    public String getGuestLastName() {
        return sobrenomeHospede;
    }

    public Date getCheckInDate() {
        return dataEntrada;
    }

    public Date getCheckOutDate() {
        return dataSaida;
    }

    public int getNumberOfAdults() {
        return numeroAdultos;
    }

    public int getNumberOfChildren() {
        return numeroCriancas;
    }

    public int getRoomId() {
        return idQuarto;
    }

    public int getStatusId() {
        return idStatus;
    }
}
