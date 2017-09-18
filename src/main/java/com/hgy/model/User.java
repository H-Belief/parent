package com.hgy.model;

import java.io.Serializable;

/**
 * Created by huguoyu on 2017/9/18.
 */
public class User implements Serializable{

    /**
     * Column: user.id
     @mbggenerated 2017-09-18 10:19:59
     */
    private Integer id;

    /**
     *   姓名
     * Column: user.username
     @mbggenerated 2017-09-18 10:19:59
     */
    private String username;

    /**
     *   出生日期
     * Column: user.birthday
     @mbggenerated 2017-09-18 10:19:59
     */
    private Long birthday;

    /**
     *    1:男   2:女 对应字典表
     * Column: user.sex
     @mbggenerated 2017-09-18 10:19:59
     */
    private Integer sex;

    /**
     *   0:已删除  1:未删除
     * Column: user.isDelete
     @mbggenerated 2017-09-18 10:19:59
     */
    private Integer isdelete;

    /**
     *   手机号
     * Column: user.telephone
     @mbggenerated 2017-09-18 10:19:59
     */
    private String telephone;

    /**
     *   住址
     * Column: user.address
     @mbggenerated 2017-09-18 10:19:59
     */
    private String address;

    /**
     *   身份证号
     * Column: user.idNumber
     @mbggenerated 2017-09-18 10:19:59
     */
    private String idnumber;

    /**
     * Table: user
     @mbggenerated 2017-09-18 10:19:59
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

}
