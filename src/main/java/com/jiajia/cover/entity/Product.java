package com.jiajia.cover.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private String prdName;

    private String prdDesc;

    private String serverIp;

    private String serverPort;

    private Date createtime;

    private Date updatetime;

    public Product(Integer id, String prdName, String prdDesc, String serverIp, String serverPort, Date createtime, Date updatetime) {
        this.id = id;
        this.prdName = prdName;
        this.prdDesc = prdDesc;
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Product() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc == null ? null : prdDesc.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort == null ? null : serverPort.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}