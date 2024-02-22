package com.learn.behavioral.command.operation.impl;

import com.learn.behavioral.command.operation.TextFileOperation;
import com.learn.behavioral.command.receiver.TextFile;

public class UpdateTextFileOperation implements TextFileOperation {

    private TextFile file;

    public UpdateTextFileOperation(TextFile file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return "File Updated";
    }
}
