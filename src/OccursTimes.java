public class OccursTimes {
    public static void main(String[] args) {
        int[]numbers ={1,1,1,2,3,4};
        int searchelement = 3;

        System.out.println(Getnumbersoccurs(numbers,searchelement));
    }
    public static int Getnumbersoccurs(int[]numbers, int searchelement){
        int occ = 0 ;
        for (int i =0; i<numbers.length; i++)
            if (searchelement == numbers[i])
                occ++;

        return occ;
    }
}
