package States;

import Core.IState;
import Core.StateManager;

public class Initial implements IState {
    private StateManager stateManager;
    @Override
    public void endOfFile() {
        stateManager.setState(stateManager.notAccepted);
    }
    public Initial(StateManager st) {
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
        stateManager.setState(stateManager.fInFor);
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
        stateManager.setState(stateManager.iInIf);
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
        stateManager.setState(stateManager.openPar);
    }

    @Override
    public void closePar() {
        stateManager.setState(stateManager.closePar);
    }

    @Override
    public void semicolon() {
        stateManager.setState(stateManager.semicolon);
    }

    @Override
    public void plus() {
        stateManager.setState(stateManager.plusOp);
    }

    @Override
    public void minus() {
        stateManager.setState(stateManager.minusOp);
    }

    @Override
    public void cross() {
        stateManager.setState(stateManager.crossOp);
    }

    @Override
    public void divide() {
        stateManager.setState(stateManager.divideOp);
    }

    @Override
    public void equal() {
        stateManager.setState(stateManager.equalOp);
    }

    @Override
    public void leftArrow() {
        stateManager.setState(stateManager.graterOp);
    }

    @Override
    public void rightArrow() {
        stateManager.setState(stateManager.lessOp);
    }

    @Override
    public void exclamation() {
        stateManager.setState(stateManager.exclamation);
    }

    @Override
    public void zero() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void one() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void tow() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void three() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void four() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void five() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void six() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void seven() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void eight() {
        stateManager.setState(stateManager.digitNumber);
    }

    @Override
    public void nine() {
        stateManager.setState(stateManager.digitNumber);
    }
}
