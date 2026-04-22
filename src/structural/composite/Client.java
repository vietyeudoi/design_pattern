package structural.composite;

public class Client {
    public static void main(String[] args) {
        Manager Alice = new Manager("Alice");
        Manager Bob = new Manager("Bob");
        Manager Steve = new Manager("Steve");

        Salesperson s1 = new Salesperson("John", Alice);
        Salesperson s2 = new Salesperson("Emma", Alice);
        Salesperson s3 = new Salesperson("Tom", Bob);
        Salesperson s4 = new Salesperson("Sara", Bob);

        SalesTeam smallTeam1 = new SalesTeam();
        SalesTeam smallTeam2 = new SalesTeam();
        SalesTeam bigTeam = new SalesTeam();

        smallTeam1.add(Alice, s1, s2);
        smallTeam2.add(Bob, s3, s4);

        bigTeam.add(smallTeam1, smallTeam2, Steve);
        
        bigTeam.payExpenses(1000);
    }
}