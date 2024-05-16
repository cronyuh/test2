package com.example.expensify;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExpenseRepository {
    private ExpenseDao expenseDao;
    private Executor executor = Executors.newSingleThreadExecutor();

    public ExpenseRepository(AppDatabase database) {
        expenseDao = database.expenseDao();
    }

    public void insert(Expense expense) {
        executor.execute(() -> expenseDao.insert(expense));
    }
}
