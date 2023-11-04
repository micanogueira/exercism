public class SalaryCalculator {
    private static final double BASE_SALARY = 1000.0;
    private static final double SALARY_CAP = 2000.0;
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1; // a 15% penalty is applied if more than five days were skipped
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10; // 10 monetary units for each product sold and 13 for more than 20 products
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * this.multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = BASE_SALARY * this.multiplierPerDaysSkipped(daysSkipped) + this.bonusForProductSold(productsSold);
        return finalSalary < SALARY_CAP ? finalSalary : SALARY_CAP;
    }
}
