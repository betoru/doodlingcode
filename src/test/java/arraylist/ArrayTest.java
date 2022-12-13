package arraylist;

import dto.ArrayData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * fileName       : ArrayTest
 * author         : baehyoyeol
 * date           : 2022/12/13
 * description    :
 */
@Slf4j
public class ArrayTest {
    @Test
    @DisplayName("array test")
    void testArray() {
        int[] intArr = {1, 2, 3, 4, 5};
        log.info("intArr : {}", intArr);

        List<Integer> intList = new ArrayList<>();
        for (int i : intArr) {
            intList.add(i);
        }
        log.info("intList : {}", intList);

        List<ArrayData> arrayDataList = new ArrayList<>();
        arrayDataList.add(new ArrayData("kim", 10, "street","Y"));
        arrayDataList.add(new ArrayData("lee", 20, "building","N"));
        log.info("arrayDataList : {}", arrayDataList);
        log.info("arrayDataList : {}", arrayDataList.get(0));
    }

}
