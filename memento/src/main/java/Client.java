public class Client {
    /**
     * 客户端
     * 
     * @param args
     */
    public static void main(String[] args) {
        //创建执行者，用于管理原始对象
        Originator<Goods> originator = new Originator(new Goods("小熊洗碗机", "...", 2389));
        //创建备忘录，留存最原始的记录
        Memento<Goods> memento = originator.createMemento();
        //创建管理者，用于管理备忘录的变化
        Caretaker caretaker = new Caretaker();
        //增加备忘录列表
        caretaker.addMememtos(memento);
        Goods goods = originator.getObject();
        goods.setPrice(2208);
        caretaker.addMememtos(originator.createMemento());
        goods.setPrice(1998);
        goods.setDescription("双十一大促，低价1998");
        caretaker.addMememtos(originator.createMemento());
        //查看数据历史变化
        int i = 0;
        for (Memento m : caretaker.getMementoList()) {
            System.out.println(i + ":" + m.getSnapshot());
            i++;
        }
        Memento<Goods> m = caretaker.getMementoList().get(0);
        Goods o = originator.restoreMemmento(m);
        System.out.println("数据已恢复至指定节点状态");
        System.out.println(originator.getObject());
    }
}