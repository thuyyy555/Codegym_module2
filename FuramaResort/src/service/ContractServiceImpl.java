package src.service;

import src.model.Booking;
import src.model.Contract;
import src.model.Customer;

import java.time.LocalDate;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> listContracts = new LinkedList<Contract>();
    Scanner scanner = new Scanner(System.in);
    BookingService bookingService = new BookingServiceImpl();

    @Override
    public void createNewContract() {
        System.out.println("========Create New Contract========");
        System.out.println(creatListBooking());
        System.out.println("Tạo hợp đồng cho booking có idBooking "+ (creatListBooking().peek().getIdBooking()));
        int idBooking = creatListBooking().peek().getIdBooking();
        System.out.print("Nhập idContract: ");
        int idContract = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tiền cọc trước: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tổng số tiền thanh toán: ");
        double total = Double.parseDouble(scanner.nextLine());
        int idCustomer = creatListBooking().peek().getIdCustomer();
        Contract newContract = new Contract(idContract, idBooking, money, total, idCustomer);
        listContracts.add(newContract);
        creatListBooking().removeFirst();
        System.out.println("Tạo hợp đồng thành công!");
    }

    @Override
    public LinkedList<Booking> creatListBooking() {
        LinkedList<Booking> listBooking = new LinkedList<>();
        listBooking.addAll(bookingService.getList());
        return listBooking;
    }

    @Override
    public void displayListContract() {
        System.out.println("========Display List Contract========");
        System.out.println(listContracts);
    }

    @Override
    public void editContract() {
        System.out.print("Nhập mã hợp đồng cần chỉnh sửa thông tin: ");
        int idContract = Integer.parseInt(scanner.nextLine());
        for(Contract contract : listContracts){
            if(contract.getIdContract()==idContract){
                System.out.print("Cập nhật số tiền cọc trước: ");
                contract.setMoney(Double.parseDouble(scanner.nextLine()));
                System.out.print("Cập nhật tổng số tiền thanh toán: ");
                contract.setTotal(Double.parseDouble(scanner.nextLine()));
            }
        }
    }
}

