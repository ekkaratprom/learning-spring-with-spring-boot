package com.frankmoley.lil.learningspring.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Room")
public class Room {
    @Id
    @Column(name="Room_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;
    @Column(name="NAME")
    private String roomName;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name = "BED_INFO")
    private String BedInfo;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return BedInfo;
    }

    public void setBedInfo(String bedInfo) {
        BedInfo = bedInfo;
    }
}
