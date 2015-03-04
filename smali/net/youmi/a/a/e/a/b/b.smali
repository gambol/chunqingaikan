.class Lnet/youmi/android/a/a/e/a/b/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/e/a/b/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/e/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/b;->a:Lnet/youmi/android/a/a/e/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/b;->a:Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v0, v0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/a;->m()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
