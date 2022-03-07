package org.sanity.instagraph;

import java.util.*;

public class Main {
    public static Map<String, Object> initializeCommands() {
        Map<String, Object> commands = new LinkedHashMap<>();

        commands.put("init", null);
        commands.put("dataset", null);
        commands.put("insert", null);
        commands.put("update", null);
        commands.put("delete", null);
        commands.put("query-users", null);
        commands.put("query-cheaters", null);
        commands.put("query-high-quality-pictures", null);
        commands.put("query-comments-and-users", null);
        commands.put("query-profile-pictures", null);
        commands.put("query-spam-posts", null);
        commands.put("query-most-popular-users", null);
        commands.put("query-commenting-myself", null);
        commands.put("query-user-top-posts", null);
        commands.put("query-posts-and-commentators", null);
        commands.put("query-init-procedure-post", null);
        commands.put("query-init-procedure-filter", null);
        commands.put("query-exec-procedure-post", null);
        commands.put("query-exec-procedure-filter", null);

        return commands;
    }

    public static void main(String[] args) {
        Map<String, Object> commands = initializeCommands();

        Scanner scanner = new Scanner(System.in);

        String inputLine = "";

        while(!(inputLine = scanner.nextLine()).equals("exit")) {
            if(commands.containsKey(inputLine)) {
//                commands.get(inputLine).execute();
            }
        }
    }


}
