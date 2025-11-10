public class AverageGrades {

    static int[] average_grades(int[][] grades, int[] weights) {
        int students = grades.length;
        int components = weights.length;
        int[] results = new int[students];

        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < components; j++) {
                total += grades[i][j] * weights[j];
            }
            results[i] = total / 100;
        }

        return results;
    }

    public static void main(String[] args) {
        int[][] grades = { {51, 83, 28}, {0, 38, 95} };
        int[] weights = {30, 40, 30};
        int[] results = average_grades(grades, weights);

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
