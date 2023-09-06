# scala-fibonacci
Here is some code for writing Fibonacci in Scala.  

I use [mill](https://mill-build.com/) as scala build tool, you coude run my code with:  

```scala
mill fib 1000 lazyfib
```

It will run `src/Lazy.scala` and pass `1000` to get the 1000th element:  
- (mill fib 1 lazyfib: 1)  
- (mill fib 2 lazyfib: 1)  
- (mill fib 3 lazyfib: 2)  
- (mill fib 4 lazyfib: 3)  
- (mill fib 5 lazyfib: 5)  
- (mill fib 5 lazyfib: 8)  

There are some kinds of fibonacci implement available now:  
- normal
- lazyfib
- memoize
- tailrec

Example:  

```scala
mill fib 1000 tailrec
```

The result output is:  

```text
The value is: 43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875
Total time in millis: 4
```

:)
