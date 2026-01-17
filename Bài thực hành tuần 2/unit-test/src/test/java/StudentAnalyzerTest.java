import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_NormalCase() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        // Danh sách toàn bộ hợp lệ
        List<Double> scores = Arrays.asList(9.0, 8.5, 10.0, 8.0);
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Danh sách trống
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        // Danh sách chỉ chứa giá trị 0 hoặc 10
        List<Double> scores = Arrays.asList(0.0, 10.0, 8.0, 7.9);
        assertEquals(2, analyzer.countExcellentStudents(scores)); // 10.0 and 8.0
    }

    @Test
    public void testCountExcellentStudents_InvalidScores() {
        // Có điểm < 0 hoặc > 10
        List<Double> scores = Arrays.asList(-1.0, 11.0, 8.5, 9.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_NullList() {
        // Danh sách null
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.166666666666666, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        // Danh sách toàn bộ hợp lệ
        List<Double> scores = Arrays.asList(9.0, 8.5, 10.0);
        assertEquals(9.166666666666666, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        // Danh sách trống
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        // Danh sách chỉ chứa giá trị 0 hoặc 10
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_InvalidScores() {
        // Có điểm < 0 hoặc > 10
        List<Double> scores = Arrays.asList(-1.0, 11.0, 8.0, 9.0);
        assertEquals(8.5, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_NoValidScores() {
        // Không có điểm hợp lệ
        List<Double> scores = Arrays.asList(-1.0, 11.0, -5.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores));
    }

    @Test
    public void testCalculateValidAverage_NullList() {
        // Danh sách null
        assertEquals(0.0, analyzer.calculateValidAverage(null));
    }
}