package ch18IO.exam.no7;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        String filePath = "src/ch18IO/exam/no7/Example.java";

        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            try(fr; br){
                int rowNumber = 0;
                String rowData;

                while ( true ){
                    rowData = br.readLine();
                    rowNumber++;
                    if(rowData == null){
                        break;
                    }
                System.out.printf("%2d : %s%n",rowNumber,rowData);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }
    }
}
