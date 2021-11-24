import { Logger } from "tslog";

export interface Fork {
    hasTines: boolean;
    color: string;
    printType():void;
}

export class ClassicFork implements Fork {
    hasTines: boolean;
    color: string;
    logger: Logger;

    constructor(hasTines:boolean, color:string, logger:Logger) {
        this.hasTines = hasTines;
        this.color = color;
        this.logger = logger;
    }

    printType() {
        this.logger.info("classic fork");
    }
}