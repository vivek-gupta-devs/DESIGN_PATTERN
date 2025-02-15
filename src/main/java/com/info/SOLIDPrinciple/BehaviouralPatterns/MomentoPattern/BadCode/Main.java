package com.info.SOLIDPrinciple.BehaviouralPatterns.MomentoPattern.BadCode;

public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        editor.write("Sample content");
        editor.save();
        editor.write("content updated on second time");
        editor.save();
        System.out.println(editor.getContent());
        editor.revert();
        editor.revert();
        System.out.println(editor.getContent());
    }
}
