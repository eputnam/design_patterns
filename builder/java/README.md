# Builder pattern in Java

Client

Director class
- buildBike(Builder)

Bike model
- int WheelSize
- RearHubType rearHubType
- String Shifters

Enum RearHubType
- FREEWHEEL
- FIXED

Builder Interface
- setWheelSize
- setRearHubType
- setShifters

Concrete Builders implement Builder
