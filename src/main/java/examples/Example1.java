package examples;

public class Example1 {

    private String checkStrValue = null;
    private static final String someValue = "SomeValue"; 

    /*public Example1() {
        this.checkStrValue = "SomeValue";
    }*/

    private void executeSomeConditions() {
        if (someValue.equals(this.checkStrValue)) {
            // Condition 1
        } else if (someValue.equals(this.checkStrValue)) {
            // Condition 2
        }
    }

    private static void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value = true) {
            //do Something
        } else {
            //else Do Something
        }
    }
}

