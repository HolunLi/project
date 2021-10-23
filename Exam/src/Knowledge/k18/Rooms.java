package Knowledge.k18;

/*
时间: 2021-1-26 12:02:29
目的: 模拟一个酒店管理系统,具备订房，退房，查询房间状态等功能
*/

//酒店中的每一间房间都是一个对象，有自己的属性(房间编号，房间类型，房间状态)
public class Rooms {
    private int roomId;
    private String roomType;
    private boolean status;

    public Rooms() {
    }

    public Rooms(int roomId, String roomType, boolean status) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.status = status;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //判断房间对象是否相同
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Rooms))
            return false;
        if (obj == this)
            return true;

        Rooms room = (Rooms) obj;
        return room.roomId == this.roomId;
    }

    public String toString() {
        return "[" + this.roomId + "," + this.roomType + "," + (this.status? "占用":"空闲") + "]";
    }
}
