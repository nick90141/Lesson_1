package task_4;

public class Main {
    public static void main(String[] args) {
        Computer[] Computers = new Computer[5];
        Computers [0] = new Computer("Example0", 2015);
        Computers [1] = new Computer("Example1", 2016);
        Computers [2] = new Computer("Example2", 2017);
        Computers [3] = new Computer("Example3", 2018);
        Computers [4] = new Computer("Example4", 2019);

        for (int i = 0; i < Computers.length; i++) {
            System.out.println("Computer " + (i + 1) + ": " + Computers[i]);
        }



    }
}
