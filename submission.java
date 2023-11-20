public class submission {
    private Student_Exam student;
    private String maDe;
    private int correct, wrong;
    private float score;

    public submission() {
    }

    public submission(Student_Exam student, String maDe, int correct, int wrong, float score) {
        this.student = student;
        this.maDe = maDe;
        this.correct = correct;
        this.wrong = wrong;
        this.score = score;
    }

    public submission(submission other) {
        this.student = other.student;
        this.maDe = other.maDe;
        this.correct = other.correct;
        this.wrong = other.wrong;
        this.score = other.score;
    }

    public String getMaDe() {
        return maDe;
    }

    public int getCorrect() {
        return correct;
    }

    public int getWrong() {
        return wrong;
    }

    public float score() {
        return score;
    }

    public void setMaDe(String newMaDe) {
        this.maDe = newMaDe;
    }

    public void setCorrect(int newCorrect) {
        this.correct = newCorrect;
    }

    public void setWrong(int newWrong) {
        this.wrong = newWrong;
    }

    public void setScore(float newScore) {
        this.score = newScore;
    }
}
