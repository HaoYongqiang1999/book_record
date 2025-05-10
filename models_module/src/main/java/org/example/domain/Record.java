package org.example.domain;



public class Record {
    private Integer id;
    private String updateTime;
    private String operation;
    private String bookName;
    public Record() {
    }
    public Record(Integer id, String updateTime, String operation, String bookName) {
        this.id = id;
        this.updateTime = updateTime;
        this.operation = operation;
        this.bookName = bookName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", updateTime='" + updateTime + '\'' +
                ", operation='" + operation + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
