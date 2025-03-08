//This class will behave like a Doubly Node which will be used in the WRM class
public class Patient{

    public Integer id;
    public String name;
    public Integer age;
    public String bloodGroup;
    public Patient next; //this points to the next patient
    public Patient prev; //this points to the previous patient

    public Patient(Integer id,String name,Integer age,String bloodGroup,Patient next,Patient prev){
        this.id=id;
        this.name=name;
        this.age=age;
        this.bloodGroup=bloodGroup;
        this.next=next;
        this.prev=prev;

    }
    public Patient(Integer id,String name,Integer age,String bloodGroup){
        this.id=id;
        this.name=name;
        this.age=age;
        this.bloodGroup=bloodGroup;

    }
    public void printDtl(){
        System.out.println("Id : "+this.id);
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("BloodGroup : "+this.bloodGroup);
    }

}