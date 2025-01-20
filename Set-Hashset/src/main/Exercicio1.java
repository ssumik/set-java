import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path;

        System.out.println("Inform the file path:");
        path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                Set<LogEntry> set = new HashSet<>();

                String line = br.readLine();

                while(line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                
                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }

            System.out.println("total users: " + set.size());
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
