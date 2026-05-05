package com.harsh;
// Changing Table and Column names :
// Note : By default, both EntityName and TableName are derived from ClassName, but they are independent of each other.

import jakarta.persistence.*;

//@Entity(name="alien_table") This changes both the EntityName and TableName. But if you dont want to change EntityName and chnage the table name then :
@Entity
@Table(name="AlienTable") // This changes the tableName only and not EntityName
public class Alien {
    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aName;

    // @Transient means this field will NOT be stored in the database. Field exists in Java object but Not mapped to any database column (used because for application we need some field for processing only and to store in object only and  not req to store in DB for those fields we can use Transient)
    @Transient
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
