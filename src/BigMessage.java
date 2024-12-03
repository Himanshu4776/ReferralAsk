import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BigMessage implements IMessage{
    @Override
    public void execute() {
        try (Scanner fileScanner = new Scanner(new FileReader(filePath))) {
            if (fileScanner.hasNextLine()) {
                String company = fileScanner.nextLine();
                String job = fileScanner.nextLine();
                String jobUrl = fileScanner.nextLine();

                String message = "I am Himanshu a software developer working at Infor, previously worked at Nagarro. I have expertise in DSA, Java, Springboot, React. I have made some good projects to showcase listed on my portfolio also. I have done some good work in hackathons and DSA contests as well.  \n" +
                        "  \n" +
                        "I saw " + company + " is hiring right now for " + job + ". Can you please refer me ? It would be a big help. Thanks\n" +
                        "  \n" +
                        "Job URL: " + jobUrl + " \n" +
                        "My Resume: https://tinyurl.com/Kr-Himanshu \n" +
                        "My Email: himanshukr20k@gmail.com  \n" +
                        "My Github: https://github.com/Himanshu4776 \n" +
                        "My Portfolio: https://himanshu4776.github.io/ \n" +
                        "Leetcode: https://leetcode.com/u/himanshu_tyagi/";

                System.out.println(message);
            }
        } catch (IOException e) {
            System.err.println("Error reading file with Scanner: " + e.getMessage());
        }
    }
}
