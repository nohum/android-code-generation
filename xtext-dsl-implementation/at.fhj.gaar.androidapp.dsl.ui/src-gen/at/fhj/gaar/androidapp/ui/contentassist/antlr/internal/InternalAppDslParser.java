package at.fhj.gaar.androidapp.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'.'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'show-toast'", "'start-activity'", "'start-service'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g"; }


     
     	private AppDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AppDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:60:1: entryRuleAndroidAppProject : ruleAndroidAppProject EOF ;
    public final void entryRuleAndroidAppProject() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:61:1: ( ruleAndroidAppProject EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:62:1: ruleAndroidAppProject EOF
            {
             before(grammarAccess.getAndroidAppProjectRule()); 
            pushFollow(FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject61);
            ruleAndroidAppProject();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidAppProject68); 

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
    // $ANTLR end "entryRuleAndroidAppProject"


    // $ANTLR start "ruleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:69:1: ruleAndroidAppProject : ( ( rule__AndroidAppProject__Group__0 ) ) ;
    public final void ruleAndroidAppProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:73:2: ( ( ( rule__AndroidAppProject__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:74:1: ( ( rule__AndroidAppProject__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:74:1: ( ( rule__AndroidAppProject__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:75:1: ( rule__AndroidAppProject__Group__0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:76:1: ( rule__AndroidAppProject__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:76:2: rule__AndroidAppProject__Group__0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0_in_ruleAndroidAppProject94);
            rule__AndroidAppProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndroidAppProject"


    // $ANTLR start "entryRuleApplication"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:88:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:89:1: ( ruleApplication EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:90:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:97:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:101:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:102:1: ( ( rule__Application__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:102:1: ( ( rule__Application__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:103:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:104:1: ( rule__Application__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:104:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication154);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleClassName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:116:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:117:1: ( ruleClassName EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:118:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName181);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName188); 

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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:125:1: ruleClassName : ( RULE_ID ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:129:2: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:131:1: RULE_ID
            {
             before(grammarAccess.getClassNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassName214); 
             after(grammarAccess.getClassNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRulePackageName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:144:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:145:1: ( rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:146:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName240);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName247); 

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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:153:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:157:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__PackageName__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:159:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:1: ( rule__PackageName__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName273);
            rule__PackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:172:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:173:1: ( ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:174:1: ruleApplicationAttribute EOF
            {
             before(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute300);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute307); 

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
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:181:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:185:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:187:1: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:1: ( rule__ApplicationAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:2: rule__ApplicationAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute333);
            rule__ApplicationAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:200:1: entryRuleApplicationMinSdk : ruleApplicationMinSdk EOF ;
    public final void entryRuleApplicationMinSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:201:1: ( ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:202:1: ruleApplicationMinSdk EOF
            {
             before(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk360);
            ruleApplicationMinSdk();

            state._fsp--;

             after(grammarAccess.getApplicationMinSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk367); 

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
    // $ANTLR end "entryRuleApplicationMinSdk"


    // $ANTLR start "ruleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:209:1: ruleApplicationMinSdk : ( ( rule__ApplicationMinSdk__Group__0 ) ) ;
    public final void ruleApplicationMinSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:213:2: ( ( ( rule__ApplicationMinSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:215:1: ( rule__ApplicationMinSdk__Group__0 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:1: ( rule__ApplicationMinSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:2: rule__ApplicationMinSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk393);
            rule__ApplicationMinSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMinSdkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationMinSdk"


    // $ANTLR start "entryRuleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:228:1: entryRuleApplicationTargetSdk : ruleApplicationTargetSdk EOF ;
    public final void entryRuleApplicationTargetSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:229:1: ( ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:230:1: ruleApplicationTargetSdk EOF
            {
             before(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk420);
            ruleApplicationTargetSdk();

            state._fsp--;

             after(grammarAccess.getApplicationTargetSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk427); 

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
    // $ANTLR end "entryRuleApplicationTargetSdk"


    // $ANTLR start "ruleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:237:1: ruleApplicationTargetSdk : ( ( rule__ApplicationTargetSdk__Group__0 ) ) ;
    public final void ruleApplicationTargetSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:241:2: ( ( ( rule__ApplicationTargetSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:243:1: ( rule__ApplicationTargetSdk__Group__0 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:1: ( rule__ApplicationTargetSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:2: rule__ApplicationTargetSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk453);
            rule__ApplicationTargetSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationTargetSdk"


    // $ANTLR start "entryRuleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:256:1: entryRuleApplicationCompileSdk : ruleApplicationCompileSdk EOF ;
    public final void entryRuleApplicationCompileSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:257:1: ( ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:258:1: ruleApplicationCompileSdk EOF
            {
             before(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk480);
            ruleApplicationCompileSdk();

            state._fsp--;

             after(grammarAccess.getApplicationCompileSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk487); 

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
    // $ANTLR end "entryRuleApplicationCompileSdk"


    // $ANTLR start "ruleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:265:1: ruleApplicationCompileSdk : ( ( rule__ApplicationCompileSdk__Group__0 ) ) ;
    public final void ruleApplicationCompileSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:269:2: ( ( ( rule__ApplicationCompileSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:271:1: ( rule__ApplicationCompileSdk__Group__0 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:1: ( rule__ApplicationCompileSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:2: rule__ApplicationCompileSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk513);
            rule__ApplicationCompileSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationCompileSdk"


    // $ANTLR start "entryRuleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:284:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:285:1: ( ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:286:1: ruleApplicationPermissionList EOF
            {
             before(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList540);
            ruleApplicationPermissionList();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList547); 

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
    // $ANTLR end "entryRuleApplicationPermissionList"


    // $ANTLR start "ruleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:293:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:297:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:299:1: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:1: ( rule__ApplicationPermissionList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:2: rule__ApplicationPermissionList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList573);
            rule__ApplicationPermissionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationPermissionList"


    // $ANTLR start "entryRuleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:312:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:313:1: ( ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:314:1: ruleApplicationElementList EOF
            {
             before(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList600);
            ruleApplicationElementList();

            state._fsp--;

             after(grammarAccess.getApplicationElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList607); 

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
    // $ANTLR end "entryRuleApplicationElementList"


    // $ANTLR start "ruleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:321:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:325:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationElementList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:327:1: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:1: ( rule__ApplicationElementList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:2: rule__ApplicationElementList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList633);
            rule__ApplicationElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationElementList"


    // $ANTLR start "entryRuleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:340:1: entryRuleApplicationMainActivity : ruleApplicationMainActivity EOF ;
    public final void entryRuleApplicationMainActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:341:1: ( ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:342:1: ruleApplicationMainActivity EOF
            {
             before(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity660);
            ruleApplicationMainActivity();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity667); 

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
    // $ANTLR end "entryRuleApplicationMainActivity"


    // $ANTLR start "ruleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:349:1: ruleApplicationMainActivity : ( ( rule__ApplicationMainActivity__Group__0 ) ) ;
    public final void ruleApplicationMainActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:353:2: ( ( ( rule__ApplicationMainActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:355:1: ( rule__ApplicationMainActivity__Group__0 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:1: ( rule__ApplicationMainActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:2: rule__ApplicationMainActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity693);
            rule__ApplicationMainActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRulePermission"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:368:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:369:1: ( rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:370:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission720);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission727); 

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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:377:1: rulePermission : ( rulePackageName ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:381:2: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:383:1: rulePackageName
            {
             before(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackageName_in_rulePermission753);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:396:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:397:1: ( ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:398:1: ruleApplicationElement EOF
            {
             before(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement779);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement786); 

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
    // $ANTLR end "entryRuleApplicationElement"


    // $ANTLR start "ruleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:405:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:409:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__ApplicationElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:411:1: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:1: ( rule__ApplicationElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:2: rule__ApplicationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement812);
            rule__ApplicationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationElement"


    // $ANTLR start "entryRuleActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:424:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:425:1: ( ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:426:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity839);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity846); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:433:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:437:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Activity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:439:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:1: ( rule__Activity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity872);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:452:1: entryRuleBroadcastReceiver : ruleBroadcastReceiver EOF ;
    public final void entryRuleBroadcastReceiver() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:453:1: ( ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:454:1: ruleBroadcastReceiver EOF
            {
             before(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver899);
            ruleBroadcastReceiver();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver906); 

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
    // $ANTLR end "entryRuleBroadcastReceiver"


    // $ANTLR start "ruleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:461:1: ruleBroadcastReceiver : ( ( rule__BroadcastReceiver__Group__0 ) ) ;
    public final void ruleBroadcastReceiver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:465:2: ( ( ( rule__BroadcastReceiver__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:467:1: ( rule__BroadcastReceiver__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:1: ( rule__BroadcastReceiver__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:2: rule__BroadcastReceiver__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver932);
            rule__BroadcastReceiver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBroadcastReceiver"


    // $ANTLR start "entryRuleService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:480:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:481:1: ( ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:482:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService959);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService966); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:489:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:493:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__Service__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__Service__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:495:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:1: ( rule__Service__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService992);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:508:1: entryRuleActivityAttribute : ruleActivityAttribute EOF ;
    public final void entryRuleActivityAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:509:1: ( ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:510:1: ruleActivityAttribute EOF
            {
             before(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute1019);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute1026); 

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
    // $ANTLR end "entryRuleActivityAttribute"


    // $ANTLR start "ruleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:517:1: ruleActivityAttribute : ( ( rule__ActivityAttribute__Alternatives ) ) ;
    public final void ruleActivityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:521:2: ( ( ( rule__ActivityAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ActivityAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ActivityAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:523:1: ( rule__ActivityAttribute__Alternatives )
            {
             before(grammarAccess.getActivityAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:1: ( rule__ActivityAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:2: rule__ActivityAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute1052);
            rule__ActivityAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:536:1: entryRuleBroadcastReceiverAttribute : ruleBroadcastReceiverAttribute EOF ;
    public final void entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:537:1: ( ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:538:1: ruleBroadcastReceiverAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute1079);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute1086); 

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
    // $ANTLR end "entryRuleBroadcastReceiverAttribute"


    // $ANTLR start "ruleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:545:1: ruleBroadcastReceiverAttribute : ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:549:2: ( ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:551:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:2: rule__BroadcastReceiverAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute1112);
            rule__BroadcastReceiverAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBroadcastReceiverAttribute"


    // $ANTLR start "entryRuleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:564:1: entryRuleServiceAttribute : ruleServiceAttribute EOF ;
    public final void entryRuleServiceAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:565:1: ( ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:566:1: ruleServiceAttribute EOF
            {
             before(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1139);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute1146); 

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
    // $ANTLR end "entryRuleServiceAttribute"


    // $ANTLR start "ruleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:573:1: ruleServiceAttribute : ( ( rule__ServiceAttribute__Alternatives ) ) ;
    public final void ruleServiceAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:577:2: ( ( ( rule__ServiceAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ServiceAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ServiceAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:579:1: ( rule__ServiceAttribute__Alternatives )
            {
             before(grammarAccess.getServiceAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:1: ( rule__ServiceAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:2: rule__ServiceAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1172);
            rule__ServiceAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceAttribute"


    // $ANTLR start "entryRuleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:592:1: entryRuleElementEnabledAttribute : ruleElementEnabledAttribute EOF ;
    public final void entryRuleElementEnabledAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:593:1: ( ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:594:1: ruleElementEnabledAttribute EOF
            {
             before(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1199);
            ruleElementEnabledAttribute();

            state._fsp--;

             after(grammarAccess.getElementEnabledAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute1206); 

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
    // $ANTLR end "entryRuleElementEnabledAttribute"


    // $ANTLR start "ruleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:601:1: ruleElementEnabledAttribute : ( ( rule__ElementEnabledAttribute__Group__0 ) ) ;
    public final void ruleElementEnabledAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:605:2: ( ( ( rule__ElementEnabledAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:607:1: ( rule__ElementEnabledAttribute__Group__0 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:1: ( rule__ElementEnabledAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:2: rule__ElementEnabledAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1232);
            rule__ElementEnabledAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementEnabledAttribute"


    // $ANTLR start "entryRuleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:620:1: entryRuleElementExportedAttribute : ruleElementExportedAttribute EOF ;
    public final void entryRuleElementExportedAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:621:1: ( ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:622:1: ruleElementExportedAttribute EOF
            {
             before(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1259);
            ruleElementExportedAttribute();

            state._fsp--;

             after(grammarAccess.getElementExportedAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute1266); 

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
    // $ANTLR end "entryRuleElementExportedAttribute"


    // $ANTLR start "ruleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:629:1: ruleElementExportedAttribute : ( ( rule__ElementExportedAttribute__Group__0 ) ) ;
    public final void ruleElementExportedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:633:2: ( ( ( rule__ElementExportedAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:635:1: ( rule__ElementExportedAttribute__Group__0 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:1: ( rule__ElementExportedAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:2: rule__ElementExportedAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1292);
            rule__ElementExportedAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementExportedAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementExportedAttribute"


    // $ANTLR start "entryRuleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:648:1: entryRuleElementLabelAttribute : ruleElementLabelAttribute EOF ;
    public final void entryRuleElementLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:649:1: ( ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:650:1: ruleElementLabelAttribute EOF
            {
             before(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1319);
            ruleElementLabelAttribute();

            state._fsp--;

             after(grammarAccess.getElementLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute1326); 

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
    // $ANTLR end "entryRuleElementLabelAttribute"


    // $ANTLR start "ruleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:657:1: ruleElementLabelAttribute : ( ( rule__ElementLabelAttribute__Group__0 ) ) ;
    public final void ruleElementLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:661:2: ( ( ( rule__ElementLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:663:1: ( rule__ElementLabelAttribute__Group__0 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:1: ( rule__ElementLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:2: rule__ElementLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1352);
            rule__ElementLabelAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementLabelAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementLabelAttribute"


    // $ANTLR start "entryRuleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:676:1: entryRuleElementIntentList : ruleElementIntentList EOF ;
    public final void entryRuleElementIntentList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:677:1: ( ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:678:1: ruleElementIntentList EOF
            {
             before(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1379);
            ruleElementIntentList();

            state._fsp--;

             after(grammarAccess.getElementIntentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList1386); 

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
    // $ANTLR end "entryRuleElementIntentList"


    // $ANTLR start "ruleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:685:1: ruleElementIntentList : ( ( rule__ElementIntentList__Group__0 ) ) ;
    public final void ruleElementIntentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:689:2: ( ( ( rule__ElementIntentList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ElementIntentList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ElementIntentList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:691:1: ( rule__ElementIntentList__Group__0 )
            {
             before(grammarAccess.getElementIntentListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:1: ( rule__ElementIntentList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:2: rule__ElementIntentList__Group__0
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1412);
            rule__ElementIntentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementIntentList"


    // $ANTLR start "entryRuleIntent"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:704:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:705:1: ( ruleIntent EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:706:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent1439);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent1446); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:713:1: ruleIntent : ( rulePackageName ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:717:2: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:719:1: rulePackageName
            {
             before(grammarAccess.getIntentAccess().getPackageNameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackageName_in_ruleIntent1472);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getPackageNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:732:1: entryRuleActivityParentAttribute : ruleActivityParentAttribute EOF ;
    public final void entryRuleActivityParentAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:733:1: ( ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:734:1: ruleActivityParentAttribute EOF
            {
             before(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1498);
            ruleActivityParentAttribute();

            state._fsp--;

             after(grammarAccess.getActivityParentAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute1505); 

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
    // $ANTLR end "entryRuleActivityParentAttribute"


    // $ANTLR start "ruleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:741:1: ruleActivityParentAttribute : ( ( rule__ActivityParentAttribute__Group__0 ) ) ;
    public final void ruleActivityParentAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:745:2: ( ( ( rule__ActivityParentAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:747:1: ( rule__ActivityParentAttribute__Group__0 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:1: ( rule__ActivityParentAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:2: rule__ActivityParentAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1531);
            rule__ActivityParentAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityParentAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityParentAttribute"


    // $ANTLR start "entryRuleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:760:1: entryRuleActivityLayoutAttribute : ruleActivityLayoutAttribute EOF ;
    public final void entryRuleActivityLayoutAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:761:1: ( ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:762:1: ruleActivityLayoutAttribute EOF
            {
             before(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1558);
            ruleActivityLayoutAttribute();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1565); 

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
    // $ANTLR end "entryRuleActivityLayoutAttribute"


    // $ANTLR start "ruleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:769:1: ruleActivityLayoutAttribute : ( ( rule__ActivityLayoutAttribute__Group__0 ) ) ;
    public final void ruleActivityLayoutAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:773:2: ( ( ( rule__ActivityLayoutAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:775:1: ( rule__ActivityLayoutAttribute__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:1: ( rule__ActivityLayoutAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:2: rule__ActivityLayoutAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1591);
            rule__ActivityLayoutAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityLayoutAttribute"


    // $ANTLR start "entryRuleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:788:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:789:1: ( ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:790:1: ruleLayoutElement EOF
            {
             before(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1618);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getLayoutElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement1625); 

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
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:797:1: ruleLayoutElement : ( ruleButton ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:801:2: ( ( ruleButton ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ruleButton )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ruleButton )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:803:1: ruleButton
            {
             before(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall()); 
            pushFollow(FOLLOW_ruleButton_in_ruleLayoutElement1651);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleButton"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:816:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:817:1: ( ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:818:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1677);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1684); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:825:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:829:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__Button__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__Button__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:831:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:1: ( rule__Button__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton1710);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:844:1: entryRuleButtonAttribute : ruleButtonAttribute EOF ;
    public final void entryRuleButtonAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:845:1: ( ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:846:1: ruleButtonAttribute EOF
            {
             before(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1737);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute1744); 

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
    // $ANTLR end "entryRuleButtonAttribute"


    // $ANTLR start "ruleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:853:1: ruleButtonAttribute : ( ( rule__ButtonAttribute__Alternatives ) ) ;
    public final void ruleButtonAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:857:2: ( ( ( rule__ButtonAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__ButtonAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__ButtonAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:859:1: ( rule__ButtonAttribute__Alternatives )
            {
             before(grammarAccess.getButtonAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:1: ( rule__ButtonAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:2: rule__ButtonAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1770);
            rule__ButtonAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonAttribute"


    // $ANTLR start "entryRuleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:872:1: entryRuleButtonLabelAttribute : ruleButtonLabelAttribute EOF ;
    public final void entryRuleButtonLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:873:1: ( ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:874:1: ruleButtonLabelAttribute EOF
            {
             before(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1797);
            ruleButtonLabelAttribute();

            state._fsp--;

             after(grammarAccess.getButtonLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute1804); 

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
    // $ANTLR end "entryRuleButtonLabelAttribute"


    // $ANTLR start "ruleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:881:1: ruleButtonLabelAttribute : ( ( rule__ButtonLabelAttribute__Group__0 ) ) ;
    public final void ruleButtonLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:885:2: ( ( ( rule__ButtonLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:887:1: ( rule__ButtonLabelAttribute__Group__0 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:1: ( rule__ButtonLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:2: rule__ButtonLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1830);
            rule__ButtonLabelAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonLabelAttribute"


    // $ANTLR start "entryRuleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:900:1: entryRuleButtonActionAttribute : ruleButtonActionAttribute EOF ;
    public final void entryRuleButtonActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:901:1: ( ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:902:1: ruleButtonActionAttribute EOF
            {
             before(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1857);
            ruleButtonActionAttribute();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute1864); 

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
    // $ANTLR end "entryRuleButtonActionAttribute"


    // $ANTLR start "ruleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:909:1: ruleButtonActionAttribute : ( ( rule__ButtonActionAttribute__Group__0 ) ) ;
    public final void ruleButtonActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:913:2: ( ( ( rule__ButtonActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:915:1: ( rule__ButtonActionAttribute__Group__0 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:1: ( rule__ButtonActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:2: rule__ButtonActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1890);
            rule__ButtonActionAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonActionAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonActionAttribute"


    // $ANTLR start "entryRuleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:928:1: entryRuleLayoutElementClickAction : ruleLayoutElementClickAction EOF ;
    public final void entryRuleLayoutElementClickAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:929:1: ( ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:930:1: ruleLayoutElementClickAction EOF
            {
             before(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1917);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getLayoutElementClickActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction1924); 

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
    // $ANTLR end "entryRuleLayoutElementClickAction"


    // $ANTLR start "ruleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:937:1: ruleLayoutElementClickAction : ( ( rule__LayoutElementClickAction__Alternatives ) ) ;
    public final void ruleLayoutElementClickAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:941:2: ( ( ( rule__LayoutElementClickAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:943:1: ( rule__LayoutElementClickAction__Alternatives )
            {
             before(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:1: ( rule__LayoutElementClickAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:2: rule__LayoutElementClickAction__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1950);
            rule__LayoutElementClickAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutElementClickAction"


    // $ANTLR start "entryRuleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:956:1: entryRuleBroadcastReceiverActionAttribute : ruleBroadcastReceiverActionAttribute EOF ;
    public final void entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:957:1: ( ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:958:1: ruleBroadcastReceiverActionAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1977);
            ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1984); 

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
    // $ANTLR end "entryRuleBroadcastReceiverActionAttribute"


    // $ANTLR start "ruleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:965:1: ruleBroadcastReceiverActionAttribute : ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) ;
    public final void ruleBroadcastReceiverActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:969:2: ( ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:971:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:2: rule__BroadcastReceiverActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2010);
            rule__BroadcastReceiverActionAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBroadcastReceiverActionAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:984:1: entryRuleBroadcastReceiverAction : ruleBroadcastReceiverAction EOF ;
    public final void entryRuleBroadcastReceiverAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:985:1: ( ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:986:1: ruleBroadcastReceiverAction EOF
            {
             before(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2037);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2044); 

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
    // $ANTLR end "entryRuleBroadcastReceiverAction"


    // $ANTLR start "ruleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:993:1: ruleBroadcastReceiverAction : ( ( rule__BroadcastReceiverAction__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:997:2: ( ( ( rule__BroadcastReceiverAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:998:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:998:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:999:1: ( rule__BroadcastReceiverAction__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( rule__BroadcastReceiverAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:2: rule__BroadcastReceiverAction__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2070);
            rule__BroadcastReceiverAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBroadcastReceiverAction"


    // $ANTLR start "entryRuleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1012:1: entryRuleActionShowToast : ruleActionShowToast EOF ;
    public final void entryRuleActionShowToast() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1013:1: ( ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1014:1: ruleActionShowToast EOF
            {
             before(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2097);
            ruleActionShowToast();

            state._fsp--;

             after(grammarAccess.getActionShowToastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast2104); 

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
    // $ANTLR end "entryRuleActionShowToast"


    // $ANTLR start "ruleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1021:1: ruleActionShowToast : ( ( rule__ActionShowToast__Group__0 ) ) ;
    public final void ruleActionShowToast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1025:2: ( ( ( rule__ActionShowToast__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1026:1: ( ( rule__ActionShowToast__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1026:1: ( ( rule__ActionShowToast__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1027:1: ( rule__ActionShowToast__Group__0 )
            {
             before(grammarAccess.getActionShowToastAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( rule__ActionShowToast__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:2: rule__ActionShowToast__Group__0
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2130);
            rule__ActionShowToast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionShowToastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionShowToast"


    // $ANTLR start "entryRuleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1040:1: entryRuleActionStartActivity : ruleActionStartActivity EOF ;
    public final void entryRuleActionStartActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1041:1: ( ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1042:1: ruleActionStartActivity EOF
            {
             before(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2157);
            ruleActionStartActivity();

            state._fsp--;

             after(grammarAccess.getActionStartActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity2164); 

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
    // $ANTLR end "entryRuleActionStartActivity"


    // $ANTLR start "ruleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1049:1: ruleActionStartActivity : ( ( rule__ActionStartActivity__Group__0 ) ) ;
    public final void ruleActionStartActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1053:2: ( ( ( rule__ActionStartActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1054:1: ( ( rule__ActionStartActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1054:1: ( ( rule__ActionStartActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1055:1: ( rule__ActionStartActivity__Group__0 )
            {
             before(grammarAccess.getActionStartActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( rule__ActionStartActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:2: rule__ActionStartActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2190);
            rule__ActionStartActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStartActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionStartActivity"


    // $ANTLR start "entryRuleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1068:1: entryRuleActionStartService : ruleActionStartService EOF ;
    public final void entryRuleActionStartService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1069:1: ( ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1070:1: ruleActionStartService EOF
            {
             before(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService2217);
            ruleActionStartService();

            state._fsp--;

             after(grammarAccess.getActionStartServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService2224); 

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
    // $ANTLR end "entryRuleActionStartService"


    // $ANTLR start "ruleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1077:1: ruleActionStartService : ( ( rule__ActionStartService__Group__0 ) ) ;
    public final void ruleActionStartService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1081:2: ( ( ( rule__ActionStartService__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1082:1: ( ( rule__ActionStartService__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1082:1: ( ( rule__ActionStartService__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1083:1: ( rule__ActionStartService__Group__0 )
            {
             before(grammarAccess.getActionStartServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:1: ( rule__ActionStartService__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:2: rule__ActionStartService__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2250);
            rule__ActionStartService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStartServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionStartService"


    // $ANTLR start "rule__ApplicationAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1096:1: rule__ApplicationAttribute__Alternatives : ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1100:1: ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            case 24:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1101:1: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1101:1: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1102:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2286);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1107:6: ( ruleApplicationMinSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1107:6: ( ruleApplicationMinSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1108:1: ruleApplicationMinSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2303);
                    ruleApplicationMinSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1113:6: ( ruleApplicationTargetSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1113:6: ( ruleApplicationTargetSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1114:1: ruleApplicationTargetSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2320);
                    ruleApplicationTargetSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1119:6: ( ruleApplicationCompileSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1119:6: ( ruleApplicationCompileSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1120:1: ruleApplicationCompileSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2337);
                    ruleApplicationCompileSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1125:6: ( ruleApplicationPermissionList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1125:6: ( ruleApplicationPermissionList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1126:1: ruleApplicationPermissionList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2354);
                    ruleApplicationPermissionList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1131:6: ( ruleApplicationElementList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1131:6: ( ruleApplicationElementList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1132:1: ruleApplicationElementList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2371);
                    ruleApplicationElementList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1137:6: ( ruleApplicationMainActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1137:6: ( ruleApplicationMainActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1138:1: ruleApplicationMainActivity
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2388);
                    ruleApplicationMainActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAttribute__Alternatives"


    // $ANTLR start "rule__ApplicationElement__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1148:1: rule__ApplicationElement__Alternatives : ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1152:1: ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1153:1: ( ruleActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1153:1: ( ruleActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1154:1: ruleActivity
                    {
                     before(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2420);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1159:6: ( ruleBroadcastReceiver )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1159:6: ( ruleBroadcastReceiver )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1160:1: ruleBroadcastReceiver
                    {
                     before(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2437);
                    ruleBroadcastReceiver();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1165:6: ( ruleService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1165:6: ( ruleService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1166:1: ruleService
                    {
                     before(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2454);
                    ruleService();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElement__Alternatives"


    // $ANTLR start "rule__ActivityAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1176:1: rule__ActivityAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) );
    public final void rule__ActivityAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1180:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1181:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1181:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1182:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2486);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1188:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2503);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1194:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2520);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1200:1: ruleElementIntentList
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2537);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleActivityParentAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleActivityParentAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1206:1: ruleActivityParentAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2554);
                    ruleActivityParentAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleActivityLayoutAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleActivityLayoutAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1212:1: ruleActivityLayoutAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2571);
                    ruleActivityLayoutAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityAttribute__Alternatives"


    // $ANTLR start "rule__BroadcastReceiverAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1222:1: rule__BroadcastReceiverAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) );
    public final void rule__BroadcastReceiverAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1226:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1227:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1227:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1228:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2603);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1233:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1233:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1234:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2620);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1240:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2637);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1246:1: ruleElementIntentList
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2654);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleBroadcastReceiverActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleBroadcastReceiverActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1252:1: ruleBroadcastReceiverActionAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2671);
                    ruleBroadcastReceiverActionAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverAttribute__Alternatives"


    // $ANTLR start "rule__ServiceAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1262:1: rule__ServiceAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) );
    public final void rule__ServiceAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1266:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1268:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2703);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1274:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2720);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1280:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2737);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1286:1: ruleElementIntentList
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2754);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceAttribute__Alternatives"


    // $ANTLR start "rule__ButtonAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1296:1: rule__ButtonAttribute__Alternatives : ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) );
    public final void rule__ButtonAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1300:1: ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1301:1: ( ruleButtonLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1301:1: ( ruleButtonLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1302:1: ruleButtonLabelAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2786);
                    ruleButtonLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1307:6: ( ruleButtonActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1307:6: ( ruleButtonActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1308:1: ruleButtonActionAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2803);
                    ruleButtonActionAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonAttribute__Alternatives"


    // $ANTLR start "rule__LayoutElementClickAction__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1318:1: rule__LayoutElementClickAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__LayoutElementClickAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1322:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1323:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1323:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1324:1: ruleActionShowToast
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2835);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1329:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1329:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1330:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2852);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1335:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1335:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1336:1: ruleActionStartService
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2869);
                    ruleActionStartService();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutElementClickAction__Alternatives"


    // $ANTLR start "rule__BroadcastReceiverAction__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1346:1: rule__BroadcastReceiverAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__BroadcastReceiverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1350:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1351:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1351:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1352:1: ruleActionShowToast
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2901);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1357:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1357:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1358:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2918);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1363:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1363:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1364:1: ruleActionStartService
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives2935);
                    ruleActionStartService();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverAction__Alternatives"


    // $ANTLR start "rule__AndroidAppProject__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1376:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1380:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1381:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__02965);
            rule__AndroidAppProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__02968);
            rule__AndroidAppProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__0"


    // $ANTLR start "rule__AndroidAppProject__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1388:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1392:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1393:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1393:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1394:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1395:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1395:2: rule__AndroidAppProject__ApplicationsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl2995);
            rule__AndroidAppProject__ApplicationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1405:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1409:1: ( rule__AndroidAppProject__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1410:2: rule__AndroidAppProject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13025);
            rule__AndroidAppProject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__1"


    // $ANTLR start "rule__AndroidAppProject__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1416:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1420:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1422:1: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:1: ( rule__AndroidAppProject__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:2: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3052);
            	    rule__AndroidAppProject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1437:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1441:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1442:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03087);
            rule__AndroidAppProject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03090);
            rule__AndroidAppProject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__0"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1449:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1453:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1454:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1454:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1455:1: ','
            {
             before(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__AndroidAppProject__Group_1__0__Impl3118); 
             after(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1468:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1472:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1473:2: rule__AndroidAppProject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13149);
            rule__AndroidAppProject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__1"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1479:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1483:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1484:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1484:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1485:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1486:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1486:2: rule__AndroidAppProject__ApplicationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3176);
            rule__AndroidAppProject__ApplicationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__1__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1500:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1504:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1505:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03210);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03213);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1512:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1516:1: ( ( 'application' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1517:1: ( 'application' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1517:1: ( 'application' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1518:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group__0__Impl3241); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1531:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1535:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1536:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13272);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13275);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1543:1: rule__Application__Group__1__Impl : ( ( rule__Application__PackageNameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1547:1: ( ( ( rule__Application__PackageNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1548:1: ( ( rule__Application__PackageNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1548:1: ( ( rule__Application__PackageNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1549:1: ( rule__Application__PackageNameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1550:1: ( rule__Application__PackageNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1550:2: rule__Application__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__PackageNameAssignment_1_in_rule__Application__Group__1__Impl3302);
            rule__Application__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPackageNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1560:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1564:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1565:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23332);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23335);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1572:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1576:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1577:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1577:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1578:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__2__Impl3363); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1591:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1595:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1596:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33394);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33397);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1603:1: rule__Application__Group__3__Impl : ( ( rule__Application__AttributesAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1607:1: ( ( ( rule__Application__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1608:1: ( ( rule__Application__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1608:1: ( ( rule__Application__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1609:1: ( rule__Application__AttributesAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1610:1: ( rule__Application__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1610:2: rule__Application__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3424);
            rule__Application__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1620:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1624:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1625:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43454);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43457);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1632:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1636:1: ( ( ( rule__Application__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1637:1: ( ( rule__Application__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1637:1: ( ( rule__Application__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1638:1: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1639:1: ( rule__Application__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1639:2: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3484);
            	    rule__Application__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1649:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1653:1: ( rule__Application__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1654:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53515);
            rule__Application__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1660:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1664:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1665:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1665:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1666:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group__5__Impl3543); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1691:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1695:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1696:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03586);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03589);
            rule__Application__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0"


    // $ANTLR start "rule__Application__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1703:1: rule__Application__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1707:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1708:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1708:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1709:1: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__Application__Group_4__0__Impl3617); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0__Impl"


    // $ANTLR start "rule__Application__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1722:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1726:1: ( rule__Application__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1727:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13648);
            rule__Application__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1"


    // $ANTLR start "rule__Application__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1733:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__AttributesAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1737:1: ( ( ( rule__Application__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1738:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1738:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1739:1: ( rule__Application__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1740:1: ( rule__Application__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1740:2: rule__Application__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3675);
            rule__Application__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1__Impl"


    // $ANTLR start "rule__PackageName__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1754:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1758:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1759:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03709);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03712);
            rule__PackageName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__0"


    // $ANTLR start "rule__PackageName__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1766:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1770:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1771:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1771:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1772:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl3739); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__0__Impl"


    // $ANTLR start "rule__PackageName__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1783:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1787:1: ( rule__PackageName__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1788:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13768);
            rule__PackageName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__1"


    // $ANTLR start "rule__PackageName__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1794:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1798:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1799:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1799:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1800:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1801:1: ( rule__PackageName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1801:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3795);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackageNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__1__Impl"


    // $ANTLR start "rule__PackageName__Group_1__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1815:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1819:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1820:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03830);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03833);
            rule__PackageName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__0"


    // $ANTLR start "rule__PackageName__Group_1__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1827:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1831:1: ( ( '.' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1832:1: ( '.' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1832:1: ( '.' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1833:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__PackageName__Group_1__0__Impl3861); 
             after(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__0__Impl"


    // $ANTLR start "rule__PackageName__Group_1__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1846:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1850:1: ( rule__PackageName__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1851:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13892);
            rule__PackageName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__1"


    // $ANTLR start "rule__PackageName__Group_1__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1857:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1861:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1862:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1862:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1863:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl3919); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__1__Impl"


    // $ANTLR start "rule__ApplicationMinSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1878:1: rule__ApplicationMinSdk__Group__0 : rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 ;
    public final void rule__ApplicationMinSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1882:1: ( rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1883:2: rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__03952);
            rule__ApplicationMinSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__03955);
            rule__ApplicationMinSdk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMinSdk__Group__0"


    // $ANTLR start "rule__ApplicationMinSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1890:1: rule__ApplicationMinSdk__Group__0__Impl : ( 'min-sdk' ) ;
    public final void rule__ApplicationMinSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1894:1: ( ( 'min-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1895:1: ( 'min-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1895:1: ( 'min-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1896:1: 'min-sdk'
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ApplicationMinSdk__Group__0__Impl3983); 
             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMinSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationMinSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1909:1: rule__ApplicationMinSdk__Group__1 : rule__ApplicationMinSdk__Group__1__Impl ;
    public final void rule__ApplicationMinSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1913:1: ( rule__ApplicationMinSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1914:2: rule__ApplicationMinSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14014);
            rule__ApplicationMinSdk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMinSdk__Group__1"


    // $ANTLR start "rule__ApplicationMinSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1920:1: rule__ApplicationMinSdk__Group__1__Impl : ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) ;
    public final void rule__ApplicationMinSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1924:1: ( ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1925:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1925:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1926:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1927:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1927:2: rule__ApplicationMinSdk__MinSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4041);
            rule__ApplicationMinSdk__MinSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMinSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1941:1: rule__ApplicationTargetSdk__Group__0 : rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 ;
    public final void rule__ApplicationTargetSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1945:1: ( rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1946:2: rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04075);
            rule__ApplicationTargetSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04078);
            rule__ApplicationTargetSdk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationTargetSdk__Group__0"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1953:1: rule__ApplicationTargetSdk__Group__0__Impl : ( 'target-sdk' ) ;
    public final void rule__ApplicationTargetSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1957:1: ( ( 'target-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1958:1: ( 'target-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1958:1: ( 'target-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1959:1: 'target-sdk'
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ApplicationTargetSdk__Group__0__Impl4106); 
             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationTargetSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1972:1: rule__ApplicationTargetSdk__Group__1 : rule__ApplicationTargetSdk__Group__1__Impl ;
    public final void rule__ApplicationTargetSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1976:1: ( rule__ApplicationTargetSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1977:2: rule__ApplicationTargetSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14137);
            rule__ApplicationTargetSdk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationTargetSdk__Group__1"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1983:1: rule__ApplicationTargetSdk__Group__1__Impl : ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) ;
    public final void rule__ApplicationTargetSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1987:1: ( ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1988:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1988:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1989:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1990:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1990:2: rule__ApplicationTargetSdk__TargetSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4164);
            rule__ApplicationTargetSdk__TargetSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationTargetSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2004:1: rule__ApplicationCompileSdk__Group__0 : rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 ;
    public final void rule__ApplicationCompileSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2008:1: ( rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2009:2: rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04198);
            rule__ApplicationCompileSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04201);
            rule__ApplicationCompileSdk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationCompileSdk__Group__0"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2016:1: rule__ApplicationCompileSdk__Group__0__Impl : ( 'compile-sdk' ) ;
    public final void rule__ApplicationCompileSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2020:1: ( ( 'compile-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2021:1: ( 'compile-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2021:1: ( 'compile-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2022:1: 'compile-sdk'
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ApplicationCompileSdk__Group__0__Impl4229); 
             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationCompileSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2035:1: rule__ApplicationCompileSdk__Group__1 : rule__ApplicationCompileSdk__Group__1__Impl ;
    public final void rule__ApplicationCompileSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2039:1: ( rule__ApplicationCompileSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2040:2: rule__ApplicationCompileSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14260);
            rule__ApplicationCompileSdk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationCompileSdk__Group__1"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2046:1: rule__ApplicationCompileSdk__Group__1__Impl : ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) ;
    public final void rule__ApplicationCompileSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2050:1: ( ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2051:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2051:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2052:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2053:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2053:2: rule__ApplicationCompileSdk__CompileSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4287);
            rule__ApplicationCompileSdk__CompileSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationCompileSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2067:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2071:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2072:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04321);
            rule__ApplicationPermissionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04324);
            rule__ApplicationPermissionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2079:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2083:1: ( ( 'permissions' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2084:1: ( 'permissions' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2084:1: ( 'permissions' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2085:1: 'permissions'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ApplicationPermissionList__Group__0__Impl4352); 
             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2098:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2102:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2103:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14383);
            rule__ApplicationPermissionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14386);
            rule__ApplicationPermissionList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2110:1: rule__ApplicationPermissionList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2114:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2115:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2115:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2116:1: '['
            {
             before(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationPermissionList__Group__1__Impl4414); 
             after(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2129:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2133:1: ( rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2134:2: rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24445);
            rule__ApplicationPermissionList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24448);
            rule__ApplicationPermissionList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__2"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2141:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2145:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2146:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2146:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2147:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2148:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2148:2: rule__ApplicationPermissionList__PermissionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4475);
            rule__ApplicationPermissionList__PermissionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2158:1: rule__ApplicationPermissionList__Group__3 : rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 ;
    public final void rule__ApplicationPermissionList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2162:1: ( rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2163:2: rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34505);
            rule__ApplicationPermissionList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34508);
            rule__ApplicationPermissionList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__3"


    // $ANTLR start "rule__ApplicationPermissionList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2170:1: rule__ApplicationPermissionList__Group__3__Impl : ( ( rule__ApplicationPermissionList__Group_3__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2174:1: ( ( ( rule__ApplicationPermissionList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2175:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2175:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2176:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2177:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2177:2: rule__ApplicationPermissionList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4535);
            	    rule__ApplicationPermissionList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__3__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2187:1: rule__ApplicationPermissionList__Group__4 : rule__ApplicationPermissionList__Group__4__Impl ;
    public final void rule__ApplicationPermissionList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2191:1: ( rule__ApplicationPermissionList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2192:2: rule__ApplicationPermissionList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44566);
            rule__ApplicationPermissionList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__4"


    // $ANTLR start "rule__ApplicationPermissionList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2198:1: rule__ApplicationPermissionList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationPermissionList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2202:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2203:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2203:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2204:1: ']'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationPermissionList__Group__4__Impl4594); 
             after(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__4__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2227:1: rule__ApplicationPermissionList__Group_3__0 : rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 ;
    public final void rule__ApplicationPermissionList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2231:1: ( rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2232:2: rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04635);
            rule__ApplicationPermissionList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04638);
            rule__ApplicationPermissionList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2239:1: rule__ApplicationPermissionList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2243:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2244:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2244:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2245:1: ','
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__ApplicationPermissionList__Group_3__0__Impl4666); 
             after(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2258:1: rule__ApplicationPermissionList__Group_3__1 : rule__ApplicationPermissionList__Group_3__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2262:1: ( rule__ApplicationPermissionList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2263:2: rule__ApplicationPermissionList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14697);
            rule__ApplicationPermissionList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2269:1: rule__ApplicationPermissionList__Group_3__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2273:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2274:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2274:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2275:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2276:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2276:2: rule__ApplicationPermissionList__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4724);
            rule__ApplicationPermissionList__PermissionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2290:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2294:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2295:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04758);
            rule__ApplicationElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04761);
            rule__ApplicationElementList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__0"


    // $ANTLR start "rule__ApplicationElementList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2302:1: rule__ApplicationElementList__Group__0__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2306:1: ( ( 'elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2307:1: ( 'elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2307:1: ( 'elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2308:1: 'elements'
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationElementList__Group__0__Impl4789); 
             after(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2321:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2325:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2326:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__14820);
            rule__ApplicationElementList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__14823);
            rule__ApplicationElementList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__1"


    // $ANTLR start "rule__ApplicationElementList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2333:1: rule__ApplicationElementList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2337:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2338:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2338:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2339:1: '['
            {
             before(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationElementList__Group__1__Impl4851); 
             after(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2352:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2356:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2357:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__24882);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__24885);
            rule__ApplicationElementList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__2"


    // $ANTLR start "rule__ApplicationElementList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2364:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2368:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2369:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2369:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2370:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2371:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2371:2: rule__ApplicationElementList__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl4912);
            rule__ApplicationElementList__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2381:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2385:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2386:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__34942);
            rule__ApplicationElementList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__34945);
            rule__ApplicationElementList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__3"


    // $ANTLR start "rule__ApplicationElementList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2393:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__Group_3__0 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2397:1: ( ( ( rule__ApplicationElementList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2398:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2398:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2399:1: ( rule__ApplicationElementList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2400:1: ( rule__ApplicationElementList__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2400:2: rule__ApplicationElementList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl4972);
            	    rule__ApplicationElementList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApplicationElementListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__3__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2410:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2414:1: ( rule__ApplicationElementList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2415:2: rule__ApplicationElementList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45003);
            rule__ApplicationElementList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__4"


    // $ANTLR start "rule__ApplicationElementList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2421:1: rule__ApplicationElementList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2425:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2426:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2426:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2427:1: ']'
            {
             before(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationElementList__Group__4__Impl5031); 
             after(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__4__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2450:1: rule__ApplicationElementList__Group_3__0 : rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 ;
    public final void rule__ApplicationElementList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2454:1: ( rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2455:2: rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05072);
            rule__ApplicationElementList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05075);
            rule__ApplicationElementList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group_3__0"


    // $ANTLR start "rule__ApplicationElementList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2462:1: rule__ApplicationElementList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationElementList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2466:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2467:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2467:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2468:1: ','
            {
             before(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__ApplicationElementList__Group_3__0__Impl5103); 
             after(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2481:1: rule__ApplicationElementList__Group_3__1 : rule__ApplicationElementList__Group_3__1__Impl ;
    public final void rule__ApplicationElementList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2485:1: ( rule__ApplicationElementList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2486:2: rule__ApplicationElementList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15134);
            rule__ApplicationElementList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group_3__1"


    // $ANTLR start "rule__ApplicationElementList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2492:1: rule__ApplicationElementList__Group_3__1__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) ;
    public final void rule__ApplicationElementList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2496:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2497:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2497:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2498:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2499:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2499:2: rule__ApplicationElementList__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5161);
            rule__ApplicationElementList__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationMainActivity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2513:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2517:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2518:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05195);
            rule__ApplicationMainActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05198);
            rule__ApplicationMainActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__0"


    // $ANTLR start "rule__ApplicationMainActivity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2525:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2529:1: ( ( 'main-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2530:1: ( 'main-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2530:1: ( 'main-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2531:1: 'main-activity'
            {
             before(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationMainActivity__Group__0__Impl5226); 
             after(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__0__Impl"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2544:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2548:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2549:2: rule__ApplicationMainActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15257);
            rule__ApplicationMainActivity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__1"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2555:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2559:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2560:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2560:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2561:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2562:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2562:2: rule__ApplicationMainActivity__LauncherActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5284);
            rule__ApplicationMainActivity__LauncherActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2576:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2580:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2581:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05318);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05321);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2588:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2592:1: ( ( 'activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2593:1: ( 'activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2593:1: ( 'activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2594:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group__0__Impl5349); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2607:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2611:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2612:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15380);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15383);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2619:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__ClassNameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2623:1: ( ( ( rule__Activity__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2624:1: ( ( rule__Activity__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2624:1: ( ( rule__Activity__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2625:1: ( rule__Activity__ClassNameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2626:1: ( rule__Activity__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2626:2: rule__Activity__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__ClassNameAssignment_1_in_rule__Activity__Group__1__Impl5410);
            rule__Activity__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2636:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2640:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2641:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25440);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25443);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2648:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2652:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2653:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2653:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2654:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Activity__Group__2__Impl5471); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2667:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2671:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2672:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35502);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35505);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2679:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__AttributesAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2683:1: ( ( ( rule__Activity__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2684:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2684:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2685:1: ( rule__Activity__AttributesAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2686:1: ( rule__Activity__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2686:2: rule__Activity__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5532);
            rule__Activity__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2696:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2700:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2701:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45562);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45565);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2708:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2712:1: ( ( ( rule__Activity__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2713:1: ( ( rule__Activity__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2713:1: ( ( rule__Activity__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2714:1: ( rule__Activity__Group_4__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2715:1: ( rule__Activity__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2715:2: rule__Activity__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5592);
            	    rule__Activity__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2725:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2729:1: ( rule__Activity__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2730:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55623);
            rule__Activity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2736:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2740:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2741:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2741:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2742:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Activity__Group__5__Impl5651); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2767:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2771:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2772:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05694);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05697);
            rule__Activity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2779:1: rule__Activity__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2783:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2785:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__Activity__Group_4__0__Impl5725); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2798:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2802:1: ( rule__Activity__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2803:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15756);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2809:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__AttributesAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2813:1: ( ( ( rule__Activity__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2814:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2814:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2815:1: ( rule__Activity__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2816:1: ( rule__Activity__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2816:2: rule__Activity__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5783);
            rule__Activity__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2830:1: rule__BroadcastReceiver__Group__0 : rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 ;
    public final void rule__BroadcastReceiver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2834:1: ( rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2835:2: rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__05817);
            rule__BroadcastReceiver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__05820);
            rule__BroadcastReceiver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__0"


    // $ANTLR start "rule__BroadcastReceiver__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2842:1: rule__BroadcastReceiver__Group__0__Impl : ( 'receiver' ) ;
    public final void rule__BroadcastReceiver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2846:1: ( ( 'receiver' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2847:1: ( 'receiver' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2847:1: ( 'receiver' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2848:1: 'receiver'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__BroadcastReceiver__Group__0__Impl5848); 
             after(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__0__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2861:1: rule__BroadcastReceiver__Group__1 : rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 ;
    public final void rule__BroadcastReceiver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2865:1: ( rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2866:2: rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__15879);
            rule__BroadcastReceiver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__15882);
            rule__BroadcastReceiver__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__1"


    // $ANTLR start "rule__BroadcastReceiver__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2873:1: rule__BroadcastReceiver__Group__1__Impl : ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) ) ;
    public final void rule__BroadcastReceiver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2877:1: ( ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2878:1: ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2878:1: ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2879:1: ( rule__BroadcastReceiver__ClassNameAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2880:1: ( rule__BroadcastReceiver__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2880:2: rule__BroadcastReceiver__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__ClassNameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl5909);
            rule__BroadcastReceiver__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__1__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2890:1: rule__BroadcastReceiver__Group__2 : rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 ;
    public final void rule__BroadcastReceiver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2894:1: ( rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2895:2: rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__25939);
            rule__BroadcastReceiver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__25942);
            rule__BroadcastReceiver__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__2"


    // $ANTLR start "rule__BroadcastReceiver__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2902:1: rule__BroadcastReceiver__Group__2__Impl : ( '{' ) ;
    public final void rule__BroadcastReceiver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2906:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2907:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2907:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2908:1: '{'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__BroadcastReceiver__Group__2__Impl5970); 
             after(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__2__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2921:1: rule__BroadcastReceiver__Group__3 : rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 ;
    public final void rule__BroadcastReceiver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2925:1: ( rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2926:2: rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36001);
            rule__BroadcastReceiver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36004);
            rule__BroadcastReceiver__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__3"


    // $ANTLR start "rule__BroadcastReceiver__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2933:1: rule__BroadcastReceiver__Group__3__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) ;
    public final void rule__BroadcastReceiver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2937:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2938:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2938:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2939:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2940:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2940:2: rule__BroadcastReceiver__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6031);
            rule__BroadcastReceiver__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__3__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2950:1: rule__BroadcastReceiver__Group__4 : rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 ;
    public final void rule__BroadcastReceiver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2954:1: ( rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2955:2: rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46061);
            rule__BroadcastReceiver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46064);
            rule__BroadcastReceiver__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__4"


    // $ANTLR start "rule__BroadcastReceiver__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2962:1: rule__BroadcastReceiver__Group__4__Impl : ( ( rule__BroadcastReceiver__Group_4__0 )* ) ;
    public final void rule__BroadcastReceiver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2966:1: ( ( ( rule__BroadcastReceiver__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2967:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2967:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2968:1: ( rule__BroadcastReceiver__Group_4__0 )*
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2969:1: ( rule__BroadcastReceiver__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2969:2: rule__BroadcastReceiver__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6091);
            	    rule__BroadcastReceiver__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__4__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2979:1: rule__BroadcastReceiver__Group__5 : rule__BroadcastReceiver__Group__5__Impl ;
    public final void rule__BroadcastReceiver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2983:1: ( rule__BroadcastReceiver__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2984:2: rule__BroadcastReceiver__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56122);
            rule__BroadcastReceiver__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__5"


    // $ANTLR start "rule__BroadcastReceiver__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2990:1: rule__BroadcastReceiver__Group__5__Impl : ( '}' ) ;
    public final void rule__BroadcastReceiver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2994:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2995:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2995:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2996:1: '}'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__BroadcastReceiver__Group__5__Impl6150); 
             after(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group__5__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3021:1: rule__BroadcastReceiver__Group_4__0 : rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 ;
    public final void rule__BroadcastReceiver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3025:1: ( rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3026:2: rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06193);
            rule__BroadcastReceiver__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06196);
            rule__BroadcastReceiver__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group_4__0"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3033:1: rule__BroadcastReceiver__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BroadcastReceiver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3037:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3039:1: ','
            {
             before(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__BroadcastReceiver__Group_4__0__Impl6224); 
             after(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group_4__0__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3052:1: rule__BroadcastReceiver__Group_4__1 : rule__BroadcastReceiver__Group_4__1__Impl ;
    public final void rule__BroadcastReceiver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3056:1: ( rule__BroadcastReceiver__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3057:2: rule__BroadcastReceiver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16255);
            rule__BroadcastReceiver__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group_4__1"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3063:1: rule__BroadcastReceiver__Group_4__1__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) ;
    public final void rule__BroadcastReceiver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3067:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3068:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3068:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3069:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3070:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3070:2: rule__BroadcastReceiver__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6282);
            rule__BroadcastReceiver__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3084:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3088:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3089:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06316);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06319);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3096:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3100:1: ( ( 'service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3101:1: ( 'service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3101:1: ( 'service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3102:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Service__Group__0__Impl6347); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3115:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3119:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3120:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16378);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16381);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3127:1: rule__Service__Group__1__Impl : ( ( rule__Service__ClassNameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3131:1: ( ( ( rule__Service__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3132:1: ( ( rule__Service__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3132:1: ( ( rule__Service__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3133:1: ( rule__Service__ClassNameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3134:1: ( rule__Service__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3134:2: rule__Service__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__ClassNameAssignment_1_in_rule__Service__Group__1__Impl6408);
            rule__Service__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3144:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3148:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3149:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26438);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26441);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3156:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3160:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3161:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3161:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3162:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Service__Group__2__Impl6469); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3175:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3179:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3180:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36500);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36503);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3187:1: rule__Service__Group__3__Impl : ( ( rule__Service__AttributesAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3191:1: ( ( ( rule__Service__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3192:1: ( ( rule__Service__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3192:1: ( ( rule__Service__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3193:1: ( rule__Service__AttributesAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3194:1: ( rule__Service__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3194:2: rule__Service__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6530);
            rule__Service__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3204:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3208:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3209:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46560);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46563);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3216:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3220:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3221:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3221:1: ( ( rule__Service__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3222:1: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3223:1: ( rule__Service__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3223:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6590);
            	    rule__Service__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3233:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3237:1: ( rule__Service__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3238:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56621);
            rule__Service__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3244:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3248:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3249:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3249:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3250:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Service__Group__5__Impl6649); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3275:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3279:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3280:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06692);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06695);
            rule__Service__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3287:1: rule__Service__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3291:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3292:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3292:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3293:1: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__Service__Group_4__0__Impl6723); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3306:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3310:1: ( rule__Service__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3311:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16754);
            rule__Service__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3317:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__AttributesAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3321:1: ( ( ( rule__Service__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3322:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3322:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3323:1: ( rule__Service__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3324:1: ( rule__Service__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3324:2: rule__Service__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6781);
            rule__Service__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3338:1: rule__ElementEnabledAttribute__Group__0 : rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 ;
    public final void rule__ElementEnabledAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3342:1: ( rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3343:2: rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__06815);
            rule__ElementEnabledAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__06818);
            rule__ElementEnabledAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementEnabledAttribute__Group__0"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3350:1: rule__ElementEnabledAttribute__Group__0__Impl : ( 'enabled' ) ;
    public final void rule__ElementEnabledAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3354:1: ( ( 'enabled' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3355:1: ( 'enabled' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3355:1: ( 'enabled' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3356:1: 'enabled'
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ElementEnabledAttribute__Group__0__Impl6846); 
             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementEnabledAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3369:1: rule__ElementEnabledAttribute__Group__1 : rule__ElementEnabledAttribute__Group__1__Impl ;
    public final void rule__ElementEnabledAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3373:1: ( rule__ElementEnabledAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3374:2: rule__ElementEnabledAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__16877);
            rule__ElementEnabledAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementEnabledAttribute__Group__1"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3380:1: rule__ElementEnabledAttribute__Group__1__Impl : ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) ;
    public final void rule__ElementEnabledAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3384:1: ( ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3385:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3385:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3386:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3387:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3387:2: rule__ElementEnabledAttribute__EnabledAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl6904);
            rule__ElementEnabledAttribute__EnabledAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementEnabledAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementExportedAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3401:1: rule__ElementExportedAttribute__Group__0 : rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 ;
    public final void rule__ElementExportedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3405:1: ( rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3406:2: rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__06938);
            rule__ElementExportedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__06941);
            rule__ElementExportedAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementExportedAttribute__Group__0"


    // $ANTLR start "rule__ElementExportedAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3413:1: rule__ElementExportedAttribute__Group__0__Impl : ( 'exported' ) ;
    public final void rule__ElementExportedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3417:1: ( ( 'exported' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3418:1: ( 'exported' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3418:1: ( 'exported' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3419:1: 'exported'
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ElementExportedAttribute__Group__0__Impl6969); 
             after(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementExportedAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementExportedAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3432:1: rule__ElementExportedAttribute__Group__1 : rule__ElementExportedAttribute__Group__1__Impl ;
    public final void rule__ElementExportedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3436:1: ( rule__ElementExportedAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3437:2: rule__ElementExportedAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17000);
            rule__ElementExportedAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementExportedAttribute__Group__1"


    // $ANTLR start "rule__ElementExportedAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3443:1: rule__ElementExportedAttribute__Group__1__Impl : ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) ;
    public final void rule__ElementExportedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3447:1: ( ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3448:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3448:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3449:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3450:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3450:2: rule__ElementExportedAttribute__ExportedAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7027);
            rule__ElementExportedAttribute__ExportedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementExportedAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementLabelAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3464:1: rule__ElementLabelAttribute__Group__0 : rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 ;
    public final void rule__ElementLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3468:1: ( rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3469:2: rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07061);
            rule__ElementLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07064);
            rule__ElementLabelAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLabelAttribute__Group__0"


    // $ANTLR start "rule__ElementLabelAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3476:1: rule__ElementLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ElementLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3480:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3481:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3481:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3482:1: 'title'
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementLabelAttribute__Group__0__Impl7092); 
             after(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLabelAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementLabelAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3495:1: rule__ElementLabelAttribute__Group__1 : rule__ElementLabelAttribute__Group__1__Impl ;
    public final void rule__ElementLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3499:1: ( rule__ElementLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3500:2: rule__ElementLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17123);
            rule__ElementLabelAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLabelAttribute__Group__1"


    // $ANTLR start "rule__ElementLabelAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3506:1: rule__ElementLabelAttribute__Group__1__Impl : ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ElementLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3510:1: ( ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3511:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3511:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3512:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3513:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3513:2: rule__ElementLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7150);
            rule__ElementLabelAttribute__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLabelAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3527:1: rule__ElementIntentList__Group__0 : rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 ;
    public final void rule__ElementIntentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3531:1: ( rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3532:2: rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07184);
            rule__ElementIntentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07187);
            rule__ElementIntentList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__0"


    // $ANTLR start "rule__ElementIntentList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3539:1: rule__ElementIntentList__Group__0__Impl : ( 'intents' ) ;
    public final void rule__ElementIntentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3543:1: ( ( 'intents' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3544:1: ( 'intents' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3544:1: ( 'intents' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3545:1: 'intents'
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ElementIntentList__Group__0__Impl7215); 
             after(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__0__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3558:1: rule__ElementIntentList__Group__1 : rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 ;
    public final void rule__ElementIntentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3562:1: ( rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3563:2: rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17246);
            rule__ElementIntentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17249);
            rule__ElementIntentList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__1"


    // $ANTLR start "rule__ElementIntentList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3570:1: rule__ElementIntentList__Group__1__Impl : ( '[' ) ;
    public final void rule__ElementIntentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3574:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3575:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3575:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3576:1: '['
            {
             before(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ElementIntentList__Group__1__Impl7277); 
             after(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__1__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3589:1: rule__ElementIntentList__Group__2 : rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 ;
    public final void rule__ElementIntentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3593:1: ( rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3594:2: rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27308);
            rule__ElementIntentList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27311);
            rule__ElementIntentList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__2"


    // $ANTLR start "rule__ElementIntentList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3601:1: rule__ElementIntentList__Group__2__Impl : ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) ;
    public final void rule__ElementIntentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3605:1: ( ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3606:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3606:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3607:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3608:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3608:2: rule__ElementIntentList__IntentsAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7338);
            rule__ElementIntentList__IntentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__2__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3618:1: rule__ElementIntentList__Group__3 : rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 ;
    public final void rule__ElementIntentList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3622:1: ( rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3623:2: rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37368);
            rule__ElementIntentList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37371);
            rule__ElementIntentList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__3"


    // $ANTLR start "rule__ElementIntentList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3630:1: rule__ElementIntentList__Group__3__Impl : ( ( rule__ElementIntentList__Group_3__0 )* ) ;
    public final void rule__ElementIntentList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3634:1: ( ( ( rule__ElementIntentList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3635:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3635:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3636:1: ( rule__ElementIntentList__Group_3__0 )*
            {
             before(grammarAccess.getElementIntentListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3637:1: ( rule__ElementIntentList__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3637:2: rule__ElementIntentList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7398);
            	    rule__ElementIntentList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getElementIntentListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__3__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3647:1: rule__ElementIntentList__Group__4 : rule__ElementIntentList__Group__4__Impl ;
    public final void rule__ElementIntentList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3651:1: ( rule__ElementIntentList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3652:2: rule__ElementIntentList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47429);
            rule__ElementIntentList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__4"


    // $ANTLR start "rule__ElementIntentList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3658:1: rule__ElementIntentList__Group__4__Impl : ( ']' ) ;
    public final void rule__ElementIntentList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3662:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3663:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3663:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3664:1: ']'
            {
             before(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ElementIntentList__Group__4__Impl7457); 
             after(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group__4__Impl"


    // $ANTLR start "rule__ElementIntentList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3687:1: rule__ElementIntentList__Group_3__0 : rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 ;
    public final void rule__ElementIntentList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3691:1: ( rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3692:2: rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07498);
            rule__ElementIntentList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07501);
            rule__ElementIntentList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group_3__0"


    // $ANTLR start "rule__ElementIntentList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3699:1: rule__ElementIntentList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ElementIntentList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3703:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3704:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3704:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3705:1: ','
            {
             before(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__ElementIntentList__Group_3__0__Impl7529); 
             after(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group_3__0__Impl"


    // $ANTLR start "rule__ElementIntentList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3718:1: rule__ElementIntentList__Group_3__1 : rule__ElementIntentList__Group_3__1__Impl ;
    public final void rule__ElementIntentList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3722:1: ( rule__ElementIntentList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3723:2: rule__ElementIntentList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17560);
            rule__ElementIntentList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group_3__1"


    // $ANTLR start "rule__ElementIntentList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3729:1: rule__ElementIntentList__Group_3__1__Impl : ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) ;
    public final void rule__ElementIntentList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3733:1: ( ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3734:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3734:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3735:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3736:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3736:2: rule__ElementIntentList__IntentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7587);
            rule__ElementIntentList__IntentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__Group_3__1__Impl"


    // $ANTLR start "rule__ActivityParentAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3750:1: rule__ActivityParentAttribute__Group__0 : rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 ;
    public final void rule__ActivityParentAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3754:1: ( rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3755:2: rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07621);
            rule__ActivityParentAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07624);
            rule__ActivityParentAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityParentAttribute__Group__0"


    // $ANTLR start "rule__ActivityParentAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3762:1: rule__ActivityParentAttribute__Group__0__Impl : ( 'parent' ) ;
    public final void rule__ActivityParentAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3766:1: ( ( 'parent' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3767:1: ( 'parent' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3767:1: ( 'parent' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3768:1: 'parent'
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ActivityParentAttribute__Group__0__Impl7652); 
             after(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityParentAttribute__Group__0__Impl"


    // $ANTLR start "rule__ActivityParentAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3781:1: rule__ActivityParentAttribute__Group__1 : rule__ActivityParentAttribute__Group__1__Impl ;
    public final void rule__ActivityParentAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3785:1: ( rule__ActivityParentAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3786:2: rule__ActivityParentAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17683);
            rule__ActivityParentAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityParentAttribute__Group__1"


    // $ANTLR start "rule__ActivityParentAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3792:1: rule__ActivityParentAttribute__Group__1__Impl : ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) ;
    public final void rule__ActivityParentAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3796:1: ( ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3797:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3797:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3798:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3799:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3799:2: rule__ActivityParentAttribute__ParentAssignment_1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7710);
            rule__ActivityParentAttribute__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityParentAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3813:1: rule__ActivityLayoutAttribute__Group__0 : rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 ;
    public final void rule__ActivityLayoutAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3817:1: ( rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3818:2: rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07744);
            rule__ActivityLayoutAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07747);
            rule__ActivityLayoutAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__0"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3825:1: rule__ActivityLayoutAttribute__Group__0__Impl : ( 'layout-elements' ) ;
    public final void rule__ActivityLayoutAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3829:1: ( ( 'layout-elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3830:1: ( 'layout-elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3830:1: ( 'layout-elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3831:1: 'layout-elements'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ActivityLayoutAttribute__Group__0__Impl7775); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3844:1: rule__ActivityLayoutAttribute__Group__1 : rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 ;
    public final void rule__ActivityLayoutAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3848:1: ( rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3849:2: rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__17806);
            rule__ActivityLayoutAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__17809);
            rule__ActivityLayoutAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__1"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3856:1: rule__ActivityLayoutAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__ActivityLayoutAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3860:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3861:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3861:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3862:1: '['
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ActivityLayoutAttribute__Group__1__Impl7837); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3875:1: rule__ActivityLayoutAttribute__Group__2 : rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 ;
    public final void rule__ActivityLayoutAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3879:1: ( rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3880:2: rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__27868);
            rule__ActivityLayoutAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__27871);
            rule__ActivityLayoutAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__2"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3887:1: rule__ActivityLayoutAttribute__Group__2__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3891:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3892:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3892:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3893:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3894:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3894:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl7898);
            rule__ActivityLayoutAttribute__LayoutElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__2__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3904:1: rule__ActivityLayoutAttribute__Group__3 : rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 ;
    public final void rule__ActivityLayoutAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3908:1: ( rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3909:2: rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__37928);
            rule__ActivityLayoutAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__37931);
            rule__ActivityLayoutAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__3"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3916:1: rule__ActivityLayoutAttribute__Group__3__Impl : ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) ;
    public final void rule__ActivityLayoutAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3920:1: ( ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3921:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3921:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3922:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3923:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3923:2: rule__ActivityLayoutAttribute__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl7958);
            	    rule__ActivityLayoutAttribute__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__3__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3933:1: rule__ActivityLayoutAttribute__Group__4 : rule__ActivityLayoutAttribute__Group__4__Impl ;
    public final void rule__ActivityLayoutAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3937:1: ( rule__ActivityLayoutAttribute__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3938:2: rule__ActivityLayoutAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__47989);
            rule__ActivityLayoutAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__4"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3944:1: rule__ActivityLayoutAttribute__Group__4__Impl : ( ']' ) ;
    public final void rule__ActivityLayoutAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3948:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3949:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3949:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3950:1: ']'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__4__Impl8017); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__4__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3973:1: rule__ActivityLayoutAttribute__Group_3__0 : rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 ;
    public final void rule__ActivityLayoutAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3977:1: ( rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3978:2: rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08058);
            rule__ActivityLayoutAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08061);
            rule__ActivityLayoutAttribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__0"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3985:1: rule__ActivityLayoutAttribute__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3989:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3991:1: ','
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8089); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4004:1: rule__ActivityLayoutAttribute__Group_3__1 : rule__ActivityLayoutAttribute__Group_3__1__Impl ;
    public final void rule__ActivityLayoutAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4008:1: ( rule__ActivityLayoutAttribute__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4009:2: rule__ActivityLayoutAttribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18120);
            rule__ActivityLayoutAttribute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__1"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4015:1: rule__ActivityLayoutAttribute__Group_3__1__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4019:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4020:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4020:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4021:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4022:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4022:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8147);
            rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4036:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4040:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4041:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08181);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08184);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4048:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4052:1: ( ( 'button' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4053:1: ( 'button' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4053:1: ( 'button' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4054:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Button__Group__0__Impl8212); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4067:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4071:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4072:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18243);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18246);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4079:1: rule__Button__Group__1__Impl : ( ( rule__Button__ButtonNameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4083:1: ( ( ( rule__Button__ButtonNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4084:1: ( ( rule__Button__ButtonNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4084:1: ( ( rule__Button__ButtonNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4085:1: ( rule__Button__ButtonNameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getButtonNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4086:1: ( rule__Button__ButtonNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4086:2: rule__Button__ButtonNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Button__ButtonNameAssignment_1_in_rule__Button__Group__1__Impl8273);
            rule__Button__ButtonNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getButtonNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4096:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4100:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4101:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28303);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28306);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4108:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4112:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4113:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4113:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4114:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Button__Group__2__Impl8334); 
             after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4127:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4131:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4132:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38365);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38368);
            rule__Button__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4139:1: rule__Button__Group__3__Impl : ( ( rule__Button__AttributesAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4143:1: ( ( ( rule__Button__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4144:1: ( ( rule__Button__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4144:1: ( ( rule__Button__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4145:1: ( rule__Button__AttributesAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4146:1: ( rule__Button__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4146:2: rule__Button__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8395);
            rule__Button__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4156:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4160:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4161:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48425);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48428);
            rule__Button__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4168:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )* ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4172:1: ( ( ( rule__Button__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4173:1: ( ( rule__Button__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4173:1: ( ( rule__Button__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4174:1: ( rule__Button__Group_4__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4175:1: ( rule__Button__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4175:2: rule__Button__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8455);
            	    rule__Button__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getButtonAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4185:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4189:1: ( rule__Button__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4190:2: rule__Button__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58486);
            rule__Button__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4196:1: rule__Button__Group__5__Impl : ( '}' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4200:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4201:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4201:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4202:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Button__Group__5__Impl8514); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4227:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4231:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4232:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
            {
            pushFollow(FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08557);
            rule__Button__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08560);
            rule__Button__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__0"


    // $ANTLR start "rule__Button__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4239:1: rule__Button__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4243:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4244:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4244:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4245:1: ','
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__Button__Group_4__0__Impl8588); 
             after(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__0__Impl"


    // $ANTLR start "rule__Button__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4258:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4262:1: ( rule__Button__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4263:2: rule__Button__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18619);
            rule__Button__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__1"


    // $ANTLR start "rule__Button__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4269:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__AttributesAssignment_4_1 ) ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4273:1: ( ( ( rule__Button__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4274:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4274:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4275:1: ( rule__Button__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4276:1: ( rule__Button__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4276:2: rule__Button__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8646);
            rule__Button__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__1__Impl"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4290:1: rule__ButtonLabelAttribute__Group__0 : rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 ;
    public final void rule__ButtonLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4294:1: ( rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4295:2: rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08680);
            rule__ButtonLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08683);
            rule__ButtonLabelAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonLabelAttribute__Group__0"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4302:1: rule__ButtonLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ButtonLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4306:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4307:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4307:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4308:1: 'title'
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonLabelAttribute__Group__0__Impl8711); 
             after(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonLabelAttribute__Group__0__Impl"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4321:1: rule__ButtonLabelAttribute__Group__1 : rule__ButtonLabelAttribute__Group__1__Impl ;
    public final void rule__ButtonLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4325:1: ( rule__ButtonLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4326:2: rule__ButtonLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18742);
            rule__ButtonLabelAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonLabelAttribute__Group__1"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4332:1: rule__ButtonLabelAttribute__Group__1__Impl : ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ButtonLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4336:1: ( ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4337:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4337:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4338:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4339:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4339:2: rule__ButtonLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8769);
            rule__ButtonLabelAttribute__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonLabelAttribute__Group__1__Impl"


    // $ANTLR start "rule__ButtonActionAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4353:1: rule__ButtonActionAttribute__Group__0 : rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 ;
    public final void rule__ButtonActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4357:1: ( rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4358:2: rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__08803);
            rule__ButtonActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__08806);
            rule__ButtonActionAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonActionAttribute__Group__0"


    // $ANTLR start "rule__ButtonActionAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4365:1: rule__ButtonActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__ButtonActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4369:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4370:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4370:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4371:1: 'action'
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ButtonActionAttribute__Group__0__Impl8834); 
             after(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonActionAttribute__Group__0__Impl"


    // $ANTLR start "rule__ButtonActionAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4384:1: rule__ButtonActionAttribute__Group__1 : rule__ButtonActionAttribute__Group__1__Impl ;
    public final void rule__ButtonActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4388:1: ( rule__ButtonActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4389:2: rule__ButtonActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__18865);
            rule__ButtonActionAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonActionAttribute__Group__1"


    // $ANTLR start "rule__ButtonActionAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4395:1: rule__ButtonActionAttribute__Group__1__Impl : ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__ButtonActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4399:1: ( ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4400:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4400:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4401:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4402:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4402:2: rule__ButtonActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl8892);
            rule__ButtonActionAttribute__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonActionAttribute__Group__1__Impl"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4416:1: rule__BroadcastReceiverActionAttribute__Group__0 : rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4420:1: ( rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4421:2: rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__08926);
            rule__BroadcastReceiverActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__08929);
            rule__BroadcastReceiverActionAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__0"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4428:1: rule__BroadcastReceiverActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4432:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4433:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4433:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4434:1: 'action'
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl8957); 
             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__0__Impl"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4447:1: rule__BroadcastReceiverActionAttribute__Group__1 : rule__BroadcastReceiverActionAttribute__Group__1__Impl ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4451:1: ( rule__BroadcastReceiverActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4452:2: rule__BroadcastReceiverActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__18988);
            rule__BroadcastReceiverActionAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__1"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4458:1: rule__BroadcastReceiverActionAttribute__Group__1__Impl : ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4462:1: ( ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4463:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4463:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4464:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4465:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4465:2: rule__BroadcastReceiverActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9015);
            rule__BroadcastReceiverActionAttribute__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActionShowToast__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4479:1: rule__ActionShowToast__Group__0 : rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 ;
    public final void rule__ActionShowToast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4483:1: ( rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4484:2: rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09049);
            rule__ActionShowToast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09052);
            rule__ActionShowToast__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionShowToast__Group__0"


    // $ANTLR start "rule__ActionShowToast__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4491:1: rule__ActionShowToast__Group__0__Impl : ( 'show-toast' ) ;
    public final void rule__ActionShowToast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4495:1: ( ( 'show-toast' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4496:1: ( 'show-toast' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4496:1: ( 'show-toast' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4497:1: 'show-toast'
            {
             before(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ActionShowToast__Group__0__Impl9080); 
             after(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionShowToast__Group__0__Impl"


    // $ANTLR start "rule__ActionShowToast__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4510:1: rule__ActionShowToast__Group__1 : rule__ActionShowToast__Group__1__Impl ;
    public final void rule__ActionShowToast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4514:1: ( rule__ActionShowToast__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4515:2: rule__ActionShowToast__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19111);
            rule__ActionShowToast__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionShowToast__Group__1"


    // $ANTLR start "rule__ActionShowToast__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4521:1: rule__ActionShowToast__Group__1__Impl : ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) ;
    public final void rule__ActionShowToast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4525:1: ( ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4526:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4526:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4527:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4528:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4528:2: rule__ActionShowToast__ToastTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9138);
            rule__ActionShowToast__ToastTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionShowToast__Group__1__Impl"


    // $ANTLR start "rule__ActionStartActivity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4542:1: rule__ActionStartActivity__Group__0 : rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 ;
    public final void rule__ActionStartActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4546:1: ( rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4547:2: rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09172);
            rule__ActionStartActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09175);
            rule__ActionStartActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartActivity__Group__0"


    // $ANTLR start "rule__ActionStartActivity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4554:1: rule__ActionStartActivity__Group__0__Impl : ( 'start-activity' ) ;
    public final void rule__ActionStartActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4558:1: ( ( 'start-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4559:1: ( 'start-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4559:1: ( 'start-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4560:1: 'start-activity'
            {
             before(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ActionStartActivity__Group__0__Impl9203); 
             after(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartActivity__Group__0__Impl"


    // $ANTLR start "rule__ActionStartActivity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4573:1: rule__ActionStartActivity__Group__1 : rule__ActionStartActivity__Group__1__Impl ;
    public final void rule__ActionStartActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4577:1: ( rule__ActionStartActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4578:2: rule__ActionStartActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19234);
            rule__ActionStartActivity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartActivity__Group__1"


    // $ANTLR start "rule__ActionStartActivity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4584:1: rule__ActionStartActivity__Group__1__Impl : ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) ;
    public final void rule__ActionStartActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4588:1: ( ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4589:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4589:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4590:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4591:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4591:2: rule__ActionStartActivity__ActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9261);
            rule__ActionStartActivity__ActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartActivity__Group__1__Impl"


    // $ANTLR start "rule__ActionStartService__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4605:1: rule__ActionStartService__Group__0 : rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 ;
    public final void rule__ActionStartService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4609:1: ( rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4610:2: rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09295);
            rule__ActionStartService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09298);
            rule__ActionStartService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartService__Group__0"


    // $ANTLR start "rule__ActionStartService__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4617:1: rule__ActionStartService__Group__0__Impl : ( 'start-service' ) ;
    public final void rule__ActionStartService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4621:1: ( ( 'start-service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4622:1: ( 'start-service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4622:1: ( 'start-service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4623:1: 'start-service'
            {
             before(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ActionStartService__Group__0__Impl9326); 
             after(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartService__Group__0__Impl"


    // $ANTLR start "rule__ActionStartService__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4636:1: rule__ActionStartService__Group__1 : rule__ActionStartService__Group__1__Impl ;
    public final void rule__ActionStartService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4640:1: ( rule__ActionStartService__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4641:2: rule__ActionStartService__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19357);
            rule__ActionStartService__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartService__Group__1"


    // $ANTLR start "rule__ActionStartService__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4647:1: rule__ActionStartService__Group__1__Impl : ( ( rule__ActionStartService__ServiceAssignment_1 ) ) ;
    public final void rule__ActionStartService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4651:1: ( ( ( rule__ActionStartService__ServiceAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4652:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4652:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4653:1: ( rule__ActionStartService__ServiceAssignment_1 )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4654:1: ( rule__ActionStartService__ServiceAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4654:2: rule__ActionStartService__ServiceAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9384);
            rule__ActionStartService__ServiceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartService__Group__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4669:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4673:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4674:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4674:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4675:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09423);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_0"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_1_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4684:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4688:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4689:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4689:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4690:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19454);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_1_1"


    // $ANTLR start "rule__Application__PackageNameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4699:1: rule__Application__PackageNameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Application__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4703:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4704:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4704:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4705:1: rulePackageName
            {
             before(grammarAccess.getApplicationAccess().getPackageNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Application__PackageNameAssignment_19485);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPackageNamePackageNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PackageNameAssignment_1"


    // $ANTLR start "rule__Application__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4714:1: rule__Application__AttributesAssignment_3 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4718:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4719:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4719:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4720:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39516);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__AttributesAssignment_3"


    // $ANTLR start "rule__Application__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4729:1: rule__Application__AttributesAssignment_4_1 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4733:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4734:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4734:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4735:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19547);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__AttributesAssignment_4_1"


    // $ANTLR start "rule__ApplicationMinSdk__MinSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4744:1: rule__ApplicationMinSdk__MinSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationMinSdk__MinSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4748:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4749:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4749:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4750:1: RULE_INT
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19578); 
             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMinSdk__MinSdkAssignment_1"


    // $ANTLR start "rule__ApplicationTargetSdk__TargetSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4759:1: rule__ApplicationTargetSdk__TargetSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationTargetSdk__TargetSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4763:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4764:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4764:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4765:1: RULE_INT
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19609); 
             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationTargetSdk__TargetSdkAssignment_1"


    // $ANTLR start "rule__ApplicationCompileSdk__CompileSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4774:1: rule__ApplicationCompileSdk__CompileSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationCompileSdk__CompileSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4778:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4779:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4779:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4780:1: RULE_INT
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19640); 
             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationCompileSdk__CompileSdkAssignment_1"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4789:1: rule__ApplicationPermissionList__PermissionsAssignment_2 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4793:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4794:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4794:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4795:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_29671);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_2"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4804:1: rule__ApplicationPermissionList__PermissionsAssignment_3_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4808:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4809:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4809:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4810:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_19702);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_3_1"


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4819:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4823:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4824:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4824:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4825:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_29733);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_2"


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4834:1: rule__ApplicationElementList__ElementsAssignment_3_1 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4838:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4839:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4839:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4840:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_19764);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_3_1"


    // $ANTLR start "rule__ApplicationMainActivity__LauncherActivityAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4849:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ruleClassName ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4853:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4854:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4854:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4855:1: ruleClassName
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ApplicationMainActivity__LauncherActivityAssignment_19795);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__LauncherActivityAssignment_1"


    // $ANTLR start "rule__Activity__ClassNameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4864:1: rule__Activity__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__Activity__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4868:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4869:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4869:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4870:1: ruleClassName
            {
             before(grammarAccess.getActivityAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__Activity__ClassNameAssignment_19826);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getClassNameClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ClassNameAssignment_1"


    // $ANTLR start "rule__Activity__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4879:1: rule__Activity__AttributesAssignment_3 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4883:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4884:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4884:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4885:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_39857);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AttributesAssignment_3"


    // $ANTLR start "rule__Activity__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4894:1: rule__Activity__AttributesAssignment_4_1 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4898:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4899:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4899:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4900:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_19888);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AttributesAssignment_4_1"


    // $ANTLR start "rule__BroadcastReceiver__ClassNameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4909:1: rule__BroadcastReceiver__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__BroadcastReceiver__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4913:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4914:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4914:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4915:1: ruleClassName
            {
             before(grammarAccess.getBroadcastReceiverAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__BroadcastReceiver__ClassNameAssignment_19919);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAccess().getClassNameClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__ClassNameAssignment_1"


    // $ANTLR start "rule__BroadcastReceiver__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4924:1: rule__BroadcastReceiver__AttributesAssignment_3 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4928:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4929:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4929:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4930:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_39950);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__AttributesAssignment_3"


    // $ANTLR start "rule__BroadcastReceiver__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4939:1: rule__BroadcastReceiver__AttributesAssignment_4_1 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4943:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4944:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4944:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4945:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_19981);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__AttributesAssignment_4_1"


    // $ANTLR start "rule__Service__ClassNameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4954:1: rule__Service__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__Service__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4958:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4959:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4959:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4960:1: ruleClassName
            {
             before(grammarAccess.getServiceAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__Service__ClassNameAssignment_110012);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getClassNameClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ClassNameAssignment_1"


    // $ANTLR start "rule__Service__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4969:1: rule__Service__AttributesAssignment_3 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4973:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4974:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4974:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4975:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310043);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__AttributesAssignment_3"


    // $ANTLR start "rule__Service__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4984:1: rule__Service__AttributesAssignment_4_1 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4988:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4989:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4989:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4990:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110074);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__AttributesAssignment_4_1"


    // $ANTLR start "rule__ElementEnabledAttribute__EnabledAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4999:1: rule__ElementEnabledAttribute__EnabledAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementEnabledAttribute__EnabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5003:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5004:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5004:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5005:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110105); 
             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementEnabledAttribute__EnabledAssignment_1"


    // $ANTLR start "rule__ElementExportedAttribute__ExportedAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5014:1: rule__ElementExportedAttribute__ExportedAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementExportedAttribute__ExportedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5018:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5019:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5019:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5020:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110136); 
             after(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementExportedAttribute__ExportedAssignment_1"


    // $ANTLR start "rule__ElementLabelAttribute__TitleAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5029:1: rule__ElementLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ElementLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5033:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5034:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5034:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5035:1: RULE_STRING
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110167); 
             after(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLabelAttribute__TitleAssignment_1"


    // $ANTLR start "rule__ElementIntentList__IntentsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5044:1: rule__ElementIntentList__IntentsAssignment_2 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5048:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5049:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5049:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5050:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210198);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__IntentsAssignment_2"


    // $ANTLR start "rule__ElementIntentList__IntentsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5059:1: rule__ElementIntentList__IntentsAssignment_3_1 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5063:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5064:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5064:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5065:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110229);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementIntentList__IntentsAssignment_3_1"


    // $ANTLR start "rule__ActivityParentAttribute__ParentAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5074:1: rule__ActivityParentAttribute__ParentAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActivityParentAttribute__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5078:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5079:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5079:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5080:1: ruleClassName
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActivityParentAttribute__ParentAssignment_110260);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getActivityParentAttributeAccess().getParentClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityParentAttribute__ParentAssignment_1"


    // $ANTLR start "rule__ActivityLayoutAttribute__LayoutElementsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5089:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5093:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5094:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5094:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5095:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210291);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__LayoutElementsAssignment_2"


    // $ANTLR start "rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5104:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5108:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5109:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5109:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5110:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110322);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1"


    // $ANTLR start "rule__Button__ButtonNameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5119:1: rule__Button__ButtonNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__ButtonNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5123:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5124:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5124:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5125:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getButtonNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__ButtonNameAssignment_110353); 
             after(grammarAccess.getButtonAccess().getButtonNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ButtonNameAssignment_1"


    // $ANTLR start "rule__Button__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5134:1: rule__Button__AttributesAssignment_3 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5138:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5139:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5139:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5140:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310384);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__AttributesAssignment_3"


    // $ANTLR start "rule__Button__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5149:1: rule__Button__AttributesAssignment_4_1 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5153:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5154:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5154:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5155:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110415);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__AttributesAssignment_4_1"


    // $ANTLR start "rule__ButtonLabelAttribute__TitleAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5164:1: rule__ButtonLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ButtonLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5168:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5169:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5169:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5170:1: RULE_STRING
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110446); 
             after(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonLabelAttribute__TitleAssignment_1"


    // $ANTLR start "rule__ButtonActionAttribute__ActionAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5179:1: rule__ButtonActionAttribute__ActionAssignment_1 : ( ruleLayoutElementClickAction ) ;
    public final void rule__ButtonActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5183:1: ( ( ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5184:1: ( ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5184:1: ( ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5185:1: ruleLayoutElementClickAction
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110477);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonActionAttribute__ActionAssignment_1"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__ActionAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5194:1: rule__BroadcastReceiverActionAttribute__ActionAssignment_1 : ( ruleBroadcastReceiverAction ) ;
    public final void rule__BroadcastReceiverActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5198:1: ( ( ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5199:1: ( ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5199:1: ( ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5200:1: ruleBroadcastReceiverAction
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110508);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__ActionAssignment_1"


    // $ANTLR start "rule__ActionShowToast__ToastTextAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5209:1: rule__ActionShowToast__ToastTextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionShowToast__ToastTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5213:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5214:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5214:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5215:1: RULE_STRING
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110539); 
             after(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionShowToast__ToastTextAssignment_1"


    // $ANTLR start "rule__ActionStartActivity__ActivityAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5224:1: rule__ActionStartActivity__ActivityAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActionStartActivity__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5228:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5229:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5229:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5230:1: ruleClassName
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActionStartActivity__ActivityAssignment_110570);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getActionStartActivityAccess().getActivityClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartActivity__ActivityAssignment_1"


    // $ANTLR start "rule__ActionStartService__ServiceAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5239:1: rule__ActionStartService__ServiceAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActionStartService__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5243:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5244:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5244:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5245:1: ruleClassName
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActionStartService__ServiceAssignment_110601);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getActionStartServiceAccess().getServiceClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStartService__ServiceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidAppProject68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0_in_ruleAndroidAppProject94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePermission753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleIntent1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleLayoutElement1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService2217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__02965 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3052 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AndroidAppProject__Group_1__0__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageNameAssignment_1_in_rule__Application__Group__1__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23332 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__2__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33394 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43454 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3484 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group__5__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03586 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Application__Group_4__0__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03709 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3795 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageName__Group_1__0__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__03952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__03955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ApplicationMinSdk__Group__0__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ApplicationTargetSdk__Group__0__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ApplicationCompileSdk__Group__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ApplicationPermissionList__Group__0__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationPermissionList__Group__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24445 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34505 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4535 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationPermissionList__Group__4__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ApplicationPermissionList__Group_3__0__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04758 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationElementList__Group__0__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__14820 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__14823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationElementList__Group__1__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__24882 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__24885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__34942 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__34945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl4972 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationElementList__Group__4__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05072 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ApplicationElementList__Group_3__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationMainActivity__Group__0__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group__0__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ClassNameAssignment_1_in_rule__Activity__Group__1__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25440 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Activity__Group__2__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35502 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45562 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5592 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__5__Impl5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05694 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Activity__Group_4__0__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__05817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__05820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BroadcastReceiver__Group__0__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__15879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__15882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__ClassNameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__25939 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__25942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BroadcastReceiver__Group__2__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36001 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46061 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6091 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BroadcastReceiver__Group__5__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06193 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BroadcastReceiver__Group_4__0__Impl6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Service__Group__0__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ClassNameAssignment_1_in_rule__Service__Group__1__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26438 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Service__Group__2__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36500 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46560 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6590 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Service__Group__5__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06692 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Service__Group_4__0__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__06815 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__06818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ElementEnabledAttribute__Group__0__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__16877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__06938 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__06941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ElementExportedAttribute__Group__0__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementLabelAttribute__Group__0__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07184 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ElementIntentList__Group__0__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ElementIntentList__Group__1__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27308 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37368 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7398 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementIntentList__Group__4__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ElementIntentList__Group_3__0__Impl7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ActivityParentAttribute__Group__0__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07744 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ActivityLayoutAttribute__Group__0__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__17806 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActivityLayoutAttribute__Group__1__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__27868 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__27871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__37928 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__37931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl7958 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__47989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__4__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08058 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Button__Group__0__Impl8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ButtonNameAssignment_1_in_rule__Button__Group__1__Impl8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28303 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Button__Group__2__Impl8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38365 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48425 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8455 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Button__Group__5__Impl8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08557 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Button__Group_4__0__Impl8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08680 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonLabelAttribute__Group__0__Impl8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__08803 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__08806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ButtonActionAttribute__Group__0__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__18865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__08926 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__08929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl8957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__18988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09049 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ActionShowToast__Group__0__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ActionStartActivity__Group__0__Impl9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ActionStartService__Group__0__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Application__PackageNameAssignment_19485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_29671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_19702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_29733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_19764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ApplicationMainActivity__LauncherActivityAssignment_19795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__Activity__ClassNameAssignment_19826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_39857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_19888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__BroadcastReceiver__ClassNameAssignment_19919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_39950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_19981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__Service__ClassNameAssignment_110012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActivityParentAttribute__ParentAssignment_110260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__ButtonNameAssignment_110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActionStartActivity__ActivityAssignment_110570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActionStartService__ServiceAssignment_110601 = new BitSet(new long[]{0x0000000000000002L});

}