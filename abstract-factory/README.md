# ABSTRACT FACTORY

## When might you use it?
When you have a family of similar products you want to create but you don't want to have to worry about their implementations at the client level.

## How does it work?
I don't know a good way to describe this yet but a great metaphor is with UI component libraries. An abstract factory can facilitate the creation of a scrollbar or button without having to know what they will ultimately look like, it just calls a concrete factory like MaterialFactory or BootstrapFactory and those know how to create the components in the right style. All the abstract factory has to know is createButton(), not createBootstrapButton(). 

## Benefits
- Makes switching out families of products easy
- Promotes consistency between families and among products

## Drawbacks
- In a traditional abstract factory, anyway, it is a lot of work to add new products because the abstract factory and all its subfactories must support them.

