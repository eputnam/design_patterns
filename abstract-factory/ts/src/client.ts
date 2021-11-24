import { Application } from "./app";
import { ClassicFlatwareFactory } from "./factories";
import { Logger } from "tslog";

var factory = new ClassicFlatwareFactory();
var logger = new Logger();
var app = new Application(factory, logger);
app.printConfig();