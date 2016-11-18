package comp110;

public class Problem0789 {

  public static void main(String[] args) {

    // PROBLEM 7.
    System.out.println("PROBLEM 7");
    // Dept   Num   Hours
    // COMP   401   4
    // COMP   410   3
    // COMP   410   3

    Course comp401, comp410, econ410;

    comp401 = null; // TODO: Construct a Course instance
    System.out.println(comp401);

    comp410 = null; // TODO: Construct a Course instance
    System.out.println(comp410);

    econ410 = null; // TODO: Construct a Course instance
    System.out.println(econ410);

    // PROBLEM 8
    System.out.println("PROBLEM 8");
    CourseComparer c = new CourseComparer();

    // TODO: Perform method calls on CourseComparer c
    // that would result in the following Expected Output:
    // 
    // Expected Output:
    // -1 a before b
    // 1 a after b
    // 0 either way

    // Perform those method calls here. Run to check output.

    // PROBLEM 9
    System.out.println("PROBLEM 9");
    Predicate p1 = new ByHours(3);
    System.out.println("?"); // TODO: call test on p1 with comp401
    System.out.println("?"); // TODO: call test on p1 with comp410
    System.out.println("?"); // TODO: call test on p1 with econ410

    Predicate p2 = new ByDept("COMP");
    System.out.println("?"); // TODO: call test on p2 with comp401
    System.out.println("?"); // TODO: call test on p2 with comp410
    System.out.println("?"); // TODO: call test on p2 with econ410

  }

}
