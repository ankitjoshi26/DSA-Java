package LinearSearch;

public class searchInString {
    public static void main(String[] args) {
       System.out.println();
       String name = "Ankit";
       char target = 'i';
       boolean ans = search(name,target);
       System.out.println(ans); 
    }

    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for(int index = 0; index < name.length(); index++){
            if(target == name.charAt(index)){
                return true;
            }
        }
        return false;
    }   
}