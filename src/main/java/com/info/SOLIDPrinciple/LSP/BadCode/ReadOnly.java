package com.info.SOLIDPrinciple.LSP.BadCode;

public class ReadOnly extends File {

    public void writeFile() {
        throw new RuntimeException("writing not allowed in readOnly file.");
    }

}
