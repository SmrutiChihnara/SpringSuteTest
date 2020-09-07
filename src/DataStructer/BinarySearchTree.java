package DataStructer;


class Node {
    int data;
    Node left;
    Node right;
}

class BST {
    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.data) {
            node.left = delete(node.left, val);
        } else if (val > node.data) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;
                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, 4);
                return node;
            }
        }
        return node;
    }

    private Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;

        while (temp .left!= null) {
            temp = temp.left;
        }

        return temp;
    }


    private Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
    public void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void preOrder(Node  node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

public void postOrder(Node node)
{
    if(node==null)
    {
        return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.data);
}

public boolean isPresent(Node node,int val)
{
    boolean isPresent=false;
    if(node==null)
    {
        return false;
    }
    while (node!=null)
    {
        if(val<node.data)
        {
            node=node.left;
        }
        else if(val>node.data)
        {
            node=node.right;
        }
        else isPresent=true;
        break;
    }
    return isPresent;
}
public Node getParentNode(Node node,int val)
{
    if(node==null)
    {
        return null;
    }
    Node getParent=null;
    while (node!=null)
    {
        if(val<node.data)
        {
            getParent=node;
            node=node.left;
        }
        else if(val>node.data)
        {
            getParent=node;
            node=node.right;
        }
        else {
            break;
        }
    }
    return getParent;
}
public Node getSplingNode(Node node,int val)
{
    if(node==null||node.data==val)
    {
        return null;
    }
    Node paretNode=null;
    while (node!=null)
    {
        if(val<node.data)
        {
            paretNode=node;
            node=node.left;
        }
        else if(val>node.data)
        {
            paretNode=node;
            node=node.right;
        }
        else {
            break;
        }
    }
    if(paretNode.left!=null&&val==paretNode.left.data)
    {
        return paretNode.right;
    }
    if(paretNode.right!=null&&val==paretNode.right.data)
    {
        return paretNode.left;
    }
    return null;
}



}
public class BinarySearchTree {
    public static void main(String[] args) {
        Node node = null;
        BST bst = new BST();
        node = bst.insert(node, 5);
        node = bst.insert(node, 10);
        node = bst.insert(node, 1);
        node = bst.insert(node, 120);
        node = bst.insert(node, 121);

        node = bst.insert(node, 0);
        node = bst.insert(node, 104);
        node = bst.insert(node, 12);
        node = bst.insert(node, 100);
        node = bst.insert(node, 102);
        node = bst.insert(node, 101);
        bst.inorder(node);
        Node parentNode=bst.getParentNode(node,10);
        if(parentNode!=null)
        {
            System.out.println(parentNode.data);
        }
        else System.out.println("parent does not exit");
       /* node=bst.delete(node,120);
        node=bst.delete(node,0)*/;
    }
}
