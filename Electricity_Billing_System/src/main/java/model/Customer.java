package model;

public class Customer {

    private int id;
    private String name;
    private String meterNo;
    private String address;
    private String phone;

    // ⭐ ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ⭐ Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ⭐ Meter
    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    // ⭐ Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ⭐ Phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}