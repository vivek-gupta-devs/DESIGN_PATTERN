package com.info.SOLIDPrinciple.LSP.GoodCode.FileType;

import com.info.SOLIDPrinciple.LSP.GoodCode.Readable;

public class ReadOnly implements Readable {

    @Override
    public void read() {
        System.out.println("Reading a content from file.");
    }
}
