package aspect;

import log.SysLog;

public class Student {
    private Integer age;
    private String name;
    @SysLog("222222")
    public void setAge(Integer age) {
        this.age = age;
    }
    @SysLog("3333")
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
//        throw new IllegalArgumentException();
    }
}