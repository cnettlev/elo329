/**
   @version 1.00 2000-01-27
   @author Cay Horstmann
*/

import java.util.*;

public class ConstructorTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[4];

      staff[0] = new Employee("Harry", 40000);
      staff[1] = new Employee(60000);
      staff[2] = new Employee();
      staff[3] = new Employee(60000);
      staff[3].setRank(2);


      // print out information about all Employee objects
      for (int i = 0; i < staff.length; i++)
      {
         Employee e = staff[i];
         System.out.println(e);
//         System.out.println("name=" + e.getName()
//            + ",id=" + e.getId()
//            + ",salary=" + e.getSalary());
      }
   }
}

class Employee
{
   // three overloaded constructors
   public Employee(String n, double s)
   {
      name = n;
      salary = s;
   }

   public Employee(double s)
   {
      // calls the Employee(String, double) constructor
      this("Employee #" + nextId, s);
   }

   // the default constructor
   public Employee()
   {
      // name initialized to ""--see below
      // salary not explicitly set--initialized to 0
      // id initialized in initialization block
   }

   public Employee(String n, double s, int r)
   {
      this(n,s);
      rank = r;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary+rank*20;
   }

   public int getRank()
   {
      return rank;
   }

   public void setRank(int r)
   {
      rank = r;
   }

   public int getId()
   {
      return id;
   }

        // object initialization block
        // llamado cada vez que un nuevo objeto es creado
   {
      id = nextId;
      nextId++;
   }

   // static initialization block
        // ejecutado una vez tan pronto parte el programa y antes de main.
   static {
      Random generator = new Random();
      // set nextId to a random number between 0 and 9999
      nextId = generator.nextInt(10000);
   }

   {
      Random gen = new Random();
      salary = 200+gen.nextInt(50);
   }

  public String toString() {  /* Para generar versiÃ³n string para lectura */
    return "name=" +name+",id="+id+",salary="+getSalary();
  }

   private int id;
   private static int nextId;
   private String name = ""; // instance variable initialization
   private double salary;
   private int rank=0;
}

