package edu.cnm.deepdive;

public class palindrome {

  public  static boolean test(String candidate) {
    String simpleCandidate = candidate.toLowerCase().replaceAll("[^a-z0-9]", "");
    //TODO assign candidate from candidate , stripping out spaces &B punctuation0
    return  testSimple(simpleCandidate);
  }

  private static boolean testSimple(String candidate) {
    return (candidate.length() <= 1) || (
        candidate.charAt(0) == candidate.charAt(candidate.length() - 1) && testSimple(
            candidate.substring(1, candidate.length() - 1)));
  }

}
