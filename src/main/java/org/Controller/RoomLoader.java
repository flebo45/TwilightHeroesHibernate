package org.Controller;

import org.Model.Room;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomLoader {
    private List<Room> roomDescriptions = new ArrayList<>();

    public void loadRoomDescriptions(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            String name = "", description = "";

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    if (!name.isEmpty() && !description.isEmpty()) {
                        roomDescriptions.add(new Room(name, description));
                    }
                    name = "";
                    description = "";
                } else {
                    if (name.isEmpty()) {
                        name = line.trim();
                    } else {
                        description += line.trim() + " ";
                    }
                }
            }
            if (!name.isEmpty() && !description.isEmpty()) {
                roomDescriptions.add(new Room(name, description));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Room getRandomRoom(Random random) {
        if (!roomDescriptions.isEmpty()) {
            return roomDescriptions.remove(random.nextInt(roomDescriptions.size()));
        }
        return new Room("Default Room", "Descrizione predefinita.");
    }
}