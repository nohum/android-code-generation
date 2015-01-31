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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'title'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'"
    };
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:98:4: otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAndroidAppProject144); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:137:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_packageName_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:140:28: ( (otherlv_0= 'application' ( (lv_packageName_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_packageName_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_packageName_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:3: otherlv_0= 'application' ( (lv_packageName_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleApplication250); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:145:1: ( (lv_packageName_1_0= rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_packageName_1_0= rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_packageName_1_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:147:3: lv_packageName_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getPackageNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_ruleApplication271);
            lv_packageName_1_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleApplication283); 

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

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:185:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleApplication317); 

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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleApplication352); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:219:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:220:2: (iv_rulePackageName= rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:221:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName389);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName400); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:228:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:231:28: (this_STRING_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageName439); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getPackageNameAccess().getSTRINGTerminalRuleCall()); 
                

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:247:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:248:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:249:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute483);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute493); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:256:1: ruleApplicationAttribute returns [EObject current=null] : (this_ApplicationTitle_0= ruleApplicationTitle | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationTitle_0 = null;

        EObject this_ApplicationMinSdk_1 = null;

        EObject this_ApplicationTargetSdk_2 = null;

        EObject this_ApplicationCompileSdk_3 = null;

        EObject this_ApplicationPermissionList_4 = null;

        EObject this_ApplicationElementList_5 = null;

        EObject this_ApplicationMainActivity_6 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:259:28: ( (this_ApplicationTitle_0= ruleApplicationTitle | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:260:1: (this_ApplicationTitle_0= ruleApplicationTitle | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:260:1: (this_ApplicationTitle_0= ruleApplicationTitle | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 23:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:261:5: this_ApplicationTitle_0= ruleApplicationTitle
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTitleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleApplicationTitle_in_ruleApplicationAttribute540);
                    this_ApplicationTitle_0=ruleApplicationTitle();

                    state._fsp--;

                     
                            current = this_ApplicationTitle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:271:5: this_ApplicationMinSdk_1= ruleApplicationMinSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute567);
                    this_ApplicationMinSdk_1=ruleApplicationMinSdk();

                    state._fsp--;

                     
                            current = this_ApplicationMinSdk_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:281:5: this_ApplicationTargetSdk_2= ruleApplicationTargetSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute594);
                    this_ApplicationTargetSdk_2=ruleApplicationTargetSdk();

                    state._fsp--;

                     
                            current = this_ApplicationTargetSdk_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:291:5: this_ApplicationCompileSdk_3= ruleApplicationCompileSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute621);
                    this_ApplicationCompileSdk_3=ruleApplicationCompileSdk();

                    state._fsp--;

                     
                            current = this_ApplicationCompileSdk_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:301:5: this_ApplicationPermissionList_4= ruleApplicationPermissionList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute648);
                    this_ApplicationPermissionList_4=ruleApplicationPermissionList();

                    state._fsp--;

                     
                            current = this_ApplicationPermissionList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:311:5: this_ApplicationElementList_5= ruleApplicationElementList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute675);
                    this_ApplicationElementList_5=ruleApplicationElementList();

                    state._fsp--;

                     
                            current = this_ApplicationElementList_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:321:5: this_ApplicationMainActivity_6= ruleApplicationMainActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute702);
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


    // $ANTLR start "entryRuleApplicationTitle"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:337:1: entryRuleApplicationTitle returns [EObject current=null] : iv_ruleApplicationTitle= ruleApplicationTitle EOF ;
    public final EObject entryRuleApplicationTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationTitle = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:338:2: (iv_ruleApplicationTitle= ruleApplicationTitle EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:339:2: iv_ruleApplicationTitle= ruleApplicationTitle EOF
            {
             newCompositeNode(grammarAccess.getApplicationTitleRule()); 
            pushFollow(FOLLOW_ruleApplicationTitle_in_entryRuleApplicationTitle737);
            iv_ruleApplicationTitle=ruleApplicationTitle();

            state._fsp--;

             current =iv_ruleApplicationTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTitle747); 

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
    // $ANTLR end "entryRuleApplicationTitle"


    // $ANTLR start "ruleApplicationTitle"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:346:1: ruleApplicationTitle returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplicationTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:349:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:350:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:350:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:350:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleApplicationTitle784); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationTitleAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:354:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:355:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:355:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:356:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationTitle801); 

            			newLeafNode(lv_title_1_0, grammarAccess.getApplicationTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationTitleRule());
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
    // $ANTLR end "ruleApplicationTitle"


    // $ANTLR start "entryRuleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:380:1: entryRuleApplicationMinSdk returns [EObject current=null] : iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF ;
    public final EObject entryRuleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMinSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:381:2: (iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:382:2: iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk842);
            iv_ruleApplicationMinSdk=ruleApplicationMinSdk();

            state._fsp--;

             current =iv_ruleApplicationMinSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk852); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:389:1: ruleApplicationMinSdk returns [EObject current=null] : (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:392:28: ( (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:393:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:393:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:393:3: otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleApplicationMinSdk889); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:397:1: ( (lv_minSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:398:1: (lv_minSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:398:1: (lv_minSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:399:3: lv_minSdk_1_0= RULE_INT
            {
            lv_minSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationMinSdk906); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:423:1: entryRuleApplicationTargetSdk returns [EObject current=null] : iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF ;
    public final EObject entryRuleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationTargetSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:424:2: (iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:425:2: iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk947);
            iv_ruleApplicationTargetSdk=ruleApplicationTargetSdk();

            state._fsp--;

             current =iv_ruleApplicationTargetSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk957); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:432:1: ruleApplicationTargetSdk returns [EObject current=null] : (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:435:28: ( (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:436:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:436:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:436:3: otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleApplicationTargetSdk994); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:440:1: ( (lv_targetSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:441:1: (lv_targetSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:441:1: (lv_targetSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:442:3: lv_targetSdk_1_0= RULE_INT
            {
            lv_targetSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationTargetSdk1011); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:466:1: entryRuleApplicationCompileSdk returns [EObject current=null] : iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF ;
    public final EObject entryRuleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationCompileSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:467:2: (iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:468:2: iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk1052);
            iv_ruleApplicationCompileSdk=ruleApplicationCompileSdk();

            state._fsp--;

             current =iv_ruleApplicationCompileSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk1062); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:475:1: ruleApplicationCompileSdk returns [EObject current=null] : (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compileSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:478:28: ( (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:479:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:479:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:479:3: otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleApplicationCompileSdk1099); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:483:1: ( (lv_compileSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:484:1: (lv_compileSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:484:1: (lv_compileSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:485:3: lv_compileSdk_1_0= RULE_INT
            {
            lv_compileSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1116); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:509:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:510:2: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:511:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
            {
             newCompositeNode(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1157);
            iv_ruleApplicationPermissionList=ruleApplicationPermissionList();

            state._fsp--;

             current =iv_ruleApplicationPermissionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList1167); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:518:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_permissions_2_0 = null;

        AntlrDatatypeRuleToken lv_permissions_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:521:28: ( (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:522:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:522:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:522:3: otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleApplicationPermissionList1204); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleApplicationPermissionList1216); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:530:1: ( (lv_permissions_2_0= rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:531:1: (lv_permissions_2_0= rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:531:1: (lv_permissions_2_0= rulePermission )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:532:3: lv_permissions_2_0= rulePermission
            {
             
            	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1237);
            lv_permissions_2_0=rulePermission();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	        }
                   		add(
                   			current, 
                   			"permissions",
                    		lv_permissions_2_0, 
                    		"Permission");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:548:2: (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:548:4: otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleApplicationPermissionList1250); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:552:1: ( (lv_permissions_4_0= rulePermission ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:553:1: (lv_permissions_4_0= rulePermission )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:553:1: (lv_permissions_4_0= rulePermission )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:554:3: lv_permissions_4_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1271);
            	    lv_permissions_4_0=rulePermission();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"permissions",
            	            		lv_permissions_4_0, 
            	            		"Permission");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleApplicationPermissionList1285); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:582:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:583:2: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:584:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1321);
            iv_ruleApplicationElementList=ruleApplicationElementList();

            state._fsp--;

             current =iv_ruleApplicationElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList1331); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:591:1: ruleApplicationElementList returns [EObject current=null] : (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleIntentStartable ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_elements_2_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:594:28: ( (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleIntentStartable ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:595:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleIntentStartable ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:595:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleIntentStartable ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:595:3: otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleIntentStartable ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleApplicationElementList1368); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationElementListAccess().getElementsKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleApplicationElementList1380); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:603:1: ( (lv_elements_2_0= ruleIntentStartable ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:604:1: (lv_elements_2_0= ruleIntentStartable )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:604:1: (lv_elements_2_0= ruleIntentStartable )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:605:3: lv_elements_2_0= ruleIntentStartable
            {
             
            	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsIntentStartableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntentStartable_in_ruleApplicationElementList1401);
            lv_elements_2_0=ruleIntentStartable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"IntentStartable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:621:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:621:4: otherlv_3= ',' ( (lv_elements_4_0= ruleIntentStartable ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleApplicationElementList1414); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:625:1: ( (lv_elements_4_0= ruleIntentStartable ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:626:1: (lv_elements_4_0= ruleIntentStartable )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:626:1: (lv_elements_4_0= ruleIntentStartable )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:627:3: lv_elements_4_0= ruleIntentStartable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsIntentStartableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntentStartable_in_ruleApplicationElementList1435);
            	    lv_elements_4_0=ruleIntentStartable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"IntentStartable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleApplicationElementList1449); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:655:1: entryRuleApplicationMainActivity returns [EObject current=null] : iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF ;
    public final EObject entryRuleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMainActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:656:2: (iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:657:2: iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF
            {
             newCompositeNode(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1485);
            iv_ruleApplicationMainActivity=ruleApplicationMainActivity();

            state._fsp--;

             current =iv_ruleApplicationMainActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity1495); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:664:1: ruleApplicationMainActivity returns [EObject current=null] : (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_launcherActivity_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:667:28: ( (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:668:1: (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:668:1: (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:668:3: otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleApplicationMainActivity1532); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:672:1: ( (lv_launcherActivity_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:673:1: (lv_launcherActivity_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:673:1: (lv_launcherActivity_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:674:3: lv_launcherActivity_1_0= RULE_STRING
            {
            lv_launcherActivity_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationMainActivity1549); 

            			newLeafNode(lv_launcherActivity_1_0, grammarAccess.getApplicationMainActivityAccess().getLauncherActivitySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationMainActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"launcherActivity",
                    		lv_launcherActivity_1_0, 
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
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRulePermission"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:698:1: entryRulePermission returns [String current=null] : iv_rulePermission= rulePermission EOF ;
    public final String entryRulePermission() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePermission = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:699:2: (iv_rulePermission= rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:700:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission1591);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission1602); 

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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:707:1: rulePermission returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PackageName_0= rulePackageName ;
    public final AntlrDatatypeRuleToken rulePermission() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PackageName_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:710:28: (this_PackageName_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:712:5: this_PackageName_0= rulePackageName
            {
             
                    newCompositeNode(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackageName_in_rulePermission1648);
            this_PackageName_0=rulePackageName();

            state._fsp--;


            		current.merge(this_PackageName_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleIntentStartable"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:730:1: entryRuleIntentStartable returns [String current=null] : iv_ruleIntentStartable= ruleIntentStartable EOF ;
    public final String entryRuleIntentStartable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntentStartable = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:731:2: (iv_ruleIntentStartable= ruleIntentStartable EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:732:2: iv_ruleIntentStartable= ruleIntentStartable EOF
            {
             newCompositeNode(grammarAccess.getIntentStartableRule()); 
            pushFollow(FOLLOW_ruleIntentStartable_in_entryRuleIntentStartable1693);
            iv_ruleIntentStartable=ruleIntentStartable();

            state._fsp--;

             current =iv_ruleIntentStartable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentStartable1704); 

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
    // $ANTLR end "entryRuleIntentStartable"


    // $ANTLR start "ruleIntentStartable"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:739:1: ruleIntentStartable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) ;
    public final AntlrDatatypeRuleToken ruleIntentStartable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Activity_0 = null;

        AntlrDatatypeRuleToken this_BroadcastReceiver_1 = null;

        AntlrDatatypeRuleToken this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:742:28: ( (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:743:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:743:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:744:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getIntentStartableAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleIntentStartable1751);
                    this_Activity_0=ruleActivity();

                    state._fsp--;


                    		current.merge(this_Activity_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:756:5: this_BroadcastReceiver_1= ruleBroadcastReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getIntentStartableAccess().getBroadcastReceiverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_ruleIntentStartable1784);
                    this_BroadcastReceiver_1=ruleBroadcastReceiver();

                    state._fsp--;


                    		current.merge(this_BroadcastReceiver_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:768:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getIntentStartableAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleIntentStartable1817);
                    this_Service_2=ruleService();

                    state._fsp--;


                    		current.merge(this_Service_2);
                        
                     
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
    // $ANTLR end "ruleIntentStartable"


    // $ANTLR start "entryRuleActivity"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:786:1: entryRuleActivity returns [String current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final String entryRuleActivity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:787:2: (iv_ruleActivity= ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:788:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1863);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1874); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:795:1: ruleActivity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'activity' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleActivity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:798:28: ( (kw= 'activity' kw= '{' kw= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:799:1: (kw= 'activity' kw= '{' kw= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:799:1: (kw= 'activity' kw= '{' kw= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:800:2: kw= 'activity' kw= '{' kw= '}'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleActivity1912); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getActivityAccess().getActivityKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleActivity1925); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleActivity1938); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:825:1: entryRuleBroadcastReceiver returns [String current=null] : iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF ;
    public final String entryRuleBroadcastReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBroadcastReceiver = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:826:2: (iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:827:2: iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1979);
            iv_ruleBroadcastReceiver=ruleBroadcastReceiver();

            state._fsp--;

             current =iv_ruleBroadcastReceiver.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver1990); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:834:1: ruleBroadcastReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'receiver' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBroadcastReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:837:28: ( (kw= 'receiver' kw= '{' kw= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:838:1: (kw= 'receiver' kw= '{' kw= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:838:1: (kw= 'receiver' kw= '{' kw= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:839:2: kw= 'receiver' kw= '{' kw= '}'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleBroadcastReceiver2028); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleBroadcastReceiver2041); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_1()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleBroadcastReceiver2054); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:864:1: entryRuleService returns [String current=null] : iv_ruleService= ruleService EOF ;
    public final String entryRuleService() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:865:2: (iv_ruleService= ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:866:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2095);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2106); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:873:1: ruleService returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'service' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleService() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:876:28: ( (kw= 'service' kw= '{' kw= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:877:1: (kw= 'service' kw= '{' kw= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:877:1: (kw= 'service' kw= '{' kw= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:878:2: kw= 'service' kw= '{' kw= '}'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleService2144); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceAccess().getServiceKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleService2157); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleService2170); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_2()); 
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidAppProject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject131 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAndroidAppProject144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject165 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleApplication250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleApplication271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplication283 = new BitSet(new long[]{0x0000000000CF8000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication304 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleApplication317 = new BitSet(new long[]{0x0000000000CF8000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication338 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_14_in_ruleApplication352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageName439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTitle_in_ruleApplicationAttribute540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTitle_in_entryRuleApplicationTitle737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTitle747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleApplicationTitle784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationTitle801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleApplicationMinSdk889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationMinSdk906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleApplicationTargetSdk994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationTargetSdk1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleApplicationCompileSdk1099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleApplicationPermissionList1204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleApplicationPermissionList1216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1237 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_11_in_ruleApplicationPermissionList1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1271 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_ruleApplicationPermissionList1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleApplicationElementList1368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleApplicationElementList1380 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ruleIntentStartable_in_ruleApplicationElementList1401 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_11_in_ruleApplicationElementList1414 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ruleIntentStartable_in_ruleApplicationElementList1435 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_ruleApplicationElementList1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleApplicationMainActivity1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationMainActivity1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePermission1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentStartable_in_entryRuleIntentStartable1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentStartable1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleIntentStartable1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_ruleIntentStartable1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleIntentStartable1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleActivity1912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity1925 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivity1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBroadcastReceiver2028 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBroadcastReceiver2041 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBroadcastReceiver2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleService2144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService2157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService2170 = new BitSet(new long[]{0x0000000000000002L});

}