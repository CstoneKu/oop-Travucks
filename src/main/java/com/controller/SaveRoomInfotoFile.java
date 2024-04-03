package com.controller;

import com.dto.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveRoomInfotoFile {
    private File target = new File("src/main/java/com/repository/RoomData");

    public void saveRoom(Room room) throws IOException {
        boolean append = target.exists() && target.length() > 0;
        try (ObjectOutputStream oos = append ? new ObjectOutputStream(new FileOutputStream(target, true)) {
            protected void writeStreamHeader() throws IOException {
                // 파일에 이미 데이터가 있을 경우 헤더를 다시 쓰지 않습니다.
                reset();
            }
        }
                : new ObjectOutputStream(new FileOutputStream(target))) {
            oos.writeObject(room);
        }
    }
}