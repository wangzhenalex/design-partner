import java.util.ArrayList;
import java.util.List;

public class EmploymentMarketImpl implements EmploymentMarket{
    List<String> idnoList = new ArrayList();
    List<String> nameList = new ArrayList();
    List<Integer> ageList = new ArrayList();
    List<String> skillList = new ArrayList();
    @Override
    public void add(String idno, String name, Integer age, String skill) {
        synchronized (this) {
            if(!idnoList.contains(idno)) {
                idnoList.add(idno);
                nameList.add(name);
                ageList.add(age);
                skillList.add(skill);
            }
        }
    }

    @Override
    public void remove(String idno) {
        synchronized (this) {
            int idx = idnoList.indexOf(idno);
            if(idx != -1) {
                idnoList.remove(idx);
                nameList.remove(idx);
                ageList.remove(idx);
                skillList.remove(idx);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new EmployeeIterator(idnoList,nameList,ageList,skillList);
    }
}