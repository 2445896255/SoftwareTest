import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestEquals {

    @Test
    public void Test12()
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list2=list1;
        assertTrue("地址不同",list1.equals(list2));
    }

    @Test
    public void Test134()
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list2=null;
        assertFalse("list2是List类型",list1.equals(list2));
    }

    @Test
    public void Test1357()
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list2.add("ant");
        assertFalse("返回值错误，返回为真",list1.equals(list2));
    }

    @Test
    public void Test13568()
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("ant");
        list2.add("bat");
        assertFalse("返回值错误，返回为真",list1.equals(list2));
    }
}
