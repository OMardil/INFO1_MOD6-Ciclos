@snap[north span-100]
### Módulo 6
## Ciclos
@snapend

---
@snap[midpoint span-100]
## Ciclos o Loops
@snapend

+++
### Loops
Un bucle / ciclo / loop, es una sección de código diseñada para repetirse. Por lo general, cuenta con tres secciones:
@ol[]
1. Cuerpo (Body): ¿Qué quiero repetir?
2. Variable(s) de Control (Control variable): ¿Qué variable va a controlar la repetición?
3. Condición(es) de Salida (Exit condition): ¿Cuántas veces lo queremos repetir?
@olend

+++
@snap[west span-50]
@code[](assets/src/Print5.java)
@snapend

@snap[east span-50]
@code[](assets/src/Loop5.java)
@snapend

---
@snap[midpoint span-100]
## While
### Ciclos
@snapend

+++
Un ciclo while se va a repetir mientras una cierta condición se cumpla. La condición puede ser cualquier valor boleano. 

Utilizamos la siguiente sintaxis:
```java
while(boolean_condition){
  //
  //code block to be executed
  //
}
```

+++
Veamos el siguiente ejemplo. Identifica cada componente del ciclo:
- Control variable
- Body
- Exit condition


+++?code=src/assets/SampleLoop.java
@[5-9](El ciclo completo abarca desde la línea 5 a 9.)
@[5](Variable de control: bits.)
@[6-8](Cuerpo del ciclo.)
@[5](Condición: repetir mientras bits sea menor o igual a 8.)
@[5](Condición de salida: bits mayor que 8)

+++
### Prueba de Escritorio
![](assets/img/prueba_de_escritorio.png)
---
@snap[midpoint span-100]
## Do-While
@snapend

+++
## Do-While
El do-while es tipo de ciclo, muy similar al while, con la excepción de que el procesamiento se va a ejecutar **por lo menos una vez**.

La sintaxis es la siguiente:
```java
do {
  //
  //code block to be executed
  //
} while (boolean_condition);
```

+++?code=src/assets/DoWhile.java

+++
@[8-16](El ciclo abarca de la línea 8 a la 16.)
@[9-15](El cuerpo del ciclo de la 9-15. Estas instrucciones se repetirán.)
@[16](Condicion: Repetir mientras invalidInput almacene un valor de "true".)
@[16](Condición de salida: Detener la repetición cuando invalidInput almacene el valor boleano "false".)

+++

![Image](assets/img/DoWhileSampleImage.png)

---
@snap[midpoint span-100]
## For
@snapend

+++
### For
Los ciclos for generalmente son utilizados para repetir una serie de instrucciones una cantidad de veces fija.

La sintaxis es la siguiente:

```java
for(initialization; boolean_condition; update){
  //
  // code block to be executed
  //
}
```

+++?code=assets/src/ForLoop.java
@[5-7](Ciclo completo)
@[5](int i = 9 <-- Inicialización. Se declara una variable que sólo existe dentro del ciclo.)
@[5](i>=0 <-- Condición. Mientras esta condición se cumpla,el ciclo for continuará ejecutándose.)
@[5](i = i-2 <-- Al final de cada ciclo, está operación se ejecutará, reduciendo el valor de "i" en "2". )

+++
@snap[north span-100]
![](assets/img/parrot1.png)
@snapend

@snap[south span-100 h3-blue]
### Parrot Salute
En el zoológico de Monterrey hay un cotorro muy educado que saluda a cada grupo de personas que pasan. Diseña un programa de Java que capture el tamaño de un grupo, y simule mediante una impresión que el cotorro salude a cada individuo.
Toma en cuenta lo siguiente:
- Los grupos no pueden ser de menos de 0 personas.
- Los grupos no pueden ser de más de 10 personas.
@snapend

+++?code=assets/src/ParrotSalute.java