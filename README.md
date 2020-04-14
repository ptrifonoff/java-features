# A brief history of Java language features as code
This project is for those, who are already familiar with Java and want to study 
new significant language features since Java version 9 by stepping through code
instead of reading through blog posts.

## How to use the samples
* The samples in this project are meant to be self-explanatory or with little
description in comments.
* Each feature is marked with a 'TODO' to guide you through all samples. If your 
IDE supports it, you may have a list view with all TODOs to get a quick overview
about the features in each version.
* Where possible there is a <code>main</code> method to simply run the code.
* Sometimes there is a "try it out" in the comment to get familiar with variants
of a feature.

## License
The sample code has been published under the Apache 2.0 license.

## Java 9
### Modularization (Project Jigsaw)
* Demonstrating how to define Modules and configure dependency constraints
* Start with package <code>com.github.ptrifonoff.java9.jigsaw</code>
* Dive into Maven modules "java-9-features" and "java-9-module-consumer"

### Collections
* Collection factory methods (<code>List.of</code>, <code>Set.of</code>, <code>Map.of</code>, <code>Map.ofEntries</code>)
* <code>Stream.dropWhile</code>: starts iteration of stream as soon as dropWhile predicate evaluates to true; the number >= 13 does not have any effect
* <code>Stream.takeWhile</code>: stops iteration of stream as soon as takeWhile predicate evaluates to false; the or-condition (number >= 13) in the sample below does not have any effect
* <code>Stream.ofNullable</code>: passing a possible null element to Stream factory method
* <code>Stream.iterate</code> overload method with predicate: New Stream.iterate method where you can describe the iteration conditions similar to <code>for (int i = 0; i < 10; i++)</code>

### Interfaces
* Private methods on interfaces

### Optional
* <code>Optional.ifPresentOrElse</code>: define a default action when there is no value
* <code>Optional.or</code>: define a default of type Optional
* <code>Optional.stream</code>: converting an Optional to a Stream

### ProcessHandle
* <code>ProcessHandle</code>: useful methods to deal with processes
* <code>ProcessHandle.current().pid()</code>: get PID of the current process

### Scanner (regular expression handling)
* <code>Scanner.findAll</code>: returns a Stream of MatchResult to easily walk through all regular expression results

### Other Features of Java 9 beside language features
* JShell: Executing Java Code on command line
* Multi-Release-Jar: Defining alternative classes for newer Java versions, to support compatibility for older versions

## Java 10
### Local variable Type inference
* <code>var</code> type declaration: instead of declaring the explicit type, var allows you to implicitly use the type on the right

### Collections
* <code>List/Set/Map.copyOf</code>: produces unmodifiable copy of a collection
* <code>Collectors.toUnmodifiableList</code> to collect streams to a list (also available for Set or Map)

### Optional
* <code>Optional.orElseThrow</code>: throws <code>NoSuchElementException</code> if Optional is empty
