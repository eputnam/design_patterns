import { FlatwareFactory } from "./factories";
import { Fork } from "./forks";
import { Logger } from 'tslog';

export class Application {
    factory:FlatwareFactory;
    fork:Fork;
    logger:Logger;

    constructor(factory:FlatwareFactory, logger:Logger) {
        this.factory = factory;
        this.logger = logger;
        this.fork = factory.buildFork();
    }

    printConfig():void {
        this.logger.info("Printing configuration...");
        this.logger.info(this.fork.printType());
    }
}