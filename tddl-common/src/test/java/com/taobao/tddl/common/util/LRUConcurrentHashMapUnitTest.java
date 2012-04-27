/*(C) 2007-2012 Alibaba Group Holding Limited.	
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
///*
// * @author guangxia
// * @since 1.0, 2010-2-10 ����05:23:17
// */
//public class LRUConcurrentHashMapUnitTest {
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void testPutIfAbsent_Get() {
//		LRUConcurrentHashMap<String, Integer> map = new LRUConcurrentHashMap<String, Integer>();
//		String key = "a";
//		Integer value = 1;
//		assertEquals(null, map.get(key));
//		assertEquals(null, map.putIfAbsent(key, value));
//		assertEquals(value, map.get(key));
//		Integer value2 = 2;
//		assertEquals(value, map.putIfAbsent(key, value2));
//		assertEquals(value, map.get(key));
//	}
//	
//	@Test
//	public void testBounded() {
//		LRUConcurrentHashMap<String, Integer> map = new LRUConcurrentHashMap<String, Integer>(4);
//		for(int i = 0; i < 8; i++) {
//			map.putIfAbsent("k"+i, i);
//		}
//		assertEquals(8, map.size());
//		map.putIfAbsent("k"+9, 9);
//		assertEquals(5, map.size());
//		map.putIfAbsent("k"+10, 10);
//		assertEquals(6, map.size());
//		
//		map.putIfAbsent("k"+7, 7);
//		assertEquals(6, map.size());
//		map.putIfAbsent("k"+6, 6);
//		assertEquals(6, map.size());
//		
//		map.putIfAbsent("k"+11, 11);
//		assertEquals(5, map.size());
//		
//		map.putIfAbsent("k"+11, 11);
//		assertEquals(5, map.size());
//		map.putIfAbsent("k"+6, 11);
//		assertEquals(5, map.size());
//		map.putIfAbsent("k"+7, 11);
//		assertEquals(5, map.size());
//		map.putIfAbsent("k"+10, 11);
//		assertEquals(5, map.size());
//		
//		map.putIfAbsent("k"+12, 12);
//		assertEquals(5, map.size());
//
//	}
//
//}