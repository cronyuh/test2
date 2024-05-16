package com.example.expensify;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ExpenseViewModelFactory implements ViewModelProvider.Factory {
    private ExpenseRepository repository;

    public ExpenseViewModelFactory(ExpenseRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ExpenseViewModel.class)) {
            return (T) new ExpenseViewModel(repository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
