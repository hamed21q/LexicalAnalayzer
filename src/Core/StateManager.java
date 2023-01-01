package Core;

import States.*;
import States.Keywords.*;
import States.Oprators.Arithmetic.CrossOp;
import States.Oprators.Arithmetic.DivideOp;
import States.Oprators.Arithmetic.MinusOp;
import States.Oprators.Arithmetic.PlusOp;
import States.Oprators.Logic.*;
import States.Punctuators.ClosePar;
import States.Punctuators.OpenPar;
import States.Punctuators.Semicolon;


public class StateManager {
    public IState initial;
    public IState identifier;
    public IState signNumber;
    public IState digitNumber;
    public IState notAccepted;
    public IState fInFor;
    public IState oInFor;
    public IState rInFor;
    public IState iInIf;
    public IState fInIf;
    public IState crossOp;
    public IState plusOp;
    public IState divideOp;
    public IState minusOp;
    public IState equalOp;
    public IState finalNotEqualOp;
    public IState graterOp;
    public IState graterOrEqualOp;
    public IState lessOp;
    public IState lessOrEqualOp;
    public IState notEqualOp;
    public IState closePar;
    public IState openPar;
    public IState semicolon;
    public IState exclamation;
    public IState doubleEqual;

    public IState current;
    public IState prv;

    public StateManager() {
        initial = new Initial(this);
        identifier = new Identifier(this);
        digitNumber = new DigitNumber(this);
        notAccepted = new NotAccept(this);
        fInFor = new FInFor(this);
        fInIf = new IfKeyword(this);
        iInIf = new IInIf(this);
        oInFor = new OInFor(this);
        rInFor = new ForKeyword(this);
        crossOp = new CrossOp(this);
        divideOp = new DivideOp(this);
        minusOp = new MinusOp(this);
        plusOp = new PlusOp(this);
        equalOp = new EqualOp(this);
        graterOp = new GraterOp(this);
        graterOrEqualOp = new GraterOrEqualOp(this);
        lessOp = new LessOp(this);
        lessOrEqualOp = new LessOrEqualOp(this);
        notEqualOp = new NotEqualOp(this);
        closePar = new ClosePar(this);
        openPar = new OpenPar(this);
        semicolon = new Semicolon(this);
        exclamation = new Exclamation(this);
        doubleEqual = new DoubleEqual(this);

        current = initial;
        prv = current;
    }

    public void setState(IState state){
        this.prv = current;
        this.current = state;
    }

    public void a(){current.a();}
    public void b(){current.b();}
    public void c(){current.c();}
    public void d(){current.d();}
    public void e(){current.e();}
    public void f(){current.f();}
    public void g(){current.g();}
    public void h(){current.h();}
    public void i(){current.i();}
    public void j(){current.j();}
    public void k(){current.k();}
    public void l(){current.l();}
    public void m(){current.m();}
    public void n(){current.n();}
    public void o(){current.o();}
    public void p(){current.p();}
    public void q(){current.q();}
    public void r(){current.r();}
    public void s(){current.s();}
    public void t(){current.t();}
    public void u(){current.u();}
    public void v(){current.v();}
    public void w(){current.w();}
    public void x(){current.x();}
    public void y(){current.y();}
    public void z(){current.z();}
    public void openPar(){current.openPar();}
    public void closePar(){current.closePar();}
    public void semicolon(){current.semicolon();}
    public void plus(){current.plus();}
    public void minus(){current.minus();}
    public void cross(){current.cross();}
    public void divide(){current.divide();}
    public void equal(){current.equal();}
    public void leftArrow(){current.leftArrow();}
    public void rightArrow(){current.rightArrow();}
    public void exclamation(){current.exclamation();}
    public void zero(){current.zero();}
    public void one(){current.one();}
    public void tow(){current.tow();}
    public void three(){current.three();}
    public void four(){current.four();}
    public void five(){current.five();}
    public void six(){current.six();}
    public void seven(){current.seven();}
    public void eight(){current.eight();}
    public void nine(){current.nine();}
    public void endOfFile(){current.endOfFile();}

    private boolean tokenFound() {
        return current == notAccepted;
    }
    private void findTransition(char c){
        switch(c){
            case 'a': this.a();break;
            case 'b': this.b();break;
            case 'c': this.c();break;
            case 'd': this.d();break;
            case 'e': this.e();break;
            case 'f': this.f();break;
            case 'g': this.g();break;
            case 'h': this.h();break;
            case 'i': this.i();break;
            case 'j': this.j();break;
            case 'k': this.k();break;
            case 'l': this.l();break;
            case 'm': this.m();break;
            case 'n': this.n();break;
            case 'o': this.o();break;
            case 'p': this.p();break;
            case 'q': this.q();break;
            case 'r': this.r();break;
            case 's': this.s();break;
            case 't': this.t();break;
            case 'u': this.u();break;
            case 'v': this.v();break;
            case 'w': this.w();break;
            case 'x': this.x();break;
            case 'y': this.y();break;
            case 'z': this.z();break;

            case '(': this.openPar();break;
            case ')': this.closePar();break;
            case ';': this.semicolon();break;

            case '+': this.plus();break;
            case '-': this.minus();break;
            case '*': this.cross();break;
            case '/': this.divide();break;

            case '<': this.rightArrow();break;
            case '>': this.leftArrow();break;
            case '!': this.exclamation();break;
            case '=': this.equal();break;

            case '1': this.one();break;
            case '2': this.tow();break;
            case '3': this.three();break;
            case '4': this.four();break;
            case '5': this.five();break;
            case '6': this.six();break;
            case '7': this.seven();break;
            case '8': this.eight();break;
            case '9': this.nine();break;

            case '$': this.endOfFile();
        }
    }
    public IState goNext(char c){
        this.findTransition(c);
        if (tokenFound()) {
            return prv;
        }
        return null;
    }

    public void resetCurrent() {
        this.current = initial;
    }
}
