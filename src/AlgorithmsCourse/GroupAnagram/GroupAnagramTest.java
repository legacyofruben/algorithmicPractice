package AlgorithmsCourse.GroupAnagram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramTest {
    @Test
    public void groupAnamgrams(){
        assertEquals(List.of((List.of("ruben","nebur"))),
                GroupAnagram.groupAnagrams(new String[]{"ruben","nebur"}));
    }
}
