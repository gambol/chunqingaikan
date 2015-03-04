.class Lnet/youmi/android/a/a/e/a/b/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/e/a/b/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/e/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/d;->a:Lnet/youmi/android/a/a/e/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/d;->a:Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v0, v0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/b/d;->a:Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v1, v1, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/youmi/android/a/a/i/a/b/a;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
