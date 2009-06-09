// $ANTLR 3.1.3 Apr 15, 2009 15:48:38 BON.g 2009-06-09 13:52:20

/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BONLexer extends AbstractBONLexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int MANIFEST_TEXTBLOCK_END=13;
    public static final int ALPHANUMERIC_OR_UNDERSCORE=18;
    public static final int COMMENT=6;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LINE_COMMENT=14;
    public static final int WHITESPACE=23;
    public static final int UNDERSCORE=20;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int ALPHA=17;
    public static final int REAL=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int LOWER=21;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int UPPER=22;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CHARACTER_CONSTANT=8;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int COMMENT_START=15;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int IDENTIFIER=5;
    public static final int ALPHANUMERIC=19;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int MANIFEST_TEXTBLOCK_START=11;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int DIGIT=16;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int INTEGER=7;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__30=30;
    public static final int MANIFEST_STRING=4;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=10;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int MANIFEST_TEXTBLOCK_MIDDLE=12;

    // delegates
    // delegators

    public BONLexer() {;} 
    public BONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "BON.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:11:7: ( 'dictionary' )
            // BON.g:11:9: 'dictionary'
            {
            match("dictionary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:12:7: ( 'end' )
            // BON.g:12:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:13:7: ( 'class' )
            // BON.g:13:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:14:7: ( 'cluster' )
            // BON.g:14:9: 'cluster'
            {
            match("cluster"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:15:7: ( 'system_chart' )
            // BON.g:15:9: 'system_chart'
            {
            match("system_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:16:7: ( 'explanation' )
            // BON.g:16:9: 'explanation'
            {
            match("explanation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:17:7: ( 'indexing' )
            // BON.g:17:9: 'indexing'
            {
            match("indexing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:18:7: ( 'part' )
            // BON.g:18:9: 'part'
            {
            match("part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:19:7: ( 'description' )
            // BON.g:19:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:20:7: ( ';' )
            // BON.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:21:7: ( ':' )
            // BON.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:22:7: ( ',' )
            // BON.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:23:7: ( 'cluster_chart' )
            // BON.g:23:9: 'cluster_chart'
            {
            match("cluster_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:24:7: ( 'class_chart' )
            // BON.g:24:9: 'class_chart'
            {
            match("class_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:25:7: ( 'inherit' )
            // BON.g:25:9: 'inherit'
            {
            match("inherit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:26:7: ( 'query' )
            // BON.g:26:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:27:7: ( 'command' )
            // BON.g:27:9: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:28:7: ( 'constraint' )
            // BON.g:28:9: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:29:7: ( '(' )
            // BON.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:30:7: ( ')' )
            // BON.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:31:7: ( 'event_chart' )
            // BON.g:31:9: 'event_chart'
            {
            match("event_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:32:7: ( 'incoming' )
            // BON.g:32:9: 'incoming'
            {
            match("incoming"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:33:7: ( 'outgoing' )
            // BON.g:33:9: 'outgoing'
            {
            match("outgoing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:34:7: ( 'event' )
            // BON.g:34:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:35:7: ( 'involves' )
            // BON.g:35:9: 'involves'
            {
            match("involves"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:36:7: ( 'scenario_chart' )
            // BON.g:36:9: 'scenario_chart'
            {
            match("scenario_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:37:7: ( 'scenario' )
            // BON.g:37:9: 'scenario'
            {
            match("scenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:38:7: ( 'creation_chart' )
            // BON.g:38:9: 'creation_chart'
            {
            match("creation_chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:39:7: ( 'creator' )
            // BON.g:39:9: 'creator'
            {
            match("creator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:40:7: ( 'creates' )
            // BON.g:40:9: 'creates'
            {
            match("creates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:41:7: ( 'static_diagram' )
            // BON.g:41:9: 'static_diagram'
            {
            match("static_diagram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:42:7: ( 'component' )
            // BON.g:42:9: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:43:7: ( 'reused' )
            // BON.g:43:9: 'reused'
            {
            match("reused"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:44:7: ( 'root' )
            // BON.g:44:9: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:45:7: ( 'deferred' )
            // BON.g:45:9: 'deferred'
            {
            match("deferred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:46:7: ( 'effective' )
            // BON.g:46:9: 'effective'
            {
            match("effective"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:47:7: ( 'persistent' )
            // BON.g:47:9: 'persistent'
            {
            match("persistent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:48:7: ( 'interfaced' )
            // BON.g:48:9: 'interfaced'
            {
            match("interfaced"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:49:7: ( '{' )
            // BON.g:49:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:50:7: ( '}' )
            // BON.g:50:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:51:7: ( 'client' )
            // BON.g:51:9: 'client'
            {
            match("client"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:52:7: ( '->' )
            // BON.g:52:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:53:7: ( '[' )
            // BON.g:53:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:54:7: ( ']' )
            // BON.g:54:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:55:7: ( '...' )
            // BON.g:55:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:56:7: ( ':{' )
            // BON.g:56:9: ':{'
            {
            match(":{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:57:7: ( '.' )
            // BON.g:57:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:58:7: ( 'invariant' )
            // BON.g:58:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:59:7: ( 'feature' )
            // BON.g:59:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:60:7: ( 'redefined' )
            // BON.g:60:9: 'redefined'
            {
            match("redefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:61:7: ( 'require' )
            // BON.g:61:9: 'require'
            {
            match("require"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:62:7: ( 'ensure' )
            // BON.g:62:9: 'ensure'
            {
            match("ensure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:63:7: ( '^' )
            // BON.g:63:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:64:7: ( 'prefix' )
            // BON.g:64:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:65:7: ( '\"' )
            // BON.g:65:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:66:7: ( 'infix' )
            // BON.g:66:9: 'infix'
            {
            match("infix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:67:7: ( 'for_all' )
            // BON.g:67:9: 'for_all'
            {
            match("for_all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:68:7: ( 'exists' )
            // BON.g:68:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:69:7: ( 'such_that' )
            // BON.g:69:9: 'such_that'
            {
            match("such_that"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:70:7: ( 'it_holds' )
            // BON.g:70:9: 'it_holds'
            {
            match("it_holds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:71:7: ( 'member_of' )
            // BON.g:71:9: 'member_of'
            {
            match("member_of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:72:7: ( '..' )
            // BON.g:72:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:73:7: ( 'Current' )
            // BON.g:73:9: 'Current'
            {
            match("Current"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:74:7: ( 'Void' )
            // BON.g:74:9: 'Void'
            {
            match("Void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:75:7: ( 'Result' )
            // BON.g:75:9: 'Result'
            {
            match("Result"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:76:7: ( 'true' )
            // BON.g:76:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:77:7: ( 'false' )
            // BON.g:77:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:78:7: ( 'dynamic_diagram' )
            // BON.g:78:9: 'dynamic_diagram'
            {
            match("dynamic_diagram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:79:7: ( 'action' )
            // BON.g:79:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:80:7: ( 'nameless' )
            // BON.g:80:9: 'nameless'
            {
            match("nameless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:81:7: ( 'object_group' )
            // BON.g:81:9: 'object_group'
            {
            match("object_group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:82:7: ( 'object_stack' )
            // BON.g:82:9: 'object_stack'
            {
            match("object_stack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:83:7: ( 'object' )
            // BON.g:83:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:84:7: ( 'calls' )
            // BON.g:84:9: 'calls'
            {
            match("calls"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:85:7: ( 'string_marks' )
            // BON.g:85:9: 'string_marks'
            {
            match("string_marks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:86:7: ( 'concatenator' )
            // BON.g:86:9: 'concatenator'
            {
            match("concatenator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:87:8: ( 'keyword_prefix' )
            // BON.g:87:10: 'keyword_prefix'
            {
            match("keyword_prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:88:8: ( '<->' )
            // BON.g:88:10: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:89:8: ( '+' )
            // BON.g:89:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:90:8: ( '-' )
            // BON.g:90:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:91:8: ( 'and' )
            // BON.g:91:10: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:92:8: ( 'or' )
            // BON.g:92:10: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:93:8: ( 'xor' )
            // BON.g:93:10: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:94:8: ( 'delta' )
            // BON.g:94:10: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:95:8: ( 'old' )
            // BON.g:95:10: 'old'
            {
            match("old"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:96:8: ( 'not' )
            // BON.g:96:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:97:8: ( '<' )
            // BON.g:97:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:98:8: ( '>' )
            // BON.g:98:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:99:8: ( '<=' )
            // BON.g:99:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:100:8: ( '>=' )
            // BON.g:100:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:101:8: ( '=' )
            // BON.g:101:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:102:8: ( '/=' )
            // BON.g:102:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:103:8: ( '*' )
            // BON.g:103:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:104:8: ( '/' )
            // BON.g:104:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:105:8: ( '//' )
            // BON.g:105:10: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:106:8: ( '\\\\\\\\' )
            // BON.g:106:10: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "CHARACTER_CONSTANT"
    public final void mCHARACTER_CONSTANT() throws RecognitionException {
        try {
            int _type = CHARACTER_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int v;

            // BON.g:1220:20: ( '\\'' v= . '\\'' )
            // BON.g:1220:23: '\\'' v= . '\\''
            {
            match('\''); 
            v = input.LA(1);
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER_CONSTANT"

    // $ANTLR start "MANIFEST_STRING"
    public final void mMANIFEST_STRING() throws RecognitionException {
        try {
            int _type = MANIFEST_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1588:17: ( '\"' ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )* '\"' )
            // BON.g:1588:19: '\"' ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // BON.g:1589:19: ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\"') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // BON.g:1589:46: ~ ( '\\n' | '\\r' | '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MANIFEST_STRING"

    // $ANTLR start "MANIFEST_TEXTBLOCK_START"
    public final void mMANIFEST_TEXTBLOCK_START() throws RecognitionException {
        try {
            int _type = MANIFEST_TEXTBLOCK_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1599:27: ( '\"' ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )+ '\\\\' ( ' ' | '\\t' )* NEWLINE )
            // BON.g:1599:29: '\"' ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )+ '\\\\' ( ' ' | '\\t' )* NEWLINE
            {
            match('\"'); 
            // BON.g:1599:33: ( options {greedy=false; } : ~ ( '\\n' | '\\r' | '\"' | '\\\\' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }
                else if ( (LA2_0=='\\') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // BON.g:1599:60: ~ ( '\\n' | '\\r' | '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\\'); 
            // BON.g:1599:90: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // BON.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mNEWLINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MANIFEST_TEXTBLOCK_START"

    // $ANTLR start "MANIFEST_TEXTBLOCK_MIDDLE"
    public final void mMANIFEST_TEXTBLOCK_MIDDLE() throws RecognitionException {
        try {
            int _type = MANIFEST_TEXTBLOCK_MIDDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1602:28: ( '\\\\' ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+ '\\\\' ( ' ' | '\\t' )* NEWLINE )
            // BON.g:1602:30: '\\\\' ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+ '\\\\' ( ' ' | '\\t' )* NEWLINE
            {
            match('\\'); 
            // BON.g:1602:35: ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }
                else if ( (LA4_0=='\\') ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // BON.g:1602:62: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\\'); 
            // BON.g:1602:82: ( ' ' | '\\t' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // BON.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mNEWLINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MANIFEST_TEXTBLOCK_MIDDLE"

    // $ANTLR start "MANIFEST_TEXTBLOCK_END"
    public final void mMANIFEST_TEXTBLOCK_END() throws RecognitionException {
        try {
            int _type = MANIFEST_TEXTBLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1605:25: ( '\\\\' ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+ '\"' )
            // BON.g:1605:27: '\\\\' ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+ '\"'
            {
            match('\\'); 
            // BON.g:1605:32: ( options {greedy=false; } : ~ ( '\"' | '\\\\' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }
                else if ( (LA6_0=='\"') ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // BON.g:1605:59: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MANIFEST_TEXTBLOCK_END"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1613:10: ( ( LINE_COMMENT )+ )
            // BON.g:1613:13: ( LINE_COMMENT )+
            {
            // BON.g:1613:13: ( LINE_COMMENT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // BON.g:1613:13: LINE_COMMENT
            	    {
            	    mLINE_COMMENT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            // BON.g:1617:15: ( COMMENT_START ( options {greedy=false; } : . )* NEWLINE )
            // BON.g:1617:18: COMMENT_START ( options {greedy=false; } : . )* NEWLINE
            {
            mCOMMENT_START(); 
            // BON.g:1617:32: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\r') ) {
                    alt8=2;
                }
                else if ( (LA8_0=='\n') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // BON.g:1617:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            mNEWLINE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "COMMENT_START"
    public final void mCOMMENT_START() throws RecognitionException {
        try {
            // BON.g:1621:16: ( '--' )
            // BON.g:1621:18: '--'
            {
            match("--"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_START"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // BON.g:1625:10: ( ( '\\r' )? '\\n' )
            // BON.g:1625:13: ( '\\r' )? '\\n'
            {
            // BON.g:1625:13: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // BON.g:1625:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1632:10: ( ( DIGIT )+ )
            // BON.g:1632:13: ( DIGIT )+
            {
            // BON.g:1632:13: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // BON.g:1632:14: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1635:7: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // BON.g:1635:10: ( DIGIT )+ '.' ( DIGIT )+
            {
            // BON.g:1635:10: ( DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // BON.g:1635:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match('.'); 
            // BON.g:1635:21: ( DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // BON.g:1635:21: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // BON.g:1639:8: ( '0' .. '9' )
            // BON.g:1639:11: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1652:13: ( ALPHA ( ( ALPHANUMERIC_OR_UNDERSCORE )* ALPHANUMERIC )? )
            // BON.g:1652:15: ALPHA ( ( ALPHANUMERIC_OR_UNDERSCORE )* ALPHANUMERIC )?
            {
            mALPHA(); 
            // BON.g:1652:21: ( ( ALPHANUMERIC_OR_UNDERSCORE )* ALPHANUMERIC )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // BON.g:1652:22: ( ALPHANUMERIC_OR_UNDERSCORE )* ALPHANUMERIC
                    {
                    // BON.g:1652:22: ( ALPHANUMERIC_OR_UNDERSCORE )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='z')) ) {
                            int LA13_1 = input.LA(2);

                            if ( ((LA13_1>='0' && LA13_1<='9')||(LA13_1>='A' && LA13_1<='Z')||LA13_1=='_'||(LA13_1>='a' && LA13_1<='z')) ) {
                                alt13=1;
                            }


                        }
                        else if ( (LA13_0=='_') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // BON.g:1652:22: ALPHANUMERIC_OR_UNDERSCORE
                    	    {
                    	    mALPHANUMERIC_OR_UNDERSCORE(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    mALPHANUMERIC(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "ALPHANUMERIC_OR_UNDERSCORE"
    public final void mALPHANUMERIC_OR_UNDERSCORE() throws RecognitionException {
        try {
            // BON.g:1658:29: ( ALPHANUMERIC | UNDERSCORE )
            // BON.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUMERIC_OR_UNDERSCORE"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // BON.g:1662:13: ( '_' )
            // BON.g:1662:16: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "ALPHANUMERIC"
    public final void mALPHANUMERIC() throws RecognitionException {
        try {
            // BON.g:1666:15: ( ALPHA | DIGIT )
            // BON.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUMERIC"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // BON.g:1670:8: ( LOWER | UPPER )
            // BON.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // BON.g:1674:8: ( 'a' .. 'z' )
            // BON.g:1674:10: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // BON.g:1678:8: ( 'A' .. 'Z' )
            // BON.g:1678:10: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // BON.g:1685:13: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // BON.g:1685:16: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // BON.g:1685:16: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // BON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // BON.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | CHARACTER_CONSTANT | MANIFEST_STRING | MANIFEST_TEXTBLOCK_START | MANIFEST_TEXTBLOCK_MIDDLE | MANIFEST_TEXTBLOCK_END | COMMENT | INTEGER | REAL | IDENTIFIER | WHITESPACE )
        int alt16=106;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // BON.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // BON.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // BON.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // BON.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // BON.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // BON.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // BON.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // BON.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // BON.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // BON.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // BON.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // BON.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // BON.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // BON.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // BON.g:1:94: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // BON.g:1:100: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // BON.g:1:106: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // BON.g:1:112: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // BON.g:1:118: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // BON.g:1:124: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // BON.g:1:130: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // BON.g:1:136: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // BON.g:1:142: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // BON.g:1:148: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // BON.g:1:154: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // BON.g:1:160: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // BON.g:1:166: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // BON.g:1:172: T__51
                {
                mT__51(); 

                }
                break;
            case 29 :
                // BON.g:1:178: T__52
                {
                mT__52(); 

                }
                break;
            case 30 :
                // BON.g:1:184: T__53
                {
                mT__53(); 

                }
                break;
            case 31 :
                // BON.g:1:190: T__54
                {
                mT__54(); 

                }
                break;
            case 32 :
                // BON.g:1:196: T__55
                {
                mT__55(); 

                }
                break;
            case 33 :
                // BON.g:1:202: T__56
                {
                mT__56(); 

                }
                break;
            case 34 :
                // BON.g:1:208: T__57
                {
                mT__57(); 

                }
                break;
            case 35 :
                // BON.g:1:214: T__58
                {
                mT__58(); 

                }
                break;
            case 36 :
                // BON.g:1:220: T__59
                {
                mT__59(); 

                }
                break;
            case 37 :
                // BON.g:1:226: T__60
                {
                mT__60(); 

                }
                break;
            case 38 :
                // BON.g:1:232: T__61
                {
                mT__61(); 

                }
                break;
            case 39 :
                // BON.g:1:238: T__62
                {
                mT__62(); 

                }
                break;
            case 40 :
                // BON.g:1:244: T__63
                {
                mT__63(); 

                }
                break;
            case 41 :
                // BON.g:1:250: T__64
                {
                mT__64(); 

                }
                break;
            case 42 :
                // BON.g:1:256: T__65
                {
                mT__65(); 

                }
                break;
            case 43 :
                // BON.g:1:262: T__66
                {
                mT__66(); 

                }
                break;
            case 44 :
                // BON.g:1:268: T__67
                {
                mT__67(); 

                }
                break;
            case 45 :
                // BON.g:1:274: T__68
                {
                mT__68(); 

                }
                break;
            case 46 :
                // BON.g:1:280: T__69
                {
                mT__69(); 

                }
                break;
            case 47 :
                // BON.g:1:286: T__70
                {
                mT__70(); 

                }
                break;
            case 48 :
                // BON.g:1:292: T__71
                {
                mT__71(); 

                }
                break;
            case 49 :
                // BON.g:1:298: T__72
                {
                mT__72(); 

                }
                break;
            case 50 :
                // BON.g:1:304: T__73
                {
                mT__73(); 

                }
                break;
            case 51 :
                // BON.g:1:310: T__74
                {
                mT__74(); 

                }
                break;
            case 52 :
                // BON.g:1:316: T__75
                {
                mT__75(); 

                }
                break;
            case 53 :
                // BON.g:1:322: T__76
                {
                mT__76(); 

                }
                break;
            case 54 :
                // BON.g:1:328: T__77
                {
                mT__77(); 

                }
                break;
            case 55 :
                // BON.g:1:334: T__78
                {
                mT__78(); 

                }
                break;
            case 56 :
                // BON.g:1:340: T__79
                {
                mT__79(); 

                }
                break;
            case 57 :
                // BON.g:1:346: T__80
                {
                mT__80(); 

                }
                break;
            case 58 :
                // BON.g:1:352: T__81
                {
                mT__81(); 

                }
                break;
            case 59 :
                // BON.g:1:358: T__82
                {
                mT__82(); 

                }
                break;
            case 60 :
                // BON.g:1:364: T__83
                {
                mT__83(); 

                }
                break;
            case 61 :
                // BON.g:1:370: T__84
                {
                mT__84(); 

                }
                break;
            case 62 :
                // BON.g:1:376: T__85
                {
                mT__85(); 

                }
                break;
            case 63 :
                // BON.g:1:382: T__86
                {
                mT__86(); 

                }
                break;
            case 64 :
                // BON.g:1:388: T__87
                {
                mT__87(); 

                }
                break;
            case 65 :
                // BON.g:1:394: T__88
                {
                mT__88(); 

                }
                break;
            case 66 :
                // BON.g:1:400: T__89
                {
                mT__89(); 

                }
                break;
            case 67 :
                // BON.g:1:406: T__90
                {
                mT__90(); 

                }
                break;
            case 68 :
                // BON.g:1:412: T__91
                {
                mT__91(); 

                }
                break;
            case 69 :
                // BON.g:1:418: T__92
                {
                mT__92(); 

                }
                break;
            case 70 :
                // BON.g:1:424: T__93
                {
                mT__93(); 

                }
                break;
            case 71 :
                // BON.g:1:430: T__94
                {
                mT__94(); 

                }
                break;
            case 72 :
                // BON.g:1:436: T__95
                {
                mT__95(); 

                }
                break;
            case 73 :
                // BON.g:1:442: T__96
                {
                mT__96(); 

                }
                break;
            case 74 :
                // BON.g:1:448: T__97
                {
                mT__97(); 

                }
                break;
            case 75 :
                // BON.g:1:454: T__98
                {
                mT__98(); 

                }
                break;
            case 76 :
                // BON.g:1:460: T__99
                {
                mT__99(); 

                }
                break;
            case 77 :
                // BON.g:1:466: T__100
                {
                mT__100(); 

                }
                break;
            case 78 :
                // BON.g:1:473: T__101
                {
                mT__101(); 

                }
                break;
            case 79 :
                // BON.g:1:480: T__102
                {
                mT__102(); 

                }
                break;
            case 80 :
                // BON.g:1:487: T__103
                {
                mT__103(); 

                }
                break;
            case 81 :
                // BON.g:1:494: T__104
                {
                mT__104(); 

                }
                break;
            case 82 :
                // BON.g:1:501: T__105
                {
                mT__105(); 

                }
                break;
            case 83 :
                // BON.g:1:508: T__106
                {
                mT__106(); 

                }
                break;
            case 84 :
                // BON.g:1:515: T__107
                {
                mT__107(); 

                }
                break;
            case 85 :
                // BON.g:1:522: T__108
                {
                mT__108(); 

                }
                break;
            case 86 :
                // BON.g:1:529: T__109
                {
                mT__109(); 

                }
                break;
            case 87 :
                // BON.g:1:536: T__110
                {
                mT__110(); 

                }
                break;
            case 88 :
                // BON.g:1:543: T__111
                {
                mT__111(); 

                }
                break;
            case 89 :
                // BON.g:1:550: T__112
                {
                mT__112(); 

                }
                break;
            case 90 :
                // BON.g:1:557: T__113
                {
                mT__113(); 

                }
                break;
            case 91 :
                // BON.g:1:564: T__114
                {
                mT__114(); 

                }
                break;
            case 92 :
                // BON.g:1:571: T__115
                {
                mT__115(); 

                }
                break;
            case 93 :
                // BON.g:1:578: T__116
                {
                mT__116(); 

                }
                break;
            case 94 :
                // BON.g:1:585: T__117
                {
                mT__117(); 

                }
                break;
            case 95 :
                // BON.g:1:592: T__118
                {
                mT__118(); 

                }
                break;
            case 96 :
                // BON.g:1:599: T__119
                {
                mT__119(); 

                }
                break;
            case 97 :
                // BON.g:1:606: CHARACTER_CONSTANT
                {
                mCHARACTER_CONSTANT(); 

                }
                break;
            case 98 :
                // BON.g:1:625: MANIFEST_STRING
                {
                mMANIFEST_STRING(); 

                }
                break;
            case 99 :
                // BON.g:1:641: MANIFEST_TEXTBLOCK_START
                {
                mMANIFEST_TEXTBLOCK_START(); 

                }
                break;
            case 100 :
                // BON.g:1:666: MANIFEST_TEXTBLOCK_MIDDLE
                {
                mMANIFEST_TEXTBLOCK_MIDDLE(); 

                }
                break;
            case 101 :
                // BON.g:1:692: MANIFEST_TEXTBLOCK_END
                {
                mMANIFEST_TEXTBLOCK_END(); 

                }
                break;
            case 102 :
                // BON.g:1:715: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 103 :
                // BON.g:1:723: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 104 :
                // BON.g:1:731: REAL
                {
                mREAL(); 

                }
                break;
            case 105 :
                // BON.g:1:736: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 106 :
                // BON.g:1:747: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\6\52\1\uffff\1\101\1\uffff\1\52\2\uffff\2\52\2\uffff\1"+
        "\113\2\uffff\1\115\1\52\1\uffff\1\123\10\52\1\140\1\uffff\1\52\1"+
        "\143\1\uffff\1\146\3\uffff\1\151\2\uffff\24\52\2\uffff\3\52\1\u008f"+
        "\3\52\3\uffff\1\u0096\1\uffff\3\52\3\uffff\12\52\3\uffff\1\52\11"+
        "\uffff\5\52\1\u00ad\27\52\1\uffff\6\52\1\uffff\1\u00cf\4\52\2\uffff"+
        "\3\52\1\uffff\6\52\1\u00dd\1\52\1\u00df\1\52\1\u00e1\2\uffff\5\52"+
        "\1\uffff\33\52\1\u0102\5\52\1\uffff\3\52\1\u010b\1\52\1\uffff\3"+
        "\52\1\u0111\1\52\1\u0113\1\52\1\uffff\1\52\1\uffff\1\52\1\uffff"+
        "\3\52\1\u011a\4\52\1\u0120\1\52\1\u0123\7\52\1\u012d\4\52\1\uffff"+
        "\6\52\1\u0139\1\52\1\uffff\2\52\1\u013d\5\52\1\uffff\2\52\1\u0145"+
        "\2\52\1\uffff\1\52\1\uffff\6\52\1\uffff\1\52\1\u0150\1\52\1\u0152"+
        "\2\uffff\1\52\2\uffff\1\52\1\u0157\7\52\1\uffff\13\52\1\uffff\2"+
        "\52\1\u016c\1\uffff\1\52\1\u016f\1\u0170\4\52\1\uffff\2\52\1\u0177"+
        "\1\u0178\6\52\1\uffff\1\52\1\uffff\3\52\1\u0184\1\uffff\1\u0185"+
        "\4\52\1\u018a\1\u018b\1\uffff\1\52\2\uffff\2\52\1\u0192\6\52\1\uffff"+
        "\1\52\3\uffff\1\52\1\u019d\1\u019e\1\u019f\1\uffff\1\u01a1\2\uffff"+
        "\4\52\1\u01a6\1\uffff\4\52\3\uffff\4\52\2\uffff\1\52\1\u01b3\3\52"+
        "\1\u01b7\1\uffff\1\u01b8\1\u01b9\2\52\1\u01bc\1\52\1\u01be\3\52"+
        "\3\uffff\1\52\1\uffff\1\u01c3\1\uffff\2\52\1\uffff\3\52\1\u01ca"+
        "\2\52\1\u01cd\2\52\1\uffff\1\52\2\uffff\2\52\1\u01d5\3\uffff\1\u01d6"+
        "\1\52\1\uffff\1\52\1\uffff\2\52\1\u01db\1\u01dc\1\uffff\1\52\1\u01de"+
        "\4\52\1\uffff\2\52\1\uffff\1\u01e5\6\52\2\uffff\1\u01ec\1\u01ed"+
        "\2\52\2\uffff\1\52\1\uffff\1\u01f1\1\52\1\u01f3\1\u01f4\1\u01f5"+
        "\1\52\1\uffff\6\52\2\uffff\3\52\1\uffff\1\52\3\uffff\1\52\1\u0202"+
        "\1\52\1\u0204\2\52\1\u0207\1\u0208\1\u0209\2\52\1\u020c\1\uffff"+
        "\1\52\1\uffff\2\52\3\uffff\2\52\1\uffff\1\u0212\1\u0213\1\u0214"+
        "\1\u0215\1\u0216\5\uffff";
    static final String DFA16_eofS =
        "\u0217\uffff";
    static final String DFA16_minS =
        "\1\11\1\145\1\146\1\141\1\143\1\156\1\141\1\uffff\1\173\1\uffff"+
        "\1\165\2\uffff\1\142\1\145\2\uffff\1\55\2\uffff\1\56\1\141\1\uffff"+
        "\1\0\1\145\1\165\1\157\1\145\1\162\1\143\1\141\1\145\1\55\1\uffff"+
        "\1\157\1\75\1\uffff\1\57\1\uffff\1\0\1\uffff\1\56\2\uffff\1\143"+
        "\1\146\1\156\1\144\1\151\1\145\1\146\1\141\1\155\1\145\1\154\1\163"+
        "\1\145\1\141\2\143\1\137\2\162\1\145\2\uffff\1\145\1\164\1\152\1"+
        "\60\2\144\1\157\3\uffff\1\56\1\uffff\1\141\1\162\1\154\1\0\2\uffff"+
        "\1\155\1\162\1\151\1\163\1\165\1\164\1\144\1\155\1\164\1\171\3\uffff"+
        "\1\162\6\uffff\1\0\2\uffff\1\164\1\143\1\145\1\164\1\141\1\60\1"+
        "\165\1\154\1\163\1\156\1\145\2\163\1\145\1\155\1\143\1\141\1\154"+
        "\1\164\1\156\1\164\1\151\1\150\2\145\1\157\1\141\1\145\1\151\1\60"+
        "\1\164\1\163\1\146\1\162\1\147\1\145\1\uffff\1\60\1\163\1\145\1"+
        "\165\1\164\2\uffff\1\164\1\137\1\163\1\uffff\1\142\1\162\1\144\1"+
        "\165\1\145\1\151\1\60\1\145\1\60\1\167\1\60\2\uffff\1\151\2\162"+
        "\1\141\1\155\1\uffff\1\162\1\141\2\164\1\143\1\163\1\164\1\156\1"+
        "\141\1\157\1\164\1\141\1\164\1\163\1\145\1\141\1\151\1\156\1\137"+
        "\1\170\1\162\1\155\1\154\2\162\1\170\1\157\1\60\2\151\1\171\1\157"+
        "\1\143\1\uffff\1\145\1\146\1\151\1\60\1\165\1\60\3\145\1\60\1\154"+
        "\1\60\1\157\1\uffff\1\154\1\uffff\1\157\1\uffff\1\157\1\151\1\162"+
        "\1\60\1\151\1\145\1\156\1\163\1\60\1\164\1\60\1\145\1\164\2\156"+
        "\1\162\1\164\1\145\1\60\1\155\1\162\1\143\1\147\1\60\3\151\1\166"+
        "\1\151\1\146\1\60\1\154\1\uffff\1\163\1\170\1\60\1\151\1\164\1\144"+
        "\1\151\1\162\1\uffff\1\162\1\154\1\60\1\162\1\156\1\uffff\1\164"+
        "\1\uffff\1\156\1\145\1\162\1\156\1\160\1\145\1\uffff\1\143\1\60"+
        "\1\141\2\60\1\uffff\1\151\1\60\1\uffff\1\162\1\60\1\144\1\145\1"+
        "\141\1\145\1\157\1\162\1\163\1\uffff\1\137\1\151\2\137\1\150\1\156"+
        "\1\164\1\156\1\145\2\141\1\uffff\1\144\1\164\1\60\1\uffff\1\156"+
        "\2\60\1\156\2\145\1\154\1\uffff\1\137\1\164\2\60\1\163\1\144\1\141"+
        "\1\164\1\144\1\137\1\uffff\1\164\1\uffff\1\150\1\166\1\150\1\60"+
        "\1\uffff\1\60\1\156\1\151\2\156\3\60\1\157\2\60\1\141\1\147\1\60"+
        "\1\147\1\163\1\156\1\143\1\163\1\145\1\uffff\1\147\1\60\2\uffff"+
        "\1\145\5\60\2\uffff\1\163\1\137\1\162\1\151\2\60\1\151\1\141\1\145"+
        "\1\141\1\60\2\uffff\1\164\1\156\1\141\1\137\2\uffff\1\150\1\60\1"+
        "\151\1\141\1\164\1\60\1\uffff\2\60\1\164\1\145\1\60\1\156\1\60\1"+
        "\162\1\164\1\144\3\uffff\1\146\1\uffff\2\60\1\171\1\157\1\uffff"+
        "\1\151\1\157\1\162\1\60\1\162\1\150\1\60\2\164\1\60\1\141\1\60\1"+
        "\uffff\1\141\1\162\1\60\3\uffff\1\60\1\144\1\uffff\1\164\1\uffff"+
        "\1\157\1\141\2\60\1\uffff\1\162\1\60\1\156\1\141\1\156\1\164\1\uffff"+
        "\1\164\1\141\1\uffff\1\60\1\157\1\150\1\162\1\150\1\147\1\153\2"+
        "\uffff\2\60\1\165\1\143\2\uffff\1\145\1\uffff\1\60\1\147\3\60\1"+
        "\162\1\uffff\1\162\1\141\1\164\1\141\1\162\1\163\2\uffff\1\160\1"+
        "\153\1\146\1\uffff\1\162\3\uffff\1\164\1\60\1\162\1\60\1\162\1\141"+
        "\3\60\1\151\1\141\1\60\1\uffff\1\164\1\uffff\1\164\1\155\3\uffff"+
        "\1\170\1\155\1\uffff\5\60\5\uffff";
    static final String DFA16_maxS =
        "\1\175\1\171\1\170\1\162\1\171\1\164\1\162\1\uffff\1\173\1\uffff"+
        "\1\165\2\uffff\1\165\1\157\2\uffff\1\76\2\uffff\1\56\1\157\1\uffff"+
        "\1\uffff\1\145\1\165\1\157\1\145\1\162\1\156\1\157\1\145\1\75\1"+
        "\uffff\1\157\1\75\1\uffff\1\75\1\uffff\1\uffff\1\uffff\1\71\2\uffff"+
        "\1\143\1\163\1\156\1\163\1\160\1\145\1\146\1\165\1\156\1\145\1\154"+
        "\1\163\1\145\1\162\1\143\1\166\1\137\2\162\1\145\2\uffff\1\145\1"+
        "\164\1\152\1\172\1\144\1\165\1\157\3\uffff\1\56\1\uffff\1\141\1"+
        "\162\1\154\1\uffff\2\uffff\1\155\1\162\1\151\1\163\1\165\1\164\1"+
        "\144\1\155\1\164\1\171\3\uffff\1\162\6\uffff\1\uffff\2\uffff\1\164"+
        "\1\143\1\145\1\164\1\141\1\172\1\165\1\154\1\163\1\156\1\145\2\163"+
        "\1\145\1\160\1\163\1\141\1\154\1\164\1\156\1\164\1\151\1\150\2\145"+
        "\2\157\1\145\1\151\1\172\1\164\1\163\1\146\1\162\1\147\1\145\1\uffff"+
        "\1\172\1\163\1\145\1\165\1\164\2\uffff\1\164\1\137\1\163\1\uffff"+
        "\1\142\1\162\1\144\1\165\1\145\1\151\1\172\1\145\1\172\1\167\1\172"+
        "\2\uffff\1\151\2\162\1\141\1\155\1\uffff\1\162\1\141\2\164\1\143"+
        "\1\163\1\164\1\156\1\141\1\157\1\164\1\141\1\164\1\163\1\145\1\141"+
        "\1\151\1\156\1\137\1\170\1\162\1\155\1\154\2\162\1\170\1\157\1\172"+
        "\2\151\1\171\1\157\1\143\1\uffff\1\145\1\146\1\151\1\172\1\165\1"+
        "\172\3\145\1\172\1\154\1\172\1\157\1\uffff\1\154\1\uffff\1\157\1"+
        "\uffff\1\157\1\151\1\162\1\172\1\151\1\145\1\156\1\163\1\172\1\164"+
        "\1\172\1\145\1\164\2\156\1\162\1\164\1\157\1\172\1\155\1\162\1\143"+
        "\1\147\1\172\3\151\1\166\1\151\1\146\1\172\1\154\1\uffff\1\163\1"+
        "\170\1\172\1\151\1\164\1\144\1\151\1\162\1\uffff\1\162\1\154\1\172"+
        "\1\162\1\156\1\uffff\1\164\1\uffff\1\156\1\145\1\162\1\156\1\160"+
        "\1\145\1\uffff\1\143\1\172\1\141\2\172\1\uffff\1\151\1\172\1\uffff"+
        "\1\162\1\172\1\144\1\145\1\141\1\145\1\157\1\162\1\163\1\uffff\1"+
        "\137\1\151\2\137\1\150\1\156\1\164\1\156\1\145\2\141\1\uffff\1\144"+
        "\1\164\1\172\1\uffff\1\156\2\172\1\156\2\145\1\154\1\uffff\1\137"+
        "\1\164\2\172\1\163\1\144\1\141\1\164\1\144\1\137\1\uffff\1\164\1"+
        "\uffff\1\150\1\166\1\150\1\172\1\uffff\1\172\1\156\1\151\2\156\3"+
        "\172\1\157\2\172\1\141\1\147\1\172\1\147\1\163\1\156\1\143\1\163"+
        "\1\145\1\uffff\1\147\1\172\2\uffff\1\145\5\172\2\uffff\1\163\1\137"+
        "\1\162\1\151\2\172\1\151\1\141\1\145\1\141\1\172\2\uffff\1\164\1"+
        "\156\1\141\1\137\2\uffff\1\150\1\172\1\151\1\141\1\164\1\172\1\uffff"+
        "\2\172\1\164\1\145\1\172\1\156\1\172\1\162\1\164\1\144\3\uffff\1"+
        "\146\1\uffff\2\172\1\171\1\157\1\uffff\1\151\1\157\1\162\1\172\1"+
        "\162\1\150\1\172\2\164\1\172\1\141\1\172\1\uffff\1\141\1\162\1\172"+
        "\3\uffff\1\172\1\144\1\uffff\1\164\1\uffff\1\157\1\141\2\172\1\uffff"+
        "\1\162\1\172\1\156\1\141\1\156\1\164\1\uffff\1\164\1\141\1\uffff"+
        "\1\172\1\157\1\150\1\162\1\150\1\147\1\153\2\uffff\2\172\1\165\1"+
        "\143\2\uffff\1\145\1\uffff\1\172\1\147\3\172\1\162\1\uffff\1\162"+
        "\1\141\1\164\1\141\1\162\1\163\2\uffff\1\160\1\153\1\146\1\uffff"+
        "\1\162\3\uffff\1\164\1\172\1\162\1\172\1\162\1\141\3\172\1\151\1"+
        "\141\1\172\1\uffff\1\164\1\uffff\1\164\1\155\3\uffff\1\170\1\155"+
        "\1\uffff\5\172\5\uffff";
    static final String DFA16_acceptS =
        "\7\uffff\1\12\1\uffff\1\14\1\uffff\1\23\1\24\2\uffff\1\47\1\50\1"+
        "\uffff\1\53\1\54\2\uffff\1\65\12\uffff\1\117\2\uffff\1\133\1\uffff"+
        "\1\135\1\uffff\1\141\1\uffff\1\151\1\152\24\uffff\1\56\1\13\7\uffff"+
        "\1\52\1\146\1\120\1\uffff\1\57\4\uffff\1\142\1\67\12\uffff\1\116"+
        "\1\131\1\127\1\uffff\1\132\1\130\1\134\1\137\1\136\1\140\1\uffff"+
        "\1\147\1\150\44\uffff\1\122\5\uffff\1\55\1\76\3\uffff\1\143\13\uffff"+
        "\1\144\1\145\5\uffff\1\2\41\uffff\1\125\15\uffff\1\121\1\uffff\1"+
        "\126\1\uffff\1\123\40\uffff\1\10\10\uffff\1\42\5\uffff\1\100\1\uffff"+
        "\1\102\6\uffff\1\124\5\uffff\1\30\2\uffff\1\3\11\uffff\1\112\13"+
        "\uffff\1\70\3\uffff\1\20\7\uffff\1\103\12\uffff\1\64\1\uffff\1\72"+
        "\4\uffff\1\51\24\uffff\1\66\2\uffff\1\111\1\41\6\uffff\1\101\1\105"+
        "\13\uffff\1\4\1\21\4\uffff\1\35\1\36\6\uffff\1\17\12\uffff\1\63"+
        "\1\61\1\71\1\uffff\1\77\4\uffff\1\43\14\uffff\1\33\3\uffff\1\7\1"+
        "\26\1\31\2\uffff\1\74\1\uffff\1\27\4\uffff\1\106\6\uffff\1\44\2"+
        "\uffff\1\40\7\uffff\1\73\1\60\4\uffff\1\62\1\75\1\uffff\1\1\6\uffff"+
        "\1\22\6\uffff\1\46\1\45\3\uffff\1\11\1\uffff\1\6\1\25\1\16\14\uffff"+
        "\1\114\1\uffff\1\5\2\uffff\1\113\1\107\1\110\2\uffff\1\15\5\uffff"+
        "\1\34\1\32\1\37\1\115\1\104";
    static final String DFA16_specialS =
        "\27\uffff\1\1\17\uffff\1\3\51\uffff\1\0\26\uffff\1\2\u01ae\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\27\4\uffff\1\50\1"+
            "\13\1\14\1\46\1\41\1\11\1\21\1\24\1\45\12\51\1\10\1\7\1\40\1"+
            "\44\1\43\2\uffff\2\52\1\31\16\52\1\33\3\52\1\32\4\52\1\22\1"+
            "\47\1\23\1\26\2\uffff\1\35\1\52\1\3\1\1\1\2\1\25\2\52\1\5\1"+
            "\52\1\37\1\52\1\30\1\36\1\15\1\6\1\12\1\16\1\4\1\34\3\52\1\42"+
            "\2\52\1\17\1\uffff\1\20",
            "\1\55\3\uffff\1\54\17\uffff\1\56",
            "\1\62\7\uffff\1\57\7\uffff\1\61\1\uffff\1\60",
            "\1\66\12\uffff\1\63\2\uffff\1\64\2\uffff\1\65",
            "\1\70\20\uffff\1\71\1\72\3\uffff\1\67",
            "\1\73\5\uffff\1\74",
            "\1\75\3\uffff\1\76\14\uffff\1\77",
            "",
            "\1\100",
            "",
            "\1\102",
            "",
            "",
            "\1\104\11\uffff\1\106\5\uffff\1\105\2\uffff\1\103",
            "\1\107\11\uffff\1\110",
            "",
            "",
            "\1\112\20\uffff\1\111",
            "",
            "",
            "\1\114",
            "\1\120\3\uffff\1\116\11\uffff\1\117",
            "",
            "\12\121\1\uffff\2\121\1\uffff\24\121\1\122\71\121\1\uffff\uffa3"+
            "\121",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\12\uffff\1\132",
            "\1\133\15\uffff\1\134",
            "\1\135",
            "\1\136\17\uffff\1\137",
            "",
            "\1\141",
            "\1\142",
            "",
            "\1\145\15\uffff\1\144",
            "",
            "\42\150\1\uffff\71\150\1\147\uffa3\150",
            "",
            "\1\152\1\uffff\12\51",
            "",
            "",
            "\1\153",
            "\1\155\5\uffff\1\156\6\uffff\1\154",
            "\1\157",
            "\1\160\16\uffff\1\161",
            "\1\163\6\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166\7\uffff\1\170\13\uffff\1\167",
            "\1\171\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\20\uffff\1\u0080",
            "\1\u0081",
            "\1\u0084\1\u0082\1\uffff\1\u0087\1\uffff\1\u0083\13\uffff\1"+
            "\u0086\1\uffff\1\u0085",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0090",
            "\1\u0092\14\uffff\1\u0093\3\uffff\1\u0091",
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\121\1\uffff\2\121\1\uffff\24\121\1\122\71\121\1\u009a\uffa3"+
            "\121",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\150\1\u00a7\71\150\1\u00a6\uffa3\150",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\2\uffff\1\u00b7",
            "\1\u00b9\17\uffff\1\u00b8",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c5\15\uffff\1\u00c4",
            "\1\u00c6",
            "\1\u00c7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\u00c8\22\52",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00de",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u010d\31\52",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0112",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0114",
            "",
            "\1\u0115",
            "",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\52\7\uffff\32\52\4\uffff\1\u011f\1\uffff\32\52",
            "\1\u0121",
            "\12\52\7\uffff\32\52\4\uffff\1\u0122\1\uffff\32\52",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012c\3\uffff\1\u012a\5\uffff\1\u012b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0132\6\52",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0151",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u0153\27\52",
            "",
            "\1\u0154",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u0155\27\52",
            "",
            "\1\u0156",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u016d",
            "\12\52\7\uffff\32\52\4\uffff\1\u016e\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\52\7\uffff\32\52\4\uffff\1\u0183\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u018c\27\52",
            "\1\u018d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u018e\26\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u018f\15\52",
            "\1\u0190",
            "\1\u0191",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u019a\13\52"+
            "\1\u019b\7\52",
            "",
            "",
            "\1\u019c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u01a0\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u01a7\26\52",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u01ac\27\52",
            "",
            "",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "",
            "\1\u01b1",
            "\12\52\7\uffff\32\52\4\uffff\1\u01b2\1\uffff\32\52",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ba",
            "\1\u01bb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "",
            "",
            "\1\u01c2",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\u01c4\12\52",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01cb",
            "\1\u01cc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ce",
            "\1\u01cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u01d0\27\52",
            "\1\u01d1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u01d2\27\52",
            "",
            "\1\u01d3",
            "\1\u01d4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01dd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "",
            "\1\u01f0",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "\1\u0200",
            "",
            "",
            "",
            "\1\u0201",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0203",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0205",
            "\1\u0206",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u020a",
            "\1\u020b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u020d",
            "",
            "\1\u020e",
            "\1\u020f",
            "",
            "",
            "",
            "\1\u0210",
            "\1\u0211",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | CHARACTER_CONSTANT | MANIFEST_STRING | MANIFEST_TEXTBLOCK_START | MANIFEST_TEXTBLOCK_MIDDLE | MANIFEST_TEXTBLOCK_END | COMMENT | INTEGER | REAL | IDENTIFIER | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_81 = input.LA(1);

                        s = -1;
                        if ( (LA16_81=='\\') ) {s = 154;}

                        else if ( ((LA16_81>='\u0000' && LA16_81<='\t')||(LA16_81>='\u000B' && LA16_81<='\f')||(LA16_81>='\u000E' && LA16_81<='!')||(LA16_81>='#' && LA16_81<='[')||(LA16_81>=']' && LA16_81<='\uFFFF')) ) {s = 81;}

                        else if ( (LA16_81=='\"') ) {s = 82;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\t')||(LA16_23>='\u000B' && LA16_23<='\f')||(LA16_23>='\u000E' && LA16_23<='!')||(LA16_23>='#' && LA16_23<='[')||(LA16_23>=']' && LA16_23<='\uFFFF')) ) {s = 81;}

                        else if ( (LA16_23=='\"') ) {s = 82;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_104 = input.LA(1);

                        s = -1;
                        if ( (LA16_104=='\\') ) {s = 166;}

                        else if ( ((LA16_104>='\u0000' && LA16_104<='!')||(LA16_104>='#' && LA16_104<='[')||(LA16_104>=']' && LA16_104<='\uFFFF')) ) {s = 104;}

                        else if ( (LA16_104=='\"') ) {s = 167;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_39 = input.LA(1);

                        s = -1;
                        if ( (LA16_39=='\\') ) {s = 103;}

                        else if ( ((LA16_39>='\u0000' && LA16_39<='!')||(LA16_39>='#' && LA16_39<='[')||(LA16_39>=']' && LA16_39<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}