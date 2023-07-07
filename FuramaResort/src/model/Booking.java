package src.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private int idBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private String idFacility;
    private int idCustomer;
    public Booking(){}

    public Booking(int idBooking, LocalDate startDate, LocalDate endDate, String idFacility, int idCustomer) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idFacility = idFacility;
        this.idCustomer = idCustomer;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }


    @Override
    public int hashCode() {
        int result = idCustomer;
        result = result + idFacility.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass()) return false;
        Booking booking = (Booking) obj;
        return (Objects.equals(this.getIdCustomer(), ((Booking) obj).getIdCustomer()))&&(Objects.equals(this.getIdFacility(), ((Booking) obj).getIdFacility()));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate=" + startDate.format(formatter) +
                ", endDate=" + endDate.format(formatter) +
                ", idFacility='" + idFacility + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (this.getStartDate() == o.getStartDate()) {
            return this.getEndDate().compareTo(o.getEndDate());
        }
        else return this.getStartDate().compareTo(o.getStartDate());
    }

}
