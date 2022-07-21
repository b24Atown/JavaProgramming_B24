package office_hours.practice_10_09_2021;

public class Quizz {

    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quizz(String topic, int totalNumOfQuestions, double totalPoints){
        this.topic=topic;
        this.totalNumOfQuestions=totalNumOfQuestions;
        this.totalPoints=totalPoints;
    }

    public void takeQuizz(){
        System.out.println("Taking " + topic + " quizz");
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "topic='" + topic + '\'' +
                ", totalNumOfQuestions=" + totalNumOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
