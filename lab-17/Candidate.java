// 2. Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate the Candidate class. (B)

import java.util.Scanner;

class Candidate {
    private int candidateID;
    private String candidateName;
    private int candidateAge;
    private double candidateWeight;
    private double candidateHeight;

    public void GetCandidateDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Candidate ID: ");
        candidateID = sc.nextInt();

        System.out.print("Enter Candidate Name: ");
        candidateName = sc.nextLine();

        System.out.print("Enter Candidate Age: ");
        candidateAge = sc.nextInt();

        System.out.print("Enter Candidate Weight (kg): ");
        candidateWeight = sc.nextDouble();

        System.out.print("Enter Candidate Height (cm): ");
        candidateHeight = sc.nextDouble();

        sc.close();
    }

    public void DisplayCandidateDetails() {
        System.out.println("\n--- Candidate Details ---");
        System.out.println("ID: " + candidateID);
        System.out.println("Name: " + candidateName);
        System.out.println("Age: " + candidateAge);
        System.out.println("Weight: " + candidateWeight + " kg");
        System.out.println("Height: " + candidateHeight + " cm");
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.GetCandidateDetails();
        candidate.DisplayCandidateDetails();
    }
}
