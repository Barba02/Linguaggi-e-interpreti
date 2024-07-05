# Raccolta homework laboratorio di Linguaggi
**III anno**<br/>
**Università degli Studi di Verona**<br/>
**A.A. 2023/2024**
<br/><br/>
Collezione di esercitazioni del corso, focalizzato sulle basi di progettazione e funzionamento dei linguaggi di programmazione, consistente in quattro interpreti scritti in Java con l'ausilio di ANTLR4.<br/>
ANTLR4 è un generatore di parser in grado di generare l'albero sintattico di un programma a partire da una descrizione formale della grammatica del linguaggio. Disponibile come plugin di IntelliJ IDEA.

## Homework
- **IntExp**: interprete per espressioni aritmetiche su interi
- **Brainfuck**: interprete per il linguaggio esoterico Brainfuck basato su _Byte_ interpretati come _Char_
- **IMP**: interprete per un semplice linguaggio imperativo in grado di elaborare interi, booleani e stringhe con costrutti ``if`` e ``while`` 
- **ArnoldC**: interprete per il linguaggio goliardico su interi ispirato alle citazioni di Arnold Schwarzenegger ([repo di riferimento](https://github.com/lhartikk/ArnoldC)) con l'implementazione dei principali costrutti di controllo e delle procedure 

## Istruzioni 
### Prerequisiti
- Java JDK: 17+
- ANTLR4: 4.13.1
- IDE: preferibilmente IntelliJ IDEA per integrazione con ANTLR
### Workflow implementazione
1. Definizione della grammatica del linguaggio nel file .g4
2. Generazione di lexer, parser e visitor con ANTLR
3. Implementazione (override) dei metodi di visita delle regole in una nuova classe che estende il _BaseVisitor_
4. Implementazione del Main del progetto che legga il programma in input, ne crei l'albero sintattico e visualizzi il risultato dell'interpretazione
### Esecuzione
Lanciare il Main fornendo come primo e unico parametro il programma che si vuole interpretare.
<br/><br/><br/>
_Filippo Barbieri_