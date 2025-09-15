# Conversor de Base Numérica con Java Streams

## Autor
Israel Fuentes  
Universidad de Cartagena – Ingeniería de Software

## Descripción
Este programa convierte un número en base 10 a **binario, octal y hexadecimal**.  
Además, realiza operaciones sobre los dígitos binarios usando **Java Streams**:

- `map` → Multiplica los dígitos por 2.  
- `filter` → Filtra solo los dígitos iguales a 1.  
- `reduce` → Suma los dígitos binarios.  
- `sorted` → Ordena los dígitos binarios.  
- `count` → Cuenta el número de dígitos.  

## Instrucciones de compilación y ejecución

### 1. Compilar
```bash
javac src/ConversorBaseNumericaStreams.java
```

### 2. Ejecutar
```bash
java -cp src ConversorBaseNumericaStreams
```

## Ejemplo de ejecución
```
Ingrese un número en base 10: 25
Binario: [1, 1, 0, 0, 1]
Octal: [3, 1]
Hexadecimal: [1, 9]
Binario ordenado (Stream.sorted): [0, 0, 1, 1, 1]
Solo dígitos 1: [1, 1, 1]
Dígitos multiplicados por 2: [2, 2, 0, 0, 2]
Suma de dígitos binarios: 3
Cantidad de dígitos: 5
```
