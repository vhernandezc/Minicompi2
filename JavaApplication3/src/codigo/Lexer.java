/* The following code was generated by JFlex 1.4.3 on 04/05/23 20:48 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 04/05/23 20:48 from the specification file
 * <tt>C:/Users/vh367/OneDrive/Documentos/NetBeansProjects/JavaApplication3/src/codigo/lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\50\1\6\2\0"+
    "\1\53\1\46\1\0\1\55\1\56\1\45\1\43\1\3\1\44\1\0"+
    "\1\4\12\2\1\0\1\63\1\52\1\42\1\51\2\0\3\1\1\26"+
    "\1\13\3\1\1\32\2\1\1\37\1\1\1\22\1\35\3\1\1\30"+
    "\7\1\1\61\1\0\1\62\1\0\1\1\1\0\1\20\1\7\1\17"+
    "\1\27\1\12\1\25\1\24\1\41\1\31\2\1\1\23\1\33\1\14"+
    "\1\16\1\34\1\1\1\15\1\21\1\11\1\1\1\54\1\40\1\1"+
    "\1\10\1\36\1\57\1\47\1\60\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\15\2\1\10\1\11\1\12\1\13\3\14\2\15\1\1"+
    "\1\2\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\4\1\25\11\2\1\26\1\27\5\2\1\15\1\30"+
    "\1\14\1\2\1\0\6\2\1\31\11\2\1\0\1\32"+
    "\10\2\1\33\4\2\1\3\4\2\1\34\3\2\1\35"+
    "\3\2\1\36\6\2\1\37\1\40\1\2\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\64\0\64"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444"+
    "\0\u0478\0\u04ac\0\u04e0\0\u03dc\0\u0514\0\u0548\0\u0478\0\u057c"+
    "\0\u05b0\0\64\0\64\0\64\0\64\0\64\0\64\0\u05e4"+
    "\0\64\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750"+
    "\0\u0784\0\u07b8\0\150\0\150\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\64\0\64\0\64\0\u08f0\0\u0924\0\u0958\0\u098c"+
    "\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\150\0\u0a90\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\150"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04"+
    "\0\150\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\64\0\u0f08\0\u0f3c"+
    "\0\u0f70\0\u0fa4\0\150\0\u0fd8\0\u100c\0\u1040\0\150\0\u1074"+
    "\0\u10a8\0\u10dc\0\150\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0"+
    "\0\u1214\0\150\0\150\0\u1248\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\3\3\1\12\3\3\1\13\2\3\1\14\2\3\1\15"+
    "\1\16\1\17\1\20\1\3\1\21\1\22\1\3\1\23"+
    "\1\3\1\24\1\25\1\3\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\65\0\2\3"+
    "\4\0\33\3\12\0\1\3\11\0\1\4\64\0\1\5"+
    "\64\0\1\50\35\0\1\51\22\0\2\3\4\0\1\3"+
    "\1\52\31\3\12\0\1\3\10\0\2\3\4\0\5\3"+
    "\1\53\25\3\12\0\1\3\10\0\2\3\4\0\7\3"+
    "\1\54\1\3\1\55\21\3\12\0\1\3\10\0\2\3"+
    "\4\0\14\3\1\56\16\3\12\0\1\3\10\0\2\3"+
    "\4\0\7\3\1\57\1\3\1\60\2\3\1\61\16\3"+
    "\12\0\1\3\10\0\2\3\4\0\7\3\1\62\23\3"+
    "\12\0\1\3\10\0\2\3\4\0\7\3\1\63\23\3"+
    "\12\0\1\3\10\0\2\3\4\0\22\3\1\64\10\3"+
    "\12\0\1\3\10\0\2\3\4\0\24\3\1\65\6\3"+
    "\12\0\1\3\10\0\2\3\4\0\11\3\1\66\21\3"+
    "\12\0\1\3\10\0\2\3\4\0\2\3\1\67\30\3"+
    "\12\0\1\3\10\0\2\3\4\0\22\3\1\70\10\3"+
    "\12\0\1\3\10\0\2\3\4\0\32\3\1\71\12\0"+
    "\1\3\51\0\1\72\63\0\1\51\1\73\62\0\1\51"+
    "\1\0\1\73\61\0\1\51\67\0\1\74\64\0\1\74"+
    "\56\0\1\72\6\0\1\72\54\0\1\72\7\0\1\72"+
    "\12\0\2\3\4\0\3\3\1\75\27\3\12\0\1\3"+
    "\53\0\1\76\17\0\5\50\1\0\56\50\1\0\2\3"+
    "\4\0\2\3\1\77\30\3\12\0\1\3\10\0\2\3"+
    "\4\0\2\3\1\100\30\3\12\0\1\3\10\0\2\3"+
    "\4\0\24\3\1\101\6\3\12\0\1\3\10\0\2\3"+
    "\4\0\6\3\1\102\11\3\1\103\12\3\12\0\1\3"+
    "\10\0\2\3\4\0\11\3\1\104\21\3\12\0\1\3"+
    "\10\0\2\3\4\0\6\3\1\105\24\3\12\0\1\3"+
    "\10\0\2\3\4\0\14\3\1\106\16\3\12\0\1\3"+
    "\10\0\2\3\4\0\7\3\1\107\23\3\12\0\1\3"+
    "\10\0\2\3\4\0\1\110\32\3\12\0\1\3\10\0"+
    "\2\3\4\0\25\3\1\111\5\3\12\0\1\3\10\0"+
    "\2\3\4\0\22\3\1\112\10\3\12\0\1\3\10\0"+
    "\2\3\4\0\6\3\1\113\24\3\12\0\1\3\10\0"+
    "\2\3\4\0\2\3\1\114\30\3\12\0\1\3\10\0"+
    "\2\3\4\0\22\3\1\115\10\3\12\0\1\3\10\0"+
    "\2\3\4\0\6\3\1\116\24\3\12\0\1\3\11\0"+
    "\1\117\62\0\2\3\4\0\3\3\1\120\27\3\12\0"+
    "\1\3\10\0\2\3\4\0\3\3\1\121\27\3\12\0"+
    "\1\3\10\0\2\3\4\0\3\3\1\122\27\3\12\0"+
    "\1\3\10\0\2\3\4\0\11\3\1\123\21\3\12\0"+
    "\1\3\10\0\2\3\4\0\3\3\1\124\27\3\12\0"+
    "\1\3\10\0\2\3\4\0\6\3\1\125\24\3\12\0"+
    "\1\3\10\0\2\3\4\0\12\3\1\126\20\3\12\0"+
    "\1\3\10\0\2\3\4\0\11\3\1\127\21\3\12\0"+
    "\1\3\10\0\2\3\4\0\14\3\1\77\16\3\12\0"+
    "\1\3\10\0\2\3\4\0\6\3\1\130\24\3\12\0"+
    "\1\3\10\0\2\3\4\0\5\3\1\131\25\3\12\0"+
    "\1\3\10\0\2\3\4\0\7\3\1\132\23\3\12\0"+
    "\1\3\10\0\2\3\4\0\3\3\1\133\27\3\12\0"+
    "\1\3\10\0\2\3\4\0\14\3\1\134\16\3\12\0"+
    "\1\3\10\0\2\3\4\0\20\3\1\135\12\3\12\0"+
    "\1\3\11\0\1\117\53\0\1\136\6\0\2\3\4\0"+
    "\6\3\1\137\24\3\12\0\1\3\10\0\2\3\4\0"+
    "\5\3\1\140\25\3\12\0\1\3\10\0\2\3\4\0"+
    "\10\3\1\141\22\3\12\0\1\3\10\0\2\3\4\0"+
    "\5\3\1\142\25\3\12\0\1\3\10\0\2\3\4\0"+
    "\15\3\1\137\15\3\12\0\1\3\10\0\2\3\4\0"+
    "\7\3\1\143\23\3\12\0\1\3\10\0\2\3\4\0"+
    "\2\3\1\120\30\3\12\0\1\3\10\0\2\3\4\0"+
    "\22\3\1\144\10\3\12\0\1\3\10\0\2\3\4\0"+
    "\10\3\1\145\22\3\12\0\1\3\10\0\2\3\4\0"+
    "\6\3\1\146\24\3\12\0\1\3\10\0\2\3\4\0"+
    "\3\3\1\147\27\3\12\0\1\3\10\0\2\3\4\0"+
    "\11\3\1\150\21\3\12\0\1\3\10\0\2\3\4\0"+
    "\7\3\1\120\23\3\12\0\1\3\10\0\2\3\4\0"+
    "\27\3\1\151\3\3\12\0\1\3\10\0\2\3\4\0"+
    "\2\3\1\152\30\3\12\0\1\3\10\0\2\3\4\0"+
    "\11\3\1\153\21\3\12\0\1\3\10\0\2\3\4\0"+
    "\24\3\1\154\6\3\12\0\1\3\10\0\2\3\4\0"+
    "\11\3\1\155\21\3\12\0\1\3\10\0\2\3\4\0"+
    "\11\3\1\156\21\3\12\0\1\3\10\0\2\3\4\0"+
    "\20\3\1\143\12\3\12\0\1\3\10\0\2\3\4\0"+
    "\11\3\1\157\21\3\12\0\1\3\10\0\2\3\4\0"+
    "\3\3\1\160\27\3\12\0\1\3\10\0\2\3\4\0"+
    "\22\3\1\157\10\3\12\0\1\3\10\0\2\3\4\0"+
    "\12\3\1\161\20\3\12\0\1\3\10\0\2\3\4\0"+
    "\14\3\1\162\16\3\12\0\1\3\10\0\2\3\4\0"+
    "\6\3\1\163\24\3\12\0\1\3\10\0\2\3\4\0"+
    "\6\3\1\164\24\3\12\0\1\3\10\0\2\3\4\0"+
    "\7\3\1\165\23\3\12\0\1\3\10\0\2\3\4\0"+
    "\12\3\1\120\20\3\12\0\1\3\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4732];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\31\1\6\11\1\1\1\11"+
    "\20\1\3\11\1\1\1\0\20\1\1\0\16\1\1\11"+
    "\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { lexeme=yytext(); return Comillas;
          }
        case 34: break;
        case 20: 
          { lexeme=yytext(); return P_coma;
          }
        case 35: break;
        case 13: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 36: break;
        case 32: 
          { lexeme=yytext(); return Imprimir;
          }
        case 37: break;
        case 18: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 38: break;
        case 30: 
          { lexeme=yytext(); return Cadena;
          }
        case 39: break;
        case 28: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 40: break;
        case 16: 
          { lexeme=yytext(); return Llave_a;
          }
        case 41: break;
        case 9: 
          { lexeme=yytext(); return Suma;
          }
        case 42: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 43: break;
        case 6: 
          { return Linea;
          }
        case 44: break;
        case 21: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 45: break;
        case 23: 
          { lexeme=yytext(); return If;
          }
        case 46: break;
        case 24: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 47: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 48: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 49: break;
        case 31: 
          { lexeme=yytext(); return Literal;
          }
        case 50: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 51: break;
        case 25: 
          { lexeme=yytext(); return For;
          }
        case 52: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 53: break;
        case 22: 
          { lexeme=yytext(); return Do;
          }
        case 54: break;
        case 11: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 55: break;
        case 1: 
          { return ERROR;
          }
        case 56: break;
        case 27: 
          { lexeme=yytext(); return Main;
          }
        case 57: break;
        case 4: 
          { /*Ignore*/
          }
        case 58: break;
        case 12: 
          { lexeme=yytext(); return Op_logico;
          }
        case 59: break;
        case 29: 
          { lexeme=yytext(); return While;
          }
        case 60: break;
        case 26: 
          { lexeme=yytext(); return T_dato;
          }
        case 61: break;
        case 14: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 62: break;
        case 19: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 63: break;
        case 17: 
          { lexeme=yytext(); return Llave_c;
          }
        case 64: break;
        case 33: 
          { lexeme=yytext(); return Else;
          }
        case 65: break;
        case 10: 
          { lexeme=yytext(); return Resta;
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
