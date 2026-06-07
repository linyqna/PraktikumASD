package Tree.Jobsheet14;

public class BinaryTree09 {
    Node09 root;

    public BinaryTree09() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student09 data) {
        if (isEmpty()) {
            root = new Node09(data);
        } else {
            Node09 current = root;
            while (true) {
                if (data.gpa < current.data.gpa) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node09(data);
                        break;
                    }
                } else if (data.gpa > current.data.gpa) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node09(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double gpa) {
        boolean result = false;
        Node09 current = root;
        while (current != null) {
            if (current.data.gpa == gpa) {
                result = true;
                break;
            } else if (gpa < current.data.gpa) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node09 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node09 getSuccessor(Node09 del) {
        Node09 successor = del.right;
        Node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double gpa) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        while (current.data.gpa != gpa) {
            parent = current;
            if (gpa < current.data.gpa) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node09 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
}
