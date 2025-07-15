public class EvenStrings {
    public static void main(String[] args) {
        String n = "hello shaun the sheep from ndls";
        for(String s : n.split(" ")){
            if(s.length()%2 == 0){
                System.out.println(s);
            }
        }
    }
}
