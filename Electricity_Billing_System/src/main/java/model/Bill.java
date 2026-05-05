package model;

public class Bill {

    private int id;
    private String meterNo;
    private int units;
    private double amount;
    private String status;

    // ⭐ ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ⭐ Meter
    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    // ⭐ Units
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    // ⭐ Amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // ⭐ Status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}