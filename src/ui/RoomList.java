package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import model.*;
import java.io.*;
import java.util.ArrayList;

public class RoomList extends JFrame {

    private JPanel roomLFrame;
    private JButton homeBtn;
    private JButton button2;
    private JTable tbl_rooms;
    private JScrollPane scrollTable;
    private DefaultTableModel tableModel;

    public RoomList(List<Room> roomList){
        setContentPane(roomLFrame);
        setTitle("Lista de Quartos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // finalizar programa quando clica no X
        setSize(400,400 );
        setLocationRelativeTo(null);

        // Configuração da tabela
        DefaultTableModel tableModel = (DefaultTableModel) tbl_rooms.getModel();
        tableModel.setColumnIdentifiers(new Object[]{"Nº Quarto", "Nº de Adultos", "Nº de Crianças", "Preço"});
        fillTable(roomList);

        // Assegurando que a tbl_rooms está no scrollPane
        scrollTable.setViewportView(tbl_rooms);
    }

    private void fillTable(List<Room> roomList) {
        DefaultTableModel tableModel = (DefaultTableModel) tbl_rooms.getModel();
        tableModel.setRowCount(0); // Limpa a tabela antes de adicionar novos dados
        for (Room room : roomList) {
            tableModel.addRow(new Object[]{room.getRoomNumber(), room.getAdultsCapacity(), room.getChildrenCapacity(), room.getPrice()});
        }
    }

    // Utilidade para ler quartos de um arquivo CSV
    public static List<Room> readRoomsFromCSV(String filePath) {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Room room = new Room(
                        Integer.parseInt(values[0]),  // ID
                        Integer.parseInt(values[1]),  // Room Number
                        Integer.parseInt(values[2]),  // Adults Capacity
                        Integer.parseInt(values[3]),  // Children Capacity
                        Float.parseFloat(values[4])   // Price
                );
                rooms.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    // Método para exibir a janela a partir de outra parte do programa
    public void display() {
        setVisible(true);
    }

}
