class med implements Cloneable{
    private int id;
    private String diagnos;

    public med(){
        this.id=0;
        this.diagnos="normal";
    }
    public med(int a, String b){
        this.id=a;
        this.diagnos=b;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
    @Override
    public String toString(){

        return "id =" +this.id+" diagnos ="+this.diagnos;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null||this.getClass()!=obj.getClass()) return false;
        med Other =(med) obj;
        return this.id==Other.id&&this.diagnos.equals(Other.diagnos);


    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(id,diagnos);
    }


}
class patients implements Cloneable {
    private String name;
    private med record;
    private int age;

    public patients(String name, med record, int age) {
        this.name = name;
        this.record = record;
        this.age = age;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        patients other = (patients) super.clone();
        other.record = (med) this.record.clone();
        return other;

    }

    @Override
    public String toString() {

        return record + " name :" + this.name + " age " + this.age;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        patients other = (patients) obj;
        return this.record.equals(other.record) && this.age == other.age && this.name.equals(other.name);

    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(record,age,name);
    }

}

public class hos  {
   public static void main(String[] args) throws CloneNotSupportedException {
       med m1=new med(1,"Malaria");
       patients p1=new patients("ALi",m1,23);
       patients p2=(patients) p1.clone();
       System.out.println(p1.toString());
       System.out.println(p1.equals(p2));


    }
}