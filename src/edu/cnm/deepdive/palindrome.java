package edu.cnm.deepdive;

public class palindrome {

  public static boolean test(String candidate) {
    String simpleCandidate = candidate.toLowerCase().replaceAll("[^a-z0-9]", "");
    //TODO assign candidate from candidate , stripping out spaces &B punctuation0
    return testSimple(simpleCandidate);
  }

  private static boolean testSimple(String candidate) {
    boolean result = true;
    for (int i = 0, j = candidate.length() - 1; i < j; i++, j--) {
      if (candidate.charAt(i) != candidate.charAt(j)) {
        result = false;
        break;
      }
    }
    return result;
  }

}
