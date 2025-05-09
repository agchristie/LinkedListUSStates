import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        StateLinkedList list = new StateLinkedList();

        // Adding states and their neighbors
        list.addState("California", Arrays.asList("Oregon", "Nevada", "Arizona"));
        list.addState("Texas", Arrays.asList("New Mexico", "Oklahoma", "Louisiana"));
        list.addState("Indiana", Arrays.asList("Illinois", "Kentucky", "Michigan", "Ohio"));
        list.addState("Florida", Arrays.asList("Georgia", "Alabama"));

        // Print all states and their neighbors
        System.out.println("List of states and neighbors:");
        list.printStates();

        // Delete a state
        list.deleteState("Florida");

        // Print the list after deletion
        System.out.println("\nAfter deleting Florida:");
        list.printStates();
    }
}