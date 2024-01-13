# Getting Started

* h2 console : http://localhost:8080/h2-console

## Transcation Management nedir?

Bir işlemin gerçekleşmesi sırasında meydana gelebilecek hataların yönetimidir.

## @Transactional

Bu anotasyon Spring framework' de veri tabanı işlemlerini kapsayan ve onlar için bir transaction management yapan
anotasyondur.
Sınıflara ve Metotlara tanımlanır

Spring Boot' da transaction management enabled olarak gelir. Spring tarafında ise konfigürasyon gereklidir.

Transaction yapısı AOP(Aspect Oriented Programming) kullanarak uygulanır. AOP cross-cutting concern'leri iş mantığından
ayırır.

Spring dynamic proxy kullanır. @Transactional olarak işaretlenmiş nesneler için proxyler oluşturur. Bir fonksiyonun
öncesinde veya sonrasında araya girerek transaction için gerekli olan business logic işler.

## What is Propagation?

Propagation in Spring transactions determines how transactions should behave when they are nested within other
transactions. Here are the
available [propagation](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html)
options:

|                   | **Description**                                                                                      | 
|-------------------|------------------------------------------------------------------------------------------------------|
| **REQUIRED**      | Support a current transaction, create a new one if none exists.                                      |
| **SUPPORTS**      | Support a current transaction, execute non-transactional if none exists.                             |
| **MANDATORY**     | Support a current transaction, throw an exception if none exists.                                    |
| **REQUIRES_NEW**  | Create a new transaction, and suspend the current transaction if one exists.                         |
| **NOT_SUPPORTED** | Execute non-transactional, suspend the current transaction if one exists.                            |
| **NEVER**         | Execute non-transactional, throw an exception if a transaction exists.                               |
| **NESTED**        | Execute within a nested transaction if a current transaction exists, behave like REQUIRED otherwise. |

## Read-only transaction

- A boolean flag that can be set to true if the transaction is effectively read-only, **allowing for corresponding
  optimizations at runtime**.
- Defaults to false.
- This just serves as a hint for the actual transaction subsystem; it will not necessarily cause failure of write access
  attempts. A transaction manager which cannot interpret the read-only hint will not throw an exception when asked for a
  read-only transaction but rather **silently ignore the hint**.