package controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReadAxis {

    public ReadAxis() {
    }

    public  static List<String> readAxisF(String fileName)
    {

        List<String> lines = Collections.emptyList();
        try
        {
            lines =Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e)
        {
            System.out.println("File de Not found, check it");
            e.printStackTrace();
        }
        return lines;
    }

    public static List<Integer> appeandAxis(int parkSpot){
        int i;
        List<String> l = readAxisF("/Users/devmqk/Desktop/de.txt");
        List <Integer>lisApp = l.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        lisApp=lisApp.subList(parkSpot,parkSpot+10);


        return lisApp;
        /*
        Iterator<String> itr = l.iterator();
        System.out.println(l.get(2));
        while (itr.hasNext())

            System.out.println(Integer.parseInt(itr.next()) );
            */
    }

}
