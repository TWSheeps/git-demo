package com.lby.mybatis.pojo;

/**
 * @author 李博洋
 * @Description
 * @create 2022-07-29 21:28
 */
public class Dept {
    private Integer did;
    private String deptName;

    public Dept() {
    }
    void inta(){}
    void initB(){}
    void initC(){}
    void initD(){}
    void initE(){}
    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Dept(Integer did, String deptName) {
        this.did = did;
        this.deptName = deptName;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
