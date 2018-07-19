package com.example.server.entity;

import java.util.Date;

public class UserBasicInfo {
    private String id;

    private String nickName;

    private String phone;

    private String password;

    private String recommenderPhone;

    private String qrCode;

    private String valletUrl;

    private String headImage;

    private Byte level;

    private String payPassword;

    private Byte profitState;

    private Byte withdrawState;

    private Byte state;

    private Byte isManager;

    private Date registerTime;

    private Date createTime;

    private Date updateTime;

    private String indirectRecommend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRecommenderPhone() {
        return recommenderPhone;
    }

    public void setRecommenderPhone(String recommenderPhone) {
        this.recommenderPhone = recommenderPhone == null ? null : recommenderPhone.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getValletUrl() {
        return valletUrl;
    }

    public void setValletUrl(String valletUrl) {
        this.valletUrl = valletUrl == null ? null : valletUrl.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public Byte getProfitState() {
        return profitState;
    }

    public void setProfitState(Byte profitState) {
        this.profitState = profitState;
    }

    public Byte getWithdrawState() {
        return withdrawState;
    }

    public void setWithdrawState(Byte withdrawState) {
        this.withdrawState = withdrawState;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getIsManager() {
        return isManager;
    }

    public void setIsManager(Byte isManager) {
        this.isManager = isManager;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIndirectRecommend() {
        return indirectRecommend;
    }

    public void setIndirectRecommend(String indirectRecommend) {
        this.indirectRecommend = indirectRecommend == null ? null : indirectRecommend.trim();
    }

    @Override
    public String toString() {
        return "UserBasicInfo{" +
                "id='" + id + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", recommenderPhone='" + recommenderPhone + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", valletUrl='" + valletUrl + '\'' +
                ", headImage='" + headImage + '\'' +
                ", level=" + level +
                ", payPassword='" + payPassword + '\'' +
                ", profitState=" + profitState +
                ", withdrawState=" + withdrawState +
                ", state=" + state +
                ", isManager=" + isManager +
                ", registerTime=" + registerTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", indirectRecommend='" + indirectRecommend + '\'' +
                '}';
    }
}