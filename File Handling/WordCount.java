import java.io.*;

public class WordCount {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "result.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                lineCount++;

                // Count characters (without newline)
                charCount += line.length();

                // Count words
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            // Write result to output file
            writer.write("Word Count : " + wordCount);
            writer.newLine();

            writer.write("Line Count : " + lineCount);
            writer.newLine();

            writer.write("Character Count : " + charCount);

            System.out.println("Result written to " + outputFile);

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}