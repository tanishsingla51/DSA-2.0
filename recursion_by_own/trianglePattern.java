package recursion_by_own;

public class trianglePattern {

    public static void pattern(int rows,int column,int i){

        if(rows==4){
            return;

        }

        if(i < column){
            System.out.print("*");
            pattern(rows,column,i+1);
        }
        else{
            System.out.println();
            pattern(rows+1,column-1,0);
        }

    }

    public static void main(String[] args) {

        int column=4;
        int rows=0;

        int i=0;

        pattern(rows,column,i);
    }
}
