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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'.'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'spacer'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleApplication250); 

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


    // $ANTLR start "entryRuleJavaIdentifier"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:219:1: entryRuleJavaIdentifier returns [String current=null] : iv_ruleJavaIdentifier= ruleJavaIdentifier EOF ;
    public final String entryRuleJavaIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJavaIdentifier = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:220:2: (iv_ruleJavaIdentifier= ruleJavaIdentifier EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:221:2: iv_ruleJavaIdentifier= ruleJavaIdentifier EOF
            {
             newCompositeNode(grammarAccess.getJavaIdentifierRule()); 
            pushFollow(FOLLOW_ruleJavaIdentifier_in_entryRuleJavaIdentifier389);
            iv_ruleJavaIdentifier=ruleJavaIdentifier();

            state._fsp--;

             current =iv_ruleJavaIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaIdentifier400); 

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
    // $ANTLR end "entryRuleJavaIdentifier"


    // $ANTLR start "ruleJavaIdentifier"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:228:1: ruleJavaIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleJavaIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:231:28: (this_ID_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:232:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaIdentifier439); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getJavaIdentifierAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleJavaIdentifier"


    // $ANTLR start "entryRuleClassName"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:247:1: entryRuleClassName returns [String current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final String entryRuleClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassName = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:248:2: (iv_ruleClassName= ruleClassName EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:249:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName484);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName495); 

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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:256:1: ruleClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:259:28: (this_ID_0= RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:260:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassName534); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getClassNameAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRulePackageName"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:275:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:276:2: (iv_rulePackageName= rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:277:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName579);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName590); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:284:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:287:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:288:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName630); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:295:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:296:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_rulePackageName649); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName664); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:316:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:317:2: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:318:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute711);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute721); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:325:1: ruleApplicationAttribute returns [EObject current=null] : (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:328:28: ( (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:329:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:329:1: (this_ElementLabelAttribute_0= ruleElementLabelAttribute | this_ApplicationMinSdk_1= ruleApplicationMinSdk | this_ApplicationTargetSdk_2= ruleApplicationTargetSdk | this_ApplicationCompileSdk_3= ruleApplicationCompileSdk | this_ApplicationPermissionList_4= ruleApplicationPermissionList | this_ApplicationElementList_5= ruleApplicationElementList | this_ApplicationMainActivity_6= ruleApplicationMainActivity )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:330:5: this_ElementLabelAttribute_0= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute768);
                    this_ElementLabelAttribute_0=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:340:5: this_ApplicationMinSdk_1= ruleApplicationMinSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute795);
                    this_ApplicationMinSdk_1=ruleApplicationMinSdk();

                    state._fsp--;

                     
                            current = this_ApplicationMinSdk_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:350:5: this_ApplicationTargetSdk_2= ruleApplicationTargetSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute822);
                    this_ApplicationTargetSdk_2=ruleApplicationTargetSdk();

                    state._fsp--;

                     
                            current = this_ApplicationTargetSdk_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:360:5: this_ApplicationCompileSdk_3= ruleApplicationCompileSdk
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute849);
                    this_ApplicationCompileSdk_3=ruleApplicationCompileSdk();

                    state._fsp--;

                     
                            current = this_ApplicationCompileSdk_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:370:5: this_ApplicationPermissionList_4= ruleApplicationPermissionList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute876);
                    this_ApplicationPermissionList_4=ruleApplicationPermissionList();

                    state._fsp--;

                     
                            current = this_ApplicationPermissionList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:380:5: this_ApplicationElementList_5= ruleApplicationElementList
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute903);
                    this_ApplicationElementList_5=ruleApplicationElementList();

                    state._fsp--;

                     
                            current = this_ApplicationElementList_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:390:5: this_ApplicationMainActivity_6= ruleApplicationMainActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute930);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:406:1: entryRuleApplicationMinSdk returns [EObject current=null] : iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF ;
    public final EObject entryRuleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMinSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:407:2: (iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:408:2: iv_ruleApplicationMinSdk= ruleApplicationMinSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk965);
            iv_ruleApplicationMinSdk=ruleApplicationMinSdk();

            state._fsp--;

             current =iv_ruleApplicationMinSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk975); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:415:1: ruleApplicationMinSdk returns [EObject current=null] : (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationMinSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:418:28: ( (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:419:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:419:1: (otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:419:3: otherlv_0= 'min-sdk' ( (lv_minSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleApplicationMinSdk1012); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:423:1: ( (lv_minSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:424:1: (lv_minSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:424:1: (lv_minSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:425:3: lv_minSdk_1_0= RULE_INT
            {
            lv_minSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationMinSdk1029); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:449:1: entryRuleApplicationTargetSdk returns [EObject current=null] : iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF ;
    public final EObject entryRuleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationTargetSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:450:2: (iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:451:2: iv_ruleApplicationTargetSdk= ruleApplicationTargetSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk1070);
            iv_ruleApplicationTargetSdk=ruleApplicationTargetSdk();

            state._fsp--;

             current =iv_ruleApplicationTargetSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk1080); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:458:1: ruleApplicationTargetSdk returns [EObject current=null] : (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationTargetSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:461:28: ( (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:462:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:462:1: (otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:462:3: otherlv_0= 'target-sdk' ( (lv_targetSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleApplicationTargetSdk1117); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:466:1: ( (lv_targetSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:467:1: (lv_targetSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:467:1: (lv_targetSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:468:3: lv_targetSdk_1_0= RULE_INT
            {
            lv_targetSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationTargetSdk1134); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:492:1: entryRuleApplicationCompileSdk returns [EObject current=null] : iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF ;
    public final EObject entryRuleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationCompileSdk = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:493:2: (iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:494:2: iv_ruleApplicationCompileSdk= ruleApplicationCompileSdk EOF
            {
             newCompositeNode(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk1175);
            iv_ruleApplicationCompileSdk=ruleApplicationCompileSdk();

            state._fsp--;

             current =iv_ruleApplicationCompileSdk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk1185); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:501:1: ruleApplicationCompileSdk returns [EObject current=null] : (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) ;
    public final EObject ruleApplicationCompileSdk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compileSdk_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:504:28: ( (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:505:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:505:1: (otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:505:3: otherlv_0= 'compile-sdk' ( (lv_compileSdk_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleApplicationCompileSdk1222); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:509:1: ( (lv_compileSdk_1_0= RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:510:1: (lv_compileSdk_1_0= RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:510:1: (lv_compileSdk_1_0= RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:511:3: lv_compileSdk_1_0= RULE_INT
            {
            lv_compileSdk_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1239); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:535:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:536:2: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:537:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
            {
             newCompositeNode(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1280);
            iv_ruleApplicationPermissionList=ruleApplicationPermissionList();

            state._fsp--;

             current =iv_ruleApplicationPermissionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList1290); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:544:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:547:28: ( (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:548:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:548:1: (otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:548:3: otherlv_0= 'permissions' otherlv_1= '[' ( (lv_permissions_2_0= rulePermission ) ) (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleApplicationPermissionList1327); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleApplicationPermissionList1339); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:556:1: ( (lv_permissions_2_0= rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:557:1: (lv_permissions_2_0= rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:557:1: (lv_permissions_2_0= rulePermission )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:558:3: lv_permissions_2_0= rulePermission
            {
             
            	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1360);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:574:2: (otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:574:4: otherlv_3= ',' ( (lv_permissions_4_0= rulePermission ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleApplicationPermissionList1373); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:578:1: ( (lv_permissions_4_0= rulePermission ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:579:1: (lv_permissions_4_0= rulePermission )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:579:1: (lv_permissions_4_0= rulePermission )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:580:3: lv_permissions_4_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleApplicationPermissionList1394);
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleApplicationPermissionList1408); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:608:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:609:2: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:610:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1444);
            iv_ruleApplicationElementList=ruleApplicationElementList();

            state._fsp--;

             current =iv_ruleApplicationElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList1454); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:617:1: ruleApplicationElementList returns [EObject current=null] : (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:620:28: ( (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:621:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:621:1: (otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:621:3: otherlv_0= 'elements' otherlv_1= '[' ( (lv_elements_2_0= ruleApplicationElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleApplicationElementList1491); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationElementListAccess().getElementsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleApplicationElementList1503); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:629:1: ( (lv_elements_2_0= ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:630:1: (lv_elements_2_0= ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:630:1: (lv_elements_2_0= ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:631:3: lv_elements_2_0= ruleApplicationElement
            {
             
            	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1524);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:647:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:647:4: otherlv_3= ',' ( (lv_elements_4_0= ruleApplicationElement ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleApplicationElementList1537); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:651:1: ( (lv_elements_4_0= ruleApplicationElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:1: (lv_elements_4_0= ruleApplicationElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:652:1: (lv_elements_4_0= ruleApplicationElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:653:3: lv_elements_4_0= ruleApplicationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1558);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleApplicationElementList1572); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:681:1: entryRuleApplicationMainActivity returns [EObject current=null] : iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF ;
    public final EObject entryRuleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMainActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:682:2: (iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:683:2: iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF
            {
             newCompositeNode(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1608);
            iv_ruleApplicationMainActivity=ruleApplicationMainActivity();

            state._fsp--;

             current =iv_ruleApplicationMainActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity1618); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:690:1: ruleApplicationMainActivity returns [EObject current=null] : (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= ruleClassName ) ) ) ;
    public final EObject ruleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_launcherActivity_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:693:28: ( (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= ruleClassName ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:694:1: (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= ruleClassName ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:694:1: (otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= ruleClassName ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:694:3: otherlv_0= 'main-activity' ( (lv_launcherActivity_1_0= ruleClassName ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleApplicationMainActivity1655); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:698:1: ( (lv_launcherActivity_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:699:1: (lv_launcherActivity_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:699:1: (lv_launcherActivity_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:700:3: lv_launcherActivity_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleApplicationMainActivity1676);
            lv_launcherActivity_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationMainActivityRule());
            	        }
                   		set(
                   			current, 
                   			"launcherActivity",
                    		lv_launcherActivity_1_0, 
                    		"ClassName");
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
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRulePermission"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:724:1: entryRulePermission returns [String current=null] : iv_rulePermission= rulePermission EOF ;
    public final String entryRulePermission() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePermission = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:725:2: (iv_rulePermission= rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:726:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission1713);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission1724); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:733:1: rulePermission returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PackageName_0= rulePackageName ;
    public final AntlrDatatypeRuleToken rulePermission() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PackageName_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:736:28: (this_PackageName_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:738:5: this_PackageName_0= rulePackageName
            {
             
                    newCompositeNode(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackageName_in_rulePermission1770);
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


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:756:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:757:2: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:758:2: iv_ruleApplicationElement= ruleApplicationElement EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1814);
            iv_ruleApplicationElement=ruleApplicationElement();

            state._fsp--;

             current =iv_ruleApplicationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement1824); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:765:1: ruleApplicationElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_BroadcastReceiver_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:768:28: ( (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:769:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:769:1: (this_Activity_0= ruleActivity | this_BroadcastReceiver_1= ruleBroadcastReceiver | this_Service_2= ruleService )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:770:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleApplicationElement1871);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:780:5: this_BroadcastReceiver_1= ruleBroadcastReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1898);
                    this_BroadcastReceiver_1=ruleBroadcastReceiver();

                    state._fsp--;

                     
                            current = this_BroadcastReceiver_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:790:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleApplicationElement1925);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:806:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:807:2: (iv_ruleActivity= ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:808:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1960);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1970); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:815:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:818:28: ( (otherlv_0= 'activity' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:819:1: (otherlv_0= 'activity' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:819:1: (otherlv_0= 'activity' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:819:3: otherlv_0= 'activity' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleActivityAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleActivity2007); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:823:1: ( (lv_className_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:824:1: (lv_className_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:824:1: (lv_className_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:825:3: lv_className_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getClassNameClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleActivity2028);
            lv_className_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ClassName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActivity2040); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:845:1: ( (lv_attributes_3_0= ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:846:1: (lv_attributes_3_0= ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:846:1: (lv_attributes_3_0= ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:847:3: lv_attributes_3_0= ruleActivityAttribute
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity2061);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:863:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:863:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleActivity2074); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:867:1: ( (lv_attributes_5_0= ruleActivityAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:868:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:868:1: (lv_attributes_5_0= ruleActivityAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:869:3: lv_attributes_5_0= ruleActivityAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityAttribute_in_ruleActivity2095);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleActivity2109); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:897:1: entryRuleBroadcastReceiver returns [EObject current=null] : iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF ;
    public final EObject entryRuleBroadcastReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiver = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:898:2: (iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:899:2: iv_ruleBroadcastReceiver= ruleBroadcastReceiver EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver2145);
            iv_ruleBroadcastReceiver=ruleBroadcastReceiver();

            state._fsp--;

             current =iv_ruleBroadcastReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver2155); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:906:1: ruleBroadcastReceiver returns [EObject current=null] : (otherlv_0= 'receiver' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBroadcastReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:909:28: ( (otherlv_0= 'receiver' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:910:1: (otherlv_0= 'receiver' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:910:1: (otherlv_0= 'receiver' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:910:3: otherlv_0= 'receiver' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleBroadcastReceiver2192); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:914:1: ( (lv_className_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:915:1: (lv_className_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:915:1: (lv_className_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:916:3: lv_className_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getClassNameClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleBroadcastReceiver2213);
            lv_className_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ClassName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBroadcastReceiver2225); 

                	newLeafNode(otherlv_2, grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:936:1: ( (lv_attributes_3_0= ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:937:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:937:1: (lv_attributes_3_0= ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:938:3: lv_attributes_3_0= ruleBroadcastReceiverAttribute
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2246);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:954:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:954:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleBroadcastReceiver2259); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:958:1: ( (lv_attributes_5_0= ruleBroadcastReceiverAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:959:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:959:1: (lv_attributes_5_0= ruleBroadcastReceiverAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:960:3: lv_attributes_5_0= ruleBroadcastReceiverAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2280);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBroadcastReceiver2294); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:988:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:989:2: (iv_ruleService= ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:990:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2330);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2340); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:997:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1000:28: ( (otherlv_0= 'service' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1001:1: (otherlv_0= 'service' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1001:1: (otherlv_0= 'service' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1001:3: otherlv_0= 'service' ( (lv_className_1_0= ruleClassName ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleServiceAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleService2377); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1005:1: ( (lv_className_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1006:1: (lv_className_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1006:1: (lv_className_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1007:3: lv_className_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getClassNameClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleService2398);
            lv_className_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ClassName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleService2410); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1027:1: ( (lv_attributes_3_0= ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1028:1: (lv_attributes_3_0= ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1028:1: (lv_attributes_3_0= ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1029:3: lv_attributes_3_0= ruleServiceAttribute
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2431);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1045:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1045:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleService2444); 

            	        	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1049:1: ( (lv_attributes_5_0= ruleServiceAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1050:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1050:1: (lv_attributes_5_0= ruleServiceAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1051:3: lv_attributes_5_0= ruleServiceAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceAttribute_in_ruleService2465);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleService2479); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1079:1: entryRuleActivityAttribute returns [EObject current=null] : iv_ruleActivityAttribute= ruleActivityAttribute EOF ;
    public final EObject entryRuleActivityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1080:2: (iv_ruleActivityAttribute= ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1081:2: iv_ruleActivityAttribute= ruleActivityAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2515);
            iv_ruleActivityAttribute=ruleActivityAttribute();

            state._fsp--;

             current =iv_ruleActivityAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute2525); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1088:1: ruleActivityAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1091:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1092:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1092:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_ActivityParentAttribute_4= ruleActivityParentAttribute | this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute )
            int alt11=6;
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
            case 32:
                {
                alt11=5;
                }
                break;
            case 33:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1093:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2572);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1103:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2599);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1113:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2626);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1123:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2653);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1133:5: this_ActivityParentAttribute_4= ruleActivityParentAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2680);
                    this_ActivityParentAttribute_4=ruleActivityParentAttribute();

                    state._fsp--;

                     
                            current = this_ActivityParentAttribute_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1143:5: this_ActivityLayoutAttribute_5= ruleActivityLayoutAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2707);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1159:1: entryRuleBroadcastReceiverAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1160:2: (iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1161:2: iv_ruleBroadcastReceiverAttribute= ruleBroadcastReceiverAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2742);
            iv_ruleBroadcastReceiverAttribute=ruleBroadcastReceiverAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2752); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1168:1: ruleBroadcastReceiverAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) ;
    public final EObject ruleBroadcastReceiverAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;

        EObject this_BroadcastReceiverActionAttribute_4 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1171:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1172:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1172:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList | this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute )
            int alt12=5;
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
            case 35:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1173:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2799);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1183:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2826);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1193:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2853);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1203:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2880);
                    this_ElementIntentList_3=ruleElementIntentList();

                    state._fsp--;

                     
                            current = this_ElementIntentList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1213:5: this_BroadcastReceiverActionAttribute_4= ruleBroadcastReceiverActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2907);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1229:1: entryRuleServiceAttribute returns [EObject current=null] : iv_ruleServiceAttribute= ruleServiceAttribute EOF ;
    public final EObject entryRuleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1230:2: (iv_ruleServiceAttribute= ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1231:2: iv_ruleServiceAttribute= ruleServiceAttribute EOF
            {
             newCompositeNode(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2942);
            iv_ruleServiceAttribute=ruleServiceAttribute();

            state._fsp--;

             current =iv_ruleServiceAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute2952); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1238:1: ruleServiceAttribute returns [EObject current=null] : (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) ;
    public final EObject ruleServiceAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ElementEnabledAttribute_0 = null;

        EObject this_ElementExportedAttribute_1 = null;

        EObject this_ElementLabelAttribute_2 = null;

        EObject this_ElementIntentList_3 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1241:28: ( (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1242:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1242:1: (this_ElementEnabledAttribute_0= ruleElementEnabledAttribute | this_ElementExportedAttribute_1= ruleElementExportedAttribute | this_ElementLabelAttribute_2= ruleElementLabelAttribute | this_ElementIntentList_3= ruleElementIntentList )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1243:5: this_ElementEnabledAttribute_0= ruleElementEnabledAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2999);
                    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute();

                    state._fsp--;

                     
                            current = this_ElementEnabledAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1253:5: this_ElementExportedAttribute_1= ruleElementExportedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute3026);
                    this_ElementExportedAttribute_1=ruleElementExportedAttribute();

                    state._fsp--;

                     
                            current = this_ElementExportedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1263:5: this_ElementLabelAttribute_2= ruleElementLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute3053);
                    this_ElementLabelAttribute_2=ruleElementLabelAttribute();

                    state._fsp--;

                     
                            current = this_ElementLabelAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1273:5: this_ElementIntentList_3= ruleElementIntentList
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleElementIntentList_in_ruleServiceAttribute3080);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1289:1: entryRuleElementEnabledAttribute returns [EObject current=null] : iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF ;
    public final EObject entryRuleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementEnabledAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1290:2: (iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1291:2: iv_ruleElementEnabledAttribute= ruleElementEnabledAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute3115);
            iv_ruleElementEnabledAttribute=ruleElementEnabledAttribute();

            state._fsp--;

             current =iv_ruleElementEnabledAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute3125); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1298:1: ruleElementEnabledAttribute returns [EObject current=null] : (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementEnabledAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_enabled_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1301:28: ( (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1302:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1302:1: (otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1302:3: otherlv_0= 'enabled' ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleElementEnabledAttribute3162); 

                	newLeafNode(otherlv_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1306:1: ( (lv_enabled_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1307:1: (lv_enabled_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1307:1: (lv_enabled_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1308:3: lv_enabled_1_0= RULE_BOOLEAN
            {
            lv_enabled_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute3179); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1332:1: entryRuleElementExportedAttribute returns [EObject current=null] : iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF ;
    public final EObject entryRuleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementExportedAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1333:2: (iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1334:2: iv_ruleElementExportedAttribute= ruleElementExportedAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute3220);
            iv_ruleElementExportedAttribute=ruleElementExportedAttribute();

            state._fsp--;

             current =iv_ruleElementExportedAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute3230); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1341:1: ruleElementExportedAttribute returns [EObject current=null] : (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleElementExportedAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exported_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1344:28: ( (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1345:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1345:1: (otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1345:3: otherlv_0= 'exported' ( (lv_exported_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleElementExportedAttribute3267); 

                	newLeafNode(otherlv_0, grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1349:1: ( (lv_exported_1_0= RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1350:1: (lv_exported_1_0= RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1350:1: (lv_exported_1_0= RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1351:3: lv_exported_1_0= RULE_BOOLEAN
            {
            lv_exported_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute3284); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1375:1: entryRuleElementLabelAttribute returns [EObject current=null] : iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF ;
    public final EObject entryRuleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1376:2: (iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1377:2: iv_ruleElementLabelAttribute= ruleElementLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute3325);
            iv_ruleElementLabelAttribute=ruleElementLabelAttribute();

            state._fsp--;

             current =iv_ruleElementLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute3335); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1384:1: ruleElementLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleElementLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1387:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1388:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1388:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1388:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleElementLabelAttribute3372); 

                	newLeafNode(otherlv_0, grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1392:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1393:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1393:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1394:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3389); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1418:1: entryRuleElementIntentList returns [EObject current=null] : iv_ruleElementIntentList= ruleElementIntentList EOF ;
    public final EObject entryRuleElementIntentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementIntentList = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1419:2: (iv_ruleElementIntentList= ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1420:2: iv_ruleElementIntentList= ruleElementIntentList EOF
            {
             newCompositeNode(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3430);
            iv_ruleElementIntentList=ruleElementIntentList();

            state._fsp--;

             current =iv_ruleElementIntentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList3440); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1427:1: ruleElementIntentList returns [EObject current=null] : (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1430:28: ( (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:1: (otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1431:3: otherlv_0= 'intents' otherlv_1= '[' ( (lv_intents_2_0= ruleIntent ) ) (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleElementIntentList3477); 

                	newLeafNode(otherlv_0, grammarAccess.getElementIntentListAccess().getIntentsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleElementIntentList3489); 

                	newLeafNode(otherlv_1, grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1439:1: ( (lv_intents_2_0= ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1440:1: (lv_intents_2_0= ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1440:1: (lv_intents_2_0= ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1441:3: lv_intents_2_0= ruleIntent
            {
             
            	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntent_in_ruleElementIntentList3510);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1457:2: (otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1457:4: otherlv_3= ',' ( (lv_intents_4_0= ruleIntent ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleElementIntentList3523); 

            	        	newLeafNode(otherlv_3, grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1461:1: ( (lv_intents_4_0= ruleIntent ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1462:1: (lv_intents_4_0= ruleIntent )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1462:1: (lv_intents_4_0= ruleIntent )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1463:3: lv_intents_4_0= ruleIntent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntent_in_ruleElementIntentList3544);
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
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleElementIntentList3558); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1491:1: entryRuleIntent returns [String current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final String entryRuleIntent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntent = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1492:2: (iv_ruleIntent= ruleIntent EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1493:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent3595);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent3606); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1500:1: ruleIntent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PackageName_0= rulePackageName ;
    public final AntlrDatatypeRuleToken ruleIntent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PackageName_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1503:28: (this_PackageName_0= rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1505:5: this_PackageName_0= rulePackageName
            {
             
                    newCompositeNode(grammarAccess.getIntentAccess().getPackageNameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackageName_in_ruleIntent3652);
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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1523:1: entryRuleActivityParentAttribute returns [EObject current=null] : iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF ;
    public final EObject entryRuleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityParentAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1524:2: (iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1525:2: iv_ruleActivityParentAttribute= ruleActivityParentAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3696);
            iv_ruleActivityParentAttribute=ruleActivityParentAttribute();

            state._fsp--;

             current =iv_ruleActivityParentAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute3706); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1532:1: ruleActivityParentAttribute returns [EObject current=null] : (otherlv_0= 'parent' ( (lv_parent_1_0= ruleClassName ) ) ) ;
    public final EObject ruleActivityParentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_parent_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1535:28: ( (otherlv_0= 'parent' ( (lv_parent_1_0= ruleClassName ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:1: (otherlv_0= 'parent' ( (lv_parent_1_0= ruleClassName ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:1: (otherlv_0= 'parent' ( (lv_parent_1_0= ruleClassName ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1536:3: otherlv_0= 'parent' ( (lv_parent_1_0= ruleClassName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActivityParentAttribute3743); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1540:1: ( (lv_parent_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1541:1: (lv_parent_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1541:1: (lv_parent_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1542:3: lv_parent_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getActivityParentAttributeAccess().getParentClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleActivityParentAttribute3764);
            lv_parent_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityParentAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"parent",
                    		lv_parent_1_0, 
                    		"ClassName");
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
    // $ANTLR end "ruleActivityParentAttribute"


    // $ANTLR start "entryRuleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1566:1: entryRuleActivityLayoutAttribute returns [EObject current=null] : iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF ;
    public final EObject entryRuleActivityLayoutAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1567:2: (iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1568:2: iv_ruleActivityLayoutAttribute= ruleActivityLayoutAttribute EOF
            {
             newCompositeNode(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3800);
            iv_ruleActivityLayoutAttribute=ruleActivityLayoutAttribute();

            state._fsp--;

             current =iv_ruleActivityLayoutAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3810); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1575:1: ruleActivityLayoutAttribute returns [EObject current=null] : (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) ;
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
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1578:28: ( (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1579:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1579:1: (otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1579:3: otherlv_0= 'layout-elements' otherlv_1= '[' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleActivityLayoutAttribute3847); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleActivityLayoutAttribute3859); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1587:1: ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1588:1: (lv_layoutElements_2_0= ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1588:1: (lv_layoutElements_2_0= ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1589:3: lv_layoutElements_2_0= ruleLayoutElement
            {
             
            	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3880);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1605:2: (otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1605:4: otherlv_3= ',' ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleActivityLayoutAttribute3893); 

            	        	newLeafNode(otherlv_3, grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1609:1: ( (lv_layoutElements_4_0= ruleLayoutElement ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1610:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1610:1: (lv_layoutElements_4_0= ruleLayoutElement )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1611:3: lv_layoutElements_4_0= ruleLayoutElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3914);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleActivityLayoutAttribute3928); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1639:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1640:2: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1641:2: iv_ruleLayoutElement= ruleLayoutElement EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3964);
            iv_ruleLayoutElement=ruleLayoutElement();

            state._fsp--;

             current =iv_ruleLayoutElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement3974); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1648:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Text_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1651:28: ( (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1652:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1652:1: (this_Button_0= ruleButton | ruleSpacer | this_Text_2= ruleText )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1653:5: this_Button_0= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleLayoutElement4021);
                    this_Button_0=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1663:5: ruleSpacer
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSpacer_in_ruleLayoutElement4042);
                    ruleSpacer();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1672:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleLayoutElement4069);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1688:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1689:2: (iv_ruleButton= ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1690:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton4104);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton4114); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1697:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_buttonName_1_0= ruleJavaIdentifier ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_buttonName_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1700:28: ( (otherlv_0= 'button' ( (lv_buttonName_1_0= ruleJavaIdentifier ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1701:1: (otherlv_0= 'button' ( (lv_buttonName_1_0= ruleJavaIdentifier ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1701:1: (otherlv_0= 'button' ( (lv_buttonName_1_0= ruleJavaIdentifier ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1701:3: otherlv_0= 'button' ( (lv_buttonName_1_0= ruleJavaIdentifier ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleButtonAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleButton4151); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1705:1: ( (lv_buttonName_1_0= ruleJavaIdentifier ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1706:1: (lv_buttonName_1_0= ruleJavaIdentifier )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1706:1: (lv_buttonName_1_0= ruleJavaIdentifier )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1707:3: lv_buttonName_1_0= ruleJavaIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getButtonNameJavaIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaIdentifier_in_ruleButton4172);
            lv_buttonName_1_0=ruleJavaIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	        }
                   		set(
                   			current, 
                   			"buttonName",
                    		lv_buttonName_1_0, 
                    		"JavaIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleButton4184); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1727:1: ( (lv_attributes_3_0= ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1728:1: (lv_attributes_3_0= ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1728:1: (lv_attributes_3_0= ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1729:3: lv_attributes_3_0= ruleButtonAttribute
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton4205);
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

            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1745:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1745:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleButton4218); 

            	        	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1749:1: ( (lv_attributes_5_0= ruleButtonAttribute ) )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1750:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    {
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1750:1: (lv_attributes_5_0= ruleButtonAttribute )
            	    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1751:3: lv_attributes_5_0= ruleButtonAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleButtonAttribute_in_ruleButton4239);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleButton4253); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1779:1: entryRuleButtonAttribute returns [EObject current=null] : iv_ruleButtonAttribute= ruleButtonAttribute EOF ;
    public final EObject entryRuleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1780:2: (iv_ruleButtonAttribute= ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1781:2: iv_ruleButtonAttribute= ruleButtonAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute4289);
            iv_ruleButtonAttribute=ruleButtonAttribute();

            state._fsp--;

             current =iv_ruleButtonAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute4299); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1788:1: ruleButtonAttribute returns [EObject current=null] : (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) ;
    public final EObject ruleButtonAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonLabelAttribute_0 = null;

        EObject this_ButtonActionAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1791:28: ( (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1792:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1792:1: (this_ButtonLabelAttribute_0= ruleButtonLabelAttribute | this_ButtonActionAttribute_1= ruleButtonActionAttribute )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1793:5: this_ButtonLabelAttribute_0= ruleButtonLabelAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute4346);
                    this_ButtonLabelAttribute_0=ruleButtonLabelAttribute();

                    state._fsp--;

                     
                            current = this_ButtonLabelAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1803:5: this_ButtonActionAttribute_1= ruleButtonActionAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute4373);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1819:1: entryRuleButtonLabelAttribute returns [EObject current=null] : iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF ;
    public final EObject entryRuleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonLabelAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1820:2: (iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1821:2: iv_ruleButtonLabelAttribute= ruleButtonLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4408);
            iv_ruleButtonLabelAttribute=ruleButtonLabelAttribute();

            state._fsp--;

             current =iv_ruleButtonLabelAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute4418); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1828:1: ruleButtonLabelAttribute returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleButtonLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1831:28: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1832:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1832:1: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1832:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleButtonLabelAttribute4455); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1836:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1837:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1837:1: (lv_title_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1838:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4472); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1862:1: entryRuleButtonActionAttribute returns [EObject current=null] : iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF ;
    public final EObject entryRuleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1863:2: (iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1864:2: iv_ruleButtonActionAttribute= ruleButtonActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4513);
            iv_ruleButtonActionAttribute=ruleButtonActionAttribute();

            state._fsp--;

             current =iv_ruleButtonActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute4523); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1871:1: ruleButtonActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) ;
    public final EObject ruleButtonActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1874:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1875:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1875:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1875:3: otherlv_0= 'action' ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleButtonActionAttribute4560); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1879:1: ( (lv_action_1_0= ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1880:1: (lv_action_1_0= ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1880:1: (lv_action_1_0= ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1881:3: lv_action_1_0= ruleLayoutElementClickAction
            {
             
            	        newCompositeNode(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4581);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1905:1: entryRuleSpacer returns [String current=null] : iv_ruleSpacer= ruleSpacer EOF ;
    public final String entryRuleSpacer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpacer = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1906:2: (iv_ruleSpacer= ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1907:2: iv_ruleSpacer= ruleSpacer EOF
            {
             newCompositeNode(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer4618);
            iv_ruleSpacer=ruleSpacer();

            state._fsp--;

             current =iv_ruleSpacer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer4629); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1914:1: ruleSpacer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'spacer' ;
    public final AntlrDatatypeRuleToken ruleSpacer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1917:28: (kw= 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1919:2: kw= 'spacer'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleSpacer4666); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1932:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1933:2: (iv_ruleText= ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1934:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4705);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4715); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1941:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1944:28: ( (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1945:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1945:1: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1945:3: otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleText4752); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1949:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1950:1: (lv_text_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1950:1: (lv_text_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1951:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText4769); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1975:1: entryRuleLayoutElementClickAction returns [EObject current=null] : iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF ;
    public final EObject entryRuleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElementClickAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1976:2: (iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1977:2: iv_ruleLayoutElementClickAction= ruleLayoutElementClickAction EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4810);
            iv_ruleLayoutElementClickAction=ruleLayoutElementClickAction();

            state._fsp--;

             current =iv_ruleLayoutElementClickAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction4820); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1984:1: ruleLayoutElementClickAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleLayoutElementClickAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1987:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1988:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1988:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1989:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4867);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:1999:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4894);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2009:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4921);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2025:1: entryRuleBroadcastReceiverActionAttribute returns [EObject current=null] : iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF ;
    public final EObject entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverActionAttribute = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2026:2: (iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2027:2: iv_ruleBroadcastReceiverActionAttribute= ruleBroadcastReceiverActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4956);
            iv_ruleBroadcastReceiverActionAttribute=ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             current =iv_ruleBroadcastReceiverActionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4966); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2034:1: ruleBroadcastReceiverActionAttribute returns [EObject current=null] : (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) ;
    public final EObject ruleBroadcastReceiverActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2037:28: ( (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2038:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2038:1: (otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2038:3: otherlv_0= 'action' ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBroadcastReceiverActionAttribute5003); 

                	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2042:1: ( (lv_action_1_0= ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2043:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2043:1: (lv_action_1_0= ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2044:3: lv_action_1_0= ruleBroadcastReceiverAction
            {
             
            	        newCompositeNode(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute5024);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2068:1: entryRuleBroadcastReceiverAction returns [EObject current=null] : iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF ;
    public final EObject entryRuleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastReceiverAction = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2069:2: (iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2070:2: iv_ruleBroadcastReceiverAction= ruleBroadcastReceiverAction EOF
            {
             newCompositeNode(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction5060);
            iv_ruleBroadcastReceiverAction=ruleBroadcastReceiverAction();

            state._fsp--;

             current =iv_ruleBroadcastReceiverAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction5070); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2077:1: ruleBroadcastReceiverAction returns [EObject current=null] : (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) ;
    public final EObject ruleBroadcastReceiverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionShowToast_0 = null;

        EObject this_ActionStartActivity_1 = null;

        EObject this_ActionStartService_2 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2080:28: ( (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2081:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2081:1: (this_ActionShowToast_0= ruleActionShowToast | this_ActionStartActivity_1= ruleActionStartActivity | this_ActionStartService_2= ruleActionStartService )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
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
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2082:5: this_ActionShowToast_0= ruleActionShowToast
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction5117);
                    this_ActionShowToast_0=ruleActionShowToast();

                    state._fsp--;

                     
                            current = this_ActionShowToast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2092:5: this_ActionStartActivity_1= ruleActionStartActivity
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction5144);
                    this_ActionStartActivity_1=ruleActionStartActivity();

                    state._fsp--;

                     
                            current = this_ActionStartActivity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2102:5: this_ActionStartService_2= ruleActionStartService
                    {
                     
                            newCompositeNode(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction5171);
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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2118:1: entryRuleActionShowToast returns [EObject current=null] : iv_ruleActionShowToast= ruleActionShowToast EOF ;
    public final EObject entryRuleActionShowToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionShowToast = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2119:2: (iv_ruleActionShowToast= ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2120:2: iv_ruleActionShowToast= ruleActionShowToast EOF
            {
             newCompositeNode(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast5206);
            iv_ruleActionShowToast=ruleActionShowToast();

            state._fsp--;

             current =iv_ruleActionShowToast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast5216); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2127:1: ruleActionShowToast returns [EObject current=null] : (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionShowToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_toastText_1_0=null;

         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2130:28: ( (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2131:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2131:1: (otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2131:3: otherlv_0= 'show-toast' ( (lv_toastText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleActionShowToast5253); 

                	newLeafNode(otherlv_0, grammarAccess.getActionShowToastAccess().getShowToastKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2135:1: ( (lv_toastText_1_0= RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2136:1: (lv_toastText_1_0= RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2136:1: (lv_toastText_1_0= RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2137:3: lv_toastText_1_0= RULE_STRING
            {
            lv_toastText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionShowToast5270); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2161:1: entryRuleActionStartActivity returns [EObject current=null] : iv_ruleActionStartActivity= ruleActionStartActivity EOF ;
    public final EObject entryRuleActionStartActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartActivity = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2162:2: (iv_ruleActionStartActivity= ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2163:2: iv_ruleActionStartActivity= ruleActionStartActivity EOF
            {
             newCompositeNode(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity5311);
            iv_ruleActionStartActivity=ruleActionStartActivity();

            state._fsp--;

             current =iv_ruleActionStartActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity5321); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2170:1: ruleActionStartActivity returns [EObject current=null] : (otherlv_0= 'start-activity' ( (lv_activity_1_0= ruleClassName ) ) ) ;
    public final EObject ruleActionStartActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_activity_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2173:28: ( (otherlv_0= 'start-activity' ( (lv_activity_1_0= ruleClassName ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2174:1: (otherlv_0= 'start-activity' ( (lv_activity_1_0= ruleClassName ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2174:1: (otherlv_0= 'start-activity' ( (lv_activity_1_0= ruleClassName ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2174:3: otherlv_0= 'start-activity' ( (lv_activity_1_0= ruleClassName ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleActionStartActivity5358); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2178:1: ( (lv_activity_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2179:1: (lv_activity_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2179:1: (lv_activity_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2180:3: lv_activity_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getActionStartActivityAccess().getActivityClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleActionStartActivity5379);
            lv_activity_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionStartActivityRule());
            	        }
                   		set(
                   			current, 
                   			"activity",
                    		lv_activity_1_0, 
                    		"ClassName");
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
    // $ANTLR end "ruleActionStartActivity"


    // $ANTLR start "entryRuleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2204:1: entryRuleActionStartService returns [EObject current=null] : iv_ruleActionStartService= ruleActionStartService EOF ;
    public final EObject entryRuleActionStartService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStartService = null;


        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2205:2: (iv_ruleActionStartService= ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2206:2: iv_ruleActionStartService= ruleActionStartService EOF
            {
             newCompositeNode(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService5415);
            iv_ruleActionStartService=ruleActionStartService();

            state._fsp--;

             current =iv_ruleActionStartService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService5425); 

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
    // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2213:1: ruleActionStartService returns [EObject current=null] : (otherlv_0= 'start-service' ( (lv_service_1_0= ruleClassName ) ) ) ;
    public final EObject ruleActionStartService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_service_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2216:28: ( (otherlv_0= 'start-service' ( (lv_service_1_0= ruleClassName ) ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2217:1: (otherlv_0= 'start-service' ( (lv_service_1_0= ruleClassName ) ) )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2217:1: (otherlv_0= 'start-service' ( (lv_service_1_0= ruleClassName ) ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2217:3: otherlv_0= 'start-service' ( (lv_service_1_0= ruleClassName ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleActionStartService5462); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0());
                
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2221:1: ( (lv_service_1_0= ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2222:1: (lv_service_1_0= ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2222:1: (lv_service_1_0= ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl/src-gen/at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.g:2223:3: lv_service_1_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getActionStartServiceAccess().getServiceClassNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleActionStartService5483);
            lv_service_1_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionStartServiceRule());
            	        }
                   		set(
                   			current, 
                   			"service",
                    		lv_service_1_0, 
                    		"ClassName");
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
    // $ANTLR end "ruleActionStartService"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidAppProject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject131 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleAndroidAppProject144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidAppProject165 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplication250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleApplication271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication283 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication304 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleApplication317 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_ruleApplication338 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleApplication352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaIdentifier_in_entryRuleJavaIdentifier389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaIdentifier400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaIdentifier439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassName534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName630 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rulePackageName649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName664 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleApplicationAttribute768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_ruleApplicationAttribute795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_ruleApplicationAttribute822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_ruleApplicationAttribute849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_ruleApplicationAttribute876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_ruleApplicationAttribute903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_ruleApplicationAttribute930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleApplicationMinSdk1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationMinSdk1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleApplicationTargetSdk1117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationTargetSdk1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleApplicationCompileSdk1222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplicationCompileSdk1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleApplicationPermissionList1327 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleApplicationPermissionList1339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1360 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationPermissionList1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePermission_in_ruleApplicationPermissionList1394 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationPermissionList1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleApplicationElementList1491 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleApplicationElementList1503 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1524 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationElementList1537 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_ruleApplicationElementList1558 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleApplicationElementList1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleApplicationMainActivity1655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleApplicationMainActivity1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePermission1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement1814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleApplicationElement1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_ruleApplicationElement1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleApplicationElement1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActivity2007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleActivity2028 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActivity2040 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity2061 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleActivity2074 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_ruleActivity2095 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleActivity2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver2145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBroadcastReceiver2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleBroadcastReceiver2213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBroadcastReceiver2225 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2246 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleBroadcastReceiver2259 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_ruleBroadcastReceiver2280 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleBroadcastReceiver2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleService2377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleService2398 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService2410 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2431 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleService2444 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_ruleService2465 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleService2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleActivityAttribute2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleActivityAttribute2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleActivityAttribute2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleActivityAttribute2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_ruleActivityAttribute2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_ruleActivityAttribute2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute2742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleBroadcastReceiverAttribute2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleBroadcastReceiverAttribute2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleBroadcastReceiverAttribute2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleBroadcastReceiverAttribute2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_ruleBroadcastReceiverAttribute2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_ruleServiceAttribute2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_ruleServiceAttribute3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_ruleServiceAttribute3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_ruleServiceAttribute3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleElementEnabledAttribute3162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementEnabledAttribute3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleElementExportedAttribute3267 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleElementExportedAttribute3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute3325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleElementLabelAttribute3372 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementLabelAttribute3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList3430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleElementIntentList3477 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleElementIntentList3489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleElementIntentList3510 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleElementIntentList3523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleElementIntentList3544 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleElementIntentList3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleIntent3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute3696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActivityParentAttribute3743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleActivityParentAttribute3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute3800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleActivityLayoutAttribute3847 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActivityLayoutAttribute3859 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3880 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleActivityLayoutAttribute3893 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_ruleActivityLayoutAttribute3914 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleActivityLayoutAttribute3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement3964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleLayoutElement4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_ruleLayoutElement4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleLayoutElement4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleButton4151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJavaIdentifier_in_ruleButton4172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleButton4184 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton4205 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleButton4218 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_ruleButton4239 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleButton4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute4289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_ruleButtonAttribute4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_ruleButtonAttribute4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute4408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleButtonLabelAttribute4455 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButtonLabelAttribute4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute4513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleButtonActionAttribute4560 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_ruleButtonActionAttribute4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer4618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSpacer4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleText4752 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction4810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleLayoutElementClickAction4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleLayoutElementClickAction4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleLayoutElementClickAction4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute4956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBroadcastReceiverActionAttribute5003 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_ruleBroadcastReceiverActionAttribute5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction5060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_ruleBroadcastReceiverAction5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_ruleBroadcastReceiverAction5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_ruleBroadcastReceiverAction5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast5206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleActionShowToast5253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionShowToast5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity5311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleActionStartActivity5358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleActionStartActivity5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService5415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleActionStartService5462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleActionStartService5483 = new BitSet(new long[]{0x0000000000000002L});

}