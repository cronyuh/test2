package com.example.expensify;

import androidx.lifecycle.ViewModel;

public class ExpenseViewModel extends ViewModel {
    private ExpenseRepository repository;

    public ExpenseViewModel(ExpenseRepository repository) {
        this.repository = repository;
    }

    public void insert(Expense expense) {
        repository.insert(expense);
    }
}
