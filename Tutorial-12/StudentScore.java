package tutorial12;


import java.util.Scanner;

class InvalidScoreException extends RuntimeException {
    InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    int score;

    void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException(
                "Score must be between 0 and 100!"
            );
        }

        this.score = score;
    }

    void displayScore() {
        System.out.println("Score: " + score);
    }
}

class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student score: ");
        int score = sc.nextInt();

        try {
            s.setScore(score);
            s.displayScore();
        } catch (InvalidScoreException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
