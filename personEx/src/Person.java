public class Person {
    private String firstName;
    private String secondName;
    private int age;


    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int a) {
        if(a>=0 || a <=100){
            age = a;
        } else{
        age = 0;
        }
    }

    public boolean isTeen(){
        if(age>=12 && age<=20){
            return true;
        } else{
        return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && secondName.isEmpty()){
            return "   ";
        } else if (firstName.isEmpty()) {
            return secondName;
        } else if (secondName.isEmpty()){
            return firstName;
        } else {
            return firstName + " " + secondName;
        }
    }
}
