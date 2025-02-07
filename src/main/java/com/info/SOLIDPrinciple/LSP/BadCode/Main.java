package com.info.SOLIDPrinciple.LSP.BadCode;

public class Main {

    public static void main(String[] args) {
        File file = new ReadOnly();
        file.readFile();
        file.writeFile();
    }

}
