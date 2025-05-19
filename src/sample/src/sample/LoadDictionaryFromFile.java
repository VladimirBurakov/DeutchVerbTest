package sample;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class LoadDictionaryFromFile {
    private String[][] dictionary;

    {
        try {
            dictionary = readFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Mistake");
        }
    }

    private String[][] readFile() throws IOException {
        String pathKatja = "C:\\Users\\katru\\Desktop\\foto_video\\VocabularTest.txt";
        //String path = "C:\\Users\\Vladimir\\Desktop\\VocabularTest.txt";
        String path = "D:\\VocabularTest.txt";
        File file = new File(path);
        File fileKatja = new File(pathKatja);
        List<String> list = null;
        String[][]resultFilterArray;
        try {
            list = Files.readAllLines(fileKatja.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            list = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        }

        String[] array = list.toArray(new String[0]);
        int length = array.length;
        int amountOfPlus = 0;

        //счетчик плюсов
        for(int i = 0; i < length; i++){
            if(array[i].contains("+")){
                amountOfPlus++;
            }
        }
        //

        String[][] resultArray = new String[length-amountOfPlus][5];
        int tempAmountOfPlus = 0;
        for(int i = 0; i < length; i++){
            if(array[i].contains("+")){
                tempAmountOfPlus++;
            }else{
                String[] tempValue = array[i].replaceAll("^\\s*|[{}\"]|(,$)", "").split(",\\s");
                for(int j = 0; j < 5; j++){
                    resultArray[i-tempAmountOfPlus][j] = tempValue[j];
                }
                if(tempValue.length > 5){
                    resultArray[i-tempAmountOfPlus][4] = resultArray[i-tempAmountOfPlus][4] + ", " + tempValue[5];
                }
            }
       }
        return resultArray;
    }

    public String[][] getDictionaryFromFile() {
        return dictionary;
    }
}
