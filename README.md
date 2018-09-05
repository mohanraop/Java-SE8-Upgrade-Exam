# Java-SE8-Upgrade-Exam
Examples and notes to aid revision for the Oracle Certified Professional (OCP) Upgrade Exam for Java SE 7 to 8 (1Z0-810).

<a href="https://education.oracle.com/upgrade-java-se-7-to-java-se-8-ocp-programmer/pexam_1Z0-810" ><img src="https://raw.githubusercontent.com/rysharprules/Java-SE8-Upgrade-Exam/master/ocp_logo.gif" /></a>

## Additional Help

- <a href="http://java.boot.by/ocpjp7-upgrade/">Upgrade to Java SE 7 Programmer (1Z0-805) Guide by Mikalai Zaikin</a> - Really easy to understand guides with additional content (e.g. quizzes with answers and detailed explanations) available upon request.
- <a href="https://www.amazon.co.uk/Certified-Professional-Programmer-1Z0-804-1Z0-805/dp/1430247649">Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: A Comprehensive OCPJP 7 Certification Guide (Expert's Voice in Java) Paperback – 25 Feb 2013</a> - Well written and easy to follow book with end of chapter quizzes.

## Exam Topics

### [Lambda Expressions](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part1)
- Describe and develop code that uses Java inner classes, including nested class, static class, local class, and anonymous classes
- Describe and write functional interfaces
- Describe a lambda expression; refactor the code that uses an anonymous inner class to use a lambda expression; describe type inference and target typing

### [Java Collections and Streams with Lambdas](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part2)
- Develop code that iterates a collection by using the forEach() method and method chaining
- Describe the Stream interface and pipelines
- Filter a collection by using lambda expressions
- Identify the operations, on stream, that are lazy

### [Parallel Streams](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part3)
- Develop code that uses parallel streams
- Implement decomposition and reduction in streams

### [Method Enhancements](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part4)
- Add static methods to interfaces
- Define and use a default method of an interface and describe the inheritance rules for the default method

### [Using Built-in Lambda Types](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part5)
- Describe the interfaces of the java.util.function package
- Develop code that uses the Function interface
- Develop code that uses the Consumer interface
- Develop code that uses the Supplier interface
- Develop code that uses the UnaryOperator interface
- Develop code that uses the Predicate interface
- Develop code that uses the primitive and binary variations of the base interfaces of the java.util.function package
- Develop code that uses a method reference, including refactoring a lambda expression to a method reference

### [Collection Operations with Lambda](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part6)
- Develop code to extract data from an object by using the map() method
- Search for data by using methods such as findFirst(), findAny(), anyMatch(), allMatch(), and noneMatch()
- Describe the unique characteristics of the Optional class
- Perform calculations by using Java Stream methods, such as count(), max(), min(), average(), and sum()
- Sort a collection by using lambda expressions
- Develop code that uses the Stream.collect() method and Collectors class methods, such as averagingDouble(), groupingBy(), joining(), and partitioningBy()

### [Lambda Cookbook](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part7)
- Develop code that uses Java SE 8 collection improvements, including Collection.removeIf(), List.replaceAll(), Map.computeIfAbsent(), and Map.computeIfPresent() methods
- Develop code that uses Java SE 8 I/O improvements, including Files.find(), Files.walk(), and lines() methods
- Use flatMap() methods in the Stream API
- Develop code that creates a stream by using the Arrays.stream() and IntStream.range() methods

### [Use Java SE 8 Date/Time API](https://github.com/rysharprules/Java-SE8-Upgrade-Exam/tree/master/src/ocp/study/part8)
- Create and manage date- and time-based events, including a combination of date and time in a single object, by using LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration
- Work with dates and times across time zones and manage changes resulting from daylight savings, including Format date and times values
- Define, create, and manage date- and time-based events using Instant, Period, Duration, and TemporalUnit