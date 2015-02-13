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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PACKAGE_NAME", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'spacer'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=6;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_PACKAGE_NAME=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
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
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;

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

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:98:4: otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAndroidAppProject144); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:137:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_PACKAGE_NAME ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:140:28: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_PACKAGE_NAME ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_PACKAGE_NAME ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_PACKAGE_NAME ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:141:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_PACKAGE_NAME ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleApplicationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleApplication250); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:145:1: ( (lv_name_1_0= RULE_PACKAGE_NAME ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_name_1_0= RULE_PACKAGE_NAME )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:146:1: (lv_name_1_0= RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:147:3: lv_name_1_0= RULE_PACKAGE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_ruleApplication267); 

            			newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNamePACKAGE_NAMETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PACKAGE_NAME");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleApplication284); 

                	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:167:1: ( (lv_attributes_3_0= ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:168:1: (lv_attributes_3_0= ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:168:1: (lv_attributes_3_0= ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:169:3: lv_attributes_3_0= ruleApplicationAttribute
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleApplication305);
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

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:185:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleApplicationAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleApplication318); 

            	        	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:189:1: ( (lv_attributes_5_0= ruleApplicationAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:190:1: (lv_attributes_5_0= ruleApplicationAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:190:1: (lv_attributes_5_0= ruleApplicationAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:191:3: lv_attributes_5_0= ruleApplicationAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationAttribute_in_ruleApplication339);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleApplication353); 

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


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:219:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:220:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:221:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute389);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute399); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:228:1: ruleApplicationAttribute returns [EObject current=null] : (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:231:28: ( (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 24:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:233:5: this_ElementLabelAttribute_0= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute446);
                    this_ElementLabelAttribute_0=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:243:5: this_ApplicationMinSdk_1= ruleApplicationMinSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute473);
                    this_ApplicationMinSdk_1=ruleApplicationMinSdk();

                    state._fsp--;

                     
                            current = this_ApplicationMinSdk_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:253:5: this_ApplicationTargetSdk_2= ruleApplicationTargetSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute500);
                    this_ApplicationTargetSdk_2=ruleApplicationTargetSdk();

                    state._fsp--;

                     
                            current = this_ApplicationTargetSdk_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:263:5: this_ApplicationCompileSdk_3= ruleApplicationCompileSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute527);
                    this_ApplicationCompileSdk_3=ruleApplicationCompileSdk();

                    state._fsp--;

                     
                            current = this_ApplicationCompileSdk_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:273:5: this_ApplicationPermissionList_4= ruleApplicationPermissionList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute554);
                    this_ApplicationPermissionList_4=ruleApplicationPermissionList();

                    state._fsp--;

                     
                            current = this_ApplicationPermissionList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:283:5: this_ApplicationElementList_5= ruleApplicationElementList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute581);
                    this_ApplicationElementList_5=ruleApplicationElementList();

                    state._fsp--;

                     
                            current = this_ApplicationElementList_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:293:5: this_ApplicationMainActivity_6= ruleApplicationMainActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute608);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:309:1: entryRuleApplicationMinSdk returns [EObject current=null] : iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF ;
    public final EObject entryRuleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMinSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:310:2: (iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:311:2: iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk643);
            iv_ruleApplicationMinSdk=ruleApplicationMinSdk();

            state._fsp--;

             current =iv_ruleApplicationMinSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk653); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:318:1: ruleApplicationMinSdk returns [EObject current=null] : (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:321:28: ( (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:322:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:322:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:322:3: otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleApplicationMinSdk690); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:326:1: ( (lv_minSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:327:1: (lv_minSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:327:1: (lv_minSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:328:3: lv_minSdk_1_0= RULE_INT
            {
            lv_minSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationMinSdk707); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:352:1: entryRuleApplicationTargetSdk returns [EObject current=null] : iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF ;
    public final EObject entryRuleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationTargetSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:353:2: (iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:354:2: iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk748);
            iv_ruleApplicationTargetSdk=ruleApplicationTargetSdk();

            state._fsp--;

             current =iv_ruleApplicationTargetSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk758); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:361:1: ruleApplicationTargetSdk returns [EObject current=null] : (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:364:28: ( (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:365:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:365:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:365:3: otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleApplicationTargetSdk795); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:369:1: ( (lv_targetSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:370:1: (lv_targetSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:370:1: (lv_targetSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:371:3: lv_targetSdk_1_0= RULE_INT
            {
            lv_targetSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationTargetSdk812); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:395:1: entryRuleApplicationCompileSdk returns [EObject current=null] : iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF ;
    public final EObject entryRuleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationCompileSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:396:2: (iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:397:2: iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk853);
            iv_ruleApplicationCompileSdk=ruleApplicationCompileSdk();

            state._fsp--;

             current =iv_ruleApplicationCompileSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk863); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:404:1: ruleApplicationCompileSdk returns [EObject current=null] : (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compileSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:407:28: ( (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:408:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:408:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:408:3: otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleApplicationCompileSdk900); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:412:1: ( (lv_compileSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:413:1: (lv_compileSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:413:1: (lv_compileSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:414:3: lv_compileSdk_1_0= RULE_INT
            {
            lv_compileSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationCompileSdk917); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:438:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:439:2: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:440:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
            {
             newCompositeNode(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList958);
            iv_ruleApplicationPermissionList=ruleApplicationPermissionList();

            state._fsp--;

             current =iv_ruleApplicationPermissionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList968); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:447:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:450:28: ( (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:451:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:451:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:451:3: otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleApplicationPermissionList1005); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleApplicationPermissionList1017); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:459:1: ( (lv_permissions_2_0= rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:460:1: (lv_permissions_2_0= rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:460:1: (lv_permissions_2_0= rulePermission )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:461:3: lv_permissions_2_0= rulePermission
            {
             
            	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1038);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:477:2: (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:477:4: otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleApplicationPermissionList1051); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:481:1: ( (lv_permissions_4_0= rulePermission ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:482:1: (lv_permissions_4_0= rulePermission )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:482:1: (lv_permissions_4_0= rulePermission )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:483:3: lv_permissions_4_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1072);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleApplicationPermissionList1086); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:511:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:512:2: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:513:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1122);
            iv_ruleApplicationElementList=ruleApplicationElementList();

            state._fsp--;

             current =iv_ruleApplicationElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList1132); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:520:1: ruleApplicationElementList returns [EObject current=null] : (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:523:28: ( (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:524:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:524:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:524:3: otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleApplicationElementList1169); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationElementListAccess().getElementsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleApplicationElementList1181); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:532:1: ( (lv_elements_2_0= ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:533:1: (lv_elements_2_0= ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:533:1: (lv_elements_2_0= ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:534:3: lv_elements_2_0= ruleApplicationElement
            {
             
            	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1202);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:550:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:550:4: otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleApplicationElementList1215); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:554:1: ( (lv_elements_4_0= ruleApplicationElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:555:1: (lv_elements_4_0= ruleApplicationElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:555:1: (lv_elements_4_0= ruleApplicationElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:556:3: lv_elements_4_0= ruleApplicationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1236);
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleApplicationElementList1250); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:584:1: entryRuleApplicationMainActivity returns [EObject current=null] : iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF ;
    public final EObject entryRuleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMainActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:585:2: (iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:586:2: iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF
            {
             newCompositeNode(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1286);
            iv_ruleApplicationMainActivity=ruleApplicationMainActivity();

            state._fsp--;

             current =iv_ruleApplicationMainActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity1296); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:593:1: ruleApplicationMainActivity returns [EObject current=null] : (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:596:28: ( (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:597:1: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:597:1: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:597:3: otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleApplicationMainActivity1333); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:601:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:602:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:602:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:603:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationMainActivityRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationMainActivity1353); 

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


    // $ANTLR start "entryRulePermission"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:622:1: entryRulePermission returns [String current=null] : iv_rulePermission= rulePermission EOF ;
    public final String entryRulePermission() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePermission = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:623:2: (iv_rulePermission= rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:624:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission1390);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission1401); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:631:1: rulePermission returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PACKAGE_NAME_0= RULE_PACKAGE_NAME ;
    public final AntlrDatatypeRuleToken rulePermission() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKAGE_NAME_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:634:28: (this_PACKAGE_NAME_0= RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:635:5: this_PACKAGE_NAME_0= RULE_PACKAGE_NAME
            {
            this_PACKAGE_NAME_0=(Token)match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_rulePermission1440); 

            		current.merge(this_PACKAGE_NAME_0);
                
             
                newLeafNode(this_PACKAGE_NAME_0, grammarAccess.getPermissionAccess().getPACKAGE_NAMETerminalRuleCall()); 
                

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


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:650:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:651:2: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:2: iv_ruleApplicationElement= ruleApplicationElement EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1484);
            iv_ruleApplicationElement=ruleApplicationElement();

            state._fsp--;

             current =iv_ruleApplicationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement1494); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:659:1: ruleApplicationElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_BroadcastReceiver_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:662:28: ( (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:663:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:663:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:664:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleApplicationElement1541);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:674:5: this_BroadcastReceiver_1= ruleBroadcastReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1568);
                    this_BroadcastReceiver_1=ruleBroadcastReceiver();

                    state._fsp--;

                     
                            current = this_BroadcastReceiver_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:684:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleApplicationElement1595);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:700:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:701:2: (iv_ruleActivity= ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:702:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1630);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1640); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:709:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:712:28: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:713:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:713:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:713:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleActivity1677); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:717:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:718:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:718:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1694); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleActivity1711); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:739:1: ( (lv_attributes_3_0= ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:740:1: (lv_attributes_3_0= ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:740:1: (lv_attributes_3_0= ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:741:3: lv_attributes_3_0= ruleActivityAttribute
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity1732);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:757:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:757:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleActivity1745); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:761:1: ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:762:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:762:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:763:3: lv_attributes_5_0= ruleActivityAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity1766);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleActivity1780); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:791:1: entryRuleBroadcastReceiver returns [EObject current=null] : iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF ;
    public final EObject entryRuleBroadcastReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiver = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:792:2: (iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:793:2: iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1816);
            iv_ruleBroadcastReceiver=ruleBroadcastReceiver();

            state._fsp--;

             current =iv_ruleBroadcastReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver1826); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:800:1: ruleBroadcastReceiver returns [EObject current=null] : (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:803:28: ( (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:804:1: (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:804:1: (otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:804:3: otherlv_0= 'receiver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleBroadcastReceiver1863); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:808:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:809:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:809:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:810:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBroadcastReceiver1880); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBroadcastReceiver1897); 

                	newLeafNode(otherlv_2, grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:830:1: ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:831:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:831:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:832:3: lv_attributes_3_0= ruleBroadcastReceiverAttribute
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1918);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:848:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:848:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBroadcastReceiver1931); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:852:1: ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:853:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:853:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:854:3: lv_attributes_5_0= ruleBroadcastReceiverAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1952);
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
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleBroadcastReceiver1966); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:882:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:883:2: (iv_ruleService= ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:884:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2002);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2012); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:891:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:894:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:895:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:895:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:895:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleService2049); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:899:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:900:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:900:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:901:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2066); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleService2083); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:921:1: ( (lv_attributes_3_0= ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:922:1: (lv_attributes_3_0= ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:922:1: (lv_attributes_3_0= ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:923:3: lv_attributes_3_0= ruleServiceAttribute
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2104);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:939:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:939:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleService2117); 

            	        	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:943:1: ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:944:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:944:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:945:3: lv_attributes_5_0= ruleServiceAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2138);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleService2152); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:973:1: entryRuleActivityAttribute returns [EObject current=null] : iv_ruleActivityAttribute= ruleActivityAttribute EOF ;
    public final EObject entryRuleActivityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:974:2: (iv_ruleActivityAttribute= ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:975:2: iv_ruleActivityAttribute= ruleActivityAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2188);
            iv_ruleActivityAttribute=ruleActivityAttribute();

            state._fsp--;

             current =iv_ruleActivityAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute2198); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:982:1: ruleActivityAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:985:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:986:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:986:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            case 33:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:987:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2245);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:997:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2272);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1007:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2299);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1017:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2326);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1027:5: this_ActivityParentAttribute_4= ruleActivityParentAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2353);
                    this_ActivityParentAttribute_4=ruleActivityParentAttribute();

                    state._fsp--;

                     
                            current = this_ActivityParentAttribute_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1037:5: this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2380);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1053:1: entryRuleBroadcastReceiverAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1054:2: (iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1055:2: iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2415);
            iv_ruleBroadcastReceiverAttribute=ruleBroadcastReceiverAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2425); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1062:1: ruleBroadcastReceiverAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) ;
    public final EObject ruleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;

        EObject this_BroadcastReceiverActionAttribute_4 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1065:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1066:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1066:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            case 35:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1067:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2472);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1077:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2499);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1087:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2526);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1097:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2553);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1107:5: this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2580);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1123:1: entryRuleServiceAttribute returns [EObject current=null] : iv_ruleServiceAttribute= ruleServiceAttribute EOF ;
    public final EObject entryRuleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1124:2: (iv_ruleServiceAttribute= ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1125:2: iv_ruleServiceAttribute= ruleServiceAttribute EOF
            {
             newCompositeNode(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2615);
            iv_ruleServiceAttribute=ruleServiceAttribute();

            state._fsp--;

             current =iv_ruleServiceAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute2625); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1132:1: ruleServiceAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) ;
    public final EObject ruleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1135:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1136:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1136:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1137:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2672);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1147:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute2699);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1157:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute2726);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1167:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleServiceAttribute2753);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1183:1: entryRuleElementEnabledAttribute returns [EObject current=null] : iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF ;
    public final EObject entryRuleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementEnabledAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1184:2: (iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1185:2: iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute2788);
            iv_ruleElementEnabledAttribute=ruleElementEnabledAttribute();

            state._fsp--;

             current =iv_ruleElementEnabledAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute2798); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1192:1: ruleElementEnabledAttribute returns [EObject current=null] : (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_enabled_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1195:28: ( (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1196:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1196:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1196:3: otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleElementEnabledAttribute2835); 

                	newLeafNode(otherlv_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1200:1: ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1201:1: (lv_enabled_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1201:1: (lv_enabled_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1202:3: lv_enabled_1_0= RULE_BOOLEAN
            {
            lv_enabled_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute2852); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1226:1: entryRuleElementExportedAttribute returns [EObject current=null] : iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF ;
    public final EObject entryRuleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementExportedAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1227:2: (iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1228:2: iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute2893);
            iv_ruleElementExportedAttribute=ruleElementExportedAttribute();

            state._fsp--;

             current =iv_ruleElementExportedAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute2903); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1235:1: ruleElementExportedAttribute returns [EObject current=null] : (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exported_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1238:28: ( (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1239:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1239:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1239:3: otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleElementExportedAttribute2940); 

                	newLeafNode(otherlv_0, grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1243:1: ( (lv_exported_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1244:1: (lv_exported_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1244:1: (lv_exported_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1245:3: lv_exported_1_0= RULE_BOOLEAN
            {
            lv_exported_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute2957); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1269:1: entryRuleElementLabelAttribute returns [EObject current=null] : iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF ;
    public final EObject entryRuleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1270:2: (iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1271:2: iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute2998);
            iv_ruleElementLabelAttribute=ruleElementLabelAttribute();

            state._fsp--;

             current =iv_ruleElementLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute3008); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1278:1: ruleElementLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1281:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1282:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1282:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1282:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleElementLabelAttribute3045); 

                	newLeafNode(otherlv_0, grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1286:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1287:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1287:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1288:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3062); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1312:1: entryRuleElementIntentList returns [EObject current=null] : iv_ruleElementIntentList= ruleElementIntentList EOF ;
    public final EObject entryRuleElementIntentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementIntentList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1313:2: (iv_ruleElementIntentList= ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1314:2: iv_ruleElementIntentList= ruleElementIntentList EOF
            {
             newCompositeNode(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3103);
            iv_ruleElementIntentList=ruleElementIntentList();

            state._fsp--;

             current =iv_ruleElementIntentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList3113); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1321:1: ruleElementIntentList returns [EObject current=null] : (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleElementIntentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_intents_2_0 = null;

        AntlrDatatypeRuleToken lv_intents_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1324:28: ( (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1325:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1325:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1325:3: otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleElementIntentList3150); 

                	newLeafNode(otherlv_0, grammarAccess.getElementIntentListAccess().getIntentsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleElementIntentList3162); 

                	newLeafNode(otherlv_1, grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1333:1: ( (lv_intents_2_0= ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1334:1: (lv_intents_2_0= ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1334:1: (lv_intents_2_0= ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1335:3: lv_intents_2_0= ruleIntent
            {
             
            	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntent_in_ruleElementIntentList3183);
            lv_intents_2_0=ruleIntent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementIntentListRule());
            	        }
                   		add(
                   			current, 
                   			"intents",
                    		lv_intents_2_0, 
                    		"Intent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1351:2: (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1351:4: otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleElementIntentList3196); 

            	        	newLeafNode(otherlv_3, grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1355:1: ( (lv_intents_4_0= ruleIntent ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1356:1: (lv_intents_4_0= ruleIntent )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1356:1: (lv_intents_4_0= ruleIntent )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1357:3: lv_intents_4_0= ruleIntent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntent_in_ruleElementIntentList3217);
            	    lv_intents_4_0=ruleIntent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElementIntentListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intents",
            	            		lv_intents_4_0, 
            	            		"Intent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleElementIntentList3231); 

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


    // $ANTLR start "entryRuleIntent"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1385:1: entryRuleIntent returns [String current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final String entryRuleIntent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntent = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1386:2: (iv_ruleIntent= ruleIntent EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1387:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent3268);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent3279); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1394:1: ruleIntent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PACKAGE_NAME_0= RULE_PACKAGE_NAME ;
    public final AntlrDatatypeRuleToken ruleIntent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKAGE_NAME_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1397:28: (this_PACKAGE_NAME_0= RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1398:5: this_PACKAGE_NAME_0= RULE_PACKAGE_NAME
            {
            this_PACKAGE_NAME_0=(Token)match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_ruleIntent3318); 

            		current.merge(this_PACKAGE_NAME_0);
                
             
                newLeafNode(this_PACKAGE_NAME_0, grammarAccess.getIntentAccess().getPACKAGE_NAMETerminalRuleCall()); 
                

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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1413:1: entryRuleActivityParentAttribute returns [EObject current=null] : iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF ;
    public final EObject entryRuleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityParentAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1414:2: (iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1415:2: iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3362);
            iv_ruleActivityParentAttribute=ruleActivityParentAttribute();

            state._fsp--;

             current =iv_ruleActivityParentAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute3372); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1422:1: ruleActivityParentAttribute returns [EObject current=null] : (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1425:28: ( (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1426:1: (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1426:1: (otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1426:3: otherlv_0= 'parent' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActivityParentAttribute3409); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1430:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1432:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityParentAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityParentAttribute3429); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1451:1: entryRuleActivityLayoutAttribute returns [EObject current=null] : iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF ;
    public final EObject entryRuleActivityLayoutAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1452:2: (iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1453:2: iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3465);
            iv_ruleActivityLayoutAttribute=ruleActivityLayoutAttribute();

            state._fsp--;

             current =iv_ruleActivityLayoutAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3475); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1460:1: ruleActivityLayoutAttribute returns [EObject current=null] : (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1463:28: ( (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1464:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1464:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1464:3: otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleActivityLayoutAttribute3512); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleActivityLayoutAttribute3524); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1472:1: ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1473:1: (lv_layoutElements_2_0= ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1473:1: (lv_layoutElements_2_0= ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1474:3: lv_layoutElements_2_0= ruleLayoutElement
            {
             
            	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3545);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1490:2: (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1490:4: otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActivityLayoutAttribute3558); 

            	        	newLeafNode(otherlv_3, grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1494:1: ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1495:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1495:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1496:3: lv_layoutElements_4_0= ruleLayoutElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3579);
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
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleActivityLayoutAttribute3593); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1524:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1525:2: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1526:2: iv_ruleLayoutElement= ruleLayoutElement EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3629);
            iv_ruleLayoutElement=ruleLayoutElement();

            state._fsp--;

             current =iv_ruleLayoutElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement3639); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1533:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Text_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:28: ( (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1537:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1537:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1538:5: this_Button_0= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleLayoutElement3686);
                    this_Button_0=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1548:5: ruleSpacer
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSpacer_in_ruleLayoutElement3707);
                    ruleSpacer();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1557:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleLayoutElement3734);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1573:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1574:2: (iv_ruleButton= ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1575:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3769);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3779); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1582:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1585:28: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1586:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1586:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1586:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleButton3816); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1590:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1591:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1591:1: (lv_name_1_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1592:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton3833); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleButton3850); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1612:1: ( (lv_attributes_3_0= ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1613:1: (lv_attributes_3_0= ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1613:1: (lv_attributes_3_0= ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1614:3: lv_attributes_3_0= ruleButtonAttribute
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton3871);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1630:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1630:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleButton3884); 

            	        	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1634:1: ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1635:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1635:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1636:3: lv_attributes_5_0= ruleButtonAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton3905);
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
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleButton3919); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1664:1: entryRuleButtonAttribute returns [EObject current=null] : iv_ruleButtonAttribute= ruleButtonAttribute EOF ;
    public final EObject entryRuleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1665:2: (iv_ruleButtonAttribute= ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1666:2: iv_ruleButtonAttribute= ruleButtonAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute3955);
            iv_ruleButtonAttribute=ruleButtonAttribute();

            state._fsp--;

             current =iv_ruleButtonAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute3965); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1673:1: ruleButtonAttribute returns [EObject current=null] : (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) ;
    public final EObject ruleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonLabelAttribute_0 = null;

        EObject this_ButtonActionAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1676:28: ( (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1677:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1677:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1678:5: this_ButtonLabelAttribute_0= ruleButtonLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute4012);
                    this_ButtonLabelAttribute_0=ruleButtonLabelAttribute();

                    state._fsp--;

                     
                            current = this_ButtonLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1688:5: this_ButtonActionAttribute_1= ruleButtonActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute4039);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1704:1: entryRuleButtonLabelAttribute returns [EObject current=null] : iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF ;
    public final EObject entryRuleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1705:2: (iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1706:2: iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4074);
            iv_ruleButtonLabelAttribute=ruleButtonLabelAttribute();

            state._fsp--;

             current =iv_ruleButtonLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute4084); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1713:1: ruleButtonLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1716:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1717:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1717:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1717:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleButtonLabelAttribute4121); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1721:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1722:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1722:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1723:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4138); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1747:1: entryRuleButtonActionAttribute returns [EObject current=null] : iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF ;
    public final EObject entryRuleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1748:2: (iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1749:2: iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4179);
            iv_ruleButtonActionAttribute=ruleButtonActionAttribute();

            state._fsp--;

             current =iv_ruleButtonActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute4189); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1756:1: ruleButtonActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) ;
    public final EObject ruleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1759:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1760:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1760:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1760:3: otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleButtonActionAttribute4226); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1764:1: ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1765:1: (lv_action_1_0= ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1765:1: (lv_action_1_0= ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1766:3: lv_action_1_0= ruleLayoutElementClickAction
            {
             
            	        newCompositeNode(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4247);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1790:1: entryRuleSpacer returns [String current=null] : iv_ruleSpacer= ruleSpacer EOF ;
    public final String entryRuleSpacer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpacer = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1791:2: (iv_ruleSpacer= ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1792:2: iv_ruleSpacer= ruleSpacer EOF
            {
             newCompositeNode(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer4284);
            iv_ruleSpacer=ruleSpacer();

            state._fsp--;

             current =iv_ruleSpacer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer4295); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1799:1: ruleSpacer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'spacer' ;
    public final AntlrDatatypeRuleToken ruleSpacer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1802:28: (kw= 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1804:2: kw= 'spacer'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleSpacer4332); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1817:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1818:2: (iv_ruleText= ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1819:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4371);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4381); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1826:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1829:28: ( (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1830:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1830:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1830:3: otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleText4418); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1834:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1835:1: (lv_text_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1835:1: (lv_text_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1836:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText4435); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1860:1: entryRuleLayoutElementClickAction returns [EObject current=null] : iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF ;
    public final EObject entryRuleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElementClickAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1861:2: (iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1862:2: iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4476);
            iv_ruleLayoutElementClickAction=ruleLayoutElementClickAction();

            state._fsp--;

             current =iv_ruleLayoutElementClickAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction4486); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1869:1: ruleLayoutElementClickAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1872:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1873:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1873:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1874:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4533);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1884:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4560);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1894:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4587);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1910:1: entryRuleBroadcastReceiverActionAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1911:2: (iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1912:2: iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4622);
            iv_ruleBroadcastReceiverActionAttribute=ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4632); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1919:1: ruleBroadcastReceiverActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) ;
    public final EObject ruleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1922:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1923:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1923:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1923:3: otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBroadcastReceiverActionAttribute4669); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1927:1: ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1928:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1928:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1929:3: lv_action_1_0= ruleBroadcastReceiverAction
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute4690);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1953:1: entryRuleBroadcastReceiverAction returns [EObject current=null] : iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF ;
    public final EObject entryRuleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1954:2: (iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1955:2: iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction4726);
            iv_ruleBroadcastReceiverAction=ruleBroadcastReceiverAction();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction4736); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1962:1: ruleBroadcastReceiverAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1965:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1966:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1966:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1967:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction4783);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1977:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction4810);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1987:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction4837);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2003:1: entryRuleActionShowToast returns [EObject current=null] : iv_ruleActionShowToast= ruleActionShowToast EOF ;
    public final EObject entryRuleActionShowToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionShowToast = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2004:2: (iv_ruleActionShowToast= ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2005:2: iv_ruleActionShowToast= ruleActionShowToast EOF
            {
             newCompositeNode(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast4872);
            iv_ruleActionShowToast=ruleActionShowToast();

            state._fsp--;

             current =iv_ruleActionShowToast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast4882); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2012:1: ruleActionShowToast returns [EObject current=null] : (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionShowToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_toastText_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2015:28: ( (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2016:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2016:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2016:3: otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleActionShowToast4919); 

                	newLeafNode(otherlv_0, grammarAccess.getActionShowToastAccess().getShowToastKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2020:1: ( (lv_toastText_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2021:1: (lv_toastText_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2021:1: (lv_toastText_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2022:3: lv_toastText_1_0= RULE_STRING
            {
            lv_toastText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionShowToast4936); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2046:1: entryRuleActionStartActivity returns [EObject current=null] : iv_ruleActionStartActivity= ruleActionStartActivity EOF ;
    public final EObject entryRuleActionStartActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2047:2: (iv_ruleActionStartActivity= ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2048:2: iv_ruleActionStartActivity= ruleActionStartActivity EOF
            {
             newCompositeNode(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity4977);
            iv_ruleActionStartActivity=ruleActionStartActivity();

            state._fsp--;

             current =iv_ruleActionStartActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity4987); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2055:1: ruleActionStartActivity returns [EObject current=null] : (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActionStartActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2058:28: ( (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2059:1: (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2059:1: (otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2059:3: otherlv_0= 'start-activity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleActionStartActivity5024); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2063:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2064:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2064:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2065:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStartActivityRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStartActivity5044); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2084:1: entryRuleActionStartService returns [EObject current=null] : iv_ruleActionStartService= ruleActionStartService EOF ;
    public final EObject entryRuleActionStartService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2085:2: (iv_ruleActionStartService= ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2086:2: iv_ruleActionStartService= ruleActionStartService EOF
            {
             newCompositeNode(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService5080);
            iv_ruleActionStartService=ruleActionStartService();

            state._fsp--;

             current =iv_ruleActionStartService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService5090); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2093:1: ruleActionStartService returns [EObject current=null] : (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActionStartService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2096:28: ( (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2097:1: (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2097:1: (otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2097:3: otherlv_0= 'start-service' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleActionStartService5127); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2101:1: ( (otherlv_1= RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2102:1: (otherlv_1= RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2102:1: (otherlv_1= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2103:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStartServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStartService5147); 

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
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAndroidAppProject144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject165 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleApplication250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_ruleApplication267 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication284 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication305 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleApplication318 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication339 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleApplication353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleApplicationMinSdk690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationMinSdk707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleApplicationTargetSdk795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationTargetSdk812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleApplicationCompileSdk900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationCompileSdk917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleApplicationPermissionList1005 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleApplicationPermissionList1017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1038 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationPermissionList1051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1072 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationPermissionList1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleApplicationElementList1169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleApplicationElementList1181 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1202 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationElementList1215 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1236 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationElementList1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleApplicationMainActivity1333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationMainActivity1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_rulePermission1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleApplicationElement1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleApplicationElement1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActivity1677 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActivity1711 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity1732 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleActivity1745 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity1766 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleActivity1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBroadcastReceiver1863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBroadcastReceiver1880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBroadcastReceiver1897 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1918 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleBroadcastReceiver1931 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver1952 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleBroadcastReceiver1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleService2049 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2066 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService2083 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2104 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleService2117 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2138 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleService2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleServiceAttribute2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleElementEnabledAttribute2835 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleElementExportedAttribute2940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute2998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleElementLabelAttribute3045 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleElementIntentList3150 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleElementIntentList3162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleElementIntentList3183 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleElementIntentList3196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleElementIntentList3217 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleElementIntentList3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_ruleIntent3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActivityParentAttribute3409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityParentAttribute3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleActivityLayoutAttribute3512 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActivityLayoutAttribute3524 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3545 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleActivityLayoutAttribute3558 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3579 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleActivityLayoutAttribute3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleLayoutElement3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_ruleLayoutElement3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleLayoutElement3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleButton3816 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton3833 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleButton3850 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton3871 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleButton3884 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton3905 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleButton3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleButtonLabelAttribute4121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleButtonActionAttribute4226 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer4284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSpacer4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleText4418 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBroadcastReceiverActionAttribute4669 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction4726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleActionShowToast4919 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionShowToast4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity4977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleActionStartActivity5024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStartActivity5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService5080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleActionStartService5127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStartService5147 = new BitSet(new long[]{0x0000000000000002L});

}