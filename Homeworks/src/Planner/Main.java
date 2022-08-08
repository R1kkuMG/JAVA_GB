package Planner;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileImport fileImport = new FileImport();
        String path = new File("src/Planner/planner.xml").getAbsolutePath();
        System.out.println(fileImport.readFile(path));


        FileExport fileExport = new FileExport();

        Data data = new Data (2, "Take order", "30.07.2022", "18:00", "04.08.2022",
                "Ivanov", "Ivan", Priority.LOW);
        fileExport.writeData(data, path);
    }
}
