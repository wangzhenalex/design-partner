public class Client {
    public static void main(String[] args) {
        EmploymentMarket market = new EmploymentMarketImpl();
        market.add("130102XXXXXXXX0524","张燕",37,"IT产品销售");
        market.add("130104XXXXXXXX1928","李晶",28,"地产策划");
        market.add("130203XXXXXXXX0911","吴宇森",55,"电影导演");

        Iterator iterator = market.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}