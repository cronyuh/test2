package com.example.expensify;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expenses")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String date;
    public String name;
    public double amount;
    public String location;
    public String category;
    public boolean isPaid;

    public Expense(String date, String name, double amount, String location, String category, boolean isPaid) {
        this.date = date;
        this.name = name;
        this.amount = amount;
        this.location = location;
        this.category = category;
        this.isPaid = isPaid;
    }
}
