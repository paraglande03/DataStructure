import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenFrequentWordsShouldReturnFrequency() {
        String sentence = "To Be Or Not To Be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = myHashMap.get(word);
            if (value == null)
                value=1;
            else
                value=value+1;
            myHashMap.add(word,value);
        }
        int freq = myHashMap.get("to");
        System.out.println("Frequency- "+freq);

        Assert.assertEquals(2,freq);


    }
}
