package arraylist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.management.relation.RoleList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dto.array.ArrayData;
import lombok.extern.slf4j.Slf4j;

/**
 * fileName : ArrayTest
 * author : baehyoyeol
 * date : 2022/12/13
 * description :
 */
@Slf4j
public class ArrayTest {
    @Test
    @DisplayName("array test")
    void testArray() {
        int[] intArr = { 1, 2, 3, 4, 5 };
        log.info("intArr : {}", intArr);

        List<Integer> intList = new ArrayList<>();
        for (int i : intArr) {
            intList.add(i);
        }
        log.info("intList : {}", intList);

        List<ArrayData> arrayDataList = new ArrayList<>();
        arrayDataList.add(new ArrayData("kim", 10, "street", "Y"));
        arrayDataList.add(new ArrayData("lee", 20, "building", "N"));
        log.info("arrayDataList : {}", arrayDataList);
        log.info("arrayDataList : {}", arrayDataList.get(0));

        assertEquals("kim", arrayDataList.get(0).getName());
        assertEquals("lee", arrayDataList.get(1).getName());
    }

    @Test
    void listTest() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        log.info("strings = {}", strings);
        log.info("strings.get(1) = {}", strings.get(1));
        assertEquals("a", strings.get(0));

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        log.info("map = {}", map);
        List<Map> arrayList = new ArrayList<>();
        arrayList.add(map);
        log.info("arrayList = {}", arrayList);
        assertEquals("3", arrayList.get(0).get("c"));

    }

    @Test
    @DisplayName("instanceof")
    void instanceTest() {

        ArrayList<Object> arrayList = new ArrayList<>();
        assertThat(arrayList instanceof List).isTrue();

        RoleList roleList = new RoleList();
        assertThat(roleList instanceof List).isTrue();

        List<Object> linkedList = new LinkedList<>();
        assertThat(linkedList instanceof ArrayList).isFalse();

    }

}
