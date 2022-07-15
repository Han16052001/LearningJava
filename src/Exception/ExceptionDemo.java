package Exception;

import java.io.FileNotFoundException;

public class ExceptionDemo {
    //Cho chay method nay thi se bi error
    public static void print(){
        print();
    }

    //Co the throw qua 1 file khac de xu ly thay vi xu ly truc tiep trong class
    public static void main(String[] args) throws FileNotFoundException {

        //Neu muon xu ly trong method hoac cam thay code se co ngoai le thi xai try catch
        try {
            int zero = 0;
            int result = 10 / zero;
            System.out.println("Result " + result);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            //Finally de dong khoi lenh
        }finally {
            System.out.println("Đây là khối finally");
        }

        System.out.println("Chương trình kết thúc");


        //Day la exception compile vi no bat su dung exception ngay tai luc code
//        FileReader f = new FileReader("Filename.json");


        // Con exception runtime thi phai chay ms bik loi
    }
}
