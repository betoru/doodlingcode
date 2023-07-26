package code;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * fileName       : reflection
 * author         : baehyoyeol
 * date           : 2023/01/06
 * description    :
 */
@Slf4j
public class ReflectionTest {
    /*Class<? extends Object> clazz = data.getClass();
for (Field field : clazz.getDeclaredFields()) {
        if (field.getType().equals(List.class) {

            //for (리플렉션 쓸때 field 타입이 리스트타입일대 이놈 뽑아서 포문 돌릴수 없을까 ? ) {

        } else {
        ...
        }
    }*/
//    Class<T> classType;
    @Test
    void test() {

        // 클래스의 모든 필드를 불러온다.
        /*Stream.of(classType.getDeclaredFields())
              .filter(field -> field.isAnnotationPresent(AutoWired.class)) // 어노테이션에 AutoWired를 갖는 필드만 필터
              .forEach(field -> {
                  try {
                      // 필드의 인스턴스 생성
                      Object fieldInstance = createInstance(field.getType());
                      // 필드의 접근제어자가 private인 경우 수정가능하게 설정
                      field.setAccessible(true);
                      // 인스턴스에 생성된 필드 주입
                      field.set(instance, fieldInstance);
                  } catch (IllegalAccessException e) {
                      throw new RuntimeException(e);
                  }
              });*/
    }

    @Test
    void test2() throws IllegalAccessException {
        //List 타입 생성
        List<String> data = new ArrayList<>();

        log.info("data = {}", data);

        Class<? extends Object> clazz = data.getClass();
        log.info("clazz = {}", clazz);
        for (Field field : clazz.getDeclaredFields()) {
            log.info("field = {}", field);
            log.info("field.getType = {}", field.getType());
            if (field.getType().equals(List.class)) {
                field.setAccessible(true);
                List<String> list = (List<String>) field.get(data);
                log.info("list = {}", list);
                for (String s : list) {
                    log.debug("s: {}", s);
                }
            }
        }
    }

}
