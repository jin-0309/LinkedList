public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertAt(0, 1);
        intList.insertAt(1, 2);
        intList.insertAt(2, 3);
        intList.insertAt(3, 4);
        intList.printAll();
        intList.clear();
        intList.printAll();
        intList.insertLast(10);
        intList.insertLast(11);
        intList.insertLast(12);
        intList.deleteAt(1);
        intList.deleteAt(0);
        intList.insertLast(13);
        intList.deleteLast();
        intList.printAll();
        intList.insertLast(13);
        intList.insertLast(14);
        intList.insertLast(15);
        System.out.println("=========index========");
        intList.printAll();
        System.out.println(intList.getNodeAt(3));
    }
}
