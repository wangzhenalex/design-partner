public class OdbcDao implements UserDao {
    @Override
    public void insert() {
        System.out.println("Odbc方式实现数据插入");
    }

    @Override
    public void update() {
        System.out.println("Odbc方式实现数据更新");
    }

    @Override
    public void delete() {
        System.out.println("Odbc方式实现数据删除");
    }

    @Override
    public void findById() {
        System.out.println("Odbc方式实现数据查询");
    }
}
