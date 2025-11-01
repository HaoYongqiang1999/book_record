package org.haotest.vo;

import java.util.List;
import java.util.Map;

public class TestTableVo {
    String tabNm;
    Map<String, Object> primaryKeyData;
    Map<String, Object> columnData;

    public Map<String, Object> getPrimaryKeyData() {
        return primaryKeyData;
    }

    public void setPrimaryKeyData(Map<String, Object> primaryKeyData) {
        this.primaryKeyData = primaryKeyData;
    }

    public Map<String, Object> getColumnData() {
        return columnData;
    }

    public void setColumnData(Map<String, Object> columnData) {
        this.columnData = columnData;
    }

    public String getTabNm() {
        return tabNm;
    }

    public void setTabNm(String tabNm) {
        this.tabNm = tabNm;
    }
    public TestTableVo() {
    }

    public TestTableVo(String tabNm,  Map<String, Object> primaryKeyData, Map<String, Object> columnData) {
        this.tabNm = tabNm;
        this.primaryKeyData = primaryKeyData;
        this.columnData = columnData;
    }

    @Override
    public String toString() {
        return "TestTableVo{" +
                "tabNm='" + tabNm + '\'' +
                ", primaryKeyData=" + primaryKeyData +
                ", columnData=" + columnData +
                '}';
    }
}
