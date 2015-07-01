
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package ucu;

import java.util.HashMap;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\012\003\000\002\002\004\000\002\012" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\011\003\000\002\011\003\000\002\011\003\000\002\002" +
    "\006\000\002\002\004\000\002\002\010\000\002\005\005" +
    "\000\002\005\005\000\002\007\005\000\002\007\005\000" +
    "\002\004\004\000\002\004\002\000\002\003\005\000\002" +
    "\003\005\000\002\013\005\000\002\013\005\000\002\010" +
    "\006\000\002\010\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\034\004\015\005\022\006\017\007\006\010" +
    "\014\011\004\012\010\013\021\014\016\015\025\017\005" +
    "\021\007\025\011\001\002\000\050\002\ufffd\004\ufffd\005" +
    "\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd" +
    "\014\ufffd\015\ufffd\016\ufffd\017\ufffd\020\ufffd\021\ufffd\022" +
    "\ufffd\024\ufffd\026\ufffd\027\ufffd\001\002\000\036\004\015" +
    "\005\022\006\017\007\006\010\014\011\004\012\010\013" +
    "\021\014\016\015\025\017\005\020\uffe4\021\007\026\uffe4" +
    "\001\002\000\050\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007" +
    "\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\015\ufff7" +
    "\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\024\ufff7\026" +
    "\ufff7\027\ufff7\001\002\000\036\004\015\005\022\006\017" +
    "\007\006\010\014\011\004\012\010\013\021\014\016\015" +
    "\025\017\005\021\007\022\uffea\026\uffea\001\002\000\050" +
    "\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011" +
    "\ufffa\012\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa\017\ufffa" +
    "\020\ufffa\021\ufffa\022\ufffa\024\ufffa\026\ufffa\027\ufffa\001" +
    "\002\000\006\021\007\023\027\001\002\000\004\002\uffff" +
    "\001\002\000\004\002\026\001\002\000\050\002\ufff9\004" +
    "\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021" +
    "\ufff9\022\ufff9\024\ufff9\026\ufff9\027\ufff9\001\002\000\050" +
    "\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011" +
    "\ufff8\012\ufff8\013\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8" +
    "\020\ufff8\021\ufff8\022\ufff8\024\ufff8\026\ufff8\027\ufff8\001" +
    "\002\000\050\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb" +
    "\010\ufffb\011\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016" +
    "\ufffb\017\ufffb\020\ufffb\021\ufffb\022\ufffb\024\ufffb\026\ufffb" +
    "\027\ufffb\001\002\000\050\002\ufff6\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6" +
    "\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\024" +
    "\ufff6\026\ufff6\027\ufff6\001\002\000\050\002\ufff3\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013" +
    "\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3\021\ufff3" +
    "\022\ufff3\024\ufff3\026\ufff3\027\ufff3\001\002\000\050\002" +
    "\ufffe\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe" +
    "\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe\020" +
    "\ufffe\021\ufffe\022\ufffe\024\ufffe\026\ufffe\027\ufffe\001\002" +
    "\000\050\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010" +
    "\ufff5\011\ufff5\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5" +
    "\017\ufff5\020\ufff5\021\ufff5\022\ufff5\024\ufff5\026\ufff5\027" +
    "\ufff5\001\002\000\004\002\001\001\002\000\050\002\ufff4" +
    "\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012" +
    "\ufff4\013\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4" +
    "\021\ufff4\022\ufff4\024\ufff4\026\ufff4\027\ufff4\001\002\000" +
    "\050\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc" +
    "\011\ufffc\012\ufffc\013\ufffc\014\ufffc\015\ufffc\016\ufffc\017" +
    "\ufffc\020\ufffc\021\ufffc\022\ufffc\024\ufffc\026\ufffc\027\ufffc" +
    "\001\002\000\004\002\000\001\002\000\036\004\015\005" +
    "\022\006\017\007\006\010\014\011\004\012\010\013\021" +
    "\014\016\015\025\017\005\021\007\024\uffea\027\uffea\001" +
    "\002\000\004\002\ufff1\001\002\000\042\004\015\005\022" +
    "\006\017\007\006\010\014\011\004\012\010\013\021\014" +
    "\016\015\025\017\005\021\007\022\uffea\024\uffea\026\uffea" +
    "\027\uffea\001\002\000\006\024\033\027\034\001\002\000" +
    "\004\002\ufff2\001\002\000\004\024\035\001\002\000\004" +
    "\021\007\001\002\000\004\002\ufff0\001\002\000\012\022" +
    "\uffeb\024\uffeb\026\uffeb\027\uffeb\001\002\000\004\022\046" +
    "\001\002\000\006\022\042\026\043\001\002\000\050\002" +
    "\uffef\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef" +
    "\012\uffef\013\uffef\014\uffef\015\uffef\016\uffef\017\uffef\020" +
    "\uffef\021\uffef\022\uffef\024\uffef\026\uffef\027\uffef\001\002" +
    "\000\036\004\015\005\022\006\017\007\006\010\014\011" +
    "\004\012\010\013\021\014\016\015\025\017\005\021\007" +
    "\022\uffea\026\uffea\001\002\000\004\022\uffec\001\002\000" +
    "\006\022\uffed\026\043\001\002\000\050\002\uffee\004\uffee" +
    "\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee\012\uffee\013" +
    "\uffee\014\uffee\015\uffee\016\uffee\017\uffee\020\uffee\021\uffee" +
    "\022\uffee\024\uffee\026\uffee\027\uffee\001\002\000\006\020" +
    "\056\026\057\001\002\000\004\020\055\001\002\000\004" +
    "\016\052\001\002\000\032\004\015\005\022\006\017\007" +
    "\006\010\014\011\004\012\010\013\021\014\016\015\025" +
    "\017\005\021\007\001\002\000\036\004\015\005\022\006" +
    "\017\007\006\010\014\011\004\012\010\013\021\014\016" +
    "\015\025\017\005\020\uffe4\021\007\026\uffe4\001\002\000" +
    "\006\020\uffe5\026\uffe5\001\002\000\050\002\uffe8\004\uffe8" +
    "\005\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013" +
    "\uffe8\014\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8" +
    "\022\uffe8\024\uffe8\026\uffe8\027\uffe8\001\002\000\050\002" +
    "\uffe9\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010\uffe9\011\uffe9" +
    "\012\uffe9\013\uffe9\014\uffe9\015\uffe9\016\uffe9\017\uffe9\020" +
    "\uffe9\021\uffe9\022\uffe9\024\uffe9\026\uffe9\027\uffe9\001\002" +
    "\000\036\004\015\005\022\006\017\007\006\010\014\011" +
    "\004\012\010\013\021\014\016\015\025\017\005\020\uffe4" +
    "\021\007\026\uffe4\001\002\000\006\020\uffe7\026\057\001" +
    "\002\000\004\020\uffe6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\014\002\011\003\017\005\023\011\022\012" +
    "\012\001\001\000\002\001\001\000\014\003\017\005\023" +
    "\010\046\011\050\013\047\001\001\000\002\001\001\000" +
    "\014\003\017\004\040\005\023\007\037\011\030\001\001" +
    "\000\002\001\001\000\004\005\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\003" +
    "\017\004\031\005\023\011\030\001\001\000\002\001\001" +
    "\000\012\003\017\004\036\005\023\011\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\003\017\004\044\005\023\007\043\011\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\017\005\023\011\052\001\001\000\012\003\017\005\023" +
    "\010\053\011\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\003\017\005\023\010\057" +
    "\011\050\013\060\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public HashMap<String, SFXFactory> rConstructors = new HashMap<String, SFXFactory>();
     public ArrayList<Object> Builder(Object name, ArrayList fijos, ArrayList variables) {
        ArrayList<ArrayList> variables1 = variables;
    	SFXFactory cClass = rConstructors.get(name.toString());
    	ArrayList<Object> objetosResultado = new ArrayList<Object>();
    	for (ArrayList param: variables1){
    	    ArrayList<Object> arrayFinal = new ArrayList<Object>();
    	    arrayFinal.addAll(fijos);
    		arrayFinal.addAll(variables1);
    		objetosResultado.add(cClass.Build(param));
    	}
    	return objetosResultado;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Start ::= Value 
            {
              Object RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object value = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = value;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Start",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Start EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Start ::= Constructor 
            {
              Object RESULT =null;
		int objleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int objright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object obj = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = obj;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Start",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Value ::= INTEGER 
            {
              Object RESULT =null;
		int INTEGERleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int INTEGERright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer INTEGER = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = INTEGER;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Value ::= LONG 
            {
              Object RESULT =null;
		int LONGleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int LONGright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Long LONG = (Long)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = LONG;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Value ::= DOUBLE 
            {
              Object RESULT =null;
		int DOUBLEleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int DOUBLEright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double DOUBLE = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = DOUBLE;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Value ::= FLOAT 
            {
              Object RESULT =null;
		int FLOATleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int FLOATright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Float FLOAT = (Float)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = FLOAT;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Value ::= HEXINTEGER 
            {
              Object RESULT =null;
		int hintleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int hintright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer hint = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = hint;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Value ::= HEXLONG 
            {
              Object RESULT =null;
		int hlongleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int hlongright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Long hlong = (Long)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT= hlong;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Value ::= STRING 
            {
              Object RESULT =null;
		int stringleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int stringright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String string = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = string;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Value ::= TRUE 
            {
              Object RESULT =null;
		int TRUEleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int TRUEright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean TRUE = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = TRUE;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Value ::= FALSE 
            {
              Object RESULT =null;
		int FALSEleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int FALSEright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean FALSE = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = FALSE;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Value ::= NULL 
            {
              Object RESULT =null;
		int nuloleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nuloright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String nulo = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = nulo;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Value ::= ExpList 
            {
              Object RESULT =null;
		int explleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int explright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList expl = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = expl;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Value ::= ExpMap 
            {
              Object RESULT =null;
		int expmleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expmright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object expm = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = expm;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Constructor ::= ID LPARENTHESIS List RPARENTHESIS 
            {
              Object RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int paramleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int paramright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList param = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
					SFXFactory cClass = parser.rConstructors.get(name);
					RESULT = cClass.Build(param);
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Constructor",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Constructor ::= ID ExpList 
            {
              Object RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int elleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int elright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList el = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				    RESULT = Builder(name, new ArrayList<Object>(), el);
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Constructor",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Constructor ::= ID LPARENTHESIS List TP RPARENTHESIS ExpList 
            {
              Object RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int paramleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int paramright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		ArrayList param = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int elleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int elright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList el = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = Builder(name, param, el);
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Constructor",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ExpList ::= LBRACKET List RBRACKET 
            {
              ArrayList RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList l = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
			    RESULT = l;
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ExpList",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ExpList ::= LBRACKET ListAbrev RBRACKET 
            {
              ArrayList RESULT =null;
		int laleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int laright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList la = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
			    RESULT = la;
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ExpList",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ListAbrev ::= List PIPE List 
            {
              ArrayList RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList l = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int l1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int l1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList l1 = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new ArrayList();
				RESULT.add(0, l1);
				RESULT.add(0, l);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ListAbrev",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ListAbrev ::= List PIPE ListAbrev 
            {
              ArrayList RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList l = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int laleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int laright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList la = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT =  la;
				RESULT.add(0,l);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ListAbrev",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // List ::= Value List 
            {
              ArrayList RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList l = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = l;
				RESULT.add(0,v1);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("List",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // List ::= 
            {
              ArrayList RESULT =null;
		
				RESULT = new ArrayList();
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("List",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ExpMap ::= LCLASP Map RCLASP 
            {
              Object RESULT =null;
		int mapleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int mapright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		HashMap map = (HashMap)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
				RESULT = map;
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ExpMap",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ExpMap ::= LCLASP MapAbrev RCLASP 
            {
              Object RESULT =null;
		int mapAbrevleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int mapAbrevright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList mapAbrev = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
				RESULT = mapAbrev;
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ExpMap",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // MapAbrev ::= Map PIPE Map 
            {
              ArrayList RESULT =null;
		int map1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int map1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		HashMap map1 = (HashMap)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int map2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int map2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		HashMap map2 = (HashMap)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = new ArrayList();
                RESULT.add(map2);
                RESULT.add(map1);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("MapAbrev",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // MapAbrev ::= Map PIPE MapAbrev 
            {
              ArrayList RESULT =null;
		int mapleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int mapright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		HashMap map = (HashMap)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int mapAbrevleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mapAbrevright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList mapAbrev = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = mapAbrev;
                RESULT.add(map);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("MapAbrev",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Map ::= Value COLON Value Map 
            {
              HashMap RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int mapleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mapright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		HashMap map = (HashMap)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = map;
				RESULT.put(v1,v2);
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Map",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Map ::= 
            {
              HashMap RESULT =null;
		RESULT = new HashMap<Object,Object>();
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Map",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
