/**
 * CS152 Section 01, Project #4
 * TestList contains main routine
 * @author (Matthew Sullivan)
 * @version (April 10, 2017)
 */

public class TestList
{

    public static void main (String[] args)
    {
        Student s1 = new Student("Adams", 3.9, 26);
        Student s2 = new Student("Lewis", 2.1, 29);
        Student s3 = new Student("Lopez", 4.0, 53);
        Student s4 = new Student("Smith", 3.2, 22);
        Student s5 = new Student("Zeeler", 3.6, 38);

        LinkedList list1 = new LinkedList();
        list1.addFront(s1);
        list1.addFront(s2);
        list1.addFront(s3);
        list1.addFront(s4);
        list1.addFront(s5);
        System.out.println("List 1 -- using addFront");
        list1.printLinkedList();
        System.out.println("Best: "
                + list1.bestStudent().toString());
        System.out.println("Worst: "
                + list1.worstStudentRec(list1.getList()).toString());
        System.out.println("Count: "
                + list1.countNodesRec(list1.getList()));
        System.out.println();

        LinkedList list2 = new LinkedList();
        list2.addTail(s1);
        list2.addTail(s2);
        list2.addTail(s3);
        list2.addTail(s4);
        list2.addTail(s5);
        System.out.println("List 2 -- using addTail");
        list2.printLinkedList();
        System.out.println("Best: "
                + list2.bestStudent().toString());
        System.out.println("Worst: "
                + list2.worstStudentRec(list2.getList()).toString());
        System.out.println("Count: "
                + list2.countNodesRec(list2.getList()));
        System.out.println();

        LinkedList list3 = new LinkedList();
        list3.addInOrder(s1);
        list3.addInOrder(s2);
        list3.addInOrder(s3);
        list3.addInOrder(s4);
        list3.addInOrder(s5);
        System.out.println("List 3 -- using addInOrder");
        list3.printLinkedList();
        System.out.println("Best: "
                + list3.bestStudent().toString());
        System.out.println("Worst: "
                + list3.worstStudentRec(list3.getList()).toString());
        System.out.println("Count: "
                + list3.countNodesRec(list3.getList()));
        

    }
}
