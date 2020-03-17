/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author rondw
 */
public class PurchaseInvoice {

    private String ID, employeeID, supplierID, payType, status;
    private Date saleDate;
    private int discount;
    private double purchaseMoney, remainMoney;

    public String getPurchaseInvoiceID() {
        return ID;
    }

    public void setPurchaseInvoiceID(String purchaseInvoiceID) {
        this.ID = purchaseInvoiceID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPurchaseInvoiceStatus() {
        return status;
    }

    public void setPurchaseInvoiceStatus(String purchaseInvoiceStatus) {
        this.status = purchaseInvoiceStatus;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(double purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(double remainMoney) {
        this.remainMoney = remainMoney;
    }

}
