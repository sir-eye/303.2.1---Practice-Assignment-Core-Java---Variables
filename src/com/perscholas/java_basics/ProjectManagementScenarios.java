package com.perscholas.java_basics;

public class ProjectManagementScenarios {
    public static void main(String[] args) {
// Ex: 1
        int completedTasks = 25;
        int pendingTasks = 10;
        int totalTasks = completedTasks + pendingTasks;
        System.out.println("Total tasks: " + totalTasks);


//Ex: 2
        double budgetAllocated = 15000.75;
        double budgetSpent = 5000.25;
        double totalBudget = budgetAllocated + budgetSpent;
        System.out.println("Total Budget: " + totalBudget);


//Ex: 3
        int teamMembers = 8;
        double projectDuration = 12.5; // in weeks
        double totalEffort = teamMembers + projectDuration;
        System.out.println("Total Effort (Team + Duration): " + totalEffort);


//Ex: 4
        int totalMilestones = 20;
        int completedMilestones = 5;
        int milestonesPerPhase = totalMilestones / completedMilestones;
        System.out.println("Milestones per Phase: " + milestonesPerPhase);

        double totalMilestonesDecimal = 20.0;
        double resultDecimal = totalMilestonesDecimal / completedMilestones;
        System.out.println("Milestones per Phase (Decimal): " + resultDecimal);


//Ex: 5
        double totalBudgetProject = 100000.50;
        double budgetPerPhase = 20000.25;
        double budgetDivision = totalBudgetProject / budgetPerPhase;
        System.out.println("Budget per Phase: " + budgetDivision);

        int budgetDivisionInt = (int) budgetDivision;
        System.out.println("Budget per Phase (Casted to Int): " + budgetDivisionInt);


//Ex: 6
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("Quotient without Casting: " + q);

        q = (double) y / x;
        System.out.println("Quotient with Casting: " + q);

//Ex: 7
        final double MAX_BUDGET = 50000.00;
        double remainingBudget = MAX_BUDGET - budgetSpent;
        System.out.println("Remaining Budget: " + remainingBudget);


//Ex: 8
        double coffeePrice = 3.50;
        double cappuccinoPrice = 4.75;
        double greenTeaPrice = 2.25;

        int coffeeOrder = 3;
        int cappuccinoOrder = 4;
        int greenTeaOrder = 2;

        double subtotal = (coffeeOrder * coffeePrice) + (cappuccinoOrder * cappuccinoPrice) + (greenTeaOrder * greenTeaPrice);
        final double SALES_TAX = 0.08;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale (with Tax): $%.2f%n", totalSale);

/*
Exercise 1: Adds two whole numbers to track tasks.
Exercise 2: Adds two decimal numbers to manage budgets.
Exercise 3: Adds a whole number and a decimal to measure total effort.
Exercise 4: Divides two whole numbers for milestone tracking and explores decimals.
Exercise 5: Divides decimals for budget phases and turns the result into a whole number.
Exercise 6: Shows division and converting types in a team scenario.
Exercise 7: Uses a fixed value for calculating the maximum budget.
Exercise 8: Models a cafe order with products,
            adding tax and formatting the total to two decimal places.
 */

    }
}
