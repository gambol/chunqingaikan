package safiap.framework.sdk; class SAFFramework { void a() { int a;
a=0;// .class public Lsafiap/framework/sdk/SAFFramework;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final RESULT_CODE_MALICIOUS_PLUGIN:I = -0xc8
a=0;// 
a=0;// .field public static final RESULT_CODE_MANDATORY_UPDATE:I = -0x12c
a=0;// 
a=0;// .field public static final RESULT_CODE_PLUGIN_NOT_EXIST:I = -0x1
a=0;// 
a=0;// .field public static final RESULT_CODE_PLUGIN_OK:I = 0x0
a=0;// 
a=0;// .field public static final RESULT_CODE_PLUGIN_OPTIONAL_UPDATE:I = -0x1f4
a=0;// 
a=0;// .field public static final RESULT_CODE_PLUGIN_TO_INSTALL:I = -0x190
a=0;// 
a=0;// .field public static final RESULT_CODE_SERVICE_EXCEPTION:I = -0x258
a=0;// 
a=0;// .field public static final STATUS_ERROR_WITH_INVALID_CONTEXT:I = 0x4
a=0;// 
a=0;// .field public static final STATUS_INIT_SUCCESS:I = 0x0
a=0;// 
a=0;// .field public static final STATUS_MALICIOUS_SERVICE:I = 0x2
a=0;// 
a=0;// .field public static final STATUS_SERVICE_ALREADY_INITED:I = 0x3
a=0;// 
a=0;// .field public static final STATUS_SERVICE_NOT_INSTALLED:I = 0x1
a=0;// 
a=0;// .field private static a:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "IAPSAFFramework"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final c:Ljava/lang/Object;
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;// .field private f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;// .field private i:Lsafiap/framework/sdk/PluginInstallListener;
a=0;// 
a=0;// .field private j:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field private k:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field private l:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const-string v0, "SAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->c:Ljava/lang/Object;
a=0;// 
a=0;//     .line 82
a=0;//     iput-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 83
a=0;//     iput-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     .line 88
a=0;//     iput-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->i:Lsafiap/framework/sdk/PluginInstallListener;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework$1;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/sdk/SAFFramework$1;-><init>(Lsafiap/framework/sdk/SAFFramework;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$1;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->j:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework$2;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/sdk/SAFFramework$2;-><init>(Lsafiap/framework/sdk/SAFFramework;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$2;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->k:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework$3;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/sdk/SAFFramework$3;-><init>(Lsafiap/framework/sdk/SAFFramework;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$3;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->l:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     .line 97
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Service;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Activity;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/sdk/SAFFramework;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->c:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/sdk/SAFFramework;Lsafiap/framework/sdk/ISAFFramework;)Lsafiap/framework/sdk/ISAFFramework;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/sdk/SAFFramework;Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;)Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "Bind SAF Framework service  ....................."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->ACTION_CALLER_PKG:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->j:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 189
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 190
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A StatusCode:510001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/sdk/SAFFramework;Z)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/sdk/SAFFramework;Lsafiap/framework/sdk/ISAFFramework;)Lsafiap/framework/sdk/ISAFFramework;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/sdk/SAFFramework;)Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lsafiap/framework/sdk/SAFFramework;)Lsafiap/framework/sdk/PluginInstallListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->i:Lsafiap/framework/sdk/PluginInstallListener;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/PluginInstallListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancel(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 423
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v1, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 429
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 430
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Framework service instance is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 434
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 435
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510008"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 436
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 433
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lsafiap/framework/sdk/ISAFFramework;->cancel(Ljava/lang/String;)Z
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lsafiap/framework/sdk/ISAFFramework;->cancel(Ljava/lang/String;)Z
a=0;//     :try_end_2
a=0;//     .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 445
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 446
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510008"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 462
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 463
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Framework service instance is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 481
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 466
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->cancelAll()Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 468
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510009"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 474
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->cancelAll()Z
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 478
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 479
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510009"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 480
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkServiceVersion()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 539
a=0;//     .line 540
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->checkServiceVersion()Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 550
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 543
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 545
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public cleanup()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->c:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 241
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->j:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     .line 244
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 247
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     iget-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->k:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     .line 249
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public downloadPlugin(Lsafiap/framework/sdk/PluginInstallListener;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 380
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 355
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/SAFFramework;->i:Lsafiap/framework/sdk/PluginInstallListener;
a=0;// 
a=0;//     .line 357
a=0;//     iget-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 359
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 360
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "Framework service instance is null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 365
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A StatusCode:510003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->l:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     invoke-interface {v0, v1, p2}, Lsafiap/framework/sdk/ISAFFramework;->downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->l:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     invoke-interface {v0, v1, p2}, Lsafiap/framework/sdk/ISAFFramework;->downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 374
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 375
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A StatusCode:510003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 376
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected finalize()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     .line 179
a=0;//     invoke-super {p0}, Ljava/lang/Object;->finalize()V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getFrameworkVersion()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 493
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 494
a=0;//     #v0=(Byte);
a=0;//     iget-boolean v1, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 496
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 497
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Framework service instance is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 518
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 499
a=0;//     :cond_1
a=0;//     #v0=(Byte);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->getFrameworkVersion()I
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     :catch_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 502
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510010"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 507
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 509
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->getFrameworkVersion()I
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 511
a=0;//     :catch_1
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 512
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510010"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 513
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getIAPDedicateActionName()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 307
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Framework SDK: host pkgname = :"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 309
a=0;//     iget-boolean v1, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 311
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Framework service instance is null!"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 343
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->getIAPDedicateActionName()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 316
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 317
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 323
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     const-string v3, "SAF-A StatusCode:510017"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 328
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1}, Lsafiap/framework/sdk/ISAFFramework;->getIAPDedicateActionName()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 332
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 333
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 338
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     const-string v3, "SAF-A StatusCode:510017"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 339
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPluginInfo(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, -0x258
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Short);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_1
a=0;//     #v0=(Short);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-boolean v1, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 272
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 273
a=0;//     sget-object v1, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Framework service instance is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 279
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 280
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510002"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lsafiap/framework/sdk/ISAFFramework;->getPluginInfo(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 277
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "zhide"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "SAF getPluginInfo result: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 278
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Short);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lsafiap/framework/sdk/ISAFFramework;->getPluginInfo(Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 290
a=0;//     :catch_1
a=0;//     #v0=(Short);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "IAPSAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A StatusCode:510002"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public init(Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 215
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     instance-of v0, v0, Landroid/app/Service;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     instance-of v0, v0, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 218
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;->onInit(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 223
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "The instance has already been inited!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->h:Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;->onInit(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_4
a=0;//     #v1=(Uninit);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->SAF_COMPONENT_TEST_FLAG:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "Bind SAF Framework service  ....................."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->ACTION_CALLER_PKG:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/SAFFramework;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/SAFFramework;->j:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A StatusCode:510001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startCheckUpdate(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 415
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 390
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "startCheckUpdate ... "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 391
a=0;//     iget-boolean v0, p0, Lsafiap/framework/sdk/SAFFramework;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 393
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 394
a=0;//     sget-object v0, Lsafiap/framework/sdk/SAFFramework;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "Framework service instance is null!"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 398
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 399
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     const-string v2, "SAF-A StatusCode:510006"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 400
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 397
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->e:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lsafiap/framework/sdk/ISAFFramework;->startCheckUpdate(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/SAFFramework;->f:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lsafiap/framework/sdk/ISAFFramework;->startCheckUpdate(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 408
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v1, "IAPSAFFramework"
a=0;// 
a=0;//     const-string v2, "SAF-A StatusCode:510006"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
