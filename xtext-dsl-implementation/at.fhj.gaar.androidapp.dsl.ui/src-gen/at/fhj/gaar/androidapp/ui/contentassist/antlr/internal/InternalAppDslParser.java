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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'spacer'", "','", "'application'", "'{'", "'}'", "'\"'", "'.'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
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


    // $ANTLR start "entryRulePackageName"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:116:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:117:1: ( rulePackageName EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:118:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName181);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName188); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:125:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:129:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( ( rule__PackageName__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:131:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:132:1: ( rule__PackageName__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:132:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName214);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:144:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:145:1: ( ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:146:1: ruleApplicationAttribute EOF
            {
             before(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute241);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute248); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:153:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:157:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:159:1: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:1: ( rule__ApplicationAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:2: rule__ApplicationAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute274);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:172:1: entryRuleApplicationMinSdk : ruleApplicationMinSdk EOF ;
    public final void entryRuleApplicationMinSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:173:1: ( ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:174:1: ruleApplicationMinSdk EOF
            {
             before(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk301);
            ruleApplicationMinSdk();

            state._fsp--;

             after(grammarAccess.getApplicationMinSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk308); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:181:1: ruleApplicationMinSdk : ( ( rule__ApplicationMinSdk__Group__0 ) ) ;
    public final void ruleApplicationMinSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:185:2: ( ( ( rule__ApplicationMinSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:187:1: ( rule__ApplicationMinSdk__Group__0 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:1: ( rule__ApplicationMinSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:2: rule__ApplicationMinSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk334);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:200:1: entryRuleApplicationTargetSdk : ruleApplicationTargetSdk EOF ;
    public final void entryRuleApplicationTargetSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:201:1: ( ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:202:1: ruleApplicationTargetSdk EOF
            {
             before(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk361);
            ruleApplicationTargetSdk();

            state._fsp--;

             after(grammarAccess.getApplicationTargetSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk368); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:209:1: ruleApplicationTargetSdk : ( ( rule__ApplicationTargetSdk__Group__0 ) ) ;
    public final void ruleApplicationTargetSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:213:2: ( ( ( rule__ApplicationTargetSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:215:1: ( rule__ApplicationTargetSdk__Group__0 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:1: ( rule__ApplicationTargetSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:2: rule__ApplicationTargetSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk394);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:228:1: entryRuleApplicationCompileSdk : ruleApplicationCompileSdk EOF ;
    public final void entryRuleApplicationCompileSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:229:1: ( ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:230:1: ruleApplicationCompileSdk EOF
            {
             before(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk421);
            ruleApplicationCompileSdk();

            state._fsp--;

             after(grammarAccess.getApplicationCompileSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk428); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:237:1: ruleApplicationCompileSdk : ( ( rule__ApplicationCompileSdk__Group__0 ) ) ;
    public final void ruleApplicationCompileSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:241:2: ( ( ( rule__ApplicationCompileSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:243:1: ( rule__ApplicationCompileSdk__Group__0 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:1: ( rule__ApplicationCompileSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:2: rule__ApplicationCompileSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk454);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:256:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:257:1: ( ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:258:1: ruleApplicationPermissionList EOF
            {
             before(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList481);
            ruleApplicationPermissionList();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList488); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:265:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:269:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:271:1: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:1: ( rule__ApplicationPermissionList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:2: rule__ApplicationPermissionList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList514);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:284:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:285:1: ( ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:286:1: ruleApplicationElementList EOF
            {
             before(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList541);
            ruleApplicationElementList();

            state._fsp--;

             after(grammarAccess.getApplicationElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList548); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:293:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:297:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationElementList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:299:1: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:1: ( rule__ApplicationElementList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:2: rule__ApplicationElementList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList574);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:312:1: entryRuleApplicationMainActivity : ruleApplicationMainActivity EOF ;
    public final void entryRuleApplicationMainActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:313:1: ( ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:314:1: ruleApplicationMainActivity EOF
            {
             before(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity601);
            ruleApplicationMainActivity();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity608); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:321:1: ruleApplicationMainActivity : ( ( rule__ApplicationMainActivity__Group__0 ) ) ;
    public final void ruleApplicationMainActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:325:2: ( ( ( rule__ApplicationMainActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:327:1: ( rule__ApplicationMainActivity__Group__0 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:1: ( rule__ApplicationMainActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:2: rule__ApplicationMainActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity634);
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


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:340:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:341:1: ( ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:342:1: ruleApplicationElement EOF
            {
             before(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement661);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement668); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:349:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:353:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:355:1: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:1: ( rule__ApplicationElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:2: rule__ApplicationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement694);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:368:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:369:1: ( ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:370:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity721);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity728); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:377:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:381:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__Activity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:383:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:1: ( rule__Activity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity754);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:396:1: entryRuleBroadcastReceiver : ruleBroadcastReceiver EOF ;
    public final void entryRuleBroadcastReceiver() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:397:1: ( ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:398:1: ruleBroadcastReceiver EOF
            {
             before(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver781);
            ruleBroadcastReceiver();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver788); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:405:1: ruleBroadcastReceiver : ( ( rule__BroadcastReceiver__Group__0 ) ) ;
    public final void ruleBroadcastReceiver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:409:2: ( ( ( rule__BroadcastReceiver__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:411:1: ( rule__BroadcastReceiver__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:1: ( rule__BroadcastReceiver__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:2: rule__BroadcastReceiver__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver814);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:424:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:425:1: ( ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:426:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService841);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService848); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:433:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:437:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Service__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Service__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:439:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:1: ( rule__Service__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService874);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:452:1: entryRuleActivityAttribute : ruleActivityAttribute EOF ;
    public final void entryRuleActivityAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:453:1: ( ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:454:1: ruleActivityAttribute EOF
            {
             before(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute901);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute908); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:461:1: ruleActivityAttribute : ( ( rule__ActivityAttribute__Alternatives ) ) ;
    public final void ruleActivityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:465:2: ( ( ( rule__ActivityAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__ActivityAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__ActivityAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:467:1: ( rule__ActivityAttribute__Alternatives )
            {
             before(grammarAccess.getActivityAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:1: ( rule__ActivityAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:2: rule__ActivityAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute934);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:480:1: entryRuleBroadcastReceiverAttribute : ruleBroadcastReceiverAttribute EOF ;
    public final void entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:481:1: ( ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:482:1: ruleBroadcastReceiverAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute961);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute968); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:489:1: ruleBroadcastReceiverAttribute : ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:493:2: ( ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:495:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:2: rule__BroadcastReceiverAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute994);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:508:1: entryRuleServiceAttribute : ruleServiceAttribute EOF ;
    public final void entryRuleServiceAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:509:1: ( ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:510:1: ruleServiceAttribute EOF
            {
             before(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1021);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute1028); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:517:1: ruleServiceAttribute : ( ( rule__ServiceAttribute__Alternatives ) ) ;
    public final void ruleServiceAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:521:2: ( ( ( rule__ServiceAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ServiceAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ServiceAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:523:1: ( rule__ServiceAttribute__Alternatives )
            {
             before(grammarAccess.getServiceAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:1: ( rule__ServiceAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:2: rule__ServiceAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1054);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:536:1: entryRuleElementEnabledAttribute : ruleElementEnabledAttribute EOF ;
    public final void entryRuleElementEnabledAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:537:1: ( ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:538:1: ruleElementEnabledAttribute EOF
            {
             before(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1081);
            ruleElementEnabledAttribute();

            state._fsp--;

             after(grammarAccess.getElementEnabledAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute1088); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:545:1: ruleElementEnabledAttribute : ( ( rule__ElementEnabledAttribute__Group__0 ) ) ;
    public final void ruleElementEnabledAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:549:2: ( ( ( rule__ElementEnabledAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:551:1: ( rule__ElementEnabledAttribute__Group__0 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:1: ( rule__ElementEnabledAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:2: rule__ElementEnabledAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1114);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:564:1: entryRuleElementExportedAttribute : ruleElementExportedAttribute EOF ;
    public final void entryRuleElementExportedAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:565:1: ( ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:566:1: ruleElementExportedAttribute EOF
            {
             before(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1141);
            ruleElementExportedAttribute();

            state._fsp--;

             after(grammarAccess.getElementExportedAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute1148); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:573:1: ruleElementExportedAttribute : ( ( rule__ElementExportedAttribute__Group__0 ) ) ;
    public final void ruleElementExportedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:577:2: ( ( ( rule__ElementExportedAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:579:1: ( rule__ElementExportedAttribute__Group__0 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:1: ( rule__ElementExportedAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:2: rule__ElementExportedAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1174);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:592:1: entryRuleElementLabelAttribute : ruleElementLabelAttribute EOF ;
    public final void entryRuleElementLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:593:1: ( ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:594:1: ruleElementLabelAttribute EOF
            {
             before(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1201);
            ruleElementLabelAttribute();

            state._fsp--;

             after(grammarAccess.getElementLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute1208); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:601:1: ruleElementLabelAttribute : ( ( rule__ElementLabelAttribute__Group__0 ) ) ;
    public final void ruleElementLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:605:2: ( ( ( rule__ElementLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:607:1: ( rule__ElementLabelAttribute__Group__0 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:1: ( rule__ElementLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:2: rule__ElementLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1234);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:620:1: entryRuleElementIntentList : ruleElementIntentList EOF ;
    public final void entryRuleElementIntentList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:621:1: ( ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:622:1: ruleElementIntentList EOF
            {
             before(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1261);
            ruleElementIntentList();

            state._fsp--;

             after(grammarAccess.getElementIntentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList1268); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:629:1: ruleElementIntentList : ( ( rule__ElementIntentList__Group__0 ) ) ;
    public final void ruleElementIntentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:633:2: ( ( ( rule__ElementIntentList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementIntentList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementIntentList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:635:1: ( rule__ElementIntentList__Group__0 )
            {
             before(grammarAccess.getElementIntentListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:1: ( rule__ElementIntentList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:2: rule__ElementIntentList__Group__0
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1294);
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


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:648:1: entryRuleActivityParentAttribute : ruleActivityParentAttribute EOF ;
    public final void entryRuleActivityParentAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:649:1: ( ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:650:1: ruleActivityParentAttribute EOF
            {
             before(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1321);
            ruleActivityParentAttribute();

            state._fsp--;

             after(grammarAccess.getActivityParentAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute1328); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:657:1: ruleActivityParentAttribute : ( ( rule__ActivityParentAttribute__Group__0 ) ) ;
    public final void ruleActivityParentAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:661:2: ( ( ( rule__ActivityParentAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:663:1: ( rule__ActivityParentAttribute__Group__0 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:1: ( rule__ActivityParentAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:2: rule__ActivityParentAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1354);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:676:1: entryRuleActivityLayoutAttribute : ruleActivityLayoutAttribute EOF ;
    public final void entryRuleActivityLayoutAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:677:1: ( ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:678:1: ruleActivityLayoutAttribute EOF
            {
             before(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1381);
            ruleActivityLayoutAttribute();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1388); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:685:1: ruleActivityLayoutAttribute : ( ( rule__ActivityLayoutAttribute__Group__0 ) ) ;
    public final void ruleActivityLayoutAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:689:2: ( ( ( rule__ActivityLayoutAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:691:1: ( rule__ActivityLayoutAttribute__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:1: ( rule__ActivityLayoutAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:2: rule__ActivityLayoutAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1414);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:704:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:705:1: ( ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:706:1: ruleLayoutElement EOF
            {
             before(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1441);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getLayoutElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement1448); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:713:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:717:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__LayoutElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__LayoutElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:719:1: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:1: ( rule__LayoutElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:2: rule__LayoutElement__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1474);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:732:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:733:1: ( ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:734:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1501);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1508); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:741:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:745:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__Button__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__Button__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:747:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:1: ( rule__Button__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton1534);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:760:1: entryRuleButtonAttribute : ruleButtonAttribute EOF ;
    public final void entryRuleButtonAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:761:1: ( ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:762:1: ruleButtonAttribute EOF
            {
             before(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1561);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute1568); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:769:1: ruleButtonAttribute : ( ( rule__ButtonAttribute__Alternatives ) ) ;
    public final void ruleButtonAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:773:2: ( ( ( rule__ButtonAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ButtonAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__ButtonAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:775:1: ( rule__ButtonAttribute__Alternatives )
            {
             before(grammarAccess.getButtonAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:1: ( rule__ButtonAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:2: rule__ButtonAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1594);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:788:1: entryRuleButtonLabelAttribute : ruleButtonLabelAttribute EOF ;
    public final void entryRuleButtonLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:789:1: ( ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:790:1: ruleButtonLabelAttribute EOF
            {
             before(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1621);
            ruleButtonLabelAttribute();

            state._fsp--;

             after(grammarAccess.getButtonLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute1628); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:797:1: ruleButtonLabelAttribute : ( ( rule__ButtonLabelAttribute__Group__0 ) ) ;
    public final void ruleButtonLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:801:2: ( ( ( rule__ButtonLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:803:1: ( rule__ButtonLabelAttribute__Group__0 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:1: ( rule__ButtonLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:2: rule__ButtonLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1654);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:816:1: entryRuleButtonActionAttribute : ruleButtonActionAttribute EOF ;
    public final void entryRuleButtonActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:817:1: ( ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:818:1: ruleButtonActionAttribute EOF
            {
             before(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1681);
            ruleButtonActionAttribute();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute1688); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:825:1: ruleButtonActionAttribute : ( ( rule__ButtonActionAttribute__Group__0 ) ) ;
    public final void ruleButtonActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:829:2: ( ( ( rule__ButtonActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:831:1: ( rule__ButtonActionAttribute__Group__0 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:1: ( rule__ButtonActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:2: rule__ButtonActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1714);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:844:1: entryRuleSpacer : ruleSpacer EOF ;
    public final void entryRuleSpacer() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:845:1: ( ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:846:1: ruleSpacer EOF
            {
             before(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer1741);
            ruleSpacer();

            state._fsp--;

             after(grammarAccess.getSpacerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer1748); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:853:1: ruleSpacer : ( 'spacer' ) ;
    public final void ruleSpacer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:857:2: ( ( 'spacer' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( 'spacer' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:859:1: 'spacer'
            {
             before(grammarAccess.getSpacerAccess().getSpacerKeyword()); 
            match(input,12,FOLLOW_12_in_ruleSpacer1775); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:874:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:875:1: ( ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:876:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1803);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1810); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:883:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:887:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:1: ( ( rule__Text__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:1: ( ( rule__Text__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:889:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:890:1: ( rule__Text__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:890:2: rule__Text__Group__0
            {
            pushFollow(FOLLOW_rule__Text__Group__0_in_ruleText1836);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:902:1: entryRuleLayoutElementClickAction : ruleLayoutElementClickAction EOF ;
    public final void entryRuleLayoutElementClickAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:903:1: ( ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:904:1: ruleLayoutElementClickAction EOF
            {
             before(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1863);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getLayoutElementClickActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction1870); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:911:1: ruleLayoutElementClickAction : ( ( rule__LayoutElementClickAction__Alternatives ) ) ;
    public final void ruleLayoutElementClickAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:915:2: ( ( ( rule__LayoutElementClickAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:917:1: ( rule__LayoutElementClickAction__Alternatives )
            {
             before(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:918:1: ( rule__LayoutElementClickAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:918:2: rule__LayoutElementClickAction__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1896);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:930:1: entryRuleBroadcastReceiverActionAttribute : ruleBroadcastReceiverActionAttribute EOF ;
    public final void entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:931:1: ( ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:932:1: ruleBroadcastReceiverActionAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1923);
            ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1930); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:939:1: ruleBroadcastReceiverActionAttribute : ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) ;
    public final void ruleBroadcastReceiverActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:943:2: ( ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:945:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:946:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:946:2: rule__BroadcastReceiverActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute1956);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:958:1: entryRuleBroadcastReceiverAction : ruleBroadcastReceiverAction EOF ;
    public final void entryRuleBroadcastReceiverAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:959:1: ( ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:960:1: ruleBroadcastReceiverAction EOF
            {
             before(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction1983);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction1990); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:967:1: ruleBroadcastReceiverAction : ( ( rule__BroadcastReceiverAction__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:971:2: ( ( ( rule__BroadcastReceiverAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:973:1: ( rule__BroadcastReceiverAction__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:974:1: ( rule__BroadcastReceiverAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:974:2: rule__BroadcastReceiverAction__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2016);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:986:1: entryRuleActionShowToast : ruleActionShowToast EOF ;
    public final void entryRuleActionShowToast() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:987:1: ( ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:988:1: ruleActionShowToast EOF
            {
             before(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2043);
            ruleActionShowToast();

            state._fsp--;

             after(grammarAccess.getActionShowToastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast2050); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:995:1: ruleActionShowToast : ( ( rule__ActionShowToast__Group__0 ) ) ;
    public final void ruleActionShowToast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:999:2: ( ( ( rule__ActionShowToast__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( ( rule__ActionShowToast__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( ( rule__ActionShowToast__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1001:1: ( rule__ActionShowToast__Group__0 )
            {
             before(grammarAccess.getActionShowToastAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1002:1: ( rule__ActionShowToast__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1002:2: rule__ActionShowToast__Group__0
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2076);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1014:1: entryRuleActionStartActivity : ruleActionStartActivity EOF ;
    public final void entryRuleActionStartActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1015:1: ( ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1016:1: ruleActionStartActivity EOF
            {
             before(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2103);
            ruleActionStartActivity();

            state._fsp--;

             after(grammarAccess.getActionStartActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity2110); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1023:1: ruleActionStartActivity : ( ( rule__ActionStartActivity__Group__0 ) ) ;
    public final void ruleActionStartActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1027:2: ( ( ( rule__ActionStartActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( ( rule__ActionStartActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( ( rule__ActionStartActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1029:1: ( rule__ActionStartActivity__Group__0 )
            {
             before(grammarAccess.getActionStartActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1030:1: ( rule__ActionStartActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1030:2: rule__ActionStartActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2136);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1042:1: entryRuleActionStartService : ruleActionStartService EOF ;
    public final void entryRuleActionStartService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1043:1: ( ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1044:1: ruleActionStartService EOF
            {
             before(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService2163);
            ruleActionStartService();

            state._fsp--;

             after(grammarAccess.getActionStartServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService2170); 

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1051:1: ruleActionStartService : ( ( rule__ActionStartService__Group__0 ) ) ;
    public final void ruleActionStartService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1055:2: ( ( ( rule__ActionStartService__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( ( rule__ActionStartService__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( ( rule__ActionStartService__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1057:1: ( rule__ActionStartService__Group__0 )
            {
             before(grammarAccess.getActionStartServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1058:1: ( rule__ActionStartService__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1058:2: rule__ActionStartService__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2196);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1070:1: rule__ApplicationAttribute__Alternatives : ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1074:1: ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 25:
                {
                alt1=6;
                }
                break;
            case 26:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1075:1: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1075:1: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1076:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2232);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1081:6: ( ruleApplicationMinSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1081:6: ( ruleApplicationMinSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1082:1: ruleApplicationMinSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2249);
                    ruleApplicationMinSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1087:6: ( ruleApplicationTargetSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1087:6: ( ruleApplicationTargetSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1088:1: ruleApplicationTargetSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2266);
                    ruleApplicationTargetSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1093:6: ( ruleApplicationCompileSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1093:6: ( ruleApplicationCompileSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1094:1: ruleApplicationCompileSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2283);
                    ruleApplicationCompileSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1099:6: ( ruleApplicationPermissionList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1099:6: ( ruleApplicationPermissionList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1100:1: ruleApplicationPermissionList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2300);
                    ruleApplicationPermissionList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1105:6: ( ruleApplicationElementList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1105:6: ( ruleApplicationElementList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1106:1: ruleApplicationElementList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2317);
                    ruleApplicationElementList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1111:6: ( ruleApplicationMainActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1111:6: ( ruleApplicationMainActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1112:1: ruleApplicationMainActivity
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2334);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1122:1: rule__ApplicationElement__Alternatives : ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1126:1: ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1127:1: ( ruleActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1127:1: ( ruleActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1128:1: ruleActivity
                    {
                     before(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2366);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1133:6: ( ruleBroadcastReceiver )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1133:6: ( ruleBroadcastReceiver )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1134:1: ruleBroadcastReceiver
                    {
                     before(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2383);
                    ruleBroadcastReceiver();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1139:6: ( ruleService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1139:6: ( ruleService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1140:1: ruleService
                    {
                     before(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2400);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1150:1: rule__ActivityAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) );
    public final void rule__ActivityAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1154:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 34:
                {
                alt3=5;
                }
                break;
            case 35:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1155:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1155:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1156:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2432);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1161:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1161:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1162:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2449);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1167:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1167:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1168:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2466);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1173:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1173:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1174:1: ruleElementIntentList
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2483);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1179:6: ( ruleActivityParentAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1179:6: ( ruleActivityParentAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1180:1: ruleActivityParentAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2500);
                    ruleActivityParentAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1185:6: ( ruleActivityLayoutAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1185:6: ( ruleActivityLayoutAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1186:1: ruleActivityLayoutAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2517);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1196:1: rule__BroadcastReceiverAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) );
    public final void rule__BroadcastReceiverAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1200:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            case 37:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1201:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1201:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1202:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2549);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1207:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1207:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1208:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2566);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1213:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1213:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1214:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2583);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1219:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1219:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1220:1: ruleElementIntentList
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2600);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1225:6: ( ruleBroadcastReceiverActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1225:6: ( ruleBroadcastReceiverActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1226:1: ruleBroadcastReceiverActionAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2617);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1236:1: rule__ServiceAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) );
    public final void rule__ServiceAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1240:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 33:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1241:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1241:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1242:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2649);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1247:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1247:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1248:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2666);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1253:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1253:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1254:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2683);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1259:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1259:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1260:1: ruleElementIntentList
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2700);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1270:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1274:1: ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 38:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1275:1: ( ruleButton )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1275:1: ( ruleButton )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1276:1: ruleButton
                    {
                     before(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2732);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1281:6: ( ruleSpacer )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1281:6: ( ruleSpacer )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1282:1: ruleSpacer
                    {
                     before(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2749);
                    ruleSpacer();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1287:6: ( ruleText )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1287:6: ( ruleText )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1288:1: ruleText
                    {
                     before(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleText_in_rule__LayoutElement__Alternatives2766);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1298:1: rule__ButtonAttribute__Alternatives : ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) );
    public final void rule__ButtonAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1302:1: ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1303:1: ( ruleButtonLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1303:1: ( ruleButtonLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1304:1: ruleButtonLabelAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2798);
                    ruleButtonLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1309:6: ( ruleButtonActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1309:6: ( ruleButtonActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1310:1: ruleButtonActionAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2815);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1320:1: rule__LayoutElementClickAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__LayoutElementClickAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1324:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1325:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1325:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1326:1: ruleActionShowToast
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2847);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1331:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1331:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1332:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2864);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1337:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1337:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1338:1: ruleActionStartService
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2881);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1348:1: rule__BroadcastReceiverAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__BroadcastReceiverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1352:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1353:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1353:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1354:1: ruleActionShowToast
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2913);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1359:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1359:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1360:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2930);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1365:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1365:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1366:1: ruleActionStartService
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives2947);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1378:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1382:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1383:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__02977);
            rule__AndroidAppProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__02980);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1390:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1394:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1395:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1395:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1396:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1397:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1397:2: rule__AndroidAppProject__ApplicationsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3007);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1407:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1411:1: ( rule__AndroidAppProject__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1412:2: rule__AndroidAppProject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13037);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1418:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1422:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1424:1: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1425:1: ( rule__AndroidAppProject__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1425:2: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3064);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1439:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1443:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1444:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03099);
            rule__AndroidAppProject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03102);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1451:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1455:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1456:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1456:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1457:1: ','
            {
             before(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3130); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1470:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1474:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1475:2: rule__AndroidAppProject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13161);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1481:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1485:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1486:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1486:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1487:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1488:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1488:2: rule__AndroidAppProject__ApplicationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3188);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1502:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1506:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1507:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03222);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03225);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1514:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1518:1: ( ( 'application' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1519:1: ( 'application' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1519:1: ( 'application' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1520:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__0__Impl3253); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1533:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1537:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1538:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13284);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13287);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1545:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1549:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1550:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1550:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1551:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1552:1: ( rule__Application__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1552:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl3314);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1562:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1566:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1567:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23344);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23347);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1574:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1578:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1579:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1579:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1580:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group__2__Impl3375); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1593:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1597:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1598:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33406);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33409);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1605:1: rule__Application__Group__3__Impl : ( ( rule__Application__AttributesAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1609:1: ( ( ( rule__Application__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1610:1: ( ( rule__Application__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1610:1: ( ( rule__Application__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1611:1: ( rule__Application__AttributesAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1612:1: ( rule__Application__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1612:2: rule__Application__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3436);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1622:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1626:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1627:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43466);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43469);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1634:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1638:1: ( ( ( rule__Application__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1639:1: ( ( rule__Application__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1639:1: ( ( rule__Application__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1640:1: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1641:1: ( rule__Application__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1641:2: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3496);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1651:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1655:1: ( rule__Application__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1656:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53527);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1662:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1666:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1667:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1667:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1668:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Application__Group__5__Impl3555); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1693:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1697:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1698:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03598);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03601);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1705:1: rule__Application__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1709:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1710:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1710:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1711:1: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_4__0__Impl3629); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1724:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1728:1: ( rule__Application__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1729:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13660);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1735:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__AttributesAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1739:1: ( ( ( rule__Application__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1740:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1740:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1741:1: ( rule__Application__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1742:1: ( rule__Application__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1742:2: rule__Application__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3687);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1756:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1760:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1761:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03721);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03724);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1768:1: rule__PackageName__Group__0__Impl : ( '\"' ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1772:1: ( ( '\"' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1773:1: ( '\"' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1773:1: ( '\"' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1774:1: '\"'
            {
             before(grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PackageName__Group__0__Impl3752); 
             after(grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1787:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl rule__PackageName__Group__2 ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1791:1: ( rule__PackageName__Group__1__Impl rule__PackageName__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1792:2: rule__PackageName__Group__1__Impl rule__PackageName__Group__2
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13783);
            rule__PackageName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__2_in_rule__PackageName__Group__13786);
            rule__PackageName__Group__2();

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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1799:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 ) ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1803:1: ( ( ( rule__PackageName__Group_1__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1804:1: ( ( rule__PackageName__Group_1__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1804:1: ( ( rule__PackageName__Group_1__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1805:1: ( rule__PackageName__Group_1__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1806:1: ( rule__PackageName__Group_1__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1806:2: rule__PackageName__Group_1__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3813);
            rule__PackageName__Group_1__0();

            state._fsp--;


            }

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


    // $ANTLR start "rule__PackageName__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1816:1: rule__PackageName__Group__2 : rule__PackageName__Group__2__Impl ;
    public final void rule__PackageName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1820:1: ( rule__PackageName__Group__2__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1821:2: rule__PackageName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__2__Impl_in_rule__PackageName__Group__23843);
            rule__PackageName__Group__2__Impl();

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
    // $ANTLR end "rule__PackageName__Group__2"


    // $ANTLR start "rule__PackageName__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1827:1: rule__PackageName__Group__2__Impl : ( '\"' ) ;
    public final void rule__PackageName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1831:1: ( ( '\"' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1832:1: ( '\"' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1832:1: ( '\"' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1833:1: '\"'
            {
             before(grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__PackageName__Group__2__Impl3871); 
             after(grammarAccess.getPackageNameAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__2__Impl"


    // $ANTLR start "rule__PackageName__Group_1__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1852:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1856:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1857:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03908);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03911);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1864:1: rule__PackageName__Group_1__0__Impl : ( ( rule__PackageName__NameAssignment_1_0 ) ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1868:1: ( ( ( rule__PackageName__NameAssignment_1_0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1869:1: ( ( rule__PackageName__NameAssignment_1_0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1869:1: ( ( rule__PackageName__NameAssignment_1_0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1870:1: ( rule__PackageName__NameAssignment_1_0 )
            {
             before(grammarAccess.getPackageNameAccess().getNameAssignment_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1871:1: ( rule__PackageName__NameAssignment_1_0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1871:2: rule__PackageName__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__PackageName__NameAssignment_1_0_in_rule__PackageName__Group_1__0__Impl3938);
            rule__PackageName__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getNameAssignment_1_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1881:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1885:1: ( rule__PackageName__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1886:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13968);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1892:1: rule__PackageName__Group_1__1__Impl : ( ( rule__PackageName__Group_1_1__0 )* ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1896:1: ( ( ( rule__PackageName__Group_1_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1897:1: ( ( rule__PackageName__Group_1_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1897:1: ( ( rule__PackageName__Group_1_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1898:1: ( rule__PackageName__Group_1_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1899:1: ( rule__PackageName__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1899:2: rule__PackageName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1_1__0_in_rule__PackageName__Group_1__1__Impl3995);
            	    rule__PackageName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageNameAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageName__Group_1_1__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1913:1: rule__PackageName__Group_1_1__0 : rule__PackageName__Group_1_1__0__Impl rule__PackageName__Group_1_1__1 ;
    public final void rule__PackageName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1917:1: ( rule__PackageName__Group_1_1__0__Impl rule__PackageName__Group_1_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1918:2: rule__PackageName__Group_1_1__0__Impl rule__PackageName__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1_1__0__Impl_in_rule__PackageName__Group_1_1__04030);
            rule__PackageName__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1_1__1_in_rule__PackageName__Group_1_1__04033);
            rule__PackageName__Group_1_1__1();

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
    // $ANTLR end "rule__PackageName__Group_1_1__0"


    // $ANTLR start "rule__PackageName__Group_1_1__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1925:1: rule__PackageName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1929:1: ( ( '.' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1930:1: ( '.' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1930:1: ( '.' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1931:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_1_0()); 
            match(input,18,FOLLOW_18_in_rule__PackageName__Group_1_1__0__Impl4061); 
             after(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1_1__0__Impl"


    // $ANTLR start "rule__PackageName__Group_1_1__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1944:1: rule__PackageName__Group_1_1__1 : rule__PackageName__Group_1_1__1__Impl ;
    public final void rule__PackageName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1948:1: ( rule__PackageName__Group_1_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1949:2: rule__PackageName__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1_1__1__Impl_in_rule__PackageName__Group_1_1__14092);
            rule__PackageName__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group_1_1__1"


    // $ANTLR start "rule__PackageName__Group_1_1__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1955:1: rule__PackageName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1959:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1960:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1960:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1961:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1_1__1__Impl4119); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1_1__1__Impl"


    // $ANTLR start "rule__ApplicationMinSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1976:1: rule__ApplicationMinSdk__Group__0 : rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 ;
    public final void rule__ApplicationMinSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1980:1: ( rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1981:2: rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__04152);
            rule__ApplicationMinSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__04155);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1988:1: rule__ApplicationMinSdk__Group__0__Impl : ( 'min-sdk' ) ;
    public final void rule__ApplicationMinSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1992:1: ( ( 'min-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1993:1: ( 'min-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1993:1: ( 'min-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1994:1: 'min-sdk'
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ApplicationMinSdk__Group__0__Impl4183); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2007:1: rule__ApplicationMinSdk__Group__1 : rule__ApplicationMinSdk__Group__1__Impl ;
    public final void rule__ApplicationMinSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2011:1: ( rule__ApplicationMinSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2012:2: rule__ApplicationMinSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14214);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2018:1: rule__ApplicationMinSdk__Group__1__Impl : ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) ;
    public final void rule__ApplicationMinSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2022:1: ( ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2023:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2023:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2024:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2025:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2025:2: rule__ApplicationMinSdk__MinSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4241);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2039:1: rule__ApplicationTargetSdk__Group__0 : rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 ;
    public final void rule__ApplicationTargetSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2043:1: ( rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2044:2: rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04275);
            rule__ApplicationTargetSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04278);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2051:1: rule__ApplicationTargetSdk__Group__0__Impl : ( 'target-sdk' ) ;
    public final void rule__ApplicationTargetSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2055:1: ( ( 'target-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2056:1: ( 'target-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2056:1: ( 'target-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2057:1: 'target-sdk'
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ApplicationTargetSdk__Group__0__Impl4306); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2070:1: rule__ApplicationTargetSdk__Group__1 : rule__ApplicationTargetSdk__Group__1__Impl ;
    public final void rule__ApplicationTargetSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2074:1: ( rule__ApplicationTargetSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2075:2: rule__ApplicationTargetSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14337);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2081:1: rule__ApplicationTargetSdk__Group__1__Impl : ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) ;
    public final void rule__ApplicationTargetSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2085:1: ( ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2086:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2086:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2087:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2088:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2088:2: rule__ApplicationTargetSdk__TargetSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4364);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2102:1: rule__ApplicationCompileSdk__Group__0 : rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 ;
    public final void rule__ApplicationCompileSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2106:1: ( rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2107:2: rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04398);
            rule__ApplicationCompileSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04401);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2114:1: rule__ApplicationCompileSdk__Group__0__Impl : ( 'compile-sdk' ) ;
    public final void rule__ApplicationCompileSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2118:1: ( ( 'compile-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2119:1: ( 'compile-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2119:1: ( 'compile-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2120:1: 'compile-sdk'
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationCompileSdk__Group__0__Impl4429); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2133:1: rule__ApplicationCompileSdk__Group__1 : rule__ApplicationCompileSdk__Group__1__Impl ;
    public final void rule__ApplicationCompileSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2137:1: ( rule__ApplicationCompileSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2138:2: rule__ApplicationCompileSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14460);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2144:1: rule__ApplicationCompileSdk__Group__1__Impl : ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) ;
    public final void rule__ApplicationCompileSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2148:1: ( ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2149:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2149:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2150:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2151:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2151:2: rule__ApplicationCompileSdk__CompileSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4487);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2165:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2169:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2170:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04521);
            rule__ApplicationPermissionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04524);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2177:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2181:1: ( ( 'permissions' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2182:1: ( 'permissions' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2182:1: ( 'permissions' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2183:1: 'permissions'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationPermissionList__Group__0__Impl4552); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2196:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2200:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2201:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14583);
            rule__ApplicationPermissionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14586);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2208:1: rule__ApplicationPermissionList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2212:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2213:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2213:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2214:1: '['
            {
             before(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationPermissionList__Group__1__Impl4614); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2227:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2231:1: ( rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2232:2: rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24645);
            rule__ApplicationPermissionList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24648);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2239:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2243:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2244:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2244:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2245:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2246:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2246:2: rule__ApplicationPermissionList__PermissionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4675);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2256:1: rule__ApplicationPermissionList__Group__3 : rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 ;
    public final void rule__ApplicationPermissionList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2260:1: ( rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2261:2: rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34705);
            rule__ApplicationPermissionList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34708);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2268:1: rule__ApplicationPermissionList__Group__3__Impl : ( ( rule__ApplicationPermissionList__Group_3__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2272:1: ( ( ( rule__ApplicationPermissionList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2273:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2273:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2274:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2275:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2275:2: rule__ApplicationPermissionList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4735);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2285:1: rule__ApplicationPermissionList__Group__4 : rule__ApplicationPermissionList__Group__4__Impl ;
    public final void rule__ApplicationPermissionList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2289:1: ( rule__ApplicationPermissionList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2290:2: rule__ApplicationPermissionList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44766);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2296:1: rule__ApplicationPermissionList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationPermissionList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2300:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2301:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2301:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2302:1: ']'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationPermissionList__Group__4__Impl4794); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2325:1: rule__ApplicationPermissionList__Group_3__0 : rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 ;
    public final void rule__ApplicationPermissionList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2329:1: ( rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2330:2: rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04835);
            rule__ApplicationPermissionList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04838);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2337:1: rule__ApplicationPermissionList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2341:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2342:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2342:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2343:1: ','
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4866); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2356:1: rule__ApplicationPermissionList__Group_3__1 : rule__ApplicationPermissionList__Group_3__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2360:1: ( rule__ApplicationPermissionList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2361:2: rule__ApplicationPermissionList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14897);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2367:1: rule__ApplicationPermissionList__Group_3__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2371:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2372:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2372:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2373:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2374:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2374:2: rule__ApplicationPermissionList__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4924);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2388:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2392:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2393:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04958);
            rule__ApplicationElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04961);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2400:1: rule__ApplicationElementList__Group__0__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2404:1: ( ( 'elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2405:1: ( 'elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2405:1: ( 'elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2406:1: 'elements'
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ApplicationElementList__Group__0__Impl4989); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2419:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2423:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2424:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__15020);
            rule__ApplicationElementList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__15023);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2431:1: rule__ApplicationElementList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2435:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2436:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2436:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2437:1: '['
            {
             before(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationElementList__Group__1__Impl5051); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2450:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2454:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2455:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__25082);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__25085);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2462:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2466:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2467:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2467:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2468:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2469:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2469:2: rule__ApplicationElementList__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl5112);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2479:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2483:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2484:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__35142);
            rule__ApplicationElementList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__35145);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2491:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__Group_3__0 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2495:1: ( ( ( rule__ApplicationElementList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2496:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2496:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2497:1: ( rule__ApplicationElementList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2498:1: ( rule__ApplicationElementList__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2498:2: rule__ApplicationElementList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl5172);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2508:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2512:1: ( rule__ApplicationElementList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2513:2: rule__ApplicationElementList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45203);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2519:1: rule__ApplicationElementList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2523:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2524:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2524:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2525:1: ']'
            {
             before(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationElementList__Group__4__Impl5231); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2548:1: rule__ApplicationElementList__Group_3__0 : rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 ;
    public final void rule__ApplicationElementList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2552:1: ( rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2553:2: rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05272);
            rule__ApplicationElementList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05275);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2560:1: rule__ApplicationElementList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationElementList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2564:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2565:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2565:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2566:1: ','
            {
             before(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl5303); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2579:1: rule__ApplicationElementList__Group_3__1 : rule__ApplicationElementList__Group_3__1__Impl ;
    public final void rule__ApplicationElementList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2583:1: ( rule__ApplicationElementList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2584:2: rule__ApplicationElementList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15334);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2590:1: rule__ApplicationElementList__Group_3__1__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) ;
    public final void rule__ApplicationElementList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2594:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2595:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2595:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2596:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2597:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2597:2: rule__ApplicationElementList__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5361);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2611:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2615:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2616:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05395);
            rule__ApplicationMainActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05398);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2623:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2627:1: ( ( 'main-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2628:1: ( 'main-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2628:1: ( 'main-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2629:1: 'main-activity'
            {
             before(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ApplicationMainActivity__Group__0__Impl5426); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2642:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2646:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2647:2: rule__ApplicationMainActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15457);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2653:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2657:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2658:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2658:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2659:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2660:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2660:2: rule__ApplicationMainActivity__LauncherActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5484);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2674:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2678:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2679:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05518);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05521);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2686:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2690:1: ( ( 'activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2691:1: ( 'activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2691:1: ( 'activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2692:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group__0__Impl5549); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2705:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2709:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2710:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15580);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15583);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2717:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2721:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2722:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2722:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2723:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2724:1: ( rule__Activity__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2724:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl5610);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2734:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2738:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2739:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25640);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25643);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2746:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2750:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2751:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2751:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2752:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Activity__Group__2__Impl5671); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2765:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2769:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2770:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35702);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35705);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2777:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__AttributesAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2781:1: ( ( ( rule__Activity__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2782:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2782:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2783:1: ( rule__Activity__AttributesAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:1: ( rule__Activity__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:2: rule__Activity__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5732);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2794:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2798:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2799:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45762);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45765);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2806:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2810:1: ( ( ( rule__Activity__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2811:1: ( ( rule__Activity__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2811:1: ( ( rule__Activity__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2812:1: ( rule__Activity__Group_4__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2813:1: ( rule__Activity__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2813:2: rule__Activity__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5792);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2823:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2827:1: ( rule__Activity__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2828:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55823);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2834:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2838:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2839:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2839:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2840:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Activity__Group__5__Impl5851); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2865:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2869:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2870:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05894);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05897);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2877:1: rule__Activity__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2881:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2882:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2882:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2883:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Activity__Group_4__0__Impl5925); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2896:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2900:1: ( rule__Activity__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2901:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15956);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2907:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__AttributesAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2911:1: ( ( ( rule__Activity__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2912:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2912:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2913:1: ( rule__Activity__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2914:1: ( rule__Activity__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2914:2: rule__Activity__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5983);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2928:1: rule__BroadcastReceiver__Group__0 : rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 ;
    public final void rule__BroadcastReceiver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2932:1: ( rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2933:2: rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__06017);
            rule__BroadcastReceiver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__06020);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2940:1: rule__BroadcastReceiver__Group__0__Impl : ( 'receiver' ) ;
    public final void rule__BroadcastReceiver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2944:1: ( ( 'receiver' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2945:1: ( 'receiver' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2945:1: ( 'receiver' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2946:1: 'receiver'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__BroadcastReceiver__Group__0__Impl6048); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2959:1: rule__BroadcastReceiver__Group__1 : rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 ;
    public final void rule__BroadcastReceiver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2963:1: ( rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2964:2: rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__16079);
            rule__BroadcastReceiver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__16082);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2971:1: rule__BroadcastReceiver__Group__1__Impl : ( ( rule__BroadcastReceiver__NameAssignment_1 ) ) ;
    public final void rule__BroadcastReceiver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2975:1: ( ( ( rule__BroadcastReceiver__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2976:1: ( ( rule__BroadcastReceiver__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2976:1: ( ( rule__BroadcastReceiver__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2977:1: ( rule__BroadcastReceiver__NameAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2978:1: ( rule__BroadcastReceiver__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2978:2: rule__BroadcastReceiver__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__NameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl6109);
            rule__BroadcastReceiver__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2988:1: rule__BroadcastReceiver__Group__2 : rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 ;
    public final void rule__BroadcastReceiver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2992:1: ( rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2993:2: rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__26139);
            rule__BroadcastReceiver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__26142);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3000:1: rule__BroadcastReceiver__Group__2__Impl : ( '{' ) ;
    public final void rule__BroadcastReceiver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3004:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3005:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3005:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3006:1: '{'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl6170); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3019:1: rule__BroadcastReceiver__Group__3 : rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 ;
    public final void rule__BroadcastReceiver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3023:1: ( rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3024:2: rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36201);
            rule__BroadcastReceiver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36204);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3031:1: rule__BroadcastReceiver__Group__3__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) ;
    public final void rule__BroadcastReceiver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3035:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3036:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3036:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3037:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:2: rule__BroadcastReceiver__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6231);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3048:1: rule__BroadcastReceiver__Group__4 : rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 ;
    public final void rule__BroadcastReceiver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3052:1: ( rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3053:2: rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46261);
            rule__BroadcastReceiver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46264);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3060:1: rule__BroadcastReceiver__Group__4__Impl : ( ( rule__BroadcastReceiver__Group_4__0 )* ) ;
    public final void rule__BroadcastReceiver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3064:1: ( ( ( rule__BroadcastReceiver__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3065:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3065:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3066:1: ( rule__BroadcastReceiver__Group_4__0 )*
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3067:1: ( rule__BroadcastReceiver__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3067:2: rule__BroadcastReceiver__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6291);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3077:1: rule__BroadcastReceiver__Group__5 : rule__BroadcastReceiver__Group__5__Impl ;
    public final void rule__BroadcastReceiver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3081:1: ( rule__BroadcastReceiver__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3082:2: rule__BroadcastReceiver__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56322);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3088:1: rule__BroadcastReceiver__Group__5__Impl : ( '}' ) ;
    public final void rule__BroadcastReceiver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3092:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3093:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3093:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3094:1: '}'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl6350); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3119:1: rule__BroadcastReceiver__Group_4__0 : rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 ;
    public final void rule__BroadcastReceiver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3123:1: ( rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3124:2: rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06393);
            rule__BroadcastReceiver__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06396);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3131:1: rule__BroadcastReceiver__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BroadcastReceiver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3135:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3136:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3136:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3137:1: ','
            {
             before(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6424); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3150:1: rule__BroadcastReceiver__Group_4__1 : rule__BroadcastReceiver__Group_4__1__Impl ;
    public final void rule__BroadcastReceiver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3154:1: ( rule__BroadcastReceiver__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3155:2: rule__BroadcastReceiver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16455);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3161:1: rule__BroadcastReceiver__Group_4__1__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) ;
    public final void rule__BroadcastReceiver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3165:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3166:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3166:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3167:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3168:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3168:2: rule__BroadcastReceiver__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6482);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3182:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3186:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3187:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06516);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06519);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3194:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3198:1: ( ( 'service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3199:1: ( 'service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3199:1: ( 'service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3200:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Service__Group__0__Impl6547); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3213:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3217:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3218:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16578);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16581);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3225:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3229:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3230:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3230:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3231:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3232:1: ( rule__Service__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3232:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6608);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3242:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3246:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3247:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26638);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26641);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3254:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3258:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3259:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3259:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3260:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Service__Group__2__Impl6669); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3273:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3277:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3278:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36700);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36703);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3285:1: rule__Service__Group__3__Impl : ( ( rule__Service__AttributesAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3289:1: ( ( ( rule__Service__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3290:1: ( ( rule__Service__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3290:1: ( ( rule__Service__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3291:1: ( rule__Service__AttributesAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3292:1: ( rule__Service__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3292:2: rule__Service__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6730);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3302:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3306:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3307:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46760);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46763);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3314:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3318:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3319:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3319:1: ( ( rule__Service__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3320:1: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3321:1: ( rule__Service__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3321:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6790);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3331:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3335:1: ( rule__Service__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3336:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56821);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3342:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3346:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3347:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3347:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3348:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Service__Group__5__Impl6849); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3373:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3377:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3378:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06892);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06895);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3385:1: rule__Service__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3389:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3390:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3390:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3391:1: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Service__Group_4__0__Impl6923); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3404:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3408:1: ( rule__Service__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3409:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16954);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3415:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__AttributesAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3419:1: ( ( ( rule__Service__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3420:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3420:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3421:1: ( rule__Service__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3422:1: ( rule__Service__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3422:2: rule__Service__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6981);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3436:1: rule__ElementEnabledAttribute__Group__0 : rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 ;
    public final void rule__ElementEnabledAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3440:1: ( rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3441:2: rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__07015);
            rule__ElementEnabledAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__07018);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3448:1: rule__ElementEnabledAttribute__Group__0__Impl : ( 'enabled' ) ;
    public final void rule__ElementEnabledAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3452:1: ( ( 'enabled' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3453:1: ( 'enabled' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3453:1: ( 'enabled' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3454:1: 'enabled'
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementEnabledAttribute__Group__0__Impl7046); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3467:1: rule__ElementEnabledAttribute__Group__1 : rule__ElementEnabledAttribute__Group__1__Impl ;
    public final void rule__ElementEnabledAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3471:1: ( rule__ElementEnabledAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3472:2: rule__ElementEnabledAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__17077);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3478:1: rule__ElementEnabledAttribute__Group__1__Impl : ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) ;
    public final void rule__ElementEnabledAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3482:1: ( ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3483:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3483:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3484:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3485:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3485:2: rule__ElementEnabledAttribute__EnabledAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl7104);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3499:1: rule__ElementExportedAttribute__Group__0 : rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 ;
    public final void rule__ElementExportedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3503:1: ( rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3504:2: rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__07138);
            rule__ElementExportedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__07141);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3511:1: rule__ElementExportedAttribute__Group__0__Impl : ( 'exported' ) ;
    public final void rule__ElementExportedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3515:1: ( ( 'exported' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3516:1: ( 'exported' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3516:1: ( 'exported' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3517:1: 'exported'
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ElementExportedAttribute__Group__0__Impl7169); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3530:1: rule__ElementExportedAttribute__Group__1 : rule__ElementExportedAttribute__Group__1__Impl ;
    public final void rule__ElementExportedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3534:1: ( rule__ElementExportedAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3535:2: rule__ElementExportedAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17200);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3541:1: rule__ElementExportedAttribute__Group__1__Impl : ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) ;
    public final void rule__ElementExportedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3545:1: ( ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3546:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3546:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3547:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3548:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3548:2: rule__ElementExportedAttribute__ExportedAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7227);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3562:1: rule__ElementLabelAttribute__Group__0 : rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 ;
    public final void rule__ElementLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3566:1: ( rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3567:2: rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07261);
            rule__ElementLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07264);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3574:1: rule__ElementLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ElementLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3578:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3579:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3579:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3580:1: 'title'
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ElementLabelAttribute__Group__0__Impl7292); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3593:1: rule__ElementLabelAttribute__Group__1 : rule__ElementLabelAttribute__Group__1__Impl ;
    public final void rule__ElementLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3597:1: ( rule__ElementLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3598:2: rule__ElementLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17323);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3604:1: rule__ElementLabelAttribute__Group__1__Impl : ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ElementLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3608:1: ( ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3609:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3609:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3610:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3611:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3611:2: rule__ElementLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7350);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3625:1: rule__ElementIntentList__Group__0 : rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 ;
    public final void rule__ElementIntentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3629:1: ( rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3630:2: rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07384);
            rule__ElementIntentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07387);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3637:1: rule__ElementIntentList__Group__0__Impl : ( 'intents' ) ;
    public final void rule__ElementIntentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3641:1: ( ( 'intents' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3642:1: ( 'intents' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3642:1: ( 'intents' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3643:1: 'intents'
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ElementIntentList__Group__0__Impl7415); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3656:1: rule__ElementIntentList__Group__1 : rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 ;
    public final void rule__ElementIntentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3660:1: ( rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3661:2: rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17446);
            rule__ElementIntentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17449);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3668:1: rule__ElementIntentList__Group__1__Impl : ( '[' ) ;
    public final void rule__ElementIntentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3672:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3673:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3673:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3674:1: '['
            {
             before(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ElementIntentList__Group__1__Impl7477); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3687:1: rule__ElementIntentList__Group__2 : rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 ;
    public final void rule__ElementIntentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3691:1: ( rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3692:2: rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27508);
            rule__ElementIntentList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27511);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3699:1: rule__ElementIntentList__Group__2__Impl : ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) ;
    public final void rule__ElementIntentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3703:1: ( ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3704:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3704:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3705:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3706:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3706:2: rule__ElementIntentList__IntentsAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7538);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3716:1: rule__ElementIntentList__Group__3 : rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 ;
    public final void rule__ElementIntentList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3720:1: ( rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3721:2: rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37568);
            rule__ElementIntentList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37571);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3728:1: rule__ElementIntentList__Group__3__Impl : ( ( rule__ElementIntentList__Group_3__0 )* ) ;
    public final void rule__ElementIntentList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3732:1: ( ( ( rule__ElementIntentList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3733:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3733:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3734:1: ( rule__ElementIntentList__Group_3__0 )*
            {
             before(grammarAccess.getElementIntentListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3735:1: ( rule__ElementIntentList__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3735:2: rule__ElementIntentList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7598);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3745:1: rule__ElementIntentList__Group__4 : rule__ElementIntentList__Group__4__Impl ;
    public final void rule__ElementIntentList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3749:1: ( rule__ElementIntentList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3750:2: rule__ElementIntentList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47629);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3756:1: rule__ElementIntentList__Group__4__Impl : ( ']' ) ;
    public final void rule__ElementIntentList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3760:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3761:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3761:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3762:1: ']'
            {
             before(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ElementIntentList__Group__4__Impl7657); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3785:1: rule__ElementIntentList__Group_3__0 : rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 ;
    public final void rule__ElementIntentList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3789:1: ( rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3790:2: rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07698);
            rule__ElementIntentList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07701);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3797:1: rule__ElementIntentList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ElementIntentList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3801:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3802:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3802:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3803:1: ','
            {
             before(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7729); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3816:1: rule__ElementIntentList__Group_3__1 : rule__ElementIntentList__Group_3__1__Impl ;
    public final void rule__ElementIntentList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3820:1: ( rule__ElementIntentList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3821:2: rule__ElementIntentList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17760);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3827:1: rule__ElementIntentList__Group_3__1__Impl : ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) ;
    public final void rule__ElementIntentList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3831:1: ( ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3832:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3832:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3833:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3834:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3834:2: rule__ElementIntentList__IntentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7787);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3848:1: rule__ActivityParentAttribute__Group__0 : rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 ;
    public final void rule__ActivityParentAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3852:1: ( rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3853:2: rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07821);
            rule__ActivityParentAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07824);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3860:1: rule__ActivityParentAttribute__Group__0__Impl : ( 'parent' ) ;
    public final void rule__ActivityParentAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3864:1: ( ( 'parent' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3865:1: ( 'parent' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3865:1: ( 'parent' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3866:1: 'parent'
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ActivityParentAttribute__Group__0__Impl7852); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3879:1: rule__ActivityParentAttribute__Group__1 : rule__ActivityParentAttribute__Group__1__Impl ;
    public final void rule__ActivityParentAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3883:1: ( rule__ActivityParentAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3884:2: rule__ActivityParentAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17883);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3890:1: rule__ActivityParentAttribute__Group__1__Impl : ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) ;
    public final void rule__ActivityParentAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3894:1: ( ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3895:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3895:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3896:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3897:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3897:2: rule__ActivityParentAttribute__ParentAssignment_1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7910);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3911:1: rule__ActivityLayoutAttribute__Group__0 : rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 ;
    public final void rule__ActivityLayoutAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3915:1: ( rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3916:2: rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07944);
            rule__ActivityLayoutAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07947);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3923:1: rule__ActivityLayoutAttribute__Group__0__Impl : ( 'layout-elements' ) ;
    public final void rule__ActivityLayoutAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3927:1: ( ( 'layout-elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3928:1: ( 'layout-elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3928:1: ( 'layout-elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3929:1: 'layout-elements'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ActivityLayoutAttribute__Group__0__Impl7975); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3942:1: rule__ActivityLayoutAttribute__Group__1 : rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 ;
    public final void rule__ActivityLayoutAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3946:1: ( rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3947:2: rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__18006);
            rule__ActivityLayoutAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__18009);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3954:1: rule__ActivityLayoutAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__ActivityLayoutAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3958:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3959:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3959:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3960:1: '['
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ActivityLayoutAttribute__Group__1__Impl8037); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3973:1: rule__ActivityLayoutAttribute__Group__2 : rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 ;
    public final void rule__ActivityLayoutAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3977:1: ( rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3978:2: rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__28068);
            rule__ActivityLayoutAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__28071);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3985:1: rule__ActivityLayoutAttribute__Group__2__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3989:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3991:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3992:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3992:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl8098);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4002:1: rule__ActivityLayoutAttribute__Group__3 : rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 ;
    public final void rule__ActivityLayoutAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4006:1: ( rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4007:2: rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__38128);
            rule__ActivityLayoutAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__38131);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4014:1: rule__ActivityLayoutAttribute__Group__3__Impl : ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) ;
    public final void rule__ActivityLayoutAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4018:1: ( ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4019:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4019:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4020:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4021:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4021:2: rule__ActivityLayoutAttribute__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl8158);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4031:1: rule__ActivityLayoutAttribute__Group__4 : rule__ActivityLayoutAttribute__Group__4__Impl ;
    public final void rule__ActivityLayoutAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4035:1: ( rule__ActivityLayoutAttribute__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4036:2: rule__ActivityLayoutAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__48189);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4042:1: rule__ActivityLayoutAttribute__Group__4__Impl : ( ']' ) ;
    public final void rule__ActivityLayoutAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4046:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4047:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4047:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4048:1: ']'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ActivityLayoutAttribute__Group__4__Impl8217); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4071:1: rule__ActivityLayoutAttribute__Group_3__0 : rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 ;
    public final void rule__ActivityLayoutAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4075:1: ( rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4076:2: rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08258);
            rule__ActivityLayoutAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08261);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4083:1: rule__ActivityLayoutAttribute__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4087:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4088:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4088:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4089:1: ','
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8289); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4102:1: rule__ActivityLayoutAttribute__Group_3__1 : rule__ActivityLayoutAttribute__Group_3__1__Impl ;
    public final void rule__ActivityLayoutAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4106:1: ( rule__ActivityLayoutAttribute__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4107:2: rule__ActivityLayoutAttribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18320);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4113:1: rule__ActivityLayoutAttribute__Group_3__1__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4117:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4118:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4118:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4119:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4120:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4120:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8347);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4134:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4138:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4139:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08381);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08384);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4146:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4150:1: ( ( 'button' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4151:1: ( 'button' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4151:1: ( 'button' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4152:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Button__Group__0__Impl8412); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4165:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4169:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4170:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18443);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18446);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4177:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4181:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4182:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4182:1: ( ( rule__Button__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4183:1: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4184:1: ( rule__Button__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4184:2: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl8473);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4194:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4198:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4199:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28503);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28506);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4206:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4210:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4211:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4211:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4212:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Button__Group__2__Impl8534); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4225:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4229:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4230:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38565);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38568);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4237:1: rule__Button__Group__3__Impl : ( ( rule__Button__AttributesAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4241:1: ( ( ( rule__Button__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4242:1: ( ( rule__Button__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4242:1: ( ( rule__Button__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4243:1: ( rule__Button__AttributesAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4244:1: ( rule__Button__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4244:2: rule__Button__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8595);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4254:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4258:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4259:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48625);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48628);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4266:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )* ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4270:1: ( ( ( rule__Button__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4271:1: ( ( rule__Button__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4271:1: ( ( rule__Button__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4272:1: ( rule__Button__Group_4__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4273:1: ( rule__Button__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4273:2: rule__Button__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8655);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4283:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4287:1: ( rule__Button__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4288:2: rule__Button__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58686);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4294:1: rule__Button__Group__5__Impl : ( '}' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4298:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4299:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4299:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4300:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Button__Group__5__Impl8714); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4325:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4329:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4330:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
            {
            pushFollow(FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08757);
            rule__Button__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08760);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4337:1: rule__Button__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4341:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4342:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4342:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4343:1: ','
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Button__Group_4__0__Impl8788); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4356:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4360:1: ( rule__Button__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4361:2: rule__Button__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18819);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4367:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__AttributesAssignment_4_1 ) ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4371:1: ( ( ( rule__Button__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4372:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4372:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4373:1: ( rule__Button__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4374:1: ( rule__Button__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4374:2: rule__Button__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8846);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4388:1: rule__ButtonLabelAttribute__Group__0 : rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 ;
    public final void rule__ButtonLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4392:1: ( rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4393:2: rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08880);
            rule__ButtonLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08883);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4400:1: rule__ButtonLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ButtonLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4404:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4405:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4405:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4406:1: 'title'
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ButtonLabelAttribute__Group__0__Impl8911); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4419:1: rule__ButtonLabelAttribute__Group__1 : rule__ButtonLabelAttribute__Group__1__Impl ;
    public final void rule__ButtonLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4423:1: ( rule__ButtonLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4424:2: rule__ButtonLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18942);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4430:1: rule__ButtonLabelAttribute__Group__1__Impl : ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ButtonLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4434:1: ( ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4435:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4435:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4436:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4437:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4437:2: rule__ButtonLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8969);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4451:1: rule__ButtonActionAttribute__Group__0 : rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 ;
    public final void rule__ButtonActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4455:1: ( rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4456:2: rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__09003);
            rule__ButtonActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__09006);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4463:1: rule__ButtonActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__ButtonActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4467:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4468:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4468:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4469:1: 'action'
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ButtonActionAttribute__Group__0__Impl9034); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4482:1: rule__ButtonActionAttribute__Group__1 : rule__ButtonActionAttribute__Group__1__Impl ;
    public final void rule__ButtonActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4486:1: ( rule__ButtonActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4487:2: rule__ButtonActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__19065);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4493:1: rule__ButtonActionAttribute__Group__1__Impl : ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__ButtonActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4497:1: ( ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4498:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4498:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4499:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4500:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4500:2: rule__ButtonActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl9092);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4514:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4518:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4519:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__09126);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Text__Group__1_in_rule__Text__Group__09129);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4526:1: rule__Text__Group__0__Impl : ( 'text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4530:1: ( ( 'text' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4531:1: ( 'text' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4531:1: ( 'text' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4532:1: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Text__Group__0__Impl9157); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4545:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4549:1: ( rule__Text__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4550:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__19188);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4556:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4560:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4561:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4561:1: ( ( rule__Text__TextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4562:1: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4563:1: ( rule__Text__TextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4563:2: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl9215);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4577:1: rule__BroadcastReceiverActionAttribute__Group__0 : rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4581:1: ( rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4582:2: rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09249);
            rule__BroadcastReceiverActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09252);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4589:1: rule__BroadcastReceiverActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4593:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4594:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4594:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4595:1: 'action'
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9280); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4608:1: rule__BroadcastReceiverActionAttribute__Group__1 : rule__BroadcastReceiverActionAttribute__Group__1__Impl ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4612:1: ( rule__BroadcastReceiverActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4613:2: rule__BroadcastReceiverActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19311);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4619:1: rule__BroadcastReceiverActionAttribute__Group__1__Impl : ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4623:1: ( ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4624:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4624:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4625:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4626:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4626:2: rule__BroadcastReceiverActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9338);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4640:1: rule__ActionShowToast__Group__0 : rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 ;
    public final void rule__ActionShowToast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4644:1: ( rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4645:2: rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09372);
            rule__ActionShowToast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09375);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4652:1: rule__ActionShowToast__Group__0__Impl : ( 'show-toast' ) ;
    public final void rule__ActionShowToast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4656:1: ( ( 'show-toast' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4657:1: ( 'show-toast' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4657:1: ( 'show-toast' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4658:1: 'show-toast'
            {
             before(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ActionShowToast__Group__0__Impl9403); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4671:1: rule__ActionShowToast__Group__1 : rule__ActionShowToast__Group__1__Impl ;
    public final void rule__ActionShowToast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4675:1: ( rule__ActionShowToast__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4676:2: rule__ActionShowToast__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19434);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4682:1: rule__ActionShowToast__Group__1__Impl : ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) ;
    public final void rule__ActionShowToast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4686:1: ( ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4687:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4687:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4688:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4689:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4689:2: rule__ActionShowToast__ToastTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9461);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4703:1: rule__ActionStartActivity__Group__0 : rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 ;
    public final void rule__ActionStartActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4707:1: ( rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4708:2: rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09495);
            rule__ActionStartActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09498);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4715:1: rule__ActionStartActivity__Group__0__Impl : ( 'start-activity' ) ;
    public final void rule__ActionStartActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4719:1: ( ( 'start-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4720:1: ( 'start-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4720:1: ( 'start-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4721:1: 'start-activity'
            {
             before(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ActionStartActivity__Group__0__Impl9526); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4734:1: rule__ActionStartActivity__Group__1 : rule__ActionStartActivity__Group__1__Impl ;
    public final void rule__ActionStartActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4738:1: ( rule__ActionStartActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4739:2: rule__ActionStartActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19557);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4745:1: rule__ActionStartActivity__Group__1__Impl : ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) ;
    public final void rule__ActionStartActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4749:1: ( ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4750:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4750:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4751:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4752:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4752:2: rule__ActionStartActivity__ActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9584);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4766:1: rule__ActionStartService__Group__0 : rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 ;
    public final void rule__ActionStartService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4770:1: ( rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4771:2: rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09618);
            rule__ActionStartService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09621);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4778:1: rule__ActionStartService__Group__0__Impl : ( 'start-service' ) ;
    public final void rule__ActionStartService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4782:1: ( ( 'start-service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4783:1: ( 'start-service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4783:1: ( 'start-service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4784:1: 'start-service'
            {
             before(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ActionStartService__Group__0__Impl9649); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4797:1: rule__ActionStartService__Group__1 : rule__ActionStartService__Group__1__Impl ;
    public final void rule__ActionStartService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4801:1: ( rule__ActionStartService__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4802:2: rule__ActionStartService__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19680);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4808:1: rule__ActionStartService__Group__1__Impl : ( ( rule__ActionStartService__ServiceAssignment_1 ) ) ;
    public final void rule__ActionStartService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4812:1: ( ( ( rule__ActionStartService__ServiceAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4813:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4813:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4814:1: ( rule__ActionStartService__ServiceAssignment_1 )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4815:1: ( rule__ActionStartService__ServiceAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4815:2: rule__ActionStartService__ServiceAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9707);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4830:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4834:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4835:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4835:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4836:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09746);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4845:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4849:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4850:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4850:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4851:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19777);
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


    // $ANTLR start "rule__Application__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4860:1: rule__Application__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4864:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4865:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4865:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4866:1: rulePackageName
            {
             before(grammarAccess.getApplicationAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Application__NameAssignment_19808);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNamePackageNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4875:1: rule__Application__AttributesAssignment_3 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4879:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4880:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4880:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4881:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39839);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4890:1: rule__Application__AttributesAssignment_4_1 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4894:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4895:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4895:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4896:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19870);
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


    // $ANTLR start "rule__PackageName__NameAssignment_1_0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4905:1: rule__PackageName__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__PackageName__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4909:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4910:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4910:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4911:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__NameAssignment_1_09901); 
             after(grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__NameAssignment_1_0"


    // $ANTLR start "rule__ApplicationMinSdk__MinSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4920:1: rule__ApplicationMinSdk__MinSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationMinSdk__MinSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4924:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4925:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4925:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4926:1: RULE_INT
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19932); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4935:1: rule__ApplicationTargetSdk__TargetSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationTargetSdk__TargetSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4939:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4940:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4940:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4941:1: RULE_INT
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19963); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4950:1: rule__ApplicationCompileSdk__CompileSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationCompileSdk__CompileSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4954:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4955:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4955:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4956:1: RULE_INT
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19994); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4965:1: rule__ApplicationPermissionList__PermissionsAssignment_2 : ( rulePackageName ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4969:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4970:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4970:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4971:1: rulePackageName
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__ApplicationPermissionList__PermissionsAssignment_210025);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4980:1: rule__ApplicationPermissionList__PermissionsAssignment_3_1 : ( rulePackageName ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4984:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4985:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4985:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4986:1: rulePackageName
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__ApplicationPermissionList__PermissionsAssignment_3_110056);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPackageNameParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4995:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4999:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5000:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5000:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5001:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_210087);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5010:1: rule__ApplicationElementList__ElementsAssignment_3_1 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5014:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5015:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5015:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5016:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_110118);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5025:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5029:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5030:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5030:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5031:1: ( RULE_ID )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5032:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5033:1: RULE_ID
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationMainActivity__LauncherActivityAssignment_110153); 
             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5044:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5048:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5049:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5049:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5050:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_110188); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5059:1: rule__Activity__AttributesAssignment_3 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5063:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5064:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5064:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5065:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_310219);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5074:1: rule__Activity__AttributesAssignment_4_1 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5078:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5079:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5079:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5080:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110250);
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


    // $ANTLR start "rule__BroadcastReceiver__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5089:1: rule__BroadcastReceiver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BroadcastReceiver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5093:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5094:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5094:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5095:1: RULE_ID
            {
             before(grammarAccess.getBroadcastReceiverAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BroadcastReceiver__NameAssignment_110281); 
             after(grammarAccess.getBroadcastReceiverAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BroadcastReceiver__NameAssignment_1"


    // $ANTLR start "rule__BroadcastReceiver__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5104:1: rule__BroadcastReceiver__AttributesAssignment_3 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5108:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5109:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5109:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5110:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310312);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5119:1: rule__BroadcastReceiver__AttributesAssignment_4_1 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5123:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5124:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5124:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5125:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110343);
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


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5134:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5138:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5139:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5139:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5140:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_110374); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5149:1: rule__Service__AttributesAssignment_3 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5153:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5154:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5154:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5155:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310405);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5164:1: rule__Service__AttributesAssignment_4_1 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5168:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5169:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5169:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5170:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110436);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5179:1: rule__ElementEnabledAttribute__EnabledAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementEnabledAttribute__EnabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5183:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5184:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5184:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5185:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110467); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5194:1: rule__ElementExportedAttribute__ExportedAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementExportedAttribute__ExportedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5198:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5199:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5199:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5200:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110498); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5209:1: rule__ElementLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ElementLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5213:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5214:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5214:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5215:1: RULE_STRING
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110529); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5224:1: rule__ElementIntentList__IntentsAssignment_2 : ( rulePackageName ) ;
    public final void rule__ElementIntentList__IntentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5228:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5229:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5229:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5230:1: rulePackageName
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__ElementIntentList__IntentsAssignment_210560);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5239:1: rule__ElementIntentList__IntentsAssignment_3_1 : ( rulePackageName ) ;
    public final void rule__ElementIntentList__IntentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5243:1: ( ( rulePackageName ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5244:1: ( rulePackageName )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5244:1: ( rulePackageName )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5245:1: rulePackageName
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__ElementIntentList__IntentsAssignment_3_110591);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsPackageNameParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5254:1: rule__ActivityParentAttribute__ParentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActivityParentAttribute__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5258:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5259:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5259:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5260:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5261:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5262:1: RULE_ID
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityParentAttribute__ParentAssignment_110626); 
             after(grammarAccess.getActivityParentAttributeAccess().getParentActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActivityParentAttributeAccess().getParentActivityCrossReference_1_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5273:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5277:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5278:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5278:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5279:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210661);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5288:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5292:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5293:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5293:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5294:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110692);
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


    // $ANTLR start "rule__Button__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5303:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5307:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5308:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5308:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5309:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__NameAssignment_110723); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5318:1: rule__Button__AttributesAssignment_3 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5322:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5323:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5323:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5324:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310754);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5333:1: rule__Button__AttributesAssignment_4_1 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5337:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5338:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5338:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5339:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110785);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5348:1: rule__ButtonLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ButtonLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5352:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5353:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5353:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5354:1: RULE_STRING
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110816); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5363:1: rule__ButtonActionAttribute__ActionAssignment_1 : ( ruleLayoutElementClickAction ) ;
    public final void rule__ButtonActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5367:1: ( ( ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5368:1: ( ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5368:1: ( ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5369:1: ruleLayoutElementClickAction
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110847);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5378:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5382:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5383:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5383:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5384:1: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110878); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5393:1: rule__BroadcastReceiverActionAttribute__ActionAssignment_1 : ( ruleBroadcastReceiverAction ) ;
    public final void rule__BroadcastReceiverActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5397:1: ( ( ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5398:1: ( ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5398:1: ( ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5399:1: ruleBroadcastReceiverAction
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110909);
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5408:1: rule__ActionShowToast__ToastTextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionShowToast__ToastTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5412:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5413:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5413:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5414:1: RULE_STRING
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110940); 
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5423:1: rule__ActionStartActivity__ActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionStartActivity__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5427:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5428:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5428:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5429:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5430:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5431:1: RULE_ID
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionStartActivity__ActivityAssignment_110975); 
             after(grammarAccess.getActionStartActivityAccess().getActivityActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionStartActivityAccess().getActivityActivityCrossReference_1_0()); 

            }


            }

        }
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
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5442:1: rule__ActionStartService__ServiceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionStartService__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5446:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5447:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5447:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5448:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceServiceCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5449:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5450:1: RULE_ID
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionStartService__ServiceAssignment_111014); 
             after(grammarAccess.getActionStartServiceAccess().getServiceServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionStartServiceAccess().getServiceServiceCrossReference_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSpacer1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__LayoutElement__Alternatives2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__02977 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__02980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3064 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03099 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__0__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13284 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23344 = new BitSet(new long[]{0x0000000106780000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group__2__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33406 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43466 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3496 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Application__Group__5__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03598 = new BitSet(new long[]{0x0000000106780000L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_4__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__03721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__03724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageName__Group__0__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__2_in_rule__PackageName__Group__13786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__2__Impl_in_rule__PackageName__Group__23843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageName__Group__2__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__NameAssignment_1_0_in_rule__PackageName__Group_1__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1_1__0_in_rule__PackageName__Group_1__1__Impl3995 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1_1__0__Impl_in_rule__PackageName__Group_1_1__04030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1_1__1_in_rule__PackageName__Group_1_1__04033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageName__Group_1_1__0__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1_1__1__Impl_in_rule__PackageName__Group_1_1__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1_1__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__04152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__04155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ApplicationMinSdk__Group__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__04275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__04278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ApplicationTargetSdk__Group__0__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationCompileSdk__Group__0__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04521 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationPermissionList__Group__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14583 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationPermissionList__Group__1__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24645 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34705 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4735 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationPermissionList__Group__4__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04835 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04958 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ApplicationElementList__Group__0__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__15020 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationElementList__Group__1__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__25082 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__25085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__35142 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__35145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl5172 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__45203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationElementList__Group__4__Impl5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__05272 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ApplicationMainActivity__Group__0__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group__0__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15580 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25640 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__2__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35702 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45762 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5792 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__5__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05894 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group_4__0__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__06017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BroadcastReceiver__Group__0__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__16079 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__16082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__NameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__26139 = new BitSet(new long[]{0x00000023C0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__26142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__36201 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__36204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__46261 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__46264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl6291 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__56322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06393 = new BitSet(new long[]{0x00000023C0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Service__Group__0__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26638 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Service__Group__2__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36700 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46760 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6790 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Service__Group__5__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06892 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Service__Group_4__0__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__07015 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__07018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementEnabledAttribute__Group__0__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__17077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__07138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__07141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ElementExportedAttribute__Group__0__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__17200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__07261 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__07264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ElementLabelAttribute__Group__0__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07384 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ElementIntentList__Group__0__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ElementIntentList__Group__1__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27508 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37568 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7598 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ElementIntentList__Group__4__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07698 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ActivityParentAttribute__Group__0__Impl7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07944 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ActivityLayoutAttribute__Group__0__Impl7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__18006 = new BitSet(new long[]{0x0000005000001000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__18009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ActivityLayoutAttribute__Group__1__Impl8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__28068 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__28071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__38128 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__38131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl8158 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__48189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActivityLayoutAttribute__Group__4__Impl8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__08258 = new BitSet(new long[]{0x0000005000001000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__08261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__18320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Button__Group__0__Impl8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18443 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28503 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Button__Group__2__Impl8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38565 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48625 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8655 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Button__Group__5__Impl8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08757 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Button__Group_4__0__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08880 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ButtonLabelAttribute__Group__0__Impl8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__09003 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__09006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ButtonActionAttribute__Group__0__Impl9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__19065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__09126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__09129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Text__Group__0__Impl9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__19188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09249 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09372 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ActionShowToast__Group__0__Impl9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ActionStartActivity__Group__0__Impl9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ActionStartService__Group__0__Impl9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Application__NameAssignment_19808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__NameAssignment_1_09901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__ApplicationPermissionList__PermissionsAssignment_210025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__ApplicationPermissionList__PermissionsAssignment_3_110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_210087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_110118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationMainActivity__LauncherActivityAssignment_110153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_110188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_310219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BroadcastReceiver__NameAssignment_110281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_110374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__ElementIntentList__IntentsAssignment_210560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__ElementIntentList__IntentsAssignment_3_110591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityParentAttribute__ParentAssignment_110626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__NameAssignment_110723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionStartActivity__ActivityAssignment_110975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionStartService__ServiceAssignment_111014 = new BitSet(new long[]{0x0000000000000002L});

}