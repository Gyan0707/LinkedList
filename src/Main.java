public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Node n1 = new Node();
        n1.data = 1000;
        Node n2 = new Node();
        n2.data = 2000;
        obj.insertAtLast(n1);
        obj.insertAtLast(n2);

        obj.insertAtBeginning(n1);
        obj.deleteAtLast();
        obj.deleteAtBegining();
        obj.display();

    }
}
