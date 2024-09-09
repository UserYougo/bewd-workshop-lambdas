package nl.han.bewd.lambdas.reis;

public class UFOVervoerstrategie implements VervoerStrategy {

    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 10; //teleported
    }
}
