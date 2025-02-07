package com.info.SOLIDPrinciple.LSP.GoodCode.FileType;

import com.info.SOLIDPrinciple.LSP.GoodCode.Writable;

public class ReadWrite extends ReadOnly implements Writable {
    @Override
    public void write() {
        System.out.println("Writing few content in file.");
    }
}
