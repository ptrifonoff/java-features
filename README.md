# New Java language features as code 
This project is for those, who are already familiar with Java and want to study 
new important language features of versions since Java 9 by stepping through code
instead of blog posts. It is a workshop for yourself.

## How to use the samples
* The samples in this project are meant to be self-explanatory or with little
description in comments.
* Each feature is marked with a 'TODO' to guide you through
all samples. If your IDE supports it, you may have a list view with all TODOs to get
a quick overview about the features in each version.
* Where possible there is a <code>main</code> method to simply run the code.
* Sometimes there is a "try it out" in the comment to get familiar with variants of a
feature.

## License
The sample code has been published with Apache 2.0 license.

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
    * <code>Optional.ifPresent(Consumer)</code>
    * <code>Optional.ifPresentOrElse</code>
    * <code>Optional.or</code>
* Scanner returns Streams now
    * <code>Scanner.findAll</code>
    * <code>Process.getCurrentPid</code>: get the current process id

### Other Features of Java 9 beside language features
* JShell: Executing Java Code on command line
* Multi-Release-Jar: Defining alternative classes for newer Java versions, to support compatibility for older versions
