public class submission {
    private String studentID;
    private String maDe;
    private int correct, wrong;
    private float score;

    public submission() {
    }

    public submission(String studentID, String maDe, int correct, int wrong, float score) {
        this.studentID = studentID;
        this.maDe = maDe;
        this.correct = correct;
        this.wrong = wrong;
        this.score = score;
    }

    public submission(submission other) {
        this.studentID = other.studentID;
        this.maDe = other.maDe;
        this.correct = other.correct;
        this.wrong = other.wrong;
        this.score = other.score;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getMaDe() {
        return maDe;
    }

    public int getCorrect() {
        return correct;
    }

    public int getWrongt() {
        return wrong;
    }

    public float score() {
        return score;
    }

    public void setStudentID(String newID) {
        this.studentID = newID;
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
