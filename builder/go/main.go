package main

import "fmt"

// for the builder pattern, you have a director and a builder with a bunch of concrete builders that build the product for the director.
// the builder is an abstract interface/api between the director and the concrete builders

// bike is the thing we want to build
type bike struct {
	Crankset  string
	Shifters  string
	WheelSize int
}

/*
FixieBikeBuilder BikeBuilder

puttysShop.BuildBike(FixieBikeBuilder)

FixieBikeBuilder.getBike()
*/

// this is the Builder (abstract)
type BikeBuilder interface {
	addCrankset()
	addShifters()
	addWheels()
	getBike() bike
}

// concrete bike builder
type FixieBikeBuilder struct {
	bike
}

// concrete bike builder
type TwoSpeedBikeBuilder struct {
	bike
}

func newTwoSpeedBikeBuilder() *TwoSpeedBikeBuilder {
	return &TwoSpeedBikeBuilder{}
}

func (t *TwoSpeedBikeBuilder) addCrankset() {
	t.Crankset = "Freewheel"
}

func (t *TwoSpeedBikeBuilder) addShifters() {
	t.Shifters = "Paddle"
}

func (t *TwoSpeedBikeBuilder) addWheels() {
	t.WheelSize = 29
}

func (t *TwoSpeedBikeBuilder) getBike() bike {
	return bike{
		Crankset:  t.Crankset,
		Shifters:  t.Shifters,
		WheelSize: t.WheelSize,
	}
}

func newFixieBikeBuilder() *FixieBikeBuilder {
	return &FixieBikeBuilder{}
}

func (f *FixieBikeBuilder) addCrankset() {
	f.Crankset = "Fixed Gear"
}

func (f *FixieBikeBuilder) addShifters() {
	f.Shifters = ""
}

func (f *FixieBikeBuilder) addWheels() {
	f.WheelSize = 27
}

func (f *FixieBikeBuilder) getBike() bike {
	return bike{
		Crankset:  f.Crankset,
		Shifters:  f.Shifters,
		WheelSize: f.WheelSize,
	}
}

// director that gets called by the client
type director struct {
	builder BikeBuilder
}

func newDirector(b BikeBuilder) director {
	return director{
		builder: b,
	}
}

// method where director calls the builder
func (d *director) buildBike() {
	d.builder.addCrankset()
	d.builder.addShifters()
	d.builder.addWheels()
}

// where the magic happens
func main() {
	fixieBuilder := newFixieBikeBuilder()
	twoSpeedBuilder := newTwoSpeedBikeBuilder()

	fdir := newDirector(fixieBuilder)
	fdir.buildBike()
	bike := fixieBuilder.getBike()
	fmt.Println(bike)

	tdir := newDirector(twoSpeedBuilder)
	tdir.buildBike()
	bike = twoSpeedBuilder.getBike()
	fmt.Println(bike)

}
