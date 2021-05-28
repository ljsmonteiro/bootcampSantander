package com.santander.Stocks.exceptions;

import com.santander.Stocks.util.MessageUtils;

public class NotFoundExcepetion extends RuntimeException{
    public NotFoundExcepetion() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
