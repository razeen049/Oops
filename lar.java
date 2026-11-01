/*public class lar {
    static void main(String[] args) {
        int[] a={2,6,8,9,66,3};
        int b=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>b){
                b=a[i];
            }


        }
        System.out.println(b);
    }
}*/
public class lar {
    static void main(String[] args) {
        String a="Hello my name issssss Razeen";
        String[] b=a.split(" ");
        int c=b[0].length();
        int d=0;
        for (int i=0;i<b.length;i++){
            if(b[i].length()>c){

                c=b[i].length();
                d=i;
            }
        }

        System.out.println("largest word : "+b[d]+"  total length  "+c);

    }
}