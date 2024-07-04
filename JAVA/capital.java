public class capital {
    public static void main(String[] args){
        String text="MY Name is Shiv";
        String[] words=text.split(" ");

        int count=0;

        for(String word:words){
            if(!word.isEmpty()&&Character.isUpperCase(word.charAt(0))){
                count++;
            }
        }
        System.out.println("number of word that start with a capital letter:"+count);
    }
}
