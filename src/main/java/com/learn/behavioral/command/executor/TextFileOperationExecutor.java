package com.learn.behavioral.command.executor;

import com.learn.behavioral.command.operation.TextFileOperation;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private List<TextFileOperation> textFileOperationList = new ArrayList<>();

    public String executeTextFileOperation(TextFileOperation textFileOperation){
        textFileOperationList.add(textFileOperation);
        return textFileOperation.execute();
    }

    public void showTextFileOperationExecuted(){
        textFileOperationList.stream().forEach(s->System.out.println(s.getClass().getSimpleName()));
    }
}
