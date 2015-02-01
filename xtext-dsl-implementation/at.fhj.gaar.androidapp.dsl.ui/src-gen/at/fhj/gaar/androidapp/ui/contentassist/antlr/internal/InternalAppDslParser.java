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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'spacer'", "','", "'application'", "'{'", "'}'", "'.'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
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


    // $ANTLR start "entryRuleJavaIdentifier"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:116:1: entryRuleJavaIdentifier : ruleJavaIdentifier EOF ;
    public final void entryRuleJavaIdentifier() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:117:1: ( ruleJavaIdentifier EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:118:1: ruleJavaIdentifier EOF
            {
             before(grammarAccess.getJavaIdentifierRule()); 
            pushFollow(FOLLOW_ruleJavaIdentifier_in_entryRuleJavaIdentifier181);
            ruleJavaIdentifier();

            state._fsp--;

             after(grammarAccess.getJavaIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaIdentifier188); 

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
    // $ANTLR end "entryRuleJavaIdentifier"


    // $ANTLR start "ruleJavaIdentifier"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:125:1: ruleJavaIdentifier : ( RULE_ID ) ;
    public final void ruleJavaIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:129:2: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:131:1: RULE_ID
            {
             before(grammarAccess.getJavaIdentifierAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaIdentifier214); 
             after(grammarAccess.getJavaIdentifierAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleJavaIdentifier"


    // $ANTLR start "entryRuleClassName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:144:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:145:1: ( ruleClassName EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:146:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName240);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName247); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:153:1: ruleClassName : ( RULE_ID ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:157:2: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:159:1: RULE_ID
            {
             before(grammarAccess.getClassNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassName273); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:172:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:173:1: ( rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:174:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName299);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName306); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:181:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:185:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__PackageName__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:187:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:1: ( rule__PackageName__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName332);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:200:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:201:1: ( ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:202:1: ruleApplicationAttribute EOF
            {
             before(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute359);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute366); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:209:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:213:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:215:1: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:1: ( rule__ApplicationAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:2: rule__ApplicationAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute392);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:228:1: entryRuleApplicationMinSdk : ruleApplicationMinSdk EOF ;
    public final void entryRuleApplicationMinSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:229:1: ( ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:230:1: ruleApplicationMinSdk EOF
            {
             before(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk419);
            ruleApplicationMinSdk();

            state._fsp--;

             after(grammarAccess.getApplicationMinSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk426); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:237:1: ruleApplicationMinSdk : ( ( rule__ApplicationMinSdk__Group__0 ) ) ;
    public final void ruleApplicationMinSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:241:2: ( ( ( rule__ApplicationMinSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:243:1: ( rule__ApplicationMinSdk__Group__0 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:1: ( rule__ApplicationMinSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:2: rule__ApplicationMinSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk452);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:256:1: entryRuleApplicationTargetSdk : ruleApplicationTargetSdk EOF ;
    public final void entryRuleApplicationTargetSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:257:1: ( ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:258:1: ruleApplicationTargetSdk EOF
            {
             before(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk479);
            ruleApplicationTargetSdk();

            state._fsp--;

             after(grammarAccess.getApplicationTargetSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk486); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:265:1: ruleApplicationTargetSdk : ( ( rule__ApplicationTargetSdk__Group__0 ) ) ;
    public final void ruleApplicationTargetSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:269:2: ( ( ( rule__ApplicationTargetSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:271:1: ( rule__ApplicationTargetSdk__Group__0 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:1: ( rule__ApplicationTargetSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:2: rule__ApplicationTargetSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk512);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:284:1: entryRuleApplicationCompileSdk : ruleApplicationCompileSdk EOF ;
    public final void entryRuleApplicationCompileSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:285:1: ( ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:286:1: ruleApplicationCompileSdk EOF
            {
             before(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk539);
            ruleApplicationCompileSdk();

            state._fsp--;

             after(grammarAccess.getApplicationCompileSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk546); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:293:1: ruleApplicationCompileSdk : ( ( rule__ApplicationCompileSdk__Group__0 ) ) ;
    public final void ruleApplicationCompileSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:297:2: ( ( ( rule__ApplicationCompileSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:299:1: ( rule__ApplicationCompileSdk__Group__0 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:1: ( rule__ApplicationCompileSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:2: rule__ApplicationCompileSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk572);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:312:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:313:1: ( ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:314:1: ruleApplicationPermissionList EOF
            {
             before(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList599);
            ruleApplicationPermissionList();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList606); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:321:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:325:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:327:1: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:1: ( rule__ApplicationPermissionList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:2: rule__ApplicationPermissionList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList632);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:340:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:341:1: ( ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:342:1: ruleApplicationElementList EOF
            {
             before(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList659);
            ruleApplicationElementList();

            state._fsp--;

             after(grammarAccess.getApplicationElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList666); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:349:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:353:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElementList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:355:1: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:1: ( rule__ApplicationElementList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:2: rule__ApplicationElementList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList692);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:368:1: entryRuleApplicationMainActivity : ruleApplicationMainActivity EOF ;
    public final void entryRuleApplicationMainActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:369:1: ( ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:370:1: ruleApplicationMainActivity EOF
            {
             before(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity719);
            ruleApplicationMainActivity();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity726); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:377:1: ruleApplicationMainActivity : ( ( rule__ApplicationMainActivity__Group__0 ) ) ;
    public final void ruleApplicationMainActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:381:2: ( ( ( rule__ApplicationMainActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:383:1: ( rule__ApplicationMainActivity__Group__0 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:1: ( rule__ApplicationMainActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:2: rule__ApplicationMainActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity752);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:396:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:397:1: ( rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:398:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission779);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission786); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:405:1: rulePermission : ( rulePackageName ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:409:2: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:411:1: rulePackageName
            {
             before(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackageName_in_rulePermission812);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:424:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:425:1: ( ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:426:1: ruleApplicationElement EOF
            {
             before(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement838);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement845); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:433:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:437:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__ApplicationElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:439:1: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:1: ( rule__ApplicationElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:2: rule__ApplicationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement871);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:452:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:453:1: ( ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:454:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity898);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity905); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:461:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:465:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__Activity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:467:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:1: ( rule__Activity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity931);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:480:1: entryRuleBroadcastReceiver : ruleBroadcastReceiver EOF ;
    public final void entryRuleBroadcastReceiver() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:481:1: ( ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:482:1: ruleBroadcastReceiver EOF
            {
             before(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver958);
            ruleBroadcastReceiver();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver965); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:489:1: ruleBroadcastReceiver : ( ( rule__BroadcastReceiver__Group__0 ) ) ;
    public final void ruleBroadcastReceiver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:493:2: ( ( ( rule__BroadcastReceiver__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:495:1: ( rule__BroadcastReceiver__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:1: ( rule__BroadcastReceiver__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:2: rule__BroadcastReceiver__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver991);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:508:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:509:1: ( ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:510:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1018);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1025); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:517:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:521:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__Service__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__Service__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:523:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:1: ( rule__Service__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService1051);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:536:1: entryRuleActivityAttribute : ruleActivityAttribute EOF ;
    public final void entryRuleActivityAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:537:1: ( ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:538:1: ruleActivityAttribute EOF
            {
             before(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute1078);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute1085); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:545:1: ruleActivityAttribute : ( ( rule__ActivityAttribute__Alternatives ) ) ;
    public final void ruleActivityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:549:2: ( ( ( rule__ActivityAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ActivityAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ActivityAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:551:1: ( rule__ActivityAttribute__Alternatives )
            {
             before(grammarAccess.getActivityAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:1: ( rule__ActivityAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:2: rule__ActivityAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute1111);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:564:1: entryRuleBroadcastReceiverAttribute : ruleBroadcastReceiverAttribute EOF ;
    public final void entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:565:1: ( ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:566:1: ruleBroadcastReceiverAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute1138);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute1145); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:573:1: ruleBroadcastReceiverAttribute : ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:577:2: ( ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:579:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:2: rule__BroadcastReceiverAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute1171);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:592:1: entryRuleServiceAttribute : ruleServiceAttribute EOF ;
    public final void entryRuleServiceAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:593:1: ( ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:594:1: ruleServiceAttribute EOF
            {
             before(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1198);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute1205); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:601:1: ruleServiceAttribute : ( ( rule__ServiceAttribute__Alternatives ) ) ;
    public final void ruleServiceAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:605:2: ( ( ( rule__ServiceAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ServiceAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ServiceAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:607:1: ( rule__ServiceAttribute__Alternatives )
            {
             before(grammarAccess.getServiceAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:1: ( rule__ServiceAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:2: rule__ServiceAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1231);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:620:1: entryRuleElementEnabledAttribute : ruleElementEnabledAttribute EOF ;
    public final void entryRuleElementEnabledAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:621:1: ( ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:622:1: ruleElementEnabledAttribute EOF
            {
             before(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1258);
            ruleElementEnabledAttribute();

            state._fsp--;

             after(grammarAccess.getElementEnabledAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute1265); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:629:1: ruleElementEnabledAttribute : ( ( rule__ElementEnabledAttribute__Group__0 ) ) ;
    public final void ruleElementEnabledAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:633:2: ( ( ( rule__ElementEnabledAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:635:1: ( rule__ElementEnabledAttribute__Group__0 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:1: ( rule__ElementEnabledAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:2: rule__ElementEnabledAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1291);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:648:1: entryRuleElementExportedAttribute : ruleElementExportedAttribute EOF ;
    public final void entryRuleElementExportedAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:649:1: ( ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:650:1: ruleElementExportedAttribute EOF
            {
             before(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1318);
            ruleElementExportedAttribute();

            state._fsp--;

             after(grammarAccess.getElementExportedAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute1325); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:657:1: ruleElementExportedAttribute : ( ( rule__ElementExportedAttribute__Group__0 ) ) ;
    public final void ruleElementExportedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:661:2: ( ( ( rule__ElementExportedAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:663:1: ( rule__ElementExportedAttribute__Group__0 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:1: ( rule__ElementExportedAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:2: rule__ElementExportedAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1351);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:676:1: entryRuleElementLabelAttribute : ruleElementLabelAttribute EOF ;
    public final void entryRuleElementLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:677:1: ( ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:678:1: ruleElementLabelAttribute EOF
            {
             before(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1378);
            ruleElementLabelAttribute();

            state._fsp--;

             after(grammarAccess.getElementLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute1385); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:685:1: ruleElementLabelAttribute : ( ( rule__ElementLabelAttribute__Group__0 ) ) ;
    public final void ruleElementLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:689:2: ( ( ( rule__ElementLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:691:1: ( rule__ElementLabelAttribute__Group__0 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:1: ( rule__ElementLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:2: rule__ElementLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1411);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:704:1: entryRuleElementIntentList : ruleElementIntentList EOF ;
    public final void entryRuleElementIntentList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:705:1: ( ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:706:1: ruleElementIntentList EOF
            {
             before(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1438);
            ruleElementIntentList();

            state._fsp--;

             after(grammarAccess.getElementIntentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList1445); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:713:1: ruleElementIntentList : ( ( rule__ElementIntentList__Group__0 ) ) ;
    public final void ruleElementIntentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:717:2: ( ( ( rule__ElementIntentList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__ElementIntentList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__ElementIntentList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:719:1: ( rule__ElementIntentList__Group__0 )
            {
             before(grammarAccess.getElementIntentListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:1: ( rule__ElementIntentList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:2: rule__ElementIntentList__Group__0
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1471);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:732:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:733:1: ( ruleIntent EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:734:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent1498);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent1505); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:741:1: ruleIntent : ( rulePackageName ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:745:2: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:747:1: rulePackageName
            {
             before(grammarAccess.getIntentAccess().getPackageNameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackageName_in_ruleIntent1531);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:760:1: entryRuleActivityParentAttribute : ruleActivityParentAttribute EOF ;
    public final void entryRuleActivityParentAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:761:1: ( ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:762:1: ruleActivityParentAttribute EOF
            {
             before(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1557);
            ruleActivityParentAttribute();

            state._fsp--;

             after(grammarAccess.getActivityParentAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute1564); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:769:1: ruleActivityParentAttribute : ( ( rule__ActivityParentAttribute__Group__0 ) ) ;
    public final void ruleActivityParentAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:773:2: ( ( ( rule__ActivityParentAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:775:1: ( rule__ActivityParentAttribute__Group__0 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:1: ( rule__ActivityParentAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:2: rule__ActivityParentAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1590);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:788:1: entryRuleActivityLayoutAttribute : ruleActivityLayoutAttribute EOF ;
    public final void entryRuleActivityLayoutAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:789:1: ( ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:790:1: ruleActivityLayoutAttribute EOF
            {
             before(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1617);
            ruleActivityLayoutAttribute();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1624); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:797:1: ruleActivityLayoutAttribute : ( ( rule__ActivityLayoutAttribute__Group__0 ) ) ;
    public final void ruleActivityLayoutAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:801:2: ( ( ( rule__ActivityLayoutAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:803:1: ( rule__ActivityLayoutAttribute__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:1: ( rule__ActivityLayoutAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:2: rule__ActivityLayoutAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1650);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:816:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:817:1: ( ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:818:1: ruleLayoutElement EOF
            {
             before(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1677);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getLayoutElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement1684); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:825:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:829:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__LayoutElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__LayoutElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:831:1: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:1: ( rule__LayoutElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:2: rule__LayoutElement__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1710);
            rule__LayoutElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutElementAccess().getAlternatives()); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:844:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:845:1: ( ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:846:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1737);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1744); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:853:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:857:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__Button__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__Button__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:859:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:1: ( rule__Button__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton1770);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:872:1: entryRuleButtonAttribute : ruleButtonAttribute EOF ;
    public final void entryRuleButtonAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:873:1: ( ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:874:1: ruleButtonAttribute EOF
            {
             before(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1797);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute1804); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:881:1: ruleButtonAttribute : ( ( rule__ButtonAttribute__Alternatives ) ) ;
    public final void ruleButtonAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:885:2: ( ( ( rule__ButtonAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__ButtonAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__ButtonAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:887:1: ( rule__ButtonAttribute__Alternatives )
            {
             before(grammarAccess.getButtonAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:1: ( rule__ButtonAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:2: rule__ButtonAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1830);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:900:1: entryRuleButtonLabelAttribute : ruleButtonLabelAttribute EOF ;
    public final void entryRuleButtonLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:901:1: ( ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:902:1: ruleButtonLabelAttribute EOF
            {
             before(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1857);
            ruleButtonLabelAttribute();

            state._fsp--;

             after(grammarAccess.getButtonLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute1864); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:909:1: ruleButtonLabelAttribute : ( ( rule__ButtonLabelAttribute__Group__0 ) ) ;
    public final void ruleButtonLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:913:2: ( ( ( rule__ButtonLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:915:1: ( rule__ButtonLabelAttribute__Group__0 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:1: ( rule__ButtonLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:2: rule__ButtonLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1890);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:928:1: entryRuleButtonActionAttribute : ruleButtonActionAttribute EOF ;
    public final void entryRuleButtonActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:929:1: ( ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:930:1: ruleButtonActionAttribute EOF
            {
             before(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1917);
            ruleButtonActionAttribute();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute1924); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:937:1: ruleButtonActionAttribute : ( ( rule__ButtonActionAttribute__Group__0 ) ) ;
    public final void ruleButtonActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:941:2: ( ( ( rule__ButtonActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:943:1: ( rule__ButtonActionAttribute__Group__0 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:1: ( rule__ButtonActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:2: rule__ButtonActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1950);
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


    // $ANTLR start "entryRuleSpacer"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:956:1: entryRuleSpacer : ruleSpacer EOF ;
    public final void entryRuleSpacer() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:957:1: ( ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:958:1: ruleSpacer EOF
            {
             before(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer1977);
            ruleSpacer();

            state._fsp--;

             after(grammarAccess.getSpacerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer1984); 

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
    // $ANTLR end "entryRuleSpacer"


    // $ANTLR start "ruleSpacer"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:965:1: ruleSpacer : ( 'spacer' ) ;
    public final void ruleSpacer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:969:2: ( ( 'spacer' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( 'spacer' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:971:1: 'spacer'
            {
             before(grammarAccess.getSpacerAccess().getSpacerKeyword()); 
            match(input,12,FOLLOW_12_in_ruleSpacer2011); 
             after(grammarAccess.getSpacerAccess().getSpacerKeyword()); 

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
    // $ANTLR end "ruleSpacer"


    // $ANTLR start "entryRuleText"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:986:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:987:1: ( ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:988:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2039);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2046); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:995:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:999:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( ( rule__Text__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( ( rule__Text__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1001:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1002:1: ( rule__Text__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1002:2: rule__Text__Group__0
            {
            pushFollow(FOLLOW_rule__Text__Group__0_in_ruleText2072);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1014:1: entryRuleLayoutElementClickAction : ruleLayoutElementClickAction EOF ;
    public final void entryRuleLayoutElementClickAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1015:1: ( ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1016:1: ruleLayoutElementClickAction EOF
            {
             before(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction2099);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getLayoutElementClickActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction2106); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1023:1: ruleLayoutElementClickAction : ( ( rule__LayoutElementClickAction__Alternatives ) ) ;
    public final void ruleLayoutElementClickAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1027:2: ( ( ( rule__LayoutElementClickAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1029:1: ( rule__LayoutElementClickAction__Alternatives )
            {
             before(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1030:1: ( rule__LayoutElementClickAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1030:2: rule__LayoutElementClickAction__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction2132);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1042:1: entryRuleBroadcastReceiverActionAttribute : ruleBroadcastReceiverActionAttribute EOF ;
    public final void entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1043:1: ( ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1044:1: ruleBroadcastReceiverActionAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute2159);
            ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute2166); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1051:1: ruleBroadcastReceiverActionAttribute : ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) ;
    public final void ruleBroadcastReceiverActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1055:2: ( ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1057:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1058:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1058:2: rule__BroadcastReceiverActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2192);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1070:1: entryRuleBroadcastReceiverAction : ruleBroadcastReceiverAction EOF ;
    public final void entryRuleBroadcastReceiverAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1071:1: ( ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1072:1: ruleBroadcastReceiverAction EOF
            {
             before(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2219);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2226); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1079:1: ruleBroadcastReceiverAction : ( ( rule__BroadcastReceiverAction__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1083:2: ( ( ( rule__BroadcastReceiverAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1085:1: ( rule__BroadcastReceiverAction__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1086:1: ( rule__BroadcastReceiverAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1086:2: rule__BroadcastReceiverAction__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2252);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1098:1: entryRuleActionShowToast : ruleActionShowToast EOF ;
    public final void entryRuleActionShowToast() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1099:1: ( ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1100:1: ruleActionShowToast EOF
            {
             before(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2279);
            ruleActionShowToast();

            state._fsp--;

             after(grammarAccess.getActionShowToastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast2286); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1107:1: ruleActionShowToast : ( ( rule__ActionShowToast__Group__0 ) ) ;
    public final void ruleActionShowToast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1111:2: ( ( ( rule__ActionShowToast__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1112:1: ( ( rule__ActionShowToast__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1112:1: ( ( rule__ActionShowToast__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1113:1: ( rule__ActionShowToast__Group__0 )
            {
             before(grammarAccess.getActionShowToastAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1114:1: ( rule__ActionShowToast__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1114:2: rule__ActionShowToast__Group__0
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2312);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1126:1: entryRuleActionStartActivity : ruleActionStartActivity EOF ;
    public final void entryRuleActionStartActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1127:1: ( ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1128:1: ruleActionStartActivity EOF
            {
             before(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2339);
            ruleActionStartActivity();

            state._fsp--;

             after(grammarAccess.getActionStartActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity2346); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1135:1: ruleActionStartActivity : ( ( rule__ActionStartActivity__Group__0 ) ) ;
    public final void ruleActionStartActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1139:2: ( ( ( rule__ActionStartActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1140:1: ( ( rule__ActionStartActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1140:1: ( ( rule__ActionStartActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1141:1: ( rule__ActionStartActivity__Group__0 )
            {
             before(grammarAccess.getActionStartActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1142:1: ( rule__ActionStartActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1142:2: rule__ActionStartActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2372);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1154:1: entryRuleActionStartService : ruleActionStartService EOF ;
    public final void entryRuleActionStartService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1155:1: ( ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1156:1: ruleActionStartService EOF
            {
             before(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService2399);
            ruleActionStartService();

            state._fsp--;

             after(grammarAccess.getActionStartServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService2406); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1163:1: ruleActionStartService : ( ( rule__ActionStartService__Group__0 ) ) ;
    public final void ruleActionStartService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1167:2: ( ( ( rule__ActionStartService__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1168:1: ( ( rule__ActionStartService__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1168:1: ( ( rule__ActionStartService__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1169:1: ( rule__ActionStartService__Group__0 )
            {
             before(grammarAccess.getActionStartServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1170:1: ( rule__ActionStartService__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1170:2: rule__ActionStartService__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2432);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1182:1: rule__ApplicationAttribute__Alternatives : ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1186:1: ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 25:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:1: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:1: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1188:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2468);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleApplicationMinSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleApplicationMinSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1194:1: ruleApplicationMinSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2485);
                    ruleApplicationMinSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleApplicationTargetSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleApplicationTargetSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1200:1: ruleApplicationTargetSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2502);
                    ruleApplicationTargetSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleApplicationCompileSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleApplicationCompileSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1206:1: ruleApplicationCompileSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2519);
                    ruleApplicationCompileSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleApplicationPermissionList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleApplicationPermissionList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1212:1: ruleApplicationPermissionList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2536);
                    ruleApplicationPermissionList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1217:6: ( ruleApplicationElementList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1217:6: ( ruleApplicationElementList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1218:1: ruleApplicationElementList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2553);
                    ruleApplicationElementList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1223:6: ( ruleApplicationMainActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1223:6: ( ruleApplicationMainActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1224:1: ruleApplicationMainActivity
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2570);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1234:1: rule__ApplicationElement__Alternatives : ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1238:1: ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:1: ( ruleActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:1: ( ruleActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1240:1: ruleActivity
                    {
                     before(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2602);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleBroadcastReceiver )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleBroadcastReceiver )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1246:1: ruleBroadcastReceiver
                    {
                     before(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2619);
                    ruleBroadcastReceiver();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1252:1: ruleService
                    {
                     before(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2636);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1262:1: rule__ActivityAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) );
    public final void rule__ActivityAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1266:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 34:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1268:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2668);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1274:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2685);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1280:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2702);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1286:1: ruleElementIntentList
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2719);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1291:6: ( ruleActivityParentAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1291:6: ( ruleActivityParentAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1292:1: ruleActivityParentAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2736);
                    ruleActivityParentAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1297:6: ( ruleActivityLayoutAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1297:6: ( ruleActivityLayoutAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1298:1: ruleActivityLayoutAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2753);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1308:1: rule__BroadcastReceiverAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) );
    public final void rule__BroadcastReceiverAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1312:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 36:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1313:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1313:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1314:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2785);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1319:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1319:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1320:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2802);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1325:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1325:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1326:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2819);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1331:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1331:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1332:1: ruleElementIntentList
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2836);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1337:6: ( ruleBroadcastReceiverActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1337:6: ( ruleBroadcastReceiverActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1338:1: ruleBroadcastReceiverActionAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2853);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1348:1: rule__ServiceAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) );
    public final void rule__ServiceAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1352:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1353:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1353:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1354:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2885);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1359:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1359:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1360:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2902);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1365:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1365:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1366:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2919);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1371:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1371:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1372:1: ruleElementIntentList
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2936);
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


    // $ANTLR start "rule__LayoutElement__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1382:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1386:1: ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 37:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1387:1: ( ruleButton )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1387:1: ( ruleButton )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1388:1: ruleButton
                    {
                     before(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2968);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1393:6: ( ruleSpacer )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1393:6: ( ruleSpacer )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1394:1: ruleSpacer
                    {
                     before(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2985);
                    ruleSpacer();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1399:6: ( ruleText )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1399:6: ( ruleText )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1400:1: ruleText
                    {
                     before(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleText_in_rule__LayoutElement__Alternatives3002);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 

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
    // $ANTLR end "rule__LayoutElement__Alternatives"


    // $ANTLR start "rule__ButtonAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1410:1: rule__ButtonAttribute__Alternatives : ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) );
    public final void rule__ButtonAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1414:1: ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1415:1: ( ruleButtonLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1415:1: ( ruleButtonLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1416:1: ruleButtonLabelAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives3034);
                    ruleButtonLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:6: ( ruleButtonActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:6: ( ruleButtonActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1422:1: ruleButtonActionAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives3051);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1432:1: rule__LayoutElementClickAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__LayoutElementClickAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1436:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1437:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1437:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1438:1: ruleActionShowToast
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives3083);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1443:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1443:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1444:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives3100);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1449:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1449:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1450:1: ruleActionStartService
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives3117);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1460:1: rule__BroadcastReceiverAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__BroadcastReceiverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1464:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1465:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1465:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1466:1: ruleActionShowToast
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives3149);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1471:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1471:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1472:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives3166);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1477:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1477:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1478:1: ruleActionStartService
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives3183);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1490:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1494:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1495:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__03213);
            rule__AndroidAppProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__03216);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1502:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1506:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1507:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1507:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1508:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1509:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1509:2: rule__AndroidAppProject__ApplicationsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3243);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1519:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1523:1: ( rule__AndroidAppProject__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1524:2: rule__AndroidAppProject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13273);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1530:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1534:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1535:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1535:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1536:1: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1537:1: ( rule__AndroidAppProject__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1537:2: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3300);
            	    rule__AndroidAppProject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1551:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1555:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1556:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03335);
            rule__AndroidAppProject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03338);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1563:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1567:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1568:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1568:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1569:1: ','
            {
             before(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3366); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1582:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1586:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1587:2: rule__AndroidAppProject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13397);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1593:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1597:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1598:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1598:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1599:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1600:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1600:2: rule__AndroidAppProject__ApplicationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3424);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1614:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1618:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1619:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03458);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03461);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1626:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1630:1: ( ( 'application' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1631:1: ( 'application' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1631:1: ( 'application' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1632:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__0__Impl3489); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1645:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1649:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1650:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13520);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13523);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1657:1: rule__Application__Group__1__Impl : ( ( rule__Application__PackageNameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1661:1: ( ( ( rule__Application__PackageNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1662:1: ( ( rule__Application__PackageNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1662:1: ( ( rule__Application__PackageNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1663:1: ( rule__Application__PackageNameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1664:1: ( rule__Application__PackageNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1664:2: rule__Application__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__PackageNameAssignment_1_in_rule__Application__Group__1__Impl3550);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1674:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1678:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1679:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23580);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23583);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1686:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1690:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1691:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1691:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1692:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group__2__Impl3611); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1705:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1709:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1710:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33642);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33645);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1717:1: rule__Application__Group__3__Impl : ( ( rule__Application__AttributesAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1721:1: ( ( ( rule__Application__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1722:1: ( ( rule__Application__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1722:1: ( ( rule__Application__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1723:1: ( rule__Application__AttributesAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1724:1: ( rule__Application__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1724:2: rule__Application__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3672);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1734:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1738:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1739:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43702);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43705);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1746:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1750:1: ( ( ( rule__Application__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1751:1: ( ( rule__Application__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1751:1: ( ( rule__Application__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1752:1: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1753:1: ( rule__Application__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1753:2: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3732);
            	    rule__Application__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1763:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1767:1: ( rule__Application__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1768:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53763);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1774:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1778:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1779:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1779:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1780:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Application__Group__5__Impl3791); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1805:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1809:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1810:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03834);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03837);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1817:1: rule__Application__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1821:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1822:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1822:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1823:1: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_4__0__Impl3865); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1836:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1840:1: ( rule__Application__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1841:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13896);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1847:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__AttributesAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1851:1: ( ( ( rule__Application__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1852:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1852:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1853:1: ( rule__Application__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1854:1: ( rule__Application__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1854:2: rule__Application__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3923);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1868:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1872:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1873:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03957);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03960);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1880:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1884:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1885:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1885:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1886:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl3987); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1897:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1901:1: ( rule__PackageName__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1902:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__14016);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1908:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1912:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1913:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1913:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1914:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1915:1: ( rule__PackageName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1915:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl4043);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1929:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1933:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1934:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__04078);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__04081);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1941:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1945:1: ( ( '.' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1946:1: ( '.' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1946:1: ( '.' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1947:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__PackageName__Group_1__0__Impl4109); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1960:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1964:1: ( rule__PackageName__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1965:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__14140);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1971:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1975:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1976:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1976:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1977:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl4167); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1992:1: rule__ApplicationMinSdk__Group__0 : rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 ;
    public final void rule__ApplicationMinSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1996:1: ( rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1997:2: rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__04200);
            rule__ApplicationMinSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__04203);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2004:1: rule__ApplicationMinSdk__Group__0__Impl : ( 'min-sdk' ) ;
    public final void rule__ApplicationMinSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2008:1: ( ( 'min-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2009:1: ( 'min-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2009:1: ( 'min-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2010:1: 'min-sdk'
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ApplicationMinSdk__Group__0__Impl4231); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2023:1: rule__ApplicationMinSdk__Group__1 : rule__ApplicationMinSdk__Group__1__Impl ;
    public final void rule__ApplicationMinSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2027:1: ( rule__ApplicationMinSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2028:2: rule__ApplicationMinSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14262);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2034:1: rule__ApplicationMinSdk__Group__1__Impl : ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) ;
    public final void rule__ApplicationMinSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2038:1: ( ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2039:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2039:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2040:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2041:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2041:2: rule__ApplicationMinSdk__MinSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4289);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2055:1: rule__ApplicationTargetSdk__Group__0 : rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 ;
    public final void rule__ApplicationTargetSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2059:1: ( rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2060:2: rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04323);
            rule__ApplicationTargetSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04326);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2067:1: rule__ApplicationTargetSdk__Group__0__Impl : ( 'target-sdk' ) ;
    public final void rule__ApplicationTargetSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2071:1: ( ( 'target-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2072:1: ( 'target-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2072:1: ( 'target-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2073:1: 'target-sdk'
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ApplicationTargetSdk__Group__0__Impl4354); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2086:1: rule__ApplicationTargetSdk__Group__1 : rule__ApplicationTargetSdk__Group__1__Impl ;
    public final void rule__ApplicationTargetSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2090:1: ( rule__ApplicationTargetSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2091:2: rule__ApplicationTargetSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14385);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2097:1: rule__ApplicationTargetSdk__Group__1__Impl : ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) ;
    public final void rule__ApplicationTargetSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2101:1: ( ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2102:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2102:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2103:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2104:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2104:2: rule__ApplicationTargetSdk__TargetSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4412);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2118:1: rule__ApplicationCompileSdk__Group__0 : rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 ;
    public final void rule__ApplicationCompileSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2122:1: ( rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2123:2: rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04446);
            rule__ApplicationCompileSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04449);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2130:1: rule__ApplicationCompileSdk__Group__0__Impl : ( 'compile-sdk' ) ;
    public final void rule__ApplicationCompileSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2134:1: ( ( 'compile-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2135:1: ( 'compile-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2135:1: ( 'compile-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2136:1: 'compile-sdk'
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ApplicationCompileSdk__Group__0__Impl4477); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2149:1: rule__ApplicationCompileSdk__Group__1 : rule__ApplicationCompileSdk__Group__1__Impl ;
    public final void rule__ApplicationCompileSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2153:1: ( rule__ApplicationCompileSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2154:2: rule__ApplicationCompileSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14508);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2160:1: rule__ApplicationCompileSdk__Group__1__Impl : ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) ;
    public final void rule__ApplicationCompileSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2164:1: ( ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2165:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2165:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2166:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2167:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2167:2: rule__ApplicationCompileSdk__CompileSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4535);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2181:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2185:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2186:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04569);
            rule__ApplicationPermissionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04572);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2193:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2197:1: ( ( 'permissions' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2198:1: ( 'permissions' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2198:1: ( 'permissions' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2199:1: 'permissions'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationPermissionList__Group__0__Impl4600); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2212:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2216:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2217:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14631);
            rule__ApplicationPermissionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14634);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2224:1: rule__ApplicationPermissionList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2228:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2229:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2229:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2230:1: '['
            {
             before(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationPermissionList__Group__1__Impl4662); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2243:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2247:1: ( rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2248:2: rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24693);
            rule__ApplicationPermissionList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24696);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2255:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2259:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2260:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2260:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2261:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2262:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2262:2: rule__ApplicationPermissionList__PermissionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4723);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2272:1: rule__ApplicationPermissionList__Group__3 : rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 ;
    public final void rule__ApplicationPermissionList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2276:1: ( rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2277:2: rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34753);
            rule__ApplicationPermissionList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34756);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2284:1: rule__ApplicationPermissionList__Group__3__Impl : ( ( rule__ApplicationPermissionList__Group_3__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2288:1: ( ( ( rule__ApplicationPermissionList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2289:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2289:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2290:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2291:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2291:2: rule__ApplicationPermissionList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4783);
            	    rule__ApplicationPermissionList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2301:1: rule__ApplicationPermissionList__Group__4 : rule__ApplicationPermissionList__Group__4__Impl ;
    public final void rule__ApplicationPermissionList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2305:1: ( rule__ApplicationPermissionList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2306:2: rule__ApplicationPermissionList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44814);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2312:1: rule__ApplicationPermissionList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationPermissionList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2316:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2317:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2317:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2318:1: ']'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationPermissionList__Group__4__Impl4842); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2341:1: rule__ApplicationPermissionList__Group_3__0 : rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 ;
    public final void rule__ApplicationPermissionList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2345:1: ( rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2346:2: rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04883);
            rule__ApplicationPermissionList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04886);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2353:1: rule__ApplicationPermissionList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2357:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2358:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2358:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2359:1: ','
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4914); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2372:1: rule__ApplicationPermissionList__Group_3__1 : rule__ApplicationPermissionList__Group_3__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2376:1: ( rule__ApplicationPermissionList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2377:2: rule__ApplicationPermissionList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14945);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2383:1: rule__ApplicationPermissionList__Group_3__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2387:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2388:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2388:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2389:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2390:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2390:2: rule__ApplicationPermissionList__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4972);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2404:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2408:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2409:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__05006);
            rule__ApplicationElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__05009);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2416:1: rule__ApplicationElementList__Group__0__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2420:1: ( ( 'elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2421:1: ( 'elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2421:1: ( 'elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2422:1: 'elements'
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationElementList__Group__0__Impl5037); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2435:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2439:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2440:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__15068);
            rule__ApplicationElementList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__15071);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2447:1: rule__ApplicationElementList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2451:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2452:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2452:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2453:1: '['
            {
             before(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationElementList__Group__1__Impl5099); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2466:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2470:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2471:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__25130);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__25133);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2478:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2482:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2483:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2483:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2484:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2485:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2485:2: rule__ApplicationElementList__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl5160);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2495:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2499:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2500:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__35190);
            rule__ApplicationElementList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__35193);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2507:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__Group_3__0 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2511:1: ( ( ( rule__ApplicationElementList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2512:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2512:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2513:1: ( rule__ApplicationElementList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2514:1: ( rule__ApplicationElementList__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2514:2: rule__ApplicationElementList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl5220);
            	    rule__ApplicationElementList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2524:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2528:1: ( rule__ApplicationElementList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2529:2: rule__ApplicationElementList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45251);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2535:1: rule__ApplicationElementList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2539:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2540:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2540:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2541:1: ']'
            {
             before(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationElementList__Group__4__Impl5279); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2564:1: rule__ApplicationElementList__Group_3__0 : rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 ;
    public final void rule__ApplicationElementList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2568:1: ( rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2569:2: rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05320);
            rule__ApplicationElementList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05323);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2576:1: rule__ApplicationElementList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationElementList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2580:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2581:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2581:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2582:1: ','
            {
             before(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl5351); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2595:1: rule__ApplicationElementList__Group_3__1 : rule__ApplicationElementList__Group_3__1__Impl ;
    public final void rule__ApplicationElementList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2599:1: ( rule__ApplicationElementList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2600:2: rule__ApplicationElementList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15382);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2606:1: rule__ApplicationElementList__Group_3__1__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) ;
    public final void rule__ApplicationElementList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2610:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2611:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2611:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2612:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2613:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2613:2: rule__ApplicationElementList__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5409);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2627:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2631:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2632:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05443);
            rule__ApplicationMainActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05446);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2639:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2643:1: ( ( 'main-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2644:1: ( 'main-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2644:1: ( 'main-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2645:1: 'main-activity'
            {
             before(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ApplicationMainActivity__Group__0__Impl5474); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2658:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2662:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2663:2: rule__ApplicationMainActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15505);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2669:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2673:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2674:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2674:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2675:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2676:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2676:2: rule__ApplicationMainActivity__LauncherActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5532);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2690:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2694:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2695:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05566);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05569);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2702:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2706:1: ( ( 'activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2707:1: ( 'activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2707:1: ( 'activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2708:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group__0__Impl5597); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2721:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2725:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2726:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15628);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15631);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2733:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__ClassNameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2737:1: ( ( ( rule__Activity__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2738:1: ( ( rule__Activity__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2738:1: ( ( rule__Activity__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2739:1: ( rule__Activity__ClassNameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2740:1: ( rule__Activity__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2740:2: rule__Activity__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__ClassNameAssignment_1_in_rule__Activity__Group__1__Impl5658);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2750:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2754:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2755:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25688);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25691);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2762:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2766:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2767:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2767:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2768:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Activity__Group__2__Impl5719); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2781:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2785:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2786:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35750);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35753);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2793:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__AttributesAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2797:1: ( ( ( rule__Activity__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2798:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2798:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2799:1: ( rule__Activity__AttributesAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2800:1: ( rule__Activity__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2800:2: rule__Activity__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5780);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2810:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2814:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2815:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45810);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45813);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2822:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2826:1: ( ( ( rule__Activity__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2827:1: ( ( rule__Activity__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2827:1: ( ( rule__Activity__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2828:1: ( rule__Activity__Group_4__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2829:1: ( rule__Activity__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2829:2: rule__Activity__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5840);
            	    rule__Activity__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2839:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2843:1: ( rule__Activity__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2844:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55871);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2850:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2854:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2855:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2855:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2856:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Activity__Group__5__Impl5899); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2881:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2885:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2886:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05942);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05945);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2893:1: rule__Activity__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2897:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2898:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2898:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2899:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Activity__Group_4__0__Impl5973); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2912:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2916:1: ( rule__Activity__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2917:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__16004);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2923:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__AttributesAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2927:1: ( ( ( rule__Activity__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2928:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2928:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2929:1: ( rule__Activity__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2930:1: ( rule__Activity__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2930:2: rule__Activity__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl6031);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2944:1: rule__BroadcastReceiver__Group__0 : rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 ;
    public final void rule__BroadcastReceiver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2948:1: ( rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2949:2: rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__06065);
            rule__BroadcastReceiver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__06068);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2956:1: rule__BroadcastReceiver__Group__0__Impl : ( 'receiver' ) ;
    public final void rule__BroadcastReceiver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2960:1: ( ( 'receiver' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2961:1: ( 'receiver' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2961:1: ( 'receiver' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2962:1: 'receiver'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__BroadcastReceiver__Group__0__Impl6096); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2975:1: rule__BroadcastReceiver__Group__1 : rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 ;
    public final void rule__BroadcastReceiver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2979:1: ( rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2980:2: rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__16127);
            rule__BroadcastReceiver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__16130);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2987:1: rule__BroadcastReceiver__Group__1__Impl : ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) ) ;
    public final void rule__BroadcastReceiver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2991:1: ( ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2992:1: ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2992:1: ( ( rule__BroadcastReceiver__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2993:1: ( rule__BroadcastReceiver__ClassNameAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2994:1: ( rule__BroadcastReceiver__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2994:2: rule__BroadcastReceiver__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__ClassNameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl6157);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3004:1: rule__BroadcastReceiver__Group__2 : rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 ;
    public final void rule__BroadcastReceiver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3008:1: ( rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3009:2: rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__26187);
            rule__BroadcastReceiver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__26190);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3016:1: rule__BroadcastReceiver__Group__2__Impl : ( '{' ) ;
    public final void rule__BroadcastReceiver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3020:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3021:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3021:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3022:1: '{'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl6218); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3035:1: rule__BroadcastReceiver__Group__3 : rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 ;
    public final void rule__BroadcastReceiver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3039:1: ( rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3040:2: rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36249);
            rule__BroadcastReceiver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36252);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3047:1: rule__BroadcastReceiver__Group__3__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) ;
    public final void rule__BroadcastReceiver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3051:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3052:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3052:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3053:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3054:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3054:2: rule__BroadcastReceiver__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6279);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3064:1: rule__BroadcastReceiver__Group__4 : rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 ;
    public final void rule__BroadcastReceiver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3068:1: ( rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3069:2: rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46309);
            rule__BroadcastReceiver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46312);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3076:1: rule__BroadcastReceiver__Group__4__Impl : ( ( rule__BroadcastReceiver__Group_4__0 )* ) ;
    public final void rule__BroadcastReceiver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3080:1: ( ( ( rule__BroadcastReceiver__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3081:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3081:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3082:1: ( rule__BroadcastReceiver__Group_4__0 )*
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3083:1: ( rule__BroadcastReceiver__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3083:2: rule__BroadcastReceiver__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6339);
            	    rule__BroadcastReceiver__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3093:1: rule__BroadcastReceiver__Group__5 : rule__BroadcastReceiver__Group__5__Impl ;
    public final void rule__BroadcastReceiver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3097:1: ( rule__BroadcastReceiver__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3098:2: rule__BroadcastReceiver__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56370);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3104:1: rule__BroadcastReceiver__Group__5__Impl : ( '}' ) ;
    public final void rule__BroadcastReceiver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3108:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3109:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3109:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3110:1: '}'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl6398); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3135:1: rule__BroadcastReceiver__Group_4__0 : rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 ;
    public final void rule__BroadcastReceiver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3139:1: ( rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3140:2: rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06441);
            rule__BroadcastReceiver__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06444);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3147:1: rule__BroadcastReceiver__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BroadcastReceiver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3151:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3152:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3152:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3153:1: ','
            {
             before(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6472); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3166:1: rule__BroadcastReceiver__Group_4__1 : rule__BroadcastReceiver__Group_4__1__Impl ;
    public final void rule__BroadcastReceiver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3170:1: ( rule__BroadcastReceiver__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3171:2: rule__BroadcastReceiver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16503);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3177:1: rule__BroadcastReceiver__Group_4__1__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) ;
    public final void rule__BroadcastReceiver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3181:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3182:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3182:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3183:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3184:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3184:2: rule__BroadcastReceiver__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6530);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3198:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3202:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3203:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06564);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06567);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3210:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3214:1: ( ( 'service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3215:1: ( 'service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3215:1: ( 'service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3216:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Service__Group__0__Impl6595); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3229:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3233:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3234:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16626);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16629);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3241:1: rule__Service__Group__1__Impl : ( ( rule__Service__ClassNameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3245:1: ( ( ( rule__Service__ClassNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3246:1: ( ( rule__Service__ClassNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3246:1: ( ( rule__Service__ClassNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3247:1: ( rule__Service__ClassNameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getClassNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3248:1: ( rule__Service__ClassNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3248:2: rule__Service__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__ClassNameAssignment_1_in_rule__Service__Group__1__Impl6656);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3258:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3262:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3263:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26686);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26689);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3270:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3274:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3275:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3275:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3276:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Service__Group__2__Impl6717); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3289:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3293:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3294:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36748);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36751);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3301:1: rule__Service__Group__3__Impl : ( ( rule__Service__AttributesAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3305:1: ( ( ( rule__Service__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3306:1: ( ( rule__Service__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3306:1: ( ( rule__Service__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3307:1: ( rule__Service__AttributesAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3308:1: ( rule__Service__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3308:2: rule__Service__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6778);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3318:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3322:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3323:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46808);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46811);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3330:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3334:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3335:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3335:1: ( ( rule__Service__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3336:1: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3337:1: ( rule__Service__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3337:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6838);
            	    rule__Service__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3347:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3351:1: ( rule__Service__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3352:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56869);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3358:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3362:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3363:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3363:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3364:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Service__Group__5__Impl6897); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3389:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3393:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3394:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06940);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06943);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3401:1: rule__Service__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3405:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3406:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3406:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3407:1: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Service__Group_4__0__Impl6971); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3420:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3424:1: ( rule__Service__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3425:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__17002);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3431:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__AttributesAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3435:1: ( ( ( rule__Service__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3436:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3436:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3437:1: ( rule__Service__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3438:1: ( rule__Service__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3438:2: rule__Service__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl7029);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3452:1: rule__ElementEnabledAttribute__Group__0 : rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 ;
    public final void rule__ElementEnabledAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3456:1: ( rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3457:2: rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__07063);
            rule__ElementEnabledAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__07066);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3464:1: rule__ElementEnabledAttribute__Group__0__Impl : ( 'enabled' ) ;
    public final void rule__ElementEnabledAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3468:1: ( ( 'enabled' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3469:1: ( 'enabled' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3469:1: ( 'enabled' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3470:1: 'enabled'
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ElementEnabledAttribute__Group__0__Impl7094); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3483:1: rule__ElementEnabledAttribute__Group__1 : rule__ElementEnabledAttribute__Group__1__Impl ;
    public final void rule__ElementEnabledAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3487:1: ( rule__ElementEnabledAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3488:2: rule__ElementEnabledAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__17125);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3494:1: rule__ElementEnabledAttribute__Group__1__Impl : ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) ;
    public final void rule__ElementEnabledAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3498:1: ( ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3499:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3499:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3500:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3501:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3501:2: rule__ElementEnabledAttribute__EnabledAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl7152);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3515:1: rule__ElementExportedAttribute__Group__0 : rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 ;
    public final void rule__ElementExportedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3519:1: ( rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3520:2: rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__07186);
            rule__ElementExportedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__07189);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3527:1: rule__ElementExportedAttribute__Group__0__Impl : ( 'exported' ) ;
    public final void rule__ElementExportedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3531:1: ( ( 'exported' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3532:1: ( 'exported' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3532:1: ( 'exported' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3533:1: 'exported'
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementExportedAttribute__Group__0__Impl7217); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3546:1: rule__ElementExportedAttribute__Group__1 : rule__ElementExportedAttribute__Group__1__Impl ;
    public final void rule__ElementExportedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3550:1: ( rule__ElementExportedAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3551:2: rule__ElementExportedAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17248);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3557:1: rule__ElementExportedAttribute__Group__1__Impl : ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) ;
    public final void rule__ElementExportedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3561:1: ( ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3562:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3562:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3563:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3564:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3564:2: rule__ElementExportedAttribute__ExportedAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7275);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3578:1: rule__ElementLabelAttribute__Group__0 : rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 ;
    public final void rule__ElementLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3582:1: ( rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3583:2: rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07309);
            rule__ElementLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07312);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3590:1: rule__ElementLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ElementLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3594:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3595:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3595:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3596:1: 'title'
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ElementLabelAttribute__Group__0__Impl7340); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3609:1: rule__ElementLabelAttribute__Group__1 : rule__ElementLabelAttribute__Group__1__Impl ;
    public final void rule__ElementLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3613:1: ( rule__ElementLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3614:2: rule__ElementLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17371);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3620:1: rule__ElementLabelAttribute__Group__1__Impl : ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ElementLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3624:1: ( ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3625:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3625:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3626:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3627:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3627:2: rule__ElementLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7398);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3641:1: rule__ElementIntentList__Group__0 : rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 ;
    public final void rule__ElementIntentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3645:1: ( rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3646:2: rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07432);
            rule__ElementIntentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07435);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3653:1: rule__ElementIntentList__Group__0__Impl : ( 'intents' ) ;
    public final void rule__ElementIntentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3657:1: ( ( 'intents' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3658:1: ( 'intents' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3658:1: ( 'intents' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3659:1: 'intents'
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ElementIntentList__Group__0__Impl7463); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3672:1: rule__ElementIntentList__Group__1 : rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 ;
    public final void rule__ElementIntentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3676:1: ( rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3677:2: rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17494);
            rule__ElementIntentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17497);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3684:1: rule__ElementIntentList__Group__1__Impl : ( '[' ) ;
    public final void rule__ElementIntentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3688:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3689:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3689:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3690:1: '['
            {
             before(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ElementIntentList__Group__1__Impl7525); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3703:1: rule__ElementIntentList__Group__2 : rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 ;
    public final void rule__ElementIntentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3707:1: ( rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3708:2: rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27556);
            rule__ElementIntentList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27559);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3715:1: rule__ElementIntentList__Group__2__Impl : ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) ;
    public final void rule__ElementIntentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3719:1: ( ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3720:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3720:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3721:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3722:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3722:2: rule__ElementIntentList__IntentsAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7586);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3732:1: rule__ElementIntentList__Group__3 : rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 ;
    public final void rule__ElementIntentList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3736:1: ( rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3737:2: rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37616);
            rule__ElementIntentList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37619);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3744:1: rule__ElementIntentList__Group__3__Impl : ( ( rule__ElementIntentList__Group_3__0 )* ) ;
    public final void rule__ElementIntentList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3748:1: ( ( ( rule__ElementIntentList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3749:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3749:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3750:1: ( rule__ElementIntentList__Group_3__0 )*
            {
             before(grammarAccess.getElementIntentListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3751:1: ( rule__ElementIntentList__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3751:2: rule__ElementIntentList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7646);
            	    rule__ElementIntentList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3761:1: rule__ElementIntentList__Group__4 : rule__ElementIntentList__Group__4__Impl ;
    public final void rule__ElementIntentList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3765:1: ( rule__ElementIntentList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3766:2: rule__ElementIntentList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47677);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3772:1: rule__ElementIntentList__Group__4__Impl : ( ']' ) ;
    public final void rule__ElementIntentList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3776:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3777:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3777:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3778:1: ']'
            {
             before(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ElementIntentList__Group__4__Impl7705); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3801:1: rule__ElementIntentList__Group_3__0 : rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 ;
    public final void rule__ElementIntentList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3805:1: ( rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3806:2: rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07746);
            rule__ElementIntentList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07749);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3813:1: rule__ElementIntentList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ElementIntentList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3817:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3818:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3818:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3819:1: ','
            {
             before(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7777); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3832:1: rule__ElementIntentList__Group_3__1 : rule__ElementIntentList__Group_3__1__Impl ;
    public final void rule__ElementIntentList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3836:1: ( rule__ElementIntentList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3837:2: rule__ElementIntentList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17808);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3843:1: rule__ElementIntentList__Group_3__1__Impl : ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) ;
    public final void rule__ElementIntentList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3847:1: ( ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3848:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3848:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3849:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3850:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3850:2: rule__ElementIntentList__IntentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7835);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3864:1: rule__ActivityParentAttribute__Group__0 : rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 ;
    public final void rule__ActivityParentAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3868:1: ( rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3869:2: rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07869);
            rule__ActivityParentAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07872);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3876:1: rule__ActivityParentAttribute__Group__0__Impl : ( 'parent' ) ;
    public final void rule__ActivityParentAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3880:1: ( ( 'parent' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3881:1: ( 'parent' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3881:1: ( 'parent' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3882:1: 'parent'
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ActivityParentAttribute__Group__0__Impl7900); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3895:1: rule__ActivityParentAttribute__Group__1 : rule__ActivityParentAttribute__Group__1__Impl ;
    public final void rule__ActivityParentAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3899:1: ( rule__ActivityParentAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3900:2: rule__ActivityParentAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17931);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3906:1: rule__ActivityParentAttribute__Group__1__Impl : ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) ;
    public final void rule__ActivityParentAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3910:1: ( ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3911:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3911:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3912:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3913:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3913:2: rule__ActivityParentAttribute__ParentAssignment_1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7958);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3927:1: rule__ActivityLayoutAttribute__Group__0 : rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 ;
    public final void rule__ActivityLayoutAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3931:1: ( rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3932:2: rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07992);
            rule__ActivityLayoutAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07995);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3939:1: rule__ActivityLayoutAttribute__Group__0__Impl : ( 'layout-elements' ) ;
    public final void rule__ActivityLayoutAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3943:1: ( ( 'layout-elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3944:1: ( 'layout-elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3944:1: ( 'layout-elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3945:1: 'layout-elements'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ActivityLayoutAttribute__Group__0__Impl8023); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3958:1: rule__ActivityLayoutAttribute__Group__1 : rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 ;
    public final void rule__ActivityLayoutAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3962:1: ( rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3963:2: rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__18054);
            rule__ActivityLayoutAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__18057);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3970:1: rule__ActivityLayoutAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__ActivityLayoutAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3974:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3975:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3975:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3976:1: '['
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__1__Impl8085); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3989:1: rule__ActivityLayoutAttribute__Group__2 : rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 ;
    public final void rule__ActivityLayoutAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3993:1: ( rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3994:2: rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__28116);
            rule__ActivityLayoutAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__28119);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4001:1: rule__ActivityLayoutAttribute__Group__2__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4005:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4006:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4006:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4007:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4008:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4008:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl8146);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4018:1: rule__ActivityLayoutAttribute__Group__3 : rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 ;
    public final void rule__ActivityLayoutAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4022:1: ( rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4023:2: rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__38176);
            rule__ActivityLayoutAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__38179);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4030:1: rule__ActivityLayoutAttribute__Group__3__Impl : ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) ;
    public final void rule__ActivityLayoutAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4034:1: ( ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4035:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4035:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4036:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4037:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4037:2: rule__ActivityLayoutAttribute__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl8206);
            	    rule__ActivityLayoutAttribute__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4047:1: rule__ActivityLayoutAttribute__Group__4 : rule__ActivityLayoutAttribute__Group__4__Impl ;
    public final void rule__ActivityLayoutAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4051:1: ( rule__ActivityLayoutAttribute__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4052:2: rule__ActivityLayoutAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__48237);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4058:1: rule__ActivityLayoutAttribute__Group__4__Impl : ( ']' ) ;
    public final void rule__ActivityLayoutAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4062:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4063:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4063:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4064:1: ']'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ActivityLayoutAttribute__Group__4__Impl8265); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4087:1: rule__ActivityLayoutAttribute__Group_3__0 : rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 ;
    public final void rule__ActivityLayoutAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4091:1: ( rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4092:2: rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08306);
            rule__ActivityLayoutAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08309);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4099:1: rule__ActivityLayoutAttribute__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4103:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4104:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4104:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4105:1: ','
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8337); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4118:1: rule__ActivityLayoutAttribute__Group_3__1 : rule__ActivityLayoutAttribute__Group_3__1__Impl ;
    public final void rule__ActivityLayoutAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4122:1: ( rule__ActivityLayoutAttribute__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4123:2: rule__ActivityLayoutAttribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18368);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4129:1: rule__ActivityLayoutAttribute__Group_3__1__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4133:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4134:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4134:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4135:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4136:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4136:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8395);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4150:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4154:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4155:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08429);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08432);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4162:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4166:1: ( ( 'button' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4167:1: ( 'button' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4167:1: ( 'button' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4168:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Button__Group__0__Impl8460); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4181:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4185:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4186:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18491);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18494);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4193:1: rule__Button__Group__1__Impl : ( ( rule__Button__ButtonNameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4197:1: ( ( ( rule__Button__ButtonNameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4198:1: ( ( rule__Button__ButtonNameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4198:1: ( ( rule__Button__ButtonNameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4199:1: ( rule__Button__ButtonNameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getButtonNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4200:1: ( rule__Button__ButtonNameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4200:2: rule__Button__ButtonNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Button__ButtonNameAssignment_1_in_rule__Button__Group__1__Impl8521);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4210:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4214:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4215:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28551);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28554);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4222:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4226:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4227:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4227:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4228:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Button__Group__2__Impl8582); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4241:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4245:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4246:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38613);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38616);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4253:1: rule__Button__Group__3__Impl : ( ( rule__Button__AttributesAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4257:1: ( ( ( rule__Button__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4258:1: ( ( rule__Button__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4258:1: ( ( rule__Button__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4259:1: ( rule__Button__AttributesAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4260:1: ( rule__Button__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4260:2: rule__Button__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8643);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4270:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4274:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4275:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48673);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48676);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4282:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )* ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4286:1: ( ( ( rule__Button__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4287:1: ( ( rule__Button__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4287:1: ( ( rule__Button__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4288:1: ( rule__Button__Group_4__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4289:1: ( rule__Button__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4289:2: rule__Button__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8703);
            	    rule__Button__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4299:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4303:1: ( rule__Button__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4304:2: rule__Button__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58734);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4310:1: rule__Button__Group__5__Impl : ( '}' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4314:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4315:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4315:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4316:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Button__Group__5__Impl8762); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4341:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4345:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4346:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
            {
            pushFollow(FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08805);
            rule__Button__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08808);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4353:1: rule__Button__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4357:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4358:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4358:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4359:1: ','
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Button__Group_4__0__Impl8836); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4372:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4376:1: ( rule__Button__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4377:2: rule__Button__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18867);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4383:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__AttributesAssignment_4_1 ) ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4387:1: ( ( ( rule__Button__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4388:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4388:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4389:1: ( rule__Button__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4390:1: ( rule__Button__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4390:2: rule__Button__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8894);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4404:1: rule__ButtonLabelAttribute__Group__0 : rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 ;
    public final void rule__ButtonLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4408:1: ( rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4409:2: rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08928);
            rule__ButtonLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08931);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4416:1: rule__ButtonLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ButtonLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4420:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4421:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4421:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4422:1: 'title'
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ButtonLabelAttribute__Group__0__Impl8959); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4435:1: rule__ButtonLabelAttribute__Group__1 : rule__ButtonLabelAttribute__Group__1__Impl ;
    public final void rule__ButtonLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4439:1: ( rule__ButtonLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4440:2: rule__ButtonLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18990);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4446:1: rule__ButtonLabelAttribute__Group__1__Impl : ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ButtonLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4450:1: ( ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4451:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4451:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4452:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4453:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4453:2: rule__ButtonLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl9017);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4467:1: rule__ButtonActionAttribute__Group__0 : rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 ;
    public final void rule__ButtonActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4471:1: ( rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4472:2: rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__09051);
            rule__ButtonActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__09054);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4479:1: rule__ButtonActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__ButtonActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4483:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4484:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4484:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4485:1: 'action'
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ButtonActionAttribute__Group__0__Impl9082); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4498:1: rule__ButtonActionAttribute__Group__1 : rule__ButtonActionAttribute__Group__1__Impl ;
    public final void rule__ButtonActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4502:1: ( rule__ButtonActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4503:2: rule__ButtonActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__19113);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4509:1: rule__ButtonActionAttribute__Group__1__Impl : ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__ButtonActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4513:1: ( ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4514:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4514:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4515:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4516:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4516:2: rule__ButtonActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl9140);
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


    // $ANTLR start "rule__Text__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4530:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4534:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4535:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__09174);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Text__Group__1_in_rule__Text__Group__09177);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4542:1: rule__Text__Group__0__Impl : ( 'text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4546:1: ( ( 'text' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4547:1: ( 'text' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4547:1: ( 'text' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4548:1: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Text__Group__0__Impl9205); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4561:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4565:1: ( rule__Text__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4566:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__19236);
            rule__Text__Group__1__Impl();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4572:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4576:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4577:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4577:1: ( ( rule__Text__TextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4578:1: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4579:1: ( rule__Text__TextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4579:2: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl9263);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4593:1: rule__BroadcastReceiverActionAttribute__Group__0 : rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4597:1: ( rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4598:2: rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09297);
            rule__BroadcastReceiverActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09300);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4605:1: rule__BroadcastReceiverActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4609:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4610:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4610:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4611:1: 'action'
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9328); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4624:1: rule__BroadcastReceiverActionAttribute__Group__1 : rule__BroadcastReceiverActionAttribute__Group__1__Impl ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4628:1: ( rule__BroadcastReceiverActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4629:2: rule__BroadcastReceiverActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19359);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4635:1: rule__BroadcastReceiverActionAttribute__Group__1__Impl : ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4639:1: ( ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4640:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4640:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4641:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4642:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4642:2: rule__BroadcastReceiverActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9386);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4656:1: rule__ActionShowToast__Group__0 : rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 ;
    public final void rule__ActionShowToast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4660:1: ( rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4661:2: rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09420);
            rule__ActionShowToast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09423);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4668:1: rule__ActionShowToast__Group__0__Impl : ( 'show-toast' ) ;
    public final void rule__ActionShowToast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4672:1: ( ( 'show-toast' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4673:1: ( 'show-toast' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4673:1: ( 'show-toast' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4674:1: 'show-toast'
            {
             before(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ActionShowToast__Group__0__Impl9451); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4687:1: rule__ActionShowToast__Group__1 : rule__ActionShowToast__Group__1__Impl ;
    public final void rule__ActionShowToast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4691:1: ( rule__ActionShowToast__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4692:2: rule__ActionShowToast__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19482);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4698:1: rule__ActionShowToast__Group__1__Impl : ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) ;
    public final void rule__ActionShowToast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4702:1: ( ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4703:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4703:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4704:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4705:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4705:2: rule__ActionShowToast__ToastTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9509);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4719:1: rule__ActionStartActivity__Group__0 : rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 ;
    public final void rule__ActionStartActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4723:1: ( rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4724:2: rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09543);
            rule__ActionStartActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09546);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4731:1: rule__ActionStartActivity__Group__0__Impl : ( 'start-activity' ) ;
    public final void rule__ActionStartActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4735:1: ( ( 'start-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4736:1: ( 'start-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4736:1: ( 'start-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4737:1: 'start-activity'
            {
             before(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ActionStartActivity__Group__0__Impl9574); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4750:1: rule__ActionStartActivity__Group__1 : rule__ActionStartActivity__Group__1__Impl ;
    public final void rule__ActionStartActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4754:1: ( rule__ActionStartActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4755:2: rule__ActionStartActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19605);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4761:1: rule__ActionStartActivity__Group__1__Impl : ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) ;
    public final void rule__ActionStartActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4765:1: ( ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4766:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4766:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4767:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4768:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4768:2: rule__ActionStartActivity__ActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9632);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4782:1: rule__ActionStartService__Group__0 : rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 ;
    public final void rule__ActionStartService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4786:1: ( rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4787:2: rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09666);
            rule__ActionStartService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09669);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4794:1: rule__ActionStartService__Group__0__Impl : ( 'start-service' ) ;
    public final void rule__ActionStartService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4798:1: ( ( 'start-service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4799:1: ( 'start-service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4799:1: ( 'start-service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4800:1: 'start-service'
            {
             before(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ActionStartService__Group__0__Impl9697); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4813:1: rule__ActionStartService__Group__1 : rule__ActionStartService__Group__1__Impl ;
    public final void rule__ActionStartService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4817:1: ( rule__ActionStartService__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4818:2: rule__ActionStartService__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19728);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4824:1: rule__ActionStartService__Group__1__Impl : ( ( rule__ActionStartService__ServiceAssignment_1 ) ) ;
    public final void rule__ActionStartService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4828:1: ( ( ( rule__ActionStartService__ServiceAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4829:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4829:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4830:1: ( rule__ActionStartService__ServiceAssignment_1 )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4831:1: ( rule__ActionStartService__ServiceAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4831:2: rule__ActionStartService__ServiceAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9755);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4846:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4850:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4851:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4851:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4852:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09794);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4861:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4865:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4866:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4866:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4867:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19825);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4876:1: rule__Application__PackageNameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Application__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4880:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4881:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4881:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4882:1: rulePackageName
            {
             before(grammarAccess.getApplicationAccess().getPackageNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Application__PackageNameAssignment_19856);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4891:1: rule__Application__AttributesAssignment_3 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4895:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4896:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4896:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4897:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39887);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4906:1: rule__Application__AttributesAssignment_4_1 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4910:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4911:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4911:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4912:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19918);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4921:1: rule__ApplicationMinSdk__MinSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationMinSdk__MinSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4925:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4926:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4926:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4927:1: RULE_INT
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19949); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4936:1: rule__ApplicationTargetSdk__TargetSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationTargetSdk__TargetSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4940:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4941:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4941:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4942:1: RULE_INT
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19980); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4951:1: rule__ApplicationCompileSdk__CompileSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationCompileSdk__CompileSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4955:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4956:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4956:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4957:1: RULE_INT
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_110011); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4966:1: rule__ApplicationPermissionList__PermissionsAssignment_2 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4970:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4971:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4971:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4972:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_210042);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4981:1: rule__ApplicationPermissionList__PermissionsAssignment_3_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4985:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4986:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4986:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4987:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_110073);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4996:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5000:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5001:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5001:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5002:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_210104);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5011:1: rule__ApplicationElementList__ElementsAssignment_3_1 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5015:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5016:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5016:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5017:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_110135);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5026:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ruleClassName ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5030:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5031:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5031:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5032:1: ruleClassName
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ApplicationMainActivity__LauncherActivityAssignment_110166);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5041:1: rule__Activity__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__Activity__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5045:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5046:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5046:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5047:1: ruleClassName
            {
             before(grammarAccess.getActivityAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__Activity__ClassNameAssignment_110197);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5056:1: rule__Activity__AttributesAssignment_3 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5060:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5061:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5061:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5062:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_310228);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5071:1: rule__Activity__AttributesAssignment_4_1 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5075:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5076:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5076:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5077:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110259);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5086:1: rule__BroadcastReceiver__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__BroadcastReceiver__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5090:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5091:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5091:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5092:1: ruleClassName
            {
             before(grammarAccess.getBroadcastReceiverAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__BroadcastReceiver__ClassNameAssignment_110290);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5101:1: rule__BroadcastReceiver__AttributesAssignment_3 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5105:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5106:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5106:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5107:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310321);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5116:1: rule__BroadcastReceiver__AttributesAssignment_4_1 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5120:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5121:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5121:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5122:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110352);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5131:1: rule__Service__ClassNameAssignment_1 : ( ruleClassName ) ;
    public final void rule__Service__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5135:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5136:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5136:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5137:1: ruleClassName
            {
             before(grammarAccess.getServiceAccess().getClassNameClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__Service__ClassNameAssignment_110383);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5146:1: rule__Service__AttributesAssignment_3 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5150:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5151:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5151:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5152:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310414);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5161:1: rule__Service__AttributesAssignment_4_1 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5165:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5166:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5166:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5167:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110445);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5176:1: rule__ElementEnabledAttribute__EnabledAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementEnabledAttribute__EnabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5180:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5181:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5181:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5182:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110476); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5191:1: rule__ElementExportedAttribute__ExportedAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementExportedAttribute__ExportedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5195:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5196:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5196:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5197:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110507); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5206:1: rule__ElementLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ElementLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5210:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5211:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5211:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5212:1: RULE_STRING
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110538); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5221:1: rule__ElementIntentList__IntentsAssignment_2 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5225:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5226:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5226:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5227:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210569);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5236:1: rule__ElementIntentList__IntentsAssignment_3_1 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5240:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5241:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5241:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5242:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110600);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5251:1: rule__ActivityParentAttribute__ParentAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActivityParentAttribute__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5255:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5256:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5256:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5257:1: ruleClassName
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActivityParentAttribute__ParentAssignment_110631);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5266:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5270:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5271:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5271:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5272:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210662);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5281:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5285:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5286:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5286:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5287:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110693);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5296:1: rule__Button__ButtonNameAssignment_1 : ( ruleJavaIdentifier ) ;
    public final void rule__Button__ButtonNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5300:1: ( ( ruleJavaIdentifier ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5301:1: ( ruleJavaIdentifier )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5301:1: ( ruleJavaIdentifier )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5302:1: ruleJavaIdentifier
            {
             before(grammarAccess.getButtonAccess().getButtonNameJavaIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaIdentifier_in_rule__Button__ButtonNameAssignment_110724);
            ruleJavaIdentifier();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getButtonNameJavaIdentifierParserRuleCall_1_0()); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5311:1: rule__Button__AttributesAssignment_3 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5315:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5316:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5316:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5317:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310755);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5326:1: rule__Button__AttributesAssignment_4_1 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5330:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5331:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5331:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5332:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110786);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5341:1: rule__ButtonLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ButtonLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5345:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5346:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5346:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5347:1: RULE_STRING
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110817); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5356:1: rule__ButtonActionAttribute__ActionAssignment_1 : ( ruleLayoutElementClickAction ) ;
    public final void rule__ButtonActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5360:1: ( ( ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5361:1: ( ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5361:1: ( ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5362:1: ruleLayoutElementClickAction
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110848);
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


    // $ANTLR start "rule__Text__TextAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5371:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5375:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5376:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5376:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5377:1: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110879); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__ActionAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5386:1: rule__BroadcastReceiverActionAttribute__ActionAssignment_1 : ( ruleBroadcastReceiverAction ) ;
    public final void rule__BroadcastReceiverActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5390:1: ( ( ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5391:1: ( ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5391:1: ( ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5392:1: ruleBroadcastReceiverAction
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110910);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5401:1: rule__ActionShowToast__ToastTextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionShowToast__ToastTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5405:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5406:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5406:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5407:1: RULE_STRING
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110941); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5416:1: rule__ActionStartActivity__ActivityAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActionStartActivity__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5420:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5421:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5421:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5422:1: ruleClassName
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActionStartActivity__ActivityAssignment_110972);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5431:1: rule__ActionStartService__ServiceAssignment_1 : ( ruleClassName ) ;
    public final void rule__ActionStartService__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5435:1: ( ( ruleClassName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5436:1: ( ruleClassName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5436:1: ( ruleClassName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5437:1: ruleClassName
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ActionStartService__ServiceAssignment_111003);
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
    public static final BitSet FOLLOW_ruleJavaIdentifier_in_entryRuleJavaIdentifier181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaIdentifier188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaIdentifier214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassName273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePermission812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleIntent1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSpacer2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService2399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__LayoutElement__Alternatives3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__03213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__03216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3300 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageNameAssignment_1_in_rule__Application__Group__1__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23580 = new BitSet(new long[]{0x00000000833C0000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group__2__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33642 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43702 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3732 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Application__Group__5__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03834 = new BitSet(new long[]{0x00000000833C0000L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_4__0__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03957 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__14016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl4043 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__04078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__04081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageName__Group_1__0__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__04200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__04203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ApplicationMinSdk__Group__0__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ApplicationTargetSdk__Group__0__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ApplicationCompileSdk__Group__0__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationPermissionList__Group__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationPermissionList__Group__1__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24693 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34753 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4783 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationPermissionList__Group__4__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__05006 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationElementList__Group__0__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__15068 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationElementList__Group__1__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__25130 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__25133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__35190 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__35193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl5220 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationElementList__Group__4__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05320 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ApplicationMainActivity__Group__0__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group__0__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ClassNameAssignment_1_in_rule__Activity__Group__1__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25688 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__2__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35750 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45810 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5840 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__5__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05942 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group_4__0__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__06065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__06068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BroadcastReceiver__Group__0__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__16127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__16130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__ClassNameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__26187 = new BitSet(new long[]{0x00000011E0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__26190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36249 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46309 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6339 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06441 = new BitSet(new long[]{0x00000011E0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Service__Group__0__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16626 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ClassNameAssignment_1_in_rule__Service__Group__1__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26686 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Service__Group__2__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36748 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46808 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6838 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Service__Group__5__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06940 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Service__Group_4__0__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__17002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__07063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__07066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ElementEnabledAttribute__Group__0__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__07186 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__07189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementExportedAttribute__Group__0__Impl7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07309 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ElementLabelAttribute__Group__0__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07432 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ElementIntentList__Group__0__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementIntentList__Group__1__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27556 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37616 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7646 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ElementIntentList__Group__4__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ActivityParentAttribute__Group__0__Impl7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07992 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ActivityLayoutAttribute__Group__0__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__18054 = new BitSet(new long[]{0x0000002800001000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__1__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__28116 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__28119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__38176 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__38179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl8206 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__48237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ActivityLayoutAttribute__Group__4__Impl8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08306 = new BitSet(new long[]{0x0000002800001000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Button__Group__0__Impl8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ButtonNameAssignment_1_in_rule__Button__Group__1__Impl8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28551 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Button__Group__2__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38613 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48673 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8703 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Button__Group__5__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08805 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Button__Group_4__0__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08928 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ButtonLabelAttribute__Group__0__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__09051 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__09054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ButtonActionAttribute__Group__0__Impl9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__19113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__09174 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__09177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Text__Group__0__Impl9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__19236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09297 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09420 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ActionShowToast__Group__0__Impl9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ActionStartActivity__Group__0__Impl9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ActionStartService__Group__0__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Application__PackageNameAssignment_19856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_110011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_210042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_110073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_210104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_110135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ApplicationMainActivity__LauncherActivityAssignment_110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__Activity__ClassNameAssignment_110197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_310228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__BroadcastReceiver__ClassNameAssignment_110290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__Service__ClassNameAssignment_110383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActivityParentAttribute__ParentAssignment_110631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaIdentifier_in_rule__Button__ButtonNameAssignment_110724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActionStartActivity__ActivityAssignment_110972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ActionStartService__ServiceAssignment_111003 = new BitSet(new long[]{0x0000000000000002L});

}