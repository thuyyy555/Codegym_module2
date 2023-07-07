package src.service;

import src.model.Facility;
import src.model.House;
import src.model.Room;
import src.model.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static LinkedHashMap<String, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put("Villa01", 2);
        facilityList.put("House01", 5);
        facilityList.put("Room01", 1);
        facilityList.put("Villa02", 4);
        facilityList.put("House02", 2);
        facilityList.put("Room02", 1);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayListFacility() {
        System.out.println("-------Display list Facility-------");
        Set<String> keySet = facilityList.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
//        System.out.println(facilityList);
    }

    @Override
    public void createNewVilla() {
        System.out.println("Loại dịch vụ là VILLA");
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa newVilla = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        facilityList.put(tenDichVu, 0);
    }

    @Override
    public void createNewHouse() {
        System.out.println("Loại dịch vụ là HOUSE");
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        House newHouse = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        facilityList.put(tenDichVu, 0);
    }

    @Override
    public void createNewRoom() {
        System.out.println("Loại dịch vụ là ROOM");
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Nhập dịch vụ đi kèm: ");
        String dichVuDiKem = scanner.nextLine();
        Room newRoom = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuDiKem);
        facilityList.put(tenDichVu, 0);
    }

    @Override
    public void displayListMaintenanceFacity() {
        Set<String> keySet = facilityList.keySet();
        for (String key : keySet) {
            if (facilityList.get(key) >= 5) {
                System.out.println(key + " " + facilityList.get(key));
            }
        }
    }
    public void increase(String id){
        for (Map.Entry<String, Integer> entry : facilityList.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(key.equals(id)){
                ++value;
            }
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
