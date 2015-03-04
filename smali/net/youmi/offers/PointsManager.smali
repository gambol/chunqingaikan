.class public Lnet/youmi/android/offers/PointsManager;
.super Ljava/lang/Object;


# static fields
.field private static b:Lnet/youmi/android/offers/PointsManager;

.field private static c:Z

.field private static d:Z


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lnet/youmi/android/offers/PointsManager;->c:Z

    sput-boolean v0, Lnet/youmi/android/offers/PointsManager;->d:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/PointsManager;
    .locals 2

    const-class v1, Lnet/youmi/android/offers/PointsManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/PointsManager;->b:Lnet/youmi/android/offers/PointsManager;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/PointsManager;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/PointsManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/offers/PointsManager;->b:Lnet/youmi/android/offers/PointsManager;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/PointsManager;->b:Lnet/youmi/android/offers/PointsManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static isEnableEarnPointsNotification()Z
    .locals 1

    sget-boolean v0, Lnet/youmi/android/offers/PointsManager;->c:Z

    return v0
.end method

.method public static isEnableEarnPointsToastTips()Z
    .locals 1

    sget-boolean v0, Lnet/youmi/android/offers/PointsManager;->d:Z

    return v0
.end method

.method public static setEnableEarnPointsNotification(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/offers/PointsManager;->c:Z

    return-void
.end method

.method public static setEnableEarnPointsToastTips(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/offers/PointsManager;->d:Z

    return-void
.end method


# virtual methods
.method public awardPoints(I)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/d/b/e;->a(I)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public queryPoints()I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/offers/d/b/e;->a()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public registerNotify(Lnet/youmi/android/offers/PointsChangeNotify;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/d/b/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public registerPointsEarnNotify(Lnet/youmi/android/offers/PointsEarnNotify;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/c;->a(Landroid/content/Context;)Lnet/youmi/android/offers/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/c;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public spendPoints(I)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/e;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/d/b/e;->b(I)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public unRegisterNotify(Lnet/youmi/android/offers/PointsChangeNotify;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/b;->a(Landroid/content/Context;)Lnet/youmi/android/offers/d/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/d/b/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public unRegisterPointsEarnNotify(Lnet/youmi/android/offers/PointsEarnNotify;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/PointsManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/c;->a(Landroid/content/Context;)Lnet/youmi/android/offers/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/offers/c;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
