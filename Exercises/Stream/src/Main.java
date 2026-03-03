import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Integer> studentScore = Arrays.asList(40, 55, 30, 70, 90);

        List<Integer> updateScores = studentScore.stream()
                .map(score -> score + 10)
                .filter(score -> score > 40)
                .sorted((a,b) ->  b- a)
                 .collect(Collectors.toList());
        updateScores.forEach(System.out::println);

    }


}