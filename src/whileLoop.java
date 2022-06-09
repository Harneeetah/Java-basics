public class whileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        for (count = 1; count != 6; count++) {
            System.out.println("count valus is " + count);
        }
        count=1;
        while(true){
            if(count==6){break;
            }
            System.out.println("count value is " + count);
            count++;
        }
    }

}
