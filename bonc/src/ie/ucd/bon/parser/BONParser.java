// $ANTLR 3.1.3 Apr 15, 2009 15:48:38 BON.g 2009-11-14 13:03:02

  package ie.ucd.bon.parser; 
  
  import ie.ucd.bon.parser.errors.MissingElementParseError;
  import ie.ucd.bon.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
public class BONParser extends AbstractBONParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MANIFEST_STRING", "IDENTIFIER", "COMMENT", "INTEGER", "CHARACTER_CONSTANT", "REAL", "NEWLINE", "MANIFEST_TEXTBLOCK_START", "MANIFEST_TEXTBLOCK_MIDDLE", "MANIFEST_TEXTBLOCK_END", "LINE_COMMENT", "COMMENT_START", "DIGIT", "ALPHA", "ALPHANUMERIC_OR_UNDERSCORE", "ALPHANUMERIC", "UNDERSCORE", "LOWER", "UPPER", "WHITESPACE", "'dictionary'", "'end'", "'class'", "'cluster'", "'system_chart'", "'explanation'", "'indexing'", "'part'", "'description'", "';'", "':'", "','", "'cluster_chart'", "'class_chart'", "'inherit'", "'query'", "'command'", "'constraint'", "'('", "')'", "'event_chart'", "'incoming'", "'outgoing'", "'event'", "'involves'", "'scenario_chart'", "'scenario'", "'creation_chart'", "'creator'", "'creates'", "'static_diagram'", "'component'", "'reused'", "'root'", "'deferred'", "'effective'", "'persistent'", "'interfaced'", "'{'", "'}'", "'client'", "'->'", "'['", "']'", "'...'", "':{'", "'.'", "'invariant'", "'feature'", "'redefined'", "'require'", "'ensure'", "'^'", "'<-'", "'prefix'", "'\"'", "'infix'", "'for_all'", "'exists'", "'such_that'", "'it_holds'", "'member_of'", "'..'", "'Current'", "'Void'", "'Result'", "'true'", "'false'", "'dynamic_diagram'", "'action'", "'nameless'", "'object_group'", "'object_stack'", "'object'", "'calls'", "'string_marks'", "'concatenator'", "'keyword_prefix'", "'<->'", "'+'", "'-'", "'and'", "'or'", "'xor'", "'delta'", "'old'", "'not'", "'<'", "'>'", "'<='", "'>='", "'='", "'/='", "'*'", "'/'", "'//'", "'\\\\\\\\'"
    };
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
    public static final int ALPHA=17;
    public static final int T__88=88;
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
    public static final int T__120=120;
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
    public static final int INTEGER=7;
    public static final int T__42=42;
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
    public static final int MANIFEST_STRING=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int NEWLINE=10;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int MANIFEST_TEXTBLOCK_MIDDLE=12;

    // delegates
    // delegators


        public BONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return BONParser.tokenNames; }
    public String getGrammarFileName() { return "BON.g"; }


    //Currently nothing, everything in BONAbstractParser	



    // $ANTLR start "prog"
    // BON.g:31:1: prog returns [BonSourceFile bonSource] : (bs= bon_specification EOF | i= indexing bs= bon_specification EOF | e= EOF | indexing e= EOF );
    public final BonSourceFile prog() throws RecognitionException {
        BonSourceFile bonSource = null;

        Token e=null;
        BONParser.bon_specification_return bs = null;

        BONParser.indexing_return i = null;


        try {
            // BON.g:37:40: (bs= bon_specification EOF | i= indexing bs= bon_specification EOF | e= EOF | indexing e= EOF )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // BON.g:38:10: bs= bon_specification EOF
                    {
                    pushFollow(FOLLOW_bon_specification_in_prog70);
                    bs=bon_specification();

                    state._fsp--;
                    if (state.failed) return bonSource;
                    match(input,EOF,FOLLOW_EOF_in_prog72); if (state.failed) return bonSource;
                    if ( state.backtracking==0 ) {
                       bonSource = BonSourceFile.mk((bs!=null?bs.spec_els:null), null, getSLoc((bs!=null?((Token)bs.start):null), (bs!=null?((Token)bs.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:41:10: i= indexing bs= bon_specification EOF
                    {
                    pushFollow(FOLLOW_indexing_in_prog105);
                    i=indexing();

                    state._fsp--;
                    if (state.failed) return bonSource;
                    pushFollow(FOLLOW_bon_specification_in_prog109);
                    bs=bon_specification();

                    state._fsp--;
                    if (state.failed) return bonSource;
                    match(input,EOF,FOLLOW_EOF_in_prog111); if (state.failed) return bonSource;
                    if ( state.backtracking==0 ) {
                       bonSource = BonSourceFile.mk((bs!=null?bs.spec_els:null), (i!=null?i.indexing:null), getSLoc((i!=null?((Token)i.start):null), (bs!=null?((Token)bs.stop):null))); 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:44:10: e= EOF
                    {
                    e=(Token)match(input,EOF,FOLLOW_EOF_in_prog144); if (state.failed) return bonSource;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(e), "at least one specification entry", "in source file", true)); 
                    }
                    if ( state.backtracking==0 ) {
                       bonSource = BonSourceFile.mk(Constants.NO_SPEC_ELEMS, null, getSLoc(e)); 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:48:10: indexing e= EOF
                    {
                    pushFollow(FOLLOW_indexing_in_prog188);
                    indexing();

                    state._fsp--;
                    if (state.failed) return bonSource;
                    e=(Token)match(input,EOF,FOLLOW_EOF_in_prog192); if (state.failed) return bonSource;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(e), "at least one specification entry", "in source file", true)); 
                    }
                    if ( state.backtracking==0 ) {
                       bonSource = BonSourceFile.mk(Constants.NO_SPEC_ELEMS, (i!=null?i.indexing:null), getSLoc((i!=null?((Token)i.start):null),(i!=null?((Token)i.stop):null))); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return bonSource;
    }
    // $ANTLR end "prog"

    public static class bon_specification_return extends ParserRuleReturnScope {
        public List<SpecificationElement> spec_els;
    };

    // $ANTLR start "bon_specification"
    // BON.g:53:1: bon_specification returns [List<SpecificationElement> spec_els] : (se= specification_element )+ ;
    public final BONParser.bon_specification_return bon_specification() throws RecognitionException {
        BONParser.bon_specification_return retval = new BONParser.bon_specification_return();
        retval.start = input.LT(1);

        SpecificationElement se = null;


        try {
            // BON.g:57:65: ( (se= specification_element )+ )
            // BON.g:58:3: (se= specification_element )+
            {
            if ( state.backtracking==0 ) {
               retval.spec_els = createList(); 
            }
            // BON.g:59:3: (se= specification_element )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||LA2_0==28||(LA2_0>=36 && LA2_0<=37)||LA2_0==44||LA2_0==49||LA2_0==51||LA2_0==54||LA2_0==92) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // BON.g:59:5: se= specification_element
            	    {
            	    pushFollow(FOLLOW_specification_element_in_bon_specification241);
            	    se=specification_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.spec_els.add(se); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bon_specification"


    // $ANTLR start "specification_element"
    // BON.g:64:1: specification_element returns [SpecificationElement se] : (ic= informal_chart | cd= class_dictionary | sd= static_diagram | dd= dynamic_diagram );
    public final SpecificationElement specification_element() throws RecognitionException {
        SpecificationElement se = null;

        InformalChart ic = null;

        ClassDictionary cd = null;

        StaticDiagram sd = null;

        DynamicDiagram dd = null;


        try {
            // BON.g:64:57: (ic= informal_chart | cd= class_dictionary | sd= static_diagram | dd= dynamic_diagram )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
            case 36:
            case 37:
            case 44:
            case 49:
            case 51:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 54:
                {
                alt3=3;
                }
                break;
            case 92:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return se;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // BON.g:65:5: ic= informal_chart
                    {
                    pushFollow(FOLLOW_informal_chart_in_specification_element272);
                    ic=informal_chart();

                    state._fsp--;
                    if (state.failed) return se;
                    if ( state.backtracking==0 ) {
                       se = ic; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:67:5: cd= class_dictionary
                    {
                    pushFollow(FOLLOW_class_dictionary_in_specification_element286);
                    cd=class_dictionary();

                    state._fsp--;
                    if (state.failed) return se;
                    if ( state.backtracking==0 ) {
                       se = cd; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:69:5: sd= static_diagram
                    {
                    pushFollow(FOLLOW_static_diagram_in_specification_element300);
                    sd=static_diagram();

                    state._fsp--;
                    if (state.failed) return se;
                    if ( state.backtracking==0 ) {
                       se = sd; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:71:5: dd= dynamic_diagram
                    {
                    pushFollow(FOLLOW_dynamic_diagram_in_specification_element314);
                    dd=dynamic_diagram();

                    state._fsp--;
                    if (state.failed) return se;
                    if ( state.backtracking==0 ) {
                       se = dd; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return se;
    }
    // $ANTLR end "specification_element"


    // $ANTLR start "informal_chart"
    // BON.g:77:1: informal_chart returns [InformalChart ic] : ( system_chart | cluster_chart | class_chart | event_chart | scenario_chart | creation_chart );
    public final InformalChart informal_chart() throws RecognitionException {
        InformalChart ic = null;

        ClusterChart system_chart1 = null;

        ClusterChart cluster_chart2 = null;

        ClassChart class_chart3 = null;

        EventChart event_chart4 = null;

        ScenarioChart scenario_chart5 = null;

        BONParser.creation_chart_return creation_chart6 = null;


        try {
            // BON.g:81:43: ( system_chart | cluster_chart | class_chart | event_chart | scenario_chart | creation_chart )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 44:
                {
                alt4=4;
                }
                break;
            case 49:
                {
                alt4=5;
                }
                break;
            case 51:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ic;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // BON.g:82:5: system_chart
                    {
                    pushFollow(FOLLOW_system_chart_in_informal_chart342);
                    system_chart1=system_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = system_chart1; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:84:5: cluster_chart
                    {
                    pushFollow(FOLLOW_cluster_chart_in_informal_chart354);
                    cluster_chart2=cluster_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = cluster_chart2; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:86:5: class_chart
                    {
                    pushFollow(FOLLOW_class_chart_in_informal_chart366);
                    class_chart3=class_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = class_chart3; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:88:5: event_chart
                    {
                    pushFollow(FOLLOW_event_chart_in_informal_chart378);
                    event_chart4=event_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = event_chart4; 
                    }

                    }
                    break;
                case 5 :
                    // BON.g:90:5: scenario_chart
                    {
                    pushFollow(FOLLOW_scenario_chart_in_informal_chart390);
                    scenario_chart5=scenario_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = scenario_chart5; 
                    }

                    }
                    break;
                case 6 :
                    // BON.g:92:5: creation_chart
                    {
                    pushFollow(FOLLOW_creation_chart_in_informal_chart402);
                    creation_chart6=creation_chart();

                    state._fsp--;
                    if (state.failed) return ic;
                    if ( state.backtracking==0 ) {
                       ic = (creation_chart6!=null?creation_chart6.cc:null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ic;
    }
    // $ANTLR end "informal_chart"


    // $ANTLR start "class_dictionary"
    // BON.g:96:1: class_dictionary returns [ClassDictionary cd] : d= 'dictionary' system_name ( indexing )? ( explanation )? ( part )? (de= dictionary_entry )+ e= 'end' ;
    public final ClassDictionary class_dictionary() throws RecognitionException {
        ClassDictionary cd = null;

        Token d=null;
        Token e=null;
        DictionaryEntry de = null;

        BONParser.indexing_return indexing7 = null;

        String explanation8 = null;

        String part9 = null;

        String system_name10 = null;


         Indexing index = null; String expl = null; String p = null; 
                List<DictionaryEntry> entries = createList(); 
        try {
            // BON.g:99:1: (d= 'dictionary' system_name ( indexing )? ( explanation )? ( part )? (de= dictionary_entry )+ e= 'end' )
            // BON.g:100:3: d= 'dictionary' system_name ( indexing )? ( explanation )? ( part )? (de= dictionary_entry )+ e= 'end'
            {
            d=(Token)match(input,24,FOLLOW_24_in_class_dictionary437); if (state.failed) return cd;
            pushFollow(FOLLOW_system_name_in_class_dictionary442);
            system_name10=system_name();

            state._fsp--;
            if (state.failed) return cd;
            // BON.g:102:3: ( indexing )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // BON.g:102:4: indexing
                    {
                    pushFollow(FOLLOW_indexing_in_class_dictionary448);
                    indexing7=indexing();

                    state._fsp--;
                    if (state.failed) return cd;
                    if ( state.backtracking==0 ) {
                       index = (indexing7!=null?indexing7.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:103:3: ( explanation )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // BON.g:103:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_class_dictionary458);
                    explanation8=explanation();

                    state._fsp--;
                    if (state.failed) return cd;
                    if ( state.backtracking==0 ) {
                       expl = explanation8; 
                    }

                    }
                    break;

            }

            // BON.g:104:3: ( part )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // BON.g:104:4: part
                    {
                    pushFollow(FOLLOW_part_in_class_dictionary469);
                    part9=part();

                    state._fsp--;
                    if (state.failed) return cd;
                    if ( state.backtracking==0 ) {
                       p = part9; 
                    }

                    }
                    break;

            }

            // BON.g:105:3: (de= dictionary_entry )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // BON.g:105:4: de= dictionary_entry
            	    {
            	    pushFollow(FOLLOW_dictionary_entry_in_class_dictionary482);
            	    de=dictionary_entry();

            	    state._fsp--;
            	    if (state.failed) return cd;
            	    if ( state.backtracking==0 ) {
            	       entries.add(de); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return cd;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            e=(Token)match(input,25,FOLLOW_25_in_class_dictionary499); if (state.failed) return cd;
            if ( state.backtracking==0 ) {
               cd = ClassDictionary.mk(system_name10, entries, index, expl, p, getSLoc(d,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cd;
    }
    // $ANTLR end "class_dictionary"


    // $ANTLR start "dictionary_entry"
    // BON.g:112:1: dictionary_entry returns [DictionaryEntry entry] : c= 'class' class_name 'cluster' cluster_name_list description ;
    public final DictionaryEntry dictionary_entry() throws RecognitionException {
        DictionaryEntry entry = null;

        Token c=null;
        BONParser.class_name_return class_name11 = null;

        List<String> cluster_name_list12 = null;

        BONParser.description_return description13 = null;


        try {
            // BON.g:112:50: (c= 'class' class_name 'cluster' cluster_name_list description )
            // BON.g:113:3: c= 'class' class_name 'cluster' cluster_name_list description
            {
            c=(Token)match(input,26,FOLLOW_26_in_dictionary_entry525); if (state.failed) return entry;
            pushFollow(FOLLOW_class_name_in_dictionary_entry527);
            class_name11=class_name();

            state._fsp--;
            if (state.failed) return entry;
            match(input,27,FOLLOW_27_in_dictionary_entry532); if (state.failed) return entry;
            pushFollow(FOLLOW_cluster_name_list_in_dictionary_entry534);
            cluster_name_list12=cluster_name_list();

            state._fsp--;
            if (state.failed) return entry;
            pushFollow(FOLLOW_description_in_dictionary_entry539);
            description13=description();

            state._fsp--;
            if (state.failed) return entry;
            if ( state.backtracking==0 ) {
               entry = DictionaryEntry.mk((class_name11!=null?input.toString(class_name11.start,class_name11.stop):null), cluster_name_list12, (description13!=null?input.toString(description13.start,description13.stop):null), getSLoc(c, (description13!=null?((Token)description13.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entry;
    }
    // $ANTLR end "dictionary_entry"


    // $ANTLR start "system_chart"
    // BON.g:119:1: system_chart returns [ClusterChart sc] : s= 'system_chart' system_name ( indexing )? ( explanation )? ( part )? (ce= cluster_entries | ) e= 'end' ;
    public final ClusterChart system_chart() throws RecognitionException {
        ClusterChart sc = null;

        Token s=null;
        Token e=null;
        List<ClusterEntry> ce = null;

        BONParser.indexing_return indexing14 = null;

        String explanation15 = null;

        String part16 = null;

        String system_name17 = null;


         Indexing index = null; String expl = null; String p = null; 
                List<ClusterEntry> entries = null; 
        try {
            // BON.g:124:1: (s= 'system_chart' system_name ( indexing )? ( explanation )? ( part )? (ce= cluster_entries | ) e= 'end' )
            // BON.g:125:3: s= 'system_chart' system_name ( indexing )? ( explanation )? ( part )? (ce= cluster_entries | ) e= 'end'
            {
            s=(Token)match(input,28,FOLLOW_28_in_system_chart570); if (state.failed) return sc;
            pushFollow(FOLLOW_system_name_in_system_chart575);
            system_name17=system_name();

            state._fsp--;
            if (state.failed) return sc;
            // BON.g:127:3: ( indexing )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // BON.g:127:4: indexing
                    {
                    pushFollow(FOLLOW_indexing_in_system_chart581);
                    indexing14=indexing();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       index = (indexing14!=null?indexing14.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:128:3: ( explanation )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // BON.g:128:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_system_chart591);
                    explanation15=explanation();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       expl = explanation15; 
                    }

                    }
                    break;

            }

            // BON.g:129:3: ( part )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // BON.g:129:4: part
                    {
                    pushFollow(FOLLOW_part_in_system_chart602);
                    part16=part();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       p = part16; 
                    }

                    }
                    break;

            }

            // BON.g:130:3: (ce= cluster_entries | )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return sc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // BON.g:130:6: ce= cluster_entries
                    {
                    pushFollow(FOLLOW_cluster_entries_in_system_chart617);
                    ce=cluster_entries();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       entries = ce; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:132:6: 
                    {
                    if ( state.backtracking==0 ) {
                       entries = emptyList(); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_system_chart644); if (state.failed) return sc;
            if ( state.backtracking==0 ) {
               sc = ClusterChart.mk(system_name17, true, Constants.NO_CLASS_ENTRIES, entries, index, expl, p, getSLoc(s,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sc;
    }
    // $ANTLR end "system_chart"


    // $ANTLR start "explanation"
    // BON.g:138:1: explanation returns [String explanation] : (e= 'explanation' m= manifest_textblock | e= 'explanation' );
    public final String explanation() throws RecognitionException {
        String explanation = null;

        Token e=null;
        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:138:42: (e= 'explanation' m= manifest_textblock | e= 'explanation' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==MANIFEST_STRING||LA13_1==MANIFEST_TEXTBLOCK_START) ) {
                    alt13=1;
                }
                else if ( ((LA13_1>=25 && LA13_1<=27)||LA13_1==31||(LA13_1>=38 && LA13_1<=41)||LA13_1==47||LA13_1==50||LA13_1==52) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return explanation;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return explanation;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // BON.g:139:3: e= 'explanation' m= manifest_textblock
                    {
                    e=(Token)match(input,29,FOLLOW_29_in_explanation665); if (state.failed) return explanation;
                    pushFollow(FOLLOW_manifest_textblock_in_explanation669);
                    m=manifest_textblock();

                    state._fsp--;
                    if (state.failed) return explanation;
                    if ( state.backtracking==0 ) {
                       explanation = (m!=null?input.toString(m.start,m.stop):null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:142:3: e= 'explanation'
                    {
                    e=(Token)match(input,29,FOLLOW_29_in_explanation682); if (state.failed) return explanation;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(e), "explanation text", "after 'explanation'", false)); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return explanation;
    }
    // $ANTLR end "explanation"

    public static class indexing_return extends ParserRuleReturnScope {
        public Indexing indexing;
    };

    // $ANTLR start "indexing"
    // BON.g:146:1: indexing returns [Indexing indexing] : (i= 'indexing' index_list | i= 'indexing' );
    public final BONParser.indexing_return indexing() throws RecognitionException {
        BONParser.indexing_return retval = new BONParser.indexing_return();
        retval.start = input.LT(1);

        Token i=null;
        BONParser.index_list_return index_list18 = null;


        try {
            // BON.g:146:38: (i= 'indexing' index_list | i= 'indexing' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==IDENTIFIER) ) {
                    alt14=1;
                }
                else if ( (LA14_1==EOF||(LA14_1>=24 && LA14_1<=29)||LA14_1==31||(LA14_1>=36 && LA14_1<=41)||LA14_1==44||LA14_1==47||(LA14_1>=49 && LA14_1<=52)||LA14_1==54||(LA14_1>=71 && LA14_1<=72)||LA14_1==92) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // BON.g:147:4: i= 'indexing' index_list
                    {
                    i=(Token)match(input,30,FOLLOW_30_in_indexing707); if (state.failed) return retval;
                    pushFollow(FOLLOW_index_list_in_indexing709);
                    index_list18=index_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.indexing = Indexing.mk((index_list18!=null?index_list18.list:null), getSLoc(i,(index_list18!=null?((Token)index_list18.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:150:4: i= 'indexing'
                    {
                    i=(Token)match(input,30,FOLLOW_30_in_indexing725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(i), "indexing entries", "after 'indexing'", false)); 
                    }
                    if ( state.backtracking==0 ) {
                       retval.indexing = Indexing.mk(Constants.NO_INDEX_CLAUSES, getSLoc(i)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexing"


    // $ANTLR start "part"
    // BON.g:155:1: part returns [String part] : (p= 'part' m= MANIFEST_STRING | p= 'part' );
    public final String part() throws RecognitionException {
        String part = null;

        Token p=null;
        Token m=null;

        try {
            // BON.g:155:28: (p= 'part' m= MANIFEST_STRING | p= 'part' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==MANIFEST_STRING) ) {
                    alt15=1;
                }
                else if ( ((LA15_1>=25 && LA15_1<=27)||(LA15_1>=38 && LA15_1<=41)||LA15_1==47||LA15_1==50||LA15_1==52) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return part;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return part;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // BON.g:156:5: p= 'part' m= MANIFEST_STRING
                    {
                    p=(Token)match(input,31,FOLLOW_31_in_part755); if (state.failed) return part;
                    m=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_part759); if (state.failed) return part;
                    if ( state.backtracking==0 ) {
                       part = (m!=null?m.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:159:5: p= 'part'
                    {
                    p=(Token)match(input,31,FOLLOW_31_in_part777); if (state.failed) return part;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(p), "part text", "after 'part'", false)); 
                    }
                    if ( state.backtracking==0 ) {
                       part = ""; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return part;
    }
    // $ANTLR end "part"

    public static class description_return extends ParserRuleReturnScope {
        public String description;
    };

    // $ANTLR start "description"
    // BON.g:164:1: description returns [String description] : d= 'description' m= manifest_textblock ;
    public final BONParser.description_return description() throws RecognitionException {
        BONParser.description_return retval = new BONParser.description_return();
        retval.start = input.LT(1);

        Token d=null;
        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:164:42: (d= 'description' m= manifest_textblock )
            // BON.g:165:3: d= 'description' m= manifest_textblock
            {
            d=(Token)match(input,32,FOLLOW_32_in_description807); if (state.failed) return retval;
            pushFollow(FOLLOW_manifest_textblock_in_description811);
            m=manifest_textblock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.description = (m!=null?input.toString(m.start,m.stop):null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "description"


    // $ANTLR start "cluster_entries"
    // BON.g:169:1: cluster_entries returns [List<ClusterEntry> entries] : ( cluster_entry )+ ;
    public final List<ClusterEntry> cluster_entries() throws RecognitionException {
        List<ClusterEntry> entries = null;

        ClusterEntry cluster_entry19 = null;


        try {
            // BON.g:169:54: ( ( cluster_entry )+ )
            // BON.g:170:3: ( cluster_entry )+
            {
            if ( state.backtracking==0 ) {
               entries = createList(); 
            }
            // BON.g:171:3: ( cluster_entry )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // BON.g:171:4: cluster_entry
            	    {
            	    pushFollow(FOLLOW_cluster_entry_in_cluster_entries836);
            	    cluster_entry19=cluster_entry();

            	    state._fsp--;
            	    if (state.failed) return entries;
            	    if ( state.backtracking==0 ) {
            	       entries.add(cluster_entry19); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return entries;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entries;
    }
    // $ANTLR end "cluster_entries"


    // $ANTLR start "cluster_entry"
    // BON.g:174:1: cluster_entry returns [ClusterEntry ce] : c= 'cluster' cluster_name description ;
    public final ClusterEntry cluster_entry() throws RecognitionException {
        ClusterEntry ce = null;

        Token c=null;
        BONParser.cluster_name_return cluster_name20 = null;

        BONParser.description_return description21 = null;


        try {
            // BON.g:174:41: (c= 'cluster' cluster_name description )
            // BON.g:175:3: c= 'cluster' cluster_name description
            {
            c=(Token)match(input,27,FOLLOW_27_in_cluster_entry875); if (state.failed) return ce;
            pushFollow(FOLLOW_cluster_name_in_cluster_entry877);
            cluster_name20=cluster_name();

            state._fsp--;
            if (state.failed) return ce;
            pushFollow(FOLLOW_description_in_cluster_entry879);
            description21=description();

            state._fsp--;
            if (state.failed) return ce;
            if ( state.backtracking==0 ) {
               ce = ClusterEntry.mk((cluster_name20!=null?input.toString(cluster_name20.start,cluster_name20.stop):null), (description21!=null?description21.description:null), getSLoc(c, (description21!=null?((Token)description21.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ce;
    }
    // $ANTLR end "cluster_entry"


    // $ANTLR start "system_name"
    // BON.g:179:1: system_name returns [String name] : i= IDENTIFIER ;
    public final String system_name() throws RecognitionException {
        String name = null;

        Token i=null;

        try {
            // BON.g:179:35: (i= IDENTIFIER )
            // BON.g:180:3: i= IDENTIFIER
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_system_name916); if (state.failed) return name;
            if ( state.backtracking==0 ) {
               name = (i!=null?i.getText():null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "system_name"

    public static class index_list_return extends ParserRuleReturnScope {
        public List<IndexClause> list;
    };

    // $ANTLR start "index_list"
    // BON.g:184:1: index_list returns [List<IndexClause> list] : i1= index_clause ( ( ';' i2= index_clause ) | i= index_clause )* ( ';' )? ;
    public final BONParser.index_list_return index_list() throws RecognitionException {
        BONParser.index_list_return retval = new BONParser.index_list_return();
        retval.start = input.LT(1);

        BONParser.index_clause_return i1 = null;

        BONParser.index_clause_return i2 = null;

        BONParser.index_clause_return i = null;


        try {
            // BON.g:186:45: (i1= index_clause ( ( ';' i2= index_clause ) | i= index_clause )* ( ';' )? )
            // BON.g:187:16: i1= index_clause ( ( ';' i2= index_clause ) | i= index_clause )* ( ';' )?
            {
            if ( state.backtracking==0 ) {
               retval.list = createList(); 
            }
            pushFollow(FOLLOW_index_clause_in_index_list973);
            i1=index_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.list.add((i1!=null?i1.clause:null)); 
            }
            // BON.g:190:16: ( ( ';' i2= index_clause ) | i= index_clause )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==IDENTIFIER) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==IDENTIFIER) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // BON.g:190:19: ( ';' i2= index_clause )
            	    {
            	    // BON.g:190:19: ( ';' i2= index_clause )
            	    // BON.g:190:20: ';' i2= index_clause
            	    {
            	    match(input,33,FOLLOW_33_in_index_list1012); if (state.failed) return retval;
            	    pushFollow(FOLLOW_index_clause_in_index_list1016);
            	    i2=index_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }

            	    if ( state.backtracking==0 ) {
            	       retval.list.add((i2!=null?i2.clause:null)); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // BON.g:192:19: i= index_clause
            	    {
            	    pushFollow(FOLLOW_index_clause_in_index_list1059);
            	    i=index_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       addParseProblem(new MissingElementParseError(getSourceLocation((i!=null?((Token)i.start):null)), "semi-colon", "before additional index clause", false)); 
            	    }
            	    if ( state.backtracking==0 ) {
            	       retval.list.add((i!=null?i.clause:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // BON.g:195:16: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // BON.g:195:16: ';'
                    {
                    match(input,33,FOLLOW_33_in_index_list1117); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index_list"

    public static class index_clause_return extends ParserRuleReturnScope {
        public IndexClause clause;
    };

    // $ANTLR start "index_clause"
    // BON.g:198:1: index_clause returns [IndexClause clause] : (i= IDENTIFIER ':' index_term_list | i= IDENTIFIER ':' );
    public final BONParser.index_clause_return index_clause() throws RecognitionException {
        BONParser.index_clause_return retval = new BONParser.index_clause_return();
        retval.start = input.LT(1);

        Token i=null;
        BONParser.index_term_list_return index_term_list22 = null;


        try {
            // BON.g:198:43: (i= IDENTIFIER ':' index_term_list | i= IDENTIFIER ':' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==34) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==EOF||LA19_2==IDENTIFIER||(LA19_2>=24 && LA19_2<=29)||LA19_2==31||LA19_2==33||(LA19_2>=36 && LA19_2<=41)||LA19_2==44||LA19_2==47||(LA19_2>=49 && LA19_2<=52)||LA19_2==54||(LA19_2>=71 && LA19_2<=72)||LA19_2==92) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==MANIFEST_STRING||LA19_2==MANIFEST_TEXTBLOCK_START) ) {
                        alt19=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // BON.g:199:3: i= IDENTIFIER ':' index_term_list
                    {
                    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_index_clause1150); if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_index_clause1152); if (state.failed) return retval;
                    pushFollow(FOLLOW_index_term_list_in_index_clause1154);
                    index_term_list22=index_term_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.clause = IndexClause.mk((i!=null?i.getText():null), (index_term_list22!=null?index_term_list22.strings:null), getSLoc(i, (index_term_list22!=null?((Token)index_term_list22.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:202:3: i= IDENTIFIER ':'
                    {
                    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_index_clause1168); if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_index_clause1170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(i), "index term(s)", "in index clause", true)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index_clause"

    public static class index_term_list_return extends ParserRuleReturnScope {
        public List<String> strings;
    };

    // $ANTLR start "index_term_list"
    // BON.g:206:1: index_term_list returns [List<String> strings] : i1= index_string ( ',' i= index_string )* ;
    public final BONParser.index_term_list_return index_term_list() throws RecognitionException {
        BONParser.index_term_list_return retval = new BONParser.index_term_list_return();
        retval.start = input.LT(1);

        BONParser.index_string_return i1 = null;

        BONParser.index_string_return i = null;


        try {
            // BON.g:206:48: (i1= index_string ( ',' i= index_string )* )
            // BON.g:207:3: i1= index_string ( ',' i= index_string )*
            {
            if ( state.backtracking==0 ) {
               retval.strings = createList(); 
            }
            pushFollow(FOLLOW_index_string_in_index_term_list1212);
            i1=index_string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.strings.add((i1!=null?input.toString(i1.start,i1.stop):null)); 
            }
            // BON.g:210:3: ( ',' i= index_string )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // BON.g:210:4: ',' i= index_string
            	    {
            	    match(input,35,FOLLOW_35_in_index_term_list1222); if (state.failed) return retval;
            	    pushFollow(FOLLOW_index_string_in_index_term_list1226);
            	    i=index_string();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.strings.add((i!=null?input.toString(i.start,i.stop):null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index_term_list"

    public static class index_string_return extends ParserRuleReturnScope {
        public String s;
    };

    // $ANTLR start "index_string"
    // BON.g:215:1: index_string returns [String s] : m= manifest_textblock ;
    public final BONParser.index_string_return index_string() throws RecognitionException {
        BONParser.index_string_return retval = new BONParser.index_string_return();
        retval.start = input.LT(1);

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:215:33: (m= manifest_textblock )
            // BON.g:216:3: m= manifest_textblock
            {
            pushFollow(FOLLOW_manifest_textblock_in_index_string1271);
            m=manifest_textblock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.s = (m!=null?input.toString(m.start,m.stop):null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index_string"


    // $ANTLR start "cluster_chart"
    // BON.g:220:1: cluster_chart returns [ClusterChart cc] : c= 'cluster_chart' cluster_name (i= indexing )? ( explanation )? ( part )? (ce= class_entries | ) (cle= cluster_entries | ) e= 'end' ;
    public final ClusterChart cluster_chart() throws RecognitionException {
        ClusterChart cc = null;

        Token c=null;
        Token e=null;
        BONParser.indexing_return i = null;

        List<ClassEntry> ce = null;

        List<ClusterEntry> cle = null;

        String explanation23 = null;

        String part24 = null;

        BONParser.cluster_name_return cluster_name25 = null;


         List<ClassEntry> classes = null; List<ClusterEntry> clusters = null; 
                Indexing indexing = null; String explanation = null; String part = null;  
        try {
            // BON.g:225:1: (c= 'cluster_chart' cluster_name (i= indexing )? ( explanation )? ( part )? (ce= class_entries | ) (cle= cluster_entries | ) e= 'end' )
            // BON.g:226:3: c= 'cluster_chart' cluster_name (i= indexing )? ( explanation )? ( part )? (ce= class_entries | ) (cle= cluster_entries | ) e= 'end'
            {
            c=(Token)match(input,36,FOLLOW_36_in_cluster_chart1305); if (state.failed) return cc;
            pushFollow(FOLLOW_cluster_name_in_cluster_chart1307);
            cluster_name25=cluster_name();

            state._fsp--;
            if (state.failed) return cc;
            // BON.g:227:3: (i= indexing )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // BON.g:227:4: i= indexing
                    {
                    pushFollow(FOLLOW_indexing_in_cluster_chart1315);
                    i=indexing();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       indexing = (i!=null?i.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:228:3: ( explanation )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // BON.g:228:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_cluster_chart1326);
                    explanation23=explanation();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       explanation = explanation23; 
                    }

                    }
                    break;

            }

            // BON.g:229:3: ( part )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // BON.g:229:4: part
                    {
                    pushFollow(FOLLOW_part_in_cluster_chart1337);
                    part24=part();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       part = part24; 
                    }

                    }
                    break;

            }

            // BON.g:230:3: (ce= class_entries | )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            else if ( (LA24_0==25||LA24_0==27) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return cc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // BON.g:230:6: ce= class_entries
                    {
                    pushFollow(FOLLOW_class_entries_in_cluster_chart1352);
                    ce=class_entries();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       classes = ce; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:231:6: 
                    {
                    if ( state.backtracking==0 ) {
                       classes = emptyList(); 
                    }

                    }
                    break;

            }

            // BON.g:233:3: (cle= cluster_entries | )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            else if ( (LA25_0==25) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return cc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // BON.g:233:6: cle= cluster_entries
                    {
                    pushFollow(FOLLOW_cluster_entries_in_cluster_chart1376);
                    cle=cluster_entries();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       clusters = cle; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:234:6: 
                    {
                    if ( state.backtracking==0 ) {
                       clusters = emptyList(); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_cluster_chart1397); if (state.failed) return cc;
            if ( state.backtracking==0 ) {
               cc = ClusterChart.mk((cluster_name25!=null?cluster_name25.name:null), false, classes, clusters, indexing, explanation, part, getSLoc(c,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cc;
    }
    // $ANTLR end "cluster_chart"


    // $ANTLR start "class_entries"
    // BON.g:240:1: class_entries returns [List<ClassEntry> entries] : ( class_entry )+ ;
    public final List<ClassEntry> class_entries() throws RecognitionException {
        List<ClassEntry> entries = null;

        ClassEntry class_entry26 = null;


        try {
            // BON.g:240:50: ( ( class_entry )+ )
            // BON.g:241:3: ( class_entry )+
            {
            if ( state.backtracking==0 ) {
               entries = createList(); 
            }
            // BON.g:242:3: ( class_entry )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // BON.g:242:4: class_entry
            	    {
            	    pushFollow(FOLLOW_class_entry_in_class_entries1436);
            	    class_entry26=class_entry();

            	    state._fsp--;
            	    if (state.failed) return entries;
            	    if ( state.backtracking==0 ) {
            	       entries.add(class_entry26); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return entries;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entries;
    }
    // $ANTLR end "class_entries"


    // $ANTLR start "class_entry"
    // BON.g:245:1: class_entry returns [ClassEntry entry] : c= 'class' class_name description ;
    public final ClassEntry class_entry() throws RecognitionException {
        ClassEntry entry = null;

        Token c=null;
        BONParser.class_name_return class_name27 = null;

        BONParser.description_return description28 = null;


        try {
            // BON.g:245:40: (c= 'class' class_name description )
            // BON.g:246:3: c= 'class' class_name description
            {
            c=(Token)match(input,26,FOLLOW_26_in_class_entry1474); if (state.failed) return entry;
            pushFollow(FOLLOW_class_name_in_class_entry1476);
            class_name27=class_name();

            state._fsp--;
            if (state.failed) return entry;
            pushFollow(FOLLOW_description_in_class_entry1480);
            description28=description();

            state._fsp--;
            if (state.failed) return entry;
            if ( state.backtracking==0 ) {
               entry = ClassEntry.mk((class_name27!=null?input.toString(class_name27.start,class_name27.stop):null), (description28!=null?description28.description:null), getSLoc(c, (description28!=null?((Token)description28.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entry;
    }
    // $ANTLR end "class_entry"

    public static class cluster_name_return extends ParserRuleReturnScope {
        public String name;
    };

    // $ANTLR start "cluster_name"
    // BON.g:251:1: cluster_name returns [String name] : i= IDENTIFIER ;
    public final BONParser.cluster_name_return cluster_name() throws RecognitionException {
        BONParser.cluster_name_return retval = new BONParser.cluster_name_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:251:36: (i= IDENTIFIER )
            // BON.g:252:3: i= IDENTIFIER
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cluster_name1514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = (i!=null?i.getText():null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cluster_name"


    // $ANTLR start "class_chart"
    // BON.g:256:1: class_chart returns [ClassChart cc] : c= 'class_chart' class_name (i= indexing )? ( explanation )? ( part )? ( inherits )? ( queries )? ( commands )? ( constraints )? e= 'end' ;
    public final ClassChart class_chart() throws RecognitionException {
        ClassChart cc = null;

        Token c=null;
        Token e=null;
        BONParser.indexing_return i = null;

        String explanation29 = null;

        String part30 = null;

        List<ClassName> inherits31 = null;

        List<String> queries32 = null;

        List<String> commands33 = null;

        List<String> constraints34 = null;

        BONParser.class_name_return class_name35 = null;


         Indexing indexing = null; String explanation = null; String part = null;
                List<ClassName> inherits = emptyList(); List<String> commands = emptyList(); List<String> queries = emptyList(); 
                List<String> constraints = emptyList();  
        try {
            // BON.g:262:1: (c= 'class_chart' class_name (i= indexing )? ( explanation )? ( part )? ( inherits )? ( queries )? ( commands )? ( constraints )? e= 'end' )
            // BON.g:263:3: c= 'class_chart' class_name (i= indexing )? ( explanation )? ( part )? ( inherits )? ( queries )? ( commands )? ( constraints )? e= 'end'
            {
            c=(Token)match(input,37,FOLLOW_37_in_class_chart1545); if (state.failed) return cc;
            pushFollow(FOLLOW_class_name_in_class_chart1547);
            class_name35=class_name();

            state._fsp--;
            if (state.failed) return cc;
            // BON.g:264:3: (i= indexing )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // BON.g:264:4: i= indexing
                    {
                    pushFollow(FOLLOW_indexing_in_class_chart1555);
                    i=indexing();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       indexing = (i!=null?i.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:265:3: ( explanation )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // BON.g:265:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_class_chart1566);
                    explanation29=explanation();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       explanation = explanation29; 
                    }

                    }
                    break;

            }

            // BON.g:266:3: ( part )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // BON.g:266:4: part
                    {
                    pushFollow(FOLLOW_part_in_class_chart1577);
                    part30=part();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       part = part30; 
                    }

                    }
                    break;

            }

            // BON.g:267:3: ( inherits )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // BON.g:267:6: inherits
                    {
                    pushFollow(FOLLOW_inherits_in_class_chart1590);
                    inherits31=inherits();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       inherits = inherits31; 
                    }

                    }
                    break;

            }

            // BON.g:270:3: ( queries )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // BON.g:270:6: queries
                    {
                    pushFollow(FOLLOW_queries_in_class_chart1609);
                    queries32=queries();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       queries = queries32; 
                    }

                    }
                    break;

            }

            // BON.g:273:3: ( commands )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // BON.g:273:6: commands
                    {
                    pushFollow(FOLLOW_commands_in_class_chart1628);
                    commands33=commands();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       commands = commands33; 
                    }

                    }
                    break;

            }

            // BON.g:276:3: ( constraints )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // BON.g:276:6: constraints
                    {
                    pushFollow(FOLLOW_constraints_in_class_chart1647);
                    constraints34=constraints();

                    state._fsp--;
                    if (state.failed) return cc;
                    if ( state.backtracking==0 ) {
                       constraints = constraints34; 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_class_chart1665); if (state.failed) return cc;
            if ( state.backtracking==0 ) {
               cc = ClassChart.mk((class_name35!=null?class_name35.name:null), inherits, queries, commands, constraints, indexing, explanation, part, getSLoc(c,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cc;
    }
    // $ANTLR end "class_chart"


    // $ANTLR start "inherits"
    // BON.g:283:1: inherits returns [List<ClassName> inherits] : (i= 'inherit' class_name_list | i= 'inherit' );
    public final List<ClassName> inherits() throws RecognitionException {
        List<ClassName> inherits = null;

        Token i=null;
        List<ClassName> class_name_list36 = null;


        try {
            // BON.g:283:45: (i= 'inherit' class_name_list | i= 'inherit' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==IDENTIFIER) ) {
                    alt34=1;
                }
                else if ( (LA34_1==25||(LA34_1>=39 && LA34_1<=41)) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return inherits;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return inherits;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // BON.g:284:3: i= 'inherit' class_name_list
                    {
                    i=(Token)match(input,38,FOLLOW_38_in_inherits1699); if (state.failed) return inherits;
                    pushFollow(FOLLOW_class_name_list_in_inherits1704);
                    class_name_list36=class_name_list();

                    state._fsp--;
                    if (state.failed) return inherits;
                    if ( state.backtracking==0 ) {
                       inherits = class_name_list36; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:288:3: i= 'inherit'
                    {
                    i=(Token)match(input,38,FOLLOW_38_in_inherits1718); if (state.failed) return inherits;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(i), "class name(s)", "in inherits clause", true)); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return inherits;
    }
    // $ANTLR end "inherits"


    // $ANTLR start "queries"
    // BON.g:292:1: queries returns [List<String> queries] : 'query' query_list ;
    public final List<String> queries() throws RecognitionException {
        List<String> queries = null;

        List<String> query_list37 = null;


        try {
            // BON.g:292:40: ( 'query' query_list )
            // BON.g:293:3: 'query' query_list
            {
            match(input,39,FOLLOW_39_in_queries1738); if (state.failed) return queries;
            pushFollow(FOLLOW_query_list_in_queries1740);
            query_list37=query_list();

            state._fsp--;
            if (state.failed) return queries;
            if ( state.backtracking==0 ) {
               queries = query_list37; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return queries;
    }
    // $ANTLR end "queries"


    // $ANTLR start "commands"
    // BON.g:297:1: commands returns [List<String> commands] : 'command' command_list ;
    public final List<String> commands() throws RecognitionException {
        List<String> commands = null;

        List<String> command_list38 = null;


        try {
            // BON.g:297:42: ( 'command' command_list )
            // BON.g:298:3: 'command' command_list
            {
            match(input,40,FOLLOW_40_in_commands1770); if (state.failed) return commands;
            pushFollow(FOLLOW_command_list_in_commands1772);
            command_list38=command_list();

            state._fsp--;
            if (state.failed) return commands;
            if ( state.backtracking==0 ) {
               commands = command_list38; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return commands;
    }
    // $ANTLR end "commands"


    // $ANTLR start "constraints"
    // BON.g:302:1: constraints returns [List<String> constraints] : 'constraint' constraint_list ;
    public final List<String> constraints() throws RecognitionException {
        List<String> constraints = null;

        List<String> constraint_list39 = null;


        try {
            // BON.g:302:48: ( 'constraint' constraint_list )
            // BON.g:303:3: 'constraint' constraint_list
            {
            match(input,41,FOLLOW_41_in_constraints1791); if (state.failed) return constraints;
            pushFollow(FOLLOW_constraint_list_in_constraints1793);
            constraint_list39=constraint_list();

            state._fsp--;
            if (state.failed) return constraints;
            if ( state.backtracking==0 ) {
               constraints = constraint_list39; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constraints;
    }
    // $ANTLR end "constraints"


    // $ANTLR start "query_list"
    // BON.g:308:1: query_list returns [List<String> queries] : m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? ;
    public final List<String> query_list() throws RecognitionException {
        List<String> queries = null;

        BONParser.manifest_textblock_return m1 = null;

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:308:43: (m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? )
            // BON.g:309:3: m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )?
            {
            if ( state.backtracking==0 ) {
               queries = createList(); 
            }
            pushFollow(FOLLOW_manifest_textblock_in_query_list1819);
            m1=manifest_textblock();

            state._fsp--;
            if (state.failed) return queries;
            if ( state.backtracking==0 ) {
               queries.add((m1!=null?input.toString(m1.start,m1.stop):null)); 
            }
            // BON.g:312:3: ( ( ',' m= manifest_textblock ) | m= manifest_textblock )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==35) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==MANIFEST_STRING||LA35_1==MANIFEST_TEXTBLOCK_START) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==MANIFEST_STRING||LA35_0==MANIFEST_TEXTBLOCK_START) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // BON.g:312:6: ( ',' m= manifest_textblock )
            	    {
            	    // BON.g:312:6: ( ',' m= manifest_textblock )
            	    // BON.g:312:7: ',' m= manifest_textblock
            	    {
            	    match(input,35,FOLLOW_35_in_query_list1832); if (state.failed) return queries;
            	    pushFollow(FOLLOW_manifest_textblock_in_query_list1836);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return queries;
            	    if ( state.backtracking==0 ) {
            	       queries.add((m!=null?input.toString(m.start,m.stop):null)); 
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // BON.g:315:6: m= manifest_textblock
            	    {
            	    pushFollow(FOLLOW_manifest_textblock_in_query_list1868);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return queries;
            	    if ( state.backtracking==0 ) {
            	       addParseProblem(new MissingElementParseError(getSourceLocation((m!=null?((Token)m.start):null)), "comma", "before additional query item", false)); 
            	    }
            	    if ( state.backtracking==0 ) {
            	       queries.add((m!=null?input.toString(m.start,m.stop):null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // BON.g:319:3: ( ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // BON.g:319:3: ','
                    {
                    match(input,35,FOLLOW_35_in_query_list1894); if (state.failed) return queries;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return queries;
    }
    // $ANTLR end "query_list"


    // $ANTLR start "command_list"
    // BON.g:322:1: command_list returns [List<String> commands] : m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? ;
    public final List<String> command_list() throws RecognitionException {
        List<String> commands = null;

        BONParser.manifest_textblock_return m1 = null;

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:322:46: (m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? )
            // BON.g:323:3: m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )?
            {
            if ( state.backtracking==0 ) {
               commands = createList(); 
            }
            pushFollow(FOLLOW_manifest_textblock_in_command_list1941);
            m1=manifest_textblock();

            state._fsp--;
            if (state.failed) return commands;
            if ( state.backtracking==0 ) {
               commands.add((m1!=null?input.toString(m1.start,m1.stop):null)); 
            }
            // BON.g:326:3: ( ( ',' m= manifest_textblock ) | m= manifest_textblock )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==35) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==MANIFEST_STRING||LA37_1==MANIFEST_TEXTBLOCK_START) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==MANIFEST_STRING||LA37_0==MANIFEST_TEXTBLOCK_START) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // BON.g:326:6: ( ',' m= manifest_textblock )
            	    {
            	    // BON.g:326:6: ( ',' m= manifest_textblock )
            	    // BON.g:326:7: ',' m= manifest_textblock
            	    {
            	    match(input,35,FOLLOW_35_in_command_list1954); if (state.failed) return commands;
            	    pushFollow(FOLLOW_manifest_textblock_in_command_list1958);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return commands;
            	    if ( state.backtracking==0 ) {
            	       commands.add((m!=null?input.toString(m.start,m.stop):null)); 
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // BON.g:329:6: m= manifest_textblock
            	    {
            	    pushFollow(FOLLOW_manifest_textblock_in_command_list1984);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return commands;
            	    if ( state.backtracking==0 ) {
            	       addParseProblem(new MissingElementParseError(getSourceLocation((m!=null?((Token)m.start):null)), "comma", "before additional command item", false)); 
            	    }
            	    if ( state.backtracking==0 ) {
            	       commands.add((m!=null?input.toString(m.start,m.stop):null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // BON.g:333:3: ( ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // BON.g:333:3: ','
                    {
                    match(input,35,FOLLOW_35_in_command_list2009); if (state.failed) return commands;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return commands;
    }
    // $ANTLR end "command_list"


    // $ANTLR start "constraint_list"
    // BON.g:336:1: constraint_list returns [List<String> constraints] : m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? ;
    public final List<String> constraint_list() throws RecognitionException {
        List<String> constraints = null;

        BONParser.manifest_textblock_return m1 = null;

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:336:52: (m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )? )
            // BON.g:337:3: m1= manifest_textblock ( ( ',' m= manifest_textblock ) | m= manifest_textblock )* ( ',' )?
            {
            if ( state.backtracking==0 ) {
               constraints = createList(); 
            }
            pushFollow(FOLLOW_manifest_textblock_in_constraint_list2045);
            m1=manifest_textblock();

            state._fsp--;
            if (state.failed) return constraints;
            if ( state.backtracking==0 ) {
               constraints.add((m1!=null?input.toString(m1.start,m1.stop):null)); 
            }
            // BON.g:340:3: ( ( ',' m= manifest_textblock ) | m= manifest_textblock )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==MANIFEST_STRING||LA39_1==MANIFEST_TEXTBLOCK_START) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==MANIFEST_STRING||LA39_0==MANIFEST_TEXTBLOCK_START) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // BON.g:340:6: ( ',' m= manifest_textblock )
            	    {
            	    // BON.g:340:6: ( ',' m= manifest_textblock )
            	    // BON.g:340:7: ',' m= manifest_textblock
            	    {
            	    match(input,35,FOLLOW_35_in_constraint_list2058); if (state.failed) return constraints;
            	    pushFollow(FOLLOW_manifest_textblock_in_constraint_list2062);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return constraints;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // BON.g:341:6: m= manifest_textblock
            	    {
            	    pushFollow(FOLLOW_manifest_textblock_in_constraint_list2073);
            	    m=manifest_textblock();

            	    state._fsp--;
            	    if (state.failed) return constraints;
            	    if ( state.backtracking==0 ) {
            	       addParseProblem(new MissingElementParseError(getSourceLocation((m!=null?((Token)m.start):null)), "comma", "before additional constraint item", false)); 
            	    }
            	    if ( state.backtracking==0 ) {
            	       constraints.add((m!=null?input.toString(m.start,m.stop):null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // BON.g:345:3: ( ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // BON.g:345:3: ','
                    {
                    match(input,35,FOLLOW_35_in_constraint_list2097); if (state.failed) return constraints;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constraints;
    }
    // $ANTLR end "constraint_list"


    // $ANTLR start "class_name_list"
    // BON.g:348:1: class_name_list returns [List<ClassName> list] : c1= class_name ( ( ',' c= class_name ) | (c= class_name ) )* ;
    public final List<ClassName> class_name_list() throws RecognitionException {
        List<ClassName> list = null;

        BONParser.class_name_return c1 = null;

        BONParser.class_name_return c = null;


        try {
            // BON.g:348:48: (c1= class_name ( ( ',' c= class_name ) | (c= class_name ) )* )
            // BON.g:349:3: c1= class_name ( ( ',' c= class_name ) | (c= class_name ) )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_class_name_in_class_name_list2119);
            c1=class_name();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add((c1!=null?c1.name:null)); 
            }
            // BON.g:352:3: ( ( ',' c= class_name ) | (c= class_name ) )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==35) ) {
                    alt41=1;
                }
                else if ( (LA41_0==IDENTIFIER) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // BON.g:352:6: ( ',' c= class_name )
            	    {
            	    // BON.g:352:6: ( ',' c= class_name )
            	    // BON.g:352:8: ',' c= class_name
            	    {
            	    match(input,35,FOLLOW_35_in_class_name_list2133); if (state.failed) return list;
            	    pushFollow(FOLLOW_class_name_in_class_name_list2137);
            	    c=class_name();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add((c!=null?c.name:null)); 
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // BON.g:355:6: (c= class_name )
            	    {
            	    // BON.g:355:6: (c= class_name )
            	    // BON.g:355:8: c= class_name
            	    {
            	    pushFollow(FOLLOW_class_name_in_class_name_list2166);
            	    c=class_name();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add((c!=null?c.name:null)); 
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "class_name_list"


    // $ANTLR start "cluster_name_list"
    // BON.g:362:1: cluster_name_list returns [List<String> list] : c1= cluster_name ( ( ',' c= cluster_name ) | (c= cluster_name ) )* ;
    public final List<String> cluster_name_list() throws RecognitionException {
        List<String> list = null;

        BONParser.cluster_name_return c1 = null;

        BONParser.cluster_name_return c = null;


        try {
            // BON.g:362:47: (c1= cluster_name ( ( ',' c= cluster_name ) | (c= cluster_name ) )* )
            // BON.g:363:3: c1= cluster_name ( ( ',' c= cluster_name ) | (c= cluster_name ) )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_cluster_name_in_cluster_name_list2235);
            c1=cluster_name();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add((c1!=null?input.toString(c1.start,c1.stop):null)); 
            }
            // BON.g:366:3: ( ( ',' c= cluster_name ) | (c= cluster_name ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==35) ) {
                    alt42=1;
                }
                else if ( (LA42_0==IDENTIFIER) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // BON.g:366:6: ( ',' c= cluster_name )
            	    {
            	    // BON.g:366:6: ( ',' c= cluster_name )
            	    // BON.g:366:8: ',' c= cluster_name
            	    {
            	    match(input,35,FOLLOW_35_in_cluster_name_list2248); if (state.failed) return list;
            	    pushFollow(FOLLOW_cluster_name_in_cluster_name_list2252);
            	    c=cluster_name();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add((c!=null?input.toString(c.start,c.stop):null)); 
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // BON.g:369:6: (c= cluster_name )
            	    {
            	    // BON.g:369:6: (c= cluster_name )
            	    // BON.g:369:8: c= cluster_name
            	    {
            	    pushFollow(FOLLOW_cluster_name_in_cluster_name_list2280);
            	    c=cluster_name();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       addParseProblem(new MissingElementParseError(getSourceLocation((c!=null?((Token)c.start):null)), "comma", "before additional class name", false)); 
            	    }
            	    if ( state.backtracking==0 ) {
            	       list.add((c!=null?input.toString(c.start,c.stop):null)); 
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "cluster_name_list"

    public static class class_or_cluster_name_list_return extends ParserRuleReturnScope {
        public List<String> list;
    };

    // $ANTLR start "class_or_cluster_name_list"
    // BON.g:376:1: class_or_cluster_name_list returns [List<String> list] : c1= class_or_bracketed_cluster_name ( ',' c= class_or_bracketed_cluster_name )* ;
    public final BONParser.class_or_cluster_name_list_return class_or_cluster_name_list() throws RecognitionException {
        BONParser.class_or_cluster_name_list_return retval = new BONParser.class_or_cluster_name_list_return();
        retval.start = input.LT(1);

        String c1 = null;

        String c = null;


        try {
            // BON.g:376:56: (c1= class_or_bracketed_cluster_name ( ',' c= class_or_bracketed_cluster_name )* )
            // BON.g:377:3: c1= class_or_bracketed_cluster_name ( ',' c= class_or_bracketed_cluster_name )*
            {
            if ( state.backtracking==0 ) {
               retval.list = createList(); 
            }
            pushFollow(FOLLOW_class_or_bracketed_cluster_name_in_class_or_cluster_name_list2377);
            c1=class_or_bracketed_cluster_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.list.add(c1); 
            }
            // BON.g:380:3: ( ',' c= class_or_bracketed_cluster_name )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==35) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // BON.g:380:5: ',' c= class_or_bracketed_cluster_name
            	    {
            	    match(input,35,FOLLOW_35_in_class_or_cluster_name_list2387); if (state.failed) return retval;
            	    pushFollow(FOLLOW_class_or_bracketed_cluster_name_in_class_or_cluster_name_list2391);
            	    c=class_or_bracketed_cluster_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.list.add(c); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_or_cluster_name_list"


    // $ANTLR start "class_or_bracketed_cluster_name"
    // BON.g:385:1: class_or_bracketed_cluster_name returns [String name] : ( class_name | '(' cluster_name ')' );
    public final String class_or_bracketed_cluster_name() throws RecognitionException {
        String name = null;

        BONParser.class_name_return class_name40 = null;

        BONParser.cluster_name_return cluster_name41 = null;


        try {
            // BON.g:385:55: ( class_name | '(' cluster_name ')' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IDENTIFIER) ) {
                alt44=1;
            }
            else if ( (LA44_0==42) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return name;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // BON.g:386:4: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_class_or_bracketed_cluster_name2419);
                    class_name40=class_name();

                    state._fsp--;
                    if (state.failed) return name;
                    if ( state.backtracking==0 ) {
                       name = (class_name40!=null?class_name40.name:null).getName(); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:389:4: '(' cluster_name ')'
                    {
                    match(input,42,FOLLOW_42_in_class_or_bracketed_cluster_name2433); if (state.failed) return name;
                    pushFollow(FOLLOW_cluster_name_in_class_or_bracketed_cluster_name2435);
                    cluster_name41=cluster_name();

                    state._fsp--;
                    if (state.failed) return name;
                    match(input,43,FOLLOW_43_in_class_or_bracketed_cluster_name2437); if (state.failed) return name;
                    if ( state.backtracking==0 ) {
                       name = (cluster_name41!=null?cluster_name41.name:null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "class_or_bracketed_cluster_name"

    public static class class_name_return extends ParserRuleReturnScope {
        public ClassName name;
    };

    // $ANTLR start "class_name"
    // BON.g:393:1: class_name returns [ClassName name] : i= IDENTIFIER ;
    public final BONParser.class_name_return class_name() throws RecognitionException {
        BONParser.class_name_return retval = new BONParser.class_name_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:393:37: (i= IDENTIFIER )
            // BON.g:394:3: i= IDENTIFIER
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_name2459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = ClassName.mk((i!=null?i.getText():null), getSLoc(i)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_name"


    // $ANTLR start "event_chart"
    // BON.g:398:1: event_chart returns [EventChart ec] : e= 'event_chart' system_name ( 'incoming' | 'outgoing' )? ( indexing )? ( explanation )? ( part )? (ee= event_entries | ) end= 'end' ;
    public final EventChart event_chart() throws RecognitionException {
        EventChart ec = null;

        Token e=null;
        Token end=null;
        List<EventEntry> ee = null;

        BONParser.indexing_return indexing42 = null;

        String explanation43 = null;

        String part44 = null;

        String system_name45 = null;


         boolean incoming = false; boolean outgoing = false; Indexing indexing = null;
                String explanation = null; String part = null; List<EventEntry> eventEntries = null; 
        try {
            // BON.g:403:1: (e= 'event_chart' system_name ( 'incoming' | 'outgoing' )? ( indexing )? ( explanation )? ( part )? (ee= event_entries | ) end= 'end' )
            // BON.g:404:3: e= 'event_chart' system_name ( 'incoming' | 'outgoing' )? ( indexing )? ( explanation )? ( part )? (ee= event_entries | ) end= 'end'
            {
            e=(Token)match(input,44,FOLLOW_44_in_event_chart2490); if (state.failed) return ec;
            pushFollow(FOLLOW_system_name_in_event_chart2492);
            system_name45=system_name();

            state._fsp--;
            if (state.failed) return ec;
            // BON.g:405:3: ( 'incoming' | 'outgoing' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            else if ( (LA45_0==46) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // BON.g:405:6: 'incoming'
                    {
                    match(input,45,FOLLOW_45_in_event_chart2500); if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       incoming = true; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:406:6: 'outgoing'
                    {
                    match(input,46,FOLLOW_46_in_event_chart2510); if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       outgoing = true; 
                    }

                    }
                    break;

            }

            // BON.g:408:3: ( indexing )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // BON.g:408:4: indexing
                    {
                    pushFollow(FOLLOW_indexing_in_event_chart2522);
                    indexing42=indexing();

                    state._fsp--;
                    if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       indexing = (indexing42!=null?indexing42.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:409:3: ( explanation )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // BON.g:409:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_event_chart2531);
                    explanation43=explanation();

                    state._fsp--;
                    if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       explanation = explanation43; 
                    }

                    }
                    break;

            }

            // BON.g:410:3: ( part )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // BON.g:410:4: part
                    {
                    pushFollow(FOLLOW_part_in_event_chart2541);
                    part44=part();

                    state._fsp--;
                    if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       part = part44; 
                    }

                    }
                    break;

            }

            // BON.g:411:3: (ee= event_entries | )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            else if ( (LA49_0==25) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ec;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // BON.g:411:5: ee= event_entries
                    {
                    pushFollow(FOLLOW_event_entries_in_event_chart2554);
                    ee=event_entries();

                    state._fsp--;
                    if (state.failed) return ec;
                    if ( state.backtracking==0 ) {
                       eventEntries = ee; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:414:5: 
                    {
                    if ( state.backtracking==0 ) {
                       eventEntries = createList(); 
                    }

                    }
                    break;

            }

            end=(Token)match(input,25,FOLLOW_25_in_event_chart2581); if (state.failed) return ec;
            if ( state.backtracking==0 ) {
               ec = EventChart.mk(system_name45, incoming, outgoing, eventEntries, indexing, explanation, part, getSLoc(e,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ec;
    }
    // $ANTLR end "event_chart"


    // $ANTLR start "event_entries"
    // BON.g:420:1: event_entries returns [List<EventEntry> entries] : ( event_entry )+ ;
    public final List<EventEntry> event_entries() throws RecognitionException {
        List<EventEntry> entries = null;

        EventEntry event_entry46 = null;


        try {
            // BON.g:420:50: ( ( event_entry )+ )
            // BON.g:421:3: ( event_entry )+
            {
            if ( state.backtracking==0 ) {
               entries = createList(); 
            }
            // BON.g:422:3: ( event_entry )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==47) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // BON.g:422:4: event_entry
            	    {
            	    pushFollow(FOLLOW_event_entry_in_event_entries2618);
            	    event_entry46=event_entry();

            	    state._fsp--;
            	    if (state.failed) return entries;
            	    if ( state.backtracking==0 ) {
            	       entries.add(event_entry46); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return entries;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entries;
    }
    // $ANTLR end "event_entries"


    // $ANTLR start "event_entry"
    // BON.g:425:1: event_entry returns [EventEntry entry] : e= 'event' ( (m= manifest_textblock ) | ) i= 'involves' ( (ccns= class_or_cluster_name_list ) | ) ;
    public final EventEntry event_entry() throws RecognitionException {
        EventEntry entry = null;

        Token e=null;
        Token i=null;
        BONParser.manifest_textblock_return m = null;

        BONParser.class_or_cluster_name_list_return ccns = null;


         boolean mok=false; boolean cok=false; List<String> ccnl = null; String description = null; Token stop=null; 
        try {
            // BON.g:426:119: (e= 'event' ( (m= manifest_textblock ) | ) i= 'involves' ( (ccns= class_or_cluster_name_list ) | ) )
            // BON.g:427:3: e= 'event' ( (m= manifest_textblock ) | ) i= 'involves' ( (ccns= class_or_cluster_name_list ) | )
            {
            e=(Token)match(input,47,FOLLOW_47_in_event_entry2661); if (state.failed) return entry;
            // BON.g:428:3: ( (m= manifest_textblock ) | )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MANIFEST_STRING||LA51_0==MANIFEST_TEXTBLOCK_START) ) {
                alt51=1;
            }
            else if ( (LA51_0==48) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return entry;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // BON.g:428:6: (m= manifest_textblock )
                    {
                    // BON.g:428:6: (m= manifest_textblock )
                    // BON.g:428:8: m= manifest_textblock
                    {
                    pushFollow(FOLLOW_manifest_textblock_in_event_entry2672);
                    m=manifest_textblock();

                    state._fsp--;
                    if (state.failed) return entry;
                    if ( state.backtracking==0 ) {
                      mok=true; description=(m!=null?input.toString(m.start,m.stop):null);
                    }

                    }


                    }
                    break;
                case 2 :
                    // BON.g:432:4: 
                    {
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(e), "event name", "in event entry clause", true)); 
                    }

                    }
                    break;

            }

            i=(Token)match(input,48,FOLLOW_48_in_event_entry2712); if (state.failed) return entry;
            // BON.g:435:3: ( (ccns= class_or_cluster_name_list ) | )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENTIFIER||LA52_0==42) ) {
                alt52=1;
            }
            else if ( (LA52_0==25||LA52_0==47) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return entry;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // BON.g:435:6: (ccns= class_or_cluster_name_list )
                    {
                    // BON.g:435:6: (ccns= class_or_cluster_name_list )
                    // BON.g:435:7: ccns= class_or_cluster_name_list
                    {
                    pushFollow(FOLLOW_class_or_cluster_name_list_in_event_entry2722);
                    ccns=class_or_cluster_name_list();

                    state._fsp--;
                    if (state.failed) return entry;
                    if ( state.backtracking==0 ) {
                       cok=true; ccnl = (ccns!=null?ccns.list:null); 
                    }
                    if ( state.backtracking==0 ) {
                       stop = (ccns!=null?((Token)ccns.stop):null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // BON.g:440:6: 
                    {
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(i), "class name list", "in involves clause of event entry", true)); 
                    }
                    if ( state.backtracking==0 ) {
                       stop = i; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if (mok && cok) entry = EventEntry.mk(description, ccnl, getSLoc(e,stop)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entry;
    }
    // $ANTLR end "event_entry"


    // $ANTLR start "scenario_chart"
    // BON.g:446:1: scenario_chart returns [ScenarioChart sc] : s= 'scenario_chart' system_name ( indexing )? ( explanation )? ( part )? ( scenario_entries | ) e= 'end' ;
    public final ScenarioChart scenario_chart() throws RecognitionException {
        ScenarioChart sc = null;

        Token s=null;
        Token e=null;
        BONParser.indexing_return indexing47 = null;

        String explanation48 = null;

        String part49 = null;

        List<ScenarioEntry> scenario_entries50 = null;

        String system_name51 = null;


         Indexing indexing = null; String explanation = null; String part = null; List<ScenarioEntry> entries = null; 
        try {
            // BON.g:450:1: (s= 'scenario_chart' system_name ( indexing )? ( explanation )? ( part )? ( scenario_entries | ) e= 'end' )
            // BON.g:451:3: s= 'scenario_chart' system_name ( indexing )? ( explanation )? ( part )? ( scenario_entries | ) e= 'end'
            {
            s=(Token)match(input,49,FOLLOW_49_in_scenario_chart2802); if (state.failed) return sc;
            pushFollow(FOLLOW_system_name_in_scenario_chart2804);
            system_name51=system_name();

            state._fsp--;
            if (state.failed) return sc;
            // BON.g:452:3: ( indexing )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // BON.g:452:4: indexing
                    {
                    pushFollow(FOLLOW_indexing_in_scenario_chart2809);
                    indexing47=indexing();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       indexing = (indexing47!=null?indexing47.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:453:3: ( explanation )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // BON.g:453:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_scenario_chart2819);
                    explanation48=explanation();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       explanation = explanation48; 
                    }

                    }
                    break;

            }

            // BON.g:454:3: ( part )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==31) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // BON.g:454:4: part
                    {
                    pushFollow(FOLLOW_part_in_scenario_chart2829);
                    part49=part();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                      part = part49; 
                    }

                    }
                    break;

            }

            // BON.g:455:3: ( scenario_entries | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            else if ( (LA56_0==25) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return sc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // BON.g:455:5: scenario_entries
                    {
                    pushFollow(FOLLOW_scenario_entries_in_scenario_chart2840);
                    scenario_entries50=scenario_entries();

                    state._fsp--;
                    if (state.failed) return sc;
                    if ( state.backtracking==0 ) {
                       entries = scenario_entries50; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:456:6: 
                    {
                    if ( state.backtracking==0 ) {
                       entries = emptyList(); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_scenario_chart2861); if (state.failed) return sc;
            if ( state.backtracking==0 ) {
               sc = ScenarioChart.mk(system_name51, entries, indexing, explanation, part, getSLoc(s,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sc;
    }
    // $ANTLR end "scenario_chart"


    // $ANTLR start "scenario_entries"
    // BON.g:462:1: scenario_entries returns [List<ScenarioEntry> entries] : ( scenario_entry )+ ;
    public final List<ScenarioEntry> scenario_entries() throws RecognitionException {
        List<ScenarioEntry> entries = null;

        ScenarioEntry scenario_entry52 = null;


        try {
            // BON.g:462:56: ( ( scenario_entry )+ )
            // BON.g:463:3: ( scenario_entry )+
            {
            if ( state.backtracking==0 ) {
               entries = createList(); 
            }
            // BON.g:464:3: ( scenario_entry )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==50) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // BON.g:464:4: scenario_entry
            	    {
            	    pushFollow(FOLLOW_scenario_entry_in_scenario_entries2901);
            	    scenario_entry52=scenario_entry();

            	    state._fsp--;
            	    if (state.failed) return entries;
            	    if ( state.backtracking==0 ) {
            	       entries.add(scenario_entry52); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return entries;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entries;
    }
    // $ANTLR end "scenario_entries"


    // $ANTLR start "scenario_entry"
    // BON.g:467:1: scenario_entry returns [ScenarioEntry entry] : s= 'scenario' m= MANIFEST_STRING d= description ;
    public final ScenarioEntry scenario_entry() throws RecognitionException {
        ScenarioEntry entry = null;

        Token s=null;
        Token m=null;
        BONParser.description_return d = null;


        try {
            // BON.g:467:46: (s= 'scenario' m= MANIFEST_STRING d= description )
            // BON.g:468:3: s= 'scenario' m= MANIFEST_STRING d= description
            {
            s=(Token)match(input,50,FOLLOW_50_in_scenario_entry2942); if (state.failed) return entry;
            m=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_scenario_entry2946); if (state.failed) return entry;
            pushFollow(FOLLOW_description_in_scenario_entry2950);
            d=description();

            state._fsp--;
            if (state.failed) return entry;
            if ( state.backtracking==0 ) {
               entry =  ScenarioEntry.mk((m!=null?m.getText():null), (d!=null?d.description:null), getSLoc(s,(d!=null?((Token)d.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entry;
    }
    // $ANTLR end "scenario_entry"

    public static class creation_chart_return extends ParserRuleReturnScope {
        public CreationChart cc;
    };

    // $ANTLR start "creation_chart"
    // BON.g:472:1: creation_chart returns [CreationChart cc] : start= 'creation_chart' system_name ( indexing )? ( explanation )? ( part )? ( creation_entries | ) end= 'end' ;
    public final BONParser.creation_chart_return creation_chart() throws RecognitionException {
        BONParser.creation_chart_return retval = new BONParser.creation_chart_return();
        retval.start = input.LT(1);

        Token start=null;
        Token end=null;
        BONParser.indexing_return indexing53 = null;

        String explanation54 = null;

        String part55 = null;

        List<CreationEntry> creation_entries56 = null;

        String system_name57 = null;


         List<CreationEntry> entries = null; Indexing indexing = null; String explanation = null; String part = null; 
        try {
            // BON.g:476:1: (start= 'creation_chart' system_name ( indexing )? ( explanation )? ( part )? ( creation_entries | ) end= 'end' )
            // BON.g:477:3: start= 'creation_chart' system_name ( indexing )? ( explanation )? ( part )? ( creation_entries | ) end= 'end'
            {
            start=(Token)match(input,51,FOLLOW_51_in_creation_chart2979); if (state.failed) return retval;
            pushFollow(FOLLOW_system_name_in_creation_chart2981);
            system_name57=system_name();

            state._fsp--;
            if (state.failed) return retval;
            // BON.g:478:3: ( indexing )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // BON.g:478:4: indexing
                    {
                    pushFollow(FOLLOW_indexing_in_creation_chart2986);
                    indexing53=indexing();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       indexing = (indexing53!=null?indexing53.indexing:null); 
                    }

                    }
                    break;

            }

            // BON.g:479:3: ( explanation )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // BON.g:479:4: explanation
                    {
                    pushFollow(FOLLOW_explanation_in_creation_chart2996);
                    explanation54=explanation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       explanation = explanation54; 
                    }

                    }
                    break;

            }

            // BON.g:480:3: ( part )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // BON.g:480:4: part
                    {
                    pushFollow(FOLLOW_part_in_creation_chart3006);
                    part55=part();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       part = part55; 
                    }

                    }
                    break;

            }

            // BON.g:481:3: ( creation_entries | )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            else if ( (LA61_0==25) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // BON.g:481:5: creation_entries
                    {
                    pushFollow(FOLLOW_creation_entries_in_creation_chart3017);
                    creation_entries56=creation_entries();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       entries = creation_entries56; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:482:6: 
                    {
                    if ( state.backtracking==0 ) {
                       entries = emptyList(); 
                    }

                    }
                    break;

            }

            end=(Token)match(input,25,FOLLOW_25_in_creation_chart3034); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.cc = CreationChart.mk(system_name57, entries, indexing, explanation, part,getSLoc(start,end)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "creation_chart"


    // $ANTLR start "creation_entries"
    // BON.g:487:1: creation_entries returns [List<CreationEntry> entries] : ( creation_entry )+ ;
    public final List<CreationEntry> creation_entries() throws RecognitionException {
        List<CreationEntry> entries = null;

        CreationEntry creation_entry58 = null;


        try {
            // BON.g:487:56: ( ( creation_entry )+ )
            // BON.g:488:3: ( creation_entry )+
            {
            if ( state.backtracking==0 ) {
               entries = createList(); 
            }
            // BON.g:489:3: ( creation_entry )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==52) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // BON.g:489:4: creation_entry
            	    {
            	    pushFollow(FOLLOW_creation_entry_in_creation_entries3075);
            	    creation_entry58=creation_entry();

            	    state._fsp--;
            	    if (state.failed) return entries;
            	    if ( state.backtracking==0 ) {
            	       entries.add(creation_entry58); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return entries;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entries;
    }
    // $ANTLR end "creation_entries"


    // $ANTLR start "creation_entry"
    // BON.g:492:1: creation_entry returns [CreationEntry entry] : c= 'creator' class_name 'creates' ccnl= class_or_cluster_name_list ;
    public final CreationEntry creation_entry() throws RecognitionException {
        CreationEntry entry = null;

        Token c=null;
        BONParser.class_or_cluster_name_list_return ccnl = null;

        BONParser.class_name_return class_name59 = null;


        try {
            // BON.g:492:46: (c= 'creator' class_name 'creates' ccnl= class_or_cluster_name_list )
            // BON.g:493:3: c= 'creator' class_name 'creates' ccnl= class_or_cluster_name_list
            {
            c=(Token)match(input,52,FOLLOW_52_in_creation_entry3115); if (state.failed) return entry;
            pushFollow(FOLLOW_class_name_in_creation_entry3117);
            class_name59=class_name();

            state._fsp--;
            if (state.failed) return entry;
            match(input,53,FOLLOW_53_in_creation_entry3122); if (state.failed) return entry;
            pushFollow(FOLLOW_class_or_cluster_name_list_in_creation_entry3126);
            ccnl=class_or_cluster_name_list();

            state._fsp--;
            if (state.failed) return entry;
            if ( state.backtracking==0 ) {
               entry = CreationEntry.mk((class_name59!=null?class_name59.name:null), (ccnl!=null?ccnl.list:null), getSLoc(c,(ccnl!=null?((Token)ccnl.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entry;
    }
    // $ANTLR end "creation_entry"


    // $ANTLR start "static_diagram"
    // BON.g:498:1: static_diagram returns [StaticDiagram sd] : s= 'static_diagram' ( extended_id )? (c= COMMENT )? 'component' sb= static_block e= 'end' ;
    public final StaticDiagram static_diagram() throws RecognitionException {
        StaticDiagram sd = null;

        Token s=null;
        Token c=null;
        Token e=null;
        List<StaticComponent> sb = null;

        BONParser.extended_id_return extended_id60 = null;


         String eid = null; String comment = null; 
        try {
            // BON.g:504:1: (s= 'static_diagram' ( extended_id )? (c= COMMENT )? 'component' sb= static_block e= 'end' )
            // BON.g:505:3: s= 'static_diagram' ( extended_id )? (c= COMMENT )? 'component' sb= static_block e= 'end'
            {
            s=(Token)match(input,54,FOLLOW_54_in_static_diagram3159); if (state.failed) return sd;
            // BON.g:506:3: ( extended_id )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENTIFIER||LA63_0==INTEGER) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // BON.g:506:4: extended_id
                    {
                    pushFollow(FOLLOW_extended_id_in_static_diagram3165);
                    extended_id60=extended_id();

                    state._fsp--;
                    if (state.failed) return sd;
                    if ( state.backtracking==0 ) {
                       eid=(extended_id60!=null?extended_id60.eid:null); 
                    }

                    }
                    break;

            }

            // BON.g:507:3: (c= COMMENT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==COMMENT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // BON.g:507:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_static_diagram3178); if (state.failed) return sd;
                    if ( state.backtracking==0 ) {
                       comment=(c!=null?c.getText():null); 
                    }

                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_static_diagram3188); if (state.failed) return sd;
            pushFollow(FOLLOW_static_block_in_static_diagram3195);
            sb=static_block();

            state._fsp--;
            if (state.failed) return sd;
            e=(Token)match(input,25,FOLLOW_25_in_static_diagram3202); if (state.failed) return sd;
            if ( state.backtracking==0 ) {
               sd = StaticDiagram.mk(sb, eid, comment, getSLoc(s,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sd;
    }
    // $ANTLR end "static_diagram"

    public static class extended_id_return extends ParserRuleReturnScope {
        public String eid;
    };

    // $ANTLR start "extended_id"
    // BON.g:514:1: extended_id returns [String eid] : (i= IDENTIFIER | i= INTEGER );
    public final BONParser.extended_id_return extended_id() throws RecognitionException {
        BONParser.extended_id_return retval = new BONParser.extended_id_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:514:34: (i= IDENTIFIER | i= INTEGER )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENTIFIER) ) {
                alt65=1;
            }
            else if ( (LA65_0==INTEGER) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // BON.g:515:4: i= IDENTIFIER
                    {
                    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_extended_id3258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.eid = (i!=null?i.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:517:4: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_extended_id3271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.eid = (i!=null?i.getText():null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extended_id"


    // $ANTLR start "static_block"
    // BON.g:521:1: static_block returns [List<StaticComponent> components] : (sc= static_component )* ;
    public final List<StaticComponent> static_block() throws RecognitionException {
        List<StaticComponent> components = null;

        StaticComponent sc = null;


        try {
            // BON.g:521:57: ( (sc= static_component )* )
            // BON.g:522:3: (sc= static_component )*
            {
            if ( state.backtracking==0 ) {
               components = createList(); 
            }
            // BON.g:523:3: (sc= static_component )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==IDENTIFIER||(LA66_0>=26 && LA66_0<=27)||(LA66_0>=57 && LA66_0<=59)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // BON.g:523:4: sc= static_component
            	    {
            	    pushFollow(FOLLOW_static_component_in_static_block3312);
            	    sc=static_component();

            	    state._fsp--;
            	    if (state.failed) return components;
            	    if ( state.backtracking==0 ) {
            	       components.add(sc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return components;
    }
    // $ANTLR end "static_block"


    // $ANTLR start "static_component"
    // BON.g:526:1: static_component returns [StaticComponent component] : (c1= cluster | c2= clazz | s= static_relation );
    public final StaticComponent static_component() throws RecognitionException {
        StaticComponent component = null;

        Cluster c1 = null;

        Clazz c2 = null;

        StaticRelation s = null;


        try {
            // BON.g:526:54: (c1= cluster | c2= clazz | s= static_relation )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt67=1;
                }
                break;
            case 26:
            case 57:
            case 58:
            case 59:
                {
                alt67=2;
                }
                break;
            case IDENTIFIER:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return component;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // BON.g:527:4: c1= cluster
                    {
                    pushFollow(FOLLOW_cluster_in_static_component3347);
                    c1=cluster();

                    state._fsp--;
                    if (state.failed) return component;
                    if ( state.backtracking==0 ) {
                       component = c1; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:529:4: c2= clazz
                    {
                    pushFollow(FOLLOW_clazz_in_static_component3360);
                    c2=clazz();

                    state._fsp--;
                    if (state.failed) return component;
                    if ( state.backtracking==0 ) {
                       component = c2; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:531:4: s= static_relation
                    {
                    pushFollow(FOLLOW_static_relation_in_static_component3373);
                    s=static_relation();

                    state._fsp--;
                    if (state.failed) return component;
                    if ( state.backtracking==0 ) {
                       component = s; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return component;
    }
    // $ANTLR end "static_component"


    // $ANTLR start "cluster"
    // BON.g:535:1: cluster returns [Cluster cluster] : c= 'cluster' cluster_name (r= 'reused' )? (co= COMMENT )? (cc= cluster_components | ) ;
    public final Cluster cluster() throws RecognitionException {
        Cluster cluster = null;

        Token c=null;
        Token r=null;
        Token co=null;
        BONParser.cluster_components_return cc = null;

        BONParser.cluster_name_return cluster_name61 = null;


         boolean reused = false; String comment = null; List<StaticComponent> components = null; Token end = null; 
        try {
            // BON.g:539:1: (c= 'cluster' cluster_name (r= 'reused' )? (co= COMMENT )? (cc= cluster_components | ) )
            // BON.g:540:3: c= 'cluster' cluster_name (r= 'reused' )? (co= COMMENT )? (cc= cluster_components | )
            {
            c=(Token)match(input,27,FOLLOW_27_in_cluster3405); if (state.failed) return cluster;
            pushFollow(FOLLOW_cluster_name_in_cluster3407);
            cluster_name61=cluster_name();

            state._fsp--;
            if (state.failed) return cluster;
            if ( state.backtracking==0 ) {
               end = (cluster_name61!=null?((Token)cluster_name61.stop):null); 
            }
            // BON.g:541:3: (r= 'reused' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // BON.g:541:4: r= 'reused'
                    {
                    r=(Token)match(input,56,FOLLOW_56_in_cluster3416); if (state.failed) return cluster;
                    if ( state.backtracking==0 ) {
                       reused = true; end = r; 
                    }

                    }
                    break;

            }

            // BON.g:542:3: (co= COMMENT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==COMMENT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // BON.g:542:4: co= COMMENT
                    {
                    co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_cluster3429); if (state.failed) return cluster;
                    if ( state.backtracking==0 ) {
                       comment = (co!=null?co.getText():null); end = co;
                    }

                    }
                    break;

            }

            // BON.g:543:3: (cc= cluster_components | )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==55) ) {
                alt70=1;
            }
            else if ( (LA70_0==IDENTIFIER||(LA70_0>=25 && LA70_0<=27)||(LA70_0>=57 && LA70_0<=59)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return cluster;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // BON.g:543:6: cc= cluster_components
                    {
                    pushFollow(FOLLOW_cluster_components_in_cluster3447);
                    cc=cluster_components();

                    state._fsp--;
                    if (state.failed) return cluster;
                    if ( state.backtracking==0 ) {
                       components = (cc!=null?cc.components:null); end = (cc!=null?((Token)cc.stop):null);
                    }

                    }
                    break;
                case 2 :
                    // BON.g:546:6: 
                    {
                    if ( state.backtracking==0 ) {
                       components = emptyList(); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               cluster = Cluster.mk((cluster_name61!=null?cluster_name61.name:null), components, reused, comment, getSLoc(c,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cluster;
    }
    // $ANTLR end "cluster"

    public static class cluster_components_return extends ParserRuleReturnScope {
        public List<StaticComponent> components;
    };

    // $ANTLR start "cluster_components"
    // BON.g:551:1: cluster_components returns [List<StaticComponent> components] : 'component' static_block 'end' ;
    public final BONParser.cluster_components_return cluster_components() throws RecognitionException {
        BONParser.cluster_components_return retval = new BONParser.cluster_components_return();
        retval.start = input.LT(1);

        List<StaticComponent> static_block62 = null;


        try {
            // BON.g:551:63: ( 'component' static_block 'end' )
            // BON.g:552:3: 'component' static_block 'end'
            {
            match(input,55,FOLLOW_55_in_cluster_components3502); if (state.failed) return retval;
            pushFollow(FOLLOW_static_block_in_cluster_components3504);
            static_block62=static_block();

            state._fsp--;
            if (state.failed) return retval;
            match(input,25,FOLLOW_25_in_cluster_components3506); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.components = static_block62; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cluster_components"


    // $ANTLR start "clazz"
    // BON.g:556:1: clazz returns [Clazz clazz] : (r= 'root' | d= 'deferred' | e= 'effective' | ) c= 'class' cn= class_name (fg= formal_generics | ) (ru= 'reused' )? (p= 'persistent' )? (i= 'interfaced' )? (co= COMMENT )? (ci= class_interface )? ;
    public final Clazz clazz() throws RecognitionException {
        Clazz clazz = null;

        Token r=null;
        Token d=null;
        Token e=null;
        Token c=null;
        Token ru=null;
        Token p=null;
        Token i=null;
        Token co=null;
        BONParser.class_name_return cn = null;

        BONParser.formal_generics_return fg = null;

        BONParser.class_interface_return ci = null;


         Clazz.Mod mod = null; List<FormalGeneric> generics = null; Token start = null; Token end = null;
                boolean reused = false; boolean persistent = false; boolean interfaced = false; 
                String comment = null; ClassInterface classInterface = null; 
        try {
            // BON.g:560:1: ( (r= 'root' | d= 'deferred' | e= 'effective' | ) c= 'class' cn= class_name (fg= formal_generics | ) (ru= 'reused' )? (p= 'persistent' )? (i= 'interfaced' )? (co= COMMENT )? (ci= class_interface )? )
            // BON.g:561:3: (r= 'root' | d= 'deferred' | e= 'effective' | ) c= 'class' cn= class_name (fg= formal_generics | ) (ru= 'reused' )? (p= 'persistent' )? (i= 'interfaced' )? (co= COMMENT )? (ci= class_interface )?
            {
            // BON.g:561:3: (r= 'root' | d= 'deferred' | e= 'effective' | )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt71=1;
                }
                break;
            case 58:
                {
                alt71=2;
                }
                break;
            case 59:
                {
                alt71=3;
                }
                break;
            case 26:
                {
                alt71=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return clazz;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // BON.g:561:7: r= 'root'
                    {
                    r=(Token)match(input,57,FOLLOW_57_in_clazz3557); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       mod = Clazz.Mod.ROOT; start = r; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:562:7: d= 'deferred'
                    {
                    d=(Token)match(input,58,FOLLOW_58_in_clazz3574); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       mod = Clazz.Mod.DEFERRED; start = d; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:563:7: e= 'effective'
                    {
                    e=(Token)match(input,59,FOLLOW_59_in_clazz3587); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       mod = Clazz.Mod.EFFECTIVE; start = e; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:564:21: 
                    {
                    if ( state.backtracking==0 ) {
                       mod = Clazz.Mod.NONE; 
                    }

                    }
                    break;

            }

            c=(Token)match(input,26,FOLLOW_26_in_clazz3621); if (state.failed) return clazz;
            if ( state.backtracking==0 ) {
               if (start == null) start = c; 
            }
            pushFollow(FOLLOW_class_name_in_clazz3632);
            cn=class_name();

            state._fsp--;
            if (state.failed) return clazz;
            if ( state.backtracking==0 ) {
               end = (cn!=null?((Token)cn.stop):null); 
            }
            // BON.g:570:3: (fg= formal_generics | )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==66) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=IDENTIFIER && LA72_0<=COMMENT)||(LA72_0>=25 && LA72_0<=27)||LA72_0==30||LA72_0==38||(LA72_0>=56 && LA72_0<=61)||(LA72_0>=71 && LA72_0<=72)) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return clazz;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // BON.g:570:6: fg= formal_generics
                    {
                    pushFollow(FOLLOW_formal_generics_in_clazz3645);
                    fg=formal_generics();

                    state._fsp--;
                    if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       generics = (fg!=null?fg.generics:null); end = (fg!=null?((Token)fg.stop):null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:571:6: 
                    {
                    if ( state.backtracking==0 ) {
                       generics = emptyList(); 
                    }

                    }
                    break;

            }

            // BON.g:573:3: (ru= 'reused' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==56) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // BON.g:573:4: ru= 'reused'
                    {
                    ru=(Token)match(input,56,FOLLOW_56_in_clazz3667); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       reused = true; end = ru; 
                    }

                    }
                    break;

            }

            // BON.g:574:3: (p= 'persistent' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==60) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // BON.g:574:4: p= 'persistent'
                    {
                    p=(Token)match(input,60,FOLLOW_60_in_clazz3680); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       persistent = true; end = p; 
                    }

                    }
                    break;

            }

            // BON.g:575:3: (i= 'interfaced' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==61) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // BON.g:575:4: i= 'interfaced'
                    {
                    i=(Token)match(input,61,FOLLOW_61_in_clazz3694); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       interfaced = true; end = i; 
                    }

                    }
                    break;

            }

            // BON.g:576:3: (co= COMMENT )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==COMMENT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // BON.g:576:4: co= COMMENT
                    {
                    co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_clazz3706); if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       comment = (co!=null?co.getText():null); end = co; 
                    }

                    }
                    break;

            }

            // BON.g:578:3: (ci= class_interface )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==30||LA77_0==38||(LA77_0>=71 && LA77_0<=72)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // BON.g:578:4: ci= class_interface
                    {
                    pushFollow(FOLLOW_class_interface_in_clazz3721);
                    ci=class_interface();

                    state._fsp--;
                    if (state.failed) return clazz;
                    if ( state.backtracking==0 ) {
                       classInterface = (ci!=null?ci.ci:null); end = (ci!=null?((Token)ci.stop):null); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               clazz = Clazz.mk((cn!=null?cn.name:null), generics, mod, classInterface, reused, persistent, interfaced, comment, getSLoc(start,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clazz;
    }
    // $ANTLR end "clazz"


    // $ANTLR start "static_relation"
    // BON.g:583:1: static_relation returns [StaticRelation relation] : (ir= inheritance_relation | cr= client_relation );
    public final StaticRelation static_relation() throws RecognitionException {
        StaticRelation relation = null;

        InheritanceRelation ir = null;

        ClientRelation cr = null;


        try {
            // BON.g:583:51: (ir= inheritance_relation | cr= client_relation )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // BON.g:584:4: ir= inheritance_relation
                    {
                    pushFollow(FOLLOW_inheritance_relation_in_static_relation3763);
                    ir=inheritance_relation();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       relation = ir; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:586:4: cr= client_relation
                    {
                    pushFollow(FOLLOW_client_relation_in_static_relation3775);
                    cr=client_relation();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       relation = cr; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relation;
    }
    // $ANTLR end "static_relation"


    // $ANTLR start "inheritance_relation"
    // BON.g:590:1: inheritance_relation returns [InheritanceRelation relation] : c= child 'inherit' (a= '{' multiplicity b= '}' )? p= parent ( semantic_label )? ;
    public final InheritanceRelation inheritance_relation() throws RecognitionException {
        InheritanceRelation relation = null;

        Token a=null;
        Token b=null;
        BONParser.child_return c = null;

        BONParser.parent_return p = null;

        BONParser.multiplicity_return multiplicity63 = null;

        BONParser.semantic_label_return semantic_label64 = null;


         Multiplicity multiplicity = null; String semanticLabel = null; Token end = null; 
        try {
            // BON.g:594:1: (c= child 'inherit' (a= '{' multiplicity b= '}' )? p= parent ( semantic_label )? )
            // BON.g:595:3: c= child 'inherit' (a= '{' multiplicity b= '}' )? p= parent ( semantic_label )?
            {
            pushFollow(FOLLOW_child_in_inheritance_relation3806);
            c=child();

            state._fsp--;
            if (state.failed) return relation;
            match(input,38,FOLLOW_38_in_inheritance_relation3808); if (state.failed) return relation;
            // BON.g:596:3: (a= '{' multiplicity b= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==62) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // BON.g:596:4: a= '{' multiplicity b= '}'
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_inheritance_relation3816); if (state.failed) return relation;
                    pushFollow(FOLLOW_multiplicity_in_inheritance_relation3818);
                    multiplicity63=multiplicity();

                    state._fsp--;
                    if (state.failed) return relation;
                    b=(Token)match(input,63,FOLLOW_63_in_inheritance_relation3822); if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       multiplicity = Multiplicity.mk((multiplicity63!=null?multiplicity63.num:null), getSLoc(a,b)); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_parent_in_inheritance_relation3839);
            p=parent();

            state._fsp--;
            if (state.failed) return relation;
            if ( state.backtracking==0 ) {
               end = (p!=null?((Token)p.stop):null); 
            }
            // BON.g:601:3: ( semantic_label )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==MANIFEST_STRING) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // BON.g:601:5: semantic_label
                    {
                    pushFollow(FOLLOW_semantic_label_in_inheritance_relation3850);
                    semantic_label64=semantic_label();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       semanticLabel = (semantic_label64!=null?semantic_label64.label:null); end = (semantic_label64!=null?((Token)semantic_label64.stop):null); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               relation = InheritanceRelation.mk((c!=null?c.ref:null), (p!=null?p.ref:null), multiplicity, semanticLabel, getSLoc((c!=null?((Token)c.start):null), end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relation;
    }
    // $ANTLR end "inheritance_relation"


    // $ANTLR start "client_relation"
    // BON.g:607:1: client_relation returns [ClientRelation relation] : c= client 'client' ( client_entities )? ( type_mark | ) s= supplier ( semantic_label )? ;
    public final ClientRelation client_relation() throws RecognitionException {
        ClientRelation relation = null;

        BONParser.client_return c = null;

        BONParser.supplier_return s = null;

        ClientEntityExpression client_entities65 = null;

        BONParser.type_mark_return type_mark66 = null;

        BONParser.semantic_label_return semantic_label67 = null;


         ClientEntityExpression entities = null; TypeMark mark = null; String semanticLabel = null; Token end = null; 
        try {
            // BON.g:609:1: (c= client 'client' ( client_entities )? ( type_mark | ) s= supplier ( semantic_label )? )
            // BON.g:610:3: c= client 'client' ( client_entities )? ( type_mark | ) s= supplier ( semantic_label )?
            {
            pushFollow(FOLLOW_client_in_client_relation3909);
            c=client();

            state._fsp--;
            if (state.failed) return relation;
            match(input,64,FOLLOW_64_in_client_relation3911); if (state.failed) return relation;
            // BON.g:611:3: ( client_entities )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==62) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // BON.g:611:4: client_entities
                    {
                    pushFollow(FOLLOW_client_entities_in_client_relation3916);
                    client_entities65=client_entities();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       entities = client_entities65; 
                    }

                    }
                    break;

            }

            // BON.g:612:3: ( type_mark | )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==34||LA82_0==69) ) {
                alt82=1;
            }
            else if ( (LA82_0==IDENTIFIER) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return relation;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // BON.g:612:5: type_mark
                    {
                    pushFollow(FOLLOW_type_mark_in_client_relation3928);
                    type_mark66=type_mark();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       mark = (type_mark66!=null?type_mark66.mark:null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:615:4: 
                    {
                    if ( state.backtracking==0 ) {
                       mark = Constants.NO_TYPE_MARK; 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_supplier_in_client_relation3954);
            s=supplier();

            state._fsp--;
            if (state.failed) return relation;
            if ( state.backtracking==0 ) {
               end = (s!=null?((Token)s.stop):null); 
            }
            // BON.g:619:3: ( semantic_label )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==MANIFEST_STRING) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // BON.g:619:4: semantic_label
                    {
                    pushFollow(FOLLOW_semantic_label_in_client_relation3964);
                    semantic_label67=semantic_label();

                    state._fsp--;
                    if (state.failed) return relation;
                    if ( state.backtracking==0 ) {
                       semanticLabel = (semantic_label67!=null?semantic_label67.label:null); end = (semantic_label67!=null?((Token)semantic_label67.stop):null); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               relation = ClientRelation.mk((c!=null?c.ref:null),(s!=null?s.ref:null),entities,mark,semanticLabel,getSLoc((c!=null?((Token)c.start):null),end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relation;
    }
    // $ANTLR end "client_relation"


    // $ANTLR start "client_entities"
    // BON.g:623:1: client_entities returns [ClientEntityExpression entities] : '{' cee= client_entity_expression '}' ;
    public final ClientEntityExpression client_entities() throws RecognitionException {
        ClientEntityExpression entities = null;

        ClientEntityExpression cee = null;


        try {
            // BON.g:623:59: ( '{' cee= client_entity_expression '}' )
            // BON.g:624:3: '{' cee= client_entity_expression '}'
            {
            match(input,62,FOLLOW_62_in_client_entities4005); if (state.failed) return entities;
            pushFollow(FOLLOW_client_entity_expression_in_client_entities4009);
            cee=client_entity_expression();

            state._fsp--;
            if (state.failed) return entities;
            match(input,63,FOLLOW_63_in_client_entities4011); if (state.failed) return entities;
            if ( state.backtracking==0 ) {
               entities = cee; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entities;
    }
    // $ANTLR end "client_entities"


    // $ANTLR start "client_entity_expression"
    // BON.g:628:1: client_entity_expression returns [ClientEntityExpression entities] : (cel= client_entity_list | m= multiplicity );
    public final ClientEntityExpression client_entity_expression() throws RecognitionException {
        ClientEntityExpression entities = null;

        BONParser.client_entity_list_return cel = null;

        BONParser.multiplicity_return m = null;


        try {
            // BON.g:628:68: (cel= client_entity_list | m= multiplicity )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDENTIFIER||LA84_0==42||(LA84_0>=65 && LA84_0<=66)||LA84_0==68||LA84_0==78||LA84_0==80) ) {
                alt84=1;
            }
            else if ( (LA84_0==INTEGER) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return entities;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // BON.g:629:4: cel= client_entity_list
                    {
                    pushFollow(FOLLOW_client_entity_list_in_client_entity_expression4050);
                    cel=client_entity_list();

                    state._fsp--;
                    if (state.failed) return entities;
                    if ( state.backtracking==0 ) {
                       entities = ClientEntityList.mk((cel!=null?cel.entities:null),getSLoc((cel!=null?((Token)cel.start):null),(cel!=null?((Token)cel.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:631:4: m= multiplicity
                    {
                    pushFollow(FOLLOW_multiplicity_in_client_entity_expression4063);
                    m=multiplicity();

                    state._fsp--;
                    if (state.failed) return entities;
                    if ( state.backtracking==0 ) {
                       entities = Multiplicity.mk((m!=null?m.num:null), getSLoc((m!=null?((Token)m.start):null),(m!=null?((Token)m.stop):null))); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entities;
    }
    // $ANTLR end "client_entity_expression"

    public static class client_entity_list_return extends ParserRuleReturnScope {
        public List<ClientEntity> entities;
    };

    // $ANTLR start "client_entity_list"
    // BON.g:635:1: client_entity_list returns [List<ClientEntity> entities] : ce= client_entity ( ',' c= client_entity )* ;
    public final BONParser.client_entity_list_return client_entity_list() throws RecognitionException {
        BONParser.client_entity_list_return retval = new BONParser.client_entity_list_return();
        retval.start = input.LT(1);

        ClientEntity ce = null;

        ClientEntity c = null;


        try {
            // BON.g:635:58: (ce= client_entity ( ',' c= client_entity )* )
            // BON.g:636:3: ce= client_entity ( ',' c= client_entity )*
            {
            if ( state.backtracking==0 ) {
               retval.entities = createList(); 
            }
            pushFollow(FOLLOW_client_entity_in_client_entity_list4116);
            ce=client_entity();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.entities.add(ce); 
            }
            // BON.g:639:3: ( ',' c= client_entity )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==35) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // BON.g:639:4: ',' c= client_entity
            	    {
            	    match(input,35,FOLLOW_35_in_client_entity_list4125); if (state.failed) return retval;
            	    pushFollow(FOLLOW_client_entity_in_client_entity_list4129);
            	    c=client_entity();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.entities.add(c); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "client_entity_list"


    // $ANTLR start "client_entity"
    // BON.g:648:1: client_entity returns [ClientEntity entity] : ( prefix | infix | supplier_indirection | parent_indirection );
    public final ClientEntity client_entity() throws RecognitionException {
        ClientEntity entity = null;

        SupplierIndirection supplier_indirection68 = null;

        ParentIndirection parent_indirection69 = null;


        try {
            // BON.g:648:45: ( prefix | infix | supplier_indirection | parent_indirection )
            int alt86=4;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // BON.g:649:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_client_entity4180);
                    prefix();

                    state._fsp--;
                    if (state.failed) return entity;

                    }
                    break;
                case 2 :
                    // BON.g:650:4: infix
                    {
                    pushFollow(FOLLOW_infix_in_client_entity4185);
                    infix();

                    state._fsp--;
                    if (state.failed) return entity;

                    }
                    break;
                case 3 :
                    // BON.g:651:4: supplier_indirection
                    {
                    pushFollow(FOLLOW_supplier_indirection_in_client_entity4190);
                    supplier_indirection68=supplier_indirection();

                    state._fsp--;
                    if (state.failed) return entity;
                    if ( state.backtracking==0 ) {
                       entity = supplier_indirection68; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:653:4: parent_indirection
                    {
                    pushFollow(FOLLOW_parent_indirection_in_client_entity4201);
                    parent_indirection69=parent_indirection();

                    state._fsp--;
                    if (state.failed) return entity;
                    if ( state.backtracking==0 ) {
                       entity = parent_indirection69; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return entity;
    }
    // $ANTLR end "client_entity"


    // $ANTLR start "supplier_indirection"
    // BON.g:657:1: supplier_indirection returns [SupplierIndirection indirection] : (ifp= indirection_feature_part ':' )? gi= generic_indirection ;
    public final SupplierIndirection supplier_indirection() throws RecognitionException {
        SupplierIndirection indirection = null;

        BONParser.indirection_feature_part_return ifp = null;

        BONParser.generic_indirection_return gi = null;


        IndirectionFeaturePart part = null; Token start = null; 
        try {
            // BON.g:659:1: ( (ifp= indirection_feature_part ':' )? gi= generic_indirection )
            // BON.g:660:3: (ifp= indirection_feature_part ':' )? gi= generic_indirection
            {
            // BON.g:660:3: (ifp= indirection_feature_part ':' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==IDENTIFIER) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==34) ) {
                    alt87=1;
                }
            }
            else if ( (LA87_0==42||LA87_0==78||LA87_0==80) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // BON.g:660:4: ifp= indirection_feature_part ':'
                    {
                    pushFollow(FOLLOW_indirection_feature_part_in_supplier_indirection4247);
                    ifp=indirection_feature_part();

                    state._fsp--;
                    if (state.failed) return indirection;
                    if ( state.backtracking==0 ) {
                       start = (ifp!=null?((Token)ifp.start):null); 
                    }
                    match(input,34,FOLLOW_34_in_supplier_indirection4251); if (state.failed) return indirection;

                    }
                    break;

            }

            pushFollow(FOLLOW_generic_indirection_in_supplier_indirection4260);
            gi=generic_indirection();

            state._fsp--;
            if (state.failed) return indirection;
            if ( state.backtracking==0 ) {
               if (start==null) start=(gi!=null?((Token)gi.start):null); 
            }
            if ( state.backtracking==0 ) {
               indirection = SupplierIndirection.mk(part, (gi!=null?gi.indirection:null),getSLoc(start,(gi!=null?((Token)gi.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return indirection;
    }
    // $ANTLR end "supplier_indirection"

    public static class indirection_feature_part_return extends ParserRuleReturnScope {
        public IndirectionFeaturePart part;
    };

    // $ANTLR start "indirection_feature_part"
    // BON.g:666:1: indirection_feature_part returns [IndirectionFeaturePart part] : ( feature_name | indirection_feature_list );
    public final BONParser.indirection_feature_part_return indirection_feature_part() throws RecognitionException {
        BONParser.indirection_feature_part_return retval = new BONParser.indirection_feature_part_return();
        retval.start = input.LT(1);

        BONParser.feature_name_return feature_name70 = null;

        IndirectionFeatureList indirection_feature_list71 = null;


        try {
            // BON.g:666:64: ( feature_name | indirection_feature_list )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==IDENTIFIER||LA88_0==78||LA88_0==80) ) {
                alt88=1;
            }
            else if ( (LA88_0==42) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // BON.g:667:4: feature_name
                    {
                    pushFollow(FOLLOW_feature_name_in_indirection_feature_part4309);
                    feature_name70=feature_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.part = (feature_name70!=null?feature_name70.name:null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:669:4: indirection_feature_list
                    {
                    pushFollow(FOLLOW_indirection_feature_list_in_indirection_feature_part4320);
                    indirection_feature_list71=indirection_feature_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.part = indirection_feature_list71; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indirection_feature_part"


    // $ANTLR start "indirection_feature_list"
    // BON.g:673:1: indirection_feature_list returns [IndirectionFeatureList list] : s= '(' fnl= feature_name_list e= ')' ;
    public final IndirectionFeatureList indirection_feature_list() throws RecognitionException {
        IndirectionFeatureList list = null;

        Token s=null;
        Token e=null;
        BONParser.feature_name_list_return fnl = null;


        try {
            // BON.g:673:64: (s= '(' fnl= feature_name_list e= ')' )
            // BON.g:674:3: s= '(' fnl= feature_name_list e= ')'
            {
            s=(Token)match(input,42,FOLLOW_42_in_indirection_feature_list4370); if (state.failed) return list;
            pushFollow(FOLLOW_feature_name_list_in_indirection_feature_list4374);
            fnl=feature_name_list();

            state._fsp--;
            if (state.failed) return list;
            e=(Token)match(input,43,FOLLOW_43_in_indirection_feature_list4378); if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list = IndirectionFeatureList.mk((fnl!=null?fnl.list:null),getSLoc(s,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "indirection_feature_list"


    // $ANTLR start "parent_indirection"
    // BON.g:678:1: parent_indirection returns [ParentIndirection indirection] : '->' gi= generic_indirection ;
    public final ParentIndirection parent_indirection() throws RecognitionException {
        ParentIndirection indirection = null;

        BONParser.generic_indirection_return gi = null;


        try {
            // BON.g:678:60: ( '->' gi= generic_indirection )
            // BON.g:679:3: '->' gi= generic_indirection
            {
            match(input,65,FOLLOW_65_in_parent_indirection4426); if (state.failed) return indirection;
            pushFollow(FOLLOW_generic_indirection_in_parent_indirection4430);
            gi=generic_indirection();

            state._fsp--;
            if (state.failed) return indirection;
            if ( state.backtracking==0 ) {
               indirection = ParentIndirection.mk((gi!=null?gi.indirection:null),getSLoc((gi!=null?((Token)gi.start):null),(gi!=null?((Token)gi.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return indirection;
    }
    // $ANTLR end "parent_indirection"

    public static class generic_indirection_return extends ParserRuleReturnScope {
        public GenericIndirection indirection;
    };

    // $ANTLR start "generic_indirection"
    // BON.g:683:1: generic_indirection returns [GenericIndirection indirection] : ie= indirection_element ;
    public final BONParser.generic_indirection_return generic_indirection() throws RecognitionException {
        BONParser.generic_indirection_return retval = new BONParser.generic_indirection_return();
        retval.start = input.LT(1);

        BONParser.indirection_element_return ie = null;


        try {
            // BON.g:685:62: (ie= indirection_element )
            // BON.g:689:5: ie= indirection_element
            {
            pushFollow(FOLLOW_indirection_element_in_generic_indirection4482);
            ie=indirection_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.indirection = GenericIndirection.mk((ie!=null?ie.el:null),getSLoc((ie!=null?((Token)ie.start):null),(ie!=null?((Token)ie.stop):null))); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "generic_indirection"


    // $ANTLR start "named_indirection"
    // BON.g:693:1: named_indirection returns [NamedIndirection indirection] : (cn= class_name '[' il= indirection_list e= ']' | s= '[' indirection_list ']' );
    public final NamedIndirection named_indirection() throws RecognitionException {
        NamedIndirection indirection = null;

        Token e=null;
        Token s=null;
        BONParser.class_name_return cn = null;

        List<IndirectionElement> il = null;


        try {
            // BON.g:693:58: (cn= class_name '[' il= indirection_list e= ']' | s= '[' indirection_list ']' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==IDENTIFIER) ) {
                alt89=1;
            }
            else if ( (LA89_0==66) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return indirection;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // BON.g:694:4: cn= class_name '[' il= indirection_list e= ']'
                    {
                    pushFollow(FOLLOW_class_name_in_named_indirection4527);
                    cn=class_name();

                    state._fsp--;
                    if (state.failed) return indirection;
                    match(input,66,FOLLOW_66_in_named_indirection4529); if (state.failed) return indirection;
                    pushFollow(FOLLOW_indirection_list_in_named_indirection4533);
                    il=indirection_list();

                    state._fsp--;
                    if (state.failed) return indirection;
                    e=(Token)match(input,67,FOLLOW_67_in_named_indirection4537); if (state.failed) return indirection;
                    if ( state.backtracking==0 ) {
                       indirection = NamedIndirection.mk((cn!=null?cn.name:null), il, getSLoc((cn!=null?((Token)cn.start):null),e)); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:697:4: s= '[' indirection_list ']'
                    {
                    s=(Token)match(input,66,FOLLOW_66_in_named_indirection4552); if (state.failed) return indirection;
                    pushFollow(FOLLOW_indirection_list_in_named_indirection4554);
                    indirection_list();

                    state._fsp--;
                    if (state.failed) return indirection;
                    match(input,67,FOLLOW_67_in_named_indirection4556); if (state.failed) return indirection;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSLoc(s), "class name", "before indirection list", true)); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return indirection;
    }
    // $ANTLR end "named_indirection"


    // $ANTLR start "indirection_list"
    // BON.g:701:1: indirection_list returns [List<IndirectionElement> list] : i1= indirection_element ( ',' i= indirection_element )* ;
    public final List<IndirectionElement> indirection_list() throws RecognitionException {
        List<IndirectionElement> list = null;

        BONParser.indirection_element_return i1 = null;

        BONParser.indirection_element_return i = null;


        try {
            // BON.g:701:58: (i1= indirection_element ( ',' i= indirection_element )* )
            // BON.g:702:3: i1= indirection_element ( ',' i= indirection_element )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_indirection_element_in_indirection_list4603);
            i1=indirection_element();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add((i1!=null?i1.el:null)); 
            }
            // BON.g:705:3: ( ',' i= indirection_element )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==35) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // BON.g:705:4: ',' i= indirection_element
            	    {
            	    match(input,35,FOLLOW_35_in_indirection_list4613); if (state.failed) return list;
            	    pushFollow(FOLLOW_indirection_element_in_indirection_list4617);
            	    i=indirection_element();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add((i!=null?i.el:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "indirection_list"

    public static class indirection_element_return extends ParserRuleReturnScope {
        public IndirectionElement el;
    };

    // $ANTLR start "indirection_element"
    // BON.g:710:1: indirection_element returns [IndirectionElement el] : (t= '...' | named_indirection | class_name );
    public final BONParser.indirection_element_return indirection_element() throws RecognitionException {
        BONParser.indirection_element_return retval = new BONParser.indirection_element_return();
        retval.start = input.LT(1);

        Token t=null;
        NamedIndirection named_indirection72 = null;

        BONParser.class_name_return class_name73 = null;


        try {
            // BON.g:710:53: (t= '...' | named_indirection | class_name )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt91=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA91_2 = input.LA(2);

                if ( (LA91_2==35||LA91_2==63||LA91_2==67) ) {
                    alt91=3;
                }
                else if ( (LA91_2==66) ) {
                    alt91=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt91=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // BON.g:711:4: t= '...'
                    {
                    t=(Token)match(input,68,FOLLOW_68_in_indirection_element4671); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.el = CompactedIndirectionElementImpl.mk(getSLoc(t)); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:713:4: named_indirection
                    {
                    pushFollow(FOLLOW_named_indirection_in_indirection_element4681);
                    named_indirection72=named_indirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.el = named_indirection72; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:715:4: class_name
                    {
                    pushFollow(FOLLOW_class_name_in_indirection_element4692);
                    class_name73=class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.el = (class_name73!=null?class_name73.name:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indirection_element"

    public static class type_mark_return extends ParserRuleReturnScope {
        public TypeMark mark;
    };

    // $ANTLR start "type_mark"
    // BON.g:720:1: type_mark returns [TypeMark mark] : (m= ':' | m= ':{' | sm= shared_mark );
    public final BONParser.type_mark_return type_mark() throws RecognitionException {
        BONParser.type_mark_return retval = new BONParser.type_mark_return();
        retval.start = input.LT(1);

        Token m=null;
        TypeMark sm = null;


        try {
            // BON.g:720:35: (m= ':' | m= ':{' | sm= shared_mark )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==34) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==42) ) {
                    alt92=3;
                }
                else if ( (LA92_1==IDENTIFIER) ) {
                    alt92=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA92_0==69) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // BON.g:721:4: m= ':'
                    {
                    m=(Token)match(input,34,FOLLOW_34_in_type_mark4737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.mark = TypeMark.mk(TypeMark.Mark.HASTYPE, null, getSLoc(m)); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:723:4: m= ':{'
                    {
                    m=(Token)match(input,69,FOLLOW_69_in_type_mark4750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.mark = TypeMark.mk(TypeMark.Mark.AGGREGATE, null, getSLoc(m)); 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:725:4: sm= shared_mark
                    {
                    pushFollow(FOLLOW_shared_mark_in_type_mark4763);
                    sm=shared_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.mark = sm; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_mark"


    // $ANTLR start "shared_mark"
    // BON.g:729:1: shared_mark returns [TypeMark mark] : a= ':' '(' m= multiplicity b= ')' ;
    public final TypeMark shared_mark() throws RecognitionException {
        TypeMark mark = null;

        Token a=null;
        Token b=null;
        BONParser.multiplicity_return m = null;


        try {
            // BON.g:729:37: (a= ':' '(' m= multiplicity b= ')' )
            // BON.g:730:3: a= ':' '(' m= multiplicity b= ')'
            {
            a=(Token)match(input,34,FOLLOW_34_in_shared_mark4809); if (state.failed) return mark;
            match(input,42,FOLLOW_42_in_shared_mark4811); if (state.failed) return mark;
            pushFollow(FOLLOW_multiplicity_in_shared_mark4815);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return mark;
            b=(Token)match(input,43,FOLLOW_43_in_shared_mark4819); if (state.failed) return mark;
            if ( state.backtracking==0 ) {
               mark = TypeMark.mk(TypeMark.Mark.SHAREDMARK, m.num, getSLoc(a, b)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return mark;
    }
    // $ANTLR end "shared_mark"

    public static class child_return extends ParserRuleReturnScope {
        public StaticRef ref;
    };

    // $ANTLR start "child"
    // BON.g:734:1: child returns [StaticRef ref] : s= static_ref ;
    public final BONParser.child_return child() throws RecognitionException {
        BONParser.child_return retval = new BONParser.child_return();
        retval.start = input.LT(1);

        StaticRef s = null;


        try {
            // BON.g:736:31: (s= static_ref )
            // BON.g:737:3: s= static_ref
            {
            pushFollow(FOLLOW_static_ref_in_child4843);
            s=static_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.ref = s; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "child"

    public static class parent_return extends ParserRuleReturnScope {
        public StaticRef ref;
    };

    // $ANTLR start "parent"
    // BON.g:741:1: parent returns [StaticRef ref] : s= static_ref ;
    public final BONParser.parent_return parent() throws RecognitionException {
        BONParser.parent_return retval = new BONParser.parent_return();
        retval.start = input.LT(1);

        StaticRef s = null;


        try {
            // BON.g:741:32: (s= static_ref )
            // BON.g:742:3: s= static_ref
            {
            pushFollow(FOLLOW_static_ref_in_parent4871);
            s=static_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.ref = s; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parent"

    public static class client_return extends ParserRuleReturnScope {
        public StaticRef ref;
    };

    // $ANTLR start "client"
    // BON.g:746:1: client returns [StaticRef ref] : s= static_ref ;
    public final BONParser.client_return client() throws RecognitionException {
        BONParser.client_return retval = new BONParser.client_return();
        retval.start = input.LT(1);

        StaticRef s = null;


        try {
            // BON.g:746:32: (s= static_ref )
            // BON.g:747:3: s= static_ref
            {
            pushFollow(FOLLOW_static_ref_in_client4909);
            s=static_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.ref = s; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "client"

    public static class supplier_return extends ParserRuleReturnScope {
        public StaticRef ref;
    };

    // $ANTLR start "supplier"
    // BON.g:751:1: supplier returns [StaticRef ref] : s= static_ref ;
    public final BONParser.supplier_return supplier() throws RecognitionException {
        BONParser.supplier_return retval = new BONParser.supplier_return();
        retval.start = input.LT(1);

        StaticRef s = null;


        try {
            // BON.g:751:34: (s= static_ref )
            // BON.g:752:3: s= static_ref
            {
            pushFollow(FOLLOW_static_ref_in_supplier4939);
            s=static_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.ref = s; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "supplier"


    // $ANTLR start "static_ref"
    // BON.g:756:1: static_ref returns [StaticRef ref] : (s= static_component_name | cp= cluster_prefix s= static_component_name );
    public final StaticRef static_ref() throws RecognitionException {
        StaticRef ref = null;

        BONParser.static_component_name_return s = null;

        BONParser.cluster_prefix_return cp = null;


        try {
            // BON.g:756:36: (s= static_component_name | cp= cluster_prefix s= static_component_name )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==IDENTIFIER) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==70) ) {
                    alt93=2;
                }
                else if ( ((LA93_1>=MANIFEST_STRING && LA93_1<=IDENTIFIER)||(LA93_1>=25 && LA93_1<=27)||LA93_1==38||(LA93_1>=57 && LA93_1<=59)||LA93_1==64) ) {
                    alt93=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ref;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ref;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // BON.g:757:4: s= static_component_name
                    {
                    pushFollow(FOLLOW_static_component_name_in_static_ref4973);
                    s=static_component_name();

                    state._fsp--;
                    if (state.failed) return ref;
                    if ( state.backtracking==0 ) {
                       List<StaticRefPart> empty = emptyList(); ref = StaticRef.mk(empty, (s!=null?s.ref:null), getSLoc((s!=null?((Token)s.start):null),(s!=null?((Token)s.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:760:4: cp= cluster_prefix s= static_component_name
                    {
                    pushFollow(FOLLOW_cluster_prefix_in_static_ref4989);
                    cp=cluster_prefix();

                    state._fsp--;
                    if (state.failed) return ref;
                    pushFollow(FOLLOW_static_component_name_in_static_ref4993);
                    s=static_component_name();

                    state._fsp--;
                    if (state.failed) return ref;
                    if ( state.backtracking==0 ) {
                       ref = StaticRef.mk((cp!=null?cp.prefix:null), (s!=null?s.ref:null), getSLoc((cp!=null?((Token)cp.start):null),(s!=null?((Token)s.stop):null))); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "static_ref"

    public static class cluster_prefix_return extends ParserRuleReturnScope {
        public List<StaticRefPart> prefix;
    };

    // $ANTLR start "cluster_prefix"
    // BON.g:764:1: cluster_prefix returns [List<StaticRefPart> prefix] : c1= cluster_name '.' (c= cluster_name '.' )* ;
    public final BONParser.cluster_prefix_return cluster_prefix() throws RecognitionException {
        BONParser.cluster_prefix_return retval = new BONParser.cluster_prefix_return();
        retval.start = input.LT(1);

        BONParser.cluster_name_return c1 = null;

        BONParser.cluster_name_return c = null;


        try {
            // BON.g:764:53: (c1= cluster_name '.' (c= cluster_name '.' )* )
            // BON.g:765:3: c1= cluster_name '.' (c= cluster_name '.' )*
            {
            if ( state.backtracking==0 ) {
               retval.prefix = createList(); 
            }
            pushFollow(FOLLOW_cluster_name_in_cluster_prefix5032);
            c1=cluster_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.prefix.add(StaticRefPart.mk((c1!=null?c1.name:null), getSLoc((c1!=null?((Token)c1.start):null),(c1!=null?((Token)c1.stop):null)))); 
            }
            match(input,70,FOLLOW_70_in_cluster_prefix5041); if (state.failed) return retval;
            // BON.g:769:3: (c= cluster_name '.' )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==IDENTIFIER) ) {
                    int LA94_1 = input.LA(2);

                    if ( (LA94_1==70) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // BON.g:769:5: c= cluster_name '.'
            	    {
            	    pushFollow(FOLLOW_cluster_name_in_cluster_prefix5050);
            	    c=cluster_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,70,FOLLOW_70_in_cluster_prefix5052); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.prefix.add(StaticRefPart.mk((c!=null?c.name:null), getSLoc((c!=null?((Token)c.start):null),(c!=null?((Token)c.stop):null)))); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cluster_prefix"

    public static class static_component_name_return extends ParserRuleReturnScope {
        public StaticRefPart ref;
    };

    // $ANTLR start "static_component_name"
    // BON.g:776:1: static_component_name returns [StaticRefPart ref] : i= IDENTIFIER ;
    public final BONParser.static_component_name_return static_component_name() throws RecognitionException {
        BONParser.static_component_name_return retval = new BONParser.static_component_name_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:776:51: (i= IDENTIFIER )
            // BON.g:777:3: i= IDENTIFIER
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_static_component_name5084); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.ref = StaticRefPart.mk((i!=null?i.getText():null), getSLoc(i)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_component_name"

    public static class multiplicity_return extends ParserRuleReturnScope {
        public Integer num;
    };

    // $ANTLR start "multiplicity"
    // BON.g:781:1: multiplicity returns [Integer num] : i= INTEGER ;
    public final BONParser.multiplicity_return multiplicity() throws RecognitionException {
        BONParser.multiplicity_return retval = new BONParser.multiplicity_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:781:36: (i= INTEGER )
            // BON.g:782:3: i= INTEGER
            {
            i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_multiplicity5128); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.num = new Integer((i!=null?i.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicity"

    public static class semantic_label_return extends ParserRuleReturnScope {
        public String label;
    };

    // $ANTLR start "semantic_label"
    // BON.g:786:1: semantic_label returns [String label] : m= MANIFEST_STRING ;
    public final BONParser.semantic_label_return semantic_label() throws RecognitionException {
        BONParser.semantic_label_return retval = new BONParser.semantic_label_return();
        retval.start = input.LT(1);

        Token m=null;

        try {
            // BON.g:786:39: (m= MANIFEST_STRING )
            // BON.g:787:3: m= MANIFEST_STRING
            {
            m=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_semantic_label5164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.label = (m!=null?m.getText():null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "semantic_label"

    public static class class_interface_return extends ParserRuleReturnScope {
        public ClassInterface ci;
    };

    // $ANTLR start "class_interface"
    // BON.g:791:1: class_interface returns [ClassInterface ci] : (cisi= class_interface_start_indexing | cisp= class_interface_start_inherit | cisf= class_interface_start_features | cisv= class_interface_start_invariant );
    public final BONParser.class_interface_return class_interface() throws RecognitionException {
        BONParser.class_interface_return retval = new BONParser.class_interface_return();
        retval.start = input.LT(1);

        ClassInterface cisi = null;

        ClassInterface cisp = null;

        ClassInterface cisf = null;

        ClassInterface cisv = null;


        try {
            // BON.g:795:45: (cisi= class_interface_start_indexing | cisp= class_interface_start_inherit | cisf= class_interface_start_features | cisv= class_interface_start_invariant )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt95=1;
                }
                break;
            case 38:
                {
                alt95=2;
                }
                break;
            case 72:
                {
                alt95=3;
                }
                break;
            case 71:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // BON.g:796:5: cisi= class_interface_start_indexing
                    {
                    pushFollow(FOLLOW_class_interface_start_indexing_in_class_interface5190);
                    cisi=class_interface_start_indexing();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.ci =cisi;
                    }

                    }
                    break;
                case 2 :
                    // BON.g:797:5: cisp= class_interface_start_inherit
                    {
                    pushFollow(FOLLOW_class_interface_start_inherit_in_class_interface5200);
                    cisp=class_interface_start_inherit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.ci =cisp;
                    }

                    }
                    break;
                case 3 :
                    // BON.g:798:5: cisf= class_interface_start_features
                    {
                    pushFollow(FOLLOW_class_interface_start_features_in_class_interface5210);
                    cisf=class_interface_start_features();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.ci =cisf;
                    }

                    }
                    break;
                case 4 :
                    // BON.g:799:5: cisv= class_interface_start_invariant
                    {
                    pushFollow(FOLLOW_class_interface_start_invariant_in_class_interface5220);
                    cisv=class_interface_start_invariant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.ci =cisv;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_interface"


    // $ANTLR start "class_interface_start_indexing"
    // BON.g:802:1: class_interface_start_indexing returns [ClassInterface ci] : indexing (pcl= parent_class_list )? ( features )? (inv= class_invariant )? e= 'end' ;
    public final ClassInterface class_interface_start_indexing() throws RecognitionException {
        ClassInterface ci = null;

        Token e=null;
        BONParser.parent_class_list_return pcl = null;

        BONParser.class_invariant_return inv = null;

        BONParser.indexing_return indexing74 = null;

        BONParser.features_return features75 = null;


         Indexing indexing = null; List<Type> parents = emptyList(); 
                List<Expression> invariant = emptyList(); Token start = null; 
                List<Feature> features = emptyList(); 
        try {
            // BON.g:806:1: ( indexing (pcl= parent_class_list )? ( features )? (inv= class_invariant )? e= 'end' )
            // BON.g:807:3: indexing (pcl= parent_class_list )? ( features )? (inv= class_invariant )? e= 'end'
            {
            pushFollow(FOLLOW_indexing_in_class_interface_start_indexing5242);
            indexing74=indexing();

            state._fsp--;
            if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               indexing = (indexing74!=null?indexing74.indexing:null); start = (indexing74!=null?((Token)indexing74.start):null); 
            }
            // BON.g:808:3: (pcl= parent_class_list )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==38) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // BON.g:808:6: pcl= parent_class_list
                    {
                    pushFollow(FOLLOW_parent_class_list_in_class_interface_start_indexing5254);
                    pcl=parent_class_list();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       parents = (pcl!=null?pcl.parents:null); if (start == null) start = (pcl!=null?((Token)pcl.start):null); 
                    }

                    }
                    break;

            }

            // BON.g:809:3: ( features )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==72) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // BON.g:809:7: features
                    {
                    pushFollow(FOLLOW_features_in_class_interface_start_indexing5267);
                    features75=features();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       features = (features75!=null?features75.features:null); 
                    }

                    }
                    break;

            }

            // BON.g:810:3: (inv= class_invariant )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==71) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // BON.g:810:6: inv= class_invariant
                    {
                    pushFollow(FOLLOW_class_invariant_in_class_interface_start_indexing5281);
                    inv=class_invariant();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       invariant = (inv!=null?inv.invariant:null); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_class_interface_start_indexing5292); if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               ci = ClassInterface.mk(features, parents, invariant, indexing, getSLoc(start, e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ci;
    }
    // $ANTLR end "class_interface_start_indexing"


    // $ANTLR start "class_interface_start_inherit"
    // BON.g:815:1: class_interface_start_inherit returns [ClassInterface ci] : pcl= parent_class_list ( features )? (inv= class_invariant )? e= 'end' ;
    public final ClassInterface class_interface_start_inherit() throws RecognitionException {
        ClassInterface ci = null;

        Token e=null;
        BONParser.parent_class_list_return pcl = null;

        BONParser.class_invariant_return inv = null;

        BONParser.features_return features76 = null;


         Indexing indexing = null; List<Type> parents = emptyList(); 
                List<Expression> invariant = emptyList(); Token start = null; 
                List<Feature> features = emptyList(); 
        try {
            // BON.g:819:1: (pcl= parent_class_list ( features )? (inv= class_invariant )? e= 'end' )
            // BON.g:820:3: pcl= parent_class_list ( features )? (inv= class_invariant )? e= 'end'
            {
            pushFollow(FOLLOW_parent_class_list_in_class_interface_start_inherit5318);
            pcl=parent_class_list();

            state._fsp--;
            if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               start = (pcl!=null?((Token)pcl.start):null); 
            }
            // BON.g:821:3: ( features )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==72) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // BON.g:821:7: features
                    {
                    pushFollow(FOLLOW_features_in_class_interface_start_inherit5328);
                    features76=features();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       features = (features76!=null?features76.features:null); 
                    }

                    }
                    break;

            }

            // BON.g:822:3: (inv= class_invariant )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==71) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // BON.g:822:6: inv= class_invariant
                    {
                    pushFollow(FOLLOW_class_invariant_in_class_interface_start_inherit5342);
                    inv=class_invariant();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       invariant = (inv!=null?inv.invariant:null); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_class_interface_start_inherit5353); if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               ci = ClassInterface.mk(features, (pcl!=null?pcl.parents:null), invariant, indexing, getSLoc(start, e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ci;
    }
    // $ANTLR end "class_interface_start_inherit"


    // $ANTLR start "class_interface_start_features"
    // BON.g:827:1: class_interface_start_features returns [ClassInterface ci] : features (inv= class_invariant )? e= 'end' ;
    public final ClassInterface class_interface_start_features() throws RecognitionException {
        ClassInterface ci = null;

        Token e=null;
        BONParser.class_invariant_return inv = null;

        BONParser.features_return features77 = null;


         Indexing indexing = null; List<Type> parents = emptyList(); 
                List<Expression> invariant = emptyList(); Token start = null; 
        try {
            // BON.g:830:1: ( features (inv= class_invariant )? e= 'end' )
            // BON.g:831:3: features (inv= class_invariant )? e= 'end'
            {
            pushFollow(FOLLOW_features_in_class_interface_start_features5377);
            features77=features();

            state._fsp--;
            if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               start = (features77!=null?((Token)features77.start):null); 
            }
            // BON.g:832:3: (inv= class_invariant )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==71) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // BON.g:832:6: inv= class_invariant
                    {
                    pushFollow(FOLLOW_class_invariant_in_class_interface_start_features5388);
                    inv=class_invariant();

                    state._fsp--;
                    if (state.failed) return ci;
                    if ( state.backtracking==0 ) {
                       invariant = (inv!=null?inv.invariant:null); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_class_interface_start_features5399); if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               ci = ClassInterface.mk((features77!=null?features77.features:null), parents, invariant, indexing, getSLoc(start, e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ci;
    }
    // $ANTLR end "class_interface_start_features"


    // $ANTLR start "class_interface_start_invariant"
    // BON.g:837:1: class_interface_start_invariant returns [ClassInterface ci] : inv= class_invariant e= 'end' ;
    public final ClassInterface class_interface_start_invariant() throws RecognitionException {
        ClassInterface ci = null;

        Token e=null;
        BONParser.class_invariant_return inv = null;


         Indexing indexing = null; List<Type> parents = emptyList(); 
                Token start = null; List<Feature> features = emptyList(); 
        try {
            // BON.g:840:1: (inv= class_invariant e= 'end' )
            // BON.g:841:3: inv= class_invariant e= 'end'
            {
            pushFollow(FOLLOW_class_invariant_in_class_interface_start_invariant5425);
            inv=class_invariant();

            state._fsp--;
            if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               start = (inv!=null?((Token)inv.start):null); 
            }
            e=(Token)match(input,25,FOLLOW_25_in_class_interface_start_invariant5433); if (state.failed) return ci;
            if ( state.backtracking==0 ) {
               ci = ClassInterface.mk(features, parents, (inv!=null?inv.invariant:null), indexing, getSLoc(start, e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ci;
    }
    // $ANTLR end "class_interface_start_invariant"

    public static class class_invariant_return extends ParserRuleReturnScope {
        public List<Expression> invariant;
    };

    // $ANTLR start "class_invariant"
    // BON.g:846:1: class_invariant returns [List<Expression> invariant] : 'invariant' assertion ;
    public final BONParser.class_invariant_return class_invariant() throws RecognitionException {
        BONParser.class_invariant_return retval = new BONParser.class_invariant_return();
        retval.start = input.LT(1);

        List<Expression> assertion78 = null;


        try {
            // BON.g:846:54: ( 'invariant' assertion )
            // BON.g:847:3: 'invariant' assertion
            {
            match(input,71,FOLLOW_71_in_class_invariant5452); if (state.failed) return retval;
            pushFollow(FOLLOW_assertion_in_class_invariant5454);
            assertion78=assertion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.invariant = assertion78; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_invariant"

    public static class parent_class_list_return extends ParserRuleReturnScope {
        public List<Type> parents;
    };

    // $ANTLR start "parent_class_list"
    // BON.g:851:1: parent_class_list returns [List<Type> parents] : ( 'inherit' c1= class_type ( ';' c= class_type )* ( ';' )? | i= 'inherit' );
    public final BONParser.parent_class_list_return parent_class_list() throws RecognitionException {
        BONParser.parent_class_list_return retval = new BONParser.parent_class_list_return();
        retval.start = input.LT(1);

        Token i=null;
        BONParser.class_type_return c1 = null;

        BONParser.class_type_return c = null;


        try {
            // BON.g:851:48: ( 'inherit' c1= class_type ( ';' c= class_type )* ( ';' )? | i= 'inherit' )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==38) ) {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==25||(LA104_1>=71 && LA104_1<=72)) ) {
                    alt104=2;
                }
                else if ( (LA104_1==IDENTIFIER) ) {
                    alt104=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // BON.g:852:3: 'inherit' c1= class_type ( ';' c= class_type )* ( ';' )?
                    {
                    if ( state.backtracking==0 ) {
                       retval.parents = createList(); 
                    }
                    match(input,38,FOLLOW_38_in_parent_class_list5495); if (state.failed) return retval;
                    pushFollow(FOLLOW_class_type_in_parent_class_list5499);
                    c1=class_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.parents.add((c1!=null?c1.type:null)); 
                    }
                    // BON.g:855:3: ( ';' c= class_type )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==33) ) {
                            int LA102_1 = input.LA(2);

                            if ( (LA102_1==IDENTIFIER) ) {
                                alt102=1;
                            }


                        }


                        switch (alt102) {
                    	case 1 :
                    	    // BON.g:855:4: ';' c= class_type
                    	    {
                    	    match(input,33,FOLLOW_33_in_parent_class_list5510); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_class_type_in_parent_class_list5514);
                    	    c=class_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.parents.add((c!=null?c.type:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    // BON.g:858:3: ( ';' )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==33) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // BON.g:858:3: ';'
                            {
                            match(input,33,FOLLOW_33_in_parent_class_list5531); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // BON.g:860:3: i= 'inherit'
                    {
                    i=(Token)match(input,38,FOLLOW_38_in_parent_class_list5542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       addParseProblem(new MissingElementParseError(getSourceLocation(i), "class name(s)", "in inherits clause", true)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parent_class_list"

    public static class features_return extends ParserRuleReturnScope {
        public List<Feature> features;
    };

    // $ANTLR start "features"
    // BON.g:864:1: features returns [List<Feature> features] : ( feature_clause )+ ;
    public final BONParser.features_return features() throws RecognitionException {
        BONParser.features_return retval = new BONParser.features_return();
        retval.start = input.LT(1);

        Feature feature_clause79 = null;


        try {
            // BON.g:864:43: ( ( feature_clause )+ )
            // BON.g:865:3: ( feature_clause )+
            {
            if ( state.backtracking==0 ) {
               retval.features = createList(); 
            }
            // BON.g:866:3: ( feature_clause )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==72) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // BON.g:866:4: feature_clause
            	    {
            	    pushFollow(FOLLOW_feature_clause_in_features5586);
            	    feature_clause79=feature_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.features.add(feature_clause79); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt105 >= 1 ) break loop105;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "features"


    // $ANTLR start "feature_clause"
    // BON.g:869:1: feature_clause returns [Feature feature] : f= 'feature' (se= selective_export | ) (c= COMMENT )? fs= feature_specifications ;
    public final Feature feature_clause() throws RecognitionException {
        Feature feature = null;

        Token f=null;
        Token c=null;
        List<ClassName> se = null;

        BONParser.feature_specifications_return fs = null;


         String comment = null; List<ClassName> selectiveExport = null; 
        try {
            // BON.g:873:1: (f= 'feature' (se= selective_export | ) (c= COMMENT )? fs= feature_specifications )
            // BON.g:874:3: f= 'feature' (se= selective_export | ) (c= COMMENT )? fs= feature_specifications
            {
            f=(Token)match(input,72,FOLLOW_72_in_feature_clause5627); if (state.failed) return feature;
            // BON.g:875:3: (se= selective_export | )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==62) ) {
                alt106=1;
            }
            else if ( ((LA106_0>=IDENTIFIER && LA106_0<=COMMENT)||(LA106_0>=58 && LA106_0<=59)||LA106_0==73||LA106_0==78||LA106_0==80) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // BON.g:875:6: se= selective_export
                    {
                    pushFollow(FOLLOW_selective_export_in_feature_clause5637);
                    se=selective_export();

                    state._fsp--;
                    if (state.failed) return feature;
                    if ( state.backtracking==0 ) {
                       selectiveExport = se; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:876:6: 
                    {
                    if ( state.backtracking==0 ) {
                       selectiveExport = emptyList(); 
                    }

                    }
                    break;

            }

            // BON.g:878:3: (c= COMMENT )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==COMMENT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // BON.g:878:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_feature_clause5659); if (state.failed) return feature;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_feature_specifications_in_feature_clause5671);
            fs=feature_specifications();

            state._fsp--;
            if (state.failed) return feature;
            if ( state.backtracking==0 ) {
               feature = Feature.mk((fs!=null?fs.specs:null), selectiveExport, comment, getSLoc(f,(fs!=null?((Token)fs.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return feature;
    }
    // $ANTLR end "feature_clause"

    public static class feature_specifications_return extends ParserRuleReturnScope {
        public List<FeatureSpecification> specs;
    };

    // $ANTLR start "feature_specifications"
    // BON.g:883:1: feature_specifications returns [List<FeatureSpecification> specs] : (fs= feature_specification )+ ;
    public final BONParser.feature_specifications_return feature_specifications() throws RecognitionException {
        BONParser.feature_specifications_return retval = new BONParser.feature_specifications_return();
        retval.start = input.LT(1);

        FeatureSpecification fs = null;


        try {
            // BON.g:883:67: ( (fs= feature_specification )+ )
            // BON.g:884:3: (fs= feature_specification )+
            {
            if ( state.backtracking==0 ) {
               retval.specs = createList(); 
            }
            // BON.g:885:3: (fs= feature_specification )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==IDENTIFIER||(LA108_0>=58 && LA108_0<=59)||LA108_0==73||LA108_0==78||LA108_0==80) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // BON.g:885:4: fs= feature_specification
            	    {
            	    pushFollow(FOLLOW_feature_specification_in_feature_specifications5714);
            	    fs=feature_specification();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.specs.add(fs); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt108 >= 1 ) break loop108;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(108, input);
                        throw eee;
                }
                cnt108++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "feature_specifications"


    // $ANTLR start "feature_specification"
    // BON.g:888:1: feature_specification returns [FeatureSpecification spec] : (d= 'deferred' | e= 'effective' | r= 'redefined' | ) fnl= feature_name_list ( has_type )? (rc= rename_clause )? (c= COMMENT )? (fa= feature_arguments | ) (cc= contract_clause | ) ;
    public final FeatureSpecification feature_specification() throws RecognitionException {
        FeatureSpecification spec = null;

        Token d=null;
        Token e=null;
        Token r=null;
        Token c=null;
        BONParser.feature_name_list_return fnl = null;

        BONParser.rename_clause_return rc = null;

        BONParser.feature_arguments_return fa = null;

        BONParser.contract_clause_return cc = null;

        BONParser.has_type_return has_type80 = null;


         FeatureSpecification.Modifier modifier = FeatureSpecification.Modifier.NONE; 
                List<FeatureArgument> args = null; HasType hasType = null; Token start = null; Token end = null;
                RenameClause renaming = null; String comment = null; ContractClause contracts = null;
        try {
            // BON.g:892:1: ( (d= 'deferred' | e= 'effective' | r= 'redefined' | ) fnl= feature_name_list ( has_type )? (rc= rename_clause )? (c= COMMENT )? (fa= feature_arguments | ) (cc= contract_clause | ) )
            // BON.g:893:3: (d= 'deferred' | e= 'effective' | r= 'redefined' | ) fnl= feature_name_list ( has_type )? (rc= rename_clause )? (c= COMMENT )? (fa= feature_arguments | ) (cc= contract_clause | )
            {
            // BON.g:893:3: (d= 'deferred' | e= 'effective' | r= 'redefined' | )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt109=1;
                }
                break;
            case 59:
                {
                alt109=2;
                }
                break;
            case 73:
                {
                alt109=3;
                }
                break;
            case IDENTIFIER:
            case 78:
            case 80:
                {
                alt109=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return spec;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // BON.g:893:6: d= 'deferred'
                    {
                    d=(Token)match(input,58,FOLLOW_58_in_feature_specification5769); if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       modifier = FeatureSpecification.Modifier.DEFERRED; start = d; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:894:6: e= 'effective'
                    {
                    e=(Token)match(input,59,FOLLOW_59_in_feature_specification5782); if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       modifier = FeatureSpecification.Modifier.EFFECTIVE; start = e; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:895:6: r= 'redefined'
                    {
                    r=(Token)match(input,73,FOLLOW_73_in_feature_specification5793); if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       modifier = FeatureSpecification.Modifier.REDEFINED; start = r; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:896:18: 
                    {
                    if ( state.backtracking==0 ) {
                       modifier = FeatureSpecification.Modifier.NONE; 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_feature_name_list_in_feature_specification5824);
            fnl=feature_name_list();

            state._fsp--;
            if (state.failed) return spec;
            if ( state.backtracking==0 ) {
               end=(fnl!=null?((Token)fnl.stop):null); if (start==null) start=(fnl!=null?((Token)fnl.start):null); 
            }
            // BON.g:900:3: ( has_type )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==34||LA110_0==69) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // BON.g:900:4: has_type
                    {
                    pushFollow(FOLLOW_has_type_in_feature_specification5833);
                    has_type80=has_type();

                    state._fsp--;
                    if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       hasType = (has_type80!=null?has_type80.htype:null); end=(has_type80!=null?((Token)has_type80.stop):null); 
                    }

                    }
                    break;

            }

            // BON.g:901:3: (rc= rename_clause )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==62) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // BON.g:901:4: rc= rename_clause
                    {
                    pushFollow(FOLLOW_rename_clause_in_feature_specification5845);
                    rc=rename_clause();

                    state._fsp--;
                    if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       renaming = (rc!=null?rc.rename:null); end=(rc!=null?((Token)rc.stop):null); 
                    }

                    }
                    break;

            }

            // BON.g:902:3: (c= COMMENT )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==COMMENT) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // BON.g:902:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_feature_specification5857); if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); end=c; 
                    }

                    }
                    break;

            }

            // BON.g:903:3: (fa= feature_arguments | )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==65||LA113_0==77) ) {
                alt113=1;
            }
            else if ( (LA113_0==IDENTIFIER||LA113_0==25||(LA113_0>=58 && LA113_0<=59)||(LA113_0>=71 && LA113_0<=75)||LA113_0==78||LA113_0==80) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return spec;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // BON.g:903:6: fa= feature_arguments
                    {
                    pushFollow(FOLLOW_feature_arguments_in_feature_specification5871);
                    fa=feature_arguments();

                    state._fsp--;
                    if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       args = (fa!=null?fa.args:null); end=(fa!=null?((Token)fa.stop):null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:905:6: 
                    {
                    if ( state.backtracking==0 ) {
                       args = emptyList(); 
                    }

                    }
                    break;

            }

            // BON.g:907:3: (cc= contract_clause | )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=74 && LA114_0<=75)) ) {
                alt114=1;
            }
            else if ( (LA114_0==IDENTIFIER||LA114_0==25||(LA114_0>=58 && LA114_0<=59)||(LA114_0>=71 && LA114_0<=73)||LA114_0==78||LA114_0==80) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return spec;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // BON.g:907:6: cc= contract_clause
                    {
                    pushFollow(FOLLOW_contract_clause_in_feature_specification5898);
                    cc=contract_clause();

                    state._fsp--;
                    if (state.failed) return spec;
                    if ( state.backtracking==0 ) {
                       contracts = (cc!=null?cc.contracts:null); end=(cc!=null?((Token)cc.stop):null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:909:6: 
                    {
                    if ( state.backtracking==0 ) {
                       contracts = Constants.EMPTY_CONTRACT; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               spec = FeatureSpecification.mk(modifier, (fnl!=null?fnl.list:null), args, contracts, hasType, renaming, comment, getSLoc(start,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return spec;
    }
    // $ANTLR end "feature_specification"

    public static class has_type_return extends ParserRuleReturnScope {
        public HasType htype;
    };

    // $ANTLR start "has_type"
    // BON.g:914:1: has_type returns [HasType htype] : type_mark type ;
    public final BONParser.has_type_return has_type() throws RecognitionException {
        BONParser.has_type_return retval = new BONParser.has_type_return();
        retval.start = input.LT(1);

        BONParser.type_mark_return type_mark81 = null;

        BONParser.type_return type82 = null;


        try {
            // BON.g:914:34: ( type_mark type )
            // BON.g:915:3: type_mark type
            {
            pushFollow(FOLLOW_type_mark_in_has_type5961);
            type_mark81=type_mark();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_has_type5963);
            type82=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.htype = HasType.mk((type_mark81!=null?type_mark81.mark:null), (type82!=null?type82.type:null), getSLoc((type_mark81!=null?((Token)type_mark81.start):null),(type82!=null?((Token)type82.stop):null))); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "has_type"

    public static class contract_clause_return extends ParserRuleReturnScope {
        public ContractClause contracts;
    };

    // $ANTLR start "contract_clause"
    // BON.g:919:1: contract_clause returns [ContractClause contracts] : cc= contracting_conditions 'end' ;
    public final BONParser.contract_clause_return contract_clause() throws RecognitionException {
        BONParser.contract_clause_return retval = new BONParser.contract_clause_return();
        retval.start = input.LT(1);

        ContractClause cc = null;


        try {
            // BON.g:921:52: (cc= contracting_conditions 'end' )
            // BON.g:922:3: cc= contracting_conditions 'end'
            {
            pushFollow(FOLLOW_contracting_conditions_in_contract_clause5988);
            cc=contracting_conditions();

            state._fsp--;
            if (state.failed) return retval;
            match(input,25,FOLLOW_25_in_contract_clause5990); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.contracts = cc; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "contract_clause"


    // $ANTLR start "contracting_conditions"
    // BON.g:927:1: contracting_conditions returns [ContractClause contracts] : ( (pre= precondition (post= postcondition )? ) | post= postcondition ) ;
    public final ContractClause contracting_conditions() throws RecognitionException {
        ContractClause contracts = null;

        BONParser.precondition_return pre = null;

        BONParser.postcondition_return post = null;


         List<Expression> postC = null; 
        try {
            // BON.g:929:1: ( ( (pre= precondition (post= postcondition )? ) | post= postcondition ) )
            // BON.g:930:3: ( (pre= precondition (post= postcondition )? ) | post= postcondition )
            {
            // BON.g:930:3: ( (pre= precondition (post= postcondition )? ) | post= postcondition )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==74) ) {
                alt116=1;
            }
            else if ( (LA116_0==75) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contracts;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // BON.g:930:6: (pre= precondition (post= postcondition )? )
                    {
                    // BON.g:930:6: (pre= precondition (post= postcondition )? )
                    // BON.g:930:7: pre= precondition (post= postcondition )?
                    {
                    pushFollow(FOLLOW_precondition_in_contracting_conditions6022);
                    pre=precondition();

                    state._fsp--;
                    if (state.failed) return contracts;
                    // BON.g:930:24: (post= postcondition )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==75) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // BON.g:930:25: post= postcondition
                            {
                            pushFollow(FOLLOW_postcondition_in_contracting_conditions6027);
                            post=postcondition();

                            state._fsp--;
                            if (state.failed) return contracts;
                            if ( state.backtracking==0 ) {
                               postC = (post!=null?post.assertions:null); 
                            }

                            }
                            break;

                    }


                    }

                    if ( state.backtracking==0 ) {
                       if (postC == null) contracts = ContractClause.mk((pre!=null?pre.assertions:null), Constants.NO_EXPRESSIONS, getSLoc((pre!=null?((Token)pre.start):null),(pre!=null?((Token)pre.stop):null))); 
                             else contracts = ContractClause.mk((pre!=null?pre.assertions:null), postC, getSLoc((pre!=null?((Token)pre.start):null),(post!=null?((Token)post.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:933:6: post= postcondition
                    {
                    pushFollow(FOLLOW_postcondition_in_contracting_conditions6051);
                    post=postcondition();

                    state._fsp--;
                    if (state.failed) return contracts;
                    if ( state.backtracking==0 ) {
                       contracts = ContractClause.mk(Constants.NO_EXPRESSIONS, (post!=null?post.assertions:null), getSLoc((post!=null?((Token)post.start):null),(post!=null?((Token)post.stop):null))); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return contracts;
    }
    // $ANTLR end "contracting_conditions"

    public static class precondition_return extends ParserRuleReturnScope {
        public List<Expression> assertions;
    };

    // $ANTLR start "precondition"
    // BON.g:938:1: precondition returns [List<Expression> assertions] : 'require' assertion ;
    public final BONParser.precondition_return precondition() throws RecognitionException {
        BONParser.precondition_return retval = new BONParser.precondition_return();
        retval.start = input.LT(1);

        List<Expression> assertion83 = null;


        try {
            // BON.g:938:52: ( 'require' assertion )
            // BON.g:939:3: 'require' assertion
            {
            match(input,74,FOLLOW_74_in_precondition6077); if (state.failed) return retval;
            pushFollow(FOLLOW_assertion_in_precondition6079);
            assertion83=assertion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.assertions = assertion83; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "precondition"

    public static class postcondition_return extends ParserRuleReturnScope {
        public List<Expression> assertions;
    };

    // $ANTLR start "postcondition"
    // BON.g:943:1: postcondition returns [List<Expression> assertions] : 'ensure' assertion ;
    public final BONParser.postcondition_return postcondition() throws RecognitionException {
        BONParser.postcondition_return retval = new BONParser.postcondition_return();
        retval.start = input.LT(1);

        List<Expression> assertion84 = null;


        try {
            // BON.g:943:53: ( 'ensure' assertion )
            // BON.g:944:3: 'ensure' assertion
            {
            match(input,75,FOLLOW_75_in_postcondition6113); if (state.failed) return retval;
            pushFollow(FOLLOW_assertion_in_postcondition6115);
            assertion84=assertion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.assertions = assertion84; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postcondition"


    // $ANTLR start "selective_export"
    // BON.g:948:1: selective_export returns [List<ClassName> exports] : '{' cnl= class_name_list '}' ;
    public final List<ClassName> selective_export() throws RecognitionException {
        List<ClassName> exports = null;

        List<ClassName> cnl = null;


        try {
            // BON.g:950:52: ( '{' cnl= class_name_list '}' )
            // BON.g:951:3: '{' cnl= class_name_list '}'
            {
            match(input,62,FOLLOW_62_in_selective_export6138); if (state.failed) return exports;
            pushFollow(FOLLOW_class_name_list_in_selective_export6142);
            cnl=class_name_list();

            state._fsp--;
            if (state.failed) return exports;
            match(input,63,FOLLOW_63_in_selective_export6144); if (state.failed) return exports;
            if ( state.backtracking==0 ) {
               exports = cnl; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exports;
    }
    // $ANTLR end "selective_export"

    public static class feature_name_list_return extends ParserRuleReturnScope {
        public List<FeatureName> list;
    };

    // $ANTLR start "feature_name_list"
    // BON.g:955:1: feature_name_list returns [List<FeatureName> list] : f1= feature_name ( ',' f= feature_name )* ;
    public final BONParser.feature_name_list_return feature_name_list() throws RecognitionException {
        BONParser.feature_name_list_return retval = new BONParser.feature_name_list_return();
        retval.start = input.LT(1);

        BONParser.feature_name_return f1 = null;

        BONParser.feature_name_return f = null;


        try {
            // BON.g:955:52: (f1= feature_name ( ',' f= feature_name )* )
            // BON.g:956:3: f1= feature_name ( ',' f= feature_name )*
            {
            if ( state.backtracking==0 ) {
               retval.list = createList(); 
            }
            pushFollow(FOLLOW_feature_name_in_feature_name_list6189);
            f1=feature_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.list.add((f1!=null?f1.name:null)); 
            }
            // BON.g:959:3: ( ',' f= feature_name )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==35) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // BON.g:959:4: ',' f= feature_name
            	    {
            	    match(input,35,FOLLOW_35_in_feature_name_list6199); if (state.failed) return retval;
            	    pushFollow(FOLLOW_feature_name_in_feature_name_list6203);
            	    f=feature_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.list.add((f!=null?f.name:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "feature_name_list"

    public static class feature_name_return extends ParserRuleReturnScope {
        public FeatureName name;
    };

    // $ANTLR start "feature_name"
    // BON.g:964:1: feature_name returns [FeatureName name] : (i= IDENTIFIER | prefix | infix );
    public final BONParser.feature_name_return feature_name() throws RecognitionException {
        BONParser.feature_name_return retval = new BONParser.feature_name_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:964:41: (i= IDENTIFIER | prefix | infix )
            int alt118=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt118=1;
                }
                break;
            case 78:
                {
                alt118=2;
                }
                break;
            case 80:
                {
                alt118=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // BON.g:965:4: i= IDENTIFIER
                    {
                    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_feature_name6252); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.name = FeatureName.mk((i!=null?i.getText():null), getSLoc(i)); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:967:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_feature_name6262);
                    prefix();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // BON.g:968:4: infix
                    {
                    pushFollow(FOLLOW_infix_in_feature_name6268);
                    infix();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "feature_name"

    public static class rename_clause_return extends ParserRuleReturnScope {
        public RenameClause rename;
    };

    // $ANTLR start "rename_clause"
    // BON.g:971:1: rename_clause returns [RenameClause rename] : '{' renaming '}' ;
    public final BONParser.rename_clause_return rename_clause() throws RecognitionException {
        BONParser.rename_clause_return retval = new BONParser.rename_clause_return();
        retval.start = input.LT(1);

        RenameClause renaming85 = null;


        try {
            // BON.g:971:45: ( '{' renaming '}' )
            // BON.g:972:3: '{' renaming '}'
            {
            match(input,62,FOLLOW_62_in_rename_clause6298); if (state.failed) return retval;
            pushFollow(FOLLOW_renaming_in_rename_clause6300);
            renaming85=renaming();

            state._fsp--;
            if (state.failed) return retval;
            match(input,63,FOLLOW_63_in_rename_clause6302); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.rename = renaming85; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rename_clause"


    // $ANTLR start "renaming"
    // BON.g:976:1: renaming returns [RenameClause renaming] : s= '^' class_name '.' feature_name ;
    public final RenameClause renaming() throws RecognitionException {
        RenameClause renaming = null;

        Token s=null;
        BONParser.class_name_return class_name86 = null;

        BONParser.feature_name_return feature_name87 = null;


        try {
            // BON.g:976:42: (s= '^' class_name '.' feature_name )
            // BON.g:977:3: s= '^' class_name '.' feature_name
            {
            s=(Token)match(input,76,FOLLOW_76_in_renaming6338); if (state.failed) return renaming;
            pushFollow(FOLLOW_class_name_in_renaming6340);
            class_name86=class_name();

            state._fsp--;
            if (state.failed) return renaming;
            match(input,70,FOLLOW_70_in_renaming6342); if (state.failed) return renaming;
            pushFollow(FOLLOW_feature_name_in_renaming6344);
            feature_name87=feature_name();

            state._fsp--;
            if (state.failed) return renaming;
            if ( state.backtracking==0 ) {
               renaming = RenameClause.mk((class_name86!=null?class_name86.name:null), (feature_name87!=null?feature_name87.name:null), getSLoc(s,(feature_name87!=null?((Token)feature_name87.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return renaming;
    }
    // $ANTLR end "renaming"

    public static class feature_arguments_return extends ParserRuleReturnScope {
        public List<FeatureArgument> args;
    };

    // $ANTLR start "feature_arguments"
    // BON.g:981:1: feature_arguments returns [List<FeatureArgument> args] : ( feature_argument )+ ;
    public final BONParser.feature_arguments_return feature_arguments() throws RecognitionException {
        BONParser.feature_arguments_return retval = new BONParser.feature_arguments_return();
        retval.start = input.LT(1);

        List<FeatureArgument> feature_argument88 = null;


        try {
            // BON.g:981:56: ( ( feature_argument )+ )
            // BON.g:982:3: ( feature_argument )+
            {
            if ( state.backtracking==0 ) {
               retval.args = createList(); 
            }
            // BON.g:983:3: ( feature_argument )+
            int cnt119=0;
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==65||LA119_0==77) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // BON.g:983:4: feature_argument
            	    {
            	    pushFollow(FOLLOW_feature_argument_in_feature_arguments6379);
            	    feature_argument88=feature_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.args.addAll(feature_argument88); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "feature_arguments"


    // $ANTLR start "feature_argument"
    // BON.g:986:1: feature_argument returns [List<FeatureArgument> args] : ( '->' | '<-' ) ( ( identifier_list ':' t1= type ) | (t2= type ) ) ;
    public final List<FeatureArgument> feature_argument() throws RecognitionException {
        List<FeatureArgument> args = null;

        BONParser.type_return t1 = null;

        BONParser.type_return t2 = null;

        BONParser.identifier_list_return identifier_list89 = null;


        try {
            // BON.g:986:55: ( ( '->' | '<-' ) ( ( identifier_list ':' t1= type ) | (t2= type ) ) )
            // BON.g:987:3: ( '->' | '<-' ) ( ( identifier_list ':' t1= type ) | (t2= type ) )
            {
            if ( input.LA(1)==65||input.LA(1)==77 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return args;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // BON.g:988:3: ( ( identifier_list ':' t1= type ) | (t2= type ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==IDENTIFIER) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==IDENTIFIER||LA120_1==25||(LA120_1>=58 && LA120_1<=59)||(LA120_1>=65 && LA120_1<=66)||(LA120_1>=71 && LA120_1<=75)||(LA120_1>=77 && LA120_1<=78)||LA120_1==80) ) {
                    alt120=2;
                }
                else if ( ((LA120_1>=34 && LA120_1<=35)) ) {
                    alt120=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return args;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return args;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // BON.g:989:6: ( identifier_list ':' t1= type )
                    {
                    // BON.g:989:6: ( identifier_list ':' t1= type )
                    // BON.g:989:8: identifier_list ':' t1= type
                    {
                    pushFollow(FOLLOW_identifier_list_in_feature_argument6443);
                    identifier_list89=identifier_list();

                    state._fsp--;
                    if (state.failed) return args;
                    match(input,34,FOLLOW_34_in_feature_argument6445); if (state.failed) return args;
                    pushFollow(FOLLOW_type_in_feature_argument6449);
                    t1=type();

                    state._fsp--;
                    if (state.failed) return args;
                    if ( state.backtracking==0 ) {
                       List<String> ids = (identifier_list89!=null?identifier_list89.list:null); args = new ArrayList<FeatureArgument>(ids.size()); for (String id : (identifier_list89!=null?identifier_list89.list:null)) args.add(FeatureArgument.mk(id, (t1!=null?t1.type:null), getSLoc((identifier_list89!=null?((Token)identifier_list89.start):null), (t1!=null?((Token)t1.stop):null)))); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // BON.g:992:6: (t2= type )
                    {
                    // BON.g:992:6: (t2= type )
                    // BON.g:992:8: t2= type
                    {
                    pushFollow(FOLLOW_type_in_feature_argument6481);
                    t2=type();

                    state._fsp--;
                    if (state.failed) return args;
                    if ( state.backtracking==0 ) {
                       args = new ArrayList<FeatureArgument>(1); args.add(FeatureArgument.mk(null, (t2!=null?t2.type:null), getSLoc((t2!=null?((Token)t2.start):null),(t2!=null?((Token)t2.stop):null)))); 
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "feature_argument"

    public static class identifier_list_return extends ParserRuleReturnScope {
        public List<String> list;
    };

    // $ANTLR start "identifier_list"
    // BON.g:998:1: identifier_list returns [List<String> list] : i1= IDENTIFIER ( ',' i= IDENTIFIER )* ;
    public final BONParser.identifier_list_return identifier_list() throws RecognitionException {
        BONParser.identifier_list_return retval = new BONParser.identifier_list_return();
        retval.start = input.LT(1);

        Token i1=null;
        Token i=null;

        try {
            // BON.g:998:45: (i1= IDENTIFIER ( ',' i= IDENTIFIER )* )
            // BON.g:999:3: i1= IDENTIFIER ( ',' i= IDENTIFIER )*
            {
            if ( state.backtracking==0 ) {
               retval.list = createList(); 
            }
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list6541); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.list.add((i1!=null?i1.getText():null)); 
            }
            // BON.g:1002:3: ( ',' i= IDENTIFIER )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==35) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // BON.g:1002:4: ',' i= IDENTIFIER
            	    {
            	    match(input,35,FOLLOW_35_in_identifier_list6551); if (state.failed) return retval;
            	    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list6555); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.list.add((i!=null?i.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    // $ANTLR start "prefix"
    // BON.g:1006:1: prefix : 'prefix' '\"' prefix_operator '\"' ;
    public final void prefix() throws RecognitionException {
        try {
            // BON.g:1006:9: ( 'prefix' '\"' prefix_operator '\"' )
            // BON.g:1006:12: 'prefix' '\"' prefix_operator '\"'
            {
            match(input,78,FOLLOW_78_in_prefix6572); if (state.failed) return ;
            match(input,79,FOLLOW_79_in_prefix6574); if (state.failed) return ;
            pushFollow(FOLLOW_prefix_operator_in_prefix6576);
            prefix_operator();

            state._fsp--;
            if (state.failed) return ;
            match(input,79,FOLLOW_79_in_prefix6578); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prefix"


    // $ANTLR start "infix"
    // BON.g:1009:1: infix : 'infix' '\"' infix_operator '\"' ;
    public final void infix() throws RecognitionException {
        try {
            // BON.g:1009:8: ( 'infix' '\"' infix_operator '\"' )
            // BON.g:1009:11: 'infix' '\"' infix_operator '\"'
            {
            match(input,80,FOLLOW_80_in_infix6597); if (state.failed) return ;
            match(input,79,FOLLOW_79_in_infix6599); if (state.failed) return ;
            pushFollow(FOLLOW_infix_operator_in_infix6601);
            infix_operator();

            state._fsp--;
            if (state.failed) return ;
            match(input,79,FOLLOW_79_in_infix6603); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "infix"


    // $ANTLR start "prefix_operator"
    // BON.g:1013:1: prefix_operator : unary ;
    public final void prefix_operator() throws RecognitionException {
        try {
            // BON.g:1013:18: ( unary )
            // BON.g:1013:21: unary
            {
            pushFollow(FOLLOW_unary_in_prefix_operator6623);
            unary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prefix_operator"


    // $ANTLR start "infix_operator"
    // BON.g:1017:1: infix_operator : binary ;
    public final void infix_operator() throws RecognitionException {
        try {
            // BON.g:1017:17: ( binary )
            // BON.g:1018:3: binary
            {
            pushFollow(FOLLOW_binary_in_infix_operator6638);
            binary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "infix_operator"

    public static class formal_generics_return extends ParserRuleReturnScope {
        public List<FormalGeneric> generics;
    };

    // $ANTLR start "formal_generics"
    // BON.g:1022:1: formal_generics returns [List<FormalGeneric> generics] : '[' fgl= formal_generic_list ']' ;
    public final BONParser.formal_generics_return formal_generics() throws RecognitionException {
        BONParser.formal_generics_return retval = new BONParser.formal_generics_return();
        retval.start = input.LT(1);

        List<FormalGeneric> fgl = null;


        try {
            // BON.g:1024:56: ( '[' fgl= formal_generic_list ']' )
            // BON.g:1025:3: '[' fgl= formal_generic_list ']'
            {
            match(input,66,FOLLOW_66_in_formal_generics6657); if (state.failed) return retval;
            pushFollow(FOLLOW_formal_generic_list_in_formal_generics6661);
            fgl=formal_generic_list();

            state._fsp--;
            if (state.failed) return retval;
            match(input,67,FOLLOW_67_in_formal_generics6663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.generics = fgl; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formal_generics"


    // $ANTLR start "formal_generic_list"
    // BON.g:1029:1: formal_generic_list returns [List<FormalGeneric> list] : fg1= formal_generic ( ',' fg= formal_generic )* ;
    public final List<FormalGeneric> formal_generic_list() throws RecognitionException {
        List<FormalGeneric> list = null;

        FormalGeneric fg1 = null;

        FormalGeneric fg = null;


        try {
            // BON.g:1029:56: (fg1= formal_generic ( ',' fg= formal_generic )* )
            // BON.g:1030:3: fg1= formal_generic ( ',' fg= formal_generic )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_formal_generic_in_formal_generic_list6706);
            fg1=formal_generic();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add(fg1); 
            }
            // BON.g:1033:3: ( ',' fg= formal_generic )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==35) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // BON.g:1033:4: ',' fg= formal_generic
            	    {
            	    match(input,35,FOLLOW_35_in_formal_generic_list6715); if (state.failed) return list;
            	    pushFollow(FOLLOW_formal_generic_in_formal_generic_list6719);
            	    fg=formal_generic();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add(fg); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "formal_generic_list"


    // $ANTLR start "formal_generic"
    // BON.g:1038:1: formal_generic returns [FormalGeneric generic] : (f= formal_generic_name | f= formal_generic_name '->' ct= class_type );
    public final FormalGeneric formal_generic() throws RecognitionException {
        FormalGeneric generic = null;

        BONParser.formal_generic_name_return f = null;

        BONParser.class_type_return ct = null;


        try {
            // BON.g:1038:48: (f= formal_generic_name | f= formal_generic_name '->' ct= class_type )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IDENTIFIER) ) {
                int LA123_1 = input.LA(2);

                if ( (LA123_1==65) ) {
                    alt123=2;
                }
                else if ( (LA123_1==35||LA123_1==67) ) {
                    alt123=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return generic;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return generic;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // BON.g:1039:4: f= formal_generic_name
                    {
                    pushFollow(FOLLOW_formal_generic_name_in_formal_generic6769);
                    f=formal_generic_name();

                    state._fsp--;
                    if (state.failed) return generic;
                    if ( state.backtracking==0 ) {
                       generic = FormalGeneric.mk((f!=null?f.name:null), null, getSLoc((f!=null?((Token)f.start):null),(f!=null?((Token)f.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1041:4: f= formal_generic_name '->' ct= class_type
                    {
                    pushFollow(FOLLOW_formal_generic_name_in_formal_generic6781);
                    f=formal_generic_name();

                    state._fsp--;
                    if (state.failed) return generic;
                    match(input,65,FOLLOW_65_in_formal_generic6783); if (state.failed) return generic;
                    pushFollow(FOLLOW_class_type_in_formal_generic6787);
                    ct=class_type();

                    state._fsp--;
                    if (state.failed) return generic;
                    if ( state.backtracking==0 ) {
                       generic = FormalGeneric.mk((f!=null?f.name:null), (ct!=null?ct.type:null), getSLoc((f!=null?((Token)f.start):null), (ct!=null?((Token)ct.stop):null))); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return generic;
    }
    // $ANTLR end "formal_generic"

    public static class formal_generic_name_return extends ParserRuleReturnScope {
        public String name;
    };

    // $ANTLR start "formal_generic_name"
    // BON.g:1045:1: formal_generic_name returns [String name] : i= IDENTIFIER ;
    public final BONParser.formal_generic_name_return formal_generic_name() throws RecognitionException {
        BONParser.formal_generic_name_return retval = new BONParser.formal_generic_name_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // BON.g:1045:43: (i= IDENTIFIER )
            // BON.g:1046:3: i= IDENTIFIER
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_generic_name6826); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = (i!=null?i.getText():null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formal_generic_name"

    public static class class_type_return extends ParserRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "class_type"
    // BON.g:1050:1: class_type returns [Type type] : c= class_name ( actual_generics | ) ;
    public final BONParser.class_type_return class_type() throws RecognitionException {
        BONParser.class_type_return retval = new BONParser.class_type_return();
        retval.start = input.LT(1);

        BONParser.class_name_return c = null;

        BONParser.actual_generics_return actual_generics90 = null;


        try {
            // BON.g:1050:32: (c= class_name ( actual_generics | ) )
            // BON.g:1051:3: c= class_name ( actual_generics | )
            {
            pushFollow(FOLLOW_class_name_in_class_type6871);
            c=class_name();

            state._fsp--;
            if (state.failed) return retval;
            // BON.g:1052:3: ( actual_generics | )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==66) ) {
                alt124=1;
            }
            else if ( (LA124_0==25||LA124_0==33||LA124_0==35||LA124_0==67||(LA124_0>=71 && LA124_0<=72)) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // BON.g:1052:6: actual_generics
                    {
                    pushFollow(FOLLOW_actual_generics_in_class_type6879);
                    actual_generics90=actual_generics();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = BONType.mk((c!=null?input.toString(c.start,c.stop):null), (actual_generics90!=null?actual_generics90.types:null), (c!=null?input.toString(c.start,c.stop):null).concat((actual_generics90!=null?input.toString(actual_generics90.start,actual_generics90.stop):null)), getSLoc((c!=null?((Token)c.start):null), (actual_generics90!=null?((Token)actual_generics90.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1055:6: 
                    {
                    if ( state.backtracking==0 ) {
                       retval.type = BONType.mk((c!=null?input.toString(c.start,c.stop):null), Constants.EMPTY_TYPE_LIST, (c!=null?input.toString(c.start,c.stop):null), getSLoc((c!=null?((Token)c.start):null),(c!=null?((Token)c.stop):null))); 
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_type"

    public static class actual_generics_return extends ParserRuleReturnScope {
        public List<Type> types;
    };

    // $ANTLR start "actual_generics"
    // BON.g:1059:1: actual_generics returns [List<Type> types] : '[' type_list ']' ;
    public final BONParser.actual_generics_return actual_generics() throws RecognitionException {
        BONParser.actual_generics_return retval = new BONParser.actual_generics_return();
        retval.start = input.LT(1);

        List<Type> type_list91 = null;


        try {
            // BON.g:1059:44: ( '[' type_list ']' )
            // BON.g:1060:19: '[' type_list ']'
            {
            match(input,66,FOLLOW_66_in_actual_generics6950); if (state.failed) return retval;
            pushFollow(FOLLOW_type_list_in_actual_generics6952);
            type_list91=type_list();

            state._fsp--;
            if (state.failed) return retval;
            match(input,67,FOLLOW_67_in_actual_generics6954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.types = type_list91; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actual_generics"


    // $ANTLR start "type_list"
    // BON.g:1064:1: type_list returns [List<Type> types] : t1= type ( ',' t= type )* ;
    public final List<Type> type_list() throws RecognitionException {
        List<Type> types = null;

        BONParser.type_return t1 = null;

        BONParser.type_return t = null;


        try {
            // BON.g:1064:39: (t1= type ( ',' t= type )* )
            // BON.g:1065:12: t1= type ( ',' t= type )*
            {
            pushFollow(FOLLOW_type_in_type_list7018);
            t1=type();

            state._fsp--;
            if (state.failed) return types;
            if ( state.backtracking==0 ) {
               types = createList(); types.add((t1!=null?t1.type:null)); 
            }
            // BON.g:1067:12: ( ',' t= type )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==35) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // BON.g:1067:13: ',' t= type
            	    {
            	    match(input,35,FOLLOW_35_in_type_list7046); if (state.failed) return types;
            	    pushFollow(FOLLOW_type_in_type_list7050);
            	    t=type();

            	    state._fsp--;
            	    if (state.failed) return types;
            	    if ( state.backtracking==0 ) {
            	       types.add((t!=null?t.type:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return types;
    }
    // $ANTLR end "type_list"

    public static class type_return extends ParserRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "type"
    // BON.g:1075:1: type returns [Type type] : i= IDENTIFIER ( ( actual_generics ) | ) ;
    public final BONParser.type_return type() throws RecognitionException {
        BONParser.type_return retval = new BONParser.type_return();
        retval.start = input.LT(1);

        Token i=null;
        BONParser.actual_generics_return actual_generics92 = null;


        try {
            // BON.g:1075:26: (i= IDENTIFIER ( ( actual_generics ) | ) )
            // BON.g:1076:8: i= IDENTIFIER ( ( actual_generics ) | )
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type7105); if (state.failed) return retval;
            // BON.g:1077:8: ( ( actual_generics ) | )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==66) ) {
                alt126=1;
            }
            else if ( ((LA126_0>=IDENTIFIER && LA126_0<=COMMENT)||LA126_0==25||LA126_0==33||LA126_0==35||(LA126_0>=58 && LA126_0<=59)||LA126_0==62||LA126_0==65||LA126_0==67||(LA126_0>=71 && LA126_0<=75)||(LA126_0>=77 && LA126_0<=78)||LA126_0==80||(LA126_0>=83 && LA126_0<=84)) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // BON.g:1078:9: ( actual_generics )
                    {
                    // BON.g:1078:9: ( actual_generics )
                    // BON.g:1078:11: actual_generics
                    {
                    pushFollow(FOLLOW_actual_generics_in_type7127);
                    actual_generics92=actual_generics();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = BONType.mk((i!=null?i.getText():null), (actual_generics92!=null?actual_generics92.types:null), (i!=null?i.getText():null).concat((actual_generics92!=null?input.toString(actual_generics92.start,actual_generics92.stop):null)), getSLoc(i,(actual_generics92!=null?((Token)actual_generics92.stop):null))); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // BON.g:1082:9: 
                    {
                    if ( state.backtracking==0 ) {
                       retval.type = BONType.mk((i!=null?i.getText():null), Constants.EMPTY_TYPE_LIST, (i!=null?i.getText():null),getSLoc(i)); 
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "assertion"
    // BON.g:1086:1: assertion returns [List<Expression> clauses] : a1= assertion_clause ( ';' a= assertion_clause )* ( ';' )? ;
    public final List<Expression> assertion() throws RecognitionException {
        List<Expression> clauses = null;

        Expression a1 = null;

        Expression a = null;


        try {
            // BON.g:1091:46: (a1= assertion_clause ( ';' a= assertion_clause )* ( ';' )? )
            // BON.g:1092:3: a1= assertion_clause ( ';' a= assertion_clause )* ( ';' )?
            {
            if ( state.backtracking==0 ) {
               clauses = createList(); 
            }
            pushFollow(FOLLOW_assertion_clause_in_assertion7206);
            a1=assertion_clause();

            state._fsp--;
            if (state.failed) return clauses;
            if ( state.backtracking==0 ) {
               clauses.add(a1); 
            }
            // BON.g:1095:3: ( ';' a= assertion_clause )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==33) ) {
                    int LA127_1 = input.LA(2);

                    if ( ((LA127_1>=MANIFEST_STRING && LA127_1<=IDENTIFIER)||(LA127_1>=INTEGER && LA127_1<=REAL)||LA127_1==42||LA127_1==62||(LA127_1>=81 && LA127_1<=82)||(LA127_1>=87 && LA127_1<=91)||(LA127_1>=103 && LA127_1<=104)||(LA127_1>=108 && LA127_1<=110)) ) {
                        alt127=1;
                    }


                }


                switch (alt127) {
            	case 1 :
            	    // BON.g:1095:4: ';' a= assertion_clause
            	    {
            	    match(input,33,FOLLOW_33_in_assertion7215); if (state.failed) return clauses;
            	    pushFollow(FOLLOW_assertion_clause_in_assertion7219);
            	    a=assertion_clause();

            	    state._fsp--;
            	    if (state.failed) return clauses;
            	    if ( state.backtracking==0 ) {
            	       clauses.add(a); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);

            // BON.g:1098:3: ( ';' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==33) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // BON.g:1098:3: ';'
                    {
                    match(input,33,FOLLOW_33_in_assertion7236); if (state.failed) return clauses;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clauses;
    }
    // $ANTLR end "assertion"


    // $ANTLR start "assertion_clause"
    // BON.g:1101:1: assertion_clause returns [Expression clause] : be= boolean_expression ;
    public final Expression assertion_clause() throws RecognitionException {
        Expression clause = null;

        Expression be = null;


        try {
            // BON.g:1101:46: (be= boolean_expression )
            // BON.g:1102:3: be= boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_assertion_clause7265);
            be=boolean_expression();

            state._fsp--;
            if (state.failed) return clause;
            if ( state.backtracking==0 ) {
               clause = be; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "assertion_clause"


    // $ANTLR start "boolean_expression"
    // BON.g:1109:1: boolean_expression returns [Expression exp] : expression ;
    public final Expression boolean_expression() throws RecognitionException {
        Expression exp = null;

        BONParser.expression_return expression93 = null;


        try {
            // BON.g:1109:45: ( expression )
            // BON.g:1110:3: expression
            {
            pushFollow(FOLLOW_expression_in_boolean_expression7287);
            expression93=expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = (expression93!=null?expression93.exp:null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "boolean_expression"


    // $ANTLR start "quantification"
    // BON.g:1114:1: quantification returns [Quantification quantification] : q= quantifier rexp= range_expression (r= restriction )? p= proposition ;
    public final Quantification quantification() throws RecognitionException {
        Quantification quantification = null;

        BONParser.quantifier_return q = null;

        List<VariableRange> rexp = null;

        Expression r = null;

        BONParser.proposition_return p = null;


         Expression restrict = null; 
        try {
            // BON.g:1116:1: (q= quantifier rexp= range_expression (r= restriction )? p= proposition )
            // BON.g:1117:3: q= quantifier rexp= range_expression (r= restriction )? p= proposition
            {
            pushFollow(FOLLOW_quantifier_in_quantification7327);
            q=quantifier();

            state._fsp--;
            if (state.failed) return quantification;
            pushFollow(FOLLOW_range_expression_in_quantification7334);
            rexp=range_expression();

            state._fsp--;
            if (state.failed) return quantification;
            // BON.g:1119:3: (r= restriction )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==83) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // BON.g:1119:4: r= restriction
                    {
                    pushFollow(FOLLOW_restriction_in_quantification7342);
                    r=restriction();

                    state._fsp--;
                    if (state.failed) return quantification;
                    if ( state.backtracking==0 ) {
                       restrict = r; 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_proposition_in_quantification7354);
            p=proposition();

            state._fsp--;
            if (state.failed) return quantification;
            if ( state.backtracking==0 ) {
               quantification = Quantification.mk((q!=null?q.q:null), rexp, restrict, (p!=null?p.exp:null), getSLoc((q!=null?((Token)q.start):null),(p!=null?((Token)p.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return quantification;
    }
    // $ANTLR end "quantification"

    public static class quantifier_return extends ParserRuleReturnScope {
        public Quantification.Quantifier q;
    };

    // $ANTLR start "quantifier"
    // BON.g:1124:1: quantifier returns [Quantification.Quantifier q] : (f= 'for_all' | e= 'exists' );
    public final BONParser.quantifier_return quantifier() throws RecognitionException {
        BONParser.quantifier_return retval = new BONParser.quantifier_return();
        retval.start = input.LT(1);

        Token f=null;
        Token e=null;

        try {
            // BON.g:1124:50: (f= 'for_all' | e= 'exists' )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==81) ) {
                alt130=1;
            }
            else if ( (LA130_0==82) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // BON.g:1125:4: f= 'for_all'
                    {
                    f=(Token)match(input,81,FOLLOW_81_in_quantifier7393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.q = Quantification.Quantifier.FORALL; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1127:4: e= 'exists'
                    {
                    e=(Token)match(input,82,FOLLOW_82_in_quantifier7406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.q = Quantification.Quantifier.EXISTS; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quantifier"


    // $ANTLR start "range_expression"
    // BON.g:1131:1: range_expression returns [List<VariableRange> ranges] : vr1= variable_range ( ';' vr= variable_range )* ( ';' )? ;
    public final List<VariableRange> range_expression() throws RecognitionException {
        List<VariableRange> ranges = null;

        VariableRange vr1 = null;

        VariableRange vr = null;


        try {
            // BON.g:1131:55: (vr1= variable_range ( ';' vr= variable_range )* ( ';' )? )
            // BON.g:1132:3: vr1= variable_range ( ';' vr= variable_range )* ( ';' )?
            {
            if ( state.backtracking==0 ) {
               ranges = createList(); 
            }
            pushFollow(FOLLOW_variable_range_in_range_expression7444);
            vr1=variable_range();

            state._fsp--;
            if (state.failed) return ranges;
            if ( state.backtracking==0 ) {
               ranges.add(vr); 
            }
            // BON.g:1135:3: ( ';' vr= variable_range )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==33) ) {
                    int LA131_1 = input.LA(2);

                    if ( (LA131_1==IDENTIFIER) ) {
                        alt131=1;
                    }


                }


                switch (alt131) {
            	case 1 :
            	    // BON.g:1135:4: ';' vr= variable_range
            	    {
            	    match(input,33,FOLLOW_33_in_range_expression7454); if (state.failed) return ranges;
            	    pushFollow(FOLLOW_variable_range_in_range_expression7458);
            	    vr=variable_range();

            	    state._fsp--;
            	    if (state.failed) return ranges;
            	    if ( state.backtracking==0 ) {
            	       ranges.add(vr); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);

            // BON.g:1138:3: ( ';' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==33) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // BON.g:1138:3: ';'
                    {
                    match(input,33,FOLLOW_33_in_range_expression7473); if (state.failed) return ranges;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ranges;
    }
    // $ANTLR end "range_expression"


    // $ANTLR start "restriction"
    // BON.g:1141:1: restriction returns [Expression exp] : st= 'such_that' be= boolean_expression ;
    public final Expression restriction() throws RecognitionException {
        Expression exp = null;

        Token st=null;
        Expression be = null;


        try {
            // BON.g:1141:38: (st= 'such_that' be= boolean_expression )
            // BON.g:1142:3: st= 'such_that' be= boolean_expression
            {
            st=(Token)match(input,83,FOLLOW_83_in_restriction7510); if (state.failed) return exp;
            pushFollow(FOLLOW_boolean_expression_in_restriction7514);
            be=boolean_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =  be; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "restriction"

    public static class proposition_return extends ParserRuleReturnScope {
        public Expression exp;
    };

    // $ANTLR start "proposition"
    // BON.g:1146:1: proposition returns [Expression exp] : ih= 'it_holds' be= boolean_expression ;
    public final BONParser.proposition_return proposition() throws RecognitionException {
        BONParser.proposition_return retval = new BONParser.proposition_return();
        retval.start = input.LT(1);

        Token ih=null;
        Expression be = null;


        try {
            // BON.g:1146:38: (ih= 'it_holds' be= boolean_expression )
            // BON.g:1147:3: ih= 'it_holds' be= boolean_expression
            {
            ih=(Token)match(input,84,FOLLOW_84_in_proposition7548); if (state.failed) return retval;
            pushFollow(FOLLOW_boolean_expression_in_proposition7552);
            be=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.exp = be; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proposition"


    // $ANTLR start "variable_range"
    // BON.g:1151:1: variable_range returns [VariableRange range] : (mr= member_range | tr= type_range );
    public final VariableRange variable_range() throws RecognitionException {
        VariableRange range = null;

        MemberRange mr = null;

        TypeRange tr = null;


        try {
            // BON.g:1151:46: (mr= member_range | tr= type_range )
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // BON.g:1152:4: mr= member_range
                    {
                    pushFollow(FOLLOW_member_range_in_variable_range7588);
                    mr=member_range();

                    state._fsp--;
                    if (state.failed) return range;
                    if ( state.backtracking==0 ) {
                       range = mr; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1154:4: tr= type_range
                    {
                    pushFollow(FOLLOW_type_range_in_variable_range7600);
                    tr=type_range();

                    state._fsp--;
                    if (state.failed) return range;
                    if ( state.backtracking==0 ) {
                       range = tr; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return range;
    }
    // $ANTLR end "variable_range"


    // $ANTLR start "member_range"
    // BON.g:1158:1: member_range returns [MemberRange range] : il= identifier_list 'member_of' e= expression ;
    public final MemberRange member_range() throws RecognitionException {
        MemberRange range = null;

        BONParser.identifier_list_return il = null;

        BONParser.expression_return e = null;


        try {
            // BON.g:1158:42: (il= identifier_list 'member_of' e= expression )
            // BON.g:1159:3: il= identifier_list 'member_of' e= expression
            {
            pushFollow(FOLLOW_identifier_list_in_member_range7640);
            il=identifier_list();

            state._fsp--;
            if (state.failed) return range;
            match(input,85,FOLLOW_85_in_member_range7642); if (state.failed) return range;
            pushFollow(FOLLOW_expression_in_member_range7646);
            e=expression();

            state._fsp--;
            if (state.failed) return range;
            if ( state.backtracking==0 ) {
               range = MemberRange.mk((il!=null?il.list:null), (e!=null?e.exp:null), getSLoc((il!=null?((Token)il.start):null),(e!=null?((Token)e.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return range;
    }
    // $ANTLR end "member_range"


    // $ANTLR start "type_range"
    // BON.g:1163:1: type_range returns [TypeRange range] : il= identifier_list ':' t= type ;
    public final TypeRange type_range() throws RecognitionException {
        TypeRange range = null;

        BONParser.identifier_list_return il = null;

        BONParser.type_return t = null;


        try {
            // BON.g:1163:38: (il= identifier_list ':' t= type )
            // BON.g:1164:3: il= identifier_list ':' t= type
            {
            pushFollow(FOLLOW_identifier_list_in_type_range7682);
            il=identifier_list();

            state._fsp--;
            if (state.failed) return range;
            match(input,34,FOLLOW_34_in_type_range7684); if (state.failed) return range;
            pushFollow(FOLLOW_type_in_type_range7688);
            t=type();

            state._fsp--;
            if (state.failed) return range;
            if ( state.backtracking==0 ) {
               range = TypeRange.mk((il!=null?il.list:null), (t!=null?t.type:null), getSLoc((il!=null?((Token)il.start):null),(t!=null?((Token)t.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return range;
    }
    // $ANTLR end "type_range"

    public static class call_chain_return extends ParserRuleReturnScope {
        public List<UnqualifiedCall> calls;
    };

    // $ANTLR start "call_chain"
    // BON.g:1168:1: call_chain returns [List<UnqualifiedCall> calls] : uc1= unqualified_call ( '.' uc= unqualified_call )* ;
    public final BONParser.call_chain_return call_chain() throws RecognitionException {
        BONParser.call_chain_return retval = new BONParser.call_chain_return();
        retval.start = input.LT(1);

        UnqualifiedCall uc1 = null;

        UnqualifiedCall uc = null;


        try {
            // BON.g:1170:50: (uc1= unqualified_call ( '.' uc= unqualified_call )* )
            // BON.g:1171:3: uc1= unqualified_call ( '.' uc= unqualified_call )*
            {
            if ( state.backtracking==0 ) {
               retval.calls = createList(); 
            }
            pushFollow(FOLLOW_unqualified_call_in_call_chain7748);
            uc1=unqualified_call();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.calls.add(uc1); 
            }
            // BON.g:1174:3: ( '.' uc= unqualified_call )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==70) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // BON.g:1174:4: '.' uc= unqualified_call
            	    {
            	    match(input,70,FOLLOW_70_in_call_chain7757); if (state.failed) return retval;
            	    pushFollow(FOLLOW_unqualified_call_in_call_chain7761);
            	    uc=unqualified_call();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.calls.add(uc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_chain"


    // $ANTLR start "unqualified_call"
    // BON.g:1177:1: unqualified_call returns [UnqualifiedCall call] : i= IDENTIFIER (aa= actual_arguments | ) ;
    public final UnqualifiedCall unqualified_call() throws RecognitionException {
        UnqualifiedCall call = null;

        Token i=null;
        BONParser.actual_arguments_return aa = null;


         List<Expression> args = null; Token end = null;
        try {
            // BON.g:1179:1: (i= IDENTIFIER (aa= actual_arguments | ) )
            // BON.g:1180:3: i= IDENTIFIER (aa= actual_arguments | )
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unqualified_call7802); if (state.failed) return call;
            if ( state.backtracking==0 ) {
               end = i; 
            }
            // BON.g:1182:3: (aa= actual_arguments | )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==42) ) {
                alt135=1;
            }
            else if ( (LA135_0==25||(LA135_0>=33 && LA135_0<=35)||LA135_0==43||LA135_0==63||LA135_0==65||LA135_0==70||(LA135_0>=75 && LA135_0<=76)||(LA135_0>=83 && LA135_0<=85)||(LA135_0>=102 && LA135_0<=107)||(LA135_0>=110 && LA135_0<=120)) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return call;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // BON.g:1182:6: aa= actual_arguments
                    {
                    pushFollow(FOLLOW_actual_arguments_in_unqualified_call7816);
                    aa=actual_arguments();

                    state._fsp--;
                    if (state.failed) return call;
                    if ( state.backtracking==0 ) {
                       args = (aa!=null?aa.args:null); end = (aa!=null?((Token)aa.stop):null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1184:6: 
                    {
                    if ( state.backtracking==0 ) {
                       args = emptyList(); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               call = UnqualifiedCall.mk((i!=null?i.getText():null), args, getSLoc(i,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return call;
    }
    // $ANTLR end "unqualified_call"

    public static class actual_arguments_return extends ParserRuleReturnScope {
        public List<Expression> args;
    };

    // $ANTLR start "actual_arguments"
    // BON.g:1189:1: actual_arguments returns [List<Expression> args] : '(' (el= expression_list | ) ')' ;
    public final BONParser.actual_arguments_return actual_arguments() throws RecognitionException {
        BONParser.actual_arguments_return retval = new BONParser.actual_arguments_return();
        retval.start = input.LT(1);

        List<Expression> el = null;


        try {
            // BON.g:1190:1: ( '(' (el= expression_list | ) ')' )
            // BON.g:1191:3: '(' (el= expression_list | ) ')'
            {
            match(input,42,FOLLOW_42_in_actual_arguments7855); if (state.failed) return retval;
            // BON.g:1192:3: (el= expression_list | )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=MANIFEST_STRING && LA136_0<=IDENTIFIER)||(LA136_0>=INTEGER && LA136_0<=REAL)||LA136_0==42||LA136_0==62||(LA136_0>=81 && LA136_0<=82)||(LA136_0>=87 && LA136_0<=91)||(LA136_0>=103 && LA136_0<=104)||(LA136_0>=108 && LA136_0<=110)) ) {
                alt136=1;
            }
            else if ( (LA136_0==43) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // BON.g:1192:6: el= expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_actual_arguments7865);
                    el=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.args = el; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1194:6: 
                    {
                    if ( state.backtracking==0 ) {
                       retval.args = emptyList(); 
                    }

                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_actual_arguments7888); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actual_arguments"


    // $ANTLR start "expression_list"
    // BON.g:1199:1: expression_list returns [List<Expression> list] : e1= expression ( ',' e= expression )* ;
    public final List<Expression> expression_list() throws RecognitionException {
        List<Expression> list = null;

        BONParser.expression_return e1 = null;

        BONParser.expression_return e = null;


        try {
            // BON.g:1199:49: (e1= expression ( ',' e= expression )* )
            // BON.g:1200:3: e1= expression ( ',' e= expression )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_expression_in_expression_list7924);
            e1=expression();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add((e1!=null?e1.exp:null)); 
            }
            // BON.g:1203:3: ( ',' e= expression )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==35) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // BON.g:1203:4: ',' e= expression
            	    {
            	    match(input,35,FOLLOW_35_in_expression_list7934); if (state.failed) return list;
            	    pushFollow(FOLLOW_expression_in_expression_list7938);
            	    e=expression();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add((e!=null?e.exp:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "expression_list"

    public static class enumerated_set_return extends ParserRuleReturnScope {
        public List<EnumerationElement> list;
    };

    // $ANTLR start "enumerated_set"
    // BON.g:1206:1: enumerated_set returns [List<EnumerationElement> list] : '{' el= enumeration_list '}' ;
    public final BONParser.enumerated_set_return enumerated_set() throws RecognitionException {
        BONParser.enumerated_set_return retval = new BONParser.enumerated_set_return();
        retval.start = input.LT(1);

        List<EnumerationElement> el = null;


        try {
            // BON.g:1214:56: ( '{' el= enumeration_list '}' )
            // BON.g:1215:3: '{' el= enumeration_list '}'
            {
            match(input,62,FOLLOW_62_in_enumerated_set7984); if (state.failed) return retval;
            pushFollow(FOLLOW_enumeration_list_in_enumerated_set7988);
            el=enumeration_list();

            state._fsp--;
            if (state.failed) return retval;
            match(input,63,FOLLOW_63_in_enumerated_set7990); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.list = el; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumerated_set"


    // $ANTLR start "enumeration_list"
    // BON.g:1219:1: enumeration_list returns [List<EnumerationElement> list] : el1= enumeration_element ( ',' el= enumeration_element )* ;
    public final List<EnumerationElement> enumeration_list() throws RecognitionException {
        List<EnumerationElement> list = null;

        EnumerationElement el1 = null;

        EnumerationElement el = null;


        try {
            // BON.g:1219:58: (el1= enumeration_element ( ',' el= enumeration_element )* )
            // BON.g:1220:3: el1= enumeration_element ( ',' el= enumeration_element )*
            {
            if ( state.backtracking==0 ) {
               list = createList(); 
            }
            pushFollow(FOLLOW_enumeration_element_in_enumeration_list8032);
            el1=enumeration_element();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list.add(el1); 
            }
            // BON.g:1223:3: ( ',' el= enumeration_element )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==35) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // BON.g:1223:4: ',' el= enumeration_element
            	    {
            	    match(input,35,FOLLOW_35_in_enumeration_list8042); if (state.failed) return list;
            	    pushFollow(FOLLOW_enumeration_element_in_enumeration_list8046);
            	    el=enumeration_element();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add(el); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "enumeration_list"


    // $ANTLR start "enumeration_element"
    // BON.g:1226:1: enumeration_element returns [EnumerationElement el] : (e= expression | i= interval );
    public final EnumerationElement enumeration_element() throws RecognitionException {
        EnumerationElement el = null;

        BONParser.expression_return e = null;

        Interval i = null;


        try {
            // BON.g:1226:53: (e= expression | i= interval )
            int alt139=2;
            switch ( input.LA(1) ) {
            case MANIFEST_STRING:
            case IDENTIFIER:
            case REAL:
            case 42:
            case 62:
            case 81:
            case 82:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 108:
            case 109:
            case 110:
                {
                alt139=1;
                }
                break;
            case CHARACTER_CONSTANT:
                {
                int LA139_2 = input.LA(2);

                if ( ((LA139_2>=34 && LA139_2<=35)||LA139_2==63||LA139_2==65||LA139_2==70||LA139_2==76||LA139_2==85||(LA139_2>=102 && LA139_2<=107)||(LA139_2>=110 && LA139_2<=120)) ) {
                    alt139=1;
                }
                else if ( (LA139_2==86) ) {
                    alt139=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return el;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

                    throw nvae;
                }
                }
                break;
            case 103:
                {
                int LA139_3 = input.LA(2);

                if ( ((LA139_3>=MANIFEST_STRING && LA139_3<=IDENTIFIER)||(LA139_3>=CHARACTER_CONSTANT && LA139_3<=REAL)||LA139_3==42||LA139_3==62||(LA139_3>=87 && LA139_3<=91)||(LA139_3>=103 && LA139_3<=104)||(LA139_3>=108 && LA139_3<=110)) ) {
                    alt139=1;
                }
                else if ( (LA139_3==INTEGER) ) {
                    int LA139_7 = input.LA(3);

                    if ( ((LA139_7>=34 && LA139_7<=35)||LA139_7==63||LA139_7==65||LA139_7==70||LA139_7==76||LA139_7==85||(LA139_7>=102 && LA139_7<=107)||(LA139_7>=110 && LA139_7<=120)) ) {
                        alt139=1;
                    }
                    else if ( (LA139_7==86) ) {
                        alt139=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return el;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return el;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 3, input);

                    throw nvae;
                }
                }
                break;
            case 104:
                {
                int LA139_4 = input.LA(2);

                if ( (LA139_4==INTEGER) ) {
                    int LA139_7 = input.LA(3);

                    if ( ((LA139_7>=34 && LA139_7<=35)||LA139_7==63||LA139_7==65||LA139_7==70||LA139_7==76||LA139_7==85||(LA139_7>=102 && LA139_7<=107)||(LA139_7>=110 && LA139_7<=120)) ) {
                        alt139=1;
                    }
                    else if ( (LA139_7==86) ) {
                        alt139=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return el;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 7, input);

                        throw nvae;
                    }
                }
                else if ( ((LA139_4>=MANIFEST_STRING && LA139_4<=IDENTIFIER)||(LA139_4>=CHARACTER_CONSTANT && LA139_4<=REAL)||LA139_4==42||LA139_4==62||(LA139_4>=87 && LA139_4<=91)||(LA139_4>=103 && LA139_4<=104)||(LA139_4>=108 && LA139_4<=110)) ) {
                    alt139=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return el;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 4, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA139_5 = input.LA(2);

                if ( ((LA139_5>=34 && LA139_5<=35)||LA139_5==63||LA139_5==65||LA139_5==70||LA139_5==76||LA139_5==85||(LA139_5>=102 && LA139_5<=107)||(LA139_5>=110 && LA139_5<=120)) ) {
                    alt139=1;
                }
                else if ( (LA139_5==86) ) {
                    alt139=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return el;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return el;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // BON.g:1227:4: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_enumeration_element8078);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return el;
                    if ( state.backtracking==0 ) {
                       el = (e!=null?e.exp:null); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1229:4: i= interval
                    {
                    pushFollow(FOLLOW_interval_in_enumeration_element8092);
                    i=interval();

                    state._fsp--;
                    if (state.failed) return el;
                    if ( state.backtracking==0 ) {
                       el = i; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return el;
    }
    // $ANTLR end "enumeration_element"


    // $ANTLR start "interval"
    // BON.g:1233:1: interval returns [Interval interval] : (ii= integer_interval | ci= character_interval );
    public final Interval interval() throws RecognitionException {
        Interval interval = null;

        IntegerInterval ii = null;

        CharacterInterval ci = null;


        try {
            // BON.g:1233:39: (ii= integer_interval | ci= character_interval )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==INTEGER||(LA140_0>=103 && LA140_0<=104)) ) {
                alt140=1;
            }
            else if ( (LA140_0==CHARACTER_CONSTANT) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return interval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // BON.g:1234:4: ii= integer_interval
                    {
                    pushFollow(FOLLOW_integer_interval_in_interval8139);
                    ii=integer_interval();

                    state._fsp--;
                    if (state.failed) return interval;
                    if ( state.backtracking==0 ) {
                       interval = ii; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1236:4: ci= character_interval
                    {
                    pushFollow(FOLLOW_character_interval_in_interval8151);
                    ci=character_interval();

                    state._fsp--;
                    if (state.failed) return interval;
                    if ( state.backtracking==0 ) {
                       interval = ci; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return interval;
    }
    // $ANTLR end "interval"


    // $ANTLR start "integer_interval"
    // BON.g:1240:1: integer_interval returns [IntegerInterval interval] : i1= integer_constant '..' i2= integer_constant ;
    public final IntegerInterval integer_interval() throws RecognitionException {
        IntegerInterval interval = null;

        BONParser.integer_constant_return i1 = null;

        BONParser.integer_constant_return i2 = null;


        try {
            // BON.g:1240:53: (i1= integer_constant '..' i2= integer_constant )
            // BON.g:1241:3: i1= integer_constant '..' i2= integer_constant
            {
            pushFollow(FOLLOW_integer_constant_in_integer_interval8184);
            i1=integer_constant();

            state._fsp--;
            if (state.failed) return interval;
            match(input,86,FOLLOW_86_in_integer_interval8186); if (state.failed) return interval;
            pushFollow(FOLLOW_integer_constant_in_integer_interval8190);
            i2=integer_constant();

            state._fsp--;
            if (state.failed) return interval;
            if ( state.backtracking==0 ) {
               interval = IntegerInterval.mk((i1!=null?i1.value:null),(i2!=null?i2.value:null),getSLoc((i1!=null?((Token)i1.start):null),(i2!=null?((Token)i2.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return interval;
    }
    // $ANTLR end "integer_interval"


    // $ANTLR start "character_interval"
    // BON.g:1245:1: character_interval returns [CharacterInterval interval] : c1= character_constant '..' c2= character_constant ;
    public final CharacterInterval character_interval() throws RecognitionException {
        CharacterInterval interval = null;

        BONParser.character_constant_return c1 = null;

        BONParser.character_constant_return c2 = null;


        try {
            // BON.g:1245:57: (c1= character_constant '..' c2= character_constant )
            // BON.g:1246:3: c1= character_constant '..' c2= character_constant
            {
            pushFollow(FOLLOW_character_constant_in_character_interval8232);
            c1=character_constant();

            state._fsp--;
            if (state.failed) return interval;
            match(input,86,FOLLOW_86_in_character_interval8234); if (state.failed) return interval;
            pushFollow(FOLLOW_character_constant_in_character_interval8238);
            c2=character_constant();

            state._fsp--;
            if (state.failed) return interval;
            if ( state.backtracking==0 ) {
               interval = CharacterInterval.mk((c1!=null?c1.value:null),(c2!=null?c2.value:null),getSLoc((c1!=null?((Token)c1.start):null),(c2!=null?((Token)c2.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return interval;
    }
    // $ANTLR end "character_interval"

    public static class constant_return extends ParserRuleReturnScope {
        public Constant constant;
    };

    // $ANTLR start "constant"
    // BON.g:1250:1: constant returns [Constant constant] : (mc= manifest_constant | c= 'Current' | v= 'Void' | v= 'Result' );
    public final BONParser.constant_return constant() throws RecognitionException {
        BONParser.constant_return retval = new BONParser.constant_return();
        retval.start = input.LT(1);

        Token c=null;
        Token v=null;
        ManifestConstant mc = null;


        try {
            // BON.g:1252:38: (mc= manifest_constant | c= 'Current' | v= 'Void' | v= 'Result' )
            int alt141=4;
            switch ( input.LA(1) ) {
            case MANIFEST_STRING:
            case INTEGER:
            case CHARACTER_CONSTANT:
            case REAL:
            case 62:
            case 90:
            case 91:
            case 103:
            case 104:
                {
                alt141=1;
                }
                break;
            case 87:
                {
                alt141=2;
                }
                break;
            case 88:
                {
                alt141=3;
                }
                break;
            case 89:
                {
                alt141=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // BON.g:1253:4: mc= manifest_constant
                    {
                    pushFollow(FOLLOW_manifest_constant_in_constant8264);
                    mc=manifest_constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.constant = mc; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1255:4: c= 'Current'
                    {
                    c=(Token)match(input,87,FOLLOW_87_in_constant8277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.constant = KeywordConstant.mk(KeywordConstant.Constant.CURRENT, getSLoc(c)); 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1257:4: v= 'Void'
                    {
                    v=(Token)match(input,88,FOLLOW_88_in_constant8290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.constant = KeywordConstant.mk(KeywordConstant.Constant.VOID, getSLoc(v)); 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:1259:4: v= 'Result'
                    {
                    v=(Token)match(input,89,FOLLOW_89_in_constant8314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.constant = KeywordConstant.mk(KeywordConstant.Constant.RESULT, getSLoc(v)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"


    // $ANTLR start "manifest_constant"
    // BON.g:1263:1: manifest_constant returns [ManifestConstant constant] : (bc= boolean_constant | cc= character_constant | ic= integer_constant | rc= real_constant | ms= MANIFEST_STRING | es= enumerated_set );
    public final ManifestConstant manifest_constant() throws RecognitionException {
        ManifestConstant constant = null;

        Token ms=null;
        BONParser.boolean_constant_return bc = null;

        BONParser.character_constant_return cc = null;

        BONParser.integer_constant_return ic = null;

        BONParser.real_constant_return rc = null;

        BONParser.enumerated_set_return es = null;


        try {
            // BON.g:1263:55: (bc= boolean_constant | cc= character_constant | ic= integer_constant | rc= real_constant | ms= MANIFEST_STRING | es= enumerated_set )
            int alt142=6;
            switch ( input.LA(1) ) {
            case 90:
            case 91:
                {
                alt142=1;
                }
                break;
            case CHARACTER_CONSTANT:
                {
                alt142=2;
                }
                break;
            case 103:
                {
                int LA142_3 = input.LA(2);

                if ( (LA142_3==INTEGER) ) {
                    alt142=3;
                }
                else if ( (LA142_3==REAL) ) {
                    alt142=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return constant;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 3, input);

                    throw nvae;
                }
                }
                break;
            case 104:
                {
                int LA142_4 = input.LA(2);

                if ( (LA142_4==INTEGER) ) {
                    alt142=3;
                }
                else if ( (LA142_4==REAL) ) {
                    alt142=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return constant;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 4, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                alt142=3;
                }
                break;
            case REAL:
                {
                alt142=4;
                }
                break;
            case MANIFEST_STRING:
                {
                alt142=5;
                }
                break;
            case 62:
                {
                alt142=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return constant;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // BON.g:1264:4: bc= boolean_constant
                    {
                    pushFollow(FOLLOW_boolean_constant_in_manifest_constant8337);
                    bc=boolean_constant();

                    state._fsp--;
                    if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = BooleanConstant.mk((bc!=null?bc.value:null),getSLoc((bc!=null?((Token)bc.start):null),(bc!=null?((Token)bc.stop):null))); 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1266:4: cc= character_constant
                    {
                    pushFollow(FOLLOW_character_constant_in_manifest_constant8350);
                    cc=character_constant();

                    state._fsp--;
                    if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = CharacterConstant.mk((cc!=null?cc.value:null),getSLoc((cc!=null?((Token)cc.start):null),(cc!=null?((Token)cc.stop):null))); 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1268:4: ic= integer_constant
                    {
                    pushFollow(FOLLOW_integer_constant_in_manifest_constant8363);
                    ic=integer_constant();

                    state._fsp--;
                    if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = IntegerConstant.mk((ic!=null?ic.value:null),getSLoc((ic!=null?((Token)ic.start):null),(ic!=null?((Token)ic.stop):null))); 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:1270:4: rc= real_constant
                    {
                    pushFollow(FOLLOW_real_constant_in_manifest_constant8376);
                    rc=real_constant();

                    state._fsp--;
                    if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = RealConstant.mk((rc!=null?rc.value:null),getSLoc((rc!=null?((Token)rc.start):null),(rc!=null?((Token)rc.stop):null))); 
                    }

                    }
                    break;
                case 5 :
                    // BON.g:1272:4: ms= MANIFEST_STRING
                    {
                    ms=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_manifest_constant8389); if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = StringConstant.mk((ms!=null?ms.getText():null),getSLoc(ms)); 
                    }

                    }
                    break;
                case 6 :
                    // BON.g:1274:4: es= enumerated_set
                    {
                    pushFollow(FOLLOW_enumerated_set_in_manifest_constant8402);
                    es=enumerated_set();

                    state._fsp--;
                    if (state.failed) return constant;
                    if ( state.backtracking==0 ) {
                       constant = SetConstant.mk((es!=null?es.list:null), getSLoc((es!=null?((Token)es.start):null),(es!=null?((Token)es.stop):null))); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "manifest_constant"


    // $ANTLR start "sign"
    // BON.g:1278:1: sign returns [BinaryExp.Op op] : add_sub_op ;
    public final BinaryExp.Op sign() throws RecognitionException {
        BinaryExp.Op op = null;

        BinaryExp.Op add_sub_op94 = null;


        try {
            // BON.g:1278:32: ( add_sub_op )
            // BON.g:1279:3: add_sub_op
            {
            pushFollow(FOLLOW_add_sub_op_in_sign8441);
            add_sub_op94=add_sub_op();

            state._fsp--;
            if (state.failed) return op;
            if ( state.backtracking==0 ) {
               op = add_sub_op94; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "sign"

    public static class boolean_constant_return extends ParserRuleReturnScope {
        public Boolean value;
    };

    // $ANTLR start "boolean_constant"
    // BON.g:1283:1: boolean_constant returns [Boolean value] : ( 'true' | 'false' );
    public final BONParser.boolean_constant_return boolean_constant() throws RecognitionException {
        BONParser.boolean_constant_return retval = new BONParser.boolean_constant_return();
        retval.start = input.LT(1);

        try {
            // BON.g:1283:42: ( 'true' | 'false' )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==90) ) {
                alt143=1;
            }
            else if ( (LA143_0==91) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // BON.g:1284:4: 'true'
                    {
                    match(input,90,FOLLOW_90_in_boolean_constant8467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = true; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1286:4: 'false'
                    {
                    match(input,91,FOLLOW_91_in_boolean_constant8478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = false; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_constant"

    public static class character_constant_return extends ParserRuleReturnScope {
        public Character value;
    };

    // $ANTLR start "character_constant"
    // BON.g:1292:1: character_constant returns [Character value] : cc= CHARACTER_CONSTANT ;
    public final BONParser.character_constant_return character_constant() throws RecognitionException {
        BONParser.character_constant_return retval = new BONParser.character_constant_return();
        retval.start = input.LT(1);

        Token cc=null;

        try {
            // BON.g:1292:46: (cc= CHARACTER_CONSTANT )
            // BON.g:1293:2: cc= CHARACTER_CONSTANT
            {
            cc=(Token)match(input,CHARACTER_CONSTANT,FOLLOW_CHARACTER_CONSTANT_in_character_constant8502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = (cc!=null?cc.getText():null).charAt(1); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "character_constant"

    public static class integer_constant_return extends ParserRuleReturnScope {
        public Integer value;
    };

    // $ANTLR start "integer_constant"
    // BON.g:1301:1: integer_constant returns [Integer value] : ( sign )? i= INTEGER ;
    public final BONParser.integer_constant_return integer_constant() throws RecognitionException {
        BONParser.integer_constant_return retval = new BONParser.integer_constant_return();
        retval.start = input.LT(1);

        Token i=null;
        BinaryExp.Op sign95 = null;


         boolean negative = false; 
        try {
            // BON.g:1303:1: ( ( sign )? i= INTEGER )
            // BON.g:1304:3: ( sign )? i= INTEGER
            {
            // BON.g:1304:3: ( sign )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( ((LA144_0>=103 && LA144_0<=104)) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // BON.g:1304:4: sign
                    {
                    pushFollow(FOLLOW_sign_in_integer_constant8568);
                    sign95=sign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (sign95 == BinaryExp.Op.SUB) negative = true; 
                    }

                    }
                    break;

            }

            i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer_constant8579); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = new Integer((i!=null?i.getText():null)); if (negative) retval.value = -retval.value; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer_constant"

    public static class real_constant_return extends ParserRuleReturnScope {
        public Double value;
    };

    // $ANTLR start "real_constant"
    // BON.g:1309:1: real_constant returns [Double value] : ( sign )? r= REAL ;
    public final BONParser.real_constant_return real_constant() throws RecognitionException {
        BONParser.real_constant_return retval = new BONParser.real_constant_return();
        retval.start = input.LT(1);

        Token r=null;
        BinaryExp.Op sign96 = null;


         boolean negative = false; 
        try {
            // BON.g:1311:1: ( ( sign )? r= REAL )
            // BON.g:1312:3: ( sign )? r= REAL
            {
            // BON.g:1312:3: ( sign )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=103 && LA145_0<=104)) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // BON.g:1312:4: sign
                    {
                    pushFollow(FOLLOW_sign_in_real_constant8624);
                    sign96=sign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (sign96 == BinaryExp.Op.SUB) negative = true; 
                    }

                    }
                    break;

            }

            r=(Token)match(input,REAL,FOLLOW_REAL_in_real_constant8636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = new Double((r!=null?r.getText():null)); if (negative) retval.value = -retval.value; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "real_constant"


    // $ANTLR start "dynamic_diagram"
    // BON.g:1317:1: dynamic_diagram returns [DynamicDiagram dd] : s= 'dynamic_diagram' (eid= extended_id )? (c= COMMENT )? 'component' (db= dynamic_block | ) e= 'end' ;
    public final DynamicDiagram dynamic_diagram() throws RecognitionException {
        DynamicDiagram dd = null;

        Token s=null;
        Token c=null;
        Token e=null;
        BONParser.extended_id_return eid = null;

        List<DynamicComponent> db = null;


         String id = null; String comment = null; List<DynamicComponent> components = null; 
        try {
            // BON.g:1323:1: (s= 'dynamic_diagram' (eid= extended_id )? (c= COMMENT )? 'component' (db= dynamic_block | ) e= 'end' )
            // BON.g:1324:3: s= 'dynamic_diagram' (eid= extended_id )? (c= COMMENT )? 'component' (db= dynamic_block | ) e= 'end'
            {
            s=(Token)match(input,92,FOLLOW_92_in_dynamic_diagram8667); if (state.failed) return dd;
            // BON.g:1325:3: (eid= extended_id )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==IDENTIFIER||LA146_0==INTEGER) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // BON.g:1325:4: eid= extended_id
                    {
                    pushFollow(FOLLOW_extended_id_in_dynamic_diagram8675);
                    eid=extended_id();

                    state._fsp--;
                    if (state.failed) return dd;
                    if ( state.backtracking==0 ) {
                       id = (eid!=null?eid.eid:null); 
                    }

                    }
                    break;

            }

            // BON.g:1326:3: (c= COMMENT )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==COMMENT) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // BON.g:1326:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dynamic_diagram8688); if (state.failed) return dd;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); 
                    }

                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_dynamic_diagram8697); if (state.failed) return dd;
            // BON.g:1328:3: (db= dynamic_block | )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==IDENTIFIER||LA148_0==INTEGER||LA148_0==50||(LA148_0>=94 && LA148_0<=97)) ) {
                alt148=1;
            }
            else if ( (LA148_0==25) ) {
                alt148=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dd;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // BON.g:1328:5: db= dynamic_block
                    {
                    pushFollow(FOLLOW_dynamic_block_in_dynamic_diagram8706);
                    db=dynamic_block();

                    state._fsp--;
                    if (state.failed) return dd;
                    if ( state.backtracking==0 ) {
                       components = db; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1330:6: 
                    {
                    if ( state.backtracking==0 ) {
                       components = emptyList(); 
                    }

                    }
                    break;

            }

            e=(Token)match(input,25,FOLLOW_25_in_dynamic_diagram8730); if (state.failed) return dd;
            if ( state.backtracking==0 ) {
               dd = DynamicDiagram.mk(components, id, comment, getSLoc(s,e)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dd;
    }
    // $ANTLR end "dynamic_diagram"


    // $ANTLR start "dynamic_block"
    // BON.g:1336:1: dynamic_block returns [List<DynamicComponent> components] : (dc= dynamic_component )+ ;
    public final List<DynamicComponent> dynamic_block() throws RecognitionException {
        List<DynamicComponent> components = null;

        DynamicComponent dc = null;


        try {
            // BON.g:1336:59: ( (dc= dynamic_component )+ )
            // BON.g:1337:3: (dc= dynamic_component )+
            {
            if ( state.backtracking==0 ) {
               components = createList(); 
            }
            // BON.g:1338:3: (dc= dynamic_component )+
            int cnt149=0;
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==IDENTIFIER||LA149_0==INTEGER||LA149_0==50||(LA149_0>=94 && LA149_0<=97)) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // BON.g:1338:4: dc= dynamic_component
            	    {
            	    pushFollow(FOLLOW_dynamic_component_in_dynamic_block8773);
            	    dc=dynamic_component();

            	    state._fsp--;
            	    if (state.failed) return components;
            	    if ( state.backtracking==0 ) {
            	       components.add(dc); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt149 >= 1 ) break loop149;
            	    if (state.backtracking>0) {state.failed=true; return components;}
                        EarlyExitException eee =
                            new EarlyExitException(149, input);
                        throw eee;
                }
                cnt149++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return components;
    }
    // $ANTLR end "dynamic_block"


    // $ANTLR start "dynamic_component"
    // BON.g:1341:1: dynamic_component returns [DynamicComponent component] : ( scenario_description | object_group | object_stack | object | message_relation );
    public final DynamicComponent dynamic_component() throws RecognitionException {
        DynamicComponent component = null;

        try {
            // BON.g:1341:56: ( scenario_description | object_group | object_stack | object | message_relation )
            int alt150=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt150=1;
                }
                break;
            case 94:
            case 95:
                {
                alt150=2;
                }
                break;
            case 96:
                {
                alt150=3;
                }
                break;
            case 97:
                {
                alt150=4;
                }
                break;
            case IDENTIFIER:
            case INTEGER:
                {
                alt150=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return component;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // BON.g:1342:4: scenario_description
                    {
                    pushFollow(FOLLOW_scenario_description_in_dynamic_component8810);
                    scenario_description();

                    state._fsp--;
                    if (state.failed) return component;

                    }
                    break;
                case 2 :
                    // BON.g:1343:4: object_group
                    {
                    pushFollow(FOLLOW_object_group_in_dynamic_component8815);
                    object_group();

                    state._fsp--;
                    if (state.failed) return component;

                    }
                    break;
                case 3 :
                    // BON.g:1344:4: object_stack
                    {
                    pushFollow(FOLLOW_object_stack_in_dynamic_component8821);
                    object_stack();

                    state._fsp--;
                    if (state.failed) return component;

                    }
                    break;
                case 4 :
                    // BON.g:1345:4: object
                    {
                    pushFollow(FOLLOW_object_in_dynamic_component8826);
                    object();

                    state._fsp--;
                    if (state.failed) return component;

                    }
                    break;
                case 5 :
                    // BON.g:1346:4: message_relation
                    {
                    pushFollow(FOLLOW_message_relation_in_dynamic_component8831);
                    message_relation();

                    state._fsp--;
                    if (state.failed) return component;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return component;
    }
    // $ANTLR end "dynamic_component"


    // $ANTLR start "scenario_description"
    // BON.g:1349:1: scenario_description returns [ScenarioDescription description] : s= 'scenario' scenario_name (c= COMMENT )? 'action' la= labelled_actions e= 'end' ;
    public final ScenarioDescription scenario_description() throws RecognitionException {
        ScenarioDescription description = null;

        Token s=null;
        Token c=null;
        Token e=null;
        List<LabelledAction> la = null;

        String scenario_name97 = null;


         String comment = null; 
        try {
            // BON.g:1353:1: (s= 'scenario' scenario_name (c= COMMENT )? 'action' la= labelled_actions e= 'end' )
            // BON.g:1354:3: s= 'scenario' scenario_name (c= COMMENT )? 'action' la= labelled_actions e= 'end'
            {
            s=(Token)match(input,50,FOLLOW_50_in_scenario_description8859); if (state.failed) return description;
            pushFollow(FOLLOW_scenario_name_in_scenario_description8861);
            scenario_name97=scenario_name();

            state._fsp--;
            if (state.failed) return description;
            // BON.g:1355:3: (c= COMMENT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==COMMENT) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // BON.g:1355:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenario_description8869); if (state.failed) return description;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); 
                    }

                    }
                    break;

            }

            match(input,93,FOLLOW_93_in_scenario_description8878); if (state.failed) return description;
            pushFollow(FOLLOW_labelled_actions_in_scenario_description8885);
            la=labelled_actions();

            state._fsp--;
            if (state.failed) return description;
            e=(Token)match(input,25,FOLLOW_25_in_scenario_description8892); if (state.failed) return description;
            if ( state.backtracking==0 ) {
               description = ScenarioDescription.mk(scenario_name97, la, comment, getSLoc(s,c)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return description;
    }
    // $ANTLR end "scenario_description"


    // $ANTLR start "labelled_actions"
    // BON.g:1362:1: labelled_actions returns [List<LabelledAction> actions] : (la= labelled_action )+ ;
    public final List<LabelledAction> labelled_actions() throws RecognitionException {
        List<LabelledAction> actions = null;

        LabelledAction la = null;


        try {
            // BON.g:1362:57: ( (la= labelled_action )+ )
            // BON.g:1363:3: (la= labelled_action )+
            {
            if ( state.backtracking==0 ) {
               actions = createList(); 
            }
            // BON.g:1364:3: (la= labelled_action )+
            int cnt152=0;
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==MANIFEST_STRING) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // BON.g:1364:4: la= labelled_action
            	    {
            	    pushFollow(FOLLOW_labelled_action_in_labelled_actions8940);
            	    la=labelled_action();

            	    state._fsp--;
            	    if (state.failed) return actions;
            	    if ( state.backtracking==0 ) {
            	       actions.add(la); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt152 >= 1 ) break loop152;
            	    if (state.backtracking>0) {state.failed=true; return actions;}
                        EarlyExitException eee =
                            new EarlyExitException(152, input);
                        throw eee;
                }
                cnt152++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return actions;
    }
    // $ANTLR end "labelled_actions"


    // $ANTLR start "labelled_action"
    // BON.g:1367:1: labelled_action returns [LabelledAction action] : al= action_label ad= action_description ;
    public final LabelledAction labelled_action() throws RecognitionException {
        LabelledAction action = null;

        BONParser.action_label_return al = null;

        BONParser.action_description_return ad = null;


        try {
            // BON.g:1367:49: (al= action_label ad= action_description )
            // BON.g:1368:3: al= action_label ad= action_description
            {
            pushFollow(FOLLOW_action_label_in_labelled_action8981);
            al=action_label();

            state._fsp--;
            if (state.failed) return action;
            pushFollow(FOLLOW_action_description_in_labelled_action8985);
            ad=action_description();

            state._fsp--;
            if (state.failed) return action;
            if ( state.backtracking==0 ) {
               action = LabelledAction.mk((al!=null?al.label:null), (ad!=null?ad.description:null), getSLoc((al!=null?((Token)al.start):null),(ad!=null?((Token)ad.stop):null))); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return action;
    }
    // $ANTLR end "labelled_action"

    public static class action_label_return extends ParserRuleReturnScope {
        public String label;
    };

    // $ANTLR start "action_label"
    // BON.g:1372:1: action_label returns [String label] : m= MANIFEST_STRING ;
    public final BONParser.action_label_return action_label() throws RecognitionException {
        BONParser.action_label_return retval = new BONParser.action_label_return();
        retval.start = input.LT(1);

        Token m=null;

        try {
            // BON.g:1372:37: (m= MANIFEST_STRING )
            // BON.g:1373:3: m= MANIFEST_STRING
            {
            m=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_action_label9024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.label = (m!=null?m.getText():null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action_label"

    public static class action_description_return extends ParserRuleReturnScope {
        public String description;
    };

    // $ANTLR start "action_description"
    // BON.g:1377:1: action_description returns [String description] : m= manifest_textblock ;
    public final BONParser.action_description_return action_description() throws RecognitionException {
        BONParser.action_description_return retval = new BONParser.action_description_return();
        retval.start = input.LT(1);

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:1377:49: (m= manifest_textblock )
            // BON.g:1378:3: m= manifest_textblock
            {
            pushFollow(FOLLOW_manifest_textblock_in_action_description9059);
            m=manifest_textblock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.description = (m!=null?input.toString(m.start,m.stop):null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action_description"


    // $ANTLR start "scenario_name"
    // BON.g:1382:1: scenario_name returns [String name] : m= manifest_textblock ;
    public final String scenario_name() throws RecognitionException {
        String name = null;

        BONParser.manifest_textblock_return m = null;


        try {
            // BON.g:1382:37: (m= manifest_textblock )
            // BON.g:1383:3: m= manifest_textblock
            {
            pushFollow(FOLLOW_manifest_textblock_in_scenario_name9100);
            m=manifest_textblock();

            state._fsp--;
            if (state.failed) return name;
            if ( state.backtracking==0 ) {
               name = (m!=null?input.toString(m.start,m.stop):null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "scenario_name"


    // $ANTLR start "object_group"
    // BON.g:1387:1: object_group returns [ObjectGroup group] : (n= 'nameless' | ) s= 'object_group' group_name (c= COMMENT )? (gc= group_components | ) ;
    public final ObjectGroup object_group() throws RecognitionException {
        ObjectGroup group = null;

        Token n=null;
        Token s=null;
        Token c=null;
        List<DynamicComponent> gc = null;

        BONParser.group_name_return group_name98 = null;


         String comment = null; List<DynamicComponent> components = null; 
                ObjectGroup.Nameless nameless = ObjectGroup.Nameless.NOTNAMELESS; 
                Token start = null; Token end = null; 
        try {
            // BON.g:1393:1: ( (n= 'nameless' | ) s= 'object_group' group_name (c= COMMENT )? (gc= group_components | ) )
            // BON.g:1394:3: (n= 'nameless' | ) s= 'object_group' group_name (c= COMMENT )? (gc= group_components | )
            {
            // BON.g:1394:3: (n= 'nameless' | )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==94) ) {
                alt153=1;
            }
            else if ( (LA153_0==95) ) {
                alt153=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return group;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // BON.g:1394:6: n= 'nameless'
                    {
                    n=(Token)match(input,94,FOLLOW_94_in_object_group9133); if (state.failed) return group;
                    if ( state.backtracking==0 ) {
                       nameless = ObjectGroup.Nameless.NAMELESS; start = n; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1396:6: 
                    {
                    if ( state.backtracking==0 ) {
                       nameless = ObjectGroup.Nameless.NOTNAMELESS; 
                    }

                    }
                    break;

            }

            s=(Token)match(input,95,FOLLOW_95_in_object_group9158); if (state.failed) return group;
            if ( state.backtracking==0 ) {
               if (start==null) start=s; 
            }
            pushFollow(FOLLOW_group_name_in_object_group9164);
            group_name98=group_name();

            state._fsp--;
            if (state.failed) return group;
            if ( state.backtracking==0 ) {
               end = (group_name98!=null?((Token)group_name98.stop):null); 
            }
            // BON.g:1401:3: (c= COMMENT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==COMMENT) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // BON.g:1401:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_object_group9176); if (state.failed) return group;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); end = c; 
                    }

                    }
                    break;

            }

            // BON.g:1402:3: (gc= group_components | )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==55) ) {
                alt155=1;
            }
            else if ( (LA155_0==IDENTIFIER||LA155_0==INTEGER||LA155_0==25||LA155_0==50||(LA155_0>=94 && LA155_0<=97)) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return group;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // BON.g:1402:6: gc= group_components
                    {
                    pushFollow(FOLLOW_group_components_in_object_group9191);
                    gc=group_components();

                    state._fsp--;
                    if (state.failed) return group;
                    if ( state.backtracking==0 ) {
                       components = gc; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1404:6: 
                    {
                    if ( state.backtracking==0 ) {
                       components = emptyList(); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               group = ObjectGroup.mk(nameless, (group_name98!=null?input.toString(group_name98.start,group_name98.stop):null), components, comment, getSLoc(start,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return group;
    }
    // $ANTLR end "object_group"


    // $ANTLR start "group_components"
    // BON.g:1409:1: group_components returns [List<DynamicComponent> components] : 'component' dynamic_block 'end' ;
    public final List<DynamicComponent> group_components() throws RecognitionException {
        List<DynamicComponent> components = null;

        List<DynamicComponent> dynamic_block99 = null;


        try {
            // BON.g:1409:62: ( 'component' dynamic_block 'end' )
            // BON.g:1410:3: 'component' dynamic_block 'end'
            {
            match(input,55,FOLLOW_55_in_group_components9242); if (state.failed) return components;
            pushFollow(FOLLOW_dynamic_block_in_group_components9244);
            dynamic_block99=dynamic_block();

            state._fsp--;
            if (state.failed) return components;
            match(input,25,FOLLOW_25_in_group_components9246); if (state.failed) return components;
            if ( state.backtracking==0 ) {
               components = dynamic_block99; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return components;
    }
    // $ANTLR end "group_components"


    // $ANTLR start "object_stack"
    // BON.g:1414:1: object_stack returns [ObjectStack stack] : s= 'object_stack' n= object_name (c= COMMENT )? ;
    public final ObjectStack object_stack() throws RecognitionException {
        ObjectStack stack = null;

        Token s=null;
        Token c=null;
        BONParser.object_name_return n = null;


         String comment = null; Token end = null; 
        try {
            // BON.g:1416:1: (s= 'object_stack' n= object_name (c= COMMENT )? )
            // BON.g:1417:3: s= 'object_stack' n= object_name (c= COMMENT )?
            {
            s=(Token)match(input,96,FOLLOW_96_in_object_stack9291); if (state.failed) return stack;
            pushFollow(FOLLOW_object_name_in_object_stack9298);
            n=object_name();

            state._fsp--;
            if (state.failed) return stack;
            if ( state.backtracking==0 ) {
               end = (n!=null?((Token)n.stop):null); 
            }
            // BON.g:1420:3: (c= COMMENT )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==COMMENT) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // BON.g:1420:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_object_stack9310); if (state.failed) return stack;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); end = c; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               stack = ObjectStack.mk((n!=null?n.name:null), comment, getSLoc(s,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stack;
    }
    // $ANTLR end "object_stack"


    // $ANTLR start "object"
    // BON.g:1424:1: object returns [ObjectInstance object] : s= 'object' n= object_name (c= COMMENT )? ;
    public final ObjectInstance object() throws RecognitionException {
        ObjectInstance object = null;

        Token s=null;
        Token c=null;
        BONParser.object_name_return n = null;


         String comment = null; Token end = null; 
        try {
            // BON.g:1426:1: (s= 'object' n= object_name (c= COMMENT )? )
            // BON.g:1427:3: s= 'object' n= object_name (c= COMMENT )?
            {
            s=(Token)match(input,97,FOLLOW_97_in_object9358); if (state.failed) return object;
            pushFollow(FOLLOW_object_name_in_object9365);
            n=object_name();

            state._fsp--;
            if (state.failed) return object;
            if ( state.backtracking==0 ) {
               end = (n!=null?((Token)n.stop):null); 
            }
            // BON.g:1430:3: (c= COMMENT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==COMMENT) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // BON.g:1430:4: c= COMMENT
                    {
                    c=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_object9377); if (state.failed) return object;
                    if ( state.backtracking==0 ) {
                       comment = (c!=null?c.getText():null); end = c; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               object = ObjectInstance.mk((n!=null?n.name:null), comment, getSLoc(s,end)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return object;
    }
    // $ANTLR end "object"


    // $ANTLR start "message_relation"
    // BON.g:1434:1: message_relation : caller 'calls' receiver ( message_label )? ;
    public final void message_relation() throws RecognitionException {
        try {
            // BON.g:1436:19: ( caller 'calls' receiver ( message_label )? )
            // BON.g:1436:22: caller 'calls' receiver ( message_label )?
            {
            pushFollow(FOLLOW_caller_in_message_relation9401);
            caller();

            state._fsp--;
            if (state.failed) return ;
            match(input,98,FOLLOW_98_in_message_relation9403); if (state.failed) return ;
            pushFollow(FOLLOW_receiver_in_message_relation9405);
            receiver();

            state._fsp--;
            if (state.failed) return ;
            // BON.g:1436:46: ( message_label )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==MANIFEST_STRING) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // BON.g:1436:47: message_label
                    {
                    pushFollow(FOLLOW_message_label_in_message_relation9408);
                    message_label();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "message_relation"


    // $ANTLR start "caller"
    // BON.g:1439:1: caller : dynamic_ref ;
    public final void caller() throws RecognitionException {
        try {
            // BON.g:1439:9: ( dynamic_ref )
            // BON.g:1439:12: dynamic_ref
            {
            pushFollow(FOLLOW_dynamic_ref_in_caller9440);
            dynamic_ref();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "caller"


    // $ANTLR start "receiver"
    // BON.g:1442:1: receiver : dynamic_ref ;
    public final void receiver() throws RecognitionException {
        try {
            // BON.g:1442:11: ( dynamic_ref )
            // BON.g:1442:14: dynamic_ref
            {
            pushFollow(FOLLOW_dynamic_ref_in_receiver9460);
            dynamic_ref();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "receiver"


    // $ANTLR start "dynamic_ref"
    // BON.g:1449:1: dynamic_ref : extended_id ( '.' extended_id )* ;
    public final void dynamic_ref() throws RecognitionException {
        try {
            // BON.g:1449:14: ( extended_id ( '.' extended_id )* )
            // BON.g:1449:17: extended_id ( '.' extended_id )*
            {
            pushFollow(FOLLOW_extended_id_in_dynamic_ref9486);
            extended_id();

            state._fsp--;
            if (state.failed) return ;
            // BON.g:1449:29: ( '.' extended_id )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==70) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // BON.g:1449:30: '.' extended_id
            	    {
            	    match(input,70,FOLLOW_70_in_dynamic_ref9489); if (state.failed) return ;
            	    pushFollow(FOLLOW_extended_id_in_dynamic_ref9491);
            	    extended_id();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dynamic_ref"


    // $ANTLR start "dynamic_component_name"
    // BON.g:1458:1: dynamic_component_name : ( ( IDENTIFIER ( '.' extended_id )? ) | INTEGER );
    public final void dynamic_component_name() throws RecognitionException {
        try {
            // BON.g:1458:25: ( ( IDENTIFIER ( '.' extended_id )? ) | INTEGER )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IDENTIFIER) ) {
                alt161=1;
            }
            else if ( (LA161_0==INTEGER) ) {
                alt161=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // BON.g:1459:4: ( IDENTIFIER ( '.' extended_id )? )
                    {
                    // BON.g:1459:4: ( IDENTIFIER ( '.' extended_id )? )
                    // BON.g:1459:5: IDENTIFIER ( '.' extended_id )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dynamic_component_name9522); if (state.failed) return ;
                    // BON.g:1459:16: ( '.' extended_id )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==70) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // BON.g:1459:17: '.' extended_id
                            {
                            match(input,70,FOLLOW_70_in_dynamic_component_name9525); if (state.failed) return ;
                            pushFollow(FOLLOW_extended_id_in_dynamic_component_name9527);
                            extended_id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // BON.g:1460:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_dynamic_component_name9536); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dynamic_component_name"

    public static class object_name_return extends ParserRuleReturnScope {
        public ObjectName name;
    };

    // $ANTLR start "object_name"
    // BON.g:1463:1: object_name returns [ObjectName name] : n= class_name ( '.' e= extended_id )? ;
    public final BONParser.object_name_return object_name() throws RecognitionException {
        BONParser.object_name_return retval = new BONParser.object_name_return();
        retval.start = input.LT(1);

        BONParser.class_name_return n = null;

        BONParser.extended_id_return e = null;


         String id = null; Token end = null; 
        try {
            // BON.g:1465:1: (n= class_name ( '.' e= extended_id )? )
            // BON.g:1466:3: n= class_name ( '.' e= extended_id )?
            {
            pushFollow(FOLLOW_class_name_in_object_name9559);
            n=class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               end = (n!=null?((Token)n.stop):null); 
            }
            // BON.g:1468:3: ( '.' e= extended_id )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==70) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // BON.g:1468:4: '.' e= extended_id
                    {
                    match(input,70,FOLLOW_70_in_object_name9569); if (state.failed) return retval;
                    pushFollow(FOLLOW_extended_id_in_object_name9573);
                    e=extended_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       id = (e!=null?e.eid:null); end=(e!=null?((Token)e.stop):null); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               retval.name = ObjectName.mk((n!=null?n.name:null), id, getSLoc((n!=null?((Token)n.start):null),end)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object_name"

    public static class group_name_return extends ParserRuleReturnScope {
        public String name;
    };

    // $ANTLR start "group_name"
    // BON.g:1472:1: group_name returns [String name] : e= extended_id ;
    public final BONParser.group_name_return group_name() throws RecognitionException {
        BONParser.group_name_return retval = new BONParser.group_name_return();
        retval.start = input.LT(1);

        BONParser.extended_id_return e = null;


        try {
            // BON.g:1472:34: (e= extended_id )
            // BON.g:1473:3: e= extended_id
            {
            pushFollow(FOLLOW_extended_id_in_group_name9613);
            e=extended_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = (e!=null?e.eid:null); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "group_name"


    // $ANTLR start "message_label"
    // BON.g:1477:1: message_label returns [String label] : m= MANIFEST_STRING ;
    public final String message_label() throws RecognitionException {
        String label = null;

        Token m=null;

        try {
            // BON.g:1477:38: (m= MANIFEST_STRING )
            // BON.g:1478:3: m= MANIFEST_STRING
            {
            m=(Token)match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_message_label9646); if (state.failed) return label;
            if ( state.backtracking==0 ) {
               label = (m!=null?m.getText():null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return label;
    }
    // $ANTLR end "message_label"


    // $ANTLR start "notational_tuning"
    // BON.g:1482:1: notational_tuning : ( change_string_marks | change_concatenator | change_prefix );
    public final void notational_tuning() throws RecognitionException {
        try {
            // BON.g:1486:19: ( change_string_marks | change_concatenator | change_prefix )
            int alt163=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt163=1;
                }
                break;
            case 100:
                {
                alt163=2;
                }
                break;
            case 101:
                {
                alt163=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // BON.g:1487:4: change_string_marks
                    {
                    pushFollow(FOLLOW_change_string_marks_in_notational_tuning9670);
                    change_string_marks();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // BON.g:1488:4: change_concatenator
                    {
                    pushFollow(FOLLOW_change_concatenator_in_notational_tuning9676);
                    change_concatenator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // BON.g:1489:4: change_prefix
                    {
                    pushFollow(FOLLOW_change_prefix_in_notational_tuning9681);
                    change_prefix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "notational_tuning"


    // $ANTLR start "change_string_marks"
    // BON.g:1492:1: change_string_marks : 'string_marks' MANIFEST_STRING MANIFEST_STRING ;
    public final void change_string_marks() throws RecognitionException {
        try {
            // BON.g:1492:22: ( 'string_marks' MANIFEST_STRING MANIFEST_STRING )
            // BON.g:1493:3: 'string_marks' MANIFEST_STRING MANIFEST_STRING
            {
            match(input,99,FOLLOW_99_in_change_string_marks9696); if (state.failed) return ;
            match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_change_string_marks9698); if (state.failed) return ;
            match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_change_string_marks9700); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "change_string_marks"


    // $ANTLR start "change_concatenator"
    // BON.g:1496:1: change_concatenator : 'concatenator' MANIFEST_STRING ;
    public final void change_concatenator() throws RecognitionException {
        try {
            // BON.g:1496:22: ( 'concatenator' MANIFEST_STRING )
            // BON.g:1497:3: 'concatenator' MANIFEST_STRING
            {
            match(input,100,FOLLOW_100_in_change_concatenator9734); if (state.failed) return ;
            match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_change_concatenator9736); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "change_concatenator"


    // $ANTLR start "change_prefix"
    // BON.g:1500:1: change_prefix : 'keyword_prefix' MANIFEST_STRING ;
    public final void change_prefix() throws RecognitionException {
        try {
            // BON.g:1500:16: ( 'keyword_prefix' MANIFEST_STRING )
            // BON.g:1501:3: 'keyword_prefix' MANIFEST_STRING
            {
            match(input,101,FOLLOW_101_in_change_prefix9770); if (state.failed) return ;
            match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_change_prefix9772); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "change_prefix"

    public static class expression_return extends ParserRuleReturnScope {
        public Expression exp;
    };

    // $ANTLR start "expression"
    // BON.g:1504:1: expression returns [Expression exp] : (e= equivalence_expression | q= quantification );
    public final BONParser.expression_return expression() throws RecognitionException {
        BONParser.expression_return retval = new BONParser.expression_return();
        retval.start = input.LT(1);

        Expression e = null;

        Quantification q = null;


        try {
            // BON.g:1508:37: (e= equivalence_expression | q= quantification )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( ((LA164_0>=MANIFEST_STRING && LA164_0<=IDENTIFIER)||(LA164_0>=INTEGER && LA164_0<=REAL)||LA164_0==42||LA164_0==62||(LA164_0>=87 && LA164_0<=91)||(LA164_0>=103 && LA164_0<=104)||(LA164_0>=108 && LA164_0<=110)) ) {
                alt164=1;
            }
            else if ( ((LA164_0>=81 && LA164_0<=82)) ) {
                alt164=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // BON.g:1509:4: e= equivalence_expression
                    {
                    pushFollow(FOLLOW_equivalence_expression_in_expression9798);
                    e=equivalence_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.exp = e; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1511:4: q= quantification
                    {
                    pushFollow(FOLLOW_quantification_in_expression9812);
                    q=quantification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.exp = q; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "equivalence_expression"
    // BON.g:1515:1: equivalence_expression returns [Expression exp] : l= implies_expression ( '<->' r= implies_expression )* ;
    public final Expression equivalence_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        Expression r = null;


        try {
            // BON.g:1515:49: (l= implies_expression ( '<->' r= implies_expression )* )
            // BON.g:1516:3: l= implies_expression ( '<->' r= implies_expression )*
            {
            pushFollow(FOLLOW_implies_expression_in_equivalence_expression9834);
            l=implies_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1518:3: ( '<->' r= implies_expression )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==102) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // BON.g:1518:4: '<->' r= implies_expression
            	    {
            	    match(input,102,FOLLOW_102_in_equivalence_expression9844); if (state.failed) return exp;
            	    pushFollow(FOLLOW_implies_expression_in_equivalence_expression9848);
            	    r=implies_expression();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       if (r == null) throw new RecognitionException();
            	           exp = BinaryExp.mk(BinaryExp.Op.EQUIV, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "equivalence_expression"


    // $ANTLR start "implies_expression"
    // BON.g:1525:1: implies_expression returns [Expression exp] : l= and_or_xor_expression ( '->' r= implies_expression )? ;
    public final Expression implies_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        Expression r = null;


        try {
            // BON.g:1525:45: (l= and_or_xor_expression ( '->' r= implies_expression )? )
            // BON.g:1526:3: l= and_or_xor_expression ( '->' r= implies_expression )?
            {
            pushFollow(FOLLOW_and_or_xor_expression_in_implies_expression9876);
            l=and_or_xor_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1528:3: ( '->' r= implies_expression )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==65) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // BON.g:1528:4: '->' r= implies_expression
                    {
                    match(input,65,FOLLOW_65_in_implies_expression9886); if (state.failed) return exp;
                    pushFollow(FOLLOW_implies_expression_in_implies_expression9890);
                    r=implies_expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       if (r == null) throw new RecognitionException();
                           exp = BinaryExp.mk(BinaryExp.Op.IMPLIES, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "implies_expression"


    // $ANTLR start "and_or_xor_expression"
    // BON.g:1534:1: and_or_xor_expression returns [Expression exp] : l= comparison_expression (op= and_or_xor_op r= comparison_expression )* ;
    public final Expression and_or_xor_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        BinaryExp.Op op = null;

        Expression r = null;


        try {
            // BON.g:1534:48: (l= comparison_expression (op= and_or_xor_op r= comparison_expression )* )
            // BON.g:1535:3: l= comparison_expression (op= and_or_xor_op r= comparison_expression )*
            {
            pushFollow(FOLLOW_comparison_expression_in_and_or_xor_expression9917);
            l=comparison_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1537:3: (op= and_or_xor_op r= comparison_expression )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( ((LA167_0>=105 && LA167_0<=107)) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // BON.g:1537:5: op= and_or_xor_op r= comparison_expression
            	    {
            	    pushFollow(FOLLOW_and_or_xor_op_in_and_or_xor_expression9930);
            	    op=and_or_xor_op();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    pushFollow(FOLLOW_comparison_expression_in_and_or_xor_expression9934);
            	    r=comparison_expression();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       if (r == null) throw new RecognitionException();
            	           exp = BinaryExp.mk(op, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop167;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "and_or_xor_expression"


    // $ANTLR start "comparison_expression"
    // BON.g:1543:1: comparison_expression returns [Expression exp] : l= add_sub_expression (op= comparison_op r= add_sub_expression )* ;
    public final Expression comparison_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        BinaryExp.Op op = null;

        Expression r = null;


        try {
            // BON.g:1543:48: (l= add_sub_expression (op= comparison_op r= add_sub_expression )* )
            // BON.g:1544:3: l= add_sub_expression (op= comparison_op r= add_sub_expression )*
            {
            pushFollow(FOLLOW_add_sub_expression_in_comparison_expression9962);
            l=add_sub_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1546:3: (op= comparison_op r= add_sub_expression )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==34||LA168_0==85||(LA168_0>=110 && LA168_0<=116)) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // BON.g:1546:4: op= comparison_op r= add_sub_expression
            	    {
            	    pushFollow(FOLLOW_comparison_op_in_comparison_expression9974);
            	    op=comparison_op();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    pushFollow(FOLLOW_add_sub_expression_in_comparison_expression9979);
            	    r=add_sub_expression();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       if (r == null) throw new RecognitionException();
            	           exp = BinaryExp.mk(op, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
            	         
            	    }

            	    }
            	    break;

            	default :
            	    break loop168;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "comparison_expression"


    // $ANTLR start "add_sub_expression"
    // BON.g:1553:1: add_sub_expression returns [Expression exp] : l= mul_div_expression (op= add_sub_op r= mul_div_expression )* ;
    public final Expression add_sub_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        BinaryExp.Op op = null;

        Expression r = null;


        try {
            // BON.g:1553:45: (l= mul_div_expression (op= add_sub_op r= mul_div_expression )* )
            // BON.g:1554:3: l= mul_div_expression (op= add_sub_op r= mul_div_expression )*
            {
            pushFollow(FOLLOW_mul_div_expression_in_add_sub_expression10007);
            l=mul_div_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1556:3: (op= add_sub_op r= mul_div_expression )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( ((LA169_0>=103 && LA169_0<=104)) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // BON.g:1556:4: op= add_sub_op r= mul_div_expression
            	    {
            	    pushFollow(FOLLOW_add_sub_op_in_add_sub_expression10019);
            	    op=add_sub_op();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    pushFollow(FOLLOW_mul_div_expression_in_add_sub_expression10023);
            	    r=mul_div_expression();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       if (r == null) throw new RecognitionException();
            	           exp = BinaryExp.mk(op, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop169;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "add_sub_expression"


    // $ANTLR start "mul_div_expression"
    // BON.g:1562:1: mul_div_expression returns [Expression exp] : l= mod_pow_expression (op= mul_div_op r= mod_pow_expression )* ;
    public final Expression mul_div_expression() throws RecognitionException {
        Expression exp = null;

        Expression l = null;

        BinaryExp.Op op = null;

        Expression r = null;


        try {
            // BON.g:1562:45: (l= mod_pow_expression (op= mul_div_op r= mod_pow_expression )* )
            // BON.g:1563:3: l= mod_pow_expression (op= mul_div_op r= mod_pow_expression )*
            {
            pushFollow(FOLLOW_mod_pow_expression_in_mul_div_expression10051);
            l=mod_pow_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = l; 
            }
            // BON.g:1565:3: (op= mul_div_op r= mod_pow_expression )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( ((LA170_0>=117 && LA170_0<=119)) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // BON.g:1565:4: op= mul_div_op r= mod_pow_expression
            	    {
            	    pushFollow(FOLLOW_mul_div_op_in_mul_div_expression10063);
            	    op=mul_div_op();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    pushFollow(FOLLOW_mod_pow_expression_in_mul_div_expression10067);
            	    r=mod_pow_expression();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       if (r == null) throw new RecognitionException();
            	           exp = BinaryExp.mk(op, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop170;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "mul_div_expression"


    // $ANTLR start "mod_pow_expression"
    // BON.g:1572:1: mod_pow_expression returns [Expression exp] : l= lowest_expression (op= mod_pow_op r= mod_pow_expression )? ;
    public final Expression mod_pow_expression() throws RecognitionException {
        Expression exp = null;

        BONParser.lowest_expression_return l = null;

        BinaryExp.Op op = null;

        Expression r = null;


        try {
            // BON.g:1572:45: (l= lowest_expression (op= mod_pow_op r= mod_pow_expression )? )
            // BON.g:1573:3: l= lowest_expression (op= mod_pow_op r= mod_pow_expression )?
            {
            pushFollow(FOLLOW_lowest_expression_in_mod_pow_expression10096);
            l=lowest_expression();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp = (l!=null?l.exp:null); 
            }
            // BON.g:1575:3: (op= mod_pow_op r= mod_pow_expression )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==76||LA171_0==120) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // BON.g:1575:4: op= mod_pow_op r= mod_pow_expression
                    {
                    pushFollow(FOLLOW_mod_pow_op_in_mod_pow_expression10108);
                    op=mod_pow_op();

                    state._fsp--;
                    if (state.failed) return exp;
                    pushFollow(FOLLOW_mod_pow_expression_in_mod_pow_expression10112);
                    r=mod_pow_expression();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       if (r == null) throw new RecognitionException();
                           exp = BinaryExp.mk(op, exp, r, getSLoc(exp.getLocation(),r.getLocation())); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return exp;
    }
    // $ANTLR end "mod_pow_expression"

    public static class lowest_expression_return extends ParserRuleReturnScope {
        public Expression exp;
    };

    // $ANTLR start "lowest_expression"
    // BON.g:1581:1: lowest_expression returns [Expression exp] : ( ( constant )=> constant ( ( '.' cc= call_chain ) | ) | unary le= lowest_expression | s= '(' e= expression ')' ( ( '.' cc= call_chain ) | ) | cc= call_chain );
    public final BONParser.lowest_expression_return lowest_expression() throws RecognitionException {
        BONParser.lowest_expression_return retval = new BONParser.lowest_expression_return();
        retval.start = input.LT(1);

        Token s=null;
        BONParser.call_chain_return cc = null;

        BONParser.lowest_expression_return le = null;

        BONParser.expression_return e = null;

        BONParser.constant_return constant100 = null;

        BONParser.unary_return unary101 = null;


        try {
            // BON.g:1581:44: ( ( constant )=> constant ( ( '.' cc= call_chain ) | ) | unary le= lowest_expression | s= '(' e= expression ')' ( ( '.' cc= call_chain ) | ) | cc= call_chain )
            int alt174=4;
            alt174 = dfa174.predict(input);
            switch (alt174) {
                case 1 :
                    // BON.g:1582:5: ( constant )=> constant ( ( '.' cc= call_chain ) | )
                    {
                    pushFollow(FOLLOW_constant_in_lowest_expression10145);
                    constant100=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    // BON.g:1583:5: ( ( '.' cc= call_chain ) | )
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==70) ) {
                        alt172=1;
                    }
                    else if ( (LA172_0==25||(LA172_0>=33 && LA172_0<=35)||LA172_0==43||LA172_0==63||LA172_0==65||(LA172_0>=75 && LA172_0<=76)||(LA172_0>=83 && LA172_0<=85)||(LA172_0>=102 && LA172_0<=107)||(LA172_0>=110 && LA172_0<=120)) ) {
                        alt172=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 172, 0, input);

                        throw nvae;
                    }
                    switch (alt172) {
                        case 1 :
                            // BON.g:1583:7: ( '.' cc= call_chain )
                            {
                            // BON.g:1583:7: ( '.' cc= call_chain )
                            // BON.g:1583:8: '.' cc= call_chain
                            {
                            match(input,70,FOLLOW_70_in_lowest_expression10154); if (state.failed) return retval;
                            pushFollow(FOLLOW_call_chain_in_lowest_expression10158);
                            cc=call_chain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.exp = CallExp.mk((constant100!=null?constant100.constant:null), (cc!=null?cc.calls:null), getSLoc((constant100!=null?((Token)constant100.start):null),(cc!=null?((Token)cc.stop):null))); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // BON.g:1587:7: 
                            {
                            if ( state.backtracking==0 ) {
                               retval.exp = (constant100!=null?constant100.constant:null); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // BON.g:1589:4: unary le= lowest_expression
                    {
                    pushFollow(FOLLOW_unary_in_lowest_expression10208);
                    unary101=unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_lowest_expression_in_lowest_expression10212);
                    le=lowest_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.exp = UnaryExp.mk((unary101!=null?unary101.op:null), (le!=null?le.exp:null), getSLoc((unary101!=null?((Token)unary101.start):null),(le!=null?((Token)le.stop):null))); 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1591:4: s= '(' e= expression ')' ( ( '.' cc= call_chain ) | )
                    {
                    s=(Token)match(input,42,FOLLOW_42_in_lowest_expression10225); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_lowest_expression10229);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,43,FOLLOW_43_in_lowest_expression10231); if (state.failed) return retval;
                    // BON.g:1592:4: ( ( '.' cc= call_chain ) | )
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==70) ) {
                        alt173=1;
                    }
                    else if ( (LA173_0==25||(LA173_0>=33 && LA173_0<=35)||LA173_0==43||LA173_0==63||LA173_0==65||(LA173_0>=75 && LA173_0<=76)||(LA173_0>=83 && LA173_0<=85)||(LA173_0>=102 && LA173_0<=107)||(LA173_0>=110 && LA173_0<=120)) ) {
                        alt173=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 173, 0, input);

                        throw nvae;
                    }
                    switch (alt173) {
                        case 1 :
                            // BON.g:1592:6: ( '.' cc= call_chain )
                            {
                            // BON.g:1592:6: ( '.' cc= call_chain )
                            // BON.g:1592:7: '.' cc= call_chain
                            {
                            match(input,70,FOLLOW_70_in_lowest_expression10241); if (state.failed) return retval;
                            pushFollow(FOLLOW_call_chain_in_lowest_expression10245);
                            cc=call_chain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.exp = CallExp.mk((e!=null?e.exp:null), (cc!=null?cc.calls:null), getSLoc(s,(cc!=null?((Token)cc.stop):null))); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // BON.g:1595:7: 
                            {
                            if ( state.backtracking==0 ) {
                               retval.exp = (e!=null?e.exp:null); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // BON.g:1597:4: cc= call_chain
                    {
                    pushFollow(FOLLOW_call_chain_in_lowest_expression10281);
                    cc=call_chain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.exp =  CallExp.mk(null, (cc!=null?cc.calls:null), getSLoc((cc!=null?((Token)cc.start):null),(cc!=null?((Token)cc.stop):null))); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lowest_expression"


    // $ANTLR start "add_sub_op"
    // BON.g:1601:1: add_sub_op returns [BinaryExp.Op op] : ( '+' | '-' );
    public final BinaryExp.Op add_sub_op() throws RecognitionException {
        BinaryExp.Op op = null;

        try {
            // BON.g:1605:38: ( '+' | '-' )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==103) ) {
                alt175=1;
            }
            else if ( (LA175_0==104) ) {
                alt175=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // BON.g:1606:4: '+'
                    {
                    match(input,103,FOLLOW_103_in_add_sub_op10305); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.ADD; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1607:4: '-'
                    {
                    match(input,104,FOLLOW_104_in_add_sub_op10313); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.SUB; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "add_sub_op"


    // $ANTLR start "add_sub_op_unary"
    // BON.g:1610:1: add_sub_op_unary returns [UnaryExp.Op op] : ( '+' | '-' );
    public final UnaryExp.Op add_sub_op_unary() throws RecognitionException {
        UnaryExp.Op op = null;

        try {
            // BON.g:1610:43: ( '+' | '-' )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==103) ) {
                alt176=1;
            }
            else if ( (LA176_0==104) ) {
                alt176=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // BON.g:1611:4: '+'
                    {
                    match(input,103,FOLLOW_103_in_add_sub_op_unary10331); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = UnaryExp.Op.ADD; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1612:4: '-'
                    {
                    match(input,104,FOLLOW_104_in_add_sub_op_unary10339); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = UnaryExp.Op.SUB; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "add_sub_op_unary"


    // $ANTLR start "and_or_xor_op"
    // BON.g:1615:1: and_or_xor_op returns [BinaryExp.Op op] : ( 'and' | 'or' | 'xor' );
    public final BinaryExp.Op and_or_xor_op() throws RecognitionException {
        BinaryExp.Op op = null;

        try {
            // BON.g:1615:41: ( 'and' | 'or' | 'xor' )
            int alt177=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt177=1;
                }
                break;
            case 106:
                {
                alt177=2;
                }
                break;
            case 107:
                {
                alt177=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }

            switch (alt177) {
                case 1 :
                    // BON.g:1616:4: 'and'
                    {
                    match(input,105,FOLLOW_105_in_and_or_xor_op10357); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.AND; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1617:4: 'or'
                    {
                    match(input,106,FOLLOW_106_in_and_or_xor_op10364); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.OR; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1618:4: 'xor'
                    {
                    match(input,107,FOLLOW_107_in_and_or_xor_op10372); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.XOR; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "and_or_xor_op"

    public static class unary_return extends ParserRuleReturnScope {
        public UnaryExp.Op op;
    };

    // $ANTLR start "unary"
    // BON.g:1621:1: unary returns [UnaryExp.Op op] : ( other_unary | add_sub_op_unary );
    public final BONParser.unary_return unary() throws RecognitionException {
        BONParser.unary_return retval = new BONParser.unary_return();
        retval.start = input.LT(1);

        UnaryExp.Op other_unary102 = null;

        UnaryExp.Op add_sub_op_unary103 = null;


        try {
            // BON.g:1621:33: ( other_unary | add_sub_op_unary )
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( ((LA178_0>=108 && LA178_0<=110)) ) {
                alt178=1;
            }
            else if ( ((LA178_0>=103 && LA178_0<=104)) ) {
                alt178=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }
            switch (alt178) {
                case 1 :
                    // BON.g:1622:4: other_unary
                    {
                    pushFollow(FOLLOW_other_unary_in_unary10392);
                    other_unary102=other_unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.op = other_unary102; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1623:4: add_sub_op_unary
                    {
                    pushFollow(FOLLOW_add_sub_op_unary_in_unary10406);
                    add_sub_op_unary103=add_sub_op_unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.op = add_sub_op_unary103; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary"


    // $ANTLR start "other_unary"
    // BON.g:1626:1: other_unary returns [UnaryExp.Op op] : ( 'delta' | 'old' | 'not' );
    public final UnaryExp.Op other_unary() throws RecognitionException {
        UnaryExp.Op op = null;

        try {
            // BON.g:1626:39: ( 'delta' | 'old' | 'not' )
            int alt179=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt179=1;
                }
                break;
            case 109:
                {
                alt179=2;
                }
                break;
            case 110:
                {
                alt179=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 179, 0, input);

                throw nvae;
            }

            switch (alt179) {
                case 1 :
                    // BON.g:1627:4: 'delta'
                    {
                    match(input,108,FOLLOW_108_in_other_unary10426); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = UnaryExp.Op.DELTA; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1628:4: 'old'
                    {
                    match(input,109,FOLLOW_109_in_other_unary10434); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = UnaryExp.Op.OLD; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1629:4: 'not'
                    {
                    match(input,110,FOLLOW_110_in_other_unary10443); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = UnaryExp.Op.NOT; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "other_unary"


    // $ANTLR start "binary"
    // BON.g:1632:1: binary : ( add_sub_op | mul_div_op | comparison_op | mod_pow_op | and_or_xor_op | '->' | '<->' );
    public final void binary() throws RecognitionException {
        try {
            // BON.g:1632:9: ( add_sub_op | mul_div_op | comparison_op | mod_pow_op | and_or_xor_op | '->' | '<->' )
            int alt180=7;
            switch ( input.LA(1) ) {
            case 103:
            case 104:
                {
                alt180=1;
                }
                break;
            case 117:
            case 118:
            case 119:
                {
                alt180=2;
                }
                break;
            case 34:
            case 85:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
                {
                alt180=3;
                }
                break;
            case 76:
            case 120:
                {
                alt180=4;
                }
                break;
            case 105:
            case 106:
            case 107:
                {
                alt180=5;
                }
                break;
            case 65:
                {
                alt180=6;
                }
                break;
            case 102:
                {
                alt180=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }

            switch (alt180) {
                case 1 :
                    // BON.g:1632:13: add_sub_op
                    {
                    pushFollow(FOLLOW_add_sub_op_in_binary10474);
                    add_sub_op();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // BON.g:1632:26: mul_div_op
                    {
                    pushFollow(FOLLOW_mul_div_op_in_binary10478);
                    mul_div_op();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // BON.g:1632:39: comparison_op
                    {
                    pushFollow(FOLLOW_comparison_op_in_binary10482);
                    comparison_op();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // BON.g:1633:13: mod_pow_op
                    {
                    pushFollow(FOLLOW_mod_pow_op_in_binary10497);
                    mod_pow_op();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // BON.g:1633:26: and_or_xor_op
                    {
                    pushFollow(FOLLOW_and_or_xor_op_in_binary10501);
                    and_or_xor_op();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // BON.g:1634:13: '->'
                    {
                    match(input,65,FOLLOW_65_in_binary10516); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // BON.g:1634:20: '<->'
                    {
                    match(input,102,FOLLOW_102_in_binary10520); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "binary"


    // $ANTLR start "comparison_op"
    // BON.g:1636:1: comparison_op returns [BinaryExp.Op op] : ( '<' | '>' | '<=' | '>=' | '=' | '/=' | 'member_of' | 'not' 'member_of' | ':' );
    public final BinaryExp.Op comparison_op() throws RecognitionException {
        BinaryExp.Op op = null;

        try {
            // BON.g:1636:41: ( '<' | '>' | '<=' | '>=' | '=' | '/=' | 'member_of' | 'not' 'member_of' | ':' )
            int alt181=9;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt181=1;
                }
                break;
            case 112:
                {
                alt181=2;
                }
                break;
            case 113:
                {
                alt181=3;
                }
                break;
            case 114:
                {
                alt181=4;
                }
                break;
            case 115:
                {
                alt181=5;
                }
                break;
            case 116:
                {
                alt181=6;
                }
                break;
            case 85:
                {
                alt181=7;
                }
                break;
            case 110:
                {
                alt181=8;
                }
                break;
            case 34:
                {
                alt181=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }

            switch (alt181) {
                case 1 :
                    // BON.g:1637:4: '<'
                    {
                    match(input,111,FOLLOW_111_in_comparison_op10536); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.LT; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1638:4: '>'
                    {
                    match(input,112,FOLLOW_112_in_comparison_op10544); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.GT; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1639:4: '<='
                    {
                    match(input,113,FOLLOW_113_in_comparison_op10552); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.LE; 
                    }

                    }
                    break;
                case 4 :
                    // BON.g:1640:4: '>='
                    {
                    match(input,114,FOLLOW_114_in_comparison_op10559); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.GE; 
                    }

                    }
                    break;
                case 5 :
                    // BON.g:1641:4: '='
                    {
                    match(input,115,FOLLOW_115_in_comparison_op10566); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.EQ; 
                    }

                    }
                    break;
                case 6 :
                    // BON.g:1642:4: '/='
                    {
                    match(input,116,FOLLOW_116_in_comparison_op10574); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.NEQ; 
                    }

                    }
                    break;
                case 7 :
                    // BON.g:1643:4: 'member_of'
                    {
                    match(input,85,FOLLOW_85_in_comparison_op10581); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.MEMBEROF; 
                    }

                    }
                    break;
                case 8 :
                    // BON.g:1644:4: 'not' 'member_of'
                    {
                    match(input,110,FOLLOW_110_in_comparison_op10588); if (state.failed) return op;
                    match(input,85,FOLLOW_85_in_comparison_op10590); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.NOTMEMBEROF; 
                    }

                    }
                    break;
                case 9 :
                    // BON.g:1645:4: ':'
                    {
                    match(input,34,FOLLOW_34_in_comparison_op10597); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.HASTYPE; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "comparison_op"


    // $ANTLR start "mul_div_op"
    // BON.g:1649:1: mul_div_op returns [BinaryExp.Op op] : ( '*' | '/' | '//' );
    public final BinaryExp.Op mul_div_op() throws RecognitionException {
        BinaryExp.Op op = null;

        try {
            // BON.g:1649:38: ( '*' | '/' | '//' )
            int alt182=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt182=1;
                }
                break;
            case 118:
                {
                alt182=2;
                }
                break;
            case 119:
                {
                alt182=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }

            switch (alt182) {
                case 1 :
                    // BON.g:1650:4: '*'
                    {
                    match(input,117,FOLLOW_117_in_mul_div_op10624); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.MUL; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1651:4: '/'
                    {
                    match(input,118,FOLLOW_118_in_mul_div_op10632); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.DIV; 
                    }

                    }
                    break;
                case 3 :
                    // BON.g:1652:4: '//'
                    {
                    match(input,119,FOLLOW_119_in_mul_div_op10640); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.INTDIV; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "mul_div_op"


    // $ANTLR start "mod_pow_op"
    // BON.g:1655:1: mod_pow_op returns [BinaryExp.Op op] : ( '\\\\\\\\' | '^' );
    public final BinaryExp.Op mod_pow_op() throws RecognitionException {
        BinaryExp.Op op = null;

        try {
            // BON.g:1655:38: ( '\\\\\\\\' | '^' )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==120) ) {
                alt183=1;
            }
            else if ( (LA183_0==76) ) {
                alt183=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }
            switch (alt183) {
                case 1 :
                    // BON.g:1656:4: '\\\\\\\\'
                    {
                    match(input,120,FOLLOW_120_in_mod_pow_op10673); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.MOD; 
                    }

                    }
                    break;
                case 2 :
                    // BON.g:1657:4: '^'
                    {
                    match(input,76,FOLLOW_76_in_mod_pow_op10681); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op = BinaryExp.Op.POW; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "mod_pow_op"

    public static class manifest_textblock_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "manifest_textblock"
    // BON.g:1699:1: manifest_textblock : ( MANIFEST_STRING | MANIFEST_TEXTBLOCK_START ( MANIFEST_TEXTBLOCK_MIDDLE )* MANIFEST_TEXTBLOCK_END );
    public final BONParser.manifest_textblock_return manifest_textblock() throws RecognitionException {
        BONParser.manifest_textblock_return retval = new BONParser.manifest_textblock_return();
        retval.start = input.LT(1);

        try {
            // BON.g:1700:1: ( MANIFEST_STRING | MANIFEST_TEXTBLOCK_START ( MANIFEST_TEXTBLOCK_MIDDLE )* MANIFEST_TEXTBLOCK_END )
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==MANIFEST_STRING) ) {
                alt185=1;
            }
            else if ( (LA185_0==MANIFEST_TEXTBLOCK_START) ) {
                alt185=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 185, 0, input);

                throw nvae;
            }
            switch (alt185) {
                case 1 :
                    // BON.g:1701:3: MANIFEST_STRING
                    {
                    if ( state.backtracking==0 ) {
                       //TODO warn when not MANIFEST_STRING where we desire a single block. 
                        
                    }
                    match(input,MANIFEST_STRING,FOLLOW_MANIFEST_STRING_in_manifest_textblock10993); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // BON.g:1704:4: MANIFEST_TEXTBLOCK_START ( MANIFEST_TEXTBLOCK_MIDDLE )* MANIFEST_TEXTBLOCK_END
                    {
                    match(input,MANIFEST_TEXTBLOCK_START,FOLLOW_MANIFEST_TEXTBLOCK_START_in_manifest_textblock10999); if (state.failed) return retval;
                    // BON.g:1704:29: ( MANIFEST_TEXTBLOCK_MIDDLE )*
                    loop184:
                    do {
                        int alt184=2;
                        int LA184_0 = input.LA(1);

                        if ( (LA184_0==MANIFEST_TEXTBLOCK_MIDDLE) ) {
                            alt184=1;
                        }


                        switch (alt184) {
                    	case 1 :
                    	    // BON.g:1704:29: MANIFEST_TEXTBLOCK_MIDDLE
                    	    {
                    	    match(input,MANIFEST_TEXTBLOCK_MIDDLE,FOLLOW_MANIFEST_TEXTBLOCK_MIDDLE_in_manifest_textblock11001); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop184;
                        }
                    } while (true);

                    match(input,MANIFEST_TEXTBLOCK_END,FOLLOW_MANIFEST_TEXTBLOCK_END_in_manifest_textblock11004); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "manifest_textblock"

    // $ANTLR start synpred1_BON
    public final void synpred1_BON_fragment() throws RecognitionException {   
        // BON.g:1582:5: ( constant )
        // BON.g:1582:6: constant
        {
        pushFollow(FOLLOW_constant_in_synpred1_BON10141);
        constant();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_BON

    // Delegated rules

    public final boolean synpred1_BON() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_BON_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA133 dfa133 = new DFA133(this);
    protected DFA174 dfa174 = new DFA174(this);
    static final String DFA1_eotS =
        "\50\uffff";
    static final String DFA1_eofS =
        "\1\3\1\uffff\1\6\4\uffff\2\6\1\uffff\1\6\2\uffff\1\6\2\uffff\3\6"+
        "\1\uffff\1\6\1\uffff\1\6\3\uffff\1\6\1\uffff\1\6\2\uffff\2\6\1\uffff"+
        "\1\6\2\uffff\1\6\1\uffff\1\6";
    static final String DFA1_minS =
        "\1\30\1\uffff\1\5\1\uffff\1\42\2\uffff\1\4\1\5\1\42\1\5\1\14\1\42"+
        "\2\4\1\14\1\5\1\4\1\5\1\14\1\5\1\14\1\5\1\14\1\4\1\14\1\5\1\14\1"+
        "\5\1\4\1\14\2\5\1\14\1\5\2\14\1\5\1\14\1\5";
    static final String DFA1_maxS =
        "\1\134\1\uffff\1\134\1\uffff\1\42\2\uffff\2\134\1\42\1\134\1\15"+
        "\1\42\1\134\1\13\1\15\3\134\1\15\1\134\1\15\1\134\1\15\1\13\1\15"+
        "\1\134\1\15\1\134\1\13\1\15\2\134\1\15\1\134\2\15\1\134\1\15\1\134";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\4\41\uffff";
    static final String DFA1_specialS =
        "\50\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\1\1\1\uffff\1\2\5\uffff\2\1\6\uffff\1\1\4\uffff"+
            "\1\1\1\uffff\1\1\2\uffff\1\1\45\uffff\1\1",
            "",
            "\1\4\22\uffff\1\5\3\uffff\1\5\7\uffff\2\5\6\uffff\1\5\4\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\12\1\11\5\uffff\1\13\14\uffff\1\5\3\uffff\1\5\4\uffff\1"+
            "\10\2\uffff\2\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\1\5\45\uffff\1\5",
            "\1\14\22\uffff\1\5\3\uffff\1\5\7\uffff\2\5\6\uffff\1\5\4\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff\1\5",
            "\1\15",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\16\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\17\1\20",
            "\1\21",
            "\1\22\1\11\5\uffff\1\23\14\uffff\1\5\3\uffff\1\5\4\uffff\1"+
            "\10\2\uffff\2\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\1\5\45\uffff\1\5",
            "\1\24\6\uffff\1\25",
            "\1\17\1\20",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\16\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\26\1\11\5\uffff\1\27\14\uffff\1\5\3\uffff\1\5\4\uffff\1"+
            "\10\2\uffff\2\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\1\5\45\uffff\1\5",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\30\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\31\1\32",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\16\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\33\1\34",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\35\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\36\1\37",
            "\1\40\6\uffff\1\41",
            "\1\31\1\32",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\30\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\33\1\34",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\16\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\42\6\uffff\1\43",
            "\1\36\1\37",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\35\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\30\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\44\1\45",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\35\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\46\1\47",
            "\1\44\1\45",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\30\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5",
            "\1\46\1\47",
            "\1\11\22\uffff\1\5\3\uffff\1\5\4\uffff\1\10\1\uffff\1\35\2"+
            "\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\2\uffff\1\5\45\uffff"+
            "\1\5"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "31:1: prog returns [BonSourceFile bonSource] : (bs= bon_specification EOF | i= indexing bs= bon_specification EOF | e= EOF | indexing e= EOF );";
        }
    }
    static final String DFA78_eotS =
        "\7\uffff";
    static final String DFA78_eofS =
        "\7\uffff";
    static final String DFA78_minS =
        "\1\5\1\46\1\5\2\uffff\1\46\1\5";
    static final String DFA78_maxS =
        "\1\5\1\106\1\5\2\uffff\1\106\1\5";
    static final String DFA78_acceptS =
        "\3\uffff\1\1\1\2\2\uffff";
    static final String DFA78_specialS =
        "\7\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1",
            "\1\3\31\uffff\1\4\5\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\31\uffff\1\4\5\uffff\1\6",
            "\1\5"
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "583:1: static_relation returns [StaticRelation relation] : (ir= inheritance_relation | cr= client_relation );";
        }
    }
    static final String DFA86_eotS =
        "\46\uffff";
    static final String DFA86_eofS =
        "\46\uffff";
    static final String DFA86_minS =
        "\1\5\2\117\2\uffff\1\147\1\42\21\117\1\125\10\117\2\42\1\117\2\uffff";
    static final String DFA86_maxS =
        "\1\120\2\117\2\uffff\1\156\1\170\21\117\1\125\10\117\2\77\1\117"+
        "\2\uffff";
    static final String DFA86_acceptS =
        "\3\uffff\1\3\1\4\37\uffff\1\1\1\2";
    static final String DFA86_specialS =
        "\46\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\3\44\uffff\1\3\26\uffff\1\4\1\3\1\uffff\1\3\11\uffff\1\1"+
            "\1\uffff\1\2",
            "\1\5",
            "\1\6",
            "",
            "",
            "\1\12\1\13\3\uffff\1\7\1\10\1\11",
            "\1\31\36\uffff\1\37\12\uffff\1\33\10\uffff\1\27\20\uffff\1"+
            "\40\1\14\1\15\1\34\1\35\1\36\2\uffff\1\30\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\16\1\17\1\20\1\32",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\3\1\44\33\uffff\1\44",
            "\1\3\1\45\33\uffff\1\45",
            "\1\42",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "648:1: client_entity returns [ClientEntity entity] : ( prefix | infix | supplier_indirection | parent_indirection );";
        }
    }
    static final String DFA133_eotS =
        "\6\uffff";
    static final String DFA133_eofS =
        "\6\uffff";
    static final String DFA133_minS =
        "\1\5\1\42\1\5\2\uffff\1\42";
    static final String DFA133_maxS =
        "\1\5\1\125\1\5\2\uffff\1\125";
    static final String DFA133_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA133_specialS =
        "\6\uffff}>";
    static final String[] DFA133_transitionS = {
            "\1\1",
            "\1\3\1\2\61\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\1\2\61\uffff\1\4"
    };

    static final short[] DFA133_eot = DFA.unpackEncodedString(DFA133_eotS);
    static final short[] DFA133_eof = DFA.unpackEncodedString(DFA133_eofS);
    static final char[] DFA133_min = DFA.unpackEncodedStringToUnsignedChars(DFA133_minS);
    static final char[] DFA133_max = DFA.unpackEncodedStringToUnsignedChars(DFA133_maxS);
    static final short[] DFA133_accept = DFA.unpackEncodedString(DFA133_acceptS);
    static final short[] DFA133_special = DFA.unpackEncodedString(DFA133_specialS);
    static final short[][] DFA133_transition;

    static {
        int numStates = DFA133_transitionS.length;
        DFA133_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA133_transition[i] = DFA.unpackEncodedString(DFA133_transitionS[i]);
        }
    }

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = DFA133_eot;
            this.eof = DFA133_eof;
            this.min = DFA133_min;
            this.max = DFA133_max;
            this.accept = DFA133_accept;
            this.special = DFA133_special;
            this.transition = DFA133_transition;
        }
        public String getDescription() {
            return "1151:1: variable_range returns [VariableRange range] : (mr= member_range | tr= type_range );";
        }
    }
    static final String DFA174_eotS =
        "\20\uffff";
    static final String DFA174_eofS =
        "\20\uffff";
    static final String DFA174_minS =
        "\1\4\3\uffff\2\0\12\uffff";
    static final String DFA174_maxS =
        "\1\156\3\uffff\2\0\12\uffff";
    static final String DFA174_acceptS =
        "\1\uffff\3\1\2\uffff\7\1\1\2\1\3\1\4";
    static final String DFA174_specialS =
        "\1\0\3\uffff\1\1\1\2\12\uffff}>";
    static final String[] DFA174_transitionS = {
            "\1\10\1\17\1\uffff\1\6\1\3\1\7\40\uffff\1\16\23\uffff\1\11\30"+
            "\uffff\1\12\1\13\1\14\1\1\1\2\13\uffff\1\4\1\5\3\uffff\3\15",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA174_eot = DFA.unpackEncodedString(DFA174_eotS);
    static final short[] DFA174_eof = DFA.unpackEncodedString(DFA174_eofS);
    static final char[] DFA174_min = DFA.unpackEncodedStringToUnsignedChars(DFA174_minS);
    static final char[] DFA174_max = DFA.unpackEncodedStringToUnsignedChars(DFA174_maxS);
    static final short[] DFA174_accept = DFA.unpackEncodedString(DFA174_acceptS);
    static final short[] DFA174_special = DFA.unpackEncodedString(DFA174_specialS);
    static final short[][] DFA174_transition;

    static {
        int numStates = DFA174_transitionS.length;
        DFA174_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA174_transition[i] = DFA.unpackEncodedString(DFA174_transitionS[i]);
        }
    }

    class DFA174 extends DFA {

        public DFA174(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 174;
            this.eot = DFA174_eot;
            this.eof = DFA174_eof;
            this.min = DFA174_min;
            this.max = DFA174_max;
            this.accept = DFA174_accept;
            this.special = DFA174_special;
            this.transition = DFA174_transition;
        }
        public String getDescription() {
            return "1581:1: lowest_expression returns [Expression exp] : ( ( constant )=> constant ( ( '.' cc= call_chain ) | ) | unary le= lowest_expression | s= '(' e= expression ')' ( ( '.' cc= call_chain ) | ) | cc= call_chain );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA174_0 = input.LA(1);

                         
                        int index174_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA174_0==90) && (synpred1_BON())) {s = 1;}

                        else if ( (LA174_0==91) && (synpred1_BON())) {s = 2;}

                        else if ( (LA174_0==CHARACTER_CONSTANT) && (synpred1_BON())) {s = 3;}

                        else if ( (LA174_0==103) ) {s = 4;}

                        else if ( (LA174_0==104) ) {s = 5;}

                        else if ( (LA174_0==INTEGER) && (synpred1_BON())) {s = 6;}

                        else if ( (LA174_0==REAL) && (synpred1_BON())) {s = 7;}

                        else if ( (LA174_0==MANIFEST_STRING) && (synpred1_BON())) {s = 8;}

                        else if ( (LA174_0==62) && (synpred1_BON())) {s = 9;}

                        else if ( (LA174_0==87) && (synpred1_BON())) {s = 10;}

                        else if ( (LA174_0==88) && (synpred1_BON())) {s = 11;}

                        else if ( (LA174_0==89) && (synpred1_BON())) {s = 12;}

                        else if ( ((LA174_0>=108 && LA174_0<=110)) ) {s = 13;}

                        else if ( (LA174_0==42) ) {s = 14;}

                        else if ( (LA174_0==IDENTIFIER) ) {s = 15;}

                         
                        input.seek(index174_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA174_4 = input.LA(1);

                         
                        int index174_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_BON()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index174_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA174_5 = input.LA(1);

                         
                        int index174_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_BON()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index174_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 174, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_bon_specification_in_prog70 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexing_in_prog105 = new BitSet(new long[]{0x004A103011000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bon_specification_in_prog109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_prog144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexing_in_prog188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_bon_specification241 = new BitSet(new long[]{0x004A103011000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_informal_chart_in_specification_element272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_dictionary_in_specification_element286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_diagram_in_specification_element300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_diagram_in_specification_element314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_system_chart_in_informal_chart342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cluster_chart_in_informal_chart354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_chart_in_informal_chart366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_chart_in_informal_chart378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scenario_chart_in_informal_chart390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creation_chart_in_informal_chart402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_class_dictionary437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_system_name_in_class_dictionary442 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_indexing_in_class_dictionary448 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_explanation_in_class_dictionary458 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_part_in_class_dictionary469 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_dictionary_entry_in_class_dictionary482 = new BitSet(new long[]{0x00000000E6000000L});
    public static final BitSet FOLLOW_25_in_class_dictionary499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_dictionary_entry525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_dictionary_entry527 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_dictionary_entry532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_list_in_dictionary_entry534 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_description_in_dictionary_entry539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_system_chart570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_system_name_in_system_chart575 = new BitSet(new long[]{0x00000000EA000000L});
    public static final BitSet FOLLOW_indexing_in_system_chart581 = new BitSet(new long[]{0x00000000AA000000L});
    public static final BitSet FOLLOW_explanation_in_system_chart591 = new BitSet(new long[]{0x000000008A000000L});
    public static final BitSet FOLLOW_part_in_system_chart602 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_cluster_entries_in_system_chart617 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_system_chart644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_explanation665 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_explanation669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_explanation682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_indexing707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_index_list_in_indexing709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_indexing725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_part755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_part759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_part777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_description807 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_description811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cluster_entry_in_cluster_entries836 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_cluster_entry875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_entry877 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_description_in_cluster_entry879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_system_name916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_index_clause_in_index_list973 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_33_in_index_list1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_index_clause_in_index_list1016 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_index_clause_in_index_list1059 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_33_in_index_list1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_index_clause1150 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_index_clause1152 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_index_term_list_in_index_clause1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_index_clause1168 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_index_clause1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_index_string_in_index_term_list1212 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_index_term_list1222 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_index_string_in_index_term_list1226 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_index_string1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_cluster_chart1305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_chart1307 = new BitSet(new long[]{0x00000000EE000000L});
    public static final BitSet FOLLOW_indexing_in_cluster_chart1315 = new BitSet(new long[]{0x00000000AE000000L});
    public static final BitSet FOLLOW_explanation_in_cluster_chart1326 = new BitSet(new long[]{0x000000008E000000L});
    public static final BitSet FOLLOW_part_in_cluster_chart1337 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_class_entries_in_cluster_chart1352 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_cluster_entries_in_cluster_chart1376 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cluster_chart1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_entry_in_class_entries1436 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_class_entry1474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_class_entry1476 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_description_in_class_entry1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cluster_name1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_class_chart1545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_class_chart1547 = new BitSet(new long[]{0x000003C0E2000000L});
    public static final BitSet FOLLOW_indexing_in_class_chart1555 = new BitSet(new long[]{0x000003C0A2000000L});
    public static final BitSet FOLLOW_explanation_in_class_chart1566 = new BitSet(new long[]{0x000003C082000000L});
    public static final BitSet FOLLOW_part_in_class_chart1577 = new BitSet(new long[]{0x000003C002000000L});
    public static final BitSet FOLLOW_inherits_in_class_chart1590 = new BitSet(new long[]{0x0000038002000000L});
    public static final BitSet FOLLOW_queries_in_class_chart1609 = new BitSet(new long[]{0x0000030002000000L});
    public static final BitSet FOLLOW_commands_in_class_chart1628 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_constraints_in_class_chart1647 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_class_chart1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_inherits1699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_list_in_inherits1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_inherits1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_queries1738 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_query_list_in_queries1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_commands1770 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_command_list_in_commands1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_constraints1791 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_constraint_list_in_constraints1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_query_list1819 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_query_list1832 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_query_list1836 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_manifest_textblock_in_query_list1868 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_query_list1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_command_list1941 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_command_list1954 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_command_list1958 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_manifest_textblock_in_command_list1984 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_command_list2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_constraint_list2045 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_constraint_list2058 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_constraint_list2062 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_manifest_textblock_in_constraint_list2073 = new BitSet(new long[]{0x0000000800000812L});
    public static final BitSet FOLLOW_35_in_constraint_list2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_name_in_class_name_list2119 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_35_in_class_name_list2133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_class_name_list2137 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_class_name_in_class_name_list2166 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_name_list2235 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_35_in_cluster_name_list2248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_name_list2252 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_name_list2280 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_class_or_bracketed_cluster_name_in_class_or_cluster_name_list2377 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_class_or_cluster_name_list2387 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_class_or_bracketed_cluster_name_in_class_or_cluster_name_list2391 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_class_name_in_class_or_bracketed_cluster_name2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_class_or_bracketed_cluster_name2433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_in_class_or_bracketed_cluster_name2435 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_class_or_bracketed_cluster_name2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_name2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_event_chart2490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_system_name_in_event_chart2492 = new BitSet(new long[]{0x0000E000E2000000L});
    public static final BitSet FOLLOW_45_in_event_chart2500 = new BitSet(new long[]{0x00008000E2000000L});
    public static final BitSet FOLLOW_46_in_event_chart2510 = new BitSet(new long[]{0x00008000E2000000L});
    public static final BitSet FOLLOW_indexing_in_event_chart2522 = new BitSet(new long[]{0x00008000A2000000L});
    public static final BitSet FOLLOW_explanation_in_event_chart2531 = new BitSet(new long[]{0x0000800082000000L});
    public static final BitSet FOLLOW_part_in_event_chart2541 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_event_entries_in_event_chart2554 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_event_chart2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_entry_in_event_entries2618 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_event_entry2661 = new BitSet(new long[]{0x0001000000000810L});
    public static final BitSet FOLLOW_manifest_textblock_in_event_entry2672 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_event_entry2712 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_class_or_cluster_name_list_in_event_entry2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_scenario_chart2802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_system_name_in_scenario_chart2804 = new BitSet(new long[]{0x00040000E2000000L});
    public static final BitSet FOLLOW_indexing_in_scenario_chart2809 = new BitSet(new long[]{0x00040000A2000000L});
    public static final BitSet FOLLOW_explanation_in_scenario_chart2819 = new BitSet(new long[]{0x0004000082000000L});
    public static final BitSet FOLLOW_part_in_scenario_chart2829 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_scenario_entries_in_scenario_chart2840 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_scenario_chart2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scenario_entry_in_scenario_entries2901 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_scenario_entry2942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_scenario_entry2946 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_description_in_scenario_entry2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_creation_chart2979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_system_name_in_creation_chart2981 = new BitSet(new long[]{0x00100000E2000000L});
    public static final BitSet FOLLOW_indexing_in_creation_chart2986 = new BitSet(new long[]{0x00100000A2000000L});
    public static final BitSet FOLLOW_explanation_in_creation_chart2996 = new BitSet(new long[]{0x0010000082000000L});
    public static final BitSet FOLLOW_part_in_creation_chart3006 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_creation_entries_in_creation_chart3017 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_creation_chart3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creation_entry_in_creation_entries3075 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_creation_entry3115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_creation_entry3117 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_creation_entry3122 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_class_or_cluster_name_list_in_creation_entry3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_static_diagram3159 = new BitSet(new long[]{0x00800000000000E0L});
    public static final BitSet FOLLOW_extended_id_in_static_diagram3165 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_COMMENT_in_static_diagram3178 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_static_diagram3188 = new BitSet(new long[]{0x0E0000000E000020L});
    public static final BitSet FOLLOW_static_block_in_static_diagram3195 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_static_diagram3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_extended_id3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_extended_id3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_component_in_static_block3312 = new BitSet(new long[]{0x0E0000000C000022L});
    public static final BitSet FOLLOW_cluster_in_static_component3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clazz_in_static_component3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_relation_in_static_component3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_cluster3405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cluster_name_in_cluster3407 = new BitSet(new long[]{0x0180000000000042L});
    public static final BitSet FOLLOW_56_in_cluster3416 = new BitSet(new long[]{0x0080000000000042L});
    public static final BitSet FOLLOW_COMMENT_in_cluster3429 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_cluster_components_in_cluster3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_cluster_components3502 = new BitSet(new long[]{0x0E0000000E000020L});
    public static final BitSet FOLLOW_static_block_in_cluster_components3504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cluster_components3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_clazz3557 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_58_in_clazz3574 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_59_in_clazz3587 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_clazz3621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_clazz3632 = new BitSet(new long[]{0x3100004040000042L,0x0000000000000184L});
    public static final BitSet FOLLOW_formal_generics_in_clazz3645 = new BitSet(new long[]{0x3100004040000042L,0x0000000000000180L});
    public static final BitSet FOLLOW_56_in_clazz3667 = new BitSet(new long[]{0x3000004040000042L,0x0000000000000180L});
    public static final BitSet FOLLOW_60_in_clazz3680 = new BitSet(new long[]{0x2000004040000042L,0x0000000000000180L});
    public static final BitSet FOLLOW_61_in_clazz3694 = new BitSet(new long[]{0x0000004040000042L,0x0000000000000180L});
    public static final BitSet FOLLOW_COMMENT_in_clazz3706 = new BitSet(new long[]{0x0000004040000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_class_interface_in_clazz3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inheritance_relation_in_static_relation3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_client_relation_in_static_relation3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_child_in_inheritance_relation3806 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_inheritance_relation3808 = new BitSet(new long[]{0x4000000000000020L});
    public static final BitSet FOLLOW_62_in_inheritance_relation3816 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiplicity_in_inheritance_relation3818 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_inheritance_relation3822 = new BitSet(new long[]{0x4000000000000020L});
    public static final BitSet FOLLOW_parent_in_inheritance_relation3839 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_semantic_label_in_inheritance_relation3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_client_in_client_relation3909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_client_relation3911 = new BitSet(new long[]{0x4000000400000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_client_entities_in_client_relation3916 = new BitSet(new long[]{0x4000000400000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_mark_in_client_relation3928 = new BitSet(new long[]{0x4000000400000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_supplier_in_client_relation3954 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_semantic_label_in_client_relation3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_client_entities4005 = new BitSet(new long[]{0x00000400000000A0L,0x0000000000014016L});
    public static final BitSet FOLLOW_client_entity_expression_in_client_entities4009 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_client_entities4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_client_entity_list_in_client_entity_expression4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicity_in_client_entity_expression4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_client_entity_in_client_entity_list4116 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_client_entity_list4125 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014016L});
    public static final BitSet FOLLOW_client_entity_in_client_entity_list4129 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_prefix_in_client_entity4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infix_in_client_entity4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_supplier_indirection_in_client_entity4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parent_indirection_in_client_entity4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indirection_feature_part_in_supplier_indirection4247 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_supplier_indirection4251 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014014L});
    public static final BitSet FOLLOW_generic_indirection_in_supplier_indirection4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_feature_name_in_indirection_feature_part4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indirection_feature_list_in_indirection_feature_part4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_indirection_feature_list4370 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_feature_name_list_in_indirection_feature_list4374 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_indirection_feature_list4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parent_indirection4426 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014014L});
    public static final BitSet FOLLOW_generic_indirection_in_parent_indirection4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indirection_element_in_generic_indirection4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_name_in_named_indirection4527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_named_indirection4529 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014014L});
    public static final BitSet FOLLOW_indirection_list_in_named_indirection4533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_named_indirection4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_named_indirection4552 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014014L});
    public static final BitSet FOLLOW_indirection_list_in_named_indirection4554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_named_indirection4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indirection_element_in_indirection_list4603 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_indirection_list4613 = new BitSet(new long[]{0x0000040000000020L,0x0000000000014014L});
    public static final BitSet FOLLOW_indirection_element_in_indirection_list4617 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_68_in_indirection_element4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_indirection_in_indirection_element4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_name_in_indirection_element4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_type_mark4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_type_mark4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shared_mark_in_type_mark4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_shared_mark4809 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_shared_mark4811 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiplicity_in_shared_mark4815 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_shared_mark4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_ref_in_child4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_ref_in_parent4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_ref_in_client4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_ref_in_supplier4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_component_name_in_static_ref4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cluster_prefix_in_static_ref4989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_static_component_name_in_static_ref4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_prefix5032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_cluster_prefix5041 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_cluster_name_in_cluster_prefix5050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_cluster_prefix5052 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_static_component_name5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_multiplicity5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_semantic_label5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_interface_start_indexing_in_class_interface5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_interface_start_inherit_in_class_interface5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_interface_start_features_in_class_interface5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_interface_start_invariant_in_class_interface5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexing_in_class_interface_start_indexing5242 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_parent_class_list_in_class_interface_start_indexing5254 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_features_in_class_interface_start_indexing5267 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_class_invariant_in_class_interface_start_indexing5281 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_class_interface_start_indexing5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parent_class_list_in_class_interface_start_inherit5318 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_features_in_class_interface_start_inherit5328 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_class_invariant_in_class_interface_start_inherit5342 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_class_interface_start_inherit5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_features_in_class_interface_start_features5377 = new BitSet(new long[]{0x0000004042000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_class_invariant_in_class_interface_start_features5388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_class_interface_start_features5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_invariant_in_class_interface_start_invariant5425 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_class_interface_start_invariant5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_class_invariant5452 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_assertion_in_class_invariant5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parent_class_list5495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_type_in_parent_class_list5499 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parent_class_list5510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_type_in_parent_class_list5514 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parent_class_list5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parent_class_list5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_feature_clause_in_features5586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_feature_clause5627 = new BitSet(new long[]{0x4C00000000000060L,0x0000000000014200L});
    public static final BitSet FOLLOW_selective_export_in_feature_clause5637 = new BitSet(new long[]{0x4C00000000000060L,0x0000000000014200L});
    public static final BitSet FOLLOW_COMMENT_in_feature_clause5659 = new BitSet(new long[]{0x4C00000000000060L,0x0000000000014200L});
    public static final BitSet FOLLOW_feature_specifications_in_feature_clause5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_feature_specification_in_feature_specifications5714 = new BitSet(new long[]{0x4C00000000000062L,0x0000000000014200L});
    public static final BitSet FOLLOW_58_in_feature_specification5769 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_59_in_feature_specification5782 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_73_in_feature_specification5793 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_feature_name_list_in_feature_specification5824 = new BitSet(new long[]{0x4000000400000042L,0x0000000000002C22L});
    public static final BitSet FOLLOW_has_type_in_feature_specification5833 = new BitSet(new long[]{0x4000000000000042L,0x0000000000002C02L});
    public static final BitSet FOLLOW_rename_clause_in_feature_specification5845 = new BitSet(new long[]{0x0000000000000042L,0x0000000000002C02L});
    public static final BitSet FOLLOW_COMMENT_in_feature_specification5857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002C02L});
    public static final BitSet FOLLOW_feature_arguments_in_feature_specification5871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_contract_clause_in_feature_specification5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_mark_in_has_type5961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_has_type5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contracting_conditions_in_contract_clause5988 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_contract_clause5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precondition_in_contracting_conditions6022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_postcondition_in_contracting_conditions6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postcondition_in_contracting_conditions6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_precondition6077 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_assertion_in_precondition6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_postcondition6113 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_assertion_in_postcondition6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_selective_export6138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_list_in_selective_export6142 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_selective_export6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_feature_name_in_feature_name_list6189 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_feature_name_list6199 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_feature_name_in_feature_name_list6203 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_feature_name6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefix_in_feature_name6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infix_in_feature_name6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rename_clause6298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_renaming_in_rename_clause6300 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_rename_clause6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_renaming6338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_name_in_renaming6340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_renaming6342 = new BitSet(new long[]{0x0000000000000020L,0x0000000000014000L});
    public static final BitSet FOLLOW_feature_name_in_renaming6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_feature_argument_in_feature_arguments6379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002002L});
    public static final BitSet FOLLOW_set_in_feature_argument6419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_list_in_feature_argument6443 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_feature_argument6445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_feature_argument6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_feature_argument6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list6541 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_identifier_list6551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list6555 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_78_in_prefix6572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_prefix6574 = new BitSet(new long[]{0x0000000000000000L,0x0000718000000000L});
    public static final BitSet FOLLOW_prefix_operator_in_prefix6576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_prefix6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_infix6597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_infix6599 = new BitSet(new long[]{0x0000000400000000L,0x01FFCFC000201002L});
    public static final BitSet FOLLOW_infix_operator_in_infix6601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_infix6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_prefix_operator6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_in_infix_operator6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_formal_generics6657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_formal_generic_list_in_formal_generics6661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_formal_generics6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_generic_in_formal_generic_list6706 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_formal_generic_list6715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_formal_generic_in_formal_generic_list6719 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_formal_generic_name_in_formal_generic6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_generic_name_in_formal_generic6781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_formal_generic6783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_class_type_in_formal_generic6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_formal_generic_name6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_name_in_class_type6871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_actual_generics_in_class_type6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_actual_generics6950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_type_list_in_actual_generics6952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_actual_generics6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_list7018 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_type_list7046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_type_list7050 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type7105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_actual_generics_in_type7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assertion_clause_in_assertion7206 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_assertion7215 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_assertion_clause_in_assertion7219 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_assertion7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_assertion_clause7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_boolean_expression7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_quantification7327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_range_expression_in_quantification7334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_restriction_in_quantification7342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_proposition_in_quantification7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_quantifier7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_quantifier7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_range_in_range_expression7444 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_range_expression7454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variable_range_in_range_expression7458 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_range_expression7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_restriction7510 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_boolean_expression_in_restriction7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_proposition7548 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_boolean_expression_in_proposition7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_range_in_variable_range7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_range_in_variable_range7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_list_in_member_range7640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_member_range7642 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_expression_in_member_range7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_list_in_type_range7682 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_type_range7684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_type_range7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unqualified_call_in_call_chain7748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_call_chain7757 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_unqualified_call_in_call_chain7761 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_unqualified_call7802 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_actual_arguments_in_unqualified_call7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_actual_arguments7855 = new BitSet(new long[]{0x40000C00000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_expression_list_in_actual_arguments7865 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_actual_arguments7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list7924 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expression_list7934 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_expression_in_expression_list7938 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_62_in_enumerated_set7984 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_enumeration_list_in_enumerated_set7988 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_enumerated_set7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_element_in_enumeration_list8032 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_enumeration_list8042 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_enumeration_element_in_enumeration_list8046 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expression_in_enumeration_element8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_in_enumeration_element8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_interval_in_interval8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_interval_in_interval8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_constant_in_integer_interval8184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_integer_interval8186 = new BitSet(new long[]{0x0000000000000080L,0x0000018000000000L});
    public static final BitSet FOLLOW_integer_constant_in_integer_interval8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_constant_in_character_interval8232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_character_interval8234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_character_constant_in_character_interval8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_constant_in_constant8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_constant8277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_constant8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_constant8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_constant_in_manifest_constant8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_constant_in_manifest_constant8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_constant_in_manifest_constant8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_constant_in_manifest_constant8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_manifest_constant8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerated_set_in_manifest_constant8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_sub_op_in_sign8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_boolean_constant8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_boolean_constant8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_CONSTANT_in_character_constant8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_integer_constant8568 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_integer_constant8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_real_constant8624 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REAL_in_real_constant8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_dynamic_diagram8667 = new BitSet(new long[]{0x00800000000000E0L});
    public static final BitSet FOLLOW_extended_id_in_dynamic_diagram8675 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_COMMENT_in_dynamic_diagram8688 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_dynamic_diagram8697 = new BitSet(new long[]{0x00040000020000A0L,0x00000003C0000000L});
    public static final BitSet FOLLOW_dynamic_block_in_dynamic_diagram8706 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_dynamic_diagram8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_component_in_dynamic_block8773 = new BitSet(new long[]{0x00040000000000A2L,0x00000003C0000000L});
    public static final BitSet FOLLOW_scenario_description_in_dynamic_component8810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_group_in_dynamic_component8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_stack_in_dynamic_component8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_dynamic_component8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_relation_in_dynamic_component8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_scenario_description8859 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_scenario_name_in_scenario_description8861 = new BitSet(new long[]{0x0000000000000040L,0x0000000020000000L});
    public static final BitSet FOLLOW_COMMENT_in_scenario_description8869 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_scenario_description8878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_labelled_actions_in_scenario_description8885 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_scenario_description8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelled_action_in_labelled_actions8940 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_action_label_in_labelled_action8981 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_action_description_in_labelled_action8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_action_label9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_action_description9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manifest_textblock_in_scenario_name9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_object_group9133 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_object_group9158 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_group_name_in_object_group9164 = new BitSet(new long[]{0x0080000000000042L});
    public static final BitSet FOLLOW_COMMENT_in_object_group9176 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_group_components_in_object_group9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_group_components9242 = new BitSet(new long[]{0x00040000000000A0L,0x00000003C0000000L});
    public static final BitSet FOLLOW_dynamic_block_in_group_components9244 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_group_components9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_object_stack9291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_object_name_in_object_stack9298 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMENT_in_object_stack9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_object9358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_object_name_in_object9365 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMENT_in_object9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caller_in_message_relation9401 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_message_relation9403 = new BitSet(new long[]{0x00040000000000A0L,0x00000003C0000000L});
    public static final BitSet FOLLOW_receiver_in_message_relation9405 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_message_label_in_message_relation9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_ref_in_caller9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_ref_in_receiver9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extended_id_in_dynamic_ref9486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_dynamic_ref9489 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_extended_id_in_dynamic_ref9491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dynamic_component_name9522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_dynamic_component_name9525 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_extended_id_in_dynamic_component_name9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_dynamic_component_name9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_name_in_object_name9559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_object_name9569 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_extended_id_in_object_name9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extended_id_in_group_name9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_message_label9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_string_marks_in_notational_tuning9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_concatenator_in_notational_tuning9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_prefix_in_notational_tuning9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_change_string_marks9696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_change_string_marks9698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_change_string_marks9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_change_concatenator9734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_change_concatenator9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_change_prefix9770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_change_prefix9772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equivalence_expression_in_expression9798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantification_in_expression9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_expression_in_equivalence_expression9834 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_equivalence_expression9844 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_implies_expression_in_equivalence_expression9848 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_and_or_xor_expression_in_implies_expression9876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_implies_expression9886 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_implies_expression_in_implies_expression9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_expression_in_and_or_xor_expression9917 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L});
    public static final BitSet FOLLOW_and_or_xor_op_in_and_or_xor_expression9930 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_comparison_expression_in_and_or_xor_expression9934 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L});
    public static final BitSet FOLLOW_add_sub_expression_in_comparison_expression9962 = new BitSet(new long[]{0x0000000400000002L,0x001FC00000200000L});
    public static final BitSet FOLLOW_comparison_op_in_comparison_expression9974 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_add_sub_expression_in_comparison_expression9979 = new BitSet(new long[]{0x0000000400000002L,0x001FC00000200000L});
    public static final BitSet FOLLOW_mul_div_expression_in_add_sub_expression10007 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_add_sub_op_in_add_sub_expression10019 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_mul_div_expression_in_add_sub_expression10023 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_mod_pow_expression_in_mul_div_expression10051 = new BitSet(new long[]{0x0000000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_mul_div_op_in_mul_div_expression10063 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_mod_pow_expression_in_mul_div_expression10067 = new BitSet(new long[]{0x0000000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_lowest_expression_in_mod_pow_expression10096 = new BitSet(new long[]{0x0000000000000002L,0x0100000000001000L});
    public static final BitSet FOLLOW_mod_pow_op_in_mod_pow_expression10108 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_mod_pow_expression_in_mod_pow_expression10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_lowest_expression10145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_lowest_expression10154 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_call_chain_in_lowest_expression10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_lowest_expression10208 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_lowest_expression_in_lowest_expression10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_lowest_expression10225 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F860000L});
    public static final BitSet FOLLOW_expression_in_lowest_expression10229 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_lowest_expression10231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_lowest_expression10241 = new BitSet(new long[]{0x40000400000003B0L,0x000071800F800000L});
    public static final BitSet FOLLOW_call_chain_in_lowest_expression10245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_chain_in_lowest_expression10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_add_sub_op10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_add_sub_op10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_add_sub_op_unary10331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_add_sub_op_unary10339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_and_or_xor_op10357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_and_or_xor_op10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_and_or_xor_op10372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_unary_in_unary10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_sub_op_unary_in_unary10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_other_unary10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_other_unary10434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_other_unary10443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_sub_op_in_binary10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_div_op_in_binary10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_op_in_binary10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mod_pow_op_in_binary10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_or_xor_op_in_binary10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_binary10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_binary10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_comparison_op10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_comparison_op10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_comparison_op10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_comparison_op10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_comparison_op10566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_comparison_op10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_comparison_op10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_comparison_op10588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_comparison_op10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_comparison_op10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_mul_div_op10624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_mul_div_op10632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_mul_div_op10640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_mod_pow_op10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_mod_pow_op10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_STRING_in_manifest_textblock10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANIFEST_TEXTBLOCK_START_in_manifest_textblock10999 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_MANIFEST_TEXTBLOCK_MIDDLE_in_manifest_textblock11001 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_MANIFEST_TEXTBLOCK_END_in_manifest_textblock11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_synpred1_BON10141 = new BitSet(new long[]{0x0000000000000002L});

}