package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundExcepetion extends RuntimeException{

    public NotFoundExcepetion() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
