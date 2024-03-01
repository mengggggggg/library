package model;

public class borrowModel {

    private Long userId;
    private Long inventoryId;
    private String borrowingTime;
    private String returnTime;

    

    public borrowModel() {
    }

    public borrowModel(Long userId, Long inventoryId, String borrowingTime, String returnTime) {
        this.userId = userId;
        this.inventoryId = inventoryId;
        this.borrowingTime = borrowingTime;
        this.returnTime = returnTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getBorrowingTime() {
        return borrowingTime;
    }

    public void setBorrowingTime(String borrowingTime) {
        this.borrowingTime = borrowingTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
}