package org.example.Enum;

import java.util.Arrays;

public interface EnumBase<E extends Enum<E>> {
    // 1. Generics로 Enum을 지정 = Enum만 계승 가능

    // 2. 코드값을 이용하는 getter 생성
    String getCode();

    // 3. `<E extends EnumBase> E`의 Generics로 input/output이 같다고 선언
    public static <E extends EnumBase> E of(Class<E> enumClass, String code) {
        return Arrays.stream(enumClass.getEnumConstants())
                // 4. (3)으로 `enumClass`는 Enum이라고 가정
                //    `getEnumConstants()`로 정의된 것을 모두 얻고 stream으로 변환
                .filter(it -> it.getCode().equals(code))
                // 6. 인수 `code`와 일치하는 걸 검색
                .findFirst()
                // 7. 1건만 해당하기에 최초로 일치한 걸 선택
                // 8. 해당하는 게 없다면, 코딩버그 이기에 Exception를 날려 FW까지 넘겨 시스템 에러
                //    만약 그 핸들링으로는 문제가 있을 경우, `null` 반환해서 클라이언트 코드에 핸들링시킨다
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s does not have such code => [%s]",
                        enumClass.getSimpleName(),
                        code)));
    }
}
