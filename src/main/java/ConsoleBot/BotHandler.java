package ConsoleBot;

import java.io.*;
import java.util.*;

/**
 * Telegram bot
 * @author Radebe Donald
 * @version 1.1
 * @since 23.11.2020
 */

public class BotHandler extends ConsoleBot{
    static final Scanner scanner = new Scanner(System.in);

    public void runBot(){
        printWelcomeMessage();
        String cmd = scanner.nextLine();
        if (cmd.equals("/start")){
            start();
        }
    }

    public void start(){
        System.out.println("Use following commands to interact with the bot:" +
                "\n /trivia - to play a trivia game" +
                "\n /leaderBoard - to view the top player arranged by their score" +
                "\n /start - for help" +
                "\n /exit - to exit the bot");
        String cmd = scanner.nextLine();
        if (cmd.equals("/trivia")) {
                play();
        }else if (cmd.equals("/leaderBoard")) {
            System.out.println("Here is the leader board: \n" +
                    "# - Name   - Score");
            for (int i = 0; i < getLeaderBoard().size(); i++) {
                System.out.println(getLeaderBoard().get(i));
            }
            start();
        }
        if (cmd.equals("/exit")) {
            scanner.close();
        }
    }

    public void play(){
        System.out.println("Enter your name:");
        Player player = new Player();
        player.setPlayerName(scanner.nextLine());
        player.setPlayerId();
        int count = 0;
        while (count < 3){
            List<String> question = new ArrayList<>();
            question.addAll(Arrays.asList(getQuestions().get(count).split(", ")));
            System.out.println(question.get(0)+"\n"+question.get(1)+" or "+question.get(2));
            if (compareAnswer(scanner.nextLine(), question.get(3))){
                player.increaseScore();
            }
            count++;
//            System.out.println();

            if (count == 3){
                break;
            }
        }
        System.out.println("Your Score"+player.score);
    }

    public void ask(){
        ArrayList<String> quiz = new ArrayList<>();
        String[] questionList = new String[5];

        for (int i = 0; i < 5; i++) {
            questionList[i] = String.valueOf(getQuestions().get(i).split(", "));
            quiz.add(questionList[2]);
            if (compareAnswer(scanner.nextLine(), quiz.get(i))){
                System.out.println("Correct!");
                ask();
            }else {
                System.out.println("Wrong Answer!");
                ask();
            }
        }

    }

    private boolean compareAnswer(String ans, String correctAnswer) {
        if (ans.equals(correctAnswer)){
            return true;
        }else {
            return false;
        }
    }

    public String readFile(String fileName){
        StringBuilder result = new StringBuilder();
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/"+fileName);
            String newLine = System.getProperty("line.separator");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            boolean flag = false;
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(flag? newLine: "").append(line);
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public ArrayList<String> getLeaderBoard(){
        List<String> leaderBoard = new ArrayList<>();
        leaderBoard.addAll(Arrays.asList(readFile("leaderBoard.txt").split("\\r?\\n")));
        return (ArrayList<String>) leaderBoard;
    }

    public ArrayList<String> getQuestions(){
        List<String> quizList = new ArrayList<>();
        quizList.addAll(Arrays.asList(readFile("questions.txt").split("\\r?\\n")));
        return (ArrayList<String>) quizList;
    }

    public void saveProgress(){
        //TODO
    }

}
