import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShortMessage implements IMessage{
    @Override
    public void execute() {
        try (Scanner fileScanner = new Scanner(new FileReader(filePath))) {
            if (fileScanner.hasNextLine()) {
                String company = fileScanner.nextLine();
                String job = fileScanner.nextLine();
                String jobUrl = fileScanner.nextLine();

                String message = "I am Himanshu a software developer working at Infor, previously worked at Nagarro. I have expertise in DSA, Java, Springboot, React. \n" +
                        "  \n" +
                        "I saw " + company + " is hiring right now for " + job + ". Can you please refer me ? It would be a big help. Thanks\n" +
                        "  \n" +
                        "Job URL: " + jobUrl + " \n" +
                        "My Resume: https://tinyurl.com/Kr-Himanshu \n" +
                        "My Portfolio: https://himanshu4776.github.io/ \n";

                System.out.println(message);
            }
        } catch (IOException e) {
            System.err.println("Error reading file with Scanner: " + e.getMessage());
        }
    }
}
