package LinkedList.Jobsheet12.Assignment;

public class SSONode {
    StudentService data;
    SSONode next;

    public SSONode() {}

    public SSONode(StudentService data, SSONode next) {
        this.data = data;
        this.next = next;
    }
}
