package com.info.SOLIDPrinciple.BehaviouralPatterns.MomentoPattern.BadCode;

import java.util.Stack;

public class TextEditor {
    // Here SRP is getting violated
    private Stack<String> storage = new Stack<>();

    String content;

    public String getContent() {
        return content;
    }

    public void write(String content) {
        this.content = content;
    }

    public void save(){
        storage.push(content);
    }

    public void revert(){
        content = storage.pop();
    }
}
