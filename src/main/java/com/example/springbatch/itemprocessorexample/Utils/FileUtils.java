package com.example.springbatch.itemprocessorexample.Utils;

import com.opencsv.CSVWriter;
import com.example.springbatch.itemprocessorexample.Model.TransactionSummary;

import java.io.FileWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private final String outputFile;

    public FileUtils(String outputFile){
        this.outputFile = outputFile;
    }

    public void writeLine(TransactionSummary transaction) throws Exception {
        StringWriter writer = new StringWriter();
        Path path = Paths.get(
                ClassLoader.getSystemResource(outputFile).toURI()
                             );
        CSVWriter csvWriter = new CSVWriter(new FileWriter(path.toString()));


        String[] singleData = new String[3];
        singleData[0] = "test";
        singleData[1] = "producttest";
        singleData[3] = "12345";

        List<String[]> data = new ArrayList<>();
        data.add(singleData);

        csvWriter.writeAll(data);

        csvWriter.close();

        System.out.println(writer);
    }
}
