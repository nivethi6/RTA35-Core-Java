package encapsulation;

public class Voter {

    private String name;
    private int age;
    private boolean hasVoted;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
        this.hasVoted = false; // initially, the person has not voted
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void checkVotingEligibility() {
        if (age >= 18 && !hasVoted) {
            System.out.println(name + " is eligible to vote.");
            hasVoted = true; // Mark that the person has voted
        } else if (age < 18) {
            System.out.println(name + " is not eligible to vote because they are under 18.");
        } else if (hasVoted) {
            System.out.println(name + " has already voted.");
        }
    }

    public static void main(String[] args) {
        Voter voter1 = new Voter("Nivi", 20);
        voter1.checkVotingEligibility();  // Nivi can vote

        Voter voter2 = new Voter("Sai", 17);
        voter2.checkVotingEligibility();  // Sai can't vote

        Voter voter3 = new Voter("Pradan", 25);
        voter3.checkVotingEligibility();  // Pradan can vote
        voter3.checkVotingEligibility();  // Pradan has already voted
    }
}
