.class public Lnet/youmi/android/a/b/g/a/b;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/h/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
