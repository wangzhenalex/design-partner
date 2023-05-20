import java.util.ArrayList;
import java.util.List;

public class EmployeeIterator implements Iterator{
    int cursor = -1;
    List<String> idnoList ;
    List<String> nameList ;
    List<Integer> ageList ;
    List<String> skillList ;
    public EmployeeIterator(List<String> idnoList,List<String> nameList , List<Integer> ageList,List<String> skillList){
        this.idnoList = idnoList;
        this.nameList = nameList;
        this.ageList = ageList;
        this.skillList = skillList;
    }
    @Override
    public Employee next() {
        if(hasNext()) {
            ++cursor;
            Employee employee = new Employee(idnoList.get(cursor), nameList.get(cursor), ageList.get(cursor), skillList.get(cursor));
            return employee;
        }else{
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if(cursor < idnoList.size()-1){
            return true;
        }else {
            return false;
        }
    }
}