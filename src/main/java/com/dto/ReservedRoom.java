package com.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ReservedRoom implements Serializable {
    //예약된 방 정보를 담고 있는 객체
    private int roomId;
    private LocalDateTime datetime;
    private String userId;
    private int reservationCode;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(int reservationCode) {
        this.reservationCode = reservationCode;
    }

    public ReservedRoom(int roomId, LocalDateTime datetime, String userId, int reservationCode) {
        this.roomId = roomId;
        this.datetime = datetime;
        this.userId = userId;
        this.reservationCode = reservationCode;
    }

    public ReservedRoom() {
    }

    @Override
    public String toString(){
        return String.format("%s ,%s, %d", this.datetime, this.userId, this.reservationCode );
    }
//key = 객실객체
    //value = 예약정보(날짜, UserID, 예약코드)
    //hash map으로 관리
}
