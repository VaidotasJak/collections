package exceptions.IndividualWork;

import java.util.ArrayList;
import java.util.List;

public class IndividualExceptionMain {
    public static void main(String[] args) {
        try {
            List<Parashute> parashutes = getPrashute("Syber");
            parashutes.get(0);
            jumpFromPlane(true);
            isAADTurnedOn(true);
        } catch (CanJumpFromPlaneException | AadIsNotTurnedOnException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
    }

    private static void jumpFromPlane(boolean hasParashute) throws CanJumpFromPlaneException {
        if(hasParashute){
            System.out.println("good to go");
        } else {
            throw new CanJumpFromPlaneException("You dont have parashute");
        }

    }
    private static void isAADTurnedOn(boolean aadTurnedOn) throws AadIsNotTurnedOnException {
        if(aadTurnedOn){
            System.out.println("good to go");
        } else {
            throw new AadIsNotTurnedOnException("Before going to jump turn on AAD device.");
        }
    }

    private static List<Parashute> getPrashute(String parashuteName){
        List<Parashute> parashutes = new ArrayList<>();
        Parashute parashute = new Parashute();
        parashute.setName(parashuteName);
        parashutes.add(parashute);
        return parashutes;
    }

};

