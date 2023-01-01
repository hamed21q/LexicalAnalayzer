package States.Keywords;

import Core.IState;
import Core.StateManager;

public class ForKeyword implements IState {
    private StateManager stateManager;
    @Override
    public void endOfFile() {
        stateManager.setState(stateManager.notAccepted);
    }
    public ForKeyword(StateManager st) {
        this.stateManager = st;
    }
    @Override
    public void a() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void b() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void c() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void d() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void e() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void f() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void g() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void h() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void i() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void j() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void k() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void l() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void m() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void n() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void o() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void p() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void q() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void r() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void s() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void t() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void u() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void v() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void w() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void x() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void y() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void z() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void openPar() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void closePar() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void semicolon() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void plus() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void minus() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void cross() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void divide() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void equal() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void leftArrow() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void rightArrow() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void exclamation() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void zero() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void one() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void tow() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void three() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void four() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void five() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void six() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void seven() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void eight() {
        stateManager.setState(stateManager.identifier);

    }
    @Override
    public void nine() {
        stateManager.setState(stateManager.identifier);

    }

}
