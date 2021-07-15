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

            assert isMin(m, i, data.length - 1);
            int v = data[m];
            data[m] = data[i];
            data[i] = v;
            assert isSorted(0, m + 1);

        }
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (data[pos] > data[i]) {
                return false;
            }

        }

        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }

        return true;
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
