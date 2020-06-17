

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {

    HashMap<String,String> mapSS;
    HashMap<Integer,String> mapIS;

    @Before
    public void init()
    {
        mapSS=new HashMap<>();
        //mapIS=new HashMap<>();
    }

    /**
     * 测试int size()
     * 1.未初始化
     * 2.0个元素
     * 3.>0个元素
     */
    @Test(expected = NullPointerException.class)
    public void testSize1()
    {
        mapIS.size();
    }

    @Test
    public void testSize2()
    {
        assertEquals(0,mapSS.size());
    }

    @Test
    public void testSize3()
    {
        mapSS.put("key1","value1");
        assertEquals(1,mapSS.size());
    }

    /**
     * 测试boolean isEmpty()
     * 1.未初始化
     * 2.0个元素
     * 3.>0个元素
     */
    @Test(expected = NullPointerException.class)
    public void testIsEmpty1()
    {
        mapIS.isEmpty();
    }

    @Test
    public void testIsEmpty2()
    {
        assertTrue(mapSS.isEmpty());
    }

    @Test
    public void testIsEmpty3()
    {
        mapSS.put("key1","value1");
        assertFalse(mapSS.isEmpty());
    }

    /**
     * 测试V get(Object key)
     * 1.key为int
     * 2.key为String
     */
    @Test
    public void testGet1()
    {
        mapIS=new HashMap<>();
        mapIS.put(1,"value1");
        assertEquals("value1",mapIS.get(1));
    }

    @Test
    public void testGet2()
    {
        mapSS.put("key1","value1");
        assertEquals("value1",mapSS.get("key1"));
    }

    /**
     *测试boolean containsKey(Object key)
     * 1.未初始化
     * 2.包括
     * 3.不包括
     */
    @Test(expected = NullPointerException.class)
    public void testContainsKey1()
    {
        mapIS.containsKey(1);
    }

    @Test
    public void testContainsKey2()
    {
        mapSS.put("key1","value1");
        assertTrue(mapSS.containsKey("key1"));
    }

    @Test
    public void testContainsKey3()
    {
        assertFalse(mapSS.containsKey("key1"));
    }

    /**
     * 测试V put(K key, V value)
     * 1.key=value=null
     * 2.正常放入
     * 3.key重复放入
     * 4.value重复放入
     */
    @Test
    public void testPut1()
    {
        assertEquals(null,mapSS.put(null,null));
    }

    @Test
    public void testPut2()
    {
        mapSS.put("key1","value1");
        assertEquals("value1",mapSS.get("key1"));
    }

    @Test
    public void testPut3()
    {
        mapSS.put("key1","value1");
        mapSS.put("key1","value2");
        assertEquals("value2",mapSS.get("key1"));
    }

    @Test
    public void testPut4()
    {
        mapSS.put("key1","value1");
        mapSS.put("key2","value1");
        assertEquals("value1",mapSS.get("key1"));
        assertEquals("value1",mapSS.get("key2"));
    }

    /**
     *测试V remove(Object key)
     * 1.未初始化
     * 2.size=0
     * 3.size>0
     */
    @Test(expected = NullPointerException.class)
    public void testRemove1()
    {
        mapIS.remove(1);
    }

    @Test
    public void testRemove2()
    {
        assertEquals(null,mapSS.remove("key1"));
    }

    @Test
    public void testRemove3()
    {
        mapSS.put("key1","value1");
        assertEquals("value1",mapSS.remove("key1"));
    }

    /**
     * 测试clear()
     * 1.null
     * 2.无元素
     * 3.有元素
     */
    @Test(expected = NullPointerException.class)
    public void testClear1()
    {
        mapIS.clear();
    }

    @Test
    public void testClear2()
    {
        mapSS.clear();
        assertEquals(0,mapSS.size());
    }

    @Test
    public void testClear3()
    {
        mapSS.put("key1","value1");
        mapSS.clear();
        assertEquals(0,mapSS.size());
    }

    /**
     * 测试boolean containsValue(Object value)
     * 1.未初始化
     * 2.包括
     * 3.不包括
     */
    @Test(expected = NullPointerException.class)
    public void testContainsValue1()
    {
        mapIS.containsValue(1);
    }

    @Test
    public void testContainsValue2()
    {
        mapSS.put("key1","value1");
        assertTrue(mapSS.containsValue("value1"));
    }

    @Test
    public void testContainsValue3()
    {
        assertFalse(mapSS.containsValue("value1"));
    }

    /**
     *测试V putIfAbsent(K key, V value)
     * 1.absent
     * 2.no-absent
     */
    @Test
    public void testPutIfAbsent1()
    {
        mapSS.put("key1",null);
        mapSS.putIfAbsent("key1","value1");
        assertEquals("value1",mapSS.get("key1"));
    }

    @Test
    public void testPutIfAbsent2()
    {
        mapSS.put("key1","value1");
        mapSS.putIfAbsent("key1","value2");
        assertEquals("value1",mapSS.get("key1"));
    }

    /**
     * 测试boolean replace(K key, V oldValue, V newValue)
     * 1.newValue=null
     * 2.oldValue=null
     * 3.!=null
     * 4.oldValue!=old value
     */
    @Test
    public void testReplace1()
    {
        mapSS.put("key1","value1");
        mapSS.replace("key1","value1",null);
        assertEquals(null,mapSS.get("key1"));
    }

    @Test
    public void testReplace2()
    {
        mapSS.put("key1",null);
        mapSS.replace("key1",null,"value1");
        assertEquals("value1",mapSS.get("key1"));
    }

    @Test
    public void testReplace3()
    {
        mapSS.put("key1","value1");
        mapSS.replace("key1","value1","value2");
        assertEquals("value2",mapSS.get("key1"));
    }

    @Test
    public void testReplace4()
    {
        mapSS.put("key1","value1");
        mapSS.replace("key1","value2","value3");
        assertEquals("value1",mapSS.get("key1"));
    }

}
