### Difference between Checked and Unchecked Exceptions

> 1) *Checked Exception* :
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

> 2) *Unchecked Exception* :
The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

>3) *Error* :
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

### can we right try without catch?
> yes .For each try block there can be zero or more catch blocks, but only one finally block. 

### when finally block will not execute? 
>The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort). 

### Difference between throw and throws in Java
>
1)	Java throw keyword is used to explicitly throw an exception.	Java throws keyword is used to declare an exception.

>2)	Checked exception cannot be propagated using throw only.	Checked exception can be propagated with throws.

>3)	Throw is followed by an instance.	Throws is followed by class.

>4)	Throw is used within the method.	Throws is used with the method signature.

>5)	You cannot throw multiple exceptions.	You can declare multiple exceptions e.g.
public void method()throws IOException,SQLException.

### Difference between final, finally and finalize
>Final is used to apply restrictions on class, method and variable. Final class can't be inherited, final method can't be overridden and final variable value can't be changed.	Finally is used to place important code, it will be executed whether exception is handled or not.
Finalize is used to perform clean up processing just before object is garbage collected. 

>Final is a keyword.	Finally is a block.	Finalize is a method.