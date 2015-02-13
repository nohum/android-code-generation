package at.fhj.gaar.androidapp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'\"'", "'.'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'spacer'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalAppDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g"; }



     	private AppDslGrammarAccess grammarAccess;
     	
        public InternalAppDslParser(TokenStream input, AppDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AndroidAppProject";	
       	}
       	
       	@Override
       	protected AppDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:67:1: entryRuleAndroidAppProject returns [EObject current=null] : iv_ruleAndroidAppProject= ruleAndroidAppProject EOF ;
    public final EObject entryRuleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidAppProject = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:68:2: (iv_ruleAndroidAppProject= ruleAndroidAppProject EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:69:2: iv_ruleAndroidAppProject= ruleAndroidAppProject EOF
            {
             newCompositeNode(grammarAccess.getAndroidAppProjectRule()); 
            pushFollow(FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject75);
            iv_ruleAndroidAppProject=ruleAndroidAppProject();

            state._fsp--;

             current =iv_ruleAndroidAppProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidAppProject85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroidAppProject"


    // $ANTLR start "ruleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:76:1: ruleAndroidAppProject returns [EObject current=null] : ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* ) ;
    public final EObject ruleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_applications_0_0 = null;

        EObject lv_applications_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:79:28: ( ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:80:1: ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:80:1: ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:80:2: ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )*
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:80:2: ( (lv_applications_0_0= ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:81:1: (lv_applications_0_0= ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:81:1: (lv_applications_0_0= ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:82:3: lv_applications_0_0= ruleApplication
            {
             
            	        newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleAndroidAppProject131);
            lv_applications_0_0=ruleApplication();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
            	        }
                   		add(
                   			current, 
                   			"applications",
                    		lv_applications_0_0, 
                    		"Application");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:98:2: (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:98:4: otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAndroidAppProject144); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:102:1: ( (lv_applications_2_0= ruleApplication ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:103:1: (lv_applications_2_0= ruleApplication )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:103:1: (lv_applications_2_0= ruleApplication )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:104:3: lv_applications_2_0= ruleApplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplication_in_ruleAndroidAppProject165);
            	    lv_applications_2_0=ruleApplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"applications",
            	            		lv_applications_2_0, 
            	            		"Application");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroidAppProject"


    // $ANTLR start "entryRuleApplication"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:128:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:129:2: (iv_ruleApplication= ruleApplication EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:130:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication203);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:137:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:140:28: ( (otherlv_0= 'application' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:3: otherlv_0= 'application' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleApplication250); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:145:1: ( (lv_name_1_0= rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_name_1_0= rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_name_1_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:147:3: lv_name_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_ruleApplication271);
            lv_name_1_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleApplication283); 

                	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:167:1: ( (lv_attributes_3_0= ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:168:1: (lv_attributes_3_0= ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:168:1: (lv_attributes_3_0= ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:169:3: lv_attributes_3_0= ruleApplicationAttribute
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleApplication304);
            lv_attributes_3_0=ruleApplicationAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"ApplicationAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:185:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:185:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleApplication317); 

            	        	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:189:1: ( (lv_attributes_5_0= ruleApplicationAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:190:1: (lv_attributes_5_0= ruleApplicationAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:190:1: (lv_attributes_5_0= ruleApplicationAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:191:3: lv_attributes_5_0= ruleApplicationAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleApplication338);
            	    lv_attributes_5_0=ruleApplicationAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"ApplicationAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleApplication352); 

                	newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRulePackageName"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:219:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:220:2: (iv_rulePackageName= rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:221:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName388);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:228:1: rulePackageName returns [EObject current=null] : (otherlv_0= '\"' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* ) otherlv_4= '\"' ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:231:28: ( (otherlv_0= '\"' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* ) otherlv_4= '\"' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:1: (otherlv_0= '\"' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* ) otherlv_4= '\"' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:1: (otherlv_0= '\"' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* ) otherlv_4= '\"' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:3: otherlv_0= '\"' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* ) otherlv_4= '\"'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackageName435); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:236:1: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )* )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:236:2: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' this_ID_3= RULE_ID )*
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:236:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:237:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:237:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName453); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:254:2: (otherlv_2= '.' this_ID_3= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:254:4: otherlv_2= '.' this_ID_3= RULE_ID
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePackageName471); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_1_0());
            	        
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName482); 
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePackageName496); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:274:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:275:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:276:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute532);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:283:1: ruleApplicationAttribute returns [EObject current=null] : (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementLabelAttribute_0 = null;

        EObject this_ApplicationMinSdk_1 = null;

        EObject this_ApplicationTargetSdk_2 = null;

        EObject this_ApplicationCompileSdk_3 = null;

        EObject this_ApplicationPermissionList_4 = null;

        EObject this_ApplicationElementList_5 = null;

        EObject this_ApplicationMainActivity_6 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:286:28: ( (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:287:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:287:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:288:5: this_ElementLabelAttribute_0= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute589);
                    this_ElementLabelAttribute_0=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:298:5: this_ApplicationMinSdk_1= ruleApplicationMinSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute616);
                    this_ApplicationMinSdk_1=ruleApplicationMinSdk();

                    state._fsp--;

                     
                            current = this_ApplicationMinSdk_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:308:5: this_ApplicationTargetSdk_2= ruleApplicationTargetSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute643);
                    this_ApplicationTargetSdk_2=ruleApplicationTargetSdk();

                    state._fsp--;

                     
                            current = this_ApplicationTargetSdk_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:318:5: this_ApplicationCompileSdk_3= ruleApplicationCompileSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute670);
                    this_ApplicationCompileSdk_3=ruleApplicationCompileSdk();

                    state._fsp--;

                     
                            current = this_ApplicationCompileSdk_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:328:5: this_ApplicationPermissionList_4= ruleApplicationPermissionList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute697);
                    this_ApplicationPermissionList_4=ruleApplicationPermissionList();

                    state._fsp--;

                     
                            current = this_ApplicationPermissionList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:338:5: this_ApplicationElementList_5= ruleApplicationElementList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute724);
                    this_ApplicationElementList_5=ruleApplicationElementList();

                    state._fsp--;

                     
                            current = this_ApplicationElementList_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:348:5: this_ApplicationMainActivity_6= ruleApplicationMainActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute751);
                    this_ApplicationMainActivity_6=ruleApplicationMainActivity();

                    state._fsp--;

                     
                            current = this_ApplicationMainActivity_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:364:1: entryRuleApplicationMinSdk returns [EObject current=null] : iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF ;
    public final EObject entryRuleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMinSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:365:2: (iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:366:2: iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk786);
            iv_ruleApplicationMinSdk=ruleApplicationMinSdk();

            state._fsp--;

             current =iv_ruleApplicationMinSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk796); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationMinSdk"


    // $ANTLR start "ruleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:373:1: ruleApplicationMinSdk returns [EObject current=null] : (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:376:28: ( (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:377:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:377:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:377:3: otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleApplicationMinSdk833); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:381:1: ( (lv_minSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:382:1: (lv_minSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:382:1: (lv_minSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:383:3: lv_minSdk_1_0= RULE_INT
            {
            lv_minSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationMinSdk850); 

            			newLeafNode(lv_minSdk_1_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationMinSdkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minSdk",
                    		lv_minSdk_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationMinSdk"


    // $ANTLR start "entryRuleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:407:1: entryRuleApplicationTargetSdk returns [EObject current=null] : iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF ;
    public final EObject entryRuleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationTargetSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:408:2: (iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:409:2: iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk891);
            iv_ruleApplicationTargetSdk=ruleApplicationTargetSdk();

            state._fsp--;

             current =iv_ruleApplicationTargetSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationTargetSdk"


    // $ANTLR start "ruleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:416:1: ruleApplicationTargetSdk returns [EObject current=null] : (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:419:28: ( (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:420:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:420:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:420:3: otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleApplicationTargetSdk938); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:424:1: ( (lv_targetSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:425:1: (lv_targetSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:425:1: (lv_targetSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:426:3: lv_targetSdk_1_0= RULE_INT
            {
            lv_targetSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationTargetSdk955); 

            			newLeafNode(lv_targetSdk_1_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationTargetSdkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetSdk",
                    		lv_targetSdk_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationTargetSdk"


    // $ANTLR start "entryRuleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:450:1: entryRuleApplicationCompileSdk returns [EObject current=null] : iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF ;
    public final EObject entryRuleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationCompileSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:451:2: (iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:452:2: iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk996);
            iv_ruleApplicationCompileSdk=ruleApplicationCompileSdk();

            state._fsp--;

             current =iv_ruleApplicationCompileSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk1006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationCompileSdk"


    // $ANTLR start "ruleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:459:1: ruleApplicationCompileSdk returns [EObject current=null] : (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compileSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:462:28: ( (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:463:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:463:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:463:3: otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleApplicationCompileSdk1043); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:467:1: ( (lv_compileSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:468:1: (lv_compileSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:468:1: (lv_compileSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:469:3: lv_compileSdk_1_0= RULE_INT
            {
            lv_compileSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1060); 

            			newLeafNode(lv_compileSdk_1_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationCompileSdkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"compileSdk",
                    		lv_compileSdk_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationCompileSdk"


    // $ANTLR start "entryRuleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:493:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:494:2: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:495:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
            {
             newCompositeNode(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1101);
            iv_ruleApplicationPermissionList=ruleApplicationPermissionList();

            state._fsp--;

             current =iv_ruleApplicationPermissionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList1111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationPermissionList"


    // $ANTLR start "ruleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:502:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_permissions_2_0 = null;

        EObject lv_permissions_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:505:28: ( (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:506:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:506:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:506:3: otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleApplicationPermissionList1148); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleApplicationPermissionList1160); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:514:1: ( (lv_permissions_2_0= rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:515:1: (lv_permissions_2_0= rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:515:1: (lv_permissions_2_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:516:3: lv_permissions_2_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_ruleApplicationPermissionList1181);
            lv_permissions_2_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	        }
                   		add(
                   			current, 
                   			"permissions",
                    		lv_permissions_2_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:532:2: (otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:532:4: otherlv_3= ',' ( (lv_permissions_4_0= rulePackageName ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleApplicationPermissionList1194); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:536:1: ( (lv_permissions_4_0= rulePackageName ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:537:1: (lv_permissions_4_0= rulePackageName )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:537:1: (lv_permissions_4_0= rulePackageName )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:538:3: lv_permissions_4_0= rulePackageName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageName_in_ruleApplicationPermissionList1215);
            	    lv_permissions_4_0=rulePackageName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"permissions",
            	            		lv_permissions_4_0, 
            	            		"PackageName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleApplicationPermissionList1229); 

                	newLeafNode(otherlv_5, grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationPermissionList"


    // $ANTLR start "entryRuleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:566:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:567:2: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:568:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1265);
            iv_ruleApplicationElementList=ruleApplicationElementList();

            state._fsp--;

             current =iv_ruleApplicationElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList1275); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationElementList"


    // $ANTLR start "ruleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:575:1: ruleApplicationElementList returns [EObject current=null] : (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:578:28: ( (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:579:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:579:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:579:3: otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleApplicationElementList1312); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationElementListAccess().getElementsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleApplicationElementList1324); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:587:1: ( (lv_elements_2_0= ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:588:1: (lv_elements_2_0= ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:588:1: (lv_elements_2_0= ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:589:3: lv_elements_2_0= ruleApplicationElement
            {
             
            	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1345);
            lv_elements_2_0=ruleApplicationElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"ApplicationElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:605:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:605:4: otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleApplicationElementList1358); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:609:1: ( (lv_elements_4_0= ruleApplicationElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:610:1: (lv_elements_4_0= ruleApplicationElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:610:1: (lv_elements_4_0= ruleApplicationElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:611:3: lv_elements_4_0= ruleApplicationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1379);
            	    lv_elements_4_0=ruleApplicationElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"ApplicationElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleApplicationElementList1393); 

                	newLeafNode(otherlv_5, grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationElementList"


    // $ANTLR start "entryRuleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:639:1: entryRuleApplicationMainActivity returns [EObject current=null] : iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF ;
    public final EObject entryRuleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMainActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:640:2: (iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:641:2: iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF
            {
             newCompositeNode(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1429);
            iv_ruleApplicationMainActivity=ruleApplicationMainActivity();

            state._fsp--;

             current =iv_ruleApplicationMainActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity1439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationMainActivity"


    // $ANTLR start "ruleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:648:1: ruleApplicationMainActivity returns [EObject current=null] : (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:651:28: ( (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:1: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:1: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:3: otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleApplicationMainActivity1476); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:656:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:657:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:657:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:658:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationMainActivityRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationMainActivity1496); 

            		newLeafNode(otherlv_1, grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:677:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:678:2: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:679:2: iv_ruleApplicationElement= ruleApplicationElement EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1532);
            iv_ruleApplicationElement=ruleApplicationElement();

            state._fsp--;

             current =iv_ruleApplicationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement1542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationElement"


    // $ANTLR start "ruleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:686:1: ruleApplicationElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_BroadcastReceiver_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:689:28: ( (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:690:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:690:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:691:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleApplicationElement1589);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:701:5: this_BroadcastReceiver_1= ruleBroadcastReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1616);
                    this_BroadcastReceiver_1=ruleBroadcastReceiver();

                    state._fsp--;

                     
                            current = this_BroadcastReceiver_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:711:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleApplicationElement1643);
                    this_Service_2=ruleService();

                    state._fsp--;

                     
                            current = this_Service_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationElement"


    // $ANTLR start "entryRuleActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:727:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:728:2: (iv_ruleActivity= ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:729:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1678);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:736:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:739:28: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:740:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:740:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:740:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleActivity1725); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:744:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:745:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:745:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:746:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1742); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActivity1759); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:766:1: ( (lv_attributes_3_0= ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:767:1: (lv_attributes_3_0= ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:767:1: (lv_attributes_3_0= ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:768:3: lv_attributes_3_0= ruleActivityAttribute
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity1780);
            lv_attributes_3_0=ruleActivityAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"ActivityAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:784:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:784:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleActivity1793); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:788:1: ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:789:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:789:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:790:3: lv_attributes_5_0= ruleActivityAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity1814);
            	    lv_attributes_5_0=ruleActivityAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"ActivityAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleActivity1828); 

                	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:818:1: entryRuleBroadcastReceiver returns [EObject current=null] : iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF ;
    public final EObject entryRuleBroadcastReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiver = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:819:2: (iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:820:2: iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1864);
            iv_ruleBroadcastReceiver=ruleBroadcastReceiver();

            state._fsp--;

             current =iv_ruleBroadcastReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver1874); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastReceiver"


    // $ANTLR start "ruleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:827:1: ruleBroadcastReceiver returns [EObject current=null] : (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBroadcastReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:830:28: ( (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:831:1: (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:831:1: (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:831:3: otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBroadcastReceiver1911); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:835:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:836:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:836:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:837:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBroadcastReceiver1928); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBroadcastReceiverAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBroadcastReceiverRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBroadcastReceiver1945); 

                	newLeafNode(otherlv_2, grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:857:1: ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:858:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:858:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:859:3: lv_attributes_3_0= ruleBroadcastReceiverAttribute
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1966);
            lv_attributes_3_0=ruleBroadcastReceiverAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"BroadcastReceiverAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:875:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:875:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleBroadcastReceiver1979); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:879:1: ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:880:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:880:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:881:3: lv_attributes_5_0= ruleBroadcastReceiverAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2000);
            	    lv_attributes_5_0=ruleBroadcastReceiverAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"BroadcastReceiverAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBroadcastReceiver2014); 

                	newLeafNode(otherlv_6, grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastReceiver"


    // $ANTLR start "entryRuleService"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:909:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:910:2: (iv_ruleService= ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:911:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2050);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2060); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:918:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:921:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:922:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:922:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:922:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleService2097); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:926:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:927:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:927:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:928:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2114); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleService2131); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:948:1: ( (lv_attributes_3_0= ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:949:1: (lv_attributes_3_0= ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:949:1: (lv_attributes_3_0= ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:950:3: lv_attributes_3_0= ruleServiceAttribute
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2152);
            lv_attributes_3_0=ruleServiceAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"ServiceAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:966:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:966:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleService2165); 

            	        	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:970:1: ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:971:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:971:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:972:3: lv_attributes_5_0= ruleServiceAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2186);
            	    lv_attributes_5_0=ruleServiceAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"ServiceAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleService2200); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1000:1: entryRuleActivityAttribute returns [EObject current=null] : iv_ruleActivityAttribute= ruleActivityAttribute EOF ;
    public final EObject entryRuleActivityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1001:2: (iv_ruleActivityAttribute= ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1002:2: iv_ruleActivityAttribute= ruleActivityAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2236);
            iv_ruleActivityAttribute=ruleActivityAttribute();

            state._fsp--;

             current =iv_ruleActivityAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute2246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityAttribute"


    // $ANTLR start "ruleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1009:1: ruleActivityAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) ;
    public final EObject ruleActivityAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;

        EObject this_ActivityParentAttribute_4 = null;

        EObject this_ActivityLayoutAttribute_5 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1012:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1013:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1013:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1014:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2293);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1024:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2320);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1034:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2347);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1044:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2374);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1054:5: this_ActivityParentAttribute_4= ruleActivityParentAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2401);
                    this_ActivityParentAttribute_4=ruleActivityParentAttribute();

                    state._fsp--;

                     
                            current = this_ActivityParentAttribute_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1064:5: this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2428);
                    this_ActivityLayoutAttribute_5=ruleActivityLayoutAttribute();

                    state._fsp--;

                     
                            current = this_ActivityLayoutAttribute_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1080:1: entryRuleBroadcastReceiverAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1081:2: (iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1082:2: iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2463);
            iv_ruleBroadcastReceiverAttribute=ruleBroadcastReceiverAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastReceiverAttribute"


    // $ANTLR start "ruleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1089:1: ruleBroadcastReceiverAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) ;
    public final EObject ruleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;

        EObject this_BroadcastReceiverActionAttribute_4 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1092:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1093:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1093:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 36:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1094:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2520);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1104:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2547);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1114:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2574);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1124:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2601);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1134:5: this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2628);
                    this_BroadcastReceiverActionAttribute_4=ruleBroadcastReceiverActionAttribute();

                    state._fsp--;

                     
                            current = this_BroadcastReceiverActionAttribute_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastReceiverAttribute"


    // $ANTLR start "entryRuleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1150:1: entryRuleServiceAttribute returns [EObject current=null] : iv_ruleServiceAttribute= ruleServiceAttribute EOF ;
    public final EObject entryRuleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1151:2: (iv_ruleServiceAttribute= ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1152:2: iv_ruleServiceAttribute= ruleServiceAttribute EOF
            {
             newCompositeNode(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2663);
            iv_ruleServiceAttribute=ruleServiceAttribute();

            state._fsp--;

             current =iv_ruleServiceAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute2673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceAttribute"


    // $ANTLR start "ruleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1159:1: ruleServiceAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) ;
    public final EObject ruleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1162:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1163:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1163:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1164:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2720);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1174:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute2747);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1184:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute2774);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1194:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleServiceAttribute2801);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceAttribute"


    // $ANTLR start "entryRuleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1210:1: entryRuleElementEnabledAttribute returns [EObject current=null] : iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF ;
    public final EObject entryRuleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementEnabledAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1211:2: (iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1212:2: iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute2836);
            iv_ruleElementEnabledAttribute=ruleElementEnabledAttribute();

            state._fsp--;

             current =iv_ruleElementEnabledAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute2846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementEnabledAttribute"


    // $ANTLR start "ruleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1219:1: ruleElementEnabledAttribute returns [EObject current=null] : (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_enabled_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1222:28: ( (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1223:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1223:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1223:3: otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleElementEnabledAttribute2883); 

                	newLeafNode(otherlv_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1227:1: ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1228:1: (lv_enabled_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1228:1: (lv_enabled_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1229:3: lv_enabled_1_0= RULE_BOOLEAN
            {
            lv_enabled_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute2900); 

            			newLeafNode(lv_enabled_1_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementEnabledAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enabled",
                    		lv_enabled_1_0, 
                    		"BOOLEAN");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementEnabledAttribute"


    // $ANTLR start "entryRuleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1253:1: entryRuleElementExportedAttribute returns [EObject current=null] : iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF ;
    public final EObject entryRuleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementExportedAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1254:2: (iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1255:2: iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute2941);
            iv_ruleElementExportedAttribute=ruleElementExportedAttribute();

            state._fsp--;

             current =iv_ruleElementExportedAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute2951); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementExportedAttribute"


    // $ANTLR start "ruleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1262:1: ruleElementExportedAttribute returns [EObject current=null] : (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exported_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1265:28: ( (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1266:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1266:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1266:3: otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleElementExportedAttribute2988); 

                	newLeafNode(otherlv_0, grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1270:1: ( (lv_exported_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1271:1: (lv_exported_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1271:1: (lv_exported_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1272:3: lv_exported_1_0= RULE_BOOLEAN
            {
            lv_exported_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute3005); 

            			newLeafNode(lv_exported_1_0, grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementExportedAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"exported",
                    		lv_exported_1_0, 
                    		"BOOLEAN");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementExportedAttribute"


    // $ANTLR start "entryRuleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1296:1: entryRuleElementLabelAttribute returns [EObject current=null] : iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF ;
    public final EObject entryRuleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1297:2: (iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1298:2: iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute3046);
            iv_ruleElementLabelAttribute=ruleElementLabelAttribute();

            state._fsp--;

             current =iv_ruleElementLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute3056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementLabelAttribute"


    // $ANTLR start "ruleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1305:1: ruleElementLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1308:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1309:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1309:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1309:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleElementLabelAttribute3093); 

                	newLeafNode(otherlv_0, grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1313:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1314:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1314:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1315:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3110); 

            			newLeafNode(lv_title_1_0, grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementLabelAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementLabelAttribute"


    // $ANTLR start "entryRuleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1339:1: entryRuleElementIntentList returns [EObject current=null] : iv_ruleElementIntentList= ruleElementIntentList EOF ;
    public final EObject entryRuleElementIntentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementIntentList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1340:2: (iv_ruleElementIntentList= ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1341:2: iv_ruleElementIntentList= ruleElementIntentList EOF
            {
             newCompositeNode(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3151);
            iv_ruleElementIntentList=ruleElementIntentList();

            state._fsp--;

             current =iv_ruleElementIntentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList3161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementIntentList"


    // $ANTLR start "ruleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1348:1: ruleElementIntentList returns [EObject current=null] : (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleElementIntentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_intents_2_0 = null;

        EObject lv_intents_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1351:28: ( (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1352:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1352:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1352:3: otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= rulePackageName ) ) (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleElementIntentList3198); 

                	newLeafNode(otherlv_0, grammarAccess.getElementIntentListAccess().getIntentsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleElementIntentList3210); 

                	newLeafNode(otherlv_1, grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1360:1: ( (lv_intents_2_0= rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1361:1: (lv_intents_2_0= rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1361:1: (lv_intents_2_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1362:3: lv_intents_2_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_ruleElementIntentList3231);
            lv_intents_2_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementIntentListRule());
            	        }
                   		add(
                   			current, 
                   			"intents",
                    		lv_intents_2_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1378:2: (otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1378:4: otherlv_3= ',' ( (lv_intents_4_0= rulePackageName ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleElementIntentList3244); 

            	        	newLeafNode(otherlv_3, grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1382:1: ( (lv_intents_4_0= rulePackageName ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1383:1: (lv_intents_4_0= rulePackageName )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1383:1: (lv_intents_4_0= rulePackageName )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1384:3: lv_intents_4_0= rulePackageName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageName_in_ruleElementIntentList3265);
            	    lv_intents_4_0=rulePackageName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElementIntentListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intents",
            	            		lv_intents_4_0, 
            	            		"PackageName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleElementIntentList3279); 

                	newLeafNode(otherlv_5, grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementIntentList"


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1412:1: entryRuleActivityParentAttribute returns [EObject current=null] : iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF ;
    public final EObject entryRuleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityParentAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1413:2: (iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1414:2: iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3315);
            iv_ruleActivityParentAttribute=ruleActivityParentAttribute();

            state._fsp--;

             current =iv_ruleActivityParentAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute3325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityParentAttribute"


    // $ANTLR start "ruleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1421:1: ruleActivityParentAttribute returns [EObject current=null] : (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1424:28: ( (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1425:1: (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1425:1: (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1425:3: otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleActivityParentAttribute3362); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1429:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1430:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1430:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityParentAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityParentAttribute3382); 

            		newLeafNode(otherlv_1, grammarAccess.getActivityParentAttributeAccess().getParentActivityCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityParentAttribute"


    // $ANTLR start "entryRuleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1450:1: entryRuleActivityLayoutAttribute returns [EObject current=null] : iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF ;
    public final EObject entryRuleActivityLayoutAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1451:2: (iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1452:2: iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3418);
            iv_ruleActivityLayoutAttribute=ruleActivityLayoutAttribute();

            state._fsp--;

             current =iv_ruleActivityLayoutAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityLayoutAttribute"


    // $ANTLR start "ruleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1459:1: ruleActivityLayoutAttribute returns [EObject current=null] : (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleActivityLayoutAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_layoutElements_2_0 = null;

        EObject lv_layoutElements_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1462:28: ( (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1463:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1463:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1463:3: otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleActivityLayoutAttribute3465); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleActivityLayoutAttribute3477); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1471:1: ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1472:1: (lv_layoutElements_2_0= ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1472:1: (lv_layoutElements_2_0= ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1473:3: lv_layoutElements_2_0= ruleLayoutElement
            {
             
            	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3498);
            lv_layoutElements_2_0=ruleLayoutElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityLayoutAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"layoutElements",
                    		lv_layoutElements_2_0, 
                    		"LayoutElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1489:2: (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1489:4: otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleActivityLayoutAttribute3511); 

            	        	newLeafNode(otherlv_3, grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1493:1: ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1494:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1494:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1495:3: lv_layoutElements_4_0= ruleLayoutElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3532);
            	    lv_layoutElements_4_0=ruleLayoutElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityLayoutAttributeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"layoutElements",
            	            		lv_layoutElements_4_0, 
            	            		"LayoutElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleActivityLayoutAttribute3546); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityLayoutAttribute"


    // $ANTLR start "entryRuleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1523:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1524:2: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1525:2: iv_ruleLayoutElement= ruleLayoutElement EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3582);
            iv_ruleLayoutElement=ruleLayoutElement();

            state._fsp--;

             current =iv_ruleLayoutElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement3592); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1532:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Text_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1535:28: ( (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1537:5: this_Button_0= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleLayoutElement3639);
                    this_Button_0=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1547:5: ruleSpacer
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSpacer_in_ruleLayoutElement3660);
                    ruleSpacer();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1556:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleLayoutElement3687);
                    this_Text_2=ruleText();

                    state._fsp--;

                     
                            current = this_Text_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleButton"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1572:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1573:2: (iv_ruleButton= ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1574:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3722);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3732); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1581:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1584:28: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1585:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1585:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1585:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleButton3769); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1589:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1590:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1590:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton3786); 

            			newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleButton3803); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1611:1: ( (lv_attributes_3_0= ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1612:1: (lv_attributes_3_0= ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1612:1: (lv_attributes_3_0= ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1613:3: lv_attributes_3_0= ruleButtonAttribute
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton3824);
            lv_attributes_3_0=ruleButtonAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"ButtonAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1629:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1629:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleButton3837); 

            	        	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1633:1: ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1634:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1634:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1635:3: lv_attributes_5_0= ruleButtonAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton3858);
            	    lv_attributes_5_0=ruleButtonAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"ButtonAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleButton3872); 

                	newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1663:1: entryRuleButtonAttribute returns [EObject current=null] : iv_ruleButtonAttribute= ruleButtonAttribute EOF ;
    public final EObject entryRuleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1664:2: (iv_ruleButtonAttribute= ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1665:2: iv_ruleButtonAttribute= ruleButtonAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute3908);
            iv_ruleButtonAttribute=ruleButtonAttribute();

            state._fsp--;

             current =iv_ruleButtonAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute3918); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonAttribute"


    // $ANTLR start "ruleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1672:1: ruleButtonAttribute returns [EObject current=null] : (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) ;
    public final EObject ruleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonLabelAttribute_0 = null;

        EObject this_ButtonActionAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1675:28: ( (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1676:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1676:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1677:5: this_ButtonLabelAttribute_0= ruleButtonLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute3965);
                    this_ButtonLabelAttribute_0=ruleButtonLabelAttribute();

                    state._fsp--;

                     
                            current = this_ButtonLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1687:5: this_ButtonActionAttribute_1= ruleButtonActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute3992);
                    this_ButtonActionAttribute_1=ruleButtonActionAttribute();

                    state._fsp--;

                     
                            current = this_ButtonActionAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonAttribute"


    // $ANTLR start "entryRuleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1703:1: entryRuleButtonLabelAttribute returns [EObject current=null] : iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF ;
    public final EObject entryRuleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1704:2: (iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1705:2: iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4027);
            iv_ruleButtonLabelAttribute=ruleButtonLabelAttribute();

            state._fsp--;

             current =iv_ruleButtonLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute4037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonLabelAttribute"


    // $ANTLR start "ruleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1712:1: ruleButtonLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1715:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1716:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1716:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1716:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleButtonLabelAttribute4074); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1720:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1721:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1721:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1722:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4091); 

            			newLeafNode(lv_title_1_0, grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonLabelAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonLabelAttribute"


    // $ANTLR start "entryRuleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1746:1: entryRuleButtonActionAttribute returns [EObject current=null] : iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF ;
    public final EObject entryRuleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1747:2: (iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1748:2: iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4132);
            iv_ruleButtonActionAttribute=ruleButtonActionAttribute();

            state._fsp--;

             current =iv_ruleButtonActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute4142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonActionAttribute"


    // $ANTLR start "ruleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1755:1: ruleButtonActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) ;
    public final EObject ruleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1758:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1759:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1759:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1759:3: otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleButtonActionAttribute4179); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1763:1: ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1764:1: (lv_action_1_0= ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1764:1: (lv_action_1_0= ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1765:3: lv_action_1_0= ruleLayoutElementClickAction
            {
             
            	        newCompositeNode(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4200);
            lv_action_1_0=ruleLayoutElementClickAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonActionAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_1_0, 
                    		"LayoutElementClickAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonActionAttribute"


    // $ANTLR start "entryRuleSpacer"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1789:1: entryRuleSpacer returns [String current=null] : iv_ruleSpacer= ruleSpacer EOF ;
    public final String entryRuleSpacer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpacer = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1790:2: (iv_ruleSpacer= ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1791:2: iv_ruleSpacer= ruleSpacer EOF
            {
             newCompositeNode(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer4237);
            iv_ruleSpacer=ruleSpacer();

            state._fsp--;

             current =iv_ruleSpacer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer4248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpacer"


    // $ANTLR start "ruleSpacer"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1798:1: ruleSpacer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'spacer' ;
    public final AntlrDatatypeRuleToken ruleSpacer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1801:28: (kw= 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1803:2: kw= 'spacer'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleSpacer4285); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSpacerAccess().getSpacerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpacer"


    // $ANTLR start "entryRuleText"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1816:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1817:2: (iv_ruleText= ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1818:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4324);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1825:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1828:28: ( (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1829:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1829:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1829:3: otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleText4371); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1833:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1834:1: (lv_text_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1834:1: (lv_text_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1835:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText4388); 

            			newLeafNode(lv_text_1_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1859:1: entryRuleLayoutElementClickAction returns [EObject current=null] : iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF ;
    public final EObject entryRuleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElementClickAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1860:2: (iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1861:2: iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4429);
            iv_ruleLayoutElementClickAction=ruleLayoutElementClickAction();

            state._fsp--;

             current =iv_ruleLayoutElementClickAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction4439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutElementClickAction"


    // $ANTLR start "ruleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1868:1: ruleLayoutElementClickAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1871:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1872:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1872:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1873:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4486);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1883:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4513);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1893:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4540);
                    this_ActionStartService_2=ruleActionStartService();

                    state._fsp--;

                     
                            current = this_ActionStartService_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutElementClickAction"


    // $ANTLR start "entryRuleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1909:1: entryRuleBroadcastReceiverActionAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1910:2: (iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1911:2: iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4575);
            iv_ruleBroadcastReceiverActionAttribute=ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastReceiverActionAttribute"


    // $ANTLR start "ruleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1918:1: ruleBroadcastReceiverActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) ;
    public final EObject ruleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1921:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1922:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1922:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1922:3: otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleBroadcastReceiverActionAttribute4622); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1926:1: ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1927:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1927:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1928:3: lv_action_1_0= ruleBroadcastReceiverAction
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute4643);
            lv_action_1_0=ruleBroadcastReceiverAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBroadcastReceiverActionAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_1_0, 
                    		"BroadcastReceiverAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastReceiverActionAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1952:1: entryRuleBroadcastReceiverAction returns [EObject current=null] : iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF ;
    public final EObject entryRuleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1953:2: (iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1954:2: iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction4679);
            iv_ruleBroadcastReceiverAction=ruleBroadcastReceiverAction();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction4689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastReceiverAction"


    // $ANTLR start "ruleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1961:1: ruleBroadcastReceiverAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1964:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1965:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1965:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1966:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction4736);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1976:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction4763);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1986:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction4790);
                    this_ActionStartService_2=ruleActionStartService();

                    state._fsp--;

                     
                            current = this_ActionStartService_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastReceiverAction"


    // $ANTLR start "entryRuleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2002:1: entryRuleActionShowToast returns [EObject current=null] : iv_ruleActionShowToast= ruleActionShowToast EOF ;
    public final EObject entryRuleActionShowToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionShowToast = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2003:2: (iv_ruleActionShowToast= ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2004:2: iv_ruleActionShowToast= ruleActionShowToast EOF
            {
             newCompositeNode(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast4825);
            iv_ruleActionShowToast=ruleActionShowToast();

            state._fsp--;

             current =iv_ruleActionShowToast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast4835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionShowToast"


    // $ANTLR start "ruleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2011:1: ruleActionShowToast returns [EObject current=null] : (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionShowToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_toastText_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2014:28: ( (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2015:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2015:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2015:3: otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleActionShowToast4872); 

                	newLeafNode(otherlv_0, grammarAccess.getActionShowToastAccess().getShowToastKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2019:1: ( (lv_toastText_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2020:1: (lv_toastText_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2020:1: (lv_toastText_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2021:3: lv_toastText_1_0= RULE_STRING
            {
            lv_toastText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionShowToast4889); 

            			newLeafNode(lv_toastText_1_0, grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionShowToastRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"toastText",
                    		lv_toastText_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionShowToast"


    // $ANTLR start "entryRuleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2045:1: entryRuleActionStartActivity returns [EObject current=null] : iv_ruleActionStartActivity= ruleActionStartActivity EOF ;
    public final EObject entryRuleActionStartActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2046:2: (iv_ruleActionStartActivity= ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2047:2: iv_ruleActionStartActivity= ruleActionStartActivity EOF
            {
             newCompositeNode(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity4930);
            iv_ruleActionStartActivity=ruleActionStartActivity();

            state._fsp--;

             current =iv_ruleActionStartActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity4940); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionStartActivity"


    // $ANTLR start "ruleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2054:1: ruleActionStartActivity returns [EObject current=null] : (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActionStartActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2057:28: ( (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2058:1: (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2058:1: (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2058:3: otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleActionStartActivity4977); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2062:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2063:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2063:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2064:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStartActivityRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStartActivity4997); 

            		newLeafNode(otherlv_1, grammarAccess.getActionStartActivityAccess().getActivityActivityCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionStartActivity"


    // $ANTLR start "entryRuleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2083:1: entryRuleActionStartService returns [EObject current=null] : iv_ruleActionStartService= ruleActionStartService EOF ;
    public final EObject entryRuleActionStartService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2084:2: (iv_ruleActionStartService= ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2085:2: iv_ruleActionStartService= ruleActionStartService EOF
            {
             newCompositeNode(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService5033);
            iv_ruleActionStartService=ruleActionStartService();

            state._fsp--;

             current =iv_ruleActionStartService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService5043); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionStartService"


    // $ANTLR start "ruleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2092:1: ruleActionStartService returns [EObject current=null] : (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActionStartService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2095:28: ( (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2096:1: (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2096:1: (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2096:3: otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleActionStartService5080); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2100:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2101:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2101:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2102:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStartServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStartService5100); 

            		newLeafNode(otherlv_1, grammarAccess.getActionStartServiceAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionStartService"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidAppProject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject131 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleAndroidAppProject144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject165 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplication250 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleApplication271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication283 = new BitSet(new long[]{0x00000000833C0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication304 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleApplication317 = new BitSet(new long[]{0x00000000833C0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication338 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleApplication352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackageName435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName453 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulePackageName471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName482 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePackageName496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleApplicationMinSdk833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationMinSdk850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleApplicationTargetSdk938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationTargetSdk955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleApplicationCompileSdk1043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleApplicationPermissionList1148 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationPermissionList1160 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleApplicationPermissionList1181 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationPermissionList1194 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleApplicationPermissionList1215 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleApplicationPermissionList1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleApplicationElementList1312 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationElementList1324 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1345 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationElementList1358 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1379 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleApplicationElementList1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleApplicationMainActivity1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationMainActivity1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleApplicationElement1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleApplicationElement1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleActivity1725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1742 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivity1759 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity1780 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1793 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity1814 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleActivity1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBroadcastReceiver1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBroadcastReceiver1928 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBroadcastReceiver1945 = new BitSet(new long[]{0x00000011E0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1966 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleBroadcastReceiver1979 = new BitSet(new long[]{0x00000011E0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2000 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleBroadcastReceiver2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleService2097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2114 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService2131 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2152 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleService2165 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2186 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleService2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleServiceAttribute2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute2836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleElementEnabledAttribute2883 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute2941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleElementExportedAttribute2988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleElementLabelAttribute3093 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleElementIntentList3198 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleElementIntentList3210 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleElementIntentList3231 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleElementIntentList3244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleElementIntentList3265 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleElementIntentList3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleActivityParentAttribute3362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityParentAttribute3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleActivityLayoutAttribute3465 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActivityLayoutAttribute3477 = new BitSet(new long[]{0x0000006800000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3498 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleActivityLayoutAttribute3511 = new BitSet(new long[]{0x0000006800000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3532 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleActivityLayoutAttribute3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleLayoutElement3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_ruleLayoutElement3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleLayoutElement3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleButton3769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton3786 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleButton3803 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton3824 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleButton3837 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton3858 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleButton3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleButtonLabelAttribute4074 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleButtonActionAttribute4179 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSpacer4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleText4371 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBroadcastReceiverActionAttribute4622 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction4679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast4825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleActionShowToast4872 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionShowToast4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity4930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleActionStartActivity4977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStartActivity4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService5033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleActionStartService5080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStartService5100 = new BitSet(new long[]{0x0000000000000002L});

}