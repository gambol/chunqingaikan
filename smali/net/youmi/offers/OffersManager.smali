.class public Lnet/youmi/android/offers/OffersManager;
.super Ljava/lang/Object;


# static fields
.field public static final STYLE_SPOT_CENTER:I = 0x0

.field public static final STYLE_SPOT_TOP_DOWN_REVERSE:I = 0x1

.field private static c:Lnet/youmi/android/offers/OffersManager;

.field private static d:Z


# instance fields
.field private a:Lnet/youmi/android/offers/e;

.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lnet/youmi/android/offers/OffersManager;->d:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    new-instance v0, Lnet/youmi/android/offers/e;

    invoke-direct {v0}, Lnet/youmi/android/offers/e;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/offers/OffersManager;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/e;

    invoke-direct {v0}, Lnet/youmi/android/offers/e;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iget-object v1, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/PointsReceiver;->getActionName_ViewPoints(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Z)Z
    .locals 6

    const/4 v2, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v3, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v3}, Lnet/youmi/android/offers/PointsReceiver;->getActionName_EarnPoints(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_7

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    if-eqz v0, :cond_2

    iget-object v5, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_2

    :try_start_1
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v5, Lnet/youmi/android/offers/PointsReceiver;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-class v5, Lnet/youmi/android/offers/e;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_3
    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    :try_start_2
    const-string v0, "Check Ad Componet Failure , There Is Not Class Found Which Extends %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-class v4, Lnet/youmi/android/offers/PointsReceiver;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    if-eqz p1, :cond_6

    :try_start_3
    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_6
    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_7
    move v0, v1

    goto :goto_3
.end method

.method private b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/offers/OffersManager;->a:Lnet/youmi/android/offers/e;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/OffersManager;
    .locals 3

    const-class v1, Lnet/youmi/android/offers/OffersManager;

    monitor-enter v1

    if-nez p0, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "Context must not be null"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/offers/OffersManager;->c:Lnet/youmi/android/offers/OffersManager;

    if-nez v0, :cond_1

    new-instance v0, Lnet/youmi/android/offers/OffersManager;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/OffersManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/offers/OffersManager;->c:Lnet/youmi/android/offers/OffersManager;

    :cond_1
    sget-object v0, Lnet/youmi/android/offers/OffersManager;->c:Lnet/youmi/android/offers/OffersManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method

.method public static isUsingServerCallBack()Z
    .locals 1

    sget-boolean v0, Lnet/youmi/android/offers/OffersManager;->d:Z

    return v0
.end method

.method public static setUsingServerCallBack(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/offers/OffersManager;->d:Z

    return-void
.end method


# virtual methods
.method a(II)Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;II)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public checkOffersAdConfig()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/offers/OffersManager;->checkOffersAdConfig(Z)Z

    move-result v0

    return v0
.end method

.method public checkOffersAdConfig(Z)Z
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/a/a;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_0

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/OffersManager;->a(Z)Z

    move-result v0

    goto :goto_0
.end method

.method public getCustomUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getShowOffersWallIntent(I)Landroid/content/Intent;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnet/youmi/android/offers/OffersManager;->a(II)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public onAppExit()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->b(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/OffersManager;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lnet/youmi/android/offers/OffersManager;->b()V

    :cond_0
    invoke-static {}, Lnet/youmi/android/listener/a;->a()Lnet/youmi/android/listener/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/listener/a;->d()V

    sget-boolean v0, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lnet/youmi/android/a/a/i/a/b/g;->a()Lnet/youmi/android/a/a/i/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b/g;->f()V

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/a/b;->b()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onAppLaunch()V
    .locals 2

    :try_start_0
    sget-boolean v0, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/f/b;->a(Landroid/content/Context;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->a(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/youmi/android/offers/OffersManager;->a(Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lnet/youmi/android/offers/OffersManager;->a()V

    :cond_1
    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x67

    if-ne v0, v1, :cond_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/c/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setCustomUserId(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lnet/youmi/android/offers/a;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/offers/a;-><init>(Lnet/youmi/android/offers/OffersManager;Ljava/lang/String;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public showOffersWall()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/offers/OffersManager;->showOffersWall(Lnet/youmi/android/listener/Interface_ActivityListener;)V

    return-void
.end method

.method public showOffersWall(Lnet/youmi/android/listener/Interface_ActivityListener;)V
    .locals 3

    :try_start_0
    sget-boolean v0, Lnet/youmi/android/offers/f/a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/f/b;->b(Landroid/content/Context;)V

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_2
    const/high16 v1, 0x10000000

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/offers/OffersManager;->a(II)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_3

    invoke-static {}, Lnet/youmi/android/listener/a;->a()Lnet/youmi/android/listener/a;

    move-result-object v2

    invoke-virtual {v2, v0, p1}, Lnet/youmi/android/listener/a;->a(ILnet/youmi/android/listener/Interface_ActivityListener;)V

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public showOffersWallDialog(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnet/youmi/android/offers/OffersManager;->showOffersWallDialog(Landroid/app/Activity;Lnet/youmi/android/offers/OffersWallDialogListener;)V

    return-void
.end method

.method public showOffersWallDialog(Landroid/app/Activity;DD)V
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v6}, Lnet/youmi/android/offers/OffersManager;->showOffersWallDialog(Landroid/app/Activity;DDLnet/youmi/android/offers/OffersWallDialogListener;)V

    return-void
.end method

.method public showOffersWallDialog(Landroid/app/Activity;DDLnet/youmi/android/offers/OffersWallDialogListener;)V
    .locals 2

    :try_start_0
    invoke-static/range {p1 .. p6}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;DDLnet/youmi/android/offers/OffersWallDialogListener;)Z

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public showOffersWallDialog(Landroid/app/Activity;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/youmi/android/offers/OffersManager;->showOffersWallDialog(Landroid/app/Activity;IILnet/youmi/android/offers/OffersWallDialogListener;)V

    return-void
.end method

.method public showOffersWallDialog(Landroid/app/Activity;IILnet/youmi/android/offers/OffersWallDialogListener;)V
    .locals 1

    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;IILnet/youmi/android/offers/OffersWallDialogListener;)Z

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public showOffersWallDialog(Landroid/app/Activity;Lnet/youmi/android/offers/OffersWallDialogListener;)V
    .locals 1

    :try_start_0
    invoke-static {p1, p2}, Lnet/youmi/android/offers/e/a;->a(Landroid/content/Context;Lnet/youmi/android/offers/OffersWallDialogListener;)Z

    iget-object v0, p0, Lnet/youmi/android/offers/OffersManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
