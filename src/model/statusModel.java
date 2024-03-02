package model;

public enum statusModel {
    AVAILABLE("在庫"),
    BORROWED("出借中"),
    PROCESSING("整理中(歸還後未入庫)"),
    LOST("遺失"),
    DAMAGED("損毀"),
    DISCARDED("廢棄");

    private final String status;

    statusModel(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}