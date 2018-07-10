package web;


import TypeHandler.GenderType;
import org.springframework.stereotype.Component;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @NotNull
    private int stuId;
    @NotNull
    @Size(min=5 ,max=10,message = "${stuName.size}")
    private String stuName;
    private GenderType stuGender;
    @NotNull
    @Size(min=5 ,max=10,message = "{stuCity.size}")
    private String stuCity;
    public static  int count=0;
    public Student(){

        stuName="小王"+count;
        stuGender=GenderType.getEnumType(Integer.toString(count%2));
        stuCity="江苏"+count;
        count++;
    }

    public Student(String stuName, GenderType stuGender, String stuCity) {
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuCity = stuCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuGender=" + stuGender +
                ", stuCity='" + stuCity + '\'' +
                '}';
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public GenderType getStuGender() {
        return stuGender;
    }

    public void setStuGender(GenderType stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuCity() {
        return stuCity;
    }

    public void setStuCity(String stuCity) {
        this.stuCity = stuCity;
    }
}
