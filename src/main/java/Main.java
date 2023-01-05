import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println(service.sum(sales));
        System.out.println(service.average(sales));
        System.out.println(service.monthOfHighSales(sales));
        System.out.println(service.monthOfMinSales(sales));
        System.out.println(service.amountMonthUnderAverage(sales));
        System.out.println(service.amountMonthUpperAverage(sales));
    }
}
