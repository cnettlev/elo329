Actividades
-----------------

- Añadir que todo empleado presente un salario igual a 200 + valor aleatorio entre 0 y 50. Si se utiliza un constructor que especifica el salario, el empleado debería mantener ese valor (y no el 200+random).

- Añadir atributo *rank*. Este debería ser un valor entero (semi-positivo) que determina el ranking del empleado, el cual permite aumentar el salario según: `total = salario + rank * 20`

- Incluir un constructor que permita indicar *nombre*, *salario* y *ranking*: `Employee(String n, double s, int r)`

. Incluir método que permita modificar el *ranking*. E.g., `SetRank(int r)`.

- Incluir método *toString()* que permita imprimir la información del empleado siguiendo el formato entregado en el código original:

```Java
System.out.println("name=" + e.getName()
   + ",id=" + e.getId()
   + ",salary=" + e.getSalary());
```
