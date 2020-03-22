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

    private String ID, employeeID, supplierID, status;
    private Date purchaseDate;
    private int discount;
    private double purchaseByCash,purchaseByCredit, remainMoney;

    public double getPurchaseByCash() {
        return purchaseByCash;
    }

    public void setPurchaseByCash(double purchaseByCash) {
        this.purchaseByCash = purchaseByCash;
    }

    public double getPurchaseByCredit() {
        return purchaseByCredit;
    }

    public void setPurchaseByCredit(double purchaseByCredit) {
        this.purchaseByCredit = purchaseByCredit;
    }

    public String getID() {
        return ID;
    }

    public void setID(String purchaseInvoiceID) {
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String purchaseInvoiceStatus) {
        this.status = purchaseInvoiceStatus;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date saleDate) {
        this.purchaseDate = saleDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(double remainMoney) {
        this.remainMoney = remainMoney;
    }

}
