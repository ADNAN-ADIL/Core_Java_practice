public class String_buffer_and_Builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Adnan");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
        sb.append(" Adil");

//        sb.deleteCharAt(2);
//        sb.insert(0,"Java ");
//        sb.insert(6,"Java ");
//        sb.setLength(30);
        sb.ensureCapacity(100);
        
        System.out.println(sb);

//        String str = sb.toString();
//        System.out.println(str);
    }

}
