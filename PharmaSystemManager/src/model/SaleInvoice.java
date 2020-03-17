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
public class SaleInvoice {

    private String ID,employeeID,payType,status;
    private Date saleDate;
    private int discount;

    public String getSaleInvoiceID() {
        return ID;
    }

    public void setSaleInvoiceID(String saleInvoiceID) {
        this.ID = saleInvoiceID;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getInvoiceStatus() {
        return status;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.status = invoiceStatus;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

}
