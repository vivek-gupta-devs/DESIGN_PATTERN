package com.info.SOLIDPrinciple.LSP.GoodCode;

import com.info.SOLIDPrinciple.LSP.GoodCode.FileType.ReadOnly;
import com.info.SOLIDPrinciple.LSP.GoodCode.FileType.ReadWrite;

public class Main {

    public static void main(String[] args) {

        ReadOnly readingFile = new ReadOnly();
        readingFile.read();

        ReadWrite writingFile = new ReadWrite();
        writingFile.write();
        writingFile.read();
    }
}
