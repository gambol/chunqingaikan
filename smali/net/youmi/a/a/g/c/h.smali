.class public Lnet/youmi/android/a/a/g/c/h;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/AdReceiver;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 5

    const-class v1, Lnet/youmi/android/a/a/g/c/h;

    monitor-enter v1

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v2, Lnet/youmi/android/AdReceiver;

    invoke-static {v0, v2}, Lnet/youmi/android/a/b/k/c;->c(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lnet/youmi/android/a/a/g/c/h;->a:Lnet/youmi/android/AdReceiver;

    if-nez v2, :cond_0

    new-instance v2, Lnet/youmi/android/AdReceiver;

    invoke-direct {v2}, Lnet/youmi/android/AdReceiver;-><init>()V

    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v4, "package"

    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    sput-object v2, Lnet/youmi/android/a/a/g/c/h;->a:Lnet/youmi/android/AdReceiver;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
