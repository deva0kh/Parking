package FileManger;
import java.io.IOException;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class ReadAxis {



    public  static List<String> readAxis(String fileName)
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

    public  List<Integer> appeandAxis(int parkSpot){
        int i;
        List l = readAxis("/Users/devmqk/Desktop/de.txt");
        List lisApp =l.subList(parkSpot,parkSpot+9);

        return lisApp;
        /*
        Iterator<String> itr = l.iterator();
        System.out.println(l.get(2));
        while (itr.hasNext())

            System.out.println(Integer.parseInt(itr.next()) );
            */
    }

}
