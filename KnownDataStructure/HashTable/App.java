package HashTable;

public class App {
    public static void main(String[] args) {
        HashTable table = new HashTable(6);
        table.insert("my");
        table.insert("name");
        table.insert("is");
        table.insert("enforc3r");
        table.insert("....");
        table.displayTable();
//        System.out.println(table.find("name"));
    }
}
