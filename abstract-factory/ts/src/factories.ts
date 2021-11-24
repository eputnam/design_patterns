import { Logger } from "tslog";
import { Fork, ClassicFork } from "./forks";

export interface FlatwareFactory {
    buildFork():Fork;
}

export class ClassicFlatwareFactory implements FlatwareFactory {
    buildFork() {
        return new ClassicFork(true, "silver", new Logger());
    }
}