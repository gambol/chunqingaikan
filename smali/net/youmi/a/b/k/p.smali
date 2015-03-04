.class public Lnet/youmi/android/a/b/k/p;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Ljava/io/File;Ljava/lang/String;Lnet/youmi/android/a/b/k/a/a;)V
    .locals 2

    invoke-static {}, Lnet/youmi/android/a/b/h/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/b/k/b/a;

    invoke-direct {v1, p0, p1, p2}, Lnet/youmi/android/a/b/k/b/a;-><init>(Ljava/io/File;Ljava/lang/String;Lnet/youmi/android/a/b/k/a/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
