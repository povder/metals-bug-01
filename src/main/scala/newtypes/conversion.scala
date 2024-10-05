package newtypes

implicit def autoRefine[A, C](value: A): MyNewtype[A, C] = ???

extension [A, C1, C2](value: MyNewtype[A, (C1 & C2)]) {
  inline def decompose: MyNewtype[A, MyNewtype[C1, C2]] = ???
}