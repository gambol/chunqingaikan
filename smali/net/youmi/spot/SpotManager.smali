.class public Lnet/youmi/android/spot/SpotManager;
.super Ljava/lang/Object;


# static fields
.field public static ANIM_ADVANCE:I = 0x0

.field public static ANIM_NONE:I = 0x0

.field public static ANIM_SIMPLE:I = 0x0

.field public static final CheckTag:Ljava/lang/String; = "SDKChecking"

.field public static final EXIT_SPOT:I = 0x67

.field private static H:Lnet/youmi/android/spot/SpotManager; = null

.field public static final IS_KITKAT:Z

.field public static final NORMAL_NOTIME_SPOT:I = 0x65

.field public static final NORMAL_SPOT:I = 0x64

.field public static final ORIENTATION_LANDSCAPE:I = 0x1

.field public static final ORIENTATION_PORTRAIT:I = 0x0

.field public static final PROTOCOLVERSION:Ljava/lang/String; = "2"

.field public static final SPLASH_SPOT:I = 0x66

.field protected static final a:Ljava/lang/String;

.field public static abtest:Ljava/lang/String;

.field protected static final b:Ljava/lang/String;

.field protected static final c:Ljava/lang/String;

.field protected static d:Ljava/lang/String;

.field protected static h:Z

.field protected static final k:Ljava/lang/String;

.field protected static final l:Ljava/lang/String;

.field protected static m:J

.field protected static n:Z

.field private static q:J

.field private static r:J

.field private static s:J

.field private static t:I

.field private static z:I


# instance fields
.field private A:I

.field private B:Lnet/youmi/android/spot/ExitSpotDialog;

.field private C:I

.field public final CACHE_PIC_TAG:Ljava/lang/String;

.field private D:I

.field private E:I

.field private F:Ljava/lang/String;

.field private G:I

.field private I:Landroid/content/Context;

.field private J:Landroid/app/Activity;

.field private K:Lnet/youmi/android/spot/a;

.field private L:Lnet/youmi/android/spot/SplashView;

.field private final M:Landroid/content/BroadcastReceiver;

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Ljava/lang/String;

.field protected i:Z

.field protected j:Z

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final u:I

.field private final v:J

.field private w:Z

.field private x:Z

