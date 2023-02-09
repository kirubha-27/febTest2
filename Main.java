public class Main {
    public static void main(String[] args) {
        String[] str = {"0 ab","6 cd","0 ef","6 gh","4 ij","0 ab","6 cd","0 ef","6 gh","0 ij","4 that","3 be","0 to","1 be","5 question","1 or","2 not","4 is","2 to","4 the"};
        int half = str.length/2;
        for(int i=0;i<half;i++){
            str[i] = str[i].charAt(0)+" -";
        }
        sort(str,str.length);
        for(int i=0;i<str.length;i++){
            str[i] = str[i].substring(2,str[i].length())+" ";
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }

    }
    public static void sort(String[] str,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(str[j].charAt(0)-'0'>str[j+1].charAt(0)-'0'){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
    }
}
