/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rondw
 */
public class DrugCategory {

    private String ID, Name, description;

    public String getDrugCategoryID() {
        return ID;
    }

    public void setDrugCategoryID(String drugCategoryID) {
        this.ID = drugCategoryID;
    }

    public String getDrugCategoryName() {
        return Name;
    }

    public void setDrugCategoryName(String drugCategoryName) {
        this.Name = drugCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

}
