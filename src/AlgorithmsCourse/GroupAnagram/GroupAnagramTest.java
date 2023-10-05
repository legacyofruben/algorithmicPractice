package AlgorithmsCourse.GroupAnagram;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramTest {
    @Test
    public void groupAnamgrams(){
        assertEquals(List.of((List.of("ruben","nebur"))),
                GroupAnagram.groupAnagrams(new String[]{"ruben","nebur"}));
    }
}
