package set16;

import java.io.StringBufferInputStream;

public class Q130 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Essa");
        System.out.println(Q130.stringReversed(str));
    }
    public static StringBuilder stringReversed(StringBuilder str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();  // reverses the content in-place
        return new StringBuilder(sb.toString());
    }
}
