package com.learn.behavioral.command;

import com.learn.behavioral.command.executor.TextFileOperationExecutor;
import com.learn.behavioral.command.operation.impl.OpenTextFileOperation;
import com.learn.behavioral.command.operation.impl.SaveTextFileOperation;
import com.learn.behavioral.command.operation.impl.UpdateTextFileOperation;
import com.learn.behavioral.command.receiver.TextFile;

public class CommandMain {

    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        textFileOperationExecutor.executeTextFileOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeTextFileOperation(new UpdateTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeTextFileOperation(new SaveTextFileOperation(new TextFile("file1.txt")));

        textFileOperationExecutor.showTextFileOperationExecuted();
    }
}
