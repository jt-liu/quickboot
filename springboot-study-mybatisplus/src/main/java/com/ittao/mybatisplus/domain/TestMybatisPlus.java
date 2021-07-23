package com.ittao.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试表(TestMybatisPlus)实体类
 *
 * @author makejava
 * @since 2021-07-23 00:37:22
 */
public class TestMybatisPlus implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * ID
     */
    @TableId(value ="user_id")
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态 0-删除 1-正常
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 备注
     */
    private String remark;

    public TestMybatisPlus(){}

    public TestMybatisPlus(Integer userId, String userName, String password, Integer status, Date createTime, Date loginTime, String remark) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.remark = remark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
