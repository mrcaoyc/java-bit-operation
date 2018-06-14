/**
 * @author CaoYongCheng
 */
public class App {
    public static void main(String[] args) {
        Week week = Week.parse(Week.MONDAY | Week.SUNDAY, Week.class);
        System.out.println("是否包含MONDAY："+week.hasFlag(Week.MONDAY));
        System.out.println("是否包含THURSDAY："+week.hasFlag(Week.THURSDAY));
        System.out.println("是否包含SUNDAY："+week.hasFlag(Week.SUNDAY));
        System.out.println("计算结果值："+week.valueOf());
    }
}
