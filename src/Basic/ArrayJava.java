package Basic;

public class ArrayJava {
    public static void main(String[] args) {
        // Cap dau [] o sau hay trc ten mang deu dc
        String[] myArray;

        //Khoi tao nhanh
        String myArray1[]={"Marry","Peter","John","Rose"};

        //Khoi tao bang new
        String myArray2[]=new String[10];

        //lay ra phan tu Marry
        //mang se dem tu so 0
        System.out.println(myArray1[0]);

        //nameArray.length se tra ve kich thuoc cua mang
        //vi kich thuoc mang la 4 nen khi -1 se cho ra vi tri cua Rose
        System.out.println(myArray1[myArray1.length-1]);

        //Cap nhap lai pha tu trong mang
        myArray1[0]="kevin";
        System.out.println(myArray1[0]);

        //su dung for de duyet cac phan tu trong mang
        for( int i=0; i<= myArray1.length;i++){
            System.out.println(myArray1[i]+"\t");
        }

    }
}
