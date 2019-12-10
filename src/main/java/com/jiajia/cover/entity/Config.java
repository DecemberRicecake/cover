package com.jiajia.cover.entity;

import java.util.Date;

public class Config {
    private Integer id;

    private String cfName;

    private String cfContent;

    private Date createtime;

    private Date updatetime;

    public Config(Integer id, String cfName, String cfContent, Date createtime, Date updatetime) {
        this.id = id;
        this.cfName = cfName;
        this.cfContent = cfContent;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Config() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCfName() {
        return cfName;
    }

    public void setCfName(String cfName) {
        this.cfName = cfName == null ? null : cfName.trim();
    }

    public String getCfContent() {
        return cfContent;
    }

    public void setCfContent(String cfContent) {
        this.cfContent = cfContent == null ? null : cfContent.trim();
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