.class public Lnet/youmi/android/offers/f/a/a;
.super Lnet/youmi/android/a/a/b/a;


# static fields
.field private static b:Lnet/youmi/android/a/b/c/g;


# direct methods
.method public static declared-synchronized g(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 5

    const-class v1, Lnet/youmi/android/offers/f/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/f/a/a;->b:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "OxgHkj2lz09F"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/offers/f/a/a;->b:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/offers/f/a/a;->b:Lnet/youmi/android/a/b/c/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
