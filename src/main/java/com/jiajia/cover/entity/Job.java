package com.jiajia.cover.entity;

import java.util.Date;

public class Job {
    private Integer id;

    private String jobname;

    private Integer productId;

    private Integer jobStatus;

    private Date createtime;

    private Date updatetime;

    public Job(Integer id, String jobname, Integer productId, Integer jobStatus, Date createtime, Date updatetime) {
        this.id = id;
        this.jobname = jobname;
        this.productId = productId;
        this.jobStatus = jobStatus;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Job() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
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