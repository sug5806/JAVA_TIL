package 어서션_도입;

public class SortSample {
    private final int[] data;

    public SortSample(int[] data) {
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public void sort() {
        for (int i = 0; i < data.length; i++) {
            int m = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[m] > data[j]) {
                    m = j;
                }
            }

            // 여기서 data[m]은 data[i] ~ data[data.length -1]의 최솟값이어야 한다.
            int v = data[m];
            data[m] = data[i];
            data[i] = v;
            // 여기서 data[0] ~ data[x+1]은 이미 정렬되어 있어야 한다.

        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        for (int i = 0; i < data.length; i++) {
            builder.append(data[i]);
            builder.append(",");
        }

        builder.append("]");
        return builder.toString();
    }
}
