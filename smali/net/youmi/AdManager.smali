.class public final Lnet/youmi/android/AdManager;
.super Ljava/lang/Object;


# static fields
.field private static b:Lnet/youmi/android/AdManager;

.field private static c:Z

.field private static d:Z


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lnet/youmi/android/AdManager;->c:Z

    sput-boolean v0, Lnet/youmi/android/AdManager;->d:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lnet/youmi/android/AdManager;
    .locals 3

    const-class v1, Lnet/youmi/android/AdManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/AdManager;->b:Lnet/youmi/android/AdManager;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "context is null"

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
    new-instance v0, Lnet/youmi/android/AdManager;

    invoke-direct {v0, p0}, Lnet/youmi/android/AdManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/AdManager;->b:Lnet/youmi/android/AdManager;

    :cond_1
    sget-object v0, Lnet/youmi/android/AdManager;->b:Lnet/youmi/android/AdManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method

.method public static isDownloadTipsDisplayOnNotification()Z
    .locals 1

    sget-boolean v0, Lnet/youmi/android/AdManager;->d:Z

    return v0
.end method

.method public static isInstallationSuccessTipsDisplayOnNotification()Z
    .locals 1

    sget-boolean v0, Lnet/youmi/android/AdManager;->c:Z

    return v0
.end method

.method public static setIsDownloadTipsDisplayOnNotification(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/AdManager;->d:Z

    return-void
.end method

.method public static setIsInstallationSuccessTipsDisplayOnNotification(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/AdManager;->c:Z

    return-void
.end method


# virtual methods
.method public asyncCheckAppUpdate(Lnet/youmi/android/update/CheckAppUpdateCallBack;)V
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/update/b;

    iget-object v1, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lnet/youmi/android/update/b;-><init>(Landroid/content/Context;Lnet/youmi/android/update/CheckAppUpdateCallBack;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public asyncCheckIsReachNtpTime(IIILnet/youmi/android/onlineconfig/ntp/NtpResultListener;)V
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/ntp/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lnet/youmi/android/onlineconfig/ntp/c;-><init>(IIILnet/youmi/android/onlineconfig/ntp/NtpResultListener;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public asyncGetOnlineConfig(Ljava/lang/String;Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;)V
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/d;

    iget-object v1, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p2, p1}, Lnet/youmi/android/onlineconfig/d;-><init>(Landroid/content/Context;Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;Ljava/lang/String;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public checkAppUpdate()Lnet/youmi/android/update/AppUpdateInfo;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/update/a;->a(Landroid/content/Context;)Lnet/youmi/android/update/AppUpdateInfo;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getOnlineConfig(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/AdManager;->syncGetOnlineConfig(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public init(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lnet/youmi/android/AdManager;->init(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public init(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/g/e/a;

    iget-object v1, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lnet/youmi/android/a/a/g/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setEnableDebugLog(Z)V
    .locals 0

    invoke-static {p1}, Lnet/youmi/android/a/c/b/a;->a(Z)V

    return-void
.end method

.method public setUserDataCollect(Z)V
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/g/e/l;

    iget-object v1, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lnet/youmi/android/a/a/g/e/l;-><init>(Landroid/content/Context;Z)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public syncCheckAppUpdate()Lnet/youmi/android/update/AppUpdateInfo;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/update/a;->a(Landroid/content/Context;)Lnet/youmi/android/update/AppUpdateInfo;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public syncCheckIsReachNtpTime(III)Z
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/ntp/a;

    invoke-direct {v0, p1, p2, p3}, Lnet/youmi/android/onlineconfig/ntp/a;-><init>(III)V

    invoke-virtual {v0}, Lnet/youmi/android/onlineconfig/ntp/a;->a()Z
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

.method public syncGetOnlineConfig(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lnet/youmi/android/onlineconfig/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    :goto_0
    return-object p2

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public testInit(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    new-instance v0, Lnet/youmi/android/a/a/g/e/a;

    iget-object v1, p0, Lnet/youmi/android/AdManager;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lnet/youmi/android/a/a/g/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/e/a;->a()V

    return-void
.end method
