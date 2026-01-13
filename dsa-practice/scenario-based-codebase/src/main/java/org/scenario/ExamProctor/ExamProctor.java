package org.scenario.ExamProctor;

import java.util.*;

class ExamProctor {

    Stack<Integer> navigation = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    void visitQuestion(int qId) {
        navigation.push(qId);
    }

    void answerQuestion(int qId, String answer) {
        answers.put(qId, answer);
    }

    void goBack() {
        if (!navigation.isEmpty()) {
            navigation.pop();
        }
    }

    int calculateScore() {
        int score = 0;
        for (int qId : correctAnswers.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
