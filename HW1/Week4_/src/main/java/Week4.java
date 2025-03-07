public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int minArray (int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("khong co phan tu nao trong mang");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min  = array[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("so nhap vao khong thoa man");
            return;
        }
        double bmi = (int) ((weight / (height * height)) * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if ( bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
