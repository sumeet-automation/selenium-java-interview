public class Assignment3 {
    /**
     * <b>Pole Length => L meters<b/> <br>
     * <b>Climbs x meter up p hours<b/><br>
     * <b>Climbs y down q hours<b/>
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(monkeyClimbs(null, 3, 2, 2, 2));
    }

    private static int monkeyClimbs(Integer poleLenth, int upClimbDistance, int upClimsHours, int downDistance, int downTime) {
        int timeCount = 0;
        int distanceCount = 0;
        while (distanceCount < poleLenth) {
            distanceCount += upClimbDistance;
            timeCount += upClimsHours;
            if (distanceCount >= poleLenth)
                break;
            else if (distanceCount < 0)
                return -1;
            distanceCount -= downDistance;
            timeCount += downTime;
        }
        return timeCount;
    }
}