.field private y:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v1, 0x1

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v0, v3, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->IS_KITKAT:Z

    invoke-static {}, Lnet/youmi/android/c/a/c;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->b:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->c:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/spot/SpotManager;->c:Ljava/lang/String;

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    sput-wide v4, Lnet/youmi/android/spot/SpotManager;->q:J

    sput-wide v4, Lnet/youmi/android/spot/SpotManager;->r:J

    sput-wide v4, Lnet/youmi/android/spot/SpotManager;->s:J

    sput v2, Lnet/youmi/android/spot/SpotManager;->t:I

    sput-boolean v2, Lnet/youmi/android/spot/SpotManager;->h:Z

    invoke-static {}, Lnet/youmi/android/c/a/c;->f()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->k:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->g()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->l:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->abtest:Ljava/lang/String;

    sput v2, Lnet/youmi/android/spot/SpotManager;->z:I

    sput v2, Lnet/youmi/android/spot/SpotManager;->ANIM_NONE:I

    sput v1, Lnet/youmi/android/spot/SpotManager;->ANIM_SIMPLE:I

    const/4 v0, 0x2

    sput v0, Lnet/youmi/android/spot/SpotManager;->ANIM_ADVANCE:I

    sput-wide v4, Lnet/youmi/android/spot/SpotManager;->m:J

    sput-boolean v2, Lnet/youmi/android/spot/SpotManager;->n:Z

    return-void

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, -0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lnet/youmi/android/c/a/c;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->CACHE_PIC_TAG:Ljava/lang/String;

    const-string v0, "androspsid"

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->o:Ljava/lang/String;

    const-string v0, "androetstid"

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->p:Ljava/lang/String;

    const/16 v0, 0xa

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->u:I

    const-wide/16 v0, 0x7d0

    iput-wide v0, p0, Lnet/youmi/android/spot/SpotManager;->v:J

    iput-boolean v4, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    iput-boolean v2, p0, Lnet/youmi/android/spot/SpotManager;->j:Z

    iput-boolean v2, p0, Lnet/youmi/android/spot/SpotManager;->w:Z

    iput-boolean v4, p0, Lnet/youmi/android/spot/SpotManager;->x:Z

    iput v3, p0, Lnet/youmi/android/spot/SpotManager;->y:I

    const/16 v0, 0xe10

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    iput v2, p0, Lnet/youmi/android/spot/SpotManager;->C:I

    const v0, 0x1030010

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->D:I

    iput v2, p0, Lnet/youmi/android/spot/SpotManager;->E:I

    iput v3, p0, Lnet/youmi/android/spot/SpotManager;->G:I

    new-instance v0, Lnet/youmi/android/spot/l;

    invoke-direct {v0, p0}, Lnet/youmi/android/spot/l;-><init>(Lnet/youmi/android/spot/SpotManager;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->M:Landroid/content/BroadcastReceiver;

    iput-object p1, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->M:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static {p1}, Lnet/youmi/android/spot/j;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/spot/SpotManager;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 8

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v2, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "ad"

    invoke-static {v0, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-eqz v1, :cond_2

    sget v1, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-static {v0, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    const-string v1, "rtg"

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "uri"

    const-string v4, ""

    invoke-static {v1, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "pic"

    const-string v4, ""

    invoke-static {v1, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/c/a/g;->a(Ljava/lang/String;)V

    iget-object v4, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v4, v3}, Lnet/youmi/android/c/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/spot/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "uri"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "rtg"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "androspsid"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/spot/SpotManager;->cacheNextAd()V

    :cond_2
    :goto_1
    return-void

    :cond_3
    const-string v0, "lastSplashShowTime"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v0, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    sput-wide v4, Lnet/youmi/android/spot/SpotManager;->q:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v6, Lnet/youmi/android/spot/SpotManager;->q:J

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x5265c00

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "androspsid"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-direct {p0, v1, v1}, Lnet/youmi/android/spot/SpotManager;->a(ZZ)V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    check-cast p1, Landroid/app/Activity;

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->L:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->getSplashView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->L:Lnet/youmi/android/spot/SplashView;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/SpotDialogListener;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    const-string v0, "Please check permissions:%s is already added"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lnet/youmi/android/spot/SpotDialogListener;I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash image data is not ready to show, the ad do not show  tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->L:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->showFail()V

    return-void
.end method

.method private a(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(ZZLnet/youmi/android/spot/SpotDialogListener;Z)V

    return-void
.end method

.method private a(ZZLnet/youmi/android/spot/SpotDialogListener;Z)V
    .locals 6

    if-nez p1, :cond_0

    :try_start_0
    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->w:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_0

    :try_start_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    new-instance v0, Lnet/youmi/android/spot/k;

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    move-object v1, p0

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/spot/k;-><init>(Lnet/youmi/android/spot/SpotManager;Landroid/content/Context;ZLnet/youmi/android/spot/SpotDialogListener;Z)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/k;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lnet/youmi/android/spot/m;

    invoke-direct {v1, p0, p2, p3, p4}, Lnet/youmi/android/spot/m;-><init>(Lnet/youmi/android/spot/SpotManager;ZLnet/youmi/android/spot/SpotDialogListener;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "load data fail,please send the error message to us"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lnet/youmi/android/spot/SpotManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/SpotManager;->x:Z

    return p1
.end method

.method private a(Z)Z
    .locals 4

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    invoke-virtual {v0}, Lnet/youmi/android/spot/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    if-eqz p1, :cond_1

    sget-wide v2, Lnet/youmi/android/spot/SpotManager;->s:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    invoke-virtual {v0}, Lnet/youmi/android/spot/a;->d()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    invoke-virtual {v0}, Lnet/youmi/android/spot/a;->d()Z

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->M:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/SpotManager;->M:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private b(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v0, 0xa

    sget-boolean v1, Lnet/youmi/android/spot/SpotManager;->n:Z

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_0
    sput-boolean v4, Lnet/youmi/android/spot/SpotManager;->n:Z

    iput-object p1, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    const-string v1, "Try to show spot Ads Dialog."

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    sget v1, Lnet/youmi/android/spot/SpotManager;->t:I

    if-nez v1, :cond_1

    iget-object v1, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v2, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "showInterval"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lnet/youmi/android/spot/SpotManager;->t:I

    sget v1, Lnet/youmi/android/spot/SpotManager;->t:I

    if-ge v1, v0, :cond_2

    :goto_1
    sput v0, Lnet/youmi/android/spot/SpotManager;->t:I

    :cond_1
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    if-nez v0, :cond_3

    const-string v0, "no ad data and try to load data"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    invoke-direct {p0, v0, v4, p2, v3}, Lnet/youmi/android/spot/SpotManager;->a(ZZLnet/youmi/android/spot/SpotDialogListener;Z)V

    goto :goto_0

    :cond_2
    sget v0, Lnet/youmi/android/spot/SpotManager;->t:I

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "SDKChecking"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method static synthetic b(Lnet/youmi/android/spot/SpotManager;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/spot/SpotManager;->a()V

    return-void
.end method

.method public static checkSpotAdConfig(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/a/a/g/b/a;->d(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/spot/SpotManager;->H:Lnet/youmi/android/spot/SpotManager;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/spot/SpotManager;

    invoke-direct {v0, p0}, Lnet/youmi/android/spot/SpotManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->H:Lnet/youmi/android/spot/SpotManager;

    sget-object v0, Lnet/youmi/android/spot/SpotManager;->H:Lnet/youmi/android/spot/SpotManager;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    :cond_0
    :goto_0
    invoke-static {}, Lnet/youmi/android/a/c/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lnet/youmi/android/spot/SpotManager;->c:Ljava/lang/String;

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    :goto_1
    sget-object v0, Lnet/youmi/android/spot/SpotManager;->H:Lnet/youmi/android/spot/SpotManager;

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v1, Lnet/youmi/android/spot/SpotManager;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lnet/youmi/android/spot/SpotManager;->b:Ljava/lang/String;

    sput-object v0, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    goto :goto_1
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    invoke-static {p1}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const-string v0, "network is unavailable "

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    :cond_0
    sput-boolean v4, Lnet/youmi/android/spot/SpotManager;->n:Z

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->x:Z

    if-nez v0, :cond_3

    sput-boolean v4, Lnet/youmi/android/spot/SpotManager;->n:Z

    goto :goto_0

    :cond_3
    sget-object v0, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "lastShowTime"

    invoke-interface {v0, v1, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    sput-wide v0, Lnet/youmi/android/spot/SpotManager;->r:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lnet/youmi/android/spot/SpotManager;->r:J

    sub-long/2addr v0, v2

    cmp-long v2, v0, v6

    if-gtz v2, :cond_5

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lnet/youmi/android/spot/SpotManager;->s:J

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "ad"

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    sget v2, Lnet/youmi/android/spot/SpotManager;->z:I

    if-le v1, v2, :cond_7

    sget v1, Lnet/youmi/android/spot/SpotManager;->z:I

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_1
    new-instance v1, Lnet/youmi/android/spot/a;

    iget v2, p0, Lnet/youmi/android/spot/SpotManager;->y:I

    invoke-direct {v1, p1, v0, v2, p2}, Lnet/youmi/android/spot/a;-><init>(Landroid/content/Context;Lorg/json/JSONObject;ILnet/youmi/android/spot/SpotDialogListener;)V

    iput-object v1, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    iget v1, p0, Lnet/youmi/android/spot/SpotManager;->G:I

    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/a;->a(I)V

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->K:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_5
    sget v2, Lnet/youmi/android/spot/SpotManager;->t:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    const-string v0, "Spot ad can only be called once in the %d seconds."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lnet/youmi/android/spot/SpotManager;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    :cond_6
    sput-boolean v4, Lnet/youmi/android/spot/SpotManager;->n:Z

    goto/16 :goto_0

    :cond_7
    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_8

    const/4 v1, 0x0

    sput v1, Lnet/youmi/android/spot/SpotManager;->z:I

    sget v1, Lnet/youmi/android/spot/SpotManager;->z:I

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_1

    :cond_8
    const-string v0, "Spot data is null"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method protected a(Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 4

    const/4 v1, -0x1

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p2, v1}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotDialogListener;I)V

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lnet/youmi/android/spot/SplashView;->init(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lnet/youmi/android/spot/SplashView;->setSpotListener(Lnet/youmi/android/spot/SpotDialogListener;)V

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    iget-object v1, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    sget v2, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-virtual {p1, v0, v1, v2}, Lnet/youmi/android/spot/SplashView;->showSplash(ZLjava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v1, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastSplashShowTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    invoke-virtual {p0}, Lnet/youmi/android/spot/SpotManager;->asyncLoadNextSplash()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Splash run exception"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected a(I)Z
    .locals 8

    const/4 v1, 0x1

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v3, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "lastRequestTime"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_0
    return v0

    :pswitch_0
    const-string v3, "data"

    const-string v6, ""

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    iget v4, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "ad"

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    iput v3, p0, Lnet/youmi/android/spot/SpotManager;->C:I

    const-string v3, "adNum"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    sput v2, Lnet/youmi/android/spot/SpotManager;->z:I

    move v0, v1

    goto :goto_0

    :pswitch_1
    const-string v3, "data"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "ad"

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    iput v3, p0, Lnet/youmi/android/spot/SpotManager;->C:I

    const-string v3, "adNum"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    sput v2, Lnet/youmi/android/spot/SpotManager;->z:I

    move v0, v1

    goto :goto_0

    :pswitch_2
    const-string v3, "androspsid"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto/16 :goto_0

    :pswitch_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v4

    iget v3, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v6, v3

    cmp-long v3, v4, v6

    if-gtz v3, :cond_0

    const-string v3, "androetstid"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    const-string v2, "ads_"

    invoke-static {v2, p0, v1}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected a(Landroid/content/Context;I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lnet/youmi/android/spot/SpotManager;->showExitSpot(Landroid/content/Context;ILnet/youmi/android/spot/ExitSpotListener;)Z

    move-result v0

    return v0
.end method

.method protected declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 12

    const/4 v1, 0x1

    const/4 v2, 0x0

    monitor-enter p0

    :try_start_0
    sget-object v5, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p2}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v0, "c"

    const/4 v3, -0x1

    invoke-static {v6, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_f

    :try_start_2
    sget-object v0, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v0, "exp"

    const/16 v3, 0xe10

    invoke-static {v6, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    iget v0, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    if-gtz v0, :cond_0

    const/16 v0, 0xe10

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    :cond_0
    const-string v0, "sg"

    const/16 v3, 0xa

    invoke-static {v6, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lnet/youmi/android/spot/SpotManager;->t:I

    const-string v0, "adNum"

    sget v3, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-virtual {v6, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-static {}, Lnet/youmi/android/c/a/g;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "cache"

    const/4 v3, 0x1

    invoke-virtual {v6, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-static {p1}, Lnet/youmi/android/a/a/e/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;

    move-result-object v0

    iget-object v3, p0, Lnet/youmi/android/spot/SpotManager;->CACHE_PIC_TAG:Ljava/lang/String;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget v8, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    mul-int/lit16 v8, v8, 0x3e8

    int-to-long v8, v8

    invoke-virtual {v0, v3, v4, v8, v9}, Lnet/youmi/android/a/a/e/b/d;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "data"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v1

    :goto_0
    monitor-exit p0

    return v0

    :cond_1
    :try_start_4
    const-string v0, "ad"

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/spot/SpotManager;->C:I

    const-string v0, ""

    sget v0, Lnet/youmi/android/spot/SpotManager;->z:I

    const/4 v3, 0x0

    invoke-static {v8, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v9, :cond_5

    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->j:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_2
    const-string v4, "blk"

    :goto_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v9, v4, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v3, "pic"

    const-string v10, ""

    invoke-static {v0, v3, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v10, ""

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    const-string v0, "rtg"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v4, "blk"

    :goto_2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v9, v4, v0}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v3, "pic"

    const-string v10, ""

    invoke-static {v0, v3, v10}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_4
    invoke-static {v3}, Lnet/youmi/android/c/a/g;->a(Ljava/lang/String;)V

    invoke-static {p1, v3}, Lnet/youmi/android/c/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v10

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lnet/youmi/android/spot/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "uri"

    invoke-virtual {v0, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v9, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, ".gif"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "gif"

    const/4 v3, 0x1

    invoke-virtual {v9, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_5
    :goto_3
    sget v0, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-virtual {v8, v0, v9}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    const-string v0, "ad"

    invoke-virtual {v6, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "data"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v3, "showInterval"

    sget v4, Lnet/youmi/android/spot/SpotManager;->t:I

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-direct {p0}, Lnet/youmi/android/spot/SpotManager;->a()V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :goto_4
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move v0, v1

    goto/16 :goto_0

    :cond_7
    :try_start_6
    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->f:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    const-string v4, "rtg"

    goto/16 :goto_1

    :cond_9
    iget v0, p0, Lnet/youmi/android/spot/SpotManager;->y:I

    if-nez v0, :cond_a

    const-string v0, "rtg"

    :goto_5
    move-object v4, v0

    goto/16 :goto_1

    :cond_a
    const-string v0, "blk"

    goto :goto_5

    :cond_b
    const-string v4, "rtg"

    goto/16 :goto_2

    :cond_c
    const-string v0, "gif"

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_d
    :goto_6
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move v0, v2

    goto/16 :goto_0

    :cond_e
    :try_start_8
    iget-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->j:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lnet/youmi/android/spot/SpotManager;->loadExitSpot()V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_4

    :catch_1
    move-exception v0

    :try_start_9
    const-string v1, "ads_"

    invoke-static {v1, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_f
    :try_start_b
    invoke-static {v0}, Lnet/youmi/android/c/a/f;->a(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Ad request result code:%d, %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v6

    const/4 v0, 0x1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move v0, v2

    goto/16 :goto_0
.end method

.method public asyncLoadNextSplash()V
    .locals 1

    new-instance v0, Lnet/youmi/android/spot/n;

    invoke-direct {v0, p0}, Lnet/youmi/android/spot/n;-><init>(Lnet/youmi/android/spot/SpotManager;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public cacheNextAd()V
    .locals 9

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget v0, Lnet/youmi/android/spot/SpotManager;->z:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lnet/youmi/android/spot/SpotManager;->z:I

    sget v0, Lnet/youmi/android/spot/SpotManager;->z:I

    iget v3, p0, Lnet/youmi/android/spot/SpotManager;->C:I

    if-lt v0, v3, :cond_2

    sput v2, Lnet/youmi/android/spot/SpotManager;->z:I

    move v0, v1

    :goto_0
    iget-object v3, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v4, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v3, "lastRequestTime"

    const-wide/16 v6, 0x0

    invoke-interface {v4, v3, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    iget-object v3, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v3}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    :try_start_0
    const-string v3, "adNum"

    sget v8, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-virtual {v5, v3, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "data"

    iget-object v5, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v6

    iget v3, p0, Lnet/youmi/android/spot/SpotManager;->A:I

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v6, v3

    cmp-long v3, v4, v6

    if-lez v3, :cond_0

    :goto_2
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-direct {p0, v2, v2}, Lnet/youmi/android/spot/SpotManager;->a(ZZ)V

    :goto_3
    return-void

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_2

    :cond_1
    new-instance v0, Lnet/youmi/android/spot/o;

    invoke-direct {v0, p0}, Lnet/youmi/android/spot/o;-><init>(Lnet/youmi/android/spot/SpotManager;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public checkPermission(Landroid/content/Context;)V
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-string v2, "**************SDK required permission checking**************"

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, ""

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v1, "android.permission.INTERNET"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    move v1, v0

    :cond_0
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    move v1, v0

    :cond_1
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->d(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    move v1, v0

    :cond_2
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->g(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    move v1, v0

    :cond_3
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    move v1, v0

    :cond_4
    invoke-static {p1}, Lnet/youmi/android/a/b/k/k;->j(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v1, "android.permission.GET_TASKS"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Ljava/lang/String;)V

    :goto_0
    if-eqz v0, :cond_5

    const-string v0, "SDK\'s necessary permission has been add"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, ""

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method public checkSDKProcess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v0, "******************checking begin************************"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    new-instance v0, Lnet/youmi/android/a/c/c/b;

    iget-object v1, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v1, "your device\'s imei is null or empty"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "your device\'s imsi is null or empty"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "you are using an emulator ,please use a real phone to test! "

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :cond_2
    invoke-static {v5}, Lnet/youmi/android/a/c/b/a;->a(Z)V

    invoke-static {}, Lnet/youmi/android/a/b/k/n;->a()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "SD Card can\'t read"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    const-wide/16 v2, 0xa

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;J)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "SD Card can\'t writed or has no enough Splace"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "network is unavailable"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0xf

    if-eq v1, v3, :cond_0

    const-string v1, "your device\'s imei is not correct"

    invoke-direct {p0, v1}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v1

    const-string v0, ",network type is "

    sparse-switch v1, :sswitch_data_0

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "network type code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    const-string v0, "initing ..."

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/AdManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/AdManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v4}, Lnet/youmi/android/AdManager;->testInit(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "loading resource"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v4, v5, v0, v5}, Lnet/youmi/android/spot/SpotManager;->a(ZZLnet/youmi/android/spot/SpotDialogListener;Z)V

    const-string v0, "*******************checking complete*************************"

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->b(Ljava/lang/String;)V

    invoke-static {v4}, Lnet/youmi/android/a/c/b/a;->a(Z)V

    goto :goto_1

    :sswitch_0
    const-string v2, "unknow"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_1
    const-string v2, "wifi"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_2
    const-string v2, "2g"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_3
    const-string v2, "3g"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_4
    const-string v2, "4g"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x64 -> :sswitch_1
        0x65 -> :sswitch_2
        0x66 -> :sswitch_3
        0x67 -> :sswitch_4
    .end sparse-switch
.end method

.method public disMiss()Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(Z)Z

    move-result v0

    return v0
.end method

.method public getSpotTimeout()J
    .locals 2

    sget-wide v0, Lnet/youmi/android/spot/SpotManager;->m:J

    return-wide v0
.end method

.method public initExitSpotStyle(IILjava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput p1, p0, Lnet/youmi/android/spot/SpotManager;->D:I

    :cond_0
    iput p2, p0, Lnet/youmi/android/spot/SpotManager;->E:I

    iput-object p3, p0, Lnet/youmi/android/spot/SpotManager;->F:Ljava/lang/String;

    return-void
.end method

.method public loadExitSpot()V
    .locals 5

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->j:Z

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "ad"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Lnet/youmi/android/spot/SpotManager;->z:I

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    sget-object v2, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "androetstid"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iput-boolean v4, p0, Lnet/youmi/android/spot/SpotManager;->j:Z

    invoke-virtual {p0}, Lnet/youmi/android/spot/SpotManager;->cacheNextAd()V

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_2
    const-string v0, "no ad data,begin to load data"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    invoke-direct {p0, v4, v4}, Lnet/youmi/android/spot/SpotManager;->a(ZZ)V

    goto :goto_1
.end method

.method public loadSplashSpotAds()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    invoke-virtual {p0}, Lnet/youmi/android/spot/SpotManager;->loadSpotAds()V

    return-void
.end method

.method public loadSpotAds()V
    .locals 2

    const/16 v0, 0x64

    :try_start_0
    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    const-string v0, "Try to load spot Ads resources."

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->I:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/AdManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/AdManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/AdManager;->setUserDataCollect(Z)V

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(ZZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/spot/SpotManager;->b()V

    return-void
.end method

.method public onStop()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(Z)Z

    move-result v0

    return v0
.end method

.method public reDraw(Landroid/content/Context;I)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    invoke-virtual {v0}, Lnet/youmi/android/spot/ExitSpotDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    invoke-virtual {v0}, Lnet/youmi/android/spot/ExitSpotDialog;->dismiss()V

    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;I)Z

    :cond_0
    return-void
.end method

.method public setAnimationType(I)V
    .locals 1

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    :goto_0
    iput p1, p0, Lnet/youmi/android/spot/SpotManager;->G:I

    return-void

    :cond_0
    const/4 p1, 0x2

    goto :goto_0
.end method

.method public setLoading(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/spot/SpotManager;->w:Z

    return-void
.end method

.method public setSpotOrientation(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/spot/SpotManager;->y:I

    return-void
.end method

.method public setSpotTimeout(J)V
    .locals 1

    sput-wide p1, Lnet/youmi/android/spot/SpotManager;->m:J

    return-void
.end method

.method public setfinishActivity(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/SpotManager;->J:Landroid/app/Activity;

    return-void
.end method

.method public showExitSpot(Landroid/content/Context;ILnet/youmi/android/spot/ExitSpotListener;)Z
    .locals 8

    const/4 v7, 0x0

    const/16 v0, 0x67

    :try_start_0
    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "no exit spot data"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    move v0, v7

    :goto_0
    return v0

    :cond_0
    new-instance v0, Lnet/youmi/android/spot/ExitSpotDialog;

    iget-object v2, p0, Lnet/youmi/android/spot/SpotManager;->g:Ljava/lang/String;

    iget v3, p0, Lnet/youmi/android/spot/SpotManager;->D:I

    iget v4, p0, Lnet/youmi/android/spot/SpotManager;->E:I

    iget-object v5, p0, Lnet/youmi/android/spot/SpotManager;->F:Ljava/lang/String;

    move-object v1, p1

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lnet/youmi/android/spot/ExitSpotDialog;-><init>(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Lnet/youmi/android/spot/ExitSpotListener;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    if-eqz v0, :cond_1

    const-string v0, "show exit dialog success"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/spot/SpotManager;->B:Lnet/youmi/android/spot/ExitSpotDialog;

    invoke-virtual {v0, p2}, Lnet/youmi/android/spot/ExitSpotDialog;->showDialog(I)Z

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "show exit dialog fail"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move v0, v7

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public showSplashSpotAds(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 4

    const/4 v1, 0x1

    const/4 v3, 0x0

    iput-boolean v1, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    new-instance v0, Lnet/youmi/android/spot/SplashView;

    invoke-direct {v0, p1, p2}, Lnet/youmi/android/spot/SplashView;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lnet/youmi/android/spot/SpotManager;->L:Lnet/youmi/android/spot/SplashView;

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "There is no data that the ad does not show"

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, v3}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotDialogListener;I)V

    goto :goto_0
.end method

.method public showSplashSpotAds(Landroid/content/Context;Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 4

    const/4 v1, 0x1

    const/4 v3, 0x0

    iput-boolean v1, p0, Lnet/youmi/android/spot/SpotManager;->i:Z

    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    move-result v0

    sput-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    iput-object p2, p0, Lnet/youmi/android/spot/SpotManager;->L:Lnet/youmi/android/spot/SplashView;

    sget-boolean v0, Lnet/youmi/android/spot/SpotManager;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2, p3}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/SpotDialogListener;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "There is no data that the ad does not show"

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p3, v3}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotDialogListener;I)V

    goto :goto_0
.end method

.method public showSpotAds(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/youmi/android/spot/SpotManager;->b(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V

    return-void
.end method

.method public showSpotAds(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/spot/SpotManager;->b(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V

    return-void
.end method
