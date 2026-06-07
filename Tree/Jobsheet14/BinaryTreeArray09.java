package Tree.Jobsheet14;

public class BinaryTreeArray09 {
    Student09[] data;
    int idxLast;

    public BinaryTreeArray09() {
        data = new Student09[10];
        idxLast = -1;
    }

    void populateData(Student09[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student09 studentData) {
        if (idxLast == -1) {
            data[0] = studentData;
            idxLast = 0;
            return;
        }
        int currentIdx = 0;
        while (currentIdx < data.length) {
            if (studentData.gpa < data[currentIdx].gpa) {
                int leftIdx = 2 * currentIdx + 1;
                if (leftIdx >= data.length) {
                    System.out.println("Tree Array Full!");
                    return;
                }
                if (data[leftIdx] == null) {
                    data[leftIdx] = studentData;
                    if (leftIdx > idxLast) idxLast = leftIdx;
                    break;
                } else {
                    currentIdx = leftIdx;
                }
            } else if (studentData.gpa > data[currentIdx].gpa) {
                int rightIdx = 2 * currentIdx + 2;
                if (rightIdx >= data.length) {
                    System.out.println("Tree Array Full!");
                    return;
                }
                if (data[rightIdx] == null) {
                    data[rightIdx] = studentData;
                    if (rightIdx > idxLast) idxLast = rightIdx;
                    break;
                } else {
                    currentIdx = rightIdx;
                }
            } else {
                break;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
