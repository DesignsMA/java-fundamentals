class Darts {
    private final double center[] = {0,0};
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt( (Math.pow(xOfDart,2) - Math.pow(center[0],2)) +
                                     (Math.pow(yOfDart,2) - Math.pow(center[1],2)));
        if ( distance <= 1.0 ) return  10;
        if ( distance <= 5.0 ) return 5;
        if ( distance <= 10.0 ) return 1;
        return 0;
    }
}
