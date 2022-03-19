package java101;
public class Main {

    static boolean isFind(int[]arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]list=  {1,2,6,5,2,7,9,4,6,7,8,3,2,1,6,8};

        int[]duplicate=new int[list.length];
        int startIndex=0;

        for (int i=0;i< list.length;i++){

            for (int j=0;j< list.length;j++){
                if ((i!=j) && (list[i]==list[j]) && (list[j]%2==0) ){
                    if (!isFind(duplicate,list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value:duplicate){
            if (value !=0){
                System.out.println(value);
            }
        }

    }
}
