package States.Punctuators;

import Core.IState;
import Core.StateManager;

public class OpenPar implements IState {
    private StateManager stateManager;
    @Override
    public void endOfFile() {
        stateManager.setState(stateManager.notAccepted);
    }
    public OpenPar(StateManager st) {
        this.stateManager = st;
    }
    @Override
    public void a() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void b() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void c() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void d() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void e() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void f() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void g() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void h() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void i() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void j() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void k() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void l() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void m() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void n() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void o() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void p() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void q() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void r() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void s() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void t() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void u() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void v() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void w() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void x() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void y() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void z() {
        stateManager.setState(stateManager.notAccepted);

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
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void one() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void tow() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void three() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void four() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void five() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void six() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void seven() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void eight() {
        stateManager.setState(stateManager.notAccepted);

    }
    @Override
    public void nine() {
        stateManager.setState(stateManager.notAccepted);

    }

}
