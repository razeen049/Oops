public class first {
    static void main(String[] args) {

        String a="sas";

        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);


        }
        if (a.equals(b)){
            System.out.println("para");
        }
        else System.out.println("Not");

    }
}