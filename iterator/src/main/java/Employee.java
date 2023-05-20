public class Employee {
    private String idno;
    private String name;
    private Integer age;
    private String skill;

    public Employee(String idno, String name, Integer age, String skill) {
        this.idno = idno;
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
