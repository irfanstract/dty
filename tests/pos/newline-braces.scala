class Foo
{
  val x: Int = 5
}

def bar(): Int =
{
  val x = ???
  x
}

def f: Int => Int =
  List(1, 2, 3).map  // newline inserted here
  { (x: Int) =>
    x + 1
  }
