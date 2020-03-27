import java.util.Scanner;

public class Shape {
    private String color = "black";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String inputColor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input color : ");
        return input.nextLine();
    }

    public void setColor() {
        this.color = this.inputColor();
    }

    public boolean getFilled() {
        return filled;
    }

    Scanner input = new Scanner(System.in);

    public String inputFillStatus() {
        System.out.print("Is it be filled ? (y/n) : ");
        String answer = input.nextLine();
        return checkFillAnswerValid(answer);
    }

    public String checkFillAnswerValid(String answer) {
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.print("Please choose 'y' for YES or 'n' for NO: ");
            answer = input.nextLine();
        }
        return answer;
    }

    public void setFilled() {
        if (inputFillStatus().equals("n")) {
            this.filled = false;
        }
    }
}