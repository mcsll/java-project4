/**
 * Created by Matt on 3/30/2017.
 */
public class LinkedList {

    private Node list;

    public LinkedList () {
        list = null;
    }

    public void addFront (Student s) {
        Node newNode = new Node (s);
        newNode.next = list;
        list = newNode;
    }

    public void addTail (Student s) {
        Node newNode = new Node (s);
        Node current = list;
        if (list == null) {
            list = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Student bestStudent () {
        Node current = list.next;
        Student bestStudent = list.data;
        while (current != null) {
            if (current.data.getGPA() > bestStudent.getGPA()) {
                bestStudent = current.data;
            }
            current = current.next;
        }
        return bestStudent;
    }

    public void printLinkedList () {
        Node current = list;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    public int countNodesRec (Node list) {
        if (list.next == null) {
            return 1;
        } else {
            return countNodesRec(list.next) + 1;
        }
    }

    public Student worstStudentRec (Node list) {
        if (list.next == null) {
            return list.data;
        } else {
            Student s = worstStudentRec(list.next);
            if (s.getGPA() < list.data.getGPA()) {
                return s;
            } else {
                return list.data;
            }
        }
    }

    public void addInOrder (Student s) {
        // inserts a new node with student s at the right place in the linked list so
        // that linked list nodes have students ordered by gpa, both before and after
        // inserting the current node.
        Node newNode = new Node(s);
        Node current = list;
        if (list == null) {
            list = newNode;
        } else if (newNode.data.getGPA() < current.data.getGPA()) {
            list = newNode;
            newNode.next = current;
        } else {
            while (current.next != null && newNode.data.getGPA() > current.next.data.getGPA()) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = newNode;
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }

             

        /*} else {
            while (current.next != null && newNode.data.getGPA() > current.next.data.getGPA()) {
                current = current.next;
            }
            if (current.next == null && newNode.data.getGPA() >= current.data.getGPA()) {
                current.next = newNode;
            } else if (current.next == null && newNode.data.getGPA() < current.data.getGPA()) {
                list = newNode;
                newNode.next = current;
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }*/
        
    }

    public Node getList() {
        return list;
    }

    private class Node {
        public Student data;
        public Node next;

        public Node (Student s) {
            data = s;
            next = null;
        }
    }
}
