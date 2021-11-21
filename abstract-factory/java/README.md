# Abstract factory in Java

This is a straightforward, vanilla abstract factory implementation in Java.

## Products
Abstract products are:
- Fork
- Knife
- Spoon

Concrete products are:
- Modern*
- Ornate*
- Classic*

## Factories
Abstract factory is:
- FlatwareFactory

Concrete factories are:
- ModernFlatwareFactory
- OrnateFlatwareFactory
- ClassicFlatwareFactory

## Application
Factory is passed to a FlatwareApp that uses the factory methods to assemble a flatware set. Client reads STDIN for a flatware type and prints the result.

```text
Modern, ornate, or classic?
modern
Printing current flatware set:
A modern fork!
A modern knife!
A modern spoon!
```