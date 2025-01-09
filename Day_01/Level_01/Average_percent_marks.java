//Sam's mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM.

//Create class with name Prog_2 indicating the purpose is to display result.
class Average_percent_marks {
   public static void main(String[] args) {

      // Create a int variable Maths and assign value 94
      int Maths = 94;

      // Create a int variable Physics and assign value 95
      int Physics = 95;

      // Create a int variable Chemistry and assign value 96
      int Chemistry = 96;

      // Create a int variable avg to calculate the average percent mark in PCM.
      int avg = (Maths + Physics + Chemistry) / 3;

      // Display the result
      System.out.println("Sam’s average mark in PCM is " + avg);

   }
}
