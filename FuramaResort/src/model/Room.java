package src.model;

public class Room extends Facility{
    String dichVuDiKem;

    public Room() {
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
