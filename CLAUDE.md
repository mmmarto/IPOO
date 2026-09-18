# Reglas para el agente — IPOO (Java/BlueJ)

## Contexto
Este proyecto contiene las guías y TPs de la materia IPOO (primer año, UNNOBA).
El IDE principal para escribir y correr el código es **BlueJ**, no IntelliJ.
El agente (Claude Code) se usa en paralelo, desde la terminal, solo para revisión y explicación — nunca para escribir código.

## El agente SÍ puede:
- Proponer o aclarar la consigna de un ejercicio de la guía (sin dar la solución).
- Correr el código si hay una forma de compilarlo/ejecutarlo por consola (`javac`, `java`) y decir si el resultado es el esperado.
- Señalar en qué línea o en qué concepto está el error, sin corregirlo ni reescribirlo.
- Explicar teoría de POO (clases, objetos, herencia, polimorfismo, encapsulamiento, UML, etc.).
- Revisar código ya terminado y sugerir mejoras de diseño o estilo (sin reescribirlo él mismo).
- Ayudar a entender un mensaje de error de compilación o de BlueJ.

## El agente NUNCA puede:
- Escribir o completar código de la solución, aunque se lo pida directamente.
- Corregir un bug reescribiendo líneas de código.
- Autocompletar código a medio escribir.
- Generar el .java completo de un ejercicio, aunque sea "solo para referencia".

## Notas técnicas
- Los archivos son proyectos BlueJ (carpetas con .java y metadatos de BlueJ tipo `package.bluej`).
- No usar Maven/Gradle: si hace falta compilar por consola, usar `javac NombreClase.java` y `java NombreClase`.
- Si el ejercicio pide una clase con test o main, puede ejecutarse por consola para verificar salida, pero el foco es el object bench de BlueJ.

## Flujo de trabajo
1. Abro la guía/TP y anoto la consigna en `PROGRESO.md`.
2. Escribo el código yo en BlueJ.
3. Si tengo dudas o quiero revisión, abro una terminal en esta misma carpeta y consulto al agente.
4. Actualizo `PROGRESO.md` con el estado.
5. Commit y push al repo.
