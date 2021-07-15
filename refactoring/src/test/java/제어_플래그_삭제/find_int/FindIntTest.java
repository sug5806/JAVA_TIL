package 제어_플래그_삭제.find_int;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindIntTest {

    private int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
    };

    @Test
    public void 숫자_찾기_테스트() {
        assertThat(true).isEqualTo(FindInt.find(data, 5));

        assertThat(false).isEqualTo(FindInt.find(data, 10));
    }

}