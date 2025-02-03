package Selleniun_start_projects.Selleniun_start_projects;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Sally Hiajney 206189805
 * Hiba Akla 324006147
 */
public class App {
    
    public class TriangleClassifier {
        private IsIsosceles isIsosceles;
        private IsTriangle isTriangle;
        private IsEquilateral isEquilateral;

        public TriangleClassifier(IsIsosceles isIsosceles, IsTriangle isTriangle, IsEquilateral isEquilateral) {
            this.isIsosceles = isIsosceles;
            this.isTriangle = isTriangle;
            this.isEquilateral = isEquilateral;
        }

        public String classifyTriangle(int a, int b, int c) {
            if (!isTriangle.test(a, b, c) && !isIsosceles.test(a, b, c) && !isEquilateral.test(a, b, c)) {
                return "Not a triangle";
            }
            if (isEquilateral.test(a, b, c)) {
                return "Equilateral";
            } else if (isIsosceles.test(a, b, c)) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
    }

    public class IsEquilateral {
        public boolean test(int a, int b, int c) {
            return a == b && b == c && a + b > c;
        }
    }

    public class IsIsosceles {
        public boolean test(int a, int b, int c) {
            return (a == b || b == c || a == c) && !(a == b && b == c);
        }
    }

    public class IsTriangle {
        public boolean test(int a, int b, int c) {
            return a + b > c && a + c > b && b + c > a;
        }
    }

    @Test
    public void unit_test_triangle_classifier() {
        IsEquilateral isEquilateral = Mockito.mock(IsEquilateral.class);
        IsIsosceles isIsosceles = Mockito.mock(IsIsosceles.class);
        IsEquilateral isTriangle = Mockito.mock(IsTriangle.class);
        
        TriangleClassifier triangleClassifier = new TriangleClassifier(isIsosceles, isTriangle, isEquilateral);

        Mockito.when(isEquilateral.test(2, 2, 2)).thenReturn(true);

        int a = 2, b = 2, c = 2;
        String expectedResult = "Equilateral";
        String actualResult = triangleClassifier.classifyTriangle(a, b, c);
        
        assertEquals(expectedResult, actualResult);
    }
}
