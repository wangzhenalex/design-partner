public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary / John Smith,100000 / Steven Jobs";
        DataSource dataSource = new EncryptionDecorator(new JsonDecorator(new FileDataSource("/Users/zhenwang/Documents/workspace/code/OutputDemo.txt")));
//        DataSource dataSource = new JsonDecorator(new FileDataSource("/Users/zhenwang/Documents/workspace/code/OutputDemo.txt"));
//        DataSource dataSource =new FileDataSource("/Users/zhenwang/Documents/workspace/code/OutputDemo.txt");
//        DataSource dataSource = new JsonDecorator(new EncryptionDecorator(new FileDataSource("/Users/zhenwang/Documents/workspace/code/OutputDemo.txt")));

        dataSource.writeData(salaryRecords);
        DataSource plain = new FileDataSource("/Users/zhenwang/Documents/workspace/code/OutputDemo.txt");
        System.out.println("- Data ----------------");
        System.out.println(salaryRecords);
        System.out.println("- EncodedContent --------------");
        System.out.println(plain.readData());
        System.out.println("- DecodedContent --------------");
        System.out.println(dataSource.readData());
    }
}