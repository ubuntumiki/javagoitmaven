package core.com.module_05;

abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}

class PlanetTester {
    String test(SpaceObject object) {
        if (object instanceof Planet) {
            return "planet";
        } else {
            return "not planet";
        }
    }
}