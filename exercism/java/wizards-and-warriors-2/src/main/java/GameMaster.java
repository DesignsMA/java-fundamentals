public class GameMaster {

    public static String describe(Character ch)
    {
        return "You're a level " + ch.getLevel() + " " + ch.getCharacterClass() + " with " + ch.getHitPoints() + " hit points.";
    }

    public static String describe(Destination ds)
    {
        return "You've arrived at " + ds.getName() + ", which has " + ds.getInhabitants() + " inhabitants.";
    }

    public static String describe(TravelMethod tm)
    {
        switch (tm) {
            case HORSEBACK:
                return "You're traveling to your destination on horseback.";
            case WALKING:
                return "You're traveling to your destination by walking.";
            default:
                return  "You're traveling to your destination by walking";
        }
    }

    public static String describe(Character ch, Destination ds, TravelMethod tm)
    {
        return describe(ch) + " " + describe(tm) + " " + describe(ds);
    }

    public static String describe(Character ch, Destination ds)
    {
        return describe(ch) + " " + describe(TravelMethod.WALKING) + " " + describe(ds);
    }
}
