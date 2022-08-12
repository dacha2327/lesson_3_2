public class User {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws IllegalAgeException {
        if (age <= 0 || age > 100){
            throw  new IllegalAgeException("Age " + "е может быть меньше или больше 100."+ "А вы задали " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLenghtException {
        if (name.length() > 20){
            throw  new IllegalNameLenghtException("Длина имени не дол жно быть больше 20 символов. А вы вели " + name);
        }
        this.name = name;
    }
}
