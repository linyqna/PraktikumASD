package Tree.Jobsheet14;

public class BinaryTreeArrayMain09 {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();

        Student09 m1 = new Student09("244107020138", "Devin", "TI-11", 3.57);
        Student09 m2 = new Student09("244107020023", "Dewi", "TI-1I", 3.85);
        Student09 m3 = new Student09("244107020225", "Wahyu", "TI-11", 3.21);
        Student09 m4 = new Student09("244107020076", "Angelina", "TI-1I", 3.54);
        Student09 m5 = new Student09("244107020223", "Andhika", "TI-1I", 3.72);
        Student09 m6 = new Student09("244107020226", "Bima", "TI-11", 3.37);
        Student09 m7 = new Student09("244107020181", "Eiyu", "TI-1I", 3.46);

        Student09[] data = {m1, m2, m3, m4, m5, m6, m7};
        
        bta.populateData(data, data.length - 1);

        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }
}
