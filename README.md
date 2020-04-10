# New Java language features by sample code 
This is a sample project for presenting some of the new language features in 
each version of Java since version 9.

## Java 9
### Modularization (Project Jigsaw)
* Demonstrating how to define Modules and configure dependency constraints
* Start with package <code>com.github.ptrifonoff.java9.jigsaw</code>
* Dive into Maven modules "java-9-features" and "java-9-module-consumer"

### Collections
* Collection factory methods (<code>List.of</code>, <code>Set.of</code>, <code>Map.of</code>, <code>Map.ofEntries</code>)
* <code>Stream.dropWhile</code>
* <code>Stream.takeWhile</code>
* <code>Stream.ofNullable</code>
* Stream iteration with predicates: New Stream.iterate method where you can describe the iteration conditions similar to <code>for (int i = 0; i < 10; i++)</code>

### Interfaces
* Private methods on interfaces

## Language features with no sample code in this project (TODOs for further releases)
* Optional
** <code>Optional.ifPresent(Consumer)</code>
** <code>Optional.ifPresentOrElse</code>
** <code>Optional.or</code>
* Scanner returns Streams now
** <code>Scanner.findAll</code>
** <code>Process.getCurrentPid</code>: get the current process id

### Other Features of Java 9 beside language features
* JShell: Executing Java Code on command line
* Multi-Release-Jar: Defining alternative classes for newer Java versions, to support compatibility for older versions
