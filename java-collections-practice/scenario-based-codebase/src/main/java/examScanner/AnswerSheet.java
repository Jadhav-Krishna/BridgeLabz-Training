package examScanner;

import java.util.List;

public interface AnswerSheet {
    List<String> getCorrectAnswers();
    String getSubjectName();
}