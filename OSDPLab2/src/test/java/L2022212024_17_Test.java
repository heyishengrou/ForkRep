import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class L2022212024_17_Test {

    @Test
    void findRepeatedDnaSequences() {
        //        ʾ��1
        /*
         * @param String s:�������⣬��ATCG�ĸ���ĸ���
         * @result List<String> ���Ȳ�С��10���ظ�����
         *           s<=10ʱ�����Ϊ��
         * ʾ��1
         * ���룺s�����������ظ�����DNA
         *
         * */
        /*
         *  s.lenth()>10,�������ظ���
         * */

        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> answer=new ArrayList<>();
        answer.add("AAAAACCCCC");
        answer.add("CCCCCAAAAA");
        Solution solution=new Solution();
        List<String> list =solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg1");
        assertEquals(answer,list);

        /*
         * s>10,ֻ��һ���ظ���
         * */
        solution = new Solution();
        s = "AAAAAAAAAAAAA";
        List<String> expected = Arrays.asList("AAAAAAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg2");
        assertEquals(expected, result);

        /* ʾ��3
         * s<10��ֻ��һ���ظ���
         * */
        s = "AAAAAAAAA";
        answer.clear();
        List<String> empty=new ArrayList<String>();
        list=solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg3");
        assertEquals(empty,list);

    }
}