public class Problem7 {
    private static float Mean(float[] numbers) {
        float jumlah = 0;
        float value = jumlah;
        for (int i = 0; i < numbers.length; i++) {
            jumlah = jumlah + numbers[i];
        }
        return jumlah/4;
    }


    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}

