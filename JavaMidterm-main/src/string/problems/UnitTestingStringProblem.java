package string.problems;



public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
        String s="abc";
        Permutation.permutations(s.toCharArray(),0);
        Anagram a=new Anagram();
        System.out.println( a.anagramCheck("cat","act"));
        DuplicateWord.repeatedWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }
}
