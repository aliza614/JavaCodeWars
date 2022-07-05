public class StopgninnipSMysdroW {
    /*Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"*/
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String [] array=sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()<5)
                continue;
            else{
                StringBuilder sb=new StringBuilder();
                for(int j=array[i].length()-1;j>=0;j--){
                    sb.append(array[i].charAt(j))
                }
                array[i]=sb.toString();
            }

        }
        StringBuilder sb=new StringBuilder();
        for (String s: array
             ) {sb.append(s+" ");

        }
        return sb.toString().trim();
    }

}
