package hotel;

import java.util.List;

public class Hotel {
    private List<Room> roomList;
    private List<Staff> staffList;

    public Hotel(List<Room> roomList, List<Staff> staffList) {
        this.roomList = roomList;
        this.staffList = staffList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
