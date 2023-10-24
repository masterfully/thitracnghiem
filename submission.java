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
}
