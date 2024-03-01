package model;

import java.util.Date;

public class inventoryModel {

    private long inventoryId;
    private String isbn;
    private Date storeTime;
    private String status;

    
    public inventoryModel() {
    }

    public inventoryModel(long inventoryId, String isbn, Date storeTime, String status) {
        this.inventoryId = inventoryId;
        this.isbn = isbn;
        this.storeTime = storeTime;
        this.status = status;
    }

    
    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(Date storeTime) {
        this.storeTime = storeTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "InventoryModel{" +
                "inventoryId=" + inventoryId +
                ", isbn='" + isbn + '\'' +
                ", storeTime=" + storeTime +
                ", status='" + status + '\'' +
                '}';
    }
}