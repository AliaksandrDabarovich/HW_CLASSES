package hotel;

public class Room {
    private int number;
    private String classOfRoom;
    private boolean isJacuzzi;
    private boolean isReserved;

    public Room(int number, String classOfRoom, boolean isJacuzzi, boolean isReserved) {
        this.number = number;
        this.classOfRoom = classOfRoom;
        this.isJacuzzi = isJacuzzi;
        this.isReserved = isReserved;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassOfRoom() {
        return classOfRoom;
    }

    public void setClassOfRoom(String classOfRoom) {
        this.classOfRoom = classOfRoom;
    }

    public boolean isJacuzzi() {
        return isJacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        isJacuzzi = jacuzzi;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
