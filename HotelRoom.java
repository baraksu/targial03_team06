public class HotelRoom {
    private int _roomNum;
    private int _numBeds;
    private boolean _occupied;
    private String _guest;
    private static final int defRoomNum = 999;
    private static final int defNumBeds = 2;
    private static final String defGuest = "";
    
    public HotelRoom(int roomNum, int numBeds) {
        if (roomNumOk(roomNum)) {
            _roomNum = roomNum;
        } else {
            _roomNum = defRoomNum;
        }
        if (numBedsOk(roomNum)) {
            _roomNum = roomNum;
        } else {
            _roomNum = defNumBeds;
        }
        _occupied = false;
        _guest = defGuest;
    }
    
    public int getRoomNum() {
        return _roomNum;
    }
    
    public int getNumBeds() {
        return _numBeds;
    }
    
    public boolean isOccupied() {
        return _occupied;
    }
    
    public String getGuest() {
        return _guest;
    }
    
    public void setRoomNum(int roomNum) {
        if (roomNumOk(roomNum)) {
            _roomNum = roomNum;
        }
    }
    
    private boolean roomNumOk(int roomNum) {
        if (roomNum >= 100 && roomNum <= 999) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setNumBeds(int numBeds) {
        if (numBedsOk(numBeds)) {
            _numBeds = numBeds;
        }
    }
    
    private boolean numBedsOk(int numBeds) {
        if (numBeds >= 2 && numBeds <= 4) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        if (this.isOccupied()) {
            return "Room " + _roomNum + ", " + _numBeds + " Beds: Occupied by " + _guest;
        } else {
            return "Room " + _roomNum + ", " + _numBeds + " Beds: Available";
        }
    }
    
    public boolean equals(HotelRoom other) {
        return _roomNum == other._roomNum && _numBeds == other._numBeds;
    }
    
    public boolean before(HotelRoom other) {
        return _roomNum < other._roomNum;
    }
    
    public boolean after(HotelRoom other) {
        return other.before(this);
    }
    
    public boolean checkIn(String guest) {
        if (!isOccupied()){
            _occupied = true;
            _guest = guest;
            return true;
        }
        return false;
    }
    
    public void checkOut() {
        _guest = defGuest;
        _occupied = false;
    }
}