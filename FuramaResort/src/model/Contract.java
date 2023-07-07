package src.model;

import java.time.LocalDate;

public class Contract {
    private int idContract;
    private int idBooking;
    private double money;
    private double total;
    private int idCustomer;
    public Contract(){}

    public Contract(int idContract, int idBooking, double money, double total, int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.money = money;
        this.total = total;
        this.idCustomer = idCustomer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking='" + idBooking + '\'' +
                ", money=" + money +
                ", total=" + total +
                ", idCustomer=" + idCustomer +
                '}'+'\n';
    }
}
