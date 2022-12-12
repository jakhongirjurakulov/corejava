public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
//   Setter and Getter
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
