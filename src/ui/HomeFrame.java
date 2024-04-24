package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.*;

public class HomeFrame extends JFrame{
    private JPanel homePanel;
    private JButton RoomBtn;
    private JButton BookBtn;

    public HomeFrame() {
        setContentPane(homePanel);
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // finalizar programa quando clica no X
        setSize(400,400 );
        setLocationRelativeTo(null);
        setVisible(true);



        // botao da ROOM
        RoomBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lê os quartos de um arquivo CSV e exibe a lista
                List<Room> rooms = RoomList.readRoomsFromCSV("dados/rooms.csv");
                RoomList roomListView = new RoomList(rooms);
                roomListView.display();
                dispose();
            }
        });
    }


    public static void main(String[] args) {
        new HomeFrame();
    }
}

