/**
 * @description:
 * @author: Thanh Nha
 * @version: 1.0
 * @created: 8/23/2024 9:35 PM
 */

package iuh.fit.se;
public class TestRectangle {
    public static void main(String[] args) {
        try {
            Rectangle r1 = new Rectangle();

            Rectangle r2 = new Rectangle(20.0, 4.0);

            r1.setLength(-10);

            System.out.println("Length of r1: " + r1.getLength());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
